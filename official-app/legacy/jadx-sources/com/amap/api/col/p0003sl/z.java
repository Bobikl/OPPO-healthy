package com.amap.api.col.p0003sl;

import com.amap.api.services.core.LatLonPoint;
import com.oplus.aiunit.vision.qxm;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class z extends y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f868j;

    public static class a {
        public LatLonPoint a;
        public double b;

        public a(double d, double d2, double d3) {
            this.a = null;
            this.b = 0.0d;
            this.a = new LatLonPoint(d, d2);
            this.b = d3;
        }

        public final boolean a(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                LatLonPoint latLonPoint = this.a;
                a aVar = (a) obj;
                LatLonPoint latLonPoint2 = aVar.a;
                if (latLonPoint == latLonPoint2) {
                    return true;
                }
                if (latLonPoint != null && qxm.b(latLonPoint, latLonPoint2) <= aVar.b) {
                    return true;
                }
            }
            return false;
        }
    }

    public z(String... strArr) {
        super(strArr);
        this.f868j = 0.0d;
    }

    @Override // com.amap.api.col.p0003sl.y
    public final void c(x.a aVar) {
        super.c(aVar);
        if (aVar != null) {
            this.f868j = aVar.h();
        }
    }

    @Override // com.amap.api.col.p0003sl.y
    public final boolean f(LinkedHashMap<x.b, Object> linkedHashMap, x.b bVar) {
        String str;
        if (linkedHashMap != null && bVar != null) {
            if (bVar.b == null) {
                return super.f(linkedHashMap, bVar);
            }
            for (x.b bVar2 : linkedHashMap.keySet()) {
                if (bVar2 != null && (str = bVar2.a) != null && str.equals(bVar.a)) {
                    Object obj = bVar2.b;
                    if ((obj instanceof a) && ((a) obj).a(bVar.b)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amap.api.col.p0003sl.y
    public final Object g(LinkedHashMap<x.b, Object> linkedHashMap, x.b bVar) {
        String str;
        if (linkedHashMap != null && bVar != null) {
            if (bVar.b == null) {
                return super.g(linkedHashMap, bVar);
            }
            for (x.b bVar2 : linkedHashMap.keySet()) {
                if (bVar2 != null && (str = bVar2.a) != null && str.equals(bVar.a)) {
                    Object obj = bVar2.b;
                    if ((obj instanceof a) && ((a) obj).a(bVar.b)) {
                        return linkedHashMap.get(bVar2);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    @Override // com.amap.api.col.p0003sl.y
    public final Object k(LinkedHashMap<x.b, Object> linkedHashMap, x.b bVar) {
        String str;
        if (linkedHashMap != null && bVar != null) {
            if (bVar.b == null) {
                return super.k(linkedHashMap, bVar);
            }
            for (x.b bVar2 : linkedHashMap.keySet()) {
                if (bVar2 != null && (str = bVar2.a) != null && str.equals(bVar.a)) {
                    Object obj = bVar2.b;
                    if ((obj instanceof a) && ((a) obj).a(bVar.b)) {
                        if (bVar2 != null) {
                            return linkedHashMap.remove(bVar2);
                        }
                    }
                }
            }
            bVar2 = null;
            if (bVar2 != null) {
                return linkedHashMap.remove(bVar2);
            }
        }
        return null;
    }

    public final double l() {
        return this.f868j;
    }
}
