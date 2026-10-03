package com.example.opponotificationrelay;

import java.io.*;
import java.nio.*;
import java.nio.charset.*;

/** Official 6.6.7: DM BatteryInfo (CID 8), WatchModeInfo (CID 35). Queries only. */
public final class DeviceStatusProtocol {
    private DeviceStatusProtocol() {}
    public static final class Battery {
        public final int percent;public final boolean charging;
        Battery(int percent,boolean charging){this.percent=percent;this.charging=charging;}
    }
    public static final class Mode {
        public final int value,requestSequence,replaySequence;
        Mode(int value,int request,int replay){this.value=value;requestSequence=request;replaySequence=replay;}
        public String display(){return value>0 && value<=7 ? ((value&3)!=0?"全智能模式":"长续航模式"):null;}
    }
    public static byte[] batteryRequest(String mac) {
        if(!validMac(mac))throw new IllegalArgumentException("MAC");
        byte[] b=mac.toUpperCase(java.util.Locale.ROOT).getBytes(StandardCharsets.UTF_8);
        return OafCrypto.concat(new byte[]{10,(byte)b.length},b);
    }
    public static byte[] modeRequest(int sequence,int role) {
        if(sequence<1 || (role!=1 && role!=2))throw new IllegalArgumentException("MODE_REQUEST");
        ByteArrayOutputStream b=new ByteArrayOutputStream();b.write(16);writeVarint(b,sequence);
        b.write(32);b.write(1);b.write(40);b.write(role);return b.toByteArray();
    }
    public static boolean validMac(String value){return value!=null && value.matches("(?i)([0-9a-f]{2}:){5}[0-9a-f]{2}");}
    public static Battery battery(byte[] data,String target) throws IOException {
        Input in=new Input(data);int percent=0,charge=0;String mac="";int seen=0;
        while(in.remaining()) {
            int tag=in.tag(),field=tag>>>3;
            if(field>=1 && field<=3) {
                if((seen&(1<<field))!=0)throw new IOException("DUPLICATE_FIELD");seen|=1<<field;
                if(field==2){in.wire(tag,2);mac=in.string(32);}
                else {in.wire(tag,0);int n=in.number();if(field==1)percent=n;else charge=n;}
            } else in.skip(tag&7);
        }
        // Proto3 omits zero values: an empty valid BatteryInfo is 0%, not missing data.
        if(percent<0 || percent>100 || charge<0 || charge>1 || !validMac(target)
                || (!mac.isEmpty() && (!validMac(mac) || !target.equalsIgnoreCase(mac))))throw new IOException("BATTERY_INVALID");
        return new Battery(percent,charge==1);
    }
    public static Mode mode(byte[] data) throws IOException {
        Input in=new Input(data);int mode=0,request=0,replay=0,seen=0;
        while(in.remaining()) {
            int tag=in.tag(),field=tag>>>3;
            if(field>=1 && field<=3) {
                if((seen&(1<<field))!=0)throw new IOException("DUPLICATE_FIELD");seen|=1<<field;in.wire(tag,0);
                int n=in.number();if(field==1)mode=n;else if(field==2)request=n;else replay=n;
            } else in.skip(tag&7);
        }
        return new Mode(mode,request,replay);
    }
    private static void writeVarint(ByteArrayOutputStream out,int n){do{out.write((n&127)|((n>>>7)!=0?128:0));n>>>=7;}while(n!=0);}
    private static final class Input {
        final byte[] data;int p;
        Input(byte[] data)throws IOException{if(data==null || data.length>512)throw new IOException("BODY_LIMIT");this.data=data;}
        boolean remaining(){return p<data.length;}
        long varint()throws IOException{long n=0;for(int i=0;i<10;i++){if(p>=data.length)throw new IOException("TRUNCATED");int b=data[p++]&255;if(i==9 && b>1)throw new IOException("VARINT_OVERFLOW");n|=(long)(b&127)<<(7*i);if((b&128)==0)return n;}throw new IOException("VARINT_OVERFLOW");}
        int number()throws IOException{long n=varint();if(n<0 || n>Integer.MAX_VALUE)throw new IOException("INTEGER_RANGE");return(int)n;}
        int tag()throws IOException{int n=number();if((n>>>3)==0)throw new IOException("FIELD_ZERO");return n;}
        void wire(int tag,int expected)throws IOException{if((tag&7)!=expected)throw new IOException("WIRE_TYPE");}
        String string(int max)throws IOException{int n=number();if(n>max || n>data.length-p)throw new IOException("STRING_LIMIT");try{String s=StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(data,p,n)).toString();p+=n;return s;}catch(CharacterCodingException e){throw new IOException("UTF8");}}
        void skip(int wire)throws IOException{if(wire==0){varint();return;}int n=wire==1?8:wire==5?4:wire==2?number():-1;if(n<0 || n>data.length-p)throw new IOException("UNKNOWN_FIELD");p+=n;}
    }
}
