package com.oplus.aiunit.vision;

import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class vd8 implements w7e {
    public static final String HCI_VERSION_DEFAULT_CHECKER = "01,02,03";
    public static final int INDEX_VALUE_EP_AMOUNT = 2;
    public static final int INDEX_VALUE_EP_BALANCE = 38;
    public static final int INDEX_VALUE_EP_DATE_DAY = 24;
    public static final int INDEX_VALUE_EP_DATE_TIME = 32;
    public static final int INDEX_VALUE_EP_TERMINAL_CODE = 12;
    public static final int INDEX_VALUE_EP_TRANS_TYPE = 10;
    public static final String KEY_INDEX_AMOUNT = "index_amount";
    public static final String KEY_INDEX_BALANCE = "index_balance";
    public static final String KEY_INDEX_DATE_DAY = "index_date_day";
    public static final String KEY_INDEX_DATE_TIME = "index_date_time";
    public static final String KEY_INDEX_TERMINAL_CODE = "index_terminal_code";
    public static final String KEY_INDEX_TRANS_TYPE = "index_trans_type";
    public static final String KEY_INDEX_VERSION = "index_version";
    public static final String KEY_LENGTH_AMOUNT = "length_amount";
    public static final String KEY_LENGTH_BALANCE = "length_balance";
    public static final String KEY_LENGTH_DATE_DAY = "length_date_day";
    public static final String KEY_LENGTH_DATE_TIME = "length_date_time";
    public static final String KEY_LENGTH_TERMINAL_CODE = "length_terminal_code";
    public static final String KEY_LENGTH_TRANS_TYPE = "length_trans_type";
    public static final String KEY_LENGTH_VERSION = "length_version";
    public static final int LENGTH_HCI_MIN = 46;
    public static final int LENGTH_VALUE_EP_AMOUNT = 4;
    public static final int LENGTH_VALUE_EP_BALANCE = 4;
    public static final int LENGTH_VALUE_EP_DATE_DAY = 4;
    public static final int LENGTH_VALUE_EP_DATE_TIME = 3;
    public static final int LENGTH_VALUE_EP_TERMINAL_CODE = 6;
    public static final int LENGTH_VALUE_EP_TRANS_TYPE = 1;
    public String b;
    public String a = HCI_VERSION_DEFAULT_CHECKER;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, Integer> f17815c = new HashMap<>(10);
    public HashMap<String, Integer> d = new HashMap<>(10);

    public vd8() {
        a();
    }

    public final void a() {
        c(KEY_INDEX_AMOUNT, KEY_LENGTH_AMOUNT, 2, 4);
        c(KEY_INDEX_TRANS_TYPE, KEY_LENGTH_TRANS_TYPE, 10, 1);
        c(KEY_INDEX_TERMINAL_CODE, KEY_LENGTH_TERMINAL_CODE, 12, 6);
        c(KEY_INDEX_DATE_DAY, KEY_LENGTH_DATE_DAY, 24, 4);
        c(KEY_INDEX_DATE_TIME, KEY_LENGTH_DATE_TIME, 32, 3);
        c(KEY_INDEX_BALANCE, KEY_LENGTH_BALANCE, 38, 4);
    }

    public void b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        c(KEY_INDEX_VERSION, KEY_LENGTH_VERSION, i, i2);
        c(KEY_INDEX_AMOUNT, KEY_LENGTH_AMOUNT, i3, i4);
        c(KEY_INDEX_TRANS_TYPE, KEY_LENGTH_TRANS_TYPE, i5, i6);
        c(KEY_INDEX_TERMINAL_CODE, KEY_LENGTH_TERMINAL_CODE, i7, i8);
        c(KEY_INDEX_DATE_DAY, KEY_LENGTH_DATE_DAY, i9, i10);
        c(KEY_INDEX_DATE_TIME, KEY_LENGTH_DATE_TIME, i11, i12);
        c(KEY_INDEX_BALANCE, KEY_LENGTH_BALANCE, i13, i14);
    }

    public final void c(String str, String str2, int i, int i2) {
        if (i < 0 || i2 < 0) {
            return;
        }
        this.f17815c.put(str, Integer.valueOf(i));
        this.d.put(str2, Integer.valueOf(i2));
    }

    public void d(String str) {
        this.b = str;
    }

    public void e(String str) {
        this.a = str;
    }

    public vd8(boolean z) {
        if (z) {
            a();
        }
    }
}
