package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ua8 extends apa<sa8> {
    public final sa8 i;

    public ua8(List<yoa<sa8>> list) {
        super(list);
        int iMax = 0;
        for (int i = 0; i < list.size(); i++) {
            sa8 sa8Var = list.get(i).b;
            if (sa8Var != null) {
                iMax = Math.max(iMax, sa8Var.f());
            }
        }
        this.i = new sa8(new float[iMax], new int[iMax]);
    }

    @Override // com.oplus.aiunit.vision.v51
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public sa8 i(yoa<sa8> yoaVar, float f) {
        this.i.g(yoaVar.b, yoaVar.f19086c, f);
        return this.i;
    }
}
