package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\n\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u0004\b\u0010\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/xf9;", "", "", "a", "I", "b", "()I", "f", "(I)V", "curAvgHrv", MapSchema.FIELD_NAME_ENTRY, "beforeAvgHrv", "c", "d", b2n.g, "intervalLow", b2n.f, "intervalHigh", "<init>", "()V", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final class xf9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int curAvgHrv;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int beforeAvgHrv;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int intervalLow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int intervalHigh;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBeforeAvgHrv() {
        return this.beforeAvgHrv;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurAvgHrv() {
        return this.curAvgHrv;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIntervalHigh() {
        return this.intervalHigh;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getIntervalLow() {
        return this.intervalLow;
    }

    public final void e(int i) {
        this.beforeAvgHrv = i;
    }

    public final void f(int i) {
        this.curAvgHrv = i;
    }

    public final void g(int i) {
        this.intervalHigh = i;
    }

    public final void h(int i) {
        this.intervalLow = i;
    }
}
