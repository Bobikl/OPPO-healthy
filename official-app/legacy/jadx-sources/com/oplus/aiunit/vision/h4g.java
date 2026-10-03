package com.oplus.aiunit.vision;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class h4g {
    public static volatile p14<? super Throwable> a;
    public static volatile j08<? super Runnable, ? extends Runnable> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile j08<? super Callable<zeg>, ? extends zeg> f11992c;
    public static volatile j08<? super Callable<zeg>, ? extends zeg> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile j08<? super Callable<zeg>, ? extends zeg> f11993e;
    public static volatile j08<? super Callable<zeg>, ? extends zeg> f;
    public static volatile j08<? super zeg, ? extends zeg> g;
    public static volatile j08<? super zeg, ? extends zeg> h;
    public static volatile j08<? super zeg, ? extends zeg> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile j08<? super xt7, ? extends xt7> f11994j;
    public static volatile j08<? super kbd, ? extends kbd> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile j08<? super ynb, ? extends ynb> f11995l;
    public static volatile j08<? super g5h, ? extends g5h> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile j08<? super qr3, ? extends qr3> f11996n;
    public static volatile nd1<? super xt7, ? super v2j, ? extends v2j> o;
    public static volatile nd1<? super ynb, ? super mob, ? extends mob> p;
    public static volatile nd1<? super kbd, ? super bed, ? extends bed> q;
    public static volatile nd1<? super g5h, ? super m6h, ? extends m6h> r;
    public static volatile nd1<? super qr3, ? super bs3, ? extends bs3> s;
    public static volatile z12 t;
    public static volatile boolean u;
    public static volatile boolean v;

    public static void A(p14<? super Throwable> p14Var) {
        if (u) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        a = p14Var;
    }

    public static void B(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    public static <T, U, R> R a(nd1<T, U, R> nd1Var, T t2, U u2) {
        try {
            return nd1Var.apply(t2, u2);
        } catch (Throwable th) {
            throw ExceptionHelper.d(th);
        }
    }

    public static <T, R> R b(j08<T, R> j08Var, T t2) {
        try {
            return j08Var.apply(t2);
        } catch (Throwable th) {
            throw ExceptionHelper.d(th);
        }
    }

    public static zeg c(j08<? super Callable<zeg>, ? extends zeg> j08Var, Callable<zeg> callable) {
        return (zeg) abd.d(b(j08Var, callable), "Scheduler Callable result can't be null");
    }

    public static zeg d(Callable<zeg> callable) {
        try {
            return (zeg) abd.d(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw ExceptionHelper.d(th);
        }
    }

    public static zeg e(Callable<zeg> callable) {
        abd.d(callable, "Scheduler Callable can't be null");
        j08<? super Callable<zeg>, ? extends zeg> j08Var = f11992c;
        return j08Var == null ? d(callable) : c(j08Var, callable);
    }

    public static zeg f(Callable<zeg> callable) {
        abd.d(callable, "Scheduler Callable can't be null");
        j08<? super Callable<zeg>, ? extends zeg> j08Var = f11993e;
        return j08Var == null ? d(callable) : c(j08Var, callable);
    }

    public static zeg g(Callable<zeg> callable) {
        abd.d(callable, "Scheduler Callable can't be null");
        j08<? super Callable<zeg>, ? extends zeg> j08Var = f;
        return j08Var == null ? d(callable) : c(j08Var, callable);
    }

    public static zeg h(Callable<zeg> callable) {
        abd.d(callable, "Scheduler Callable can't be null");
        j08<? super Callable<zeg>, ? extends zeg> j08Var = d;
        return j08Var == null ? d(callable) : c(j08Var, callable);
    }

    public static boolean i(Throwable th) {
        return (th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException);
    }

    public static boolean j() {
        return v;
    }

    public static qr3 k(qr3 qr3Var) {
        j08<? super qr3, ? extends qr3> j08Var = f11996n;
        return j08Var != null ? (qr3) b(j08Var, qr3Var) : qr3Var;
    }

    public static <T> xt7<T> l(xt7<T> xt7Var) {
        j08<? super xt7, ? extends xt7> j08Var = f11994j;
        return j08Var != null ? (xt7) b(j08Var, xt7Var) : xt7Var;
    }

    public static <T> ynb<T> m(ynb<T> ynbVar) {
        j08<? super ynb, ? extends ynb> j08Var = f11995l;
        return j08Var != null ? (ynb) b(j08Var, ynbVar) : ynbVar;
    }

    public static <T> kbd<T> n(kbd<T> kbdVar) {
        j08<? super kbd, ? extends kbd> j08Var = k;
        return j08Var != null ? (kbd) b(j08Var, kbdVar) : kbdVar;
    }

    public static <T> g5h<T> o(g5h<T> g5hVar) {
        j08<? super g5h, ? extends g5h> j08Var = m;
        return j08Var != null ? (g5h) b(j08Var, g5hVar) : g5hVar;
    }

    public static boolean p() {
        z12 z12Var = t;
        if (z12Var == null) {
            return false;
        }
        try {
            return z12Var.getAsBoolean();
        } catch (Throwable th) {
            throw ExceptionHelper.d(th);
        }
    }

    public static zeg q(zeg zegVar) {
        j08<? super zeg, ? extends zeg> j08Var = g;
        return j08Var == null ? zegVar : (zeg) b(j08Var, zegVar);
    }

    public static void r(Throwable th) {
        p14<? super Throwable> p14Var = a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!i(th)) {
            th = new UndeliverableException(th);
        }
        if (p14Var != null) {
            try {
                p14Var.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                B(th2);
            }
        }
        th.printStackTrace();
        B(th);
    }

    public static zeg s(zeg zegVar) {
        j08<? super zeg, ? extends zeg> j08Var = i;
        return j08Var == null ? zegVar : (zeg) b(j08Var, zegVar);
    }

    public static Runnable t(Runnable runnable) {
        abd.d(runnable, "run is null");
        j08<? super Runnable, ? extends Runnable> j08Var = b;
        return j08Var == null ? runnable : (Runnable) b(j08Var, runnable);
    }

    public static zeg u(zeg zegVar) {
        j08<? super zeg, ? extends zeg> j08Var = h;
        return j08Var == null ? zegVar : (zeg) b(j08Var, zegVar);
    }

    public static bs3 v(qr3 qr3Var, bs3 bs3Var) {
        nd1<? super qr3, ? super bs3, ? extends bs3> nd1Var = s;
        return nd1Var != null ? (bs3) a(nd1Var, qr3Var, bs3Var) : bs3Var;
    }

    public static <T> mob<? super T> w(ynb<T> ynbVar, mob<? super T> mobVar) {
        nd1<? super ynb, ? super mob, ? extends mob> nd1Var = p;
        return nd1Var != null ? (mob) a(nd1Var, ynbVar, mobVar) : mobVar;
    }

    public static <T> bed<? super T> x(kbd<T> kbdVar, bed<? super T> bedVar) {
        nd1<? super kbd, ? super bed, ? extends bed> nd1Var = q;
        return nd1Var != null ? (bed) a(nd1Var, kbdVar, bedVar) : bedVar;
    }

    public static <T> m6h<? super T> y(g5h<T> g5hVar, m6h<? super T> m6hVar) {
        nd1<? super g5h, ? super m6h, ? extends m6h> nd1Var = r;
        return nd1Var != null ? (m6h) a(nd1Var, g5hVar, m6hVar) : m6hVar;
    }

    public static <T> v2j<? super T> z(xt7<T> xt7Var, v2j<? super T> v2jVar) {
        nd1<? super xt7, ? super v2j, ? extends v2j> nd1Var = o;
        return nd1Var != null ? (v2j) a(nd1Var, xt7Var, v2jVar) : v2jVar;
    }
}
