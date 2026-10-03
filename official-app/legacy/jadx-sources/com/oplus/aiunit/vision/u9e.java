package com.oplus.aiunit.vision;

import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class u9e {
    public double d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f17380e;
    public double f;
    public double g;
    public double h;
    public double i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f17381j;
    public double k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f17382l;
    public double m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f17383n;
    public double o;
    public double p;
    public double q;
    public int a = 3;
    public float b = 0.3f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f17379c = 10.0f;
    public double r = 0.0d;
    public double s = 0.0d;

    public static double a(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        double d = latLng.longitude;
        double d2 = latLng2.longitude;
        double d3 = latLng.latitude;
        double d4 = latLng2.latitude;
        double d5 = latLng3.longitude;
        double d6 = d5 - d2;
        double d7 = latLng3.latitude;
        double d8 = d7 - d4;
        double d9 = (((d - d2) * d6) + ((d3 - d4) * d8)) / ((d6 * d6) + (d8 * d8));
        if (d9 >= 0.0d && (d2 != d5 || d4 != d7)) {
            if (d9 > 1.0d) {
                d4 = d7;
                d2 = d5;
            } else {
                d2 += d6 * d9;
                d4 += d9 * d8;
            }
        }
        return AMapUtils.calculateLineDistance(latLng, new LatLng(d4, d2));
    }

    public static LatLng b(List<LatLng> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public final void c() {
        this.f17381j = 0.001d;
        this.k = 0.001d;
        this.f17382l = 5.698402909980532E-4d;
        this.m = 5.698402909980532E-4d;
    }

    public final LatLng d(double d, double d2, double d3, double d4) {
        this.d = d;
        this.f17380e = d2;
        double d5 = this.f17381j;
        double d6 = this.f17382l;
        double dSqrt = Math.sqrt((d5 * d5) + (d6 * d6)) + this.s;
        this.f17383n = dSqrt;
        double d7 = this.f17381j;
        double dSqrt2 = Math.sqrt((dSqrt * dSqrt) / ((dSqrt * dSqrt) + (d7 * d7))) + this.r;
        this.p = dSqrt2;
        double d8 = this.f17380e;
        double d9 = this.d;
        this.h = ((d8 - d9) * dSqrt2) + d9;
        double d10 = this.f17383n;
        this.f17382l = Math.sqrt((1.0d - dSqrt2) * d10 * d10);
        this.f = d3;
        this.g = d4;
        double d11 = this.k;
        double d12 = this.m;
        double dSqrt3 = Math.sqrt((d11 * d11) + (d12 * d12)) + this.s;
        this.o = dSqrt3;
        double d13 = this.k;
        double dSqrt4 = Math.sqrt((dSqrt3 * dSqrt3) / ((dSqrt3 * dSqrt3) + (d13 * d13))) + this.r;
        this.q = dSqrt4;
        double d14 = this.g;
        double d15 = this.f;
        this.i = ((d14 - d15) * dSqrt4) + d15;
        double d16 = 1.0d - dSqrt4;
        double d17 = this.o;
        this.m = Math.sqrt(d16 * d17 * d17);
        return new LatLng(this.i, this.h);
    }

    public final List<LatLng> e(List<LatLng> list, int i) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 2) {
            c();
            LatLng latLng = list.get(0);
            arrayList.add(latLng);
            for (int i2 = 1; i2 < list.size(); i2++) {
                LatLng latLngF = f(latLng, list.get(i2), i);
                if (latLngF != null) {
                    arrayList.add(latLngF);
                    latLng = latLngF;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a A[PHI: r1
  0x001a: PHI (r1v5 int) = (r1v0 int), (r1v1 int) binds: [B:12:0x0018, B:15:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    public final LatLng f(LatLng latLng, LatLng latLng2, int i) {
        if (this.f17381j == 0.0d || this.k == 0.0d) {
            c();
        }
        LatLng latLngD = null;
        if (latLng != null && latLng2 != null) {
            int i2 = 1;
            if (i < 1) {
                i = i2;
            } else {
                i2 = 5;
                if (i > 5) {
                    i = i2;
                }
            }
            int i3 = 0;
            while (i3 < i) {
                latLngD = d(latLng.longitude, latLng2.longitude, latLng.latitude, latLng2.latitude);
                i3++;
                latLng2 = latLngD;
            }
        }
        return latLngD;
    }

    public List<LatLng> g(List<LatLng> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("originlist: ");
        sb.append(list.size());
        List<LatLng> listJ = j(list);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("list: ");
        sb2.append(listJ.size());
        List<LatLng> listE = e(listJ, this.a);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("afterList: ");
        sb3.append(listE.size());
        List<LatLng> listI = i(listE, this.b);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("pathoptimizeList: ");
        sb4.append(listI.size());
        return listI.size() != 0 ? listI : list;
    }

    public final List<LatLng> h(List<LatLng> list, float f) {
        if (list == null) {
            return null;
        }
        if (list.size() <= 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            LatLng latLngB = b(arrayList);
            LatLng latLng = list.get(i);
            if (latLngB == null || i == list.size() - 1) {
                arrayList.add(latLng);
            } else if (a(latLng, latLngB, list.get(i + 1)) < f) {
                arrayList.add(latLng);
            }
        }
        return arrayList;
    }

    public final List<LatLng> i(List<LatLng> list, float f) {
        if (list == null) {
            return null;
        }
        if (list.size() <= 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            LatLng latLngB = b(arrayList);
            LatLng latLng = list.get(i);
            if (latLngB == null || i == list.size() - 1) {
                arrayList.add(latLng);
            } else if (a(latLng, latLngB, list.get(i + 1)) > f) {
                arrayList.add(latLng);
            }
        }
        return arrayList;
    }

    public List<LatLng> j(List<LatLng> list) {
        return h(list, this.f17379c);
    }

    public void k(int i) {
        this.a = i;
    }
}
