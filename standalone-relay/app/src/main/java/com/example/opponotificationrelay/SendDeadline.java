package com.example.opponotificationrelay;
import java.io.IOException;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/** A one-shot deadline bound to one captured socket, with nested writes sharing it. */
public final class SendDeadline {
    public interface IoAction {void run() throws IOException;}
    private final ScheduledExecutorService timer;
    private final long millis;
    private final Runnable close;
    private final ThreadLocal<Boolean> nested=new ThreadLocal<>();
    public SendDeadline(ScheduledExecutorService timer,long millis,Runnable close) {
        if(timer==null || millis<1 || close==null) throw new IllegalArgumentException("deadline");
        this.timer=timer;this.millis=millis;this.close=close;
    }
    public void run(IoAction action) throws IOException {
        if(Boolean.TRUE.equals(nested.get())) {action.run();return;}
        AtomicInteger phase=new AtomicInteger();
        ScheduledFuture<?> pending=timer.schedule(() -> {
            if(phase.compareAndSet(0,1)) close.run();
        },millis,TimeUnit.MILLISECONDS);
        nested.set(true);
        try {
            action.run();
            if(!phase.compareAndSet(0,2)) throw new IOException("蓝牙发送超时，重新连接");
        } finally {
            phase.compareAndSet(0,2);pending.cancel(false);nested.remove();
        }
    }
}
