package com.oplus.aiunit.vision;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes10.dex */
public final class kqc extends zeg {
    public static final RxThreadFactory k = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ThreadFactory f13379j;

    public kqc() {
        this(k);
    }

    @Override // com.oplus.aiunit.vision.zeg
    public zeg.c a() {
        return new io.reactivex.internal.schedulers.a(this.f13379j);
    }

    public kqc(ThreadFactory threadFactory) {
        this.f13379j = threadFactory;
    }
}
