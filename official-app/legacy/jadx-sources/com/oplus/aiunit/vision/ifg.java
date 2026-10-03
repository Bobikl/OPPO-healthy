package com.oplus.aiunit.vision;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class ifg {
    public static final zeg a = h4g.h(new h());
    public static final zeg b = h4g.e(new b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zeg f12517c = h4g.f(new c());
    public static final zeg d = d9k.f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zeg f12518e = h4g.g(new f());

    public static final class a {
        public static final zeg a = new et3();
    }

    public static final class b implements Callable<zeg> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public zeg call() throws Exception {
            return a.a;
        }
    }

    public static final class c implements Callable<zeg> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public zeg call() throws Exception {
            return d.a;
        }
    }

    public static final class d {
        public static final zeg a = new fga();
    }

    public static final class e {
        public static final zeg a = new kqc();
    }

    public static final class f implements Callable<zeg> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public zeg call() throws Exception {
            return e.a;
        }
    }

    public static final class g {
        public static final zeg a = new io.reactivex.internal.schedulers.b();
    }

    public static final class h implements Callable<zeg> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public zeg call() throws Exception {
            return g.a;
        }
    }

    public static zeg a() {
        return h4g.q(b);
    }

    public static zeg b() {
        return h4g.s(f12517c);
    }

    public static zeg c() {
        return h4g.u(a);
    }
}
