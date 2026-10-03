package com.example.opponotificationrelay;

import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.zip.Inflater;

/** Bounded metadata: never return authentication data, notification text or image bytes. */
public final class OafTraceMetadata {
    private OafTraceMetadata() { }
    public static String digest(byte[] bytes,int off,int len) {
        try {
            MessageDigest hash=MessageDigest.getInstance("SHA-256");hash.update(bytes,off,len);
            StringBuilder out=new StringBuilder();
            for(byte b:hash.digest()) out.append(String.format(java.util.Locale.ROOT,"%02x",b&255));
            return out.toString();
        } catch(Exception e) {throw new IllegalArgumentException("invalid digest range",e);}
    }
    public static String message(byte[] bytes,int off,int len) {
        if(bytes==null || off<0 || len<2 || len>20480 || off>bytes.length-len) return null;
        int flags=bytes[off]&255;
        if((flags&4)!=0) return "sdkFlags="+flags+" encrypted=true cid=unknown apduBytes="+len+" sha256="+digest(bytes,off,len);
        try {
            byte[] data=Arrays.copyOfRange(bytes,off+1,off+len);
            if((flags&16)!=0) data=inflate(data);
            if(data.length<1) return null;
            int cid=data[0]&255;
            if(cid!=200 && cid!=202) return null;
            StringBuilder out=new StringBuilder("sdkFlags="+flags+" cid="+cid+" apduBytes="+len+" sha256="+digest(bytes,off,len));
            Fields parsed=new Fields(data,1,data.length);
            if(cid==202) out.append(picture(parsed));
            else {
                out.append(" notificationFlags=").append(parsed.number(11));
                for(int id:new int[]{17,30}) {
                    byte[] ref=parsed.bytes(id);
                    if(ref!=null) out.append(" refField=").append(id).append(picture(new Fields(ref,0,ref.length)));
                }
            }
            return out.toString();
        } catch(Exception e) {return "sdkFlags="+flags+" metadata=unparsed apduBytes="+len+" sha256="+digest(bytes,off,len);}
    }
    private static byte[] inflate(byte[] bytes) throws Exception {
        Inflater inflater=new Inflater();
        try {
            inflater.setInput(bytes);ByteArrayOutputStream out=new ByteArrayOutputStream();byte[] block=new byte[1024];
            while(!inflater.finished()) {
                int count=inflater.inflate(block);
                if(count==0 || out.size()+count>20480) throw new IllegalArgumentException("compressed metadata bound");
                out.write(block,0,count);
            }
            if(inflater.getRemaining()!=0) throw new IllegalArgumentException("trailing compression data");
            return out.toByteArray();
        } finally {inflater.end();}
    }
    private static String picture(Fields fields) {
        byte[] key=fields.bytes(1),type=fields.bytes(2),image=fields.bytes(3);
        String label=Arrays.equals(type,new byte[]{95,108,97,114,103,101}) ? "_large"
            : Arrays.equals(type,new byte[]{95,108,97,114,103,101,95,49,52,52}) ? "_large_144" : "other";
        String out=" keyBytes="+(key==null?0:key.length)+" keySha256="+(key==null?"none":digest(key,0,key.length))+" type="+label;
        if(image!=null) out+=" format="+(image.length>=8 && Arrays.equals(Arrays.copyOf(image,8),new byte[]{(byte)137,80,78,71,13,10,26,10})?"png"
            :image.length>=2 && (image[0]&255)==255 && (image[1]&255)==216?"jpeg":image.length>=2 && image[0]==66 && image[1]==77?"bmp":"unknown")
            +" imageBytes="+image.length+" imageSha256="+digest(image,0,image.length)
            +" jpeg="+(image.length>=4 && (image[0]&255)==255 && (image[1]&255)==216
                && (image[image.length-2]&255)==255 && (image[image.length-1]&255)==217);
        return out+" width="+fields.number(4)+" height="+fields.number(5)+" index="+fields.number(6);
    }
    public static String frame(byte[] bytes,int off,int len,boolean sequence) {
        int header=sequence?4:2;
        if(bytes==null || off<0 || len<header || off>bytes.length-len) throw new IllegalArgumentException("invalid trace frame");
        int sid=((bytes[off]&15)<<6)|((bytes[off+1]&252)>>>2),flag=bytes[off+1]&3;
        String head=String.format(java.util.Locale.ROOT,"%02x%02x",bytes[off]&255,bytes[off+1]&255);
        if(sequence) head+=String.format(java.util.Locale.ROOT,"%02x%02x",bytes[off+2]&255,bytes[off+3]&255);
        int seq=sequence?((bytes[off+2]&255)<<8)|(bytes[off+3]&255):-1;
        return "session="+sid+" flag="+flag+" header="+head+" sequence="+seq+" frameBytes="+len
            +" chunkBytes="+(len-header)+" sha256="+digest(bytes,off,len);
    }
    public static String endpoint(byte[] bytes) {
        if(bytes==null || bytes.length<41 || (bytes[0]!=1 && bytes[0]!=2)) return "metadata=unparsed";
        String out="peerCL="+(bytes[39]&3)+" peerTL="+((bytes[39]>>>4)&7);
        try {
            int pos=41,count=bytes[40]&255;
            if(count>32) throw new IllegalArgumentException("endpoint count");
            for(int i=0;i<count;i++) {
                if(pos>=bytes.length) throw new IllegalArgumentException("endpoint truncated");
                int key=bytes[pos++]&255,size;
                if(key==1) size=4;
                else if(key>=2 && key<=5) size=2;
                else if(key>=6 && key<=8) {
                    if(pos>=bytes.length) throw new IllegalArgumentException("endpoint string");
                    size=bytes[pos++]&255;
                } else if(key>=10 && key<=13) size=1;
                else if(key==14) size=6;
                else throw new IllegalArgumentException("endpoint unknown parameter");
                if(size>bytes.length-pos) throw new IllegalArgumentException("endpoint truncated value");
                if(key==1 || key==2 || key==5 || key==11) {
                    long value=0;for(int j=0;j<size;j++) value=(value<<8)|(bytes[pos+j]&255);
                    out+=" "+(key==1?"apdu":key==2?"ssdu":key==5?"window":"compression")+"="+value;
                }
                pos+=size;
            }
            if(pos!=bytes.length) throw new IllegalArgumentException("endpoint trailing");
            return out;
        } catch(Exception e) {return out+" features=unparsed";}
    }
    private static final class Fields {
        private final java.util.Map<Integer,byte[]> data=new java.util.HashMap<>();
        private final java.util.Map<Integer,Long> numbers=new java.util.HashMap<>();
        private final byte[] raw;private int pos;private final int end;
        Fields(byte[] raw,int start,int end) {
            this.raw=raw;this.pos=start;this.end=end;int count=0;
            while(pos<end) {
                if(++count>128) throw new IllegalArgumentException("metadata fields bound");
                long tag=varint();int id=(int)(tag>>>3),kind=(int)(tag&7);
                if(id<=0) throw new IllegalArgumentException("zero field");
                if(kind==0) {long value=varint();if(numbers.put(id,value)!=null) throw new IllegalArgumentException("duplicate field");}
                else {
                    long size=kind==2?varint():kind==1?8:kind==5?4:-1;
                    if(size<0 || size>end-pos) throw new IllegalArgumentException("invalid field size");
                    if(kind==2 && (id==1 || id==2 || id==3 || id==17 || id==30)) {
                        if(data.put(id,Arrays.copyOfRange(raw,pos,pos+(int)size))!=null) throw new IllegalArgumentException("duplicate field");
                    }
                    pos+=(int)size;
                }
            }
        }
        long varint() {
            long value=0;
            for(int shift=0;shift<64;shift+=7) {
                if(pos>=end) throw new IllegalArgumentException("truncated varint");
                int b=raw[pos++]&255;if(shift==63 && b>1) throw new IllegalArgumentException("overflow varint");
                value|=(long)(b&127)<<shift;if((b&128)==0) return value;
            }
            throw new IllegalArgumentException("oversize varint");
        }
        byte[] bytes(int id) {return data.get(id);}
        long number(int id) {return numbers.containsKey(id)?numbers.get(id):0;}
    }
}
