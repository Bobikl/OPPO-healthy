package com.oplus.aiunit.vision;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R$\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR*\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00028\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/jyj;", "", "", "b", "c", "d", "<set-?>", "a", "J", "()J", "startTime", "getDuration", "setDuration", "(J)V", "duration", "", "auto", "<init>", "(Z)V", "aiunit.sdk.core_release"}, k = 1, mv = {1, 9, 0})
public class jyj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public volatile long startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile long duration;

    public jyj(boolean z) {
        if (z) {
            b();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    public final synchronized long b() {
        this.duration = 0L;
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    public final synchronized long c() {
        long jCurrentTimeMillis;
        jCurrentTimeMillis = System.currentTimeMillis();
        this.duration = jCurrentTimeMillis - this.startTime;
        return jCurrentTimeMillis;
    }

    public final long d() {
        c();
        return this.duration;
    }
}
