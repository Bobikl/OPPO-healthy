package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lb1<T, R> implements aed<T>, a7f<R> {
    public final aed<? super R> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.a f13615j;
    public a7f<T> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13616l;
    public int m;

    public lb1(aed<? super R> aedVar) {
        this.i = aedVar;
    }

    public void a() {
    }

    public boolean b() {
        return true;
    }

    public final void c(Throwable th) {
        hu6.b(th);
        this.f13615j.dispose();
        onError(th);
    }

    @Override // com.oplus.aiunit.vision.f4h
    public void clear() {
        this.k.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.f13615j.dispose();
    }

    public final int f(int i) {
        a7f<T> a7fVar = this.k;
        if (a7fVar == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = a7fVar.requestFusion(i);
        if (iRequestFusion != 0) {
            this.m = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.f13615j.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.f4h
    public boolean isEmpty() {
        return this.k.isEmpty();
    }

    @Override // com.oplus.aiunit.vision.f4h
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (this.f13616l) {
            return;
        }
        this.f13616l = true;
        this.i.onComplete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (this.f13616l) {
            g4g.u(th);
        } else {
            this.f13616l = true;
            this.i.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public final void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.f13615j, aVar)) {
            this.f13615j = aVar;
            if (aVar instanceof a7f) {
                this.k = (a7f) aVar;
            }
            if (b()) {
                this.i.onSubscribe(this);
                a();
            }
        }
    }
}
