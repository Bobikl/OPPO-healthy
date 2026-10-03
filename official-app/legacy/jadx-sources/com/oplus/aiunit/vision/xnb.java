package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeZipArray;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class xnb<T> implements pob<T> {
    public static <T> xnb<T> c() {
        return g4g.p(bob.INSTANCE);
    }

    public static <T> xnb<T> f(Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return g4g.p(new hob(callable));
    }

    public static <T> xnb<T> g(T t) {
        Objects.requireNonNull(t, "item is null");
        return g4g.p(new iob(t));
    }

    public static <T1, T2, R> xnb<R> n(pob<? extends T1> pobVar, pob<? extends T2> pobVar2, md1<? super T1, ? super T2, ? extends R> md1Var) {
        Objects.requireNonNull(pobVar, "source1 is null");
        Objects.requireNonNull(pobVar2, "source2 is null");
        Objects.requireNonNull(md1Var, "zipper is null");
        return o(Functions.l(md1Var), pobVar, pobVar2);
    }

    @SafeVarargs
    public static <T, R> xnb<R> o(d08<? super Object[], ? extends R> d08Var, pob<? extends T>... pobVarArr) {
        Objects.requireNonNull(pobVarArr, "sources is null");
        if (pobVarArr.length == 0) {
            return c();
        }
        Objects.requireNonNull(d08Var, "zipper is null");
        return g4g.p(new MaybeZipArray(pobVarArr, d08Var));
    }

    @Override // com.oplus.aiunit.vision.pob
    public final void a(lob<? super T> lobVar) {
        Objects.requireNonNull(lobVar, "observer is null");
        lob<? super T> lobVarA = g4g.A(this, lobVar);
        Objects.requireNonNull(lobVarA, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            l(lobVarA);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            hu6.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final xnb<T> b(o14<? super T> o14Var) {
        o14 o14VarE = Functions.e();
        Objects.requireNonNull(o14Var, "onSuccess is null");
        o14 o14VarE2 = Functions.e();
        Cdo cdo = Functions.EMPTY_ACTION;
        return g4g.p(new oob(this, o14VarE, o14Var, o14VarE2, cdo, cdo, cdo));
    }

    public final xnb<T> d(mpe<? super T> mpeVar) {
        Objects.requireNonNull(mpeVar, "predicate is null");
        return g4g.p(new cob(this, mpeVar));
    }

    public final <R> xnb<R> e(d08<? super T, ? extends pob<? extends R>> d08Var) {
        Objects.requireNonNull(d08Var, "mapper is null");
        return g4g.p(new MaybeFlatten(this, d08Var));
    }

    public final <R> xnb<R> h(d08<? super T, ? extends R> d08Var) {
        Objects.requireNonNull(d08Var, "mapper is null");
        return g4g.p(new io.reactivex.rxjava3.internal.operators.maybe.a(this, d08Var));
    }

    public final xnb<T> i(d08<? super Throwable, ? extends T> d08Var) {
        Objects.requireNonNull(d08Var, "itemSupplier is null");
        return g4g.p(new nob(this, d08Var));
    }

    public final io.reactivex.rxjava3.disposables.a j() {
        return k(Functions.e(), Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    public final io.reactivex.rxjava3.disposables.a k(o14<? super T> o14Var, o14<? super Throwable> o14Var2, Cdo cdo) {
        Objects.requireNonNull(o14Var, "onSuccess is null");
        Objects.requireNonNull(o14Var2, "onError is null");
        Objects.requireNonNull(cdo, "onComplete is null");
        return (io.reactivex.rxjava3.disposables.a) m(new MaybeCallbackObserver(o14Var, o14Var2, cdo));
    }

    public abstract void l(lob<? super T> lobVar);

    public final <E extends lob<? super T>> E m(E e2) {
        a(e2);
        return e2;
    }
}
