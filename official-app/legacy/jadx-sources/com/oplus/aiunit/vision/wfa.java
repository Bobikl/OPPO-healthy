package com.oplus.aiunit.vision;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.ahocorasick.interval.IntervalNode;

/* JADX INFO: loaded from: classes11.dex */
public class wfa {
    public IntervalNode a;

    public wfa(List<xfa> list) {
        this.a = null;
        this.a = new IntervalNode(list);
    }

    public List<xfa> a(xfa xfaVar) {
        return this.a.g(xfaVar);
    }

    public List<xfa> b(List<xfa> list) {
        Collections.sort(list, new zfa());
        TreeSet treeSet = new TreeSet();
        for (xfa xfaVar : list) {
            if (!treeSet.contains(xfaVar)) {
                treeSet.addAll(a(xfaVar));
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            list.remove((xfa) it.next());
        }
        Collections.sort(list, new yfa());
        return list;
    }
}
