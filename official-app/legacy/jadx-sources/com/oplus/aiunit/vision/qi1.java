package com.oplus.aiunit.vision;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes10.dex */
public final class qi1 extends CountDownLatch implements o14<Throwable>, Cdo {
    public Throwable i;

    public qi1() {
        super(1);
    }

    @Override // com.oplus.aiunit.vision.o14
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th) {
        this.i = th;
        countDown();
    }

    @Override // com.oplus.aiunit.vision.Cdo
    public void run() {
        countDown();
    }
}
