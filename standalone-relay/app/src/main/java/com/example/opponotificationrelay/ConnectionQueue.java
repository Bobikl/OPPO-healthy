package com.example.opponotificationrelay;

import java.util.ArrayDeque;
import java.util.function.ToLongFunction;

/** Count and byte bounded, event driven. Each connection owns a close signal. */
public final class ConnectionQueue<T> {
    public static final class Session { private boolean closed,woken; }
    private static final class Item<T> {
        final T value; final long bytes;
        Item(T value,long bytes) {this.value=value;this.bytes=bytes;}
    }
    private final ArrayDeque<Item<T>> items=new ArrayDeque<>();
    private final int capacity;
    private final long maxBytes;
    private final ToLongFunction<T> weigh;
    private long bytes;
    public ConnectionQueue(int capacity) {this(capacity,capacity,item->1);}
    public ConnectionQueue(int capacity,long maxBytes,ToLongFunction<T> weigh) {
        if(capacity<1 || maxBytes<1 || weigh==null) throw new IllegalArgumentException("queue limits");
        this.capacity=capacity;this.maxBytes=maxBytes;this.weigh=weigh;
    }
    public Session open() {return new Session();}
    public synchronized boolean offer(T item) {
        if(item==null) throw new NullPointerException("item");
        long weight=weigh.applyAsLong(item);
        if(weight<0 || weight>maxBytes) return false;
        boolean dropped=false;
        while(!items.isEmpty() && (items.size()>=capacity || bytes>maxBytes-weight)) {
            bytes-=items.removeFirst().bytes;dropped=true;
        }
        items.addLast(new Item<>(item,weight));bytes+=weight;notifyAll();return !dropped;
    }
    public synchronized T take(Session session) throws InterruptedException {
        while(items.isEmpty() && !session.closed) wait();
        if(session.closed) return null;
        Item<T> item=items.removeFirst();bytes-=item.bytes;return item.value;
    }
    /** Wakeable bounded wait for optional control work; it never inserts or evicts a notification. */
    public synchronized T poll(Session session,long timeoutMillis) throws InterruptedException {
        if(timeoutMillis<1 || timeoutMillis>3600000)throw new IllegalArgumentException("poll timeout");
        long end=System.nanoTime()+timeoutMillis*1000000L;
        while(items.isEmpty() && !session.closed && !session.woken) {
            long left=end-System.nanoTime();if(left<=0)break;
            wait(left/1000000L,(int)(left%1000000L));
        }
        session.woken=false;
        if(session.closed || items.isEmpty())return null;
        Item<T> item=items.removeFirst();bytes-=item.bytes;return item.value;
    }
    public synchronized void wake(Session session){if(!session.closed){session.woken=true;notifyAll();}}
    public synchronized boolean closed(Session session){return session.closed;}
    public synchronized long retainedBytes() {return bytes;}
    public synchronized int size() {return items.size();}
    public synchronized void close(Session session) {session.closed=true;notifyAll();}
    public synchronized void clear() {items.clear();bytes=0;}
}
