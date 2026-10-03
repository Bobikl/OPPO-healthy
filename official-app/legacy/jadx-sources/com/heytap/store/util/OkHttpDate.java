package com.heytap.store.util;

import com.oplus.aiunit.vision.v05;
import com.oplus.aiunit.vision.y05;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\bR\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/heytap/store/util/OkHttpDate;", "", "()V", "BROWSER_COMPATIBLE_DATE_FORMATS", "", "Ljava/text/DateFormat;", "[Ljava/text/DateFormat;", "BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS", "", "[Ljava/lang/String;", "MAX_DATE", "", "getMAX_DATE", "()J", "STANDARD_DATE_FORMAT", "Ljava/lang/ThreadLocal;", "UTC", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "format", "value", "Ljava/util/Date;", "parse", "businessbase_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OkHttpDate {

    @NotNull
    private static DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS;

    @NotNull
    private static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;

    @NotNull
    public static final OkHttpDate INSTANCE = new OkHttpDate();
    private static final long MAX_DATE = y05.MAX_DATE;

    @NotNull
    private static final ThreadLocal<DateFormat> STANDARD_DATE_FORMAT = new ThreadLocal<DateFormat>() { // from class: com.heytap.store.util.OkHttpDate$STANDARD_DATE_FORMAT$1
        @Override // java.lang.ThreadLocal
        @NotNull
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(OkHttpDate.UTC);
            return simpleDateFormat;
        }
    };
    private static final TimeZone UTC = TimeZone.getTimeZone(v05.TIME_ZONE_0);

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = strArr;
        BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[strArr.length];
    }

    private OkHttpDate() {
    }

    @Nullable
    public final String format(@Nullable Date value) {
        DateFormat dateFormat = STANDARD_DATE_FORMAT.get();
        Intrinsics.checkNotNull(dateFormat);
        return dateFormat.format(value);
    }

    public final long getMAX_DATE() {
        return MAX_DATE;
    }

    @Nullable
    public final Date parse(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        DateFormat dateFormat = STANDARD_DATE_FORMAT.get();
        Intrinsics.checkNotNull(dateFormat);
        Date date = dateFormat.parse(value, parsePosition);
        if (parsePosition.getIndex() == value.length()) {
            return date;
        }
        String[] strArr = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat simpleDateFormat = BROWSER_COMPATIBLE_DATE_FORMATS[i];
                if (simpleDateFormat == null) {
                    simpleDateFormat = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i], Locale.US);
                    simpleDateFormat.setTimeZone(UTC);
                    BROWSER_COMPATIBLE_DATE_FORMATS[i] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(value, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
            }
            return null;
        }
    }
}
