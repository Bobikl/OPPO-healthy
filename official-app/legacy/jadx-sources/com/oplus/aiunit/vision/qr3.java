package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public abstract class qr3 implements es3 {
    public static NullPointerException c(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @Override // com.oplus.aiunit.vision.es3
    public final void a(bs3 bs3Var) {
        abd.d(bs3Var, "observer is null");
        try {
            bs3 bs3VarV = h4g.v(this, bs3Var);
            abd.d(bs3VarV, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            b(bs3VarV);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            iu6.b(th);
            h4g.r(th);
            throw c(th);
        }
    }

    public abstract void b(bs3 bs3Var);
}
