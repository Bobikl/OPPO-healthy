package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class oa2 {
    public static v9g a() {
        return v9g.x("ReportUtil");
    }

    public static String b() {
        return v9g.w().D("user_ssoid");
    }

    public static String c() {
        return vbb.b(v9g.w().D("user_ssoid"));
    }

    public static v9g d(String str) {
        return v9g.x(c() + str);
    }

    public static String e(String str) {
        return String.format("%s_%s", v9g.w().D("user_ssoid"), str);
    }
}
