package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.o7m, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000e\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0018\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/o7m;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "f", "()I", "year", "b", "accumulatedDays", "c", "consecutiveDays", "d", "Z", "()Z", "showConsecutiveDays", "", "Ljava/time/LocalDate;", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/Set;", "()Ljava/util/Set;", "activeDates", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "<init>", "(IIIZLjava/util/Set;I)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class YearCalendarState {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int year;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int accumulatedDays;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int consecutiveDays;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean showConsecutiveDays;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Set<LocalDate> activeDates;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final int sportMode;

    public YearCalendarState() {
        this(0, 0, 0, false, null, 0, 63, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAccumulatedDays() {
        return this.accumulatedDays;
    }

    @NotNull
    public final Set<LocalDate> b() {
        return this.activeDates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getConsecutiveDays() {
        return this.consecutiveDays;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShowConsecutiveDays() {
        return this.showConsecutiveDays;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YearCalendarState)) {
            return false;
        }
        YearCalendarState yearCalendarState = (YearCalendarState) other;
        return this.year == yearCalendarState.year && this.accumulatedDays == yearCalendarState.accumulatedDays && this.consecutiveDays == yearCalendarState.consecutiveDays && this.showConsecutiveDays == yearCalendarState.showConsecutiveDays && Intrinsics.areEqual(this.activeDates, yearCalendarState.activeDates) && this.sportMode == yearCalendarState.sportMode;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.year) * 31) + Integer.hashCode(this.accumulatedDays)) * 31) + Integer.hashCode(this.consecutiveDays)) * 31;
        boolean z = this.showConsecutiveDays;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.activeDates.hashCode()) * 31) + Integer.hashCode(this.sportMode);
    }

    @NotNull
    public String toString() {
        return "YearCalendarState(year=" + this.year + ", accumulatedDays=" + this.accumulatedDays + ", consecutiveDays=" + this.consecutiveDays + ", showConsecutiveDays=" + this.showConsecutiveDays + ", activeDates=" + this.activeDates + ", sportMode=" + this.sportMode + ")";
    }

    public YearCalendarState(int i, int i2, int i3, boolean z, @NotNull Set<LocalDate> activeDates, int i4) {
        Intrinsics.checkNotNullParameter(activeDates, "activeDates");
        this.year = i;
        this.accumulatedDays = i2;
        this.consecutiveDays = i3;
        this.showConsecutiveDays = z;
        this.activeDates = activeDates;
        this.sportMode = i4;
    }

    public /* synthetic */ YearCalendarState(int i, int i2, int i3, boolean z, Set set, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? LocalDate.now().getYear() : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) == 0 ? i3 : 0, (i5 & 8) != 0 ? true : z, (i5 & 16) != 0 ? SetsKt__SetsKt.emptySet() : set, (i5 & 32) != 0 ? -2 : i4);
    }
}
