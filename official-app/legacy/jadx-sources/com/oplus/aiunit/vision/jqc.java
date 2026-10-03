package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes10.dex */
public final class jqc extends cfg {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RxThreadFactory f12986l = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())));
    public final ThreadFactory k;

    public jqc() {
        this(f12986l);
    }

    @Override // com.oplus.aiunit.vision.cfg
    public cfg.c c() {
        return new io.reactivex.rxjava3.internal.schedulers.a(this.k);
    }

    public jqc(ThreadFactory threadFactory) {
        this.k = threadFactory;
    }
}
