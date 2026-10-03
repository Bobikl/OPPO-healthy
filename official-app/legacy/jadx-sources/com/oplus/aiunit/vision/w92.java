package com.oplus.aiunit.vision;

import com.heytap.health.wallet.bean.TaskResult;

/* JADX INFO: loaded from: classes19.dex */
public abstract class w92 {
    public static final int CONDITION_CREATE_ORDER_NEED_CARD_NO = 2;
    public static final int CONDITION_MOVE_OUT_CHECK_SITE_STATE = 1;
    public static final int FEATURE_EXPIRY_DATE = 1;
    public static final int FEATURE_OPEN_DATE = 2;
    public static final int TYPE_BALANCE = 1;
    public static final int TYPE_CARD_INFO = 4;
    public static final int TYPE_CARD_NO = 2;
    public static final int TYPE_RECORDS = 8;
    public static final int TYPE_SITE_STATE = 16;
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18162c;
    public int d;

    public w92() {
    }

    public static String c(String str) {
        return e1j.o(str.length() / 2).toUpperCase();
    }

    public static String e(String str) {
        return d04.TAG_AID_BIG + c(str) + str;
    }

    public void a(int i) {
        this.f18162c = i | this.f18162c;
    }

    public void b(int i) {
        this.d = i | this.d;
    }

    public abstract z92 d(int i);

    public boolean f(int i) {
        return (this.f18162c & i) > 0;
    }

    public String g() {
        return this.a;
    }

    public abstract ha2 h(TaskResult taskResult, int i);

    public void i(String str) {
        this.a = str;
    }

    public void j(String str) {
        this.b = str;
    }

    public abstract boolean k(int i);

    public w92(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
