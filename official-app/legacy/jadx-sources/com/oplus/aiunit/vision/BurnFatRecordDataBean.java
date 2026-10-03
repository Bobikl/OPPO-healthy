package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.h92, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e\u0012\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016R#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\n\u0010 R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/h92;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "f", "()J", "startTime", "b", "Z", b2n.g, "()Z", "isRecordEffective", "c", "I", "()I", "consume", "d", "efficiency", MapSchema.FIELD_NAME_ENTRY, b2n.f, "totalDuration", "lowHrPercent", "Lkotlin/Pair;", "Lkotlin/Pair;", "()Lkotlin/Pair;", "bestFatLossZone", "capacity", "<init>", "(JZIIIILkotlin/Pair;I)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BurnFatRecordDataBean {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isRecordEffective;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int consume;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int efficiency;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final int totalDuration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final int lowHrPercent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final Pair<Integer, Integer> bestFatLossZone;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public final int capacity;

    public BurnFatRecordDataBean(long j2, boolean z, int i, int i2, int i3, int i4, @NotNull Pair<Integer, Integer> bestFatLossZone, int i5) {
        Intrinsics.checkNotNullParameter(bestFatLossZone, "bestFatLossZone");
        this.startTime = j2;
        this.isRecordEffective = z;
        this.consume = i;
        this.efficiency = i2;
        this.totalDuration = i3;
        this.lowHrPercent = i4;
        this.bestFatLossZone = bestFatLossZone;
        this.capacity = i5;
    }

    @NotNull
    public final Pair<Integer, Integer> a() {
        return this.bestFatLossZone;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getConsume() {
        return this.consume;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getEfficiency() {
        return this.efficiency;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getLowHrPercent() {
        return this.lowHrPercent;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BurnFatRecordDataBean)) {
            return false;
        }
        BurnFatRecordDataBean burnFatRecordDataBean = (BurnFatRecordDataBean) other;
        return this.startTime == burnFatRecordDataBean.startTime && this.isRecordEffective == burnFatRecordDataBean.isRecordEffective && this.consume == burnFatRecordDataBean.consume && this.efficiency == burnFatRecordDataBean.efficiency && this.totalDuration == burnFatRecordDataBean.totalDuration && this.lowHrPercent == burnFatRecordDataBean.lowHrPercent && Intrinsics.areEqual(this.bestFatLossZone, burnFatRecordDataBean.bestFatLossZone) && this.capacity == burnFatRecordDataBean.capacity;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getTotalDuration() {
        return this.totalDuration;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsRecordEffective() {
        return this.isRecordEffective;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.startTime) * 31;
        boolean z = this.isRecordEffective;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((iHashCode + r1) * 31) + Integer.hashCode(this.consume)) * 31) + Integer.hashCode(this.efficiency)) * 31) + Integer.hashCode(this.totalDuration)) * 31) + Integer.hashCode(this.lowHrPercent)) * 31) + this.bestFatLossZone.hashCode()) * 31) + Integer.hashCode(this.capacity);
    }

    @NotNull
    public String toString() {
        return "BurnFatRecordDataBean(startTime=" + this.startTime + ", isRecordEffective=" + this.isRecordEffective + ", consume=" + this.consume + ", efficiency=" + this.efficiency + ", totalDuration=" + this.totalDuration + ", lowHrPercent=" + this.lowHrPercent + ", bestFatLossZone=" + this.bestFatLossZone + ", capacity=" + this.capacity + ")";
    }
}
