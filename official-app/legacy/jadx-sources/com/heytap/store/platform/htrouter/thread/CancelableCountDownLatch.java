package com.heytap.store.platform.htrouter.thread;

import java.util.concurrent.CountDownLatch;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/platform/htrouter/thread/CancelableCountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "count", "", "(I)V", "cancel", "", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class CancelableCountDownLatch extends CountDownLatch {
    public CancelableCountDownLatch(int i) {
        super(i);
    }

    public final void cancel() {
        while (getCount() > 0) {
            countDown();
        }
    }
}
