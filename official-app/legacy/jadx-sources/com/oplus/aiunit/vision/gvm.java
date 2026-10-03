package com.oplus.aiunit.vision;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public class gvm {
    public static final Pattern a = Pattern.compile("([\t\r\n])+");

    public static int a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i = 0;
        for (char c2 : str.toCharArray()) {
            i = (i * 31) + c2;
        }
        return i;
    }

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }
}
