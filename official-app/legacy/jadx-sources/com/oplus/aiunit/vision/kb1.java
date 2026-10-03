package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kb1<T, R> implements it3<T>, g7f<R> {
    public final it3<? super R> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c3j f13220j;
    public g7f<T> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13221l;
    public int m;

    public kb1(it3<? super R> it3Var) {
        this.i = it3Var;
    }

    public void a() {
    }

    public boolean b() {
        return true;
    }

    public final void c(Throwable th) {
        hu6.b(th);
        this.f13220j.cancel();
        onError(th);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.f13220j.cancel();
    }

    @Override // com.oplus.aiunit.vision.f4h
    public void clear() {
        this.k.clear();
    }

    public final int d(int i) {
        g7f<T> g7fVar = this.k;
        if (g7fVar == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = g7fVar.requestFusion(i);
        if (iRequestFusion != 0) {
            this.m = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // com.oplus.aiunit.vision.f4h
    public boolean isEmpty() {
        return this.k.isEmpty();
    }

    @Override // com.oplus.aiunit.vision.f4h
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.f13221l) {
            return;
        }
        this.f13221l = true;
        this.i.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.f13221l) {
            g4g.u(th);
        } else {
            this.f13221l = true;
            this.i.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public final void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.f13220j, c3jVar)) {
            this.f13220j = c3jVar;
            if (c3jVar instanceof g7f) {
                this.k = (g7f) c3jVar;
            }
            if (b()) {
                this.i.onSubscribe(this);
                a();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        this.f13220j.request(j2);
    }
}
