package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.HearingHealthStat;
import com.heytap.health.healthbase.bean.HealthChartDayBean;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class bx8 extends HealthChartDayBean {
    public int a = 0;
    public List<HearingHealthStat> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<vw8> f9879c = new ArrayList();
    public final List<vw8> d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f9880e;

    public double a() {
        return this.f9880e;
    }

    public float b() {
        float fA = 0.0f;
        for (vw8 vw8Var : this.f9879c) {
            if (vw8Var.a() > fA) {
                fA = vw8Var.a();
            }
        }
        return fA;
    }

    public void c(double d) {
        this.f9880e = d;
    }

    public List<vw8> getDataList() {
        return this.f9879c;
    }

    public List<HearingHealthStat> getHalfHourData() {
        return this.b;
    }

    public List<vw8> getUndueDataList() {
        return this.d;
    }

    public void insertCurTimeEmptyData() {
        long epochMilli = LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long epochMilli2 = LocalDate.now().plusDays(1L).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1000;
        this.f9879c.add(new vw8(epochMilli, 0, 0));
        this.f9879c.add(new vw8(epochMilli2, 0, 0));
        this.curPageTimestamp = epochMilli;
    }

    public void insertEmptyData(long j2, long j3) {
        this.f9879c.clear();
        this.f9879c.add(new vw8(j2, 0, 0));
        this.f9879c.add(new vw8(j3, 0, 0));
    }

    public void insertUndueDataList(long j2, long j3) {
        this.d.clear();
        this.d.add(new vw8(j2, 0, 0));
        this.d.add(new vw8(j3, 0, 0));
        this.curPageTimestamp = j2;
    }

    public boolean isEmptyData() {
        if (this.f9879c.isEmpty()) {
            return true;
        }
        if (this.f9879c.size() == 2) {
            return this.f9879c.get(0).b() == 0 && this.f9879c.get(1).a() == 0;
        }
        return false;
    }

    public boolean isUndue() {
        return this.a == 1;
    }

    public void setDataList(List<vw8> list) {
        this.f9879c = list;
    }

    public void setHalfHourData(List<HearingHealthStat> list) {
        this.b = list;
    }

    public void setStyle(int i) {
        this.a = i;
    }
}
