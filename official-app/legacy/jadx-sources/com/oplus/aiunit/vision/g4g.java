package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import io.reactivex.rxjava3.internal.schedulers.ExecutorScheduler;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public final class g4g {
    public static volatile o14<? super Throwable> a;
    public static volatile d08<? super Runnable, ? extends Runnable> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile d08<? super f4j<cfg>, ? extends cfg> f11626c;
    public static volatile d08<? super f4j<cfg>, ? extends cfg> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile d08<? super f4j<cfg>, ? extends cfg> f11627e;
    public static volatile d08<? super f4j<cfg>, ? extends cfg> f;
    public static volatile d08<? super cfg, ? extends cfg> g;
    public static volatile d08<? super cfg, ? extends cfg> h;
    public static volatile d08<? super cfg, ? extends cfg> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile d08<? super cfg, ? extends cfg> f11628j;
    public static volatile d08<? super wt7, ? extends wt7> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile d08<? super lbd, ? extends lbd> f11629l;
    public static volatile d08<? super iy3, ? extends iy3> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile d08<? super xnb, ? extends xnb> f11630n;
    public static volatile d08<? super f5h, ? extends f5h> o;
    public static volatile d08<? super pr3, ? extends pr3> p;
    public static volatile md1<? super wt7, ? super v2j, ? extends v2j> q;
    public static volatile md1<? super xnb, ? super lob, ? extends lob> r;
    public static volatile md1<? super lbd, ? super aed, ? extends aed> s;
    public static volatile md1<? super f5h, ? super l6h, ? extends l6h> t;
    public static volatile md1<? super pr3, ? super as3, ? extends as3> u;
    public static volatile md1<? super c7e, ? super v2j[], ? extends v2j[]> v;
    public static volatile y12 w;
    public static volatile boolean x;
    public static volatile boolean y;

    public g4g() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> lob<? super T> A(xnb<T> xnbVar, lob<? super T> lobVar) {
        md1<? super xnb, ? super lob, ? extends lob> md1Var = r;
        return md1Var != null ? (lob) a(md1Var, xnbVar, lobVar) : lobVar;
    }

    public static <T> aed<? super T> B(lbd<T> lbdVar, aed<? super T> aedVar) {
        md1<? super lbd, ? super aed, ? extends aed> md1Var = s;
        return md1Var != null ? (aed) a(md1Var, lbdVar, aedVar) : aedVar;
    }

    public static <T> l6h<? super T> C(f5h<T> f5hVar, l6h<? super T> l6hVar) {
        md1<? super f5h, ? super l6h, ? extends l6h> md1Var = t;
        return md1Var != null ? (l6h) a(md1Var, f5hVar, l6hVar) : l6hVar;
    }

    public static <T> v2j<? super T> D(wt7<T> wt7Var, v2j<? super T> v2jVar) {
        md1<? super wt7, ? super v2j, ? extends v2j> md1Var = q;
        return md1Var != null ? (v2j) a(md1Var, wt7Var, v2jVar) : v2jVar;
    }

    public static void E(d08<? super cfg, ? extends cfg> d08Var) {
        if (x) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        g = d08Var;
    }

    public static void F(o14<? super Throwable> o14Var) {
        if (x) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        a = o14Var;
    }

    public static void G(d08<? super cfg, ? extends cfg> d08Var) {
        if (x) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        i = d08Var;
    }

    public static void H(d08<? super cfg, ? extends cfg> d08Var) {
        if (x) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f11628j = d08Var;
    }

    public static void I(md1<? super pr3, ? super as3, ? extends as3> md1Var) {
        if (x) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        u = md1Var;
    }

    public static void J(md1<? super wt7, ? super v2j, ? extends v2j> md1Var) {
        if (x) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        q = md1Var;
    }

    public static void K(md1<? super xnb, lob, ? extends lob> md1Var) {
        if (x) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        r = md1Var;
    }

    public static void L(md1<? super lbd, ? super aed, ? extends aed> md1Var) {
        if (x) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        s = md1Var;
    }

    public static void M(md1<? super c7e, ? super v2j[], ? extends v2j[]> md1Var) {
        if (x) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        v = md1Var;
    }

    public static void N(md1<? super f5h, ? super l6h, ? extends l6h> md1Var) {
        if (x) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        t = md1Var;
    }

    public static void O(d08<? super cfg, ? extends cfg> d08Var) {
        if (x) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        h = d08Var;
    }

    public static void P(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    public static <T, U, R> R a(md1<T, U, R> md1Var, T t2, U u2) {
        try {
            return md1Var.apply(t2, u2);
        } catch (Throwable th) {
            throw ExceptionHelper.h(th);
        }
    }

    public static <T, R> R b(d08<T, R> d08Var, T t2) {
        try {
            return d08Var.apply(t2);
        } catch (Throwable th) {
            throw ExceptionHelper.h(th);
        }
    }

    public static cfg c(d08<? super f4j<cfg>, ? extends cfg> d08Var, f4j<cfg> f4jVar) {
        Object objB = b(d08Var, f4jVar);
        Objects.requireNonNull(objB, "Scheduler Supplier result can't be null");
        return (cfg) objB;
    }

    public static cfg d(f4j<cfg> f4jVar) {
        try {
            cfg cfgVar = f4jVar.get();
            Objects.requireNonNull(cfgVar, "Scheduler Supplier result can't be null");
            return cfgVar;
        } catch (Throwable th) {
            throw ExceptionHelper.h(th);
        }
    }

    public static cfg e(Executor executor, boolean z, boolean z2) {
        return new ExecutorScheduler(executor, z, z2);
    }

    public static cfg f(f4j<cfg> f4jVar) {
        Objects.requireNonNull(f4jVar, "Scheduler Supplier can't be null");
        d08<? super f4j<cfg>, ? extends cfg> d08Var = f11626c;
        return d08Var == null ? d(f4jVar) : c(d08Var, f4jVar);
    }

    public static cfg g(f4j<cfg> f4jVar) {
        Objects.requireNonNull(f4jVar, "Scheduler Supplier can't be null");
        d08<? super f4j<cfg>, ? extends cfg> d08Var = f11627e;
        return d08Var == null ? d(f4jVar) : c(d08Var, f4jVar);
    }

    public static cfg h(f4j<cfg> f4jVar) {
        Objects.requireNonNull(f4jVar, "Scheduler Supplier can't be null");
        d08<? super f4j<cfg>, ? extends cfg> d08Var = f;
        return d08Var == null ? d(f4jVar) : c(d08Var, f4jVar);
    }

    public static cfg i(f4j<cfg> f4jVar) {
        Objects.requireNonNull(f4jVar, "Scheduler Supplier can't be null");
        d08<? super f4j<cfg>, ? extends cfg> d08Var = d;
        return d08Var == null ? d(f4jVar) : c(d08Var, f4jVar);
    }

    public static boolean j(Throwable th) {
        return (th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException);
    }

    public static boolean k() {
        return y;
    }

    public static void l() {
        x = true;
    }

    public static pr3 m(pr3 pr3Var) {
        d08<? super pr3, ? extends pr3> d08Var = p;
        return d08Var != null ? (pr3) b(d08Var, pr3Var) : pr3Var;
    }

    public static <T> iy3<T> n(iy3<T> iy3Var) {
        d08<? super iy3, ? extends iy3> d08Var = m;
        return d08Var != null ? (iy3) b(d08Var, iy3Var) : iy3Var;
    }

    public static <T> wt7<T> o(wt7<T> wt7Var) {
        d08<? super wt7, ? extends wt7> d08Var = k;
        return d08Var != null ? (wt7) b(d08Var, wt7Var) : wt7Var;
    }

    public static <T> xnb<T> p(xnb<T> xnbVar) {
        d08<? super xnb, ? extends xnb> d08Var = f11630n;
        return d08Var != null ? (xnb) b(d08Var, xnbVar) : xnbVar;
    }

    public static <T> lbd<T> q(lbd<T> lbdVar) {
        d08<? super lbd, ? extends lbd> d08Var = f11629l;
        return d08Var != null ? (lbd) b(d08Var, lbdVar) : lbdVar;
    }

    public static <T> f5h<T> r(f5h<T> f5hVar) {
        d08<? super f5h, ? extends f5h> d08Var = o;
        return d08Var != null ? (f5h) b(d08Var, f5hVar) : f5hVar;
    }

    public static boolean s() {
        y12 y12Var = w;
        if (y12Var == null) {
            return false;
        }
        try {
            return y12Var.getAsBoolean();
        } catch (Throwable th) {
            throw ExceptionHelper.h(th);
        }
    }

    public static cfg t(cfg cfgVar) {
        d08<? super cfg, ? extends cfg> d08Var = g;
        return d08Var == null ? cfgVar : (cfg) b(d08Var, cfgVar);
    }

    public static void u(Throwable th) {
        o14<? super Throwable> o14Var = a;
        if (th == null) {
            th = ExceptionHelper.b("onError called with a null Throwable.");
        } else if (!j(th)) {
            th = new UndeliverableException(th);
        }
        if (o14Var != null) {
            try {
                o14Var.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                P(th2);
            }
        }
        th.printStackTrace();
        P(th);
    }

    public static cfg v(cfg cfgVar) {
        d08<? super cfg, ? extends cfg> d08Var = i;
        return d08Var == null ? cfgVar : (cfg) b(d08Var, cfgVar);
    }

    public static cfg w(cfg cfgVar) {
        d08<? super cfg, ? extends cfg> d08Var = f11628j;
        return d08Var == null ? cfgVar : (cfg) b(d08Var, cfgVar);
    }

    public static Runnable x(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        d08<? super Runnable, ? extends Runnable> d08Var = b;
        return d08Var == null ? runnable : (Runnable) b(d08Var, runnable);
    }

    public static cfg y(cfg cfgVar) {
        d08<? super cfg, ? extends cfg> d08Var = h;
        return d08Var == null ? cfgVar : (cfg) b(d08Var, cfgVar);
    }

    public static as3 z(pr3 pr3Var, as3 as3Var) {
        md1<? super pr3, ? super as3, ? extends as3> md1Var = u;
        return md1Var != null ? (as3) a(md1Var, pr3Var, as3Var) : as3Var;
    }
}
