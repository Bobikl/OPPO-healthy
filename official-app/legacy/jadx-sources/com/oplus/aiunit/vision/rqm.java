package com.oplus.aiunit.vision;

import com.autonavi.base.ae.gmap.style.StyleItem;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class rqm {
    public Map<Integer, StyleItem> a = new ConcurrentHashMap();
    public Object b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StyleItem[] f16318c;

    public final Map<Integer, StyleItem> a() {
        return this.a;
    }

    public final StyleItem[] b() {
        Map<Integer, StyleItem> map = this.a;
        if (map != null && map.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (StyleItem styleItem : this.a.values()) {
                if (styleItem.isValid()) {
                    arrayList.add(styleItem);
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                StyleItem[] styleItemArr = (StyleItem[]) arrayList.toArray(new StyleItem[size]);
                this.f16318c = styleItemArr;
                return styleItemArr;
            }
        }
        return null;
    }

    public final StyleItem[] c() {
        return this.f16318c;
    }

    public final Object d() {
        return this.b;
    }
}
