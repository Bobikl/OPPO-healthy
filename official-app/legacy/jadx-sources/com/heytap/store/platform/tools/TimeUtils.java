package com.heytap.store.platform.tools;

import android.annotation.SuppressLint;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengineservice.db.table.datacollection.DataCollection;
import com.oplus.aiunit.vision.t13;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001<B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0005J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0005J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0005J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J \u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J(\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J \u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J\b\u0010\u001d\u001a\u00020\nH\u0002J\u001e\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J\u001e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J&\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J\u001e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J\u0016\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010 \u001a\u00020\u000eJ\u0006\u0010!\u001a\u00020\fJ\u0006\u0010\"\u001a\u00020\u0005J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0005H\u0007J(\u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J \u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J(\u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J \u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J(\u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J \u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J \u0010%\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0018J\u0018\u0010%\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J\u001e\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0018J\u001e\u0010&\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J&\u0010&\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0018J\u001e\u0010&\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0018J\u0016\u0010-\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0018J\u0016\u0010-\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J\u001e\u0010-\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0018J\u0016\u0010-\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0018J\u0012\u0010.\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\fJ\u0010\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0005J\u0018\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010/\u001a\u00020\u00182\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u00100\u001a\u00020\u0018J\u000e\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018J\u0016\u0010/\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\f2\u0006\u00100\u001a\u00020\u0018J\u001e\u0010/\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0018J\u0016\u0010/\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0018J\b\u00101\u001a\u00020\fH\u0002J\u0006\u00102\u001a\u000203J\u000e\u00102\u001a\u0002032\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u00102\u001a\u0002032\u0006\u0010\u0014\u001a\u00020\fJ\u000e\u00102\u001a\u0002032\u0006\u0010\u0015\u001a\u00020\u0005J\u0016\u00102\u001a\u0002032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u00104\u001a\u000203J\u000e\u00104\u001a\u0002032\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u00104\u001a\u0002032\u0006\u0010\u0014\u001a\u00020\fJ\u000e\u00104\u001a\u0002032\u0006\u0010\u0015\u001a\u00020\u0005J\u0016\u00104\u001a\u0002032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u00105\u001a\u0002032\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u00105\u001a\u0002032\u0006\u0010\u0014\u001a\u00020\fJ\u000e\u00105\u001a\u0002032\u0006\u0010\u0015\u001a\u00020\u0005J\u0016\u00105\u001a\u0002032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u00106\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fJ\u0010\u00107\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\fJ\u0016\u00107\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u00107\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005J\u0018\u00108\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002J\u0010\u00109\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0005J\u0018\u00109\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u00109\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010:\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0005J\u0016\u0010:\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010:\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u0018\u0010;\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/heytap/store/platform/tools/TimeUtils;", "", "()V", "CHINESE_ZODIAC", "", "", "[Ljava/lang/String;", "SDF_THREAD_LOCAL", "Ljava/lang/ThreadLocal;", "", "Ljava/text/SimpleDateFormat;", "date2Millis", "", "date", "Ljava/util/Date;", "date2String", "format", "Ljava/text/DateFormat;", "pattern", "getChineseWeek", "millis", ClickApiEntity.TIME, "getChineseZodiac", "year", "", "getDate", "timeSpan", "unit", "getDateByNow", "getDefaultFormat", "getMillis", "getMillisByNow", "getNowDate", "getNowMills", "getNowString", "getSafeDateFormat", "getString", "getStringByNow", "getTimeSpan", "date1", "date2", "millis1", "millis2", "time1", "time2", "getTimeSpanByNow", "getUSWeek", "getValueByCalendarField", DataCollection.FIELD, "getWeeOfToday", "isAm", "", "isPm", "isToday", "millis2Date", "millis2String", "millis2TimeSpan", "string2Date", "string2Millis", "timeSpan2Millis", "TimeConstants", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class TimeUtils {
    public static final TimeUtils INSTANCE = new TimeUtils();
    private static final ThreadLocal<Map<String, SimpleDateFormat>> SDF_THREAD_LOCAL = new ThreadLocal<Map<String, ? extends SimpleDateFormat>>() { // from class: com.heytap.store.platform.tools.TimeUtils$SDF_THREAD_LOCAL$1
        @Override // java.lang.ThreadLocal
        @NotNull
        public Map<String, ? extends SimpleDateFormat> initialValue() {
            return new HashMap();
        }
    };
    private static final String[] CHINESE_ZODIAC = {"猴", "鸡", "狗", "猪", "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊"};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/heytap/store/platform/tools/TimeUtils$TimeConstants;", "", "()V", t13.DAY, "", "HOUR", "MIN", "MSEC", "SEC", "Unit", "utils_release"}, k = 1, mv = {1, 4, 0})
    public static final class TimeConstants {
        public static final int DAY = 86400000;
        public static final int HOUR = 3600000;
        public static final TimeConstants INSTANCE = new TimeConstants();
        public static final int MIN = 60000;
        public static final int MSEC = 1;
        public static final int SEC = 1000;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/heytap/store/platform/tools/TimeUtils$TimeConstants$Unit;", "", "utils_release"}, k = 1, mv = {1, 4, 0})
        @Retention(RetentionPolicy.SOURCE)
        @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface Unit {
        }

        private TimeConstants() {
        }
    }

    private TimeUtils() {
    }

    private final SimpleDateFormat getDefaultFormat() {
        return getSafeDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    private final long getWeeOfToday() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "Calendar.getInstance()");
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final long millis2TimeSpan(long millis, int unit) {
        return millis / ((long) unit);
    }

    private final long timeSpan2Millis(long timeSpan, int unit) {
        return timeSpan * ((long) unit);
    }

    public final long date2Millis(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return date.getTime();
    }

    @Nullable
    public final String date2String(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return date2String(date, getDefaultFormat());
    }

    @Nullable
    public final String getChineseWeek(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return getChineseWeek(string2Date(time, getDefaultFormat()));
    }

    @Nullable
    public final String getChineseZodiac(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return getChineseZodiac(string2Date(time, getDefaultFormat()));
    }

    @Nullable
    public final Date getDate(long millis, long timeSpan, int unit) {
        return millis2Date(millis + timeSpan2Millis(timeSpan, unit));
    }

    @Nullable
    public final Date getDateByNow(long timeSpan, int unit) {
        return getDate(getNowMills(), timeSpan, unit);
    }

    public final long getMillis(long millis, long timeSpan, int unit) {
        return millis + timeSpan2Millis(timeSpan, unit);
    }

    public final long getMillisByNow(long timeSpan, int unit) {
        return getMillis(getNowMills(), timeSpan, unit);
    }

    @NotNull
    public final Date getNowDate() {
        return new Date();
    }

    public final long getNowMills() {
        return System.currentTimeMillis();
    }

    @NotNull
    public final String getNowString() {
        return millis2String(System.currentTimeMillis(), getDefaultFormat());
    }

    @SuppressLint({"SimpleDateFormat"})
    @NotNull
    public final SimpleDateFormat getSafeDateFormat(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Map<String, SimpleDateFormat> map = SDF_THREAD_LOCAL.get();
        if (map == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, java.text.SimpleDateFormat>");
        }
        Map mapAsMutableMap = TypeIntrinsics.asMutableMap(map);
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) mapAsMutableMap.get(pattern);
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern);
        mapAsMutableMap.put(pattern, simpleDateFormat2);
        return simpleDateFormat2;
    }

    @Nullable
    public final String getString(long millis, long timeSpan, int unit) {
        return getString(millis, getDefaultFormat(), timeSpan, unit);
    }

    @Nullable
    public final String getStringByNow(long timeSpan, int unit) {
        return getStringByNow(timeSpan, getDefaultFormat(), unit);
    }

    public final long getTimeSpan(@NotNull String time1, @NotNull String time2, int unit) {
        Intrinsics.checkNotNullParameter(time1, "time1");
        Intrinsics.checkNotNullParameter(time2, "time2");
        return getTimeSpan(time1, time2, getDefaultFormat(), unit);
    }

    public final long getTimeSpanByNow(@NotNull String time, int unit) {
        Intrinsics.checkNotNullParameter(time, "time");
        return getTimeSpan(time, getNowString(), getDefaultFormat(), unit);
    }

    @Nullable
    public final String getUSWeek(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return getUSWeek(string2Date(time, getDefaultFormat()));
    }

    public final int getValueByCalendarField(int field) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "Calendar.getInstance()");
        return calendar.get(field);
    }

    public final boolean isAm() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "Calendar.getInstance()");
        return calendar.get(9) == 0;
    }

    public final boolean isPm() {
        return !isAm();
    }

    public final boolean isToday(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return isToday(string2Millis(time, getDefaultFormat()));
    }

    @NotNull
    public final Date millis2Date(long millis) {
        return new Date(millis);
    }

    @Nullable
    public final String millis2String(long millis) {
        return millis2String(millis, getDefaultFormat());
    }

    @Nullable
    public final Date string2Date(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return string2Date(time, getDefaultFormat());
    }

    public final long string2Millis(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return string2Millis(time, getDefaultFormat());
    }

    @Nullable
    public final String date2String(@NotNull Date date, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return getSafeDateFormat(pattern).format(date);
    }

    @Nullable
    public final String getChineseWeek(@NotNull String time, @NotNull DateFormat format) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format, "format");
        return getChineseWeek(string2Date(time, format));
    }

    @Nullable
    public final String getChineseZodiac(@NotNull String time, @NotNull DateFormat format) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format, "format");
        return getChineseZodiac(string2Date(time, format));
    }

    @Nullable
    public final Date getDate(@NotNull String time, long timeSpan, int unit) {
        Intrinsics.checkNotNullParameter(time, "time");
        return getDate(time, getDefaultFormat(), timeSpan, unit);
    }

    public final long getMillis(@NotNull String time, long timeSpan, int unit) {
        Intrinsics.checkNotNullParameter(time, "time");
        return getMillis(time, getDefaultFormat(), timeSpan, unit);
    }

    @NotNull
    public final String getNowString(@NotNull DateFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return millis2String(System.currentTimeMillis(), format);
    }

    @Nullable
    public final String getString(long millis, @NotNull DateFormat format, long timeSpan, int unit) {
        Intrinsics.checkNotNullParameter(format, "format");
        return millis2String(millis + timeSpan2Millis(timeSpan, unit), format);
    }

    @Nullable
    public final String getStringByNow(long timeSpan, @NotNull DateFormat format, int unit) {
        Intrinsics.checkNotNullParameter(format, "format");
        return getString(getNowMills(), format, timeSpan, unit);
    }

    public final long getTimeSpan(@NotNull String time1, @NotNull String time2, @NotNull DateFormat format, int unit) {
        Intrinsics.checkNotNullParameter(time1, "time1");
        Intrinsics.checkNotNullParameter(time2, "time2");
        Intrinsics.checkNotNullParameter(format, "format");
        return millis2TimeSpan(string2Millis(time1, format) - string2Millis(time2, format), unit);
    }

    public final long getTimeSpanByNow(@NotNull String time, @NotNull DateFormat format, int unit) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format, "format");
        return getTimeSpan(time, getNowString(format), format, unit);
    }

    @Nullable
    public final String getUSWeek(@NotNull String time, @NotNull DateFormat format) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format, "format");
        return getUSWeek(string2Date(time, format));
    }

    public final boolean isPm(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return !isAm(time);
    }

    public final boolean isToday(@NotNull String time, @NotNull DateFormat format) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format, "format");
        return isToday(string2Millis(time, format));
    }

    @Nullable
    public final String millis2String(long millis, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return millis2String(millis, getSafeDateFormat(pattern));
    }

    @Nullable
    public final Date string2Date(@NotNull String time, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return string2Date(time, getSafeDateFormat(pattern));
    }

    public final long string2Millis(@NotNull String time, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return string2Millis(time, getSafeDateFormat(pattern));
    }

    @Nullable
    public final String date2String(@NotNull Date date, @NotNull DateFormat format) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(format, "format");
        return format.format(date);
    }

    @Nullable
    public final String getChineseWeek(@Nullable Date date) {
        return date == null ? "" : new SimpleDateFormat(ExifInterface.LONGITUDE_EAST, Locale.CHINA).format(date);
    }

    @Nullable
    public final String getChineseZodiac(@Nullable Date date) {
        if (date == null) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "Calendar.getInstance()");
        calendar.setTime(date);
        return CHINESE_ZODIAC[calendar.get(1) % 12];
    }

    @Nullable
    public final Date getDate(@NotNull String time, @NotNull DateFormat format, long timeSpan, int unit) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format, "format");
        return millis2Date(string2Millis(time, format) + timeSpan2Millis(timeSpan, unit));
    }

    public final long getMillis(@NotNull String time, @NotNull DateFormat format, long timeSpan, int unit) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format, "format");
        return string2Millis(time, format) + timeSpan2Millis(timeSpan, unit);
    }

    @Nullable
    public final String getString(@NotNull String time, long timeSpan, int unit) {
        Intrinsics.checkNotNullParameter(time, "time");
        return getString(time, getDefaultFormat(), timeSpan, unit);
    }

    public final long getTimeSpan(@NotNull Date date1, @NotNull Date date2, int unit) {
        Intrinsics.checkNotNullParameter(date1, "date1");
        Intrinsics.checkNotNullParameter(date2, "date2");
        return millis2TimeSpan(date2Millis(date1) - date2Millis(date2), unit);
    }

    public final long getTimeSpanByNow(@NotNull Date date, int unit) {
        Intrinsics.checkNotNullParameter(date, "date");
        return getTimeSpan(date, new Date(), unit);
    }

    @Nullable
    public final String getUSWeek(@Nullable Date date) {
        return date == null ? "" : new SimpleDateFormat("EEEE", Locale.US).format(date);
    }

    public final int getValueByCalendarField(@NotNull String time, int field) {
        Intrinsics.checkNotNullParameter(time, "time");
        return getValueByCalendarField(string2Date(time, getDefaultFormat()), field);
    }

    public final boolean isAm(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return getValueByCalendarField(time, getDefaultFormat(), 9) == 0;
    }

    public final boolean isPm(@NotNull String time, @NotNull DateFormat format) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format, "format");
        return !isAm(time, format);
    }

    public final boolean isToday(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return isToday(date.getTime());
    }

    @NotNull
    public final String millis2String(long millis, @NotNull DateFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.format(new Date(millis));
        Intrinsics.checkNotNullExpressionValue(str, "format.format(Date(millis))");
        return str;
    }

    @Nullable
    public final Date string2Date(@NotNull String time, @NotNull DateFormat format) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format, "format");
        try {
            return format.parse(time);
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final long string2Millis(@NotNull String time, @NotNull DateFormat format) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format, "format");
        try {
            Date date = format.parse(time);
            if (date != null) {
                return date.getTime();
            }
            return -1L;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return -1L;
        }
    }

    @Nullable
    public final String getChineseWeek(long millis) {
        return getChineseWeek(new Date(millis));
    }

    @Nullable
    public final Date getDate(@NotNull Date date, long timeSpan, int unit) {
        Intrinsics.checkNotNullParameter(date, "date");
        return millis2Date(date2Millis(date) + timeSpan2Millis(timeSpan, unit));
    }

    public final long getMillis(@NotNull Date date, long timeSpan, int unit) {
        Intrinsics.checkNotNullParameter(date, "date");
        return date2Millis(date) + timeSpan2Millis(timeSpan, unit);
    }

    @Nullable
    public final String getString(@NotNull String time, @NotNull DateFormat format, long timeSpan, int unit) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format, "format");
        return millis2String(string2Millis(time, format) + timeSpan2Millis(timeSpan, unit), format);
    }

    public final long getTimeSpan(long millis1, long millis2, int unit) {
        return millis2TimeSpan(millis1 - millis2, unit);
    }

    public final long getTimeSpanByNow(long millis, int unit) {
        return getTimeSpan(millis, System.currentTimeMillis(), unit);
    }

    @Nullable
    public final String getUSWeek(long millis) {
        return getUSWeek(new Date(millis));
    }

    public final int getValueByCalendarField(@NotNull String time, @NotNull DateFormat format, int field) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format, "format");
        return getValueByCalendarField(string2Date(time, format), field);
    }

    public final boolean isAm(@NotNull String time, @NotNull DateFormat format) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(format, "format");
        return getValueByCalendarField(time, format, 9) == 0;
    }

    public final boolean isPm(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return !isAm(date);
    }

    public final boolean isToday(long millis) {
        long weeOfToday = getWeeOfToday();
        return millis >= weeOfToday && millis < weeOfToday + ((long) 86400000);
    }

    @Nullable
    public final String getString(@NotNull Date date, long timeSpan, int unit) {
        Intrinsics.checkNotNullParameter(date, "date");
        return getString(date, getDefaultFormat(), timeSpan, unit);
    }

    public final int getValueByCalendarField(@Nullable Date date, int field) {
        if (date == null) {
            return -1;
        }
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "Calendar.getInstance()");
        calendar.setTime(date);
        return calendar.get(field);
    }

    public final boolean isAm(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return getValueByCalendarField(date, 9) == 0;
    }

    public final boolean isPm(long millis) {
        return !isAm(millis);
    }

    @Nullable
    public final String getChineseZodiac(long millis) {
        return getChineseZodiac(millis2Date(millis));
    }

    @Nullable
    public final String getString(@NotNull Date date, @NotNull DateFormat format, long timeSpan, int unit) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(format, "format");
        return millis2String(date2Millis(date) + timeSpan2Millis(timeSpan, unit), format);
    }

    public final boolean isAm(long millis) {
        return getValueByCalendarField(millis, 9) == 0;
    }

    @Nullable
    public final String getChineseZodiac(int year) {
        return CHINESE_ZODIAC[year % 12];
    }

    public final int getValueByCalendarField(long millis, int field) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "Calendar.getInstance()");
        calendar.setTimeInMillis(millis);
        return calendar.get(field);
    }
}
