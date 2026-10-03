package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.healthbase.bean.HealthChartDayBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qk1 extends HealthChartDayBean {
    public int a = 0;
    public List<b49> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<TimeStampedData> f15823c = new ArrayList();
    public final List<b49> d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15824e;
    public int f;
    public long g;
    public long h;
    public BloodOxygenSaturation i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Spo2WarnBean f15825j;

    public List<b49> a() {
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
        return this.f15824e;
    }

    public int g() {
        return this.f;
    }

    public long getChartEndTime() {
        return this.h;
    }

    public List<b49> getUndueDataList() {
        return this.d;
    }

    public List<TimeStampedData> h() {
        return this.f15823c;
    }

    public Spo2WarnBean i() {
        return this.f15825j;
    }

    public void insertUndueDataList(long j2, long j3) {
        this.g = j2;
        this.h = j3;
        this.d.clear();
        this.d.add(new b49(j2, 0, 0));
        this.d.add(new b49(j3, 0, 0));
        this.curPageTimestamp = j2;
    }

    public boolean isEmptyData() {
        if (lza.a(this.b)) {
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

    public void k(List<b49> list) {
        this.b = list;
    }

    public void l(BloodOxygenSaturation bloodOxygenSaturation) {
        this.i = bloodOxygenSaturation;
    }

    public void m(int i) {
        this.f15824e = i;
    }

    public void n(int i) {
        this.f = i;
    }

    public void o(List<TimeStampedData> list) {
        this.f15823c = list;
    }

    public void p(Spo2WarnBean spo2WarnBean) {
        this.f15825j = spo2WarnBean;
    }
}
