package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\"\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010 \u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u000b\u0010\u000e\"\u0004\b\u001f\u0010\u0010R$\u0010%\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u0003\u0010#\"\u0004\b\u001e\u0010$¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/sh9;", "", "", "a", "Z", "f", "()Z", "n", "(Z)V", "isNoData", "", "b", "I", "getMinValue", "()I", LogFieldKey.MESSAGE_KEY, "(I)V", "minValue", "c", "getMaxValue", MapSchema.FIELD_NAME_KEY, "maxValue", "d", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.LEVEL_KEY, "minAvgValue", "j", "maxAvgValue", "i", "intervalLow", b2n.f, b2n.g, "intervalHigh", "Lcom/oplus/aiunit/vision/xf9;", "Lcom/oplus/aiunit/vision/xf9;", "()Lcom/oplus/aiunit/vision/xf9;", "(Lcom/oplus/aiunit/vision/xf9;)V", "hrvAnalyzeDataBean", "<init>", "()V", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final class sh9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isNoData = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int minValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int maxValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int minAvgValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int maxAvgValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int intervalLow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int intervalHigh;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public xf9 hrvAnalyzeDataBean;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final xf9 getHrvAnalyzeDataBean() {
        return this.hrvAnalyzeDataBean;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIntervalHigh() {
        return this.intervalHigh;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIntervalLow() {
        return this.intervalLow;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxAvgValue() {
        return this.maxAvgValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMinAvgValue() {
        return this.minAvgValue;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsNoData() {
        return this.isNoData;
    }

    public final void g(@Nullable xf9 xf9Var) {
        this.hrvAnalyzeDataBean = xf9Var;
    }

    public final void h(int i) {
        this.intervalHigh = i;
    }

    public final void i(int i) {
        this.intervalLow = i;
    }

    public final void j(int i) {
        this.maxAvgValue = i;
    }

    public final void k(int i) {
        this.maxValue = i;
    }

    public final void l(int i) {
        this.minAvgValue = i;
    }

    public final void m(int i) {
        this.minValue = i;
    }

    public final void n(boolean z) {
        this.isNoData = z;
    }
}
