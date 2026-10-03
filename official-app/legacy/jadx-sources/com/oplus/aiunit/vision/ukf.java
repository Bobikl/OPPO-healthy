package com.oplus.aiunit.vision;

import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class ukf {
    public LatLonPoint a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17508c = f58.AMAP;
    public String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17509e = "distance";
    public String f = "base";

    public ukf(LatLonPoint latLonPoint, float f, String str) {
        this.a = latLonPoint;
        this.b = f;
        g(str);
    }

    public String a() {
        return this.f;
    }

    public String b() {
        return this.f17508c;
    }

    public String c() {
        return this.f17509e;
    }

    public String d() {
        return this.d;
    }

    public LatLonPoint e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ukf ukfVar = (ukf) obj;
        String str = this.f17508c;
        if (str == null) {
            if (ukfVar.f17508c != null) {
                return false;
            }
        } else if (!str.equals(ukfVar.f17508c)) {
            return false;
        }
        LatLonPoint latLonPoint = this.a;
        if (latLonPoint == null) {
            if (ukfVar.a != null) {
                return false;
            }
        } else if (!latLonPoint.equals(ukfVar.a)) {
            return false;
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(ukfVar.b) || !this.f17509e.equals(ukfVar.f17509e)) {
            return false;
        }
        String str2 = this.f;
        if (str2 == null) {
            if (ukfVar.f != null) {
                return false;
            }
        } else if (!str2.equals(ukfVar.f)) {
            return false;
        }
        return true;
    }

    public float f() {
        return this.b;
    }

    public void g(String str) {
        if (str != null) {
            if (str.equals(f58.AMAP) || str.equals(f58.GPS)) {
                this.f17508c = str;
            }
        }
    }

    public int hashCode() {
        String str = this.f17508c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        LatLonPoint latLonPoint = this.a;
        return ((iHashCode + (latLonPoint != null ? latLonPoint.hashCode() : 0)) * 31) + Float.floatToIntBits(this.b);
    }
}
