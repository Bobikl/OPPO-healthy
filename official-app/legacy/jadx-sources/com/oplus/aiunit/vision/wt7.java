package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableUnsubscribeOn;
import io.reactivex.rxjava3.internal.subscribers.LambdaSubscriber;
import io.reactivex.rxjava3.internal.subscribers.StrictSubscriber;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wt7<T> implements k3f<T> {
    public static final int i = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    public static int a() {
        return i;
    }

    public static <T> wt7<T> b(nu7<T> nu7Var, BackpressureStrategy backpressureStrategy) {
        Objects.requireNonNull(nu7Var, "source is null");
        Objects.requireNonNull(backpressureStrategy, "mode is null");
        return g4g.o(new FlowableCreate(nu7Var, backpressureStrategy));
    }

    public static <T> wt7<T> g() {
        return g4g.o(gu7.INSTANCE);
    }

    public static <T> wt7<T> o(Iterable<? extends T> iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return g4g.o(new FlowableFromIterable(iterable));
    }

    public final wt7<T> A(cfg cfgVar) {
        Objects.requireNonNull(cfgVar, "scheduler is null");
        return B(cfgVar, !(this instanceof FlowableCreate));
    }

    public final wt7<T> B(cfg cfgVar, boolean z) {
        Objects.requireNonNull(cfgVar, "scheduler is null");
        return g4g.o(new FlowableSubscribeOn(this, cfgVar, z));
    }

    public final wt7<T> C(cfg cfgVar) {
        Objects.requireNonNull(cfgVar, "scheduler is null");
        return g4g.o(new FlowableUnsubscribeOn(this, cfgVar));
    }

    public final wt7<T> c(o14<? super T> o14Var, o14<? super Throwable> o14Var2, Cdo cdo, Cdo cdo2) {
        Objects.requireNonNull(o14Var, "onNext is null");
        Objects.requireNonNull(o14Var2, "onError is null");
        Objects.requireNonNull(cdo, "onComplete is null");
        Objects.requireNonNull(cdo2, "onAfterTerminate is null");
        return g4g.o(new du7(this, o14Var, o14Var2, cdo, cdo2));
    }

    public final wt7<T> f(o14<? super T> o14Var) {
        o14<? super Throwable> o14VarE = Functions.e();
        Cdo cdo = Functions.EMPTY_ACTION;
        return c(o14Var, o14VarE, cdo, cdo);
    }

    public final wt7<T> h(mpe<? super T> mpeVar) {
        Objects.requireNonNull(mpeVar, "predicate is null");
        return g4g.o(new hu7(this, mpeVar));
    }

    public final <R> wt7<R> j(d08<? super T, ? extends k3f<? extends R>> d08Var) {
        return k(d08Var, false, a(), a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> wt7<R> k(d08<? super T, ? extends k3f<? extends R>> d08Var, boolean z, int i2, int i3) {
        Objects.requireNonNull(d08Var, "mapper is null");
        bbd.a(i2, "maxConcurrency");
        bbd.a(i3, "bufferSize");
        if (!(this instanceof ndg)) {
            return g4g.o(new FlowableFlatMap(this, d08Var, z, i2, i3));
        }
        Object obj = ((ndg) this).get();
        return obj == null ? g() : su7.a(obj, d08Var);
    }

    public final <R> wt7<R> l(d08<? super T, ? extends pob<? extends R>> d08Var) {
        return n(d08Var, false, Integer.MAX_VALUE);
    }

    public final <R> wt7<R> n(d08<? super T, ? extends pob<? extends R>> d08Var, boolean z, int i2) {
        Objects.requireNonNull(d08Var, "mapper is null");
        bbd.a(i2, "maxConcurrency");
        return g4g.o(new FlowableFlatMapMaybe(this, d08Var, z, i2));
    }

    public final <R> wt7<R> p(d08<? super T, ? extends R> d08Var) {
        Objects.requireNonNull(d08Var, "mapper is null");
        return g4g.o(new ku7(this, d08Var));
    }

    public final wt7<T> q(cfg cfgVar) {
        return r(cfgVar, false, a());
    }

    public final wt7<T> r(cfg cfgVar, boolean z, int i2) {
        Objects.requireNonNull(cfgVar, "scheduler is null");
        bbd.a(i2, "bufferSize");
        return g4g.o(new FlowableObserveOn(this, cfgVar, z, i2));
    }

    public final wt7<T> s() {
        return t(a(), false, true);
    }

    @Override // com.oplus.aiunit.vision.k3f
    public final void subscribe(v2j<? super T> v2jVar) {
        if (v2jVar instanceof vu7) {
            y((vu7) v2jVar);
        } else {
            Objects.requireNonNull(v2jVar, "subscriber is null");
            y(new StrictSubscriber(v2jVar));
        }
    }

    public final wt7<T> t(int i2, boolean z, boolean z2) {
        bbd.a(i2, "capacity");
        return g4g.o(new FlowableOnBackpressureBuffer(this, i2, z2, z, Functions.EMPTY_ACTION));
    }

    public final wt7<T> u() {
        return g4g.o(new FlowableOnBackpressureDrop(this));
    }

    public final wt7<T> v() {
        return g4g.o(new FlowableOnBackpressureLatest(this));
    }

    public final io.reactivex.rxjava3.disposables.a w(o14<? super T> o14Var, o14<? super Throwable> o14Var2) {
        return x(o14Var, o14Var2, Functions.EMPTY_ACTION);
    }

    public final io.reactivex.rxjava3.disposables.a x(o14<? super T> o14Var, o14<? super Throwable> o14Var2, Cdo cdo) {
        Objects.requireNonNull(o14Var, "onNext is null");
        Objects.requireNonNull(o14Var2, "onError is null");
        Objects.requireNonNull(cdo, "onComplete is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(o14Var, o14Var2, cdo, FlowableInternalHelper$RequestMax.INSTANCE);
        y(lambdaSubscriber);
        return lambdaSubscriber;
    }

    public final void y(vu7<? super T> vu7Var) {
        Objects.requireNonNull(vu7Var, "subscriber is null");
        try {
            v2j<? super T> v2jVarD = g4g.D(this, vu7Var);
            Objects.requireNonNull(v2jVarD, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            z(v2jVarD);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            hu6.b(th);
            g4g.u(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void z(v2j<? super T> v2jVar);
}
