package com.oplus.aiunit.vision;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ksg {
    public static List<dac> a(List<dac> list, List<dac> list2) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        if (list2 == null || list2.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!list.contains(it.next())) {
                it.remove();
            }
        }
        return arrayList;
    }

    public static List<String> b(List<Pair<String, Integer>> list, List<String> list2) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        if (list2 == null || list2.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list2);
        Iterator it = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Pair<String, Integer>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) it2.next().first);
        }
        while (it.hasNext()) {
            if (!arrayList2.contains(it.next())) {
                it.remove();
            }
        }
        return arrayList;
    }
}
