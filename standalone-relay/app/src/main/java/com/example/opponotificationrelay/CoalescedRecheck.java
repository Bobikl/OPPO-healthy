package com.example.opponotificationrelay;

import java.util.concurrent.Executor;

/** At most one queued/running task; changes during a query require a follow-up. */
public final class CoalescedRecheck {
    private final Executor executor;
    private final Runnable action;
    private long revision;
    private boolean queued;
    public CoalescedRecheck(Executor executor,Runnable action) {this.executor=executor;this.action=action;}
    public synchronized long revision() {return revision;}
    public synchronized boolean pending() {return queued;}
    public synchronized void signal() {
        revision++;
        if(!queued) {queued=true;schedule();}
    }
    private void schedule() {
        try {executor.execute(this::run);}
        catch(RuntimeException e) {queued=false;throw e;}
    }
    private void run() {
        long start=revision();
        try {action.run();}
        finally {
            synchronized(this) {
                if(revision!=start) schedule();
                else queued=false;
            }
        }
    }
}
