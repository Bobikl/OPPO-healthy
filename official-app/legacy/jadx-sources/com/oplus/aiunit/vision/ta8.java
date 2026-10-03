package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ta8 extends zoa<ra8> {
    public final ra8 i;

    public ta8(List<xoa<ra8>> list) {
        super(list);
        ra8 ra8Var = list.get(0).b;
        int iE = ra8Var != null ? ra8Var.e() : 0;
        this.i = new ra8(new float[iE], new int[iE]);
    }

    @Override // com.oplus.aiunit.vision.w51
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ra8 i(xoa<ra8> xoaVar, float f) {
        this.i.f(xoaVar.b, xoaVar.f18704c, f);
        return this.i;
    }
}
