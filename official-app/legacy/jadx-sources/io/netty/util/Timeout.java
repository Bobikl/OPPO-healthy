package io.netty.util;

/* JADX INFO: loaded from: classes10.dex */
public interface Timeout {
    boolean cancel();

    boolean isCancelled();

    boolean isExpired();

    TimerTask task();

    Timer timer();
}
