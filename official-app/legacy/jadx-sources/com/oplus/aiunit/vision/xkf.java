package com.oplus.aiunit.vision;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class xkf {
    public static final String REGEX_CN_BLANK_CARD = "^([1-9]{1})(\\d{14}|\\d{15}|\\d{16}|\\d{17}|\\d{18})$";
    public static final String REGEX_CN_MOBILE_EXACT = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|(147))\\d{8}$";
    public static final String REGEX_MOBILE_SIMPLE = "^[1]\\d{10}$";

    public static boolean a(CharSequence charSequence) {
        return c(REGEX_CN_BLANK_CARD, charSequence);
    }

    public static boolean b(CharSequence charSequence) {
        return c(REGEX_CN_MOBILE_EXACT, charSequence);
    }

    public static boolean c(String str, CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0 && Pattern.matches(str, charSequence);
    }
}
