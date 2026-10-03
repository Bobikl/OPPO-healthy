package com.oplus.aiunit.vision;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class m9e extends yoa<PointF> {

    @Nullable
    public Path q;
    public final yoa<PointF> r;

    public m9e(k9b k9bVar, yoa<PointF> yoaVar) {
        super(k9bVar, yoaVar.b, yoaVar.f19086c, yoaVar.d, yoaVar.f19087e, yoaVar.f, yoaVar.g, yoaVar.h);
        this.r = yoaVar;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t;
        T t2;
        T t3 = this.f19086c;
        boolean z = (t3 == 0 || (t2 = this.b) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.b;
        if (t4 == 0 || (t = this.f19086c) == 0 || z) {
            return;
        }
        yoa<PointF> yoaVar = this.r;
        this.q = frk.d((PointF) t4, (PointF) t, yoaVar.o, yoaVar.p);
    }

    @Nullable
    public Path k() {
        return this.q;
    }
}
