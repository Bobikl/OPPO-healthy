package com.example.opponotificationrelay;
import java.io.Closeable;
import java.util.function.Consumer;
import java.util.function.ToLongFunction;

/** One bounded worker preserves post/remove order and releases pending values on close. */
public final class BoundedWorker<T> implements Closeable {
    private final ConnectionQueue<T> queue;
    private final ConnectionQueue.Session session;
    private final Thread thread;
    private volatile boolean closed;
    public BoundedWorker(String name,int capacity,long bytes,ToLongFunction<T> weigh,Consumer<T> work,Consumer<RuntimeException> error) {
        queue=new ConnectionQueue<>(capacity,bytes,weigh);session=queue.open();
        thread=new Thread(() -> {
            try {
                while(!closed) {
                    T value=queue.take(session);if(value==null || closed) break;
                    try {work.accept(value);} catch(RuntimeException failure){error.accept(failure);}
                }
            } catch(InterruptedException e){Thread.currentThread().interrupt();}
            finally {queue.clear();}
        },name);
        thread.setDaemon(true);thread.start();
    }
    public synchronized boolean offer(T value) {return !closed && queue.offer(value);}
    public void clear() {queue.clear();}
    public long retainedBytes() {return queue.retainedBytes();}
    @Override public synchronized void close() {
        if(closed) return;closed=true;queue.clear();queue.close(session);thread.interrupt();
    }
}
