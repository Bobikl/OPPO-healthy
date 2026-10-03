package com.oplus.aiunit.vision;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class zw9 {
    public static final TimeZone a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c2) {
        return i < str.length() && str.charAt(i) == c2;
    }

    public static String b(Date date) {
        return c(date, false, a);
    }

    @Deprecated
    public static String c(Date date, boolean z, TimeZone timeZone) {
        return d(date, z, timeZone, Locale.US);
    }

    public static String d(Date date, boolean z, TimeZone timeZone, Locale locale) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(30);
        sb.append(String.format("%04d-%02d-%02dT%02d:%02d:%02d", Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13))));
        if (z) {
            sb.append(String.format(".%03d", Integer.valueOf(gregorianCalendar.get(14))));
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            Object[] objArr = new Object[3];
            objArr[0] = Character.valueOf(offset < 0 ? Soundex.SILENT_MARKER : '+');
            objArr[1] = Integer.valueOf(iAbs);
            objArr[2] = Integer.valueOf(iAbs2);
            sb.append(String.format("%c%02d:%02d", objArr));
        } else {
            sb.append(rnb.MATRIX_TYPE_ZERO);
        }
        return sb.toString();
    }

    public static int e(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d2 A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:3:0x0007, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:17:0x0053, B:19:0x0063, B:20:0x0065, B:22:0x0071, B:23:0x0073, B:25:0x0079, B:29:0x0083, B:34:0x0093, B:36:0x009b, B:47:0x00cc, B:49:0x00d2, B:51:0x00d8, B:71:0x016d, B:55:0x00e2, B:56:0x00fd, B:57:0x00fe, B:59:0x010f, B:62:0x0118, B:64:0x0137, B:67:0x0146, B:68:0x0168, B:70:0x016b, B:73:0x019e, B:74:0x01a5, B:40:0x00b3, B:41:0x00b6), top: B:83:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8 A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:3:0x0007, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:17:0x0053, B:19:0x0063, B:20:0x0065, B:22:0x0071, B:23:0x0073, B:25:0x0079, B:29:0x0083, B:34:0x0093, B:36:0x009b, B:47:0x00cc, B:49:0x00d2, B:51:0x00d8, B:71:0x016d, B:55:0x00e2, B:56:0x00fd, B:57:0x00fe, B:59:0x010f, B:62:0x0118, B:64:0x0137, B:67:0x0146, B:68:0x0168, B:70:0x016b, B:73:0x019e, B:74:0x01a5, B:40:0x00b3, B:41:0x00b6), top: B:83:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x016b A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:3:0x0007, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:17:0x0053, B:19:0x0063, B:20:0x0065, B:22:0x0071, B:23:0x0073, B:25:0x0079, B:29:0x0083, B:34:0x0093, B:36:0x009b, B:47:0x00cc, B:49:0x00d2, B:51:0x00d8, B:71:0x016d, B:55:0x00e2, B:56:0x00fd, B:57:0x00fe, B:59:0x010f, B:62:0x0118, B:64:0x0137, B:67:0x0146, B:68:0x0168, B:70:0x016b, B:73:0x019e, B:74:0x01a5, B:40:0x00b3, B:41:0x00b6), top: B:83:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x019e A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:3:0x0007, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:17:0x0053, B:19:0x0063, B:20:0x0065, B:22:0x0071, B:23:0x0073, B:25:0x0079, B:29:0x0083, B:34:0x0093, B:36:0x009b, B:47:0x00cc, B:49:0x00d2, B:51:0x00d8, B:71:0x016d, B:55:0x00e2, B:56:0x00fd, B:57:0x00fe, B:59:0x010f, B:62:0x0118, B:64:0x0137, B:67:0x0146, B:68:0x0168, B:70:0x016b, B:73:0x019e, B:74:0x01a5, B:40:0x00b3, B:41:0x00b6), top: B:83:0x0007 }] */
    public static Date f(String str, ParsePosition parsePosition) throws ParseException {
        int i;
        int i2;
        int i3;
        int iG;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        Objects.requireNonNull(str);
        try {
            int index = parsePosition.getIndex();
            int i4 = index + 4;
            int iG2 = g(str, index, i4);
            if (a(str, i4, Soundex.SILENT_MARKER)) {
                i4++;
            }
            int i5 = i4 + 2;
            int iG3 = g(str, i4, i5);
            if (a(str, i5, Soundex.SILENT_MARKER)) {
                i5++;
            }
            int i6 = i5 + 2;
            int iG4 = g(str, i5, i6);
            boolean zA = a(str, i6, 'T');
            if (!zA && str.length() <= i6) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iG2, iG3 - 1, iG4);
                parsePosition.setIndex(i6);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i7 = i6 + 1;
                int i8 = i7 + 2;
                int iG5 = g(str, i7, i8);
                if (a(str, i8, ':')) {
                    i8++;
                }
                int i9 = i8 + 2;
                int iG6 = g(str, i8, i9);
                if (a(str, i9, ':')) {
                    i9++;
                }
                if (str.length() <= i9 || (cCharAt2 = str.charAt(i9)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i2 = iG6;
                    i3 = 0;
                    i = iG5;
                    i6 = i9;
                } else {
                    int i10 = i9 + 2;
                    iG = g(str, i9, i10);
                    if (iG > 59 && iG < 63) {
                        iG = 59;
                    }
                    if (a(str, i10, '.')) {
                        int i11 = i10 + 1;
                        int iE = e(str, i11 + 1);
                        int iMin = Math.min(iE, i11 + 3);
                        int iG7 = g(str, i11, iMin);
                        int i12 = iMin - i11;
                        if (i12 == 1) {
                            iG7 *= 100;
                        } else if (i12 == 2) {
                            iG7 *= 10;
                        }
                        i2 = iG6;
                        i3 = iG7;
                        i = iG5;
                        i6 = iE;
                    } else {
                        i2 = iG6;
                        i = iG5;
                        i6 = i10;
                        i3 = 0;
                    }
                }
                if (str.length() > i6) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i6);
                if (cCharAt == 'Z') {
                    timeZone = a;
                    length = i6 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i6);
                    length = i6 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = a;
                    } else {
                        String str2 = v05.TIME_ZONE_0 + strSubstring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str2);
                        String id = timeZone2.getID();
                        if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iG2);
                gregorianCalendar2.set(2, iG3 - 1);
                gregorianCalendar2.set(5, iG4);
                gregorianCalendar2.set(11, i);
                gregorianCalendar2.set(12, i2);
                gregorianCalendar2.set(13, iG);
                gregorianCalendar2.set(14, i3);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i = 0;
            i2 = 0;
            i3 = 0;
            iG = 0;
            if (str.length() > i6) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i6);
            if (cCharAt == 'Z') {
                timeZone = a;
                length = i6 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i6);
                length = i6 + strSubstring.length();
                if ("+0000".equals(strSubstring)) {
                    timeZone = a;
                } else {
                    timeZone = a;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iG2);
            gregorianCalendar3.set(2, iG3 - 1);
            gregorianCalendar3.set(5, iG4);
            gregorianCalendar3.set(11, i);
            gregorianCalendar3.set(12, i2);
            gregorianCalendar3.set(13, iG);
            gregorianCalendar3.set(14, i3);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (Exception e2) {
            String str3 = '\"' + str + '\"';
            String message = e2.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e2.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date " + str3 + ": " + message, parsePosition.getIndex());
            parseException.initCause(e2);
            throw parseException;
        }
    }

    public static int g(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}
