package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.er2, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b=\u0010>JÑ\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00152\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0002HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b)\u00102R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010(R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b%\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b5\u0010/R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b9\u00108R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b.\u0010;\u001a\u0004\b3\u0010<R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\b0\u0010<R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u001f\u001a\u0004\b:\u0010!¨\u0006?"}, d2 = {"Lcom/oplus/aiunit/vision/er2;", "", "", "accumulatedDays", "totalCalories", "consecutiveDays", "", "showConsecutiveDays", "Ljava/time/YearMonth;", "yearMonth", "Ljava/time/LocalDate;", "today", "", "activeDays", "isWeekView", "", "weekDates", "activeDates", "selectedDate", "Lcom/oplus/aiunit/vision/yp2;", "selectedDayRecords", "", "dayRecordCounts", "dateRecordCounts", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "a", "", "toString", "hashCode", "other", "equals", "I", "c", "()I", "b", "n", "f", "d", "Z", MapSchema.FIELD_NAME_KEY, "()Z", MapSchema.FIELD_NAME_ENTRY, "Ljava/time/YearMonth;", LogFieldKey.PROCESS_NAME_KEY, "()Ljava/time/YearMonth;", "Ljava/time/LocalDate;", LogFieldKey.MESSAGE_KEY, "()Ljava/time/LocalDate;", b2n.f, "Ljava/util/Set;", "()Ljava/util/Set;", b2n.g, "q", "i", "Ljava/util/List;", "o", "()Ljava/util/List;", "j", LogFieldKey.LEVEL_KEY, "Ljava/util/Map;", "()Ljava/util/Map;", "<init>", "(IIIZLjava/time/YearMonth;Ljava/time/LocalDate;Ljava/util/Set;ZLjava/util/List;Ljava/util/Set;Ljava/time/LocalDate;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;I)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CalendarState {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int accumulatedDays;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int totalCalories;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int consecutiveDays;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean showConsecutiveDays;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final YearMonth yearMonth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final LocalDate today;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final Set<Integer> activeDays;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public final boolean isWeekView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<LocalDate> weekDates;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Set<LocalDate> activeDates;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    public final LocalDate selectedDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<CalendarDayRecord> selectedDayRecords;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<Integer, Integer> dayRecordCounts;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Map<LocalDate, Integer> dateRecordCounts;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    public final int sportMode;

    public CalendarState() {
        this(0, 0, 0, false, null, null, null, false, null, null, null, null, null, null, 0, 32767, null);
    }

    @NotNull
    public final CalendarState a(int accumulatedDays, int totalCalories, int consecutiveDays, boolean showConsecutiveDays, @NotNull YearMonth yearMonth, @NotNull LocalDate today, @NotNull Set<Integer> activeDays, boolean isWeekView, @NotNull List<LocalDate> weekDates, @NotNull Set<LocalDate> activeDates, @Nullable LocalDate selectedDate, @NotNull List<CalendarDayRecord> selectedDayRecords, @NotNull Map<Integer, Integer> dayRecordCounts, @NotNull Map<LocalDate, Integer> dateRecordCounts, int sportMode) {
        Intrinsics.checkNotNullParameter(yearMonth, "yearMonth");
        Intrinsics.checkNotNullParameter(today, "today");
        Intrinsics.checkNotNullParameter(activeDays, "activeDays");
        Intrinsics.checkNotNullParameter(weekDates, "weekDates");
        Intrinsics.checkNotNullParameter(activeDates, "activeDates");
        Intrinsics.checkNotNullParameter(selectedDayRecords, "selectedDayRecords");
        Intrinsics.checkNotNullParameter(dayRecordCounts, "dayRecordCounts");
        Intrinsics.checkNotNullParameter(dateRecordCounts, "dateRecordCounts");
        return new CalendarState(accumulatedDays, totalCalories, consecutiveDays, showConsecutiveDays, yearMonth, today, activeDays, isWeekView, weekDates, activeDates, selectedDate, selectedDayRecords, dayRecordCounts, dateRecordCounts, sportMode);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAccumulatedDays() {
        return this.accumulatedDays;
    }

    @NotNull
    public final Set<LocalDate> d() {
        return this.activeDates;
    }

    @NotNull
    public final Set<Integer> e() {
        return this.activeDays;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarState)) {
            return false;
        }
        CalendarState calendarState = (CalendarState) other;
        return this.accumulatedDays == calendarState.accumulatedDays && this.totalCalories == calendarState.totalCalories && this.consecutiveDays == calendarState.consecutiveDays && this.showConsecutiveDays == calendarState.showConsecutiveDays && Intrinsics.areEqual(this.yearMonth, calendarState.yearMonth) && Intrinsics.areEqual(this.today, calendarState.today) && Intrinsics.areEqual(this.activeDays, calendarState.activeDays) && this.isWeekView == calendarState.isWeekView && Intrinsics.areEqual(this.weekDates, calendarState.weekDates) && Intrinsics.areEqual(this.activeDates, calendarState.activeDates) && Intrinsics.areEqual(this.selectedDate, calendarState.selectedDate) && Intrinsics.areEqual(this.selectedDayRecords, calendarState.selectedDayRecords) && Intrinsics.areEqual(this.dayRecordCounts, calendarState.dayRecordCounts) && Intrinsics.areEqual(this.dateRecordCounts, calendarState.dateRecordCounts) && this.sportMode == calendarState.sportMode;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getConsecutiveDays() {
        return this.consecutiveDays;
    }

    @NotNull
    public final Map<LocalDate, Integer> g() {
        return this.dateRecordCounts;
    }

    @NotNull
    public final Map<Integer, Integer> h() {
        return this.dayRecordCounts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.accumulatedDays) * 31) + Integer.hashCode(this.totalCalories)) * 31) + Integer.hashCode(this.consecutiveDays)) * 31;
        boolean z = this.showConsecutiveDays;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((iHashCode + r1) * 31) + this.yearMonth.hashCode()) * 31) + this.today.hashCode()) * 31) + this.activeDays.hashCode()) * 31;
        boolean z2 = this.isWeekView;
        int iHashCode3 = (((((iHashCode2 + (z2 ? 1 : z2)) * 31) + this.weekDates.hashCode()) * 31) + this.activeDates.hashCode()) * 31;
        LocalDate localDate = this.selectedDate;
        return ((((((((iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.selectedDayRecords.hashCode()) * 31) + this.dayRecordCounts.hashCode()) * 31) + this.dateRecordCounts.hashCode()) * 31) + Integer.hashCode(this.sportMode);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    @NotNull
    public final List<CalendarDayRecord> j() {
        return this.selectedDayRecords;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowConsecutiveDays() {
        return this.showConsecutiveDays;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final LocalDate getToday() {
        return this.today;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getTotalCalories() {
        return this.totalCalories;
    }

    @NotNull
    public final List<LocalDate> o() {
        return this.weekDates;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final YearMonth getYearMonth() {
        return this.yearMonth;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsWeekView() {
        return this.isWeekView;
    }

    @NotNull
    public String toString() {
        return "CalendarState(accumulatedDays=" + this.accumulatedDays + ", totalCalories=" + this.totalCalories + ", consecutiveDays=" + this.consecutiveDays + ", showConsecutiveDays=" + this.showConsecutiveDays + ", yearMonth=" + this.yearMonth + ", today=" + this.today + ", activeDays=" + this.activeDays + ", isWeekView=" + this.isWeekView + ", weekDates=" + this.weekDates + ", activeDates=" + this.activeDates + ", selectedDate=" + this.selectedDate + ", selectedDayRecords=" + this.selectedDayRecords + ", dayRecordCounts=" + this.dayRecordCounts + ", dateRecordCounts=" + this.dateRecordCounts + ", sportMode=" + this.sportMode + ")";
    }

    public CalendarState(int i, int i2, int i3, boolean z, @NotNull YearMonth yearMonth, @NotNull LocalDate today, @NotNull Set<Integer> activeDays, boolean z2, @NotNull List<LocalDate> weekDates, @NotNull Set<LocalDate> activeDates, @Nullable LocalDate localDate, @NotNull List<CalendarDayRecord> selectedDayRecords, @NotNull Map<Integer, Integer> dayRecordCounts, @NotNull Map<LocalDate, Integer> dateRecordCounts, int i4) {
        Intrinsics.checkNotNullParameter(yearMonth, "yearMonth");
        Intrinsics.checkNotNullParameter(today, "today");
        Intrinsics.checkNotNullParameter(activeDays, "activeDays");
        Intrinsics.checkNotNullParameter(weekDates, "weekDates");
        Intrinsics.checkNotNullParameter(activeDates, "activeDates");
        Intrinsics.checkNotNullParameter(selectedDayRecords, "selectedDayRecords");
        Intrinsics.checkNotNullParameter(dayRecordCounts, "dayRecordCounts");
        Intrinsics.checkNotNullParameter(dateRecordCounts, "dateRecordCounts");
        this.accumulatedDays = i;
        this.totalCalories = i2;
        this.consecutiveDays = i3;
        this.showConsecutiveDays = z;
        this.yearMonth = yearMonth;
        this.today = today;
        this.activeDays = activeDays;
        this.isWeekView = z2;
        this.weekDates = weekDates;
        this.activeDates = activeDates;
        this.selectedDate = localDate;
        this.selectedDayRecords = selectedDayRecords;
        this.dayRecordCounts = dayRecordCounts;
        this.dateRecordCounts = dateRecordCounts;
        this.sportMode = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CalendarState(int i, int i2, int i3, boolean z, YearMonth yearMonth, LocalDate localDate, Set set, boolean z2, List list, Set set2, LocalDate localDate2, List list2, Map map, Map map2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        YearMonth yearMonthNow;
        LocalDate localDateNow;
        int i6 = (i5 & 1) != 0 ? 0 : i;
        int i7 = (i5 & 2) != 0 ? 0 : i2;
        int i8 = (i5 & 4) != 0 ? 0 : i3;
        boolean z3 = (i5 & 8) != 0 ? true : z;
        if ((i5 & 16) != 0) {
            yearMonthNow = YearMonth.now();
            Intrinsics.checkNotNullExpressionValue(yearMonthNow, "now()");
        } else {
            yearMonthNow = yearMonth;
        }
        if ((i5 & 32) != 0) {
            localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
        } else {
            localDateNow = localDate;
        }
        this(i6, i7, i8, z3, yearMonthNow, localDateNow, (i5 & 64) != 0 ? SetsKt__SetsKt.emptySet() : set, (i5 & 128) == 0 ? z2 : false, (i5 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i5 & 512) != 0 ? SetsKt__SetsKt.emptySet() : set2, (i5 & 1024) != 0 ? null : localDate2, (i5 & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i5 & 4096) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i5 & 8192) != 0 ? MapsKt__MapsKt.emptyMap() : map2, (i5 & 16384) != 0 ? -2 : i4);
    }
}
