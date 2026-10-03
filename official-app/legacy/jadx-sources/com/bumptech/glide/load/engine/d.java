package com.bumptech.glide.load.engine;

import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.oplus.aiunit.vision.ch0;
import com.oplus.aiunit.vision.erd;
import com.oplus.aiunit.vision.etf;
import com.oplus.aiunit.vision.im6;
import com.oplus.aiunit.vision.n2c;
import com.oplus.aiunit.vision.ona;
import com.oplus.aiunit.vision.st5;
import com.oplus.aiunit.vision.uik;
import com.oplus.aiunit.vision.usf;
import com.oplus.aiunit.vision.ut5;
import com.oplus.aiunit.vision.x9k;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class d<Transcode> {
    public final List<n2c.a<?>> a = new ArrayList();
    public final List<ona> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.c f1372c;
    public Object d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1373e;
    public int f;
    public Class<?> g;
    public DecodeJob.e h;
    public erd i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<Class<?>, x9k<?>> f1374j;
    public Class<Transcode> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1375l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ona f1376n;
    public Priority o;
    public ut5 p;
    public boolean q;
    public boolean r;

    public void a() {
        this.f1372c = null;
        this.d = null;
        this.f1376n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.f1374j = null;
        this.p = null;
        this.a.clear();
        this.f1375l = false;
        this.b.clear();
        this.m = false;
    }

    public ch0 b() {
        return this.f1372c.b();
    }

    public List<ona> c() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List<n2c.a<?>> listG = g();
            int size = listG.size();
            for (int i = 0; i < size; i++) {
                n2c.a<?> aVar = listG.get(i);
                if (!this.b.contains(aVar.a)) {
                    this.b.add(aVar.a);
                }
                for (int i2 = 0; i2 < aVar.b.size(); i2++) {
                    if (!this.b.contains(aVar.b.get(i2))) {
                        this.b.add(aVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    public st5 d() {
        return this.h.a();
    }

    public ut5 e() {
        return this.p;
    }

    public int f() {
        return this.f;
    }

    public List<n2c.a<?>> g() {
        if (!this.f1375l) {
            this.f1375l = true;
            this.a.clear();
            List listI = this.f1372c.i().i(this.d);
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                n2c.a<?> aVarA = ((n2c) listI.get(i)).a(this.d, this.f1373e, this.f, this.i);
                if (aVarA != null) {
                    this.a.add(aVarA);
                }
            }
        }
        return this.a;
    }

    public <Data> i<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f1372c.i().h(cls, this.g, this.k);
    }

    public Class<?> i() {
        return this.d.getClass();
    }

    public List<n2c<File, ?>> j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f1372c.i().i(file);
    }

    public erd k() {
        return this.i;
    }

    public Priority l() {
        return this.o;
    }

    public List<Class<?>> m() {
        return this.f1372c.i().j(this.d.getClass(), this.g, this.k);
    }

    public <Z> etf<Z> n(usf<Z> usfVar) {
        return this.f1372c.i().k(usfVar);
    }

    public <T> com.bumptech.glide.load.data.a<T> o(T t) {
        return this.f1372c.i().l(t);
    }

    public ona p() {
        return this.f1376n;
    }

    public <X> im6<X> q(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f1372c.i().m(x);
    }

    public Class<?> r() {
        return this.k;
    }

    public <Z> x9k<Z> s(Class<Z> cls) {
        x9k<Z> x9kVar = (x9k) this.f1374j.get(cls);
        if (x9kVar == null) {
            for (Map.Entry<Class<?>, x9k<?>> entry : this.f1374j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    x9kVar = (x9k) entry.getValue();
                    break;
                }
            }
        }
        if (x9kVar != null) {
            return x9kVar;
        }
        if (!this.f1374j.isEmpty() || !this.q) {
            return uik.a();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public int t() {
        return this.f1373e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean u(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <R> void v(com.bumptech.glide.c cVar, Object obj, ona onaVar, int i, int i2, ut5 ut5Var, Class<?> cls, Class<R> cls2, Priority priority, erd erdVar, Map<Class<?>, x9k<?>> map, boolean z, boolean z2, DecodeJob.e eVar) {
        this.f1372c = cVar;
        this.d = obj;
        this.f1376n = onaVar;
        this.f1373e = i;
        this.f = i2;
        this.p = ut5Var;
        this.g = cls;
        this.h = eVar;
        this.k = cls2;
        this.o = priority;
        this.i = erdVar;
        this.f1374j = map;
        this.q = z;
        this.r = z2;
    }

    public boolean w(usf<?> usfVar) {
        return this.f1372c.i().n(usfVar);
    }

    public boolean x() {
        return this.r;
    }

    public boolean y(ona onaVar) {
        List<n2c.a<?>> listG = g();
        int size = listG.size();
        for (int i = 0; i < size; i++) {
            if (listG.get(i).a.equals(onaVar)) {
                return true;
            }
        }
        return false;
    }
}
