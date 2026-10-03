package com.oplus.aiunit.vision;

import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public class zfa implements Comparator<xfa> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(xfa xfaVar, xfa xfaVar2) {
        int size = xfaVar2.size() - xfaVar.size();
        return size == 0 ? xfaVar.getStart() - xfaVar2.getStart() : size;
    }
}
