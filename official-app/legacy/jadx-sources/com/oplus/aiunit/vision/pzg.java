package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class pzg implements vid {
    public static final int FAMILY_HEALTH_QR_CODE = 11;
    public static final int FITNESS = 6;
    public static final int GOAL_CARD = 10;
    public static final int MEDAL_WALL = 3;
    public static final int ONE_MEDAL = 2;
    public static final int PLAN_SHARE = 12;
    public static final int RUNNING = 4;
    public static final int STEP_CARD = 9;
    public static final int STEP_RANK = 0;
    public static final int TWENTY_ONE = 8;
    public static final int WALKING = 5;
    public static final int WEEKLY_REPORT = 1;
    public static final int YOGA = 7;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f15552e = "com.oplus.aiunit.vision.pzg";
    public int a = -1;
    public boolean b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15553c = true;
    public String d;

    public pzg(int i) {
        b(i);
    }

    @Override // com.oplus.aiunit.vision.vid
    public void a(int i) {
    }

    public void b(int i) {
        this.a = i;
    }

    public void c(String str) {
        try {
            b(Integer.valueOf(str).intValue());
        } catch (NumberFormatException unused) {
            a7b.f(f15552e, "shareType transform error!!");
        }
    }

    public void d(String str) {
        this.d = str;
    }

    public pzg(String str) {
        c(str);
    }
}
