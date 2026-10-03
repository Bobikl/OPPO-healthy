package com.oplus.aiunit.vision;

import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public class yfa implements Comparator<xfa> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(xfa xfaVar, xfa xfaVar2) {
        return xfaVar.getStart() - xfaVar2.getStart();
    }
}
