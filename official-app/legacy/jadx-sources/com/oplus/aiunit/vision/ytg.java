package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes10.dex */
public final class ytg<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
    public final aed<? super T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19152j;
    public io.reactivex.rxjava3.disposables.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19153l;
    public we0<Object> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f19154n;

    public ytg(aed<? super T> aedVar) {
        this(aedVar, false);
    }

    public void a() {
        we0<Object> we0Var;
        do {
            synchronized (this) {
                we0Var = this.m;
                if (we0Var == null) {
                    this.f19153l = false;
                    return;
                }
                this.m = null;
            }
        } while (!we0Var.a(this.i));
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.f19154n = true;
        this.k.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.k.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (this.f19154n) {
            return;
        }
        synchronized (this) {
            if (this.f19154n) {
                return;
            }
            if (!this.f19153l) {
                this.f19154n = true;
                this.f19153l = true;
                this.i.onComplete();
            } else {
                we0<Object> we0Var = this.m;
                if (we0Var == null) {
                    we0Var = new we0<>(4);
                    this.m = we0Var;
                }
                we0Var.c(NotificationLite.complete());
            }
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (this.f19154n) {
            g4g.u(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.f19154n) {
                if (this.f19153l) {
                    this.f19154n = true;
                    we0<Object> we0Var = this.m;
                    if (we0Var == null) {
                        we0Var = new we0<>(4);
                        this.m = we0Var;
                    }
                    Object objError = NotificationLite.error(th);
                    if (this.f19152j) {
                        we0Var.c(objError);
                    } else {
                        we0Var.e(objError);
                    }
                    return;
                }
                this.f19154n = true;
                this.f19153l = true;
                z = false;
            }
            if (z) {
                g4g.u(th);
            } else {
                this.i.onError(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        if (this.f19154n) {
            return;
        }
        if (t == null) {
            this.k.dispose();
            onError(ExceptionHelper.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            if (this.f19154n) {
                return;
            }
            if (!this.f19153l) {
                this.f19153l = true;
                this.i.onNext(t);
                a();
            } else {
                we0<Object> we0Var = this.m;
                if (we0Var == null) {
                    we0Var = new we0<>(4);
                    this.m = we0Var;
                }
                we0Var.c(NotificationLite.next(t));
            }
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.k, aVar)) {
            this.k = aVar;
            this.i.onSubscribe(this);
        }
    }

    public ytg(aed<? super T> aedVar, boolean z) {
        this.i = aedVar;
        this.f19152j = z;
    }
}
