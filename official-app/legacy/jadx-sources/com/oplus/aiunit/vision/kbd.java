package com.oplus.aiunit.vision;

import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.observable.ObservableZip;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kbd<T> implements kdd<T> {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            a = iArr;
            try {
                iArr[BackpressureStrategy.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BackpressureStrategy.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[BackpressureStrategy.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[BackpressureStrategy.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static kbd<Long> C(long j2, TimeUnit timeUnit) {
        return D(j2, timeUnit, ifg.a());
    }

    public static kbd<Long> D(long j2, TimeUnit timeUnit, zeg zegVar) {
        abd.d(timeUnit, "unit is null");
        abd.d(zegVar, "scheduler is null");
        return h4g.n(new ObservableTimer(Math.max(j2, 0L), timeUnit, zegVar));
    }

    public static <T> kbd<T> F(kdd<T> kddVar) {
        abd.d(kddVar, "source is null");
        return kddVar instanceof kbd ? h4g.n((kbd) kddVar) : h4g.n(new ocd(kddVar));
    }

    public static <T1, T2, R> kbd<R> G(kdd<? extends T1> kddVar, kdd<? extends T2> kddVar2, nd1<? super T1, ? super T2, ? extends R> nd1Var) {
        abd.d(kddVar, "source1 is null");
        abd.d(kddVar2, "source2 is null");
        return H(Functions.b(nd1Var), false, a(), kddVar, kddVar2);
    }

    public static <T, R> kbd<R> H(j08<? super Object[], ? extends R> j08Var, boolean z, int i, kdd<? extends T>... kddVarArr) {
        if (kddVarArr.length == 0) {
            return k();
        }
        abd.d(j08Var, "zipper is null");
        abd.e(i, "bufferSize");
        return h4g.n(new ObservableZip(kddVarArr, null, j08Var, i, z));
    }

    public static int a() {
        return xt7.a();
    }

    public static <T> kbd<T> c(cdd<T> cddVar) {
        abd.d(cddVar, "source is null");
        return h4g.n(new ObservableCreate(cddVar));
    }

    public static <T> kbd<T> k() {
        return h4g.n(fcd.INSTANCE);
    }

    public static kbd<Long> n(long j2, long j3, long j4, long j5, TimeUnit timeUnit) {
        return o(j2, j3, j4, j5, timeUnit, ifg.a());
    }

    public static kbd<Long> o(long j2, long j3, long j4, long j5, TimeUnit timeUnit, zeg zegVar) {
        if (j3 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j3);
        }
        if (j3 == 0) {
            return k().e(j4, timeUnit, zegVar);
        }
        long j6 = j2 + (j3 - 1);
        if (j2 > 0 && j6 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        abd.d(timeUnit, "unit is null");
        abd.d(zegVar, "scheduler is null");
        return h4g.n(new ObservableIntervalRange(j2, j6, Math.max(0L, j4), Math.max(0L, j5), timeUnit, zegVar));
    }

    public static <T> kbd<T> p(T t) {
        abd.d(t, "item is null");
        return h4g.n(new scd(t));
    }

    public abstract void A(bed<? super T> bedVar);

    public final kbd<T> B(zeg zegVar) {
        abd.d(zegVar, "scheduler is null");
        return h4g.n(new ObservableSubscribeOn(this, zegVar));
    }

    public final xt7<T> E(BackpressureStrategy backpressureStrategy) {
        iu7 iu7Var = new iu7(this);
        int i = a.a[backpressureStrategy.ordinal()];
        if (i == 1) {
            return iu7Var.d();
        }
        if (i == 2) {
            return iu7Var.e();
        }
        if (i != 3) {
            return i != 4 ? iu7Var.b() : h4g.l(new FlowableOnBackpressureError(iu7Var));
        }
        return iu7Var;
    }

    public final <R> kbd<R> b(ydd<? super T, ? extends R> yddVar) {
        return F(((ydd) abd.d(yddVar, "composer is null")).a(this));
    }

    public final kbd<T> d(long j2, TimeUnit timeUnit) {
        return f(j2, timeUnit, ifg.a(), false);
    }

    public final kbd<T> e(long j2, TimeUnit timeUnit, zeg zegVar) {
        return f(j2, timeUnit, zegVar, false);
    }

    public final kbd<T> f(long j2, TimeUnit timeUnit, zeg zegVar, boolean z) {
        abd.d(timeUnit, "unit is null");
        abd.d(zegVar, "scheduler is null");
        return h4g.n(new vbd(this, j2, timeUnit, zegVar, z));
    }

    public final kbd<T> g(p14<? super T> p14Var, p14<? super Throwable> p14Var2, eo eoVar, eo eoVar2) {
        abd.d(p14Var, "onNext is null");
        abd.d(p14Var2, "onError is null");
        abd.d(eoVar, "onComplete is null");
        abd.d(eoVar2, "onAfterTerminate is null");
        return h4g.n(new ybd(this, p14Var, p14Var2, eoVar, eoVar2));
    }

    public final kbd<T> h(p14<? super cv5> p14Var, eo eoVar) {
        abd.d(p14Var, "onSubscribe is null");
        abd.d(eoVar, "onDispose is null");
        return h4g.n(new bcd(this, p14Var, eoVar));
    }

    public final kbd<T> i(p14<? super T> p14Var) {
        p14<? super Throwable> p14VarA = Functions.a();
        eo eoVar = Functions.EMPTY_ACTION;
        return g(p14Var, p14VarA, eoVar, eoVar);
    }

    public final kbd<T> j(p14<? super cv5> p14Var) {
        return h(p14Var, Functions.EMPTY_ACTION);
    }

    public final kbd<T> l(npe<? super T> npeVar) {
        abd.d(npeVar, "predicate is null");
        return h4g.n(new hcd(this, npeVar));
    }

    public final qr3 m() {
        return h4g.k(new qcd(this));
    }

    public final <R> kbd<R> q(j08<? super T, ? extends R> j08Var) {
        abd.d(j08Var, "mapper is null");
        return h4g.n(new ucd(this, j08Var));
    }

    public final kbd<T> r(zeg zegVar) {
        return s(zegVar, false, a());
    }

    public final kbd<T> s(zeg zegVar, boolean z, int i) {
        abd.d(zegVar, "scheduler is null");
        abd.e(i, "bufferSize");
        return h4g.n(new ObservableObserveOn(this, zegVar, z, i));
    }

    @Override // com.oplus.aiunit.vision.kdd
    public final void subscribe(bed<? super T> bedVar) {
        abd.d(bedVar, "observer is null");
        try {
            bed<? super T> bedVarX = h4g.x(this, bedVar);
            abd.d(bedVarX, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            A(bedVarX);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            iu6.b(th);
            h4g.r(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final kbd<T> t(j08<? super Throwable, ? extends T> j08Var) {
        abd.d(j08Var, "valueSupplier is null");
        return h4g.n(new zcd(this, j08Var));
    }

    public final ynb<T> u() {
        return h4g.m(new edd(this));
    }

    public final g5h<T> v() {
        return h4g.o(new gdd(this, null));
    }

    public final cv5 w() {
        return z(Functions.a(), Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, Functions.a());
    }

    public final cv5 x(p14<? super T> p14Var) {
        return z(p14Var, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, Functions.a());
    }

    public final cv5 y(p14<? super T> p14Var, p14<? super Throwable> p14Var2) {
        return z(p14Var, p14Var2, Functions.EMPTY_ACTION, Functions.a());
    }

    public final cv5 z(p14<? super T> p14Var, p14<? super Throwable> p14Var2, eo eoVar, p14<? super cv5> p14Var3) {
        abd.d(p14Var, "onNext is null");
        abd.d(p14Var2, "onError is null");
        abd.d(eoVar, "onComplete is null");
        abd.d(p14Var3, "onSubscribe is null");
        LambdaObserver lambdaObserver = new LambdaObserver(p14Var, p14Var2, eoVar, p14Var3);
        subscribe(lambdaObserver);
        return lambdaObserver;
    }
}
