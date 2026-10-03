package com.oplus.aiunit.vision;

import com.heytap.health.healthbase.bean.HealthChartDayBean;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class cq8<T> {
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10193c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10194e;
    public long f;
    public long g;
    public long h;
    public long i;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10196l;
    public int m;
    public aq8 o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int u;
    public boolean v;
    public final String a = "ViewpagePagin";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10195j = 10;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<T> f10197n = new ArrayList();
    public final int t = 30;

    public cq8(int i, long j2, aq8 aq8Var) {
        this.f10193c = i >= 24 ? 0 : i;
        this.o = aq8Var;
        this.b = j2;
        b();
    }

    public static /* synthetic */ int f(Object obj, Object obj2) {
        if ((obj instanceof HealthChartDayBean) && (obj2 instanceof HealthChartDayBean)) {
            return Long.compare(((HealthChartDayBean) obj).getCurPageTimestamp(), ((HealthChartDayBean) obj2).getCurPageTimestamp());
        }
        return 0;
    }

    public final void b() {
        a7b.f("ViewpagePagin", "chart last data time:" + this.b + "/" + x05.a(this.b, "yyyy-MM-dd HH:mm:ss"));
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.b), ZoneId.systemDefault());
        int i = this.f10193c;
        if (i == 0) {
            this.f = localDateTimeOfInstant.withHour(i).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            this.g = localDateTimeOfInstant.plusDays(1L).withHour(this.f10193c).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1000;
        } else {
            this.f = localDateTimeOfInstant.minusDays(1L).withHour(this.f10193c).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            this.g = localDateTimeOfInstant.withHour(this.f10193c).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1000;
        }
    }

    public final void c() {
        this.p = false;
        this.q = false;
        int i = this.f10196l;
        int i2 = this.k;
        if (i >= i2) {
            this.f10196l = i2;
            this.p = true;
        }
        if (this.m <= 0) {
            this.m = 0;
            this.q = true;
        }
    }

    public final void d() {
        a7b.f("ViewpagePagin", "computeOffsetTime /pagingCount:" + this.f10195j + "/maxCount:" + this.k + "/curStartOffIndex:" + this.f10196l + "/curEndOffIndex:" + this.m);
        c();
        LocalDateTime localDateTimeMinusDays = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.f), ZoneId.systemDefault()).minusDays((long) this.f10196l);
        LocalDateTime localDateTimeMinusDays2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.g), ZoneId.systemDefault()).minusDays((long) this.m);
        this.h = localDateTimeMinusDays.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long epochMilli = localDateTimeMinusDays2.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        this.i = epochMilli;
        long j2 = this.h;
        long j3 = this.d;
        if (j2 < j3) {
            this.h = j3;
        }
        long j4 = this.f10194e;
        if (epochMilli > j4) {
            this.i = j4;
        }
    }

    public int e() {
        return this.u;
    }

    public void g(int i, long j2) {
        a7b.f("ViewpagePagin", "onPageSelected: index = " + i + "; dataSize=" + this.f10197n.size() + "; date=" + x05.a(j2, "yyyy-MM-dd HH:mm:ss"));
        int i2 = this.k;
        if (i2 <= this.f10195j) {
            a7b.f("ViewpagePagin", "already load all data");
            return;
        }
        if (this.v) {
            a7b.f("ViewpagePagin", "lock ing ...");
            return;
        }
        this.u = i;
        if (this.f10196l >= i2 && i <= 0) {
            a7b.f("ViewpagePagin", "slide to left end");
            return;
        }
        if (this.m <= 0 && ((i >= 29 || this.f10197n.size() < 30) && i > 0)) {
            a7b.f("ViewpagePagin", "slide to right end");
            return;
        }
        if (i == this.f10197n.size() - 1 && this.f10197n.size() < 30) {
            a7b.f("ViewpagePagin", "slide to right end 2");
            return;
        }
        if (i == 0) {
            int iH = h(j2);
            if (iH <= 0) {
                a7b.f("ViewpagePagin", "slide to left end v3");
                return;
            }
            this.v = true;
            this.f10196l = this.f10195j + iH;
            this.m = iH + 1;
            this.r = true;
            a7b.f("ViewpagePagin", "loading left data");
            i();
            return;
        }
        if (i == this.f10197n.size() - 1) {
            int iH2 = h(j2);
            if (iH2 <= 0) {
                a7b.f("ViewpagePagin", "slide to right end v3");
                return;
            }
            this.v = true;
            this.f10196l = iH2 - 1;
            this.m = iH2 - this.f10195j;
            this.s = true;
            a7b.f("ViewpagePagin", "loading right data");
            i();
        }
    }

    public final int h(long j2) {
        int epochDay = (int) (LocalDateTime.ofInstant(Instant.ofEpochMilli(this.f), ZoneId.systemDefault()).toLocalDate().toEpochDay() - LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().toEpochDay());
        if (epochDay <= 1) {
            this.q = true;
        } else if (epochDay >= this.k) {
            this.p = true;
        }
        return epochDay;
    }

    public final void i() {
        d();
        if (this.o != null) {
            a7b.f("ViewpagePagin", "requestCallback loadLeft:" + this.r + "/loadRight:" + this.s + "leftEnd:" + this.p + "rightEnd:" + this.q + "/sendStartTimestamp:" + x05.a(this.h, "yyyy-MM-dd HH:mm:ss") + "/sendEndTimestamp:" + x05.a(this.i, "yyyy-MM-dd HH:mm:ss"));
            this.o.a(this.h, this.i);
        }
    }

    public abstract void j();

    public void k(long j2, boolean z) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault());
        this.d = (localDateTimeOfInstant.getHour() >= this.f10193c ? LocalDateTime.of(localDateTimeOfInstant.toLocalDate(), LocalTime.MIN).withHour(this.f10193c).withMinute(0).withSecond(0).withNano(0) : LocalDateTime.of(localDateTimeOfInstant.toLocalDate().minusDays(1L), LocalTime.MIN).withHour(this.f10193c).withMinute(0).withSecond(0).withNano(0)).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        a7b.f("ViewpagePagin", "first:" + x05.a(this.d, "yyyy-MM-dd HH:mm:ss") + "/time:" + this.d);
        this.f10194e = this.g;
        int epochDay = (int) (LocalDateTime.ofInstant(Instant.ofEpochMilli(this.f10194e), ZoneId.systemDefault()).toLocalDate().toEpochDay() - LocalDateTime.ofInstant(Instant.ofEpochMilli(this.d), ZoneId.systemDefault()).toLocalDate().toEpochDay());
        this.k = epochDay;
        if (z) {
            this.k = epochDay - 1;
        }
        int i = this.f10195j;
        int i2 = this.k;
        if (i > i2) {
            this.f10195j = i2;
        }
        this.f10196l += this.f10195j;
        this.m = 0;
        this.r = true;
        i();
    }

    public void l(long j2) {
        this.b = j2;
        b();
    }

    public final void m(int i) {
        if (this.f10197n.size() <= 0) {
            this.u = i - 1;
        } else if (this.r) {
            this.u = i;
        } else if (this.s) {
            this.u = 29 - i;
        }
        a7b.f("ViewpagePagin", "setCurrentItemIndex currentItemIndex:" + this.u);
    }

    public List<T> n(List<T> list) {
        m(list.size());
        j();
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f10197n);
        arrayList.addAll(list);
        for (Object obj : arrayList) {
            if (obj instanceof HealthChartDayBean) {
                map.put(Long.valueOf(((HealthChartDayBean) obj).getCurPageTimestamp()), obj);
            } else {
                map.put(Long.valueOf(obj.hashCode()), obj);
            }
        }
        a7b.f("ViewpagePagin", "setData() timeMap size:" + map.size());
        ArrayList arrayList2 = new ArrayList(map.values());
        this.f10197n = arrayList2;
        Collections.sort(arrayList2, new Comparator() { // from class: com.oplus.aiunit.vision.bq8
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return cq8.f(obj2, obj3);
            }
        });
        if (this.f10197n.size() > 30) {
            if (this.r) {
                while (30 < this.f10197n.size()) {
                    this.f10197n.remove(30);
                }
            } else if (this.s) {
                while (this.f10197n.size() - 30 > 0) {
                    this.f10197n.remove(0);
                }
            }
        }
        p();
        this.r = false;
        this.s = false;
        this.v = false;
        a7b.f("ViewpagePagin", "setData pageDataList size:" + list.size() + "/mDataList size:" + this.f10197n.size());
        return this.f10197n;
    }

    public void o(int i) {
        this.f10195j = i;
    }

    public abstract void p();
}
