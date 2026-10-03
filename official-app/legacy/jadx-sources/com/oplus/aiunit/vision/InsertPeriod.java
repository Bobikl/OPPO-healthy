package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.p9a, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/p9a;", "", "Ljava/time/LocalDate;", "a", "b", "", "c", "", "toString", "", "hashCode", "other", "equals", "Ljava/time/LocalDate;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/time/LocalDate;", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "d", "endDate", "Z", "f", "()Z", "isPeriod", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Z)V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class InsertPeriod {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final LocalDate startDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final LocalDate endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isPeriod;

    public InsertPeriod(@NotNull LocalDate startDate, @NotNull LocalDate endDate, boolean z) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.startDate = startDate;
        this.endDate = endDate;
        this.isPeriod = z;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsPeriod() {
        return this.isPeriod;
    }

    @NotNull
    public final LocalDate d() {
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
        if (!(other instanceof InsertPeriod)) {
            return false;
        }
        InsertPeriod insertPeriod = (InsertPeriod) other;
        return Intrinsics.areEqual(this.startDate, insertPeriod.startDate) && Intrinsics.areEqual(this.endDate, insertPeriod.endDate) && this.isPeriod == insertPeriod.isPeriod;
    }

    public final boolean f() {
        return this.isPeriod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((this.startDate.hashCode() * 31) + this.endDate.hashCode()) * 31;
        boolean z = this.isPeriod;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    @NotNull
    public String toString() {
        return "InsertPeriod(startDate=" + this.startDate + ", endDate=" + this.endDate + ", isPeriod=" + this.isPeriod + ")";
    }
}
