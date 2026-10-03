package com.oplus.aiunit.vision;

import com.amap.api.services.core.PoiItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class sme {
    public int a;
    public ArrayList<PoiItem> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tme.b f16653c;
    public tme.c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<String> f16654e;
    public List<g3j> f;
    public int g;

    public sme(tme.b bVar, tme.c cVar, List<String> list, List<g3j> list2, int i, int i2, ArrayList<PoiItem> arrayList) {
        this.b = new ArrayList<>();
        this.f16653c = bVar;
        this.d = cVar;
        this.f16654e = list;
        this.f = list2;
        this.g = i;
        this.a = a(i2);
        this.b = arrayList;
    }

    public static sme b(tme.b bVar, tme.c cVar, List<String> list, List<g3j> list2, int i, int i2, ArrayList<PoiItem> arrayList) {
        return new sme(bVar, cVar, list, list2, i, i2, arrayList);
    }

    public final int a(int i) {
        int i2 = this.g;
        return ((i + i2) - 1) / i2;
    }
}
