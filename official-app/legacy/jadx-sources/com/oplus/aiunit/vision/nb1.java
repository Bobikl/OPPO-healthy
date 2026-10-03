package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
public abstract class nb1<T, R> implements vu7<T>, g7f<R> {
    public final v2j<? super R> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c3j f14424j;
    public g7f<T> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14425l;
    public int m;

    public nb1(v2j<? super R> v2jVar) {
        this.i = v2jVar;
    }

    public void a() {
    }

    public boolean b() {
        return true;
    }

    public final void c(Throwable th) {
        hu6.b(th);
        this.f14424j.cancel();
        onError(th);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.f14424j.cancel();
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
        if (this.f14425l) {
            return;
        }
        this.f14425l = true;
        this.i.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.f14425l) {
            g4g.u(th);
        } else {
            this.f14425l = true;
            this.i.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public final void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.f14424j, c3jVar)) {
            this.f14424j = c3jVar;
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
        this.f14424j.request(j2);
    }
}
