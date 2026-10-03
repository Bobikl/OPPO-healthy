package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.base.R$string;
import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public final class fn9 {
    public static final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static fn9 f11435c;
    public Date a = new Date();

    public interface a {
        String a(Locale locale);
    }

    public static class b implements a {
        public Date a;

        public b(Date date) {
            this.a = date;
        }

        @Override // com.oplus.aiunit.vision.fn9.a
        public String a(Locale locale) {
            return DateFormat.getDateInstance(2, locale).format(this.a);
        }
    }

    public static fn9 a() {
        if (f11435c == null) {
            synchronized (b) {
                if (f11435c == null) {
                    f11435c = new fn9();
                }
            }
        }
        return f11435c;
    }

    @Deprecated
    public static String c(Context context, long j2) {
        String[][] strArr = {new String[]{"MONDAY", context.getString(R$string.lib_base_date_monday)}, new String[]{"TUESDAY", context.getString(R$string.lib_base_date_tuesday)}, new String[]{"WEDNESDAY", context.getString(R$string.lib_base_date_wednesday)}, new String[]{"THURSDAY", context.getString(R$string.lib_base_date_thursday)}, new String[]{"FRIDAY", context.getString(R$string.lib_base_date_friday)}, new String[]{"SATURDAY", context.getString(R$string.lib_base_date_saturday)}, new String[]{"SUNDAY", context.getString(R$string.lib_base_date_sunday)}};
        String strValueOf = String.valueOf(LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().getDayOfWeek());
        for (int i = 0; i < 7; i++) {
            if (strValueOf.equals(strArr[i][0])) {
                return strArr[i][1];
            }
        }
        return strValueOf;
    }

    public static boolean d(long j2, long j3) {
        if (Math.abs(j2 - j3) > 86400000) {
            return false;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().toEpochDay() - LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).toLocalDate().toEpochDay() == 0;
    }

    public static boolean e(long j2, long j3) {
        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).toLocalDate();
        return localDate.getYear() == localDate2.getYear() && localDate.getMonthValue() == localDate2.getMonthValue();
    }

    public static boolean f(long j2, long j3) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().getYear() == LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).toLocalDate().getYear();
    }

    public static String g(long j2, String str) {
        return android.text.format.DateFormat.format(android.text.format.DateFormat.getBestDateTimePattern(Locale.getDefault(), str), new Date(j2)).toString();
    }

    public final String b(a aVar, Context context) {
        return aVar.a(Locale.getDefault());
    }

    public String h(a aVar, Context context) {
        synchronized (b) {
            try {
                if (aVar == null || context == null) {
                    return "request or context is null";
                }
                return b(aVar, context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
