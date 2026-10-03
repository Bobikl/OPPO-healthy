package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0016\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\"\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0003\u0010\u000e\"\u0004\b\u0017\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/pdh;", "", "", "a", "Z", "e", "()Z", "j", "(Z)V", "isNoData", "", "b", "F", "d", "()F", "i", "(F)V", "minValue", "c", "h", "maxValue", "g", "intervalLow", "f", "intervalHigh", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class pdh {
    public static final int $stable = 8;
    public boolean a = true;
    public float b;
    public float c;
    public float d;
    public float e;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    public final void f(float f) {
        this.e = f;
    }

    public final void g(float f) {
        this.d = f;
    }

    public final void h(float f) {
        this.c = f;
    }

    public final void i(float f) {
        this.b = f;
    }

    public final void j(boolean z) {
        this.a = z;
    }
}
