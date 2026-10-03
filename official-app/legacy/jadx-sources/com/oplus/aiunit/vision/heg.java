package com.oplus.aiunit.vision;

import com.badlogic.gdx.math.Vector2;

/* JADX INFO: loaded from: classes13.dex */
public class heg extends o1l {
    public geg i;

    public heg(geg gegVar, float f, float f2) {
        this(gegVar, f, f2, new trd());
    }

    public void h(int i, int i2, boolean z) {
        Vector2 vector2A = this.i.a(d(), c(), i, i2);
        int iRound = Math.round(vector2A.x);
        int iRound2 = Math.round(vector2A.y);
        f((i - iRound) / 2, (i2 - iRound2) / 2, iRound, iRound2);
        a(z);
    }

    public heg(geg gegVar, float f, float f2, pv2 pv2Var) {
        this.i = gegVar;
        g(f, f2);
        e(pv2Var);
    }
}
