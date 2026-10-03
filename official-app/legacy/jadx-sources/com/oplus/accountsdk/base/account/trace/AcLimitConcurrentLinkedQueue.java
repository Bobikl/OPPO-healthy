package com.oplus.accountsdk.base.account.trace;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class AcLimitConcurrentLinkedQueue<E> extends ConcurrentLinkedQueue<E> {
    private static final int MAX_TRACE_SIZE = 300;

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public boolean offer(E e2) {
        if (size() > 300) {
            clear();
        }
        return super.offer(e2);
    }
}
