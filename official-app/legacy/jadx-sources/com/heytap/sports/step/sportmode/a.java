package com.heytap.sports.step.sportmode;

import com.amap.api.maps.model.LatLng;
import com.heytap.health.location.HMapLocation;
import com.heytap.sports.map.model.TrackPoint;
import com.oplus.aiunit.vision.pfb;
import com.oplus.aiunit.vision.u9e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public final u9e b;
    public List<TrackPoint> a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8108c = 0;

    /* JADX INFO: renamed from: com.heytap.sports.step.sportmode.a$a, reason: collision with other inner class name */
    @FunctionalInterface
    public interface InterfaceC0793a {
        void a(TrackPoint trackPoint);
    }

    public a() {
        u9e u9eVar = new u9e();
        this.b = u9eVar;
        u9eVar.k(3);
    }

    public double a(HMapLocation hMapLocation, boolean z, InterfaceC0793a interfaceC0793a) {
        LatLng latLng = new LatLng(hMapLocation.getLatitude(), hMapLocation.getLongitude());
        if (this.a.size() <= 3) {
            this.a.add(new TrackPoint(latLng, hMapLocation.getTime(), hMapLocation.getSpeed(), hMapLocation.getBearing(), z));
            return 0.0d;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 3; i >= 0; i--) {
            if (i != 0) {
                List<TrackPoint> list = this.a;
                arrayList.add(list.get(list.size() - i).getLocation());
            } else {
                arrayList.add(latLng);
            }
        }
        List<LatLng> listG = this.b.g(arrayList);
        if (!listG.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("calGpsDistance save point =");
            sb.append(this.a.size());
            TrackPoint trackPoint = new TrackPoint(listG.get(listG.size() - 1), hMapLocation.getTime(), hMapLocation.getSpeed(), hMapLocation.getBearing(), false);
            this.a.add(trackPoint);
            d(trackPoint, interfaceC0793a);
            if (this.a.size() > 21) {
                this.a.remove(0);
            }
        }
        List<TrackPoint> list2 = this.a;
        long timeStamp = list2.get(list2.size() - 1).getTimeStamp();
        List<TrackPoint> list3 = this.a;
        this.f8108c = timeStamp - list3.get(list3.size() - 2).getTimeStamp();
        List<TrackPoint> list4 = this.a;
        LatLng location = list4.get(list4.size() - 2).getLocation();
        List<TrackPoint> list5 = this.a;
        return pfb.c(location, list5.get(list5.size() - 1).getLocation());
    }

    public List<TrackPoint> b() {
        return this.a;
    }

    public long c() {
        return this.f8108c;
    }

    public final void d(TrackPoint trackPoint, InterfaceC0793a interfaceC0793a) {
        if (interfaceC0793a == null || this.a.size() <= 3) {
            return;
        }
        interfaceC0793a.a(trackPoint);
    }

    public void e(List<TrackPoint> list) {
        this.a = list;
    }
}
