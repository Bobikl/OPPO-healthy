package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
public class fq6 {
    public static String EXTRA_CODE_RESULT = "extra_code_result";
    public static String EXTRA_FROM = "extra_from";
    public static int EXTRA_FROM_DEVICE_CAPTURE = 1;
    public static String LPA_START_WITH_1 = "LPA:1$";
    public static String LPA_START_WITH_2 = "1$";

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '$') {
                i++;
            }
        }
        return i;
    }
}
