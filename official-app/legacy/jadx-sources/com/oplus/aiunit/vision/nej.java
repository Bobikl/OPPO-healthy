package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.CommonBackBean;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes15.dex */
public class nej extends ao0<CommonBackBean> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CountDownLatch f14485j = new CountDownLatch(1);
    public final AtomicBoolean k = new AtomicBoolean(false);

    @Override // com.oplus.aiunit.vision.ao0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(CommonBackBean commonBackBean) {
        a7b.f("Data-Sync", "DB insert resultCode = " + commonBackBean.getErrorCode());
        this.k.set(commonBackBean.getErrorCode() == 0);
        if (this.f14485j.getCount() > 0) {
            this.f14485j.countDown();
        }
    }

    public boolean d() {
        try {
            this.f14485j.await(60L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            zlj.c("SyncObserver", "result: ex " + e2);
        }
        return this.k.get();
    }

    @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        super.onError(th);
        this.k.set(false);
        if (this.f14485j.getCount() > 0) {
            this.f14485j.countDown();
        }
    }
}
