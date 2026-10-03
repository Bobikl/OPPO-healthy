package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;
import com.oplus.drs.rom.sdk.comm.util.OpenIdUtils;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.SimpleTimeZone;

/* JADX INFO: loaded from: classes12.dex */
public final class yw9 {
    public static t5m a(String str) throws XMPException {
        return b(str, new u5m());
    }

    /* JADX WARN: Code duplicated, block: B:137:0x021e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:138:0x021f  */
    public static t5m b(String str, t5m t5mVar) throws XMPException {
        int i;
        int i2;
        int i3;
        if (str == null) {
            throw new XMPException("Parameter must not be null", 4);
        }
        if (str.length() == 0) {
            return t5mVar;
        }
        b8e b8eVar = new b8e(str);
        int iC = 0;
        if (b8eVar.b(0) == '-') {
            b8eVar.f();
        }
        int iC2 = b8eVar.c("Invalid year in date string", 9999);
        if (b8eVar.d() && b8eVar.a() != '-') {
            throw new XMPException("Invalid date string, after year", 5);
        }
        if (b8eVar.b(0) == '-') {
            iC2 = -iC2;
        }
        t5mVar.C(iC2);
        if (!b8eVar.d()) {
            return t5mVar;
        }
        b8eVar.f();
        int iC3 = b8eVar.c("Invalid month in date string", 12);
        if (b8eVar.d() && b8eVar.a() != '-') {
            throw new XMPException("Invalid date string, after month", 5);
        }
        t5mVar.z(iC3);
        if (!b8eVar.d()) {
            return t5mVar;
        }
        b8eVar.f();
        int iC4 = b8eVar.c("Invalid day in date string", 31);
        if (b8eVar.d() && b8eVar.a() != 'T') {
            throw new XMPException("Invalid date string, after day", 5);
        }
        t5mVar.w(iC4);
        if (!b8eVar.d()) {
            return t5mVar;
        }
        b8eVar.f();
        t5mVar.A(b8eVar.c("Invalid hour in date string", 23));
        if (!b8eVar.d()) {
            return t5mVar;
        }
        if (b8eVar.a() == ':') {
            b8eVar.f();
            int iC5 = b8eVar.c("Invalid minute in date string", 59);
            if (b8eVar.d() && b8eVar.a() != ':' && b8eVar.a() != 'Z' && b8eVar.a() != '+' && b8eVar.a() != '-') {
                throw new XMPException("Invalid date string, after minute", 5);
            }
            t5mVar.B(iC5);
        }
        if (!b8eVar.d()) {
            return t5mVar;
        }
        if (b8eVar.d() && b8eVar.a() == ':') {
            b8eVar.f();
            int iC6 = b8eVar.c("Invalid whole seconds in date string", 59);
            if (b8eVar.d() && b8eVar.a() != '.' && b8eVar.a() != 'Z' && b8eVar.a() != '+' && b8eVar.a() != '-') {
                throw new XMPException("Invalid date string, after whole seconds", 5);
            }
            t5mVar.D(iC6);
            if (b8eVar.a() == '.') {
                b8eVar.f();
                int iE = b8eVar.e();
                int iC7 = b8eVar.c("Invalid fractional seconds in date string", 999999999);
                if (b8eVar.d() && b8eVar.a() != 'Z' && b8eVar.a() != '+' && b8eVar.a() != '-') {
                    throw new XMPException("Invalid date string, after fractional second", 5);
                }
                int iE2 = b8eVar.e() - iE;
                while (iE2 > 9) {
                    iC7 /= 10;
                    iE2--;
                }
                while (iE2 < 9) {
                    iC7 *= 10;
                    iE2++;
                }
                t5mVar.y(iC7);
            }
        } else if (b8eVar.a() != 'Z' && b8eVar.a() != '+' && b8eVar.a() != '-') {
            throw new XMPException("Invalid date string, after time", 5);
        }
        if (!b8eVar.d()) {
            return t5mVar;
        }
        if (b8eVar.a() != 'Z') {
            if (b8eVar.d()) {
                if (b8eVar.a() == '+') {
                    i = 1;
                } else {
                    if (b8eVar.a() != '-') {
                        throw new XMPException("Time zone must begin with 'Z', '+', or '-'", 5);
                    }
                    i = -1;
                }
                b8eVar.f();
                int iC8 = b8eVar.c("Invalid time zone hour in date string", 23);
                if (b8eVar.d()) {
                    if (b8eVar.a() != ':') {
                        throw new XMPException("Invalid date string, after time zone hour", 5);
                    }
                    b8eVar.f();
                    iC = b8eVar.c("Invalid time zone minute in date string", 59);
                }
                int i4 = i;
                i2 = iC;
                iC = iC8;
                i3 = i4;
            }
            t5mVar.setTimeZone(new SimpleTimeZone(((iC * 3600 * 1000) + (i2 * 60 * 1000)) * i3, ""));
            if (b8eVar.d()) {
                throw new XMPException("Invalid date string, extra chars at end", 5);
            }
            return t5mVar;
        }
        b8eVar.f();
        i2 = 0;
        i3 = 0;
        t5mVar.setTimeZone(new SimpleTimeZone(((iC * 3600 * 1000) + (i2 * 60 * 1000)) * i3, ""));
        if (b8eVar.d()) {
            return t5mVar;
        }
        throw new XMPException("Invalid date string, extra chars at end", 5);
    }

    public static String c(t5m t5mVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (t5mVar.t()) {
            DecimalFormat decimalFormat = new DecimalFormat(OpenIdUtils.DEFAULT_VALUE, new DecimalFormatSymbols(Locale.ENGLISH));
            stringBuffer.append(decimalFormat.format(t5mVar.getYear()));
            if (t5mVar.getMonth() == 0) {
                return stringBuffer.toString();
            }
            decimalFormat.applyPattern("'-'00");
            stringBuffer.append(decimalFormat.format(t5mVar.getMonth()));
            if (t5mVar.getDay() == 0) {
                return stringBuffer.toString();
            }
            stringBuffer.append(decimalFormat.format(t5mVar.getDay()));
            if (t5mVar.s()) {
                stringBuffer.append('T');
                decimalFormat.applyPattern("00");
                stringBuffer.append(decimalFormat.format(t5mVar.getHour()));
                stringBuffer.append(':');
                stringBuffer.append(decimalFormat.format(t5mVar.getMinute()));
                if (t5mVar.getSecond() != 0 || t5mVar.u() != 0) {
                    double second = ((double) t5mVar.getSecond()) + (((double) t5mVar.u()) / 1.0E9d);
                    decimalFormat.applyPattern(":00.#########");
                    stringBuffer.append(decimalFormat.format(second));
                }
                if (t5mVar.v()) {
                    int offset = t5mVar.getTimeZone().getOffset(t5mVar.x().getTimeInMillis());
                    if (offset == 0) {
                        stringBuffer.append(rnb.MATRIX_TYPE_ZERO);
                    } else {
                        int i = offset / 3600000;
                        int iAbs = Math.abs((offset % 3600000) / 60000);
                        decimalFormat.applyPattern("+00;-00");
                        stringBuffer.append(decimalFormat.format(i));
                        decimalFormat.applyPattern(":00");
                        stringBuffer.append(decimalFormat.format(iAbs));
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
