package com.oplus.aiunit.vision;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes13.dex */
public final class krk {
    public static jck a(List<pke> list) {
        TreeSet treeSet = new TreeSet();
        jck.b bVarD = jck.d();
        if (list == null) {
            return null;
        }
        for (pke pkeVar : list) {
            if (pkeVar != null && pkeVar.a() != null) {
                treeSet.addAll(pkeVar.a());
            }
        }
        if (treeSet.size() <= 0) {
            return null;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            bVarD.a((String) it.next());
        }
        return bVarD.b();
    }
}
