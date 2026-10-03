package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ppl, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/ppl;", "", "Ljava/time/LocalDate;", "a", "b", "c", "d", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/time/LocalDate;", "getBeforeStartDate", "()Ljava/time/LocalDate;", "beforeStartDate", "getBeforeEndDate", "beforeEndDate", MapSchema.FIELD_NAME_ENTRY, f04.JSON_KEY_DIGITAL_KEY_START_TIME, "getEndDate", "endDate", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "step_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WeekPair {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final LocalDate beforeStartDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final LocalDate beforeEndDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final LocalDate startDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final LocalDate endDate;

    public WeekPair(@NotNull LocalDate beforeStartDate, @NotNull LocalDate beforeEndDate, @NotNull LocalDate startDate, @NotNull LocalDate endDate) {
        Intrinsics.checkNotNullParameter(beforeStartDate, "beforeStartDate");
        Intrinsics.checkNotNullParameter(beforeEndDate, "beforeEndDate");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.beforeStartDate = beforeStartDate;
        this.beforeEndDate = beforeEndDate;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getBeforeStartDate() {
        return this.beforeStartDate;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getBeforeEndDate() {
        return this.beforeEndDate;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final LocalDate e() {
        return this.startDate;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeekPair)) {
            return false;
        }
        WeekPair weekPair = (WeekPair) other;
        return Intrinsics.areEqual(this.beforeStartDate, weekPair.beforeStartDate) && Intrinsics.areEqual(this.beforeEndDate, weekPair.beforeEndDate) && Intrinsics.areEqual(this.startDate, weekPair.startDate) && Intrinsics.areEqual(this.endDate, weekPair.endDate);
    }

    public int hashCode() {
        return (((((this.beforeStartDate.hashCode() * 31) + this.beforeEndDate.hashCode()) * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode();
    }

    @NotNull
    public String toString() {
        return "WeekPair(beforeStartDate=" + this.beforeStartDate + ", beforeEndDate=" + this.beforeEndDate + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
    }
}
