package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g5h<T> implements t6h<T> {
    @Override // com.oplus.aiunit.vision.t6h
    public final void a(m6h<? super T> m6hVar) {
        abd.d(m6hVar, "observer is null");
        m6h<? super T> m6hVarY = h4g.y(this, m6hVar);
        abd.d(m6hVarY, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            b(m6hVarY);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            iu6.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(m6h<? super T> m6hVar);
}
