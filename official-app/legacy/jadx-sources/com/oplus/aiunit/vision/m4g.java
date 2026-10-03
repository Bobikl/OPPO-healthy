package com.oplus.aiunit.vision;

import androidx.annotation.CallSuper;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes15.dex */
@Deprecated
public abstract class m4g<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
    public final AtomicReference<io.reactivex.rxjava3.disposables.a> i = new AtomicReference<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dza f13944j = new dza();

    public final String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public void b() {
    }

    public final void c(Class<?> cls) {
        g4g.u(new IllegalStateException(a(cls.getName())));
    }

    @Override // io.reactivex.rxjava3.disposables.a
    @CallSuper
    public void dispose() {
        if (DisposableHelper.dispose(this.i)) {
            this.f13944j.dispose();
        }
    }

    public final boolean f(AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference, io.reactivex.rxjava3.disposables.a aVar, Class<?> cls) {
        Objects.requireNonNull(aVar, "next is null");
        if (fue.a(atomicReference, null, aVar)) {
            return true;
        }
        aVar.dispose();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        c(cls);
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.i.get());
    }

    @Override // com.oplus.aiunit.vision.aed
    public final void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (f(this.i, aVar, getClass())) {
            b();
        }
    }
}
