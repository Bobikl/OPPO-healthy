package com.oplus.aiunit.vision;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
public class wkf {
    public static boolean a(String str) {
        return Pattern.compile("[一-龥]").matcher(str).find();
    }

    public static boolean b(String str) {
        return Pattern.compile("^[A-Za-z]+$").matcher(str).find();
    }

    public static boolean c(String str) {
        return Pattern.compile("^[A-Z]+$").matcher(str).find();
    }

    public static boolean d(String str) {
        return Pattern.compile("^-?[0-9]+$").matcher(str).find();
    }
}
