package com.example.opponotificationrelay;
import java.io.IOException;
import java.util.function.BooleanSupplier;
/** Lock order: history lock, then this lock. Network and SDK calls never hold this lock. */
final class SyncCommit {
    static final Object LOCK=new Object();
    interface Action {void run()throws Exception;}
    static void run(BooleanSupplier allowed,Action action)throws Exception {
        synchronized(LOCK){if(Thread.currentThread().isInterrupted()||!allowed.getAsBoolean())throw new IOException("CLOUD_CANCELLED");action.run();}
    }
}
