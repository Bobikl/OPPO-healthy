package com.oplus.aiunit.vision;

import org.scilab.forge.jlatexmath.ParseException;

/* JADX INFO: loaded from: classes11.dex */
public class fqc extends vpc {
    public static void e(String str, String str2, String str3, int i) throws ParseException {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" #");
        int i2 = i + 1;
        sb.append(i2);
        sb.append(" ");
        sb.append(str3);
        vpc.a(str + "@env", sb.toString(), i2);
    }

    public static void f(String str, String str2, String str3, int i) throws ParseException {
        if (vpc.a.get(str + "@env") == null) {
            throw new ParseException("Environment " + str + "is not defined ! Use newenvironment instead ...");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" #");
        int i2 = i + 1;
        sb.append(i2);
        sb.append(" ");
        sb.append(str3);
        vpc.c(str + "@env", sb.toString(), i2);
    }
}
