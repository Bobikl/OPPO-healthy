package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.wxi, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/wxi;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "()J", "c", "(J)V", "startTimestamp", "b", "I", "()I", "d", "(I)V", "stress", "<init>", "(JI)V", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class StressDetailData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public long startTimestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int stress;

    public StressDetailData() {
        this(0L, 0, 3, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getStress() {
        return this.stress;
    }

    public final void c(long j2) {
        this.startTimestamp = j2;
    }

    public final void d(int i) {
        this.stress = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressDetailData)) {
            return false;
        }
        StressDetailData stressDetailData = (StressDetailData) other;
        return this.startTimestamp == stressDetailData.startTimestamp && this.stress == stressDetailData.stress;
    }

    public int hashCode() {
        return (Long.hashCode(this.startTimestamp) * 31) + Integer.hashCode(this.stress);
    }

    @NotNull
    public String toString() {
        return "StressDetailData(startTimestamp=" + this.startTimestamp + ", stress=" + this.stress + ")";
    }

    public StressDetailData(long j2, int i) {
        this.startTimestamp = j2;
        this.stress = i;
    }

    public /* synthetic */ StressDetailData(long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? 0 : i);
    }
}
