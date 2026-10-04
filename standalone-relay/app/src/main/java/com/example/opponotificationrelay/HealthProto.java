package com.example.opponotificationrelay;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.*;

/** Bounded protobuf reader/writer for the watch's health settings. No generated runtime. */
public final class HealthProto {
    public static final int LIMIT=32768;
    private HealthProto() {}
    public static final class Field {
        public final int number,wire;
        private final long value;
        private final byte[] bytes;
        private Field(int number,int wire,long value,byte[] bytes){this.number=number;this.wire=wire;this.value=value;this.bytes=bytes;}
    }
    public static final class Node {
        private final List<Field> fields;
        private Node(List<Field> fields){this.fields=Collections.unmodifiableList(new ArrayList<>(fields));}
        public boolean has(int n){for(Field f:fields)if(f.number==n)return true;return false;}
        private Field unique(int n,int wire)throws IOException{
            Field found=null;for(Field f:fields)if(f.number==n){if(found!=null || f.wire!=wire)throw new IOException("HEALTH_FIELD_SHAPE");found=f;}return found;
        }
        public int number(int n,int fallback)throws IOException{
            Field f=unique(n,0);if(f==null)return fallback;
            if(f.value<0 || f.value>Integer.MAX_VALUE)throw new IOException("HEALTH_INTEGER_RANGE");return(int)f.value;
        }
        public Node message(int n)throws IOException{Field f=unique(n,2);return f==null?null:parse(f.bytes);}
        public byte[] bytes(int n)throws IOException{Field f=unique(n,2);return f==null?null:f.bytes.clone();}
        public List<Node> messages(int n)throws IOException{List<Node> out=new ArrayList<>();for(Field f:fields)if(f.number==n){if(f.wire!=2)throw new IOException("HEALTH_FIELD_SHAPE");out.add(parse(f.bytes));}return out;}
        public int int32(int n,int fallback)throws IOException{Field f=unique(n,0);return f==null?fallback:asInt32(f.value);}
        private static int asInt32(long value)throws IOException{if(value<Integer.MIN_VALUE || value>0xffffffffL)throw new IOException("HEALTH_INTEGER_RANGE");return(int)value;}
        public int[] repeatedInt32(int n,int maximum)throws IOException{
            if(maximum<0||maximum>8192)throw new IOException("HEALTH_REPEATED_LIMIT");List<Integer> values=new ArrayList<>();
            for(Field f:fields)if(f.number==n){if(f.wire==0){if(values.size()>=maximum)throw new IOException("HEALTH_REPEATED_LIMIT");values.add(asInt32(f.value));}
                else if(f.wire==2){Input in=new Input(f.bytes);while(in.p<f.bytes.length){if(values.size()>=maximum)throw new IOException("HEALTH_REPEATED_LIMIT");values.add(asInt32(in.read()));}}
                else throw new IOException("HEALTH_FIELD_SHAPE");}
            int[] result=new int[values.size()];for(int i=0;i<result.length;i++)result[i]=values.get(i);return result;
        }
        public Node withBytes(int n,byte[] value){if(value==null||value.length>LIMIT)throw new IllegalArgumentException("HEALTH_BODY_LIMIT");return replace(n,Collections.singletonList(new Field(n,2,0,value.clone())));}
        public Node withNumber(int n,int value){if(value<0)throw new IllegalArgumentException("HEALTH_VALUE");return replace(n,Collections.singletonList(new Field(n,0,value,null)));}
        public Node withMessage(int n,Node value){return replace(n,Collections.singletonList(new Field(n,2,0,value.encode())));}
        public Node withMessages(int n,List<Node> values){List<Field> out=new ArrayList<>();for(Node value:values)out.add(new Field(n,2,0,value.encode()));return replace(n,out);}
        private Node replace(int n,List<Field> values){if(n<1 || n>0x1fffffff)throw new IllegalArgumentException("HEALTH_FIELD");List<Field> out=new ArrayList<>();for(Field f:fields)if(f.number!=n)out.add(f);out.addAll(values);return new Node(out);}
        public byte[] encode(){ByteArrayOutputStream out=new ByteArrayOutputStream();for(Field f:fields){varint(out,((long)f.number<<3)|f.wire);if(f.wire==0)varint(out,f.value);else{if(f.wire==2)varint(out,f.bytes.length);out.write(f.bytes,0,f.bytes.length);}}if(out.size()>LIMIT)throw new IllegalArgumentException("HEALTH_BODY_LIMIT");return out.toByteArray();}
    }
    public static Node empty(){return new Node(Collections.emptyList());}
    public static Node numbers(int... pairs){if(pairs.length%2!=0)throw new IllegalArgumentException("HEALTH_PAIRS");Node n=empty();for(int i=0;i<pairs.length;i+=2)n=n.withNumber(pairs[i],pairs[i+1]);return n;}
    public static Node parse(byte[] data)throws IOException{
        if(data==null || data.length>LIMIT)throw new IOException("HEALTH_BODY_LIMIT");
        Input in=new Input(data);List<Field> fields=new ArrayList<>();
        while(in.p<data.length){long tag=in.read();int wire=(int)(tag&7);long id=tag>>>3;
            if(tag<0 || id<1 || id>0x1fffffff || fields.size()>=4096)throw new IOException("HEALTH_TAG");
            if(wire==0)fields.add(new Field((int)id,wire,in.read(),null));
            else {long size=wire==2?in.read():wire==1?8:wire==5?4:-1;if(size<0 || size>data.length-in.p)throw new IOException("HEALTH_WIRE");byte[] b=Arrays.copyOfRange(data,in.p,in.p+(int)size);in.p+=(int)size;fields.add(new Field((int)id,wire,0,b));}
        }
        return new Node(fields);
    }
    private static void varint(ByteArrayOutputStream out,long value){do{out.write((int)(value&127)|((value>>>7)!=0?128:0));value>>>=7;}while(value!=0);}
    private static final class Input {
        final byte[] data;int p;
        Input(byte[] data){this.data=data;}
        long read()throws IOException{long n=0;for(int i=0;i<10;i++){if(p>=data.length)throw new IOException("HEALTH_TRUNCATED");int b=data[p++]&255;if(i==9 && b>1)throw new IOException("HEALTH_VARINT");n|=(long)(b&127)<<(7*i);if((b&128)==0)return n;}throw new IOException("HEALTH_VARINT");}
    }
}