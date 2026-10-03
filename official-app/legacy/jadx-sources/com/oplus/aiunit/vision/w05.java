package com.oplus.aiunit.vision;

import com.oppo.osec.signer.util.JodaTime;
import java.util.Date;
import java.util.Locale;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.tz.FixedDateTimeZone;

/* JADX INFO: loaded from: classes9.dex */
public class w05 {
    public static final DateTimeZone a;
    public static final DateTimeFormatter b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DateTimeFormatter f18067c;
    public static final DateTimeFormatter d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DateTimeFormatter f18068e;

    static {
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(v05.TIME_ZONE_0, v05.TIME_ZONE_0, 0, 0);
        a = fixedDateTimeZone;
        b = ISODateTimeFormat.dateTime().withZone(fixedDateTimeZone);
        f18067c = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").withZone(fixedDateTimeZone);
        d = DateTimeFormat.forPattern("EEE, dd MMM yyyy HH:mm:ss 'GMT'").withLocale(Locale.US).withZone(fixedDateTimeZone);
        f18068e = DateTimeFormat.forPattern("yyyyMMdd'T'HHmmss'Z'").withZone(fixedDateTimeZone);
    }

    public static Date a(String str) {
        if (str.endsWith("+0000")) {
            str = str.substring(0, str.length() - 5).concat("Z");
        }
        String strD = d(str);
        try {
            if (strD.equals(str)) {
                return new Date(b.parseMillis(str));
            }
            DateTimeFormatter dateTimeFormatter = b;
            long millis = dateTimeFormatter.parseMillis(strD) + 31536000000L;
            return millis < 0 ? new Date(dateTimeFormatter.parseMillis(str)) : new Date(millis);
        } catch (IllegalArgumentException e2) {
            try {
                return new Date(f18067c.parseMillis(str));
            } catch (Exception unused) {
                throw e2;
            }
        }
    }

    public static <E extends RuntimeException> E b(E e2) {
        if (JodaTime.hasExpectedBehavior()) {
            return e2;
        }
        throw new IllegalStateException("Joda-time 2.2 or later version is required, but found version: " + JodaTime.getVersion(), e2);
    }

    public static Date c(String str) {
        try {
            return a(str);
        } catch (RuntimeException e2) {
            throw b(e2);
        }
    }

    public static String d(String str) {
        if (!str.startsWith("292278994-")) {
            return str;
        }
        return "292278993-" + str.substring(10);
    }
}
