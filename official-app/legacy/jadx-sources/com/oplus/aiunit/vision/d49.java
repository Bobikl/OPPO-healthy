package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.newsleep.SleepHeartRateStat;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.healthbase.bean.HealthChartDayBean;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class d49 extends HealthChartDayBean {
    public List<TimeStampedData> a = new ArrayList();
    public List<TimeStampedData> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<czj> f10369c = new ArrayList();
    public int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<TimeStampedData> f10370e = new ArrayList();
    public List<czj> f = new ArrayList();
    public int g;
    public float h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f10371j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f10372l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f10373n;
    public int o;
    public float p;
    public int q;
    public long r;
    public long s;
    public c49 t;
    public boolean u;
    public TimeStampedData v;
    public SleepHeartRateStat w;

    public void A(float f) {
        this.f10373n = f;
    }

    public void B(int i) {
        this.o = i;
    }

    public void C(float f) {
        this.p = f;
    }

    public void D(int i) {
        this.q = i;
    }

    public void E(float f) {
        this.f10372l = f;
    }

    public void F(int i) {
        this.m = i;
    }

    public void G(List<TimeStampedData> list) {
        this.b = list;
    }

    public void H(SleepHeartRateStat sleepHeartRateStat) {
        this.w = sleepHeartRateStat;
    }

    public void I(List<czj> list) {
        this.f10369c = list;
    }

    public void J(List<TimeStampedData> list) {
        this.a = list;
    }

    public int a() {
        c49 c49Var = this.t;
        if (c49Var != null) {
            return c49Var.a();
        }
        return 0;
    }

    public int b() {
        c49 c49Var = this.t;
        if (c49Var != null) {
            return c49Var.b();
        }
        return 0;
    }

    public float c() {
        return this.f10371j;
    }

    public float d() {
        return this.k;
    }

    public long e() {
        return this.s;
    }

    public c49 f() {
        return this.t;
    }

    public TimeStampedData g() {
        return this.v;
    }

    public int h() {
        c49 c49Var = this.t;
        if (c49Var != null) {
            return c49Var.j();
        }
        return 0;
    }

    public SleepHeartRateStat i() {
        return this.w;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.time.ZonedDateTime] */
    public void insertCurTimeEmptyData() {
        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()).toLocalDate();
        long epochMilli = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).withHour(0).withMinute(0).withSecond(0).withNano(0).toInstant().toEpochMilli();
        long epochMilli2 = localDate.atStartOfDay().plusDays(1L).atZone(ZoneId.systemDefault()).withHour(0).withMinute(0).withSecond(0).withNano(0).toInstant().toEpochMilli() - 1000;
        p(epochMilli, epochMilli2);
        o(epochMilli, epochMilli2);
        q(epochMilli, epochMilli2);
    }

    public boolean isUndue() {
        return this.d == 1;
    }

    public long j() {
        return this.r;
    }

    public List<czj> k() {
        return this.f10369c;
    }

    public List<TimeStampedData> l() {
        return this.a;
    }

    public List<czj> m() {
        return this.f;
    }

    public List<TimeStampedData> n() {
        return this.f10370e;
    }

    public void o(long j2, long j3) {
        this.f10369c.clear();
        this.f10369c.add(new czj(j2, -10.0f, -10.0f, -10.0f, -10.0f));
        this.f10369c.add(new czj(j3, -10.0f, -10.0f, -10.0f, -10.0f));
    }

    public void p(long j2, long j3) {
        this.a.clear();
        this.a.add(new TimeStampedData(j2, -10.0f));
        this.a.add(new TimeStampedData(j3, -10.0f));
    }

    public void q(long j2, long j3) {
        this.f10370e.clear();
        this.f10370e.add(new TimeStampedData(j2, -10.0f));
        this.f10370e.add(new TimeStampedData(j3, -10.0f));
        this.f.clear();
        this.f.add(new czj(j2, -10.0f, -10.0f, -10.0f, -10.0f));
        this.f.add(new czj(j3, -10.0f, -10.0f, -10.0f, -10.0f));
        this.curPageTimestamp = j2;
        this.r = j2;
        this.s = j3 + 1000;
    }

    public boolean r() {
        return this.u;
    }

    public void s(int i) {
        this.i = i;
    }

    public void t(float f) {
        this.f10371j = f;
    }

    public void u(float f) {
        this.k = f;
    }

    public void v(boolean z) {
        this.u = z;
    }

    public void w(c49 c49Var) {
        this.t = c49Var;
    }

    public void x(TimeStampedData timeStampedData) {
        this.v = timeStampedData;
    }

    public void y(int i) {
        this.g = i;
    }

    public void z(float f) {
        this.h = f;
    }
}
