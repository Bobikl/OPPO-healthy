package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes10.dex */
public final class ztg<T> implements bed<T>, cv5 {
    public final bed<? super T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19550j;
    public cv5 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19551l;
    public ve0<Object> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f19552n;

    public ztg(bed<? super T> bedVar) {
        this(bedVar, false);
    }

    public void a() {
        ve0<Object> ve0Var;
        do {
            synchronized (this) {
                ve0Var = this.m;
                if (ve0Var == null) {
                    this.f19551l = false;
                    return;
                }
                this.m = null;
            }
        } while (!ve0Var.a(this.i));
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.k.dispose();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.k.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (this.f19552n) {
            return;
        }
        synchronized (this) {
            if (this.f19552n) {
                return;
            }
            if (!this.f19551l) {
                this.f19552n = true;
                this.f19551l = true;
                this.i.onComplete();
            } else {
                ve0<Object> ve0Var = this.m;
                if (ve0Var == null) {
                    ve0Var = new ve0<>(4);
                    this.m = ve0Var;
                }
                ve0Var.b(NotificationLite.complete());
            }
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (this.f19552n) {
            h4g.r(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.f19552n) {
                if (this.f19551l) {
                    this.f19552n = true;
                    ve0<Object> ve0Var = this.m;
                    if (ve0Var == null) {
                        ve0Var = new ve0<>(4);
                        this.m = ve0Var;
                    }
                    Object objError = NotificationLite.error(th);
                    if (this.f19550j) {
                        ve0Var.b(objError);
                    } else {
                        ve0Var.d(objError);
                    }
                    return;
                }
                this.f19552n = true;
                this.f19551l = true;
                z = false;
            }
            if (z) {
                h4g.r(th);
            } else {
                this.i.onError(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (this.f19552n) {
            return;
        }
        if (t == null) {
            this.k.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.f19552n) {
                return;
            }
            if (!this.f19551l) {
                this.f19551l = true;
                this.i.onNext(t);
                a();
            } else {
                ve0<Object> ve0Var = this.m;
                if (ve0Var == null) {
                    ve0Var = new ve0<>(4);
                    this.m = ve0Var;
                }
                ve0Var.b(NotificationLite.next(t));
            }
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.k, cv5Var)) {
            this.k = cv5Var;
            this.i.onSubscribe(this);
        }
    }

    public ztg(bed<? super T> bedVar, boolean z) {
        this.i = bedVar;
        this.f19550j = z;
    }
}
