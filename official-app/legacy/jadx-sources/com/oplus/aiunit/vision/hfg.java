package com.oplus.aiunit.vision;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public final class hfg {
    public static final cfg a = g4g.i(new h());
    public static final cfg b = g4g.f(new b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cfg f12143c = g4g.g(new c());
    public static final cfg d = e9k.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final cfg f12144e = g4g.h(new f());

    public static final class a {
        public static final cfg a = new ft3();
    }

    public static final class b implements f4j<cfg> {
        @Override // com.oplus.aiunit.vision.f4j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cfg get() {
            return a.a;
        }
    }

    public static final class c implements f4j<cfg> {
        @Override // com.oplus.aiunit.vision.f4j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cfg get() {
            return d.a;
        }
    }

    public static final class d {
        public static final cfg a = new gga();
    }

    public static final class e {
        public static final cfg a = new jqc();
    }

    public static final class f implements f4j<cfg> {
        @Override // com.oplus.aiunit.vision.f4j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cfg get() {
            return e.a;
        }
    }

    public static final class g {
        public static final cfg a = new io.reactivex.rxjava3.internal.schedulers.b();
    }

    public static final class h implements f4j<cfg> {
        @Override // com.oplus.aiunit.vision.f4j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cfg get() {
            return g.a;
        }
    }

    public hfg() {
        throw new IllegalStateException("No instances!");
    }

    public static cfg a() {
        return g4g.t(b);
    }

    public static cfg b(Executor executor) {
        return c(executor, false, false);
    }

    public static cfg c(Executor executor, boolean z, boolean z2) {
        return g4g.e(executor, z, z2);
    }

    public static cfg d() {
        return g4g.v(f12143c);
    }

    public static cfg e() {
        return g4g.w(f12144e);
    }

    public static cfg f() {
        return g4g.y(a);
    }
}
