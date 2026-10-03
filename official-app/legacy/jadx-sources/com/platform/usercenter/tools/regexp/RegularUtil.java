package com.platform.usercenter.tools.regexp;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class RegularUtil {
    private RegularUtil() {
    }

    public static boolean isEmail(String str) {
        return Pattern.compile("^[a-zA-Z0-9]{1}[a-zA-Z0-9\\+\\_\\-\\*\\~\\!\\#\\$\\\\%\\^\\&\\.]{0,39}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,39}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,39})+$").matcher(str).find();
    }

    public static boolean isMobileNumber(String str) {
        return Pattern.compile("^[1]{1}[0-9]{10}$").matcher(str).find();
    }
}
