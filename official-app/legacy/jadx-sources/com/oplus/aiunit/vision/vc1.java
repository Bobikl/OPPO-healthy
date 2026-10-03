package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes13.dex */
public class vc1 {
    public static String a(JavaType javaType) {
        String str;
        String str2;
        String name = javaType.getRawClass().getName();
        if (c(name)) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else {
            if (!d(name)) {
                return null;
            }
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", str, nc3.G(javaType), str2);
    }

    public static Object b(JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Class<?> clsB0 = nc3.b0(rawClass);
        if (clsB0 != null) {
            return nc3.m(clsB0);
        }
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return JsonInclude.Include.NON_EMPTY;
        }
        if (rawClass == String.class) {
            return "";
        }
        if (javaType.isTypeOrSubTypeOf(Date.class)) {
            return new Date(0L);
        }
        if (!javaType.isTypeOrSubTypeOf(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0L);
        return gregorianCalendar;
    }

    public static boolean c(String str) {
        return str.startsWith("java.time.");
    }

    public static boolean d(String str) {
        return str.startsWith("org.joda.time.");
    }
}
