package com.example.opponotificationrelay;
import java.io.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public final class ConnectionSafetyTest {
    static int n;
    static void check(boolean b,String why){n++;if(!b)throw new AssertionError(why);}
    public static void main(String[] args) throws Exception {
        ConnectionState state=new ConnectionState();
        ExecutorService pool=Executors.newSingleThreadExecutor();
        try {
            for(int i=0;i<60;i++) {
                long old=state.begin();check(old!=0 && state.active(old),"old connected");
                ConnectionState.Snapshot oldStatus=state.status(old,3,"old ready");
                CountDownLatch checked=new CountDownLatch(1),resume=new CountDownLatch(1);
                Future<Boolean> late=pool.submit(() -> {
                    if(!state.active(old))return false;checked.countDown();resume.await();
                    return state.status(old,3,"late")==null && state.fail(old,0,"late auth",true)==null;
                });
                check(checked.await(1,TimeUnit.SECONDS),"old worker paused after check");
                state.stop(0,"stop");long current=state.begin();
                ConnectionState.Snapshot good=state.status(current,1,"new connection");resume.countDown();
                check(late.get(1,TimeUnit.SECONDS),"stale commit and terminal failure rejected");
                check(state.active(current) && state.snapshot().state==1,"new worker remains running");
                check(!state.current(oldStatus) && state.current(good),"stale publication rejected");
                state.stop(0,"stop");
            }
            long failed=state.begin();
            check(state.fail(failed,0,"auth",true)!=null && state.begin()==0,"auth blocks automatic retry");
            state.stop(0,"manual");check(state.begin()!=0,"explicit stop clears block");
        } finally {pool.shutdownNow();}
        ScheduledThreadPoolExecutor timer=new ScheduledThreadPoolExecutor(1);timer.setRemoveOnCancelPolicy(true);
        try {
            AtomicInteger closed=new AtomicInteger();CountDownLatch released=new CountDownLatch(1);
            SendDeadline stuck=new SendDeadline(timer,30,() -> {closed.incrementAndGet();released.countDown();});
            long started=System.nanoTime();
            try {stuck.run(() -> {try{released.await();}catch(InterruptedException e){throw new IOException(e);}});
                throw new AssertionError("blocked write passed");}
            catch(IOException expected){check(closed.get()==1,"captured socket closed on deadline");}
            check(TimeUnit.NANOSECONDS.toMillis(System.nanoTime()-started)<1000,"write unblocked promptly");
            AtomicInteger newerClosed=new AtomicInteger();
            SendDeadline next=new SendDeadline(timer,120,newerClosed::incrementAndGet);
            for(int i=0;i<80;i++)next.run(() -> check(timer.getQueue().size()<=1,"only active send has deadline"));
            next.run(() -> next.run(() -> check(timer.getQueue().size()==1,"nested frame shares message deadline")));
            Thread.sleep(180);
            check(newerClosed.get()==0 && closed.get()==1,"cancelled/old deadline cannot close next socket");
            check(timer.getQueue().isEmpty(),"cancelled tasks removed");
            CountDownLatch outputClosed=new CountDownLatch(1);
            SendDeadline wireDeadline=new SendDeadline(timer,30,outputClosed::countDown);
            OutputStream output=new OutputStream(){public void write(int value) throws IOException {
                try{outputClosed.await();}catch(InterruptedException e){throw new IOException(e);}
            }};
            OafWire wire=new OafWire(new ByteArrayInputStream(new byte[0]),output);wire.setDeadline(wireDeadline);
            try{wire.write(new byte[]{1});throw new AssertionError("wire stalled indefinitely");}
            catch(IOException expected){check(outputClosed.getCount()==0,"wire control output bounded too");}
        } finally {timer.shutdownNow();}
        System.out.println("PASS "+n+" connection generation/deadline assertions");
    }
}
