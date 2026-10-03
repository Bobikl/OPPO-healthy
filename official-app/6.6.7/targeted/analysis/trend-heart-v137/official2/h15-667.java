package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u001a\u001a\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0012\u0010\n\u001a\u00020\t*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004\u001a\n\u0010\u000b\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\f\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\u000e\u001a\u00020\t*\u00020\r\u001a\n\u0010\u000f\u001a\u00020\u0004*\u00020\t\u001a\n\u0010\u0010\u001a\u00020\r*\u00020\u0000\u001a\n\u0010\u0011\u001a\u00020\u0000*\u00020\t\u001a\n\u0010\u0012\u001a\u00020\r*\u00020\t\u001a\u001a\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u00000\u0000*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004\u001a\u001a\u0010\u0015\u001a\n \u0007*\u0004\u0018\u00010\u00000\u0000*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004\u001a\u0012\u0010\u0017\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\u0019\u001a\u00020\t*\u00020\t\u001a\n\u0010\u001a\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\u001b\u001a\u00020\t*\u00020\t\u001a\u0012\u0010\u001c\u001a\u00020\u0004*\u00020\t2\u0006\u0010\u0016\u001a\u00020\t\u001a\n\u0010\u001d\u001a\u00020\u0004*\u00020\u0000\u001a\u0012\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u00000\u0000*\u00020\u0000\u001a\u0012\u0010\u001f\u001a\n \u0007*\u0004\u0018\u00010\u00000\u0000*\u00020\u0000\u001a\u0012\u0010 \u001a\n \u0007*\u0004\u0018\u00010\u00000\u0000*\u00020\u0000\u001a\u0012\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000\u001a\u0012\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000\u001a\n\u0010#\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010$\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010%\u001a\u00020\t*\u00020\u0000\u001a\u001a\u0010)\u001a\u00020(*\u00020\u00002\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000\u001a\u001a\u0010*\u001a\u00020(*\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t\u001a\u001a\u0010-\u001a\u00020(*\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t\u001a\u0012\u0010.\u001a\u00020\u0004*\u00020\u00002\u0006\u0010'\u001a\u00020\u0000\u001a\u0012\u00100\u001a\n \u0007*\u0004\u0018\u00010/0/*\u00020\u0000\u001a\u0012\u00101\u001a\n \u0007*\u0004\u0018\u00010/0/*\u00020\t\u001a\u0012\u00102\u001a\n \u0007*\u0004\u0018\u00010/0/*\u00020\t\u001a\u0012\u00103\u001a\n \u0007*\u0004\u0018\u00010/0/*\u00020\t\u001a\u0012\u00104\u001a\n \u0007*\u0004\u0018\u00010/0/*\u00020\t\u001a\u0012\u00105\u001a\n \u0007*\u0004\u0018\u00010/0/*\u00020\t\u001a\u0012\u00106\u001a\n \u0007*\u0004\u0018\u00010/0/*\u00020\u0000\u001a\u0012\u00107\u001a\n \u0007*\u0004\u0018\u00010/0/*\u00020\t\u001a\u0012\u00108\u001a\n \u0007*\u0004\u0018\u00010/0/*\u00020\u0000\u001a\u0012\u00109\u001a\n \u0007*\u0004\u0018\u00010/0/*\u00020\u0000\u001a\u0012\u0010:\u001a\n \u0007*\u0004\u0018\u00010/0/*\u00020\u0000\u001a\u0012\u0010;\u001a\n \u0007*\u0004\u0018\u00010/0/*\u00020\t\u001a\n\u0010<\u001a\u00020(*\u00020\u0000\u001a\u0012\u0010=\u001a\u00020(*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000\u001a\n\u0010>\u001a\u00020(*\u00020\t\u001a\n\u0010?\u001a\u00020\u0004*\u00020\u0000¨\u0006@"}, d2 = {"Ljava/time/LocalDate;", "Lcom/oplus/aiunit/vision/gof;", "t", "J", "", acl.KEY_B, "dateRange", "kotlin.jvm.PlatformType", "c", "", "b", "H", "A", "Ljava/time/LocalDateTime;", "I", "G", UserInfo.SEX_FEMALE, "D", ExifInterface.LONGITUDE_EAST, "day", "v", "r", "date", MapSchema.FIELD_NAME_ENTRY, "x", "w", c7n.f, "f", "d", "K", "L", "s", "z", "q", LogFieldKey.PROCESS_NAME_KEY, c7n.g, "y", "i", s04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", LogFieldKey.MESSAGE_KEY, LogFieldKey.LEVEL_KEY, "startTime", "endTime", "n", "u", "", SecureGcmConstants.MESSAGE_KEY, "O", "Q", ExifInterface.LONGITUDE_WEST, "M", "a", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "U", "N", "S", ExifInterface.GPS_DIRECTION_TRUE, "R", MapSchema.FIELD_NAME_KEY, "o", "j", "C", "lib_base_release"}, k = 2, mv = {1, 8, 0})
public final class h15 {
    public static final long A(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return g15.INSTANCE.c(g15.j(localDate));
    }

    public static final int B(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return o15.i(H(localDate));
    }

    public static final int C(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return (localDate.getYear() * 10000) + (localDate.getMonthValue() * 100) + localDate.getDayOfMonth();
    }

    @NotNull
    public static final LocalDate D(long j2) {
        return g15.g(j2);
    }

    @NotNull
    public static final LocalDateTime E(long j2) {
        return g15.INSTANCE.h(j2);
    }

    @NotNull
    public static final LocalDateTime F(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return g15.INSTANCE.h(H(localDate));
    }

    public static final int G(long j2) {
        return (int) ((j2 / ((long) 1000)) / ((long) 60));
    }

    public static final long H(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return g15.j(localDate);
    }

    public static final long I(@NotNull LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        return g15.INSTANCE.k(localDateTime);
    }

    @NotNull
    public static final RelativeDateRange J(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        LocalDate curBefore6Day = localDate.minusDays(6L);
        LocalDate beforeEndDay = curBefore6Day.minusDays(1L);
        LocalDate beforeStartDay = beforeEndDay.minusDays(6L);
        Intrinsics.checkNotNullExpressionValue(beforeStartDay, "beforeStartDay");
        Intrinsics.checkNotNullExpressionValue(beforeEndDay, "beforeEndDay");
        Intrinsics.checkNotNullExpressionValue(curBefore6Day, "curBefore6Day");
        return new RelativeDateRange(beforeStartDay, beforeEndDay, curBefore6Day, localDate);
    }

    public static final int K(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.getDayOfWeek().getValue();
    }

    public static final LocalDate L(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.with((TemporalAdjuster) DayOfWeek.MONDAY).minusDays(1L);
    }

    public static final String M(long j2) {
        return lo9.g(j2, o15.DATE_FORMAT_HOUR);
    }

    public static final String N(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return lo9.g(H(localDate), "MMM");
    }

    public static final String O(long j2) {
        return lo9.g(j2, "MMMdd");
    }

    public static final String P(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return lo9.g(H(localDate), "MMMdd");
    }

    public static final String Q(long j2) {
        return lo9.g(j2, "MMM-dd HH:mm");
    }

    public static final String R(long j2) {
        return lo9.g(j2, "yyyy");
    }

    public static final String S(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return lo9.g(H(localDate), "yyyy");
    }

    public static final String T(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return lo9.g(H(localDate), o15.DATE_FORMAT_6);
    }

    public static final String U(long j2) {
        return lo9.g(j2, "yyyyMMMdd");
    }

    public static final String V(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return lo9.g(H(localDate), "yyyyMMMdd");
    }

    public static final String W(long j2) {
        return lo9.g(j2, "yyyy-MMM-dd HH:mm");
    }

    public static final String a(long j2) {
        return lo9.g(j2, "M/d");
    }

    public static final long b(long j2, int i) {
        LocalDate localDatePlusDays = D(j2).plusDays(((long) i) - 1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "this.toLocalDate().plusD…s(dateRange.toLong() - 1)");
        return H(localDatePlusDays);
    }

    public static final LocalDate c(@NotNull LocalDate localDate, int i) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.plusDays(((long) i) - 1);
    }

    public static final int d(long j2, long j3) {
        return e(D(j2), D(j3));
    }

    public static final int e(@NotNull LocalDate localDate, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(date, "date");
        return g15.INSTANCE.a(localDate, date);
    }

    public static final long f(long j2) {
        return g15.INSTANCE.c(j2);
    }

    public static final long g(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return g15.INSTANCE.c(H(localDate));
    }

    @NotNull
    public static final LocalDate h(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return g15.INSTANCE.f(localDate);
    }

    public static final long i(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return g15.INSTANCE.i(localDate);
    }

    public static final boolean j(long j2) {
        return D(j2).getYear() == LocalDate.now().getYear();
    }

    public static final boolean k(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.getYear() == LocalDate.now().getYear();
    }

    public static final boolean l(long j2, long j3, long j4) {
        return m(D(j2), D(j3), D(j4));
    }

    public static final boolean m(@NotNull LocalDate localDate, @NotNull LocalDate startDate, @NotNull LocalDate endDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        return g15.INSTANCE.l(startDate, endDate, localDate);
    }

    public static final boolean n(long j2, long j3, long j4) {
        return j3 <= j2 && j2 <= j4;
    }

    public static final boolean o(@NotNull LocalDate localDate, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(date, "date");
        return localDate.getYear() == date.getYear() && localDate.getMonthValue() == date.getMonthValue();
    }

    @NotNull
    public static final LocalDate p(@NotNull LocalDate localDate, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(date, "date");
        return (LocalDate) RangesKt___RangesKt.coerceAtLeast(localDate, date);
    }

    @NotNull
    public static final LocalDate q(@NotNull LocalDate localDate, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(date, "date");
        return (LocalDate) RangesKt___RangesKt.coerceAtMost(localDate, date);
    }

    public static final LocalDate r(long j2, int i) {
        return D(j2).minusDays(i);
    }

    public static final LocalDate s(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.with((TemporalAdjuster) DayOfWeek.MONDAY);
    }

    @NotNull
    public static final RelativeDateRange t(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        LocalDate curBefore30Day = localDate.minusDays(30L);
        LocalDate beforeEndDay = curBefore30Day.minusDays(1L);
        LocalDate beforeStartDay = beforeEndDay.minusDays(30L);
        if (curBefore30Day.getDayOfMonth() == 1) {
            Intrinsics.checkNotNullExpressionValue(beforeEndDay, "beforeEndDay");
            LocalDate localDateY = y(beforeEndDay);
            Intrinsics.checkNotNullExpressionValue(curBefore30Day, "curBefore30Day");
            return new RelativeDateRange(localDateY, beforeEndDay, curBefore30Day, h(curBefore30Day));
        }
        Intrinsics.checkNotNullExpressionValue(beforeStartDay, "beforeStartDay");
        Intrinsics.checkNotNullExpressionValue(beforeEndDay, "beforeEndDay");
        Intrinsics.checkNotNullExpressionValue(curBefore30Day, "curBefore30Day");
        return new RelativeDateRange(beforeStartDay, beforeEndDay, curBefore30Day, localDate);
    }

    public static final int u(@NotNull LocalDate localDate, @NotNull LocalDate endDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        return g15.INSTANCE.b(localDate, endDate);
    }

    public static final LocalDate v(long j2, int i) {
        return D(j2).plusDays(i);
    }

    public static final long w(long j2) {
        return g15.INSTANCE.d(j2);
    }

    public static final long x(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return g15.INSTANCE.d(H(localDate));
    }

    @NotNull
    public static final LocalDate y(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return g15.INSTANCE.e(localDate);
    }

    public static final LocalDate z(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.with((TemporalAdjuster) DayOfWeek.SUNDAY);
    }
}