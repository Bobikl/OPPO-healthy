package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.f79, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/f79;", "", "", "toString", "", "a", "I", "b", "()I", "d", "(I)V", "labelId", "c", "count", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class HeartRateWarnLabelBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int labelId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int count;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLabelId() {
        return this.labelId;
    }

    public final void c(int i) {
        this.count = i;
    }

    public final void d(int i) {
        this.labelId = i;
    }

    @NotNull
    public String toString() {
        return "HeartRateWarnLabelBean(labelId=" + this.labelId + ", count=" + this.count + ")";
    }
}
