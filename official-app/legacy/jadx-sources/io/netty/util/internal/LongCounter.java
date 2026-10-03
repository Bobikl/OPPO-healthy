package io.netty.util.internal;

/* JADX INFO: loaded from: classes10.dex */
public interface LongCounter {
    void add(long j2);

    void decrement();

    void increment();

    long value();
}
