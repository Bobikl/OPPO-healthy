package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.otb, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/otb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "b", "()Z", "setHasData", "(Z)V", "hasData", "I", MapSchema.FIELD_NAME_ENTRY, "()I", "setPeriodAvg", "(I)V", "periodAvg", "c", "setFollicularAvg", "follicularAvg", "d", "setOvulationAvg", "ovulationAvg", "setLutealAvg", "lutealAvg", "<init>", "(ZIIII)V", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class MenstrualCycleData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public boolean hasData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int periodAvg;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int follicularAvg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int ovulationAvg;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public int lutealAvg;

    public MenstrualCycleData() {
        this(false, 0, 0, 0, 0, 31, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getFollicularAvg() {
        return this.follicularAvg;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasData() {
        return this.hasData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLutealAvg() {
        return this.lutealAvg;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getOvulationAvg() {
        return this.ovulationAvg;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPeriodAvg() {
        return this.periodAvg;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualCycleData)) {
            return false;
        }
        MenstrualCycleData menstrualCycleData = (MenstrualCycleData) other;
        return this.hasData == menstrualCycleData.hasData && this.periodAvg == menstrualCycleData.periodAvg && this.follicularAvg == menstrualCycleData.follicularAvg && this.ovulationAvg == menstrualCycleData.ovulationAvg && this.lutealAvg == menstrualCycleData.lutealAvg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.hasData;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((r0 * 31) + Integer.hashCode(this.periodAvg)) * 31) + Integer.hashCode(this.follicularAvg)) * 31) + Integer.hashCode(this.ovulationAvg)) * 31) + Integer.hashCode(this.lutealAvg);
    }

    @NotNull
    public String toString() {
        return "MenstrualCycleData(hasData=" + this.hasData + ", periodAvg=" + this.periodAvg + ", follicularAvg=" + this.follicularAvg + ", ovulationAvg=" + this.ovulationAvg + ", lutealAvg=" + this.lutealAvg + ")";
    }

    public MenstrualCycleData(boolean z, int i, int i2, int i3, int i4) {
        this.hasData = z;
        this.periodAvg = i;
        this.follicularAvg = i2;
        this.ovulationAvg = i3;
        this.lutealAvg = i4;
    }

    public /* synthetic */ MenstrualCycleData(boolean z, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? false : z, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }
}
