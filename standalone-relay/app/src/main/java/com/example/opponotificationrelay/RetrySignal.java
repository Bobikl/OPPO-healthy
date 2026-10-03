package com.example.opponotificationrelay;

import java.util.concurrent.TimeUnit;

/** Versioned condition: an event between the failed attempt and wait is not lost. */
public final class RetrySignal {
    private long version;
    public synchronized long checkpoint() {return version;}
    public synchronized void signal() {version++;notifyAll();}
    public synchronized boolean await(long observed,long millis) throws InterruptedException {
        long remaining=TimeUnit.MILLISECONDS.toNanos(millis),start=System.nanoTime();
        while(observed==version) {
            if(millis==0) wait();
            else {
                if(remaining<=0) return false;
                TimeUnit.NANOSECONDS.timedWait(this,remaining);
                remaining=TimeUnit.MILLISECONDS.toNanos(millis)-(System.nanoTime()-start);
            }
        }
        return true;
    }
}
