package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.observers.ConsumerSingleObserver;
import io.reactivex.rxjava3.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleCreate;
import io.reactivex.rxjava3.internal.operators.single.SingleDoFinally;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMap;
import io.reactivex.rxjava3.internal.operators.single.SingleObserveOn;
import io.reactivex.rxjava3.internal.operators.single.SingleSubscribeOn;
import io.reactivex.rxjava3.internal.operators.single.SingleTimer;
import io.reactivex.rxjava3.internal.operators.single.SingleToObservable;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f5h<T> implements s6h<T> {
    public static f5h<Long> A(long j2, TimeUnit timeUnit, cfg cfgVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(cfgVar, "scheduler is null");
        return g4g.r(new SingleTimer(j2, timeUnit, cfgVar));
    }

    public static <T> f5h<T> D(s6h<T> s6hVar) {
        Objects.requireNonNull(s6hVar, "source is null");
        return s6hVar instanceof f5h ? g4g.r((f5h) s6hVar) : g4g.r(new d6h(s6hVar));
    }

    public static <T> f5h<T> e(o6h<T> o6hVar) {
        Objects.requireNonNull(o6hVar, "source is null");
        return g4g.r(new SingleCreate(o6hVar));
    }

    public static <T> f5h<T> k(f4j<? extends Throwable> f4jVar) {
        Objects.requireNonNull(f4jVar, "supplier is null");
        return g4g.r(new y5h(f4jVar));
    }

    public static <T> f5h<T> l(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return k(Functions.j(th));
    }

    public static <T> f5h<T> p(Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return g4g.r(new c6h(callable));
    }

    public static <T> f5h<T> q(T t) {
        Objects.requireNonNull(t, "item is null");
        return g4g.r(new e6h(t));
    }

    public static f5h<Long> z(long j2, TimeUnit timeUnit) {
        return A(j2, timeUnit, hfg.a());
    }

    public final <R> R B(q5h<T, ? extends R> q5hVar) {
        Objects.requireNonNull(q5hVar, "converter is null");
        return q5hVar.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lbd<T> C() {
        return this instanceof k08 ? ((k08) this).c() : g4g.q(new SingleToObservable(this));
    }

    public final io.reactivex.rxjava3.disposables.a a(o14<? super T> o14Var) {
        return w(o14Var, Functions.ON_ERROR_MISSING);
    }

    @Override // com.oplus.aiunit.vision.s6h
    public final void b(l6h<? super T> l6hVar) {
        Objects.requireNonNull(l6hVar, "observer is null");
        l6h<? super T> l6hVarC = g4g.C(this, l6hVar);
        Objects.requireNonNull(l6hVarC, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            x(l6hVarC);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            hu6.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final <R> f5h<R> d(c7h<? super T, ? extends R> c7hVar) {
        Objects.requireNonNull(c7hVar, "transformer is null");
        return D(c7hVar.b(this));
    }

    public final f5h<T> f(long j2, TimeUnit timeUnit) {
        return g(j2, timeUnit, hfg.a(), false);
    }

    public final f5h<T> g(long j2, TimeUnit timeUnit, cfg cfgVar, boolean z) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(cfgVar, "scheduler is null");
        return g4g.r(new r5h(this, j2, timeUnit, cfgVar, z));
    }

    public final f5h<T> h(Cdo cdo) {
        Objects.requireNonNull(cdo, "onFinally is null");
        return g4g.r(new SingleDoFinally(this, cdo));
    }

    public final f5h<T> i(o14<? super Throwable> o14Var) {
        Objects.requireNonNull(o14Var, "onError is null");
        return g4g.r(new v5h(this, o14Var));
    }

    public final f5h<T> j(o14<? super T> o14Var) {
        Objects.requireNonNull(o14Var, "onSuccess is null");
        return g4g.r(new w5h(this, o14Var));
    }

    public final xnb<T> m(mpe<? super T> mpeVar) {
        Objects.requireNonNull(mpeVar, "predicate is null");
        return g4g.p(new dob(this, mpeVar));
    }

    public final <R> f5h<R> n(d08<? super T, ? extends s6h<? extends R>> d08Var) {
        Objects.requireNonNull(d08Var, "mapper is null");
        return g4g.r(new SingleFlatMap(this, d08Var));
    }

    public final <R> lbd<R> o(d08<? super T, ? extends jdd<? extends R>> d08Var) {
        Objects.requireNonNull(d08Var, "mapper is null");
        return g4g.q(new SingleFlatMapObservable(this, d08Var));
    }

    public final <R> f5h<R> r(d08<? super T, ? extends R> d08Var) {
        Objects.requireNonNull(d08Var, "mapper is null");
        return g4g.r(new k6h(this, d08Var));
    }

    public final f5h<T> s(cfg cfgVar) {
        Objects.requireNonNull(cfgVar, "scheduler is null");
        return g4g.r(new SingleObserveOn(this, cfgVar));
    }

    public final f5h<T> t(d08<Throwable, ? extends T> d08Var) {
        Objects.requireNonNull(d08Var, "itemSupplier is null");
        return g4g.r(new n6h(this, d08Var, null));
    }

    public final f5h<T> u() {
        return g4g.r(new s5h(this));
    }

    public final io.reactivex.rxjava3.disposables.a v() {
        return w(Functions.e(), Functions.ON_ERROR_MISSING);
    }

    public final io.reactivex.rxjava3.disposables.a w(o14<? super T> o14Var, o14<? super Throwable> o14Var2) {
        Objects.requireNonNull(o14Var, "onSuccess is null");
        Objects.requireNonNull(o14Var2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(o14Var, o14Var2);
        b(consumerSingleObserver);
        return consumerSingleObserver;
    }

    public abstract void x(l6h<? super T> l6hVar);

    public final f5h<T> y(cfg cfgVar) {
        Objects.requireNonNull(cfgVar, "scheduler is null");
        return g4g.r(new SingleSubscribeOn(this, cfgVar));
    }
}
