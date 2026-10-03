package com.oppo.osec.signer.util;

import com.oplus.aiunit.vision.v05;
import com.oplus.aiunit.vision.w05;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes9.dex */
public enum JodaTime {
    ;

    private static final boolean expectedBehavior = checkExpectedBehavior();

    public static class a {
        public static final String a = a();

        public static String a() {
            try {
                JarFile jarFileJarFileOf = Classes.jarFileOf(DateTimeZone.class);
                if (jarFileJarFileOf == null) {
                    return null;
                }
                Attributes mainAttributes = jarFileJarFileOf.getManifest().getMainAttributes();
                String value = mainAttributes.getValue("Bundle-Name");
                String value2 = mainAttributes.getValue("Bundle-Version");
                if ("Joda-Time".equals(value) && value2 != null) {
                    return value2;
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    private static boolean checkAlternateIso8601DateFormat() throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, v05.TIME_ZONE_0));
        String str = simpleDateFormat.format(date);
        DateTimeFormatter dateTimeFormatter = w05.f18067c;
        String strPrint = dateTimeFormatter.print(date.getTime());
        if (str.equals(strPrint)) {
            return simpleDateFormat.parse(str).getTime() == dateTimeFormatter.parseDateTime(strPrint).getMillis();
        }
        return false;
    }

    private static boolean checkExpectedBehavior() {
        try {
            return checkTT0031561767() && checkFormatIso8601Date() && checkFormatRfc822Date() && checkAlternateIso8601DateFormat() && checkInvalidDate() && checkParseCompressedIso8601Date() && checkParseIso8601Date() && checkParseIso8601DateUsingAlternativeFormat() && checkParseRfc822Date();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean checkFormatIso8601Date() throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, v05.TIME_ZONE_0));
        String str = simpleDateFormat.format(date);
        String strPrint = w05.b.print(date.getTime());
        if (str.equals(strPrint)) {
            return simpleDateFormat.parse(str).equals(w05.a(strPrint));
        }
        return false;
    }

    private static boolean checkFormatRfc822Date() throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, v05.TIME_ZONE_0));
        String str = simpleDateFormat.format(date);
        DateTimeFormatter dateTimeFormatter = w05.d;
        String strPrint = dateTimeFormatter.print(date.getTime());
        if (str.equals(strPrint)) {
            return simpleDateFormat.parse(str).equals(new Date(dateTimeFormatter.parseMillis(strPrint)));
        }
        return false;
    }

    private static boolean checkInvalidDate() {
        try {
            w05.a("2014-03-06T14:28:58.000Z.000Z");
            return false;
        } catch (RuntimeException unused) {
            return true;
        }
    }

    private static boolean checkParseCompressedIso8601Date() throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, v05.TIME_ZONE_0));
        String str = simpleDateFormat.format(date);
        return simpleDateFormat.parse(str).equals(new Date(w05.f18068e.parseMillis(str)));
    }

    private static boolean checkParseIso8601Date() throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, v05.TIME_ZONE_0));
        String str = simpleDateFormat.format(date);
        if (str.equals(w05.b.print(date.getTime()))) {
            return simpleDateFormat.parse(str).equals(w05.a(str));
        }
        return false;
    }

    private static boolean checkParseIso8601DateUsingAlternativeFormat() throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, v05.TIME_ZONE_0));
        String str = simpleDateFormat.format(date);
        if (str.equals(w05.f18067c.print(date.getTime()))) {
            return simpleDateFormat.parse(str).equals(w05.c(str));
        }
        return false;
    }

    private static boolean checkParseRfc822Date() throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, v05.TIME_ZONE_0));
        String str = simpleDateFormat.format(date);
        return simpleDateFormat.parse(str).equals(new Date(w05.d.parseMillis(str)));
    }

    private static boolean checkTT0031561767() throws ParseException {
        DateTimeFormatter dateTimeFormatter = w05.d;
        return "Fri, 16 May 2014 23:56:46 GMT".equals(dateTimeFormatter.print(new Date(dateTimeFormatter.parseMillis("Fri, 16 May 2014 23:56:46 GMT")).getTime()));
    }

    public static String getVersion() {
        return a.a;
    }

    public static boolean hasExpectedBehavior() {
        return expectedBehavior;
    }
}
