package com.example.opponotificationrelay;
import java.util.concurrent.*;

public final class ConnectionQueueTest {
    static int checks;
    static void check(boolean value) {checks++;if(!value)throw new AssertionError("check "+checks);}
    public static void main(String[] args) throws Exception {
        ConnectionQueue<Integer> q=new ConnectionQueue<>(2);
        ConnectionQueue.Session a=q.open();
        ExecutorService executor=Executors.newSingleThreadExecutor();
        try {
            Future<Integer> wait=executor.submit(()->q.take(a));
            Thread.sleep(1200);check(!wait.isDone());
            q.offer(1);check(wait.get(1,TimeUnit.SECONDS)==1);
            wait=executor.submit(()->q.take(a));
            q.close(a);check(wait.get(1,TimeUnit.SECONDS)==null);
            ConnectionQueue.Session b=q.open();
            q.close(a);q.offer(2);check(q.take(b)==2);
            check(q.offer(3));check(q.offer(4));check(!q.offer(5));
            check(q.take(b)==4);check(q.take(b)==5);
            q.offer(6);q.close(b);check(q.take(b)==null);
            check(q.take(q.open())==6);
            q.offer(7);q.clear();
            ConnectionQueue.Session c=q.open();
            wait=executor.submit(()->q.take(c));
            Thread.sleep(50);check(!wait.isDone());
            check(wait.cancel(true));
            check(executor.submit(()->42).get(1,TimeUnit.SECONDS)==42);
            for(int i=0;i<100;i++) {
                ConnectionQueue.Session s=q.open();
                Future<Integer> f=executor.submit(()->q.take(s));
                q.close(s);check(f.get(1,TimeUnit.SECONDS)==null);
            }
        } finally {executor.shutdownNow();}
        System.out.println("Connection queue checks passed: "+checks);
    }
}
