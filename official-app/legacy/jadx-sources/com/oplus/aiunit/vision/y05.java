package com.oplus.aiunit.vision;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000+\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0007\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000\"\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\b\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b\"\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"", "Ljava/util/Date;", "a", "b", "", "MAX_DATE", "J", "com/oplus/aiunit/vision/y05$a", "Lcom/oplus/aiunit/vision/y05$a;", "STANDARD_DATE_FORMAT", "", "[Ljava/lang/String;", "BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS", "Ljava/text/DateFormat;", "c", "[Ljava/text/DateFormat;", "BROWSER_COMPATIBLE_DATE_FORMATS", "okhttp4_extension_release"}, k = 2, mv = {1, 4, 0})
public final class y05 {
    public static final long MAX_DATE = 253402300799999L;
    public static final a a = new a();
    public static final String[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DateFormat[] f18813c;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"com/oplus/aiunit/vision/y05$a", "Ljava/lang/ThreadLocal;", "Ljava/text/DateFormat;", "a", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(sqk.UTC);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        b = strArr;
        f18813c = new DateFormat[strArr.length];
    }

    @Nullable
    public static final Date a(@NotNull String toHttpDateOrNull) {
        Intrinsics.checkNotNullParameter(toHttpDateOrNull, "$this$toHttpDateOrNull");
        if (toHttpDateOrNull.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        DateFormat dateFormat = a.get();
        Date date = dateFormat != null ? dateFormat.parse(toHttpDateOrNull, parsePosition) : null;
        if (parsePosition.getIndex() == toHttpDateOrNull.length()) {
            return date;
        }
        String[] strArr = b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = f18813c;
                DateFormat simpleDateFormat = dateFormatArr[i];
                if (simpleDateFormat == null) {
                    simpleDateFormat = new SimpleDateFormat(b[i], Locale.US);
                    simpleDateFormat.setTimeZone(sqk.UTC);
                    dateFormatArr[i] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(toHttpDateOrNull, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
            }
            Unit unit = Unit.INSTANCE;
            return null;
        }
    }

    @NotNull
    public static final String b(@NotNull Date toHttpDateString) {
        String str;
        Intrinsics.checkNotNullParameter(toHttpDateString, "$this$toHttpDateString");
        DateFormat dateFormat = a.get();
        return (dateFormat == null || (str = dateFormat.format(toHttpDateString)) == null) ? "" : str;
    }
}
