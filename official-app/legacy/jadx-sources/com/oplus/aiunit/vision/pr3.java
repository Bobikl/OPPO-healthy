package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import java.util.Objects;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes10.dex */
public abstract class pr3 implements ds3 {
    public static pr3 b() {
        return g4g.m(vr3.INSTANCE);
    }

    public static pr3 d(cs3 cs3Var) {
        Objects.requireNonNull(cs3Var, "source is null");
        return g4g.m(new CompletableCreate(cs3Var));
    }

    public static pr3 e(f4j<? extends ds3> f4jVar) {
        Objects.requireNonNull(f4jVar, "supplier is null");
        return g4g.m(new tr3(f4jVar));
    }

    public static pr3 f(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return g4g.m(new wr3(th));
    }

    public static pr3 g(Cdo cdo) {
        Objects.requireNonNull(cdo, "action is null");
        return g4g.m(new xr3(cdo));
    }

    public static pr3 h(Future<?> future) {
        Objects.requireNonNull(future, "future is null");
        return g(Functions.f(future));
    }

    public static pr3 i() {
        return g4g.m(zr3.INSTANCE);
    }

    public static NullPointerException m(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @Override // com.oplus.aiunit.vision.ds3
    public final void a(as3 as3Var) {
        Objects.requireNonNull(as3Var, "observer is null");
        try {
            as3 as3VarZ = g4g.z(this, as3Var);
            Objects.requireNonNull(as3VarZ, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            k(as3VarZ);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            hu6.b(th);
            g4g.u(th);
            throw m(th);
        }
    }

    public final pr3 j(cfg cfgVar) {
        Objects.requireNonNull(cfgVar, "scheduler is null");
        return g4g.m(new CompletableObserveOn(this, cfgVar));
    }

    public abstract void k(as3 as3Var);

    public final pr3 l(cfg cfgVar) {
        Objects.requireNonNull(cfgVar, "scheduler is null");
        return g4g.m(new CompletableSubscribeOn(this, cfgVar));
    }
}
