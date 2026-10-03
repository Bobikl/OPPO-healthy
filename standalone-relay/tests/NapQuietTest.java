package com.example.opponotificationrelay;
import java.io.*;
import java.time.*;
import java.util.*;

public final class NapQuietTest {
    private static int assertions;
    private static byte[] hex(String s){byte[] b=new byte[s.length()/2];for(int i=0;i<b.length;i++)b[i]=(byte)Integer.parseInt(s.substring(i*2,i*2+2),16);return b;}
    private static void check(boolean b,String label){assertions++;if(!b)throw new AssertionError(label);}
    private static long read(byte[] b,int[] p) {
        long n=0;int shift=0;
        while(true){int v=b[p[0]++]&255;n|=(long)(v&127)<<shift;if(v<128)return n;shift+=7;}
    }
    private static byte[] withoutFlags(byte[] b) {
        ByteArrayOutputStream out=new ByteArrayOutputStream();int[] p={0};
        while(p[0]<b.length) {
            int begin=p[0];long tag=read(b,p);int kind=(int)(tag&7);
            if(kind==0)read(b,p);else {int size=kind==2?(int)read(b,p):kind==1?8:4;p[0]+=size;}
            if((tag>>>3)!=11)out.write(b,begin,p[0]-begin);
        }
        return out.toByteArray();
    }
    private static long flags(byte[] b) {
        int[] p={0};long result=0;
        while(p[0]<b.length) {
            long tag=read(b,p);int kind=(int)(tag&7);
            if(kind==0){long value=read(b,p);if((tag>>>3)==11)result=value;}
            else {int size=kind==2?(int)read(b,p):kind==1?8:4;p[0]+=size;}
        }
        return result;
    }
    private static RelayPayloadEncoder.EventEnvelope post(int flags) {
        RelayEvent e=RelayEvent.posted(7,"tag","key","test","App","Title","Body","Sub",3,4,flags,
            "group","group-key",false,true,true,false,2,true);
        RelayIcon icon=new RelayIcon("test","test",WatchIconBitmap.encode(new int[4096]),201,201);
        return RelayPayloadEncoder.encode(e,200,icon,true);
    }
    public static void main(String[] args) throws Exception {
        int start=12*60,end=13*60;
        check(NapQuietPolicy.valid(start,end),"daytime range valid");
        for(int[] range:new int[][]{{-1,end},{start,1440},{start,start},{end,start}}) {
            check(!NapQuietPolicy.valid(range[0],range[1]),"invalid/reversed range rejected");
            check(!NapQuietPolicy.active(true,range[0],range[1],LocalTime.NOON),"bad persisted range inactive");
        }
        check(!NapQuietPolicy.active(false,start,end,LocalTime.NOON),"disabled remains inactive");
        check(!NapQuietPolicy.active(true,start,end,null),"missing clock inactive");
        check(!NapQuietPolicy.active(true,start,end,LocalTime.NOON.minusNanos(1)),"before start");
        check(NapQuietPolicy.active(true,start,end,LocalTime.NOON),"official inclusive daytime start");
        check(NapQuietPolicy.active(true,start,end,LocalTime.of(13,0)),"official inclusive exact end instant");
        check(!NapQuietPolicy.active(true,start,end,LocalTime.of(13,0).plusNanos(1)),"after end even within same minute");
        for(int m=0;m<1440;m+=15) {
            LocalTime t=LocalTime.of(m/60,m%60);
            check(NapQuietPolicy.active(true,start,end,t)==(m>=start && m<=end),"daily clock boundary "+m);
        }
        check(NapQuietPolicy.time(start).equals("12:00") && NapQuietPolicy.time(5).equals("00:05"),"24 hour picker display");
        Instant time=Instant.parse("2026-10-01T04:30:00Z");
        check(NapQuietPolicy.active(true,start,end,LocalTime.ofInstant(time,ZoneId.of("Asia/Singapore"))),"phone local time zone honored");
        check(!NapQuietPolicy.active(true,start,end,LocalTime.ofInstant(time,ZoneId.of("UTC"))),"same instant in other local zone differs");
        for(int source:new int[]{0,0x12,0x80000000,0x10000000,0xffffffff}) {
            RelayPayloadEncoder.EventEnvelope e=post(source);
            byte[] original=e.payload.clone(),picture=e.picture.payload.clone();
            RelayPayloadEncoder.EventEnvelope silent=RelayPayloadEncoder.withSilentFlag(e);
            check(flags(silent.payload)==((source|0x10000000)&0xffffffffL),"all existing flags preserved");
            check(Arrays.equals(withoutFlags(original),withoutFlags(silent.payload)),"every other wire field byte preserved");
            check(Arrays.equals(e.payload,original),"source envelope immutable");
            check(silent.picture==e.picture && Arrays.equals(picture,silent.picture.payload),"BMP and atomic picture association preserved");
            check(silent.commandId==200 && silent.sourcePackage.equals(e.sourcePackage),"route and source unchanged");
            check(RelayPayloadEncoder.withSilentFlag(silent)==silent,"silent injection idempotent");
        }
        RelayPayloadEncoder.EventEnvelope legacy=RelayPayloadEncoder.encode(RelayEvent.posted(1,"t","k","test","A","T","B","",1,false),1);
        check(RelayPayloadEncoder.withSilentFlag(legacy)==legacy,"unsupported compatibility route never pretends silent");
        RelayPayloadEncoder.EventEnvelope removed=RelayPayloadEncoder.encode(RelayEvent.removed(1,"t","k","test"));
        check(RelayPayloadEncoder.withSilentFlag(removed)==removed,"removal forwarding unaffected");
        RelayPayloadEncoder.EventEnvelope other=new RelayPayloadEncoder.EventEnvelope(1,200,new byte[0],"test");
        check(RelayPayloadEncoder.withSilentFlag(other)==other,"other service untouched");
        check(RelayPayloadEncoder.withSilentFlag(null)==null,"null safely ignored");
        for(byte[] bad:new byte[][]{{0},{10,127},{88,(byte)128},{88,1,88,2}}) {
            try{RelayPayloadEncoder.withSilentFlag(new RelayPayloadEncoder.EventEnvelope(2,200,bad,"test"));throw new AssertionError("bad proto accepted");}
            catch(IllegalArgumentException expected){assertions++;}
        }
        ByteArrayOutputStream input=new ByteArrayOutputStream(),output=new ByteArrayOutputStream();
        new OafWire(new ByteArrayInputStream(new byte[0]),input).send(1,
            OafCrypto.concat(hex("017d650004"),"wear:notification;".getBytes("UTF-8"),hex("000100200001040200")));
        OafSession session=new OafSession(new OafWire(new ByteArrayInputStream(input.toByteArray()),output),new OafSession.Events(){
            public void status(String s){} public void ready(){}
        });session.readAndHandle();output.reset();
        RelayPayloadEncoder.EventEnvelope silent=RelayPayloadEncoder.withSilentFlag(post(0x12));session.send(silent);
        ByteArrayInputStream frames=new ByteArrayInputStream(output.toByteArray());OafWire wire=new OafWire(frames,new ByteArrayOutputStream());
        ByteArrayOutputStream image=new ByteArrayOutputStream();int count=0;
        while(true){byte[] f=wire.read();count++;image.write(f,2,f.length-2);if((f[1]&3)==3)break;}
        check(count==9 && Arrays.equals(image.toByteArray(),OafCrypto.concat(new byte[]{0,(byte)202},silent.picture.payload)),"real quiet transmission includes entire BMP first");
        byte[] f=wire.read();byte[] body=Arrays.copyOfRange(f,4,f.length);
        check((f[3]&255)==200 && flags(body)==0x10000012L && frames.available()==0,"real post keeps text route and silent flag");
        System.out.println("PASS "+assertions+" nap quiet/time/forwarding assertions");
    }
}
