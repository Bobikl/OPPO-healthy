package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.healthbase.bean.HealthChartDayBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class fl1 extends HealthChartDayBean {
    public int a = 0;
    public List<f59> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<TimeStampedData> f12877c = new ArrayList();
    public final List<f59> d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12878e;
    public int f;
    public long g;
    public long h;
    public BloodOxygenSaturation i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Spo2WarnBean f12879j;

    public List<f59> a() {
        return this.b;
    }

    public long b() {
        return this.g;
    }

    public long c() {
        return this.h;
    }

    public long d() {
        return this.g;
    }

    public BloodOxygenSaturation e() {
        return this.i;
    }

    public int f() {
        return this.f12878e;
    }

    public int g() {
        return this.f;
    }

    public long getChartEndTime() {
        return this.h;
    }

    public List<f59> getUndueDataList() {
        return this.d;
    }

    public List<TimeStampedData> h() {
        return this.f12877c;
    }

    public Spo2WarnBean i() {
        return this.f12879j;
    }

    public void insertUndueDataList(long j2, long j3) {
        this.g = j2;
        this.h = j3;
        this.d.clear();
        this.d.add(new f59(j2, 0, 0));
        this.d.add(new f59(j3, 0, 0));
        this.curPageTimestamp = j2;
    }

    public boolean isEmptyData() {
        if (w0b.a(this.b)) {
            return true;
        }
        if (this.b.size() == 2) {
            return this.b.get(0).a() <= 0 && this.b.get(1).a() <= 0;
        }
        return false;
    }

    public boolean isUndue() {
        return this.a == 1;
    }

    public boolean j() {
        return (isUndue() || isEmptyData()) ? false : true;
    }

    public void k(List<f59> list) {
        this.b = list;
    }

    public void l(BloodOxygenSaturation bloodOxygenSaturation) {
        this.i = bloodOxygenSaturation;
    }

    public void m(int i) {
        this.f12878e = i;
    }

    public void n(int i) {
        this.f = i;
    }

    public void o(List<TimeStampedData> list) {
        this.f12877c = list;
    }

    public void p(Spo2WarnBean ociVar) {
        this.f12879j = ociVar;
    }
}