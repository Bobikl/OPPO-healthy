package com.oplus.aiunit.vision;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public class l9e extends xoa<PointF> {

    @Nullable
    public Path q;
    public final xoa<PointF> r;

    public l9e(wg6 wg6Var, xoa<PointF> xoaVar) {
        super(wg6Var, xoaVar.b, xoaVar.f18704c, xoaVar.d, xoaVar.f18705e, xoaVar.f, xoaVar.g, xoaVar.h);
        this.r = xoaVar;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t;
        T t2;
        T t3 = this.f18704c;
        boolean z = (t3 == 0 || (t2 = this.b) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.b;
        if (t4 == 0 || (t = this.f18704c) == 0 || z) {
            return;
        }
        xoa<PointF> xoaVar = this.r;
        this.q = prk.d((PointF) t4, (PointF) t, xoaVar.o, xoaVar.p);
    }

    @Nullable
    public Path k() {
        return this.q;
    }
}
