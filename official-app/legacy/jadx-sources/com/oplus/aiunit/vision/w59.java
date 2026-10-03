package com.oplus.aiunit.vision;

import com.heytap.health.core.widget.charts.data.TimeStampedData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class w59 {
    public List<TimeStampedData> a = new ArrayList();
    public List<czj> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<TimeStampedData> f18126c = new ArrayList();
    public List<TimeStampedData> d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18127e;
    public long f;
    public long g;

    public w59 a(long j2, long j3) {
        a7b.m("HeartRateCardViewModel", "addNullChartData:" + x05.a(j2, "yyyy-MM-dd HH:mm:ss"));
        long j4 = j2 - 1000;
        czj czjVar = new czj();
        czjVar.l(j4);
        czjVar.r(j4);
        czjVar.p(-10.0f);
        czjVar.n(-10.0f);
        czjVar.k(-10.0f);
        czjVar.j(-10.0f);
        czjVar.v(j4);
        this.b.add(czjVar);
        this.f = j3;
        return this;
    }

    public long b() {
        return this.f;
    }

    public long c() {
        return this.g;
    }

    public List<TimeStampedData> d() {
        return this.a;
    }

    public List<TimeStampedData> e() {
        return this.d;
    }

    public List<czj> f() {
        return this.b;
    }

    public List<TimeStampedData> g() {
        return this.f18126c;
    }

    public boolean h() {
        return this.f18127e;
    }

    public void i(long j2) {
        this.f = j2;
    }

    public void j(long j2) {
        this.g = j2;
    }

    public void k(List<TimeStampedData> list) {
        this.a = list;
    }

    public void l(boolean z) {
        this.f18127e = z;
    }

    public void m(List<TimeStampedData> list) {
        this.d = list;
    }

    public void n(List<czj> list) {
        this.b = list;
    }

    public void o(List<TimeStampedData> list) {
        this.f18126c = list;
    }
}
