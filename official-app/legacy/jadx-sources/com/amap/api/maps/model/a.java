package com.amap.api.maps.model;

import com.autonavi.amap.mapcore.DPoint;
import com.oplus.aiunit.vision.vqm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
final class a {
    private final vqm a;
    private final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<WeightedLatLng> f910c;
    private List<a> d;

    public a(vqm vqmVar) {
        this(vqmVar, 0);
    }

    public final void a(WeightedLatLng weightedLatLng) {
        DPoint point = weightedLatLng.getPoint();
        if (this.a.a(point.x, point.y)) {
            a(point.x, point.y, weightedLatLng);
        }
    }

    private a(double d, double d2, double d3, double d4, int i) {
        this(new vqm(d, d2, d3, d4), i);
    }

    private a(vqm vqmVar, int i) {
        this.d = null;
        this.a = vqmVar;
        this.b = i;
    }

    private void a(double d, double d2, WeightedLatLng weightedLatLng) {
        List<a> list = this.d;
        if (list != null) {
            vqm vqmVar = this.a;
            if (d2 < vqmVar.f) {
                if (d < vqmVar.f17960e) {
                    list.get(0).a(d, d2, weightedLatLng);
                    return;
                } else {
                    list.get(1).a(d, d2, weightedLatLng);
                    return;
                }
            }
            if (d < vqmVar.f17960e) {
                list.get(2).a(d, d2, weightedLatLng);
                return;
            } else {
                list.get(3).a(d, d2, weightedLatLng);
                return;
            }
        }
        if (this.f910c == null) {
            this.f910c = new ArrayList();
        }
        this.f910c.add(weightedLatLng);
        if (this.f910c.size() <= 50 || this.b >= 40) {
            return;
        }
        a();
    }

    private void a() {
        ArrayList arrayList = new ArrayList(4);
        this.d = arrayList;
        vqm vqmVar = this.a;
        arrayList.add(new a(vqmVar.a, vqmVar.f17960e, vqmVar.b, vqmVar.f, this.b + 1));
        List<a> list = this.d;
        vqm vqmVar2 = this.a;
        list.add(new a(vqmVar2.f17960e, vqmVar2.f17959c, vqmVar2.b, vqmVar2.f, this.b + 1));
        List<a> list2 = this.d;
        vqm vqmVar3 = this.a;
        list2.add(new a(vqmVar3.a, vqmVar3.f17960e, vqmVar3.f, vqmVar3.d, this.b + 1));
        List<a> list3 = this.d;
        vqm vqmVar4 = this.a;
        list3.add(new a(vqmVar4.f17960e, vqmVar4.f17959c, vqmVar4.f, vqmVar4.d, this.b + 1));
        List<WeightedLatLng> list4 = this.f910c;
        this.f910c = null;
        for (WeightedLatLng weightedLatLng : list4) {
            a(weightedLatLng.getPoint().x, weightedLatLng.getPoint().y, weightedLatLng);
        }
    }

    public final Collection<WeightedLatLng> a(vqm vqmVar) {
        ArrayList arrayList = new ArrayList();
        a(vqmVar, arrayList);
        return arrayList;
    }

    private void a(vqm vqmVar, Collection<WeightedLatLng> collection) {
        if (this.a.d(vqmVar)) {
            List<a> list = this.d;
            if (list != null) {
                Iterator<a> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(vqmVar, collection);
                }
            } else if (this.f910c != null) {
                if (vqmVar.e(this.a)) {
                    collection.addAll(this.f910c);
                    return;
                }
                for (WeightedLatLng weightedLatLng : this.f910c) {
                    if (vqmVar.c(weightedLatLng.getPoint())) {
                        collection.add(weightedLatLng);
                    }
                }
            }
        }
    }
}
