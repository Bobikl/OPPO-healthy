package com.heytap.health.settings.watch.sporthealthsettings.bean;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
public class m {

    @SerializedName("sportGoal")
    private d0 A;

    @SerializedName("continueSportReminder")
    private n B;

    @SerializedName("endSportReminder")
    private p C;

    @SerializedName("regularEarlyBedtime")
    private y D;

    @SerializedName("sunshineDuration")
    private i0 E;

    @SerializedName("newGoalSettingSelected")
    private v F;

    @SerializedName("heartRate")
    private u a;

    @SerializedName("AFib")
    private a b;

    @SerializedName("spo2")
    private b0 c;

    @SerializedName("sportsAutoRecognize")
    private com.heytap.health.settings.watch.sporthealthsettings.bean.b0 d;

    @SerializedName("osa")
    private w e;

    @SerializedName("sleepRem")
    private z f;

    @SerializedName("breatheRate")
    private k g;

    @SerializedName("spo2AllDayMonitor")
    private a0 h;

    @SerializedName("spo2LowWarning")
    private c0 i;

    @SerializedName("sportsVoiceBroadcast")
    private g0 j;

    @SerializedName("buttonToPauseOrResume")
    private l k;

    @SerializedName("sedentary")
    private com.heytap.health.settings.watch.sporthealthsettings.bean.w l;

    @SerializedName("stress")
    private com.heytap.health.settings.watch.sporthealthsettings.bean.i0 m;

    @SerializedName("activityGoalComplete")
    private i n;

    @SerializedName("activityPraise")
    private j o;

    @SerializedName("healthDailyReport")
    private s p;

    @SerializedName("healthWeekReport")
    private t q;

    @SerializedName("sportsHeartRate")
    private f0 r;

    @SerializedName("quietHeartRate")
    private x s;

    @SerializedName("sportsAutoPause")
    private e0 t;

    @SerializedName("step")
    private h0 u;

    @SerializedName("calorie")
    private C0004m v;

    @SerializedName("exerciseTimeGoal")
    private q w;

    @SerializedName("activityGoal")
    private h x;

    @SerializedName("sportsDoubleVoiceBroadcast")
    private o y;

    @SerializedName("tumble")
    private r z;

    public static class a extends c {
    }

    public static class a0 extends c {
    }

    public static class b {

        @SerializedName("time")
        private int a;

        public int a() {
            return this.a;
        }
    }

    public static class b0 extends e {
    }

    public static class c extends b {

        @SerializedName("enable")
        private int b;

        public int b() {
            return this.b;
        }

        public boolean c() {
            return this.b == 1;
        }
    }

    public static class c0 extends f {
    }

    public static class d extends c {

        @SerializedName("recordType")
        private int c;

        public int d() {
            return this.c;
        }
    }

    public static class d0 extends g {
    }

    public static class e extends c {

        @SerializedName("type")
        private int c;

        public int d() {
            return this.c;
        }
    }

    public static class e0 extends c {
    }

    public static class f extends c {

        @SerializedName("value")
        private int c;

        public int d() {
            return this.c;
        }
    }

    public static class f0 extends f {
    }

    public static class g extends b {

        @SerializedName("value")
        private int b;

        public int b() {
            return this.b;
        }
    }

    public static class g0 extends c {
    }

    public static class h extends g {
    }

    public static class h0 extends g {
    }

    public static class i extends c {
    }

    public static class i0 extends g {
    }

    public static class j extends c {
    }

    public static class k extends c {
    }

    public static class l extends c {
    }

    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings.bean.m$m, reason: collision with other inner class name */
    public static class C0004m extends g {
    }

    public static class n extends c {
    }

    public static class o extends c {
    }

    public static class p extends c {
    }

    public static class q extends g {
    }

    public static class r extends c {
    }

    public static class s extends c {
    }

    public static class t extends c {
    }

    public static class u extends e {
    }

    public static class v extends b {

        @SerializedName("value")
        private String b;
    }

    public static class w extends c {
    }

    public static class x extends c {

        @SerializedName("lowValue")
        private int c;

        @SerializedName("highValue")
        private int d;

        public int d() {
            return this.d;
        }

        public int e() {
            return this.c;
        }
    }

    public static class y extends g {
    }

    public static class z extends c {
    }

    public g0 A() {
        return this.j;
    }

    public h0 B() {
        return this.u;
    }

    public com.heytap.health.settings.watch.sporthealthsettings.bean.i0 C() {
        return this.m;
    }

    public i0 D() {
        return this.E;
    }

    public r E() {
        return this.z;
    }

    public a a() {
        return this.b;
    }

    public h b() {
        return this.x;
    }

    public i c() {
        return this.n;
    }

    public j d() {
        return this.o;
    }

    public k e() {
        return this.g;
    }

    public l f() {
        return this.k;
    }

    public C0004m g() {
        return this.v;
    }

    public n h() {
        return this.B;
    }

    public p i() {
        return this.C;
    }

    public q j() {
        return this.w;
    }

    public s k() {
        return this.p;
    }

    public t l() {
        return this.q;
    }

    public u m() {
        return this.a;
    }

    public w n() {
        return this.e;
    }

    public x o() {
        return this.s;
    }

    public y p() {
        return this.D;
    }

    public com.heytap.health.settings.watch.sporthealthsettings.bean.w q() {
        return this.l;
    }

    public z r() {
        return this.f;
    }

    public b0 s() {
        return this.c;
    }

    public a0 t() {
        return this.h;
    }

    public c0 u() {
        return this.i;
    }

    public d0 v() {
        return this.A;
    }

    public e0 w() {
        return this.t;
    }

    public com.heytap.health.settings.watch.sporthealthsettings.bean.b0 x() {
        return this.d;
    }

    public o y() {
        return this.y;
    }

    public f0 z() {
        return this.r;
    }
}