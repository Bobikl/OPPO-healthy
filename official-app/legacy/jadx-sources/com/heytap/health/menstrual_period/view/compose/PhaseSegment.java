package com.heytap.health.menstrual_period.view.compose;

import com.oplus.aiunit.vision.f04;
import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.heytap.health.menstrual_period.view.compose.b, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\n\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/menstrual_period/view/compose/b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/health/menstrual_period/view/compose/PhaseType;", "a", "Lcom/heytap/health/menstrual_period/view/compose/PhaseType;", "d", "()Lcom/heytap/health/menstrual_period/view/compose/PhaseType;", "type", "Ljava/time/LocalDate;", "b", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "I", "()I", "days", "<init>", "(Lcom/heytap/health/menstrual_period/view/compose/PhaseType;Ljava/time/LocalDate;Ljava/time/LocalDate;I)V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PhaseSegment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final PhaseType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final LocalDate startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final LocalDate endDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int days;

    public PhaseSegment(@NotNull PhaseType type, @NotNull LocalDate startDate, @NotNull LocalDate endDate, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.days = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDays() {
        return this.days;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final PhaseType getType() {
        return this.type;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhaseSegment)) {
            return false;
        }
        PhaseSegment phaseSegment = (PhaseSegment) other;
        return this.type == phaseSegment.type && Intrinsics.areEqual(this.startDate, phaseSegment.startDate) && Intrinsics.areEqual(this.endDate, phaseSegment.endDate) && this.days == phaseSegment.days;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode()) * 31) + Integer.hashCode(this.days);
    }

    @NotNull
    public String toString() {
        return "PhaseSegment(type=" + this.type + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", days=" + this.days + ")";
    }
}
