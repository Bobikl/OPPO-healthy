package com.oplus.aiunit.vision;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class mck implements e74, v51.b {
    public final String a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<v51.b> f14027c = new ArrayList();
    public final ShapeTrimPath.Type d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v51<?, Float> f14028e;
    public final v51<?, Float> f;
    public final v51<?, Float> g;

    public mck(com.airbnb.lottie.model.layer.a aVar, ShapeTrimPath shapeTrimPath) {
        this.a = shapeTrimPath.c();
        this.b = shapeTrimPath.g();
        this.d = shapeTrimPath.f();
        lt7 lt7VarA = shapeTrimPath.e().a();
        this.f14028e = lt7VarA;
        lt7 lt7VarA2 = shapeTrimPath.b().a();
        this.f = lt7VarA2;
        lt7 lt7VarA3 = shapeTrimPath.d().a();
        this.g = lt7VarA3;
        aVar.i(lt7VarA);
        aVar.i(lt7VarA2);
        aVar.i(lt7VarA3);
        lt7VarA.a(this);
        lt7VarA2.a(this);
        lt7VarA3.a(this);
    }

    public void b(v51.b bVar) {
        this.f14027c.add(bVar);
    }

    @Override // com.oplus.aiunit.vision.v51.b
    public void d() {
        for (int i = 0; i < this.f14027c.size(); i++) {
            this.f14027c.get(i).d();
        }
    }

    @Override // com.oplus.aiunit.vision.e74
    public void e(List<e74> list, List<e74> list2) {
    }

    public v51<?, Float> f() {
        return this.f;
    }

    public v51<?, Float> h() {
        return this.g;
    }

    public v51<?, Float> i() {
        return this.f14028e;
    }

    public ShapeTrimPath.Type j() {
        return this.d;
    }

    public boolean k() {
        return this.b;
    }
}
