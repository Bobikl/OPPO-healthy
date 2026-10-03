package com.oplus.aiunit.vision;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public class tme {
    public static final String CHINESE = "zh-CN";
    public static final String ENGLISH = "en";
    public static final String EXTENSIONS_ALL = "all";
    public static final String EXTENSIONS_BASE = "base";
    public hv9 a;

    public interface a {
        void a(sme smeVar, int i);

        void b(PoiItem poiItem, int i);
    }

    public static class b implements Cloneable {
        public String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f17057j;
        public String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f17058l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f17059n;
        public boolean o;
        public boolean p;
        public String q;
        public boolean r;
        public LatLonPoint s;
        public boolean t;
        public Map<String, String> u;
        public String v;

        public b(String str, String str2) {
            this(str, str2, null);
        }

        public static String a() {
            return "";
        }

        public void A(boolean z) {
            this.r = z;
        }

        public void B(String str) {
            this.v = str;
        }

        public void C(LatLonPoint latLonPoint) {
            this.s = latLonPoint;
        }

        public void D(int i) {
            if (i <= 0) {
                i = 1;
            }
            this.f17058l = i;
        }

        public void E(int i) {
            if (i <= 0) {
                this.m = 20;
            } else if (i > 30) {
                this.m = 30;
            } else {
                this.m = i;
            }
        }

        public void F(String str) {
            if ("en".equals(str)) {
                this.f17059n = "en";
            } else {
                this.f17059n = "zh-CN";
            }
        }

        public void G(boolean z) {
            this.t = z;
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e2) {
                qxm.g(e2, "PoiSearch", "queryclone");
            }
            b bVar = new b(this.i, this.f17057j, this.k);
            bVar.D(this.f17058l);
            bVar.E(this.m);
            bVar.F(this.f17059n);
            bVar.y(this.o);
            bVar.w(this.p);
            bVar.x(this.q);
            bVar.C(this.s);
            bVar.A(this.r);
            bVar.G(this.t);
            bVar.B(this.v);
            bVar.z(this.u);
            return bVar;
        }

        public String c() {
            return this.q;
        }

        public String d() {
            String str = this.f17057j;
            return (str == null || str.equals("00") || this.f17057j.equals("00|")) ? a() : this.f17057j;
        }

        public String e() {
            return this.k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f17058l == bVar.f17058l && this.m == bVar.m && this.o == bVar.o && this.p == bVar.p && this.r == bVar.r && this.t == bVar.t && Objects.equals(this.i, bVar.i) && Objects.equals(this.f17057j, bVar.f17057j) && Objects.equals(this.k, bVar.k) && Objects.equals(this.f17059n, bVar.f17059n) && Objects.equals(this.q, bVar.q) && Objects.equals(this.s, bVar.s) && Objects.equals(this.u, bVar.u)) {
                return Objects.equals(this.v, bVar.v);
            }
            return false;
        }

        public boolean f() {
            return this.o;
        }

        public int hashCode() {
            String str = this.i;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f17057j;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.k;
            int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f17058l) * 31) + this.m) * 31;
            String str4 = this.f17059n;
            int iHashCode4 = (((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31;
            String str5 = this.q;
            int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.r ? 1 : 0)) * 31;
            LatLonPoint latLonPoint = this.s;
            int iHashCode6 = (((iHashCode5 + (latLonPoint != null ? latLonPoint.hashCode() : 0)) * 31) + (this.t ? 1 : 0)) * 31;
            Map<String, String> map = this.u;
            int iHashCode7 = (iHashCode6 + (map != null ? map.hashCode() : 0)) * 31;
            String str6 = this.v;
            return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public Map<String, String> i() {
            return this.u;
        }

        public String j() {
            return this.v;
        }

        public LatLonPoint k() {
            return this.s;
        }

        public int m() {
            return this.f17058l;
        }

        public int q() {
            return this.m;
        }

        public String r() {
            return this.i;
        }

        public boolean s() {
            return this.r;
        }

        public boolean t() {
            return this.p;
        }

        public boolean u() {
            return this.t;
        }

        public boolean v(b bVar) {
            if (bVar == null) {
                return false;
            }
            if (bVar == this) {
                return true;
            }
            return tme.b(bVar.i, this.i) && tme.b(bVar.f17057j, this.f17057j) && tme.b(bVar.f17059n, this.f17059n) && tme.b(bVar.k, this.k) && tme.b(bVar.v, this.v) && tme.b(bVar.q, this.q) && bVar.o == this.o && bVar.m == this.m && bVar.r == this.r && bVar.u.equals(this.u) && bVar.t == this.t;
        }

        public void w(boolean z) {
            this.p = z;
        }

        public void x(String str) {
            this.q = str;
        }

        public void y(boolean z) {
            this.o = z;
        }

        public void z(Map<String, String> map) {
            if (map != null) {
                this.u.putAll(map);
            }
        }

        public b(String str, String str2, String str3) {
            this.f17058l = 1;
            this.m = 20;
            this.f17059n = "zh-CN";
            this.o = false;
            this.p = false;
            this.r = true;
            this.t = true;
            this.u = new HashMap();
            this.v = "base";
            this.i = str;
            this.f17057j = str2;
            this.k = str3;
        }
    }

    public tme(Context context, b bVar) throws AMapException {
        this.a = null;
        try {
            this.a = new com.amap.api.col.p0003sl.d0(context, bVar);
        } catch (Exception e2) {
            e2.printStackTrace();
            if (e2 instanceof AMapException) {
                throw ((AMapException) e2);
            }
        }
    }

    public static boolean b(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public void c() {
        hv9 hv9Var = this.a;
        if (hv9Var != null) {
            hv9Var.a();
        }
    }

    public void d(c cVar) {
        hv9 hv9Var = this.a;
        if (hv9Var != null) {
            hv9Var.b(cVar);
        }
    }

    public void setOnPoiSearchListener(a aVar) {
        hv9 hv9Var = this.a;
        if (hv9Var != null) {
            hv9Var.setOnPoiSearchListener(aVar);
        }
    }

    public static class c implements Cloneable {
        public static final String BOUND_SHAPE = "Bound";
        public static final String ELLIPSE_SHAPE = "Ellipse";
        public static final String POLYGON_SHAPE = "Polygon";
        public static final String RECTANGLE_SHAPE = "Rectangle";
        public LatLonPoint i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public LatLonPoint f17060j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LatLonPoint f17061l;
        public String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f17062n;
        public List<LatLonPoint> o;

        public c(LatLonPoint latLonPoint, int i) {
            this.f17062n = true;
            this.m = BOUND_SHAPE;
            this.k = i;
            this.f17061l = latLonPoint;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e2) {
                qxm.g(e2, "PoiSearch", "SearchBoundClone");
            }
            return new c(this.i, this.f17060j, this.k, this.f17061l, this.m, this.o, this.f17062n);
        }

        public LatLonPoint b() {
            return this.f17061l;
        }

        public LatLonPoint c() {
            return this.i;
        }

        public List<LatLonPoint> d() {
            return this.o;
        }

        public int e() {
            return this.k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            LatLonPoint latLonPoint = this.f17061l;
            if (latLonPoint == null) {
                if (cVar.f17061l != null) {
                    return false;
                }
            } else if (!latLonPoint.equals(cVar.f17061l)) {
                return false;
            }
            if (this.f17062n != cVar.f17062n) {
                return false;
            }
            LatLonPoint latLonPoint2 = this.i;
            if (latLonPoint2 == null) {
                if (cVar.i != null) {
                    return false;
                }
            } else if (!latLonPoint2.equals(cVar.i)) {
                return false;
            }
            LatLonPoint latLonPoint3 = this.f17060j;
            if (latLonPoint3 == null) {
                if (cVar.f17060j != null) {
                    return false;
                }
            } else if (!latLonPoint3.equals(cVar.f17060j)) {
                return false;
            }
            List<LatLonPoint> list = this.o;
            if (list == null) {
                if (cVar.o != null) {
                    return false;
                }
            } else if (!list.equals(cVar.o)) {
                return false;
            }
            if (this.k != cVar.k) {
                return false;
            }
            String str = this.m;
            if (str == null) {
                if (cVar.m != null) {
                    return false;
                }
            } else if (!str.equals(cVar.m)) {
                return false;
            }
            return true;
        }

        public String f() {
            return this.m;
        }

        public int hashCode() {
            LatLonPoint latLonPoint = this.f17061l;
            int iHashCode = ((((latLonPoint == null ? 0 : latLonPoint.hashCode()) + 31) * 31) + (this.f17062n ? 1231 : 1237)) * 31;
            LatLonPoint latLonPoint2 = this.i;
            int iHashCode2 = (iHashCode + (latLonPoint2 == null ? 0 : latLonPoint2.hashCode())) * 31;
            LatLonPoint latLonPoint3 = this.f17060j;
            int iHashCode3 = (iHashCode2 + (latLonPoint3 == null ? 0 : latLonPoint3.hashCode())) * 31;
            List<LatLonPoint> list = this.o;
            int iHashCode4 = (((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.k) * 31;
            String str = this.m;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public LatLonPoint i() {
            return this.f17060j;
        }

        public boolean j() {
            return this.f17062n;
        }

        public c(LatLonPoint latLonPoint, LatLonPoint latLonPoint2, int i, LatLonPoint latLonPoint3, String str, List<LatLonPoint> list, boolean z) {
            this.i = latLonPoint;
            this.f17060j = latLonPoint2;
            this.k = i;
            this.f17061l = latLonPoint3;
            this.m = str;
            this.o = list;
            this.f17062n = z;
        }
    }
}
