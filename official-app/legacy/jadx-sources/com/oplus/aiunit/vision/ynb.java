package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ynb<T> implements qob<T> {
    @Override // com.oplus.aiunit.vision.qob
    public final void a(mob<? super T> mobVar) {
        abd.d(mobVar, "observer is null");
        mob<? super T> mobVarW = h4g.w(this, mobVar);
        abd.d(mobVarW, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            b(mobVarW);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            iu6.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(mob<? super T> mobVar);
}
