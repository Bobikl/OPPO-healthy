package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class wd8 implements w7e {
    public static final String TAG_AMOUNT = "tag_amount";
    public static final String TAG_BALANCE = "tag_balance";
    public static final String TAG_DATE_DAY = "tag_date_day";
    public static final String TAG_DATE_TIME = "tag_date_time";
    public static final String TAG_TERMINAL_CODE = "tag_terminal_code";
    public static final String TAG_TRANS_TYPE = "tag_trans_type";
    public static final String TAG_VALUE_EP_AMOUNT = "9F02";
    public static final String TAG_VALUE_EP_BALANCE = "9F79";
    public static final String TAG_VALUE_EP_DATE_DAY = "9A";
    public static final String TAG_VALUE_EP_DATE_TIME = "9F21";
    public static final String TAG_VALUE_EP_TERMINAL_CODE = "9F1C";
    public static final String TAG_VALUE_EP_TRANS_TYPE = "9C";
    public String a;
    public HashMap<String, String> b = new HashMap<>(10);

    public void a(String str) {
        this.a = str;
    }

    public void b(String str, String str2, String str3, String str4, String str5, String str6) {
        if (!TextUtils.isEmpty(str)) {
            this.b.put(TAG_BALANCE, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.b.put(TAG_AMOUNT, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            this.b.put(TAG_DATE_DAY, str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            this.b.put(TAG_DATE_TIME, str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            this.b.put(TAG_TRANS_TYPE, str5);
        }
        if (TextUtils.isEmpty(str6)) {
            return;
        }
        this.b.put(TAG_TERMINAL_CODE, str6);
    }
}
