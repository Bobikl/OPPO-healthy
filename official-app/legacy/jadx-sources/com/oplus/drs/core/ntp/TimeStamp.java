package com.oplus.drs.core.ntp;

import com.oplus.aiunit.vision.eui;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes6.dex */
class TimeStamp implements Serializable, Comparable<TimeStamp> {
    public static final String NTP_DATE_FORMAT = "EEE, MMM dd yyyy HH:mm:ss.SSS";
    protected static final long msb0baseTime = 2085978496000L;
    protected static final long msb1baseTime = -2208988800000L;
    private static final long serialVersionUID = 8139806907588338737L;
    private final long ntpTime;
    private DateFormat simpleFormatter = null;

    public TimeStamp(long j2) {
        this.ntpTime = j2;
    }

    private static void appendHexString(StringBuilder sb, long j2) {
        String hexString = Long.toHexString(j2);
        for (int length = hexString.length(); length <= 7; length++) {
            sb.append('0');
        }
        sb.append(hexString);
    }

    public static long decodeNtpHexString(String str) throws NumberFormatException {
        if (str == null) {
            throw new NumberFormatException("null");
        }
        int iIndexOf = str.indexOf(46);
        if (iIndexOf != -1) {
            return (Long.parseLong(str.substring(0, iIndexOf), 16) << 32) | Long.parseLong(str.substring(iIndexOf + 1), 16);
        }
        if (str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str, 16) << 32;
    }

    public static TimeStamp getCurrentTime() {
        return getNtpTime(System.currentTimeMillis());
    }

    public static TimeStamp getNtpTime(long j2) {
        return new TimeStamp(toNtpTime(j2));
    }

    public static TimeStamp parseNtpString(String str) throws NumberFormatException {
        return new TimeStamp(decodeNtpHexString(str));
    }

    public static long toNtpTime(long j2) {
        long j3 = msb0baseTime;
        boolean z = j2 < msb0baseTime;
        if (z) {
            j3 = msb1baseTime;
        }
        long j4 = j2 - j3;
        long j5 = j4 / 1000;
        long j6 = ((j4 % 1000) * eui.MIN_CAP_LIMIT) / 1000;
        if (z) {
            j5 |= 2147483648L;
        }
        return j6 | (j5 << 32);
    }

    public boolean equals(Object obj) {
        return (obj instanceof TimeStamp) && this.ntpTime == ((TimeStamp) obj).ntpValue();
    }

    public Date getDate() {
        return new Date(getTime(this.ntpTime));
    }

    public long getTime() {
        return getTime(this.ntpTime);
    }

    public int hashCode() {
        long j2 = this.ntpTime;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public long ntpValue() {
        return this.ntpTime;
    }

    public String toDateString() {
        if (this.simpleFormatter == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss.SSS", Locale.US);
            this.simpleFormatter = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
        }
        return this.simpleFormatter.format(getDate());
    }

    public String toString() {
        return toString(this.ntpTime);
    }

    public static long getTime(long j2) {
        long j3 = (j2 >>> 32) & 4294967295L;
        return (j3 * 1000) + ((2147483648L & j3) == 0 ? msb0baseTime : msb1baseTime) + Math.round(((j2 & 4294967295L) * 1000.0d) / 4.294967296E9d);
    }

    public static String toString(long j2) {
        StringBuilder sb = new StringBuilder();
        appendHexString(sb, (j2 >>> 32) & 4294967295L);
        sb.append('.');
        appendHexString(sb, j2 & 4294967295L);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(TimeStamp timeStamp) {
        long j2 = this.ntpTime;
        long j3 = timeStamp.ntpTime;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }
}
