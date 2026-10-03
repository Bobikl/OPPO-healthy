package com.oplus.aiunit.vision;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.subscribers.StrictSubscriber;

/* JADX INFO: loaded from: classes10.dex */
public abstract class xt7<T> implements k3f<T> {
    public static final int i = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static int a() {
        return i;
    }

    public final xt7<T> b() {
        return c(a(), false, true);
    }

    public final xt7<T> c(int i2, boolean z, boolean z2) {
        abd.e(i2, "capacity");
        return h4g.l(new FlowableOnBackpressureBuffer(this, i2, z2, z, Functions.EMPTY_ACTION));
    }

    public final xt7<T> d() {
        return h4g.l(new FlowableOnBackpressureDrop(this));
    }

    public final xt7<T> e() {
        return h4g.l(new FlowableOnBackpressureLatest(this));
    }

    public final void f(wu7<? super T> wu7Var) {
        abd.d(wu7Var, "s is null");
        try {
            v2j<? super T> v2jVarZ = h4g.z(this, wu7Var);
            abd.d(v2jVarZ, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            g(v2jVarZ);
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

    public abstract void g(v2j<? super T> v2jVar);

    @Override // com.oplus.aiunit.vision.k3f
    public final void subscribe(v2j<? super T> v2jVar) {
        if (v2jVar instanceof wu7) {
            f((wu7) v2jVar);
        } else {
            abd.d(v2jVar, "s is null");
            f(new StrictSubscriber(v2jVar));
        }
    }
}
