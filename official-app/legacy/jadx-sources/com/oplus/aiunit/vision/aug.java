package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes10.dex */
public final class aug<T> extends ou7<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ou7<T> f9497j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public we0<Object> f9498l;
    public volatile boolean m;

    public aug(ou7<T> ou7Var) {
        this.f9497j = ou7Var;
    }

    public void E() {
        we0<Object> we0Var;
        while (true) {
            synchronized (this) {
                we0Var = this.f9498l;
                if (we0Var == null) {
                    this.k = false;
                    return;
                }
                this.f9498l = null;
            }
            we0Var.b(this.f9497j);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.m) {
            return;
        }
        synchronized (this) {
            if (this.m) {
                return;
            }
            this.m = true;
            if (!this.k) {
                this.k = true;
                this.f9497j.onComplete();
                return;
            }
            we0<Object> we0Var = this.f9498l;
            if (we0Var == null) {
                we0Var = new we0<>(4);
                this.f9498l = we0Var;
            }
            we0Var.c(NotificationLite.complete());
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.m) {
            g4g.u(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.m) {
                this.m = true;
                if (this.k) {
                    we0<Object> we0Var = this.f9498l;
                    if (we0Var == null) {
                        we0Var = new we0<>(4);
                        this.f9498l = we0Var;
                    }
                    we0Var.e(NotificationLite.error(th));
                    return;
                }
                this.k = true;
                z = false;
            }
            if (z) {
                g4g.u(th);
            } else {
                this.f9497j.onError(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.m) {
            return;
        }
        synchronized (this) {
            if (this.m) {
                return;
            }
            if (!this.k) {
                this.k = true;
                this.f9497j.onNext(t);
                E();
            } else {
                we0<Object> we0Var = this.f9498l;
                if (we0Var == null) {
                    we0Var = new we0<>(4);
                    this.f9498l = we0Var;
                }
                we0Var.c(NotificationLite.next(t));
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        boolean z = true;
        if (!this.m) {
            synchronized (this) {
                if (!this.m) {
                    if (this.k) {
                        we0<Object> we0Var = this.f9498l;
                        if (we0Var == null) {
                            we0Var = new we0<>(4);
                            this.f9498l = we0Var;
                        }
                        we0Var.c(NotificationLite.subscription(c3jVar));
                        return;
                    }
                    this.k = true;
                    z = false;
                }
            }
        }
        if (z) {
            c3jVar.cancel();
        } else {
            this.f9497j.onSubscribe(c3jVar);
            E();
        }
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        this.f9497j.subscribe(v2jVar);
    }
}
