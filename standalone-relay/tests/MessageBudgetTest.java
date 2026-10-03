package com.example.opponotificationrelay;
import java.io.*;
import java.nio.charset.StandardCharsets;

public final class MessageBudgetTest {
    static int n;
    static void check(boolean v,String reason) {n++;if(!v)throw new AssertionError(reason);}
    static String repeat(String s,int times) {StringBuilder b=new StringBuilder();for(int i=0;i<times;i++)b.append(s);return b.toString();}
    static void reject(Runnable r) {try{r.run();throw new AssertionError("accepted invalid event");}catch(MessageBudget.Rejected expected){n++;}}
    static RelayPayloadEncoder.EventEnvelope normal() {
        return RelayPayloadEncoder.encode(RelayEvent.posted(1,"t","key","test","应用","标题","正文","",1,false));
    }
    public static void main(String[] args) throws Exception {
        for(String s:new String[]{"abc","中文","😀","a😀中",repeat("中文😀",4000)}) for(int max:new int[]{3,4,7,16,1024,8192}) {
            String out=MessageBudget.text(s,max);
            check(out.getBytes(StandardCharsets.UTF_8).length<=max,"UTF8 budget");
            check(new String(out.getBytes(StandardCharsets.UTF_8),StandardCharsets.UTF_8).equals(out),"no partial surrogate");
            if(s.getBytes(StandardCharsets.UTF_8).length<=max) check(out.equals(s),"short text byte identical");
            else check(out.endsWith("…"),"visible truncation");
        }
        reject(()->MessageBudget.identifier(repeat("中",800),2048));
        reject(()->MessageBudget.text("\ud800",100));
        RelayEvent large=RelayEvent.posted(7,"tag","key","test","应用",repeat("标😀",6000),repeat("正文😀",20000),"副",1,false);
        RelayPayloadEncoder.EventEnvelope largePost=RelayPayloadEncoder.encode(large,200,new RelayIcon("test","test",WatchIconBitmap.encode(new int[4096]),201,201),true);
        MessageBudget.validate(RelayPayloadEncoder.withSilentFlag(largePost));
        check(large.title.endsWith("…") && large.content.endsWith("…"),"long text trimmed before encoding");
        check(largePost.payload.length<20480 && largePost.picture.payload.length<20480,"both APDUs fit");
        reject(()->RelayEvent.removed(1,repeat("x",1025),"key","test"));
        ConnectionQueue<String> queue=new ConnectionQueue<>(3,8,String::length);
        ConnectionQueue.Session q=queue.open();
        check(queue.offer("1234") && queue.offer("5678"),"exact byte cap");
        check(!queue.offer("xx") && queue.size()==2 && queue.retainedBytes()==6,"evict until both limits fit");
        check(!queue.offer("123456789") && queue.size()==2,"oversize rejects without evicting");
        check(queue.take(q).equals("5678") && queue.retainedBytes()==2,"weight released on take");
        queue.clear();check(queue.retainedBytes()==0 && queue.size()==0,"clear releases weight");
        ByteArrayOutputStream inbound=new ByteArrayOutputStream(),written=new ByteArrayOutputStream();
        byte[] ctrl=OafCrypto.concat(new byte[]{1,125,101,0,4},"wear:notification;".getBytes("UTF-8"),new byte[]{0,1,0,32,0,1,4,2,0});
        new OafWire(new ByteArrayInputStream(new byte[0]),inbound).send(1,ctrl);
        OafSession session=new OafSession(new OafWire(new ByteArrayInputStream(inbound.toByteArray()),written),new OafSession.Events(){
            public void status(String s){} public void ready(){}
        });
        session.readAndHandle();written.reset();
        RelayPayloadEncoder.EventEnvelope bad=new RelayPayloadEncoder.EventEnvelope(2,200,new byte[20480],"test");
        reject(()->{try{session.send(bad);}catch(IOException e){throw new AssertionError("size treated as link error",e);}});
        check(written.size()==0 && session.isReady(),"bad event does not write or disconnect");
        session.send(normal());check(written.size()>0 && session.isReady(),"normal message after rejected message");
        System.out.println("PASS "+n+" message and byte budget assertions");
    }
}
