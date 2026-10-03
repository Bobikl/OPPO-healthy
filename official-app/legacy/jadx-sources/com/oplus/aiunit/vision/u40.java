package com.oplus.aiunit.vision;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class u40 implements i50<PointF, PointF> {
    public final e40 a;
    public final e40 b;

    public u40(e40 e40Var, e40 e40Var2) {
        this.a = e40Var;
        this.b = e40Var2;
    }

    @Override // com.oplus.aiunit.vision.i50
    public w51<PointF, PointF> a() {
        return new f7i(this.a.a(), this.b.a());
    }

    @Override // com.oplus.aiunit.vision.i50
    public List<xoa<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.oplus.aiunit.vision.i50
    public boolean isStatic() {
        return this.a.isStatic() && this.b.isStatic();
    }
}
