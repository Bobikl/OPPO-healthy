package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import io.protostuff.MapSchema;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0016\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\"\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0003\u0010\u000e\"\u0004\b\u0017\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/x9h;", "", "", "a", "Z", MapSchema.FIELD_NAME_ENTRY, "()Z", "j", "(Z)V", "isNoData", "", "b", UserInfo.SEX_FEMALE, "d", "()F", "i", "(F)V", "minValue", "c", b2n.g, "maxValue", b2n.f, "intervalLow", "f", "intervalHigh", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class x9h {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isNoData = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public float minValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float maxValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float intervalLow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float intervalHigh;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getIntervalHigh() {
        return this.intervalHigh;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getIntervalLow() {
        return this.intervalLow;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsNoData() {
        return this.isNoData;
    }

    public final void f(float f) {
        this.intervalHigh = f;
    }

    public final void g(float f) {
        this.intervalLow = f;
    }

    public final void h(float f) {
        this.maxValue = f;
    }

    public final void i(float f) {
        this.minValue = f;
    }

    public final void j(boolean z) {
        this.isNoData = z;
    }
}
