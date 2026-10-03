package com.oplus.aiunit.vision;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class v40 implements j50<PointF, PointF> {
    public final f40 a;
    public final f40 b;

    public v40(f40 f40Var, f40 f40Var2) {
        this.a = f40Var;
        this.b = f40Var2;
    }

    @Override // com.oplus.aiunit.vision.j50
    public v51<PointF, PointF> a() {
        return new g7i(this.a.a(), this.b.a());
    }

    @Override // com.oplus.aiunit.vision.j50
    public List<yoa<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.oplus.aiunit.vision.j50
    public boolean isStatic() {
        return this.a.isStatic() && this.b.isStatic();
    }
}
