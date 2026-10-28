package com.example.opponotificationrelay;
import java.io.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
public final class SyncSafetyTest {
    static int checks;static void check(boolean value){checks++;if(!value)throw new AssertionError("CHECK_"+checks);}
    public static void main(String[] args)throws Exception {
        OafFragments parts=new OafFragments();byte[] a={1,2},b={3};
        check(parts.accept(40,1,1,a,0)==null);check(parts.accept(40,2,3,b,1)==null);
        check(parts.accept(40,2,1,a,2)==null);check(java.util.Arrays.equals(parts.accept(40,2,3,b,3),new byte[]{1,2,3}));
        parts.accept(40,3,1,a,4);check(parts.accept(40,3,3,b,20_000_000_004L)==null);
        for(int sid=0;sid<4;sid++)parts.accept(sid,0,1,new byte[20000],30_000_000_000L);
        boolean bounded=false;try{parts.accept(4,0,1,new byte[2000],30_000_000_001L);}catch(IOException e){bounded=true;}check(bounded);
        AtomicBoolean allowed=new AtomicBoolean(true),committed=new AtomicBoolean(false);CountDownLatch acquired=new CountDownLatch(1),release=new CountDownLatch(1);
        Thread writer=new Thread(()->{try{SyncCommit.run(allowed::get,()->{acquired.countDown();release.await();committed.set(true);});}catch(Exception e){throw new AssertionError(e);}});
        writer.start();check(acquired.await(2,TimeUnit.SECONDS));Thread revoke=new Thread(()->{synchronized(SyncCommit.LOCK){allowed.set(false);}});revoke.start();release.countDown();writer.join(2000);revoke.join(2000);check(committed.get()&&!allowed.get());
        committed.set(false);boolean denied=false;try{SyncCommit.run(allowed::get,()->committed.set(true));}catch(IOException e){denied=true;}check(denied&&!committed.get());
        System.out.println("SyncSafetyTest: "+checks+" checks passed");
    }
}
