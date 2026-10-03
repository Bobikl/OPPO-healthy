package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mb1<T, R> implements bed<T>, b7f<R> {
    public final bed<? super R> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public cv5 f14007j;
    public b7f<T> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14008l;
    public int m;

    public mb1(bed<? super R> bedVar) {
        this.i = bedVar;
    }

    public void a() {
    }

    public boolean b() {
        return true;
    }

    public final void c(Throwable th) {
        iu6.b(th);
        this.f14007j.dispose();
        onError(th);
    }

    @Override // com.oplus.aiunit.vision.g4h
    public void clear() {
        this.k.clear();
    }

    public final int d(int i) {
        b7f<T> b7fVar = this.k;
        if (b7fVar == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = b7fVar.requestFusion(i);
        if (iRequestFusion != 0) {
            this.m = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.f14007j.dispose();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.f14007j.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return this.k.isEmpty();
    }

    @Override // com.oplus.aiunit.vision.g4h
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (this.f14008l) {
            return;
        }
        this.f14008l = true;
        this.i.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (this.f14008l) {
            h4g.r(th);
        } else {
            this.f14008l = true;
            this.i.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public final void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.f14007j, cv5Var)) {
            this.f14007j = cv5Var;
            if (cv5Var instanceof b7f) {
                this.k = (b7f) cv5Var;
            }
            if (b()) {
                this.i.onSubscribe(this);
                a();
            }
        }
    }
}
