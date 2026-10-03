package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class uxm {
    public final Set<String> a;
    public final Map<String, String> b = new HashMap();

    public uxm(Set<String> set) {
        this.a = set;
    }

    public Map<String, List<String>> a() {
        HashMap map = new HashMap(0);
        for (String str : this.a) {
            String[] strArrA = bsm.a(str);
            if (strArrA != null && strArrA.length > 0) {
                ArrayList arrayList = new ArrayList();
                Collections.addAll(arrayList, strArrA);
                map.put(str, arrayList);
                for (String str2 : strArrA) {
                    this.b.put(str2, str);
                }
            }
        }
        return map;
    }

    public List<String> b() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.a) {
            String[] strArrC = bsm.c(str);
            if (strArrC != null && strArrC.length > 0) {
                Collections.addAll(arrayList, strArrC);
                for (String str2 : strArrC) {
                    this.b.put(str2, str);
                }
            }
        }
        return arrayList;
    }

    public List<String> c() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.a) {
            String[] strArrD = bsm.d(str);
            if (strArrD != null && strArrD.length > 0) {
                Collections.addAll(arrayList, strArrD);
                for (String str2 : strArrD) {
                    this.b.put(str2, str);
                }
            }
        }
        return arrayList;
    }
}
