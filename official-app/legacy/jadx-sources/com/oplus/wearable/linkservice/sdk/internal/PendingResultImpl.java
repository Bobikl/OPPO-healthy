package com.oplus.wearable.linkservice.sdk.internal;

import android.os.RemoteException;
import com.oplus.aiunit.vision.uuf;
import com.oplus.wearable.linkservice.sdk.IWearableCallback;
import com.oplus.wearable.linkservice.sdk.common.Status;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
class PendingResultImpl extends IWearableCallback.Stub {
    CountDownLatch mCountDownLatch = new CountDownLatch(1);
    private boolean mSuccess;

    public uuf await() {
        try {
            this.mCountDownLatch.await();
            return this.mSuccess ? Status.SUCCESS : Status.TIMEOUT;
        } catch (InterruptedException unused) {
            return Status.INTERRUPTED;
        }
    }

    @Override // com.oplus.wearable.linkservice.sdk.IWearableCallback
    public void onResult(Status status) throws RemoteException {
        this.mSuccess = status == Status.SUCCESS;
        this.mCountDownLatch.countDown();
    }

    public uuf await(long j2, TimeUnit timeUnit) {
        try {
            this.mCountDownLatch.await(j2, timeUnit);
            if (this.mSuccess) {
                return Status.SUCCESS;
            }
            return Status.TIMEOUT;
        } catch (InterruptedException unused) {
            return Status.INTERRUPTED;
        }
    }
}
