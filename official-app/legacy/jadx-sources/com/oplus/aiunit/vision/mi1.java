package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mi1<T> extends CountDownLatch implements aed<T>, io.reactivex.rxjava3.disposables.a {
    public T i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Throwable f14073j;
    public io.reactivex.rxjava3.disposables.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f14074l;

    public mi1() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                oi1.b();
                await();
            } catch (InterruptedException e2) {
                dispose();
                throw ExceptionHelper.h(e2);
            }
        }
        Throwable th = this.f14073j;
        if (th == null) {
            return this.i;
        }
        throw ExceptionHelper.h(th);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public final void dispose() {
        this.f14074l = true;
        io.reactivex.rxjava3.disposables.a aVar = this.k;
        if (aVar != null) {
            aVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public final boolean isDisposed() {
        return this.f14074l;
    }

    @Override // com.oplus.aiunit.vision.aed
    public final void onComplete() {
        countDown();
    }

    @Override // com.oplus.aiunit.vision.aed
    public final void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        this.k = aVar;
        if (this.f14074l) {
            aVar.dispose();
        }
    }
}
