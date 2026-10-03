package com.oplus.aiunit.vision;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class k40 implements i50<PointF, PointF> {
    public final List<xoa<PointF>> a;

    public k40(List<xoa<PointF>> list) {
        this.a = list;
    }

    @Override // com.oplus.aiunit.vision.i50
    public w51<PointF, PointF> a() {
        return this.a.get(0).i() ? new yme(this.a) : new n9e(this.a);
    }

    @Override // com.oplus.aiunit.vision.i50
    public List<xoa<PointF>> b() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.i50
    public boolean isStatic() {
        return this.a.size() == 1 && this.a.get(0).i();
    }
}
