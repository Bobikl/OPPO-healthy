package com.heytap.health.settings.watch.sporthealthsettings.bean;

import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.heytap.health.core.widget.charts.RecordCombinedLineChart;
import com.oplus.smartenginehelper.entity.ClickApiEntity;

/* JADX INFO: loaded from: classes18.dex */
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

    @SerializedName(RecordCombinedLineChart.KEY_HEART_RATE)
    private u a;

    @SerializedName("AFib")
    private a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(DBAssessmentRecord.SPO2)
    private b0 f5536c;

    @SerializedName("sportsAutoRecognize")
    private com.heytap.health.settings.watch.sporthealthsettings.bean.b0 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("osa")
    private w f5537e;

    @SerializedName("sleepRem")
    private z f;

    @SerializedName("breatheRate")
    private k g;

    @SerializedName("spo2AllDayMonitor")
    private a0 h;

    @SerializedName("spo2LowWarning")
    private c0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("sportsVoiceBroadcast")
    private g0 f5538j;

    @SerializedName("buttonToPauseOrResume")
    private l k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("sedentary")
    private com.heytap.health.settings.watch.sporthealthsettings.bean.w f5539l;

    @SerializedName("stress")
    private com.heytap.health.settings.watch.sporthealthsettings.bean.i0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SerializedName("activityGoalComplete")
    private i f5540n;

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
    private C0567m v;

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

        @SerializedName(ClickApiEntity.TIME)
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

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("recordType")
        private int f5541c;

        public int d() {
            return this.f5541c;
        }
    }

    public static class d0 extends g {
    }

    public static class e extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("type")
        private int f5542c;

        public int d() {
            return this.f5542c;
        }
    }

    public static class e0 extends c {
    }

    public static class f extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("value")
        private int f5543c;

        public int d() {
            return this.f5543c;
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
    public static class C0567m extends g {
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

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("lowValue")
        private int f5544c;

        @SerializedName("highValue")
        private int d;

        public int d() {
            return this.d;
        }

        public int e() {
            return this.f5544c;
        }
    }

    public static class y extends g {
    }

    public static class z extends c {
    }

    public g0 A() {
        return this.f5538j;
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
        return this.f5540n;
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

    public C0567m g() {
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
        return this.f5537e;
    }

    public x o() {
        return this.s;
    }

    public y p() {
        return this.D;
    }

    public com.heytap.health.settings.watch.sporthealthsettings.bean.w q() {
        return this.f5539l;
    }

    public z r() {
        return this.f;
    }

    public b0 s() {
        return this.f5536c;
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
