package com.oplus.aiunit.vision;

import com.oplus.anim.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class lck implements d74, w51.b {
    public final String a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<w51.b> f13636c = new ArrayList();
    public final ShapeTrimPath.Type d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w51<?, Float> f13637e;
    public final w51<?, Float> f;
    public final w51<?, Float> g;

    public lck(com.oplus.anim.model.layer.a aVar, ShapeTrimPath shapeTrimPath) {
        this.a = shapeTrimPath.c();
        this.b = shapeTrimPath.g();
        this.d = shapeTrimPath.f();
        w51<Float, Float> w51VarA = shapeTrimPath.e().a();
        this.f13637e = w51VarA;
        w51<Float, Float> w51VarA2 = shapeTrimPath.b().a();
        this.f = w51VarA2;
        w51<Float, Float> w51VarA3 = shapeTrimPath.d().a();
        this.g = w51VarA3;
        aVar.i(w51VarA);
        aVar.i(w51VarA2);
        aVar.i(w51VarA3);
        w51VarA.a(this);
        w51VarA2.a(this);
        w51VarA3.a(this);
    }

    public void b(w51.b bVar) {
        this.f13636c.add(bVar);
    }

    @Override // com.oplus.aiunit.vision.w51.b
    public void d() {
        for (int i = 0; i < this.f13636c.size(); i++) {
            this.f13636c.get(i).d();
        }
    }

    @Override // com.oplus.aiunit.vision.d74
    public void e(List<d74> list, List<d74> list2) {
    }

    public w51<?, Float> g() {
        return this.f;
    }

    public w51<?, Float> h() {
        return this.g;
    }

    public w51<?, Float> i() {
        return this.f13637e;
    }

    public ShapeTrimPath.Type j() {
        return this.d;
    }

    public boolean k() {
        return this.b;
    }
}
