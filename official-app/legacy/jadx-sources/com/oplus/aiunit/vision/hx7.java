package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes13.dex */
public final class hx7 implements qrg {
    public static final ln6.a a = new ln6.a();

    @Override // com.oplus.aiunit.vision.qrg
    public List<jl6> a(Collection<jl6> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList<jl6> arrayList = new ArrayList(collection);
        Collections.sort(arrayList, a);
        TreeSet treeSet = new TreeSet();
        int end = -1;
        for (jl6 jl6Var : arrayList) {
            if (jl6Var.getStart() <= end || jl6Var.getEnd() <= end) {
                treeSet.add(jl6Var);
            } else {
                end = jl6Var.getEnd();
            }
        }
        arrayList.removeAll(treeSet);
        return arrayList;
    }
}
