package com.oplus.aiunit.vision;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class l40 implements j50<PointF, PointF> {
    public final List<yoa<PointF>> a;

    public l40(List<yoa<PointF>> list) {
        this.a = list;
    }

    @Override // com.oplus.aiunit.vision.j50
    public v51<PointF, PointF> a() {
        return this.a.get(0).i() ? new zme(this.a) : new o9e(this.a);
    }

    @Override // com.oplus.aiunit.vision.j50
    public List<yoa<PointF>> b() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.j50
    public boolean isStatic() {
        return this.a.size() == 1 && this.a.get(0).i();
    }
}
