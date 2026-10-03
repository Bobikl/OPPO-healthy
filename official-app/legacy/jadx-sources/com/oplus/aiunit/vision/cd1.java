package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes10.dex */
public final class cd1<T> extends s2j<T> {
    public static final a[] p = new a[0];
    public static final a[] q = new a[0];
    public final AtomicReference<Object> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f10033j;
    public final ReadWriteLock k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lock f10034l;
    public final Lock m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicReference<Throwable> f10035n;
    public long o;

    public static final class a<T> implements io.reactivex.rxjava3.disposables.a, we0.a<Object> {
        public final aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final cd1<T> f10036j;
        public boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f10037l;
        public we0<Object> m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f10038n;
        public volatile boolean o;
        public long p;

        public a(aed<? super T> aedVar, cd1<T> cd1Var) {
            this.i = aedVar;
            this.f10036j = cd1Var;
        }

        public void a() {
            if (this.o) {
                return;
            }
            synchronized (this) {
                if (this.o) {
                    return;
                }
                if (this.k) {
                    return;
                }
                cd1<T> cd1Var = this.f10036j;
                Lock lock = cd1Var.f10034l;
                lock.lock();
                this.p = cd1Var.o;
                Object obj = cd1Var.i.get();
                lock.unlock();
                this.f10037l = obj != null;
                this.k = true;
                if (obj == null || test(obj)) {
                    return;
                }
                b();
            }
        }

        public void b() {
            we0<Object> we0Var;
            while (!this.o) {
                synchronized (this) {
                    we0Var = this.m;
                    if (we0Var == null) {
                        this.f10037l = false;
                        return;
                    }
                    this.m = null;
                }
                we0Var.d(this);
            }
        }

        public void c(Object obj, long j2) {
            if (this.o) {
                return;
            }
            if (!this.f10038n) {
                synchronized (this) {
                    if (this.o) {
                        return;
                    }
                    if (this.p == j2) {
                        return;
                    }
                    if (this.f10037l) {
                        we0<Object> we0Var = this.m;
                        if (we0Var == null) {
                            we0Var = new we0<>(4);
                            this.m = we0Var;
                        }
                        we0Var.c(obj);
                        return;
                    }
                    this.k = true;
                    this.f10038n = true;
                }
            }
            test(obj);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (this.o) {
                return;
            }
            this.o = true;
            this.f10036j.x1(this);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.o;
        }

        @Override // com.oplus.aiunit.vision.we0.a, com.oplus.aiunit.vision.mpe
        public boolean test(Object obj) {
            return this.o || NotificationLite.accept(obj, this.i);
        }
    }

    public cd1(T t) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.k = reentrantReadWriteLock;
        this.f10034l = reentrantReadWriteLock.readLock();
        this.m = reentrantReadWriteLock.writeLock();
        this.f10033j = new AtomicReference<>(p);
        this.i = new AtomicReference<>(t);
        this.f10035n = new AtomicReference<>();
    }

    public static <T> cd1<T> v1() {
        return new cd1<>(null);
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        a<T> aVar = new a<>(aedVar, this);
        aedVar.onSubscribe(aVar);
        if (u1(aVar)) {
            if (aVar.o) {
                x1(aVar);
                return;
            } else {
                aVar.a();
                return;
            }
        }
        Throwable th = this.f10035n.get();
        if (th == ExceptionHelper.TERMINATED) {
            aedVar.onComplete();
        } else {
            aedVar.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (fue.a(this.f10035n, null, ExceptionHelper.TERMINATED)) {
            Object objComplete = NotificationLite.complete();
            for (a<T> aVar : z1(objComplete)) {
                aVar.c(objComplete, this.o);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        if (!fue.a(this.f10035n, null, th)) {
            g4g.u(th);
            return;
        }
        Object objError = NotificationLite.error(th);
        for (a<T> aVar : z1(objError)) {
            aVar.c(objError, this.o);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        ExceptionHelper.c(t, "onNext called with a null value.");
        if (this.f10035n.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t);
        y1(next);
        for (a<T> aVar : this.f10033j.get()) {
            aVar.c(next, this.o);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (this.f10035n.get() != null) {
            aVar.dispose();
        }
    }

    public boolean u1(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f10033j.get();
            if (aVarArr == q) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!fue.a(this.f10033j, aVarArr, aVarArr2));
        return true;
    }

    public T w1() {
        Object obj = this.i.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    public void x1(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f10033j.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (aVarArr[i] == aVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = p;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!fue.a(this.f10033j, aVarArr, aVarArr2));
    }

    public void y1(Object obj) {
        this.m.lock();
        this.o++;
        this.i.lazySet(obj);
        this.m.unlock();
    }

    public a<T>[] z1(Object obj) {
        y1(obj);
        return this.f10033j.getAndSet(q);
    }
}
