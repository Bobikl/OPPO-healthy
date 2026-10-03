package com.oplus.wearable.linkservice.sdk.internal;

import android.os.RemoteException;
import com.oplus.aiunit.vision.wxf;
import com.oplus.wearable.linkservice.sdk.IWearableCallback;
import com.oplus.wearable.linkservice.sdk.common.Status;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
class PendingResultImpl extends IWearableCallback.Stub {
    CountDownLatch mCountDownLatch = new CountDownLatch(1);
    private boolean mSuccess;

    public wxf await() {
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

    public wxf await(long j, TimeUnit timeUnit) {
        try {
            this.mCountDownLatch.await(j, timeUnit);
            if (this.mSuccess) {
                return Status.SUCCESS;
            }
            return Status.TIMEOUT;
        } catch (InterruptedException unused) {
            return Status.INTERRUPTED;
        }
    }
}
