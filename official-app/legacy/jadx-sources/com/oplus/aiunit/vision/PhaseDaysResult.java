package com.oplus.aiunit.vision;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ohe, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/ohe;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "periodDays", "b", "follicularDays", "c", "ovulationDays", "lutealDays", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "menstrual_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PhaseDaysResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Integer> periodDays;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Integer> follicularDays;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<Integer> ovulationDays;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Integer> lutealDays;

    public PhaseDaysResult(@NotNull List<Integer> periodDays, @NotNull List<Integer> follicularDays, @NotNull List<Integer> ovulationDays, @NotNull List<Integer> lutealDays) {
        Intrinsics.checkNotNullParameter(periodDays, "periodDays");
        Intrinsics.checkNotNullParameter(follicularDays, "follicularDays");
        Intrinsics.checkNotNullParameter(ovulationDays, "ovulationDays");
        Intrinsics.checkNotNullParameter(lutealDays, "lutealDays");
        this.periodDays = periodDays;
        this.follicularDays = follicularDays;
        this.ovulationDays = ovulationDays;
        this.lutealDays = lutealDays;
    }

    @NotNull
    public final List<Integer> a() {
        return this.follicularDays;
    }

    @NotNull
    public final List<Integer> b() {
        return this.lutealDays;
    }

    @NotNull
    public final List<Integer> c() {
        return this.ovulationDays;
    }

    @NotNull
    public final List<Integer> d() {
        return this.periodDays;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhaseDaysResult)) {
            return false;
        }
        PhaseDaysResult phaseDaysResult = (PhaseDaysResult) other;
        return Intrinsics.areEqual(this.periodDays, phaseDaysResult.periodDays) && Intrinsics.areEqual(this.follicularDays, phaseDaysResult.follicularDays) && Intrinsics.areEqual(this.ovulationDays, phaseDaysResult.ovulationDays) && Intrinsics.areEqual(this.lutealDays, phaseDaysResult.lutealDays);
    }

    public int hashCode() {
        return (((((this.periodDays.hashCode() * 31) + this.follicularDays.hashCode()) * 31) + this.ovulationDays.hashCode()) * 31) + this.lutealDays.hashCode();
    }

    @NotNull
    public String toString() {
        return "PhaseDaysResult(periodDays=" + this.periodDays + ", follicularDays=" + this.follicularDays + ", ovulationDays=" + this.ovulationDays + ", lutealDays=" + this.lutealDays + ")";
    }
}
