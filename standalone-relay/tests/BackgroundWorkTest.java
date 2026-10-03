package com.example.opponotificationrelay;
import java.util.*;
import java.util.concurrent.*;

public final class BackgroundWorkTest {
    static int n;
    static void check(boolean b,String why){n++;if(!b)throw new AssertionError(why);}
    public static void main(String[] args) throws Exception {
        CountDownLatch started=new CountDownLatch(1),resume=new CountDownLatch(1),done=new CountDownLatch(3);
        List<Integer> order=Collections.synchronizedList(new ArrayList<>());
        List<RuntimeException> failures=Collections.synchronizedList(new ArrayList<>());
        BoundedWorker<Integer> worker=new BoundedWorker<>("test-bounded",3,6,x->x, x -> {
            if(x==1){started.countDown();try{resume.await();}catch(InterruptedException e){return;}}
            order.add(x);done.countDown();if(x==2)throw new IllegalStateException("one event");
        },failures::add);
        try {
            check(worker.offer(1),"start work");check(started.await(1,TimeUnit.SECONDS),"first work blocks");
            check(worker.offer(2) && worker.offer(3),"queue ordered events");
            check(!worker.offer(7) && worker.retainedBytes()==5,"oversize task rejected without evicting");
            resume.countDown();check(done.await(1,TimeUnit.SECONDS),"worker completes");
            check(order.equals(Arrays.asList(1,2,3)),"remove/post ordering preserved despite one failure");
            check(failures.size()==1,"event failure does not terminate worker");
        } finally {worker.close();}
        check(worker.retainedBytes()==0 && !worker.offer(1),"close releases and refuses later work");
        CountDownLatch active=new CountDownLatch(1),interrupted=new CountDownLatch(1);
        BoundedWorker<Integer> closing=new BoundedWorker<>("test-close",3,100,x->1,x->{
            active.countDown();try{new CountDownLatch(1).await();}catch(InterruptedException e){interrupted.countDown();}
        },e->{throw e;});
        closing.offer(1);check(active.await(1,TimeUnit.SECONDS),"second active work");closing.offer(2);closing.offer(3);closing.close();
        check(interrupted.await(1,TimeUnit.SECONDS) && closing.retainedBytes()==0,"stop interrupts active and drops pending");
        EventStatistics stats=new EventStatistics(9,"previous");
        check(stats.pending()==null,"clean state does not schedule persistence");
        RelayEvent event=RelayEvent.posted(1,"tag","key","test","App","Title","Body","",1,false);
        stats.record(event);EventStatistics.Snapshot old=stats.pending();stats.record(event);stats.saved(old);
        check(stats.pending()!=null && stats.snapshot().count==11,"snapshot acknowledgement preserves later update");
        stats.saved(stats.pending());check(stats.pending()==null,"current acknowledgement marks clean");
        ExecutorService pool=Executors.newFixedThreadPool(4);
        try {
            List<Future<?>> tasks=new ArrayList<>();
            for(int i=0;i<4;i++)tasks.add(pool.submit(()->{for(int j=0;j<300;j++)stats.record(event);}));
            for(Future<?> t:tasks)t.get(2,TimeUnit.SECONDS);
            check(stats.snapshot().count==1211,"concurrent count does not lose increments");
        } finally {pool.shutdownNow();}
        String longText=String.join("",Collections.nCopies(5000,"中😀"));
        stats.record(RelayEvent.posted(2,"t","k","test","A",longText,longText,"",1,false));
        check(stats.snapshot().preview.getBytes("UTF-8").length<=2048,"persisted preview byte bounded");
        EventStatistics legacy=new EventStatistics(50,longText);check(legacy.pending()!=null && legacy.snapshot().count==50,"old oversized preview migrates without count increment");
        EventStatistics limit=new EventStatistics(Integer.MAX_VALUE,"x");limit.record(event);
        check(limit.snapshot().count==Integer.MAX_VALUE,"diagnostic counter never wraps negative");
        System.out.println("PASS "+n+" ordered worker/statistics assertions");
    }
}
