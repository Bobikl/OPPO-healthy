package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class i8e {
    public final List<xh1> a;
    public final List<b95> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k8a f12426c;
    public final List<doe> d;

    public static class b {
        public final List<xh1> a = new ArrayList();
        public final List<b95> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<doe> f12427c = new ArrayList();
        public Set<Class<? extends qh1>> d = oy5.r();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public k8a f12428e;

        public class a implements k8a {
            public a() {
            }

            @Override // com.oplus.aiunit.vision.k8a
            public h8a a(i8a i8aVar) {
                return new l8a(i8aVar);
            }
        }

        public i8e f() {
            return new i8e(this);
        }

        public b g(xh1 xh1Var) {
            if (xh1Var == null) {
                throw new NullPointerException("blockParserFactory must not be null");
            }
            this.a.add(xh1Var);
            return this;
        }

        public b h(Iterable<? extends qz6> iterable) {
            if (iterable == null) {
                throw new NullPointerException("extensions must not be null");
            }
            for (qz6 qz6Var : iterable) {
                if (qz6Var instanceof c) {
                    ((c) qz6Var).a(this);
                }
            }
            return this;
        }

        public final k8a i() {
            k8a k8aVar = this.f12428e;
            return k8aVar != null ? k8aVar : new a();
        }

        public b j(k8a k8aVar) {
            this.f12428e = k8aVar;
            return this;
        }
    }

    public interface c extends qz6 {
        void a(b bVar);
    }

    public final oy5 a() {
        return new oy5(this.a, this.f12426c, this.b);
    }

    public ltc b(String str) {
        if (str != null) {
            return c(a().t(str));
        }
        throw new NullPointerException("input must not be null");
    }

    public final ltc c(ltc ltcVar) {
        Iterator<doe> it = this.d.iterator();
        while (it.hasNext()) {
            ltcVar = it.next().a(ltcVar);
        }
        return ltcVar;
    }

    public i8e(b bVar) {
        this.a = oy5.k(bVar.a, bVar.d);
        k8a k8aVarI = bVar.i();
        this.f12426c = k8aVarI;
        this.d = bVar.f12427c;
        List<b95> list = bVar.b;
        this.b = list;
        k8aVarI.a(new j8a(list, Collections.emptyMap()));
    }
}
