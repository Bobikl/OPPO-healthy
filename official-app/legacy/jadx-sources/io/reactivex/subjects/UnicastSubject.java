package io.reactivex.subjects;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.r2j;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class UnicastSubject<T> extends r2j<T> {
    public final yki<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<bed<? super T>> f20663j;
    public final AtomicReference<Runnable> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20664l;
    public volatile boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f20665n;
    public Throwable o;
    public final AtomicBoolean p;
    public final BasicIntQueueDisposable<T> q;
    public boolean r;

    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        public UnicastQueueDisposable() {
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
        public void clear() {
            UnicastSubject.this.i.clear();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
        public void dispose() {
            if (UnicastSubject.this.m) {
                return;
            }
            UnicastSubject.this.m = true;
            UnicastSubject.this.K();
            UnicastSubject.this.f20663j.lazySet(null);
            if (UnicastSubject.this.q.getAndIncrement() == 0) {
                UnicastSubject.this.f20663j.lazySet(null);
                UnicastSubject.this.i.clear();
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return UnicastSubject.this.m;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
        public boolean isEmpty() {
            return UnicastSubject.this.i.isEmpty();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
        public T poll() throws Exception {
            return UnicastSubject.this.i.poll();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f7f
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            UnicastSubject.this.r = true;
            return 2;
        }
    }

    public UnicastSubject(int i, boolean z) {
        this.i = new yki<>(abd.e(i, "capacityHint"));
        this.k = new AtomicReference<>();
        this.f20664l = z;
        this.f20663j = new AtomicReference<>();
        this.p = new AtomicBoolean();
        this.q = new UnicastQueueDisposable();
    }

    public static <T> UnicastSubject<T> I() {
        return new UnicastSubject<>(kbd.a(), true);
    }

    public static <T> UnicastSubject<T> J(int i, Runnable runnable) {
        return new UnicastSubject<>(i, runnable, true);
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        if (this.p.get() || !this.p.compareAndSet(false, true)) {
            EmptyDisposable.error(new IllegalStateException("Only a single observer allowed."), bedVar);
            return;
        }
        bedVar.onSubscribe(this.q);
        this.f20663j.lazySet(bedVar);
        if (this.m) {
            this.f20663j.lazySet(null);
        } else {
            L();
        }
    }

    public void K() {
        Runnable runnable = this.k.get();
        if (runnable == null || !fue.a(this.k, runnable, null)) {
            return;
        }
        runnable.run();
    }

    public void L() {
        if (this.q.getAndIncrement() != 0) {
            return;
        }
        bed<? super T> bedVar = this.f20663j.get();
        int iAddAndGet = 1;
        while (bedVar == null) {
            iAddAndGet = this.q.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                bedVar = this.f20663j.get();
            }
        }
        if (this.r) {
            M(bedVar);
        } else {
            N(bedVar);
        }
    }

    public void M(bed<? super T> bedVar) {
        yki<T> ykiVar = this.i;
        int iAddAndGet = 1;
        boolean z = !this.f20664l;
        while (!this.m) {
            boolean z2 = this.f20665n;
            if (z && z2 && P(ykiVar, bedVar)) {
                return;
            }
            bedVar.onNext(null);
            if (z2) {
                O(bedVar);
                return;
            } else {
                iAddAndGet = this.q.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.f20663j.lazySet(null);
        ykiVar.clear();
    }

    public void N(bed<? super T> bedVar) {
        yki<T> ykiVar = this.i;
        boolean z = !this.f20664l;
        boolean z2 = true;
        int iAddAndGet = 1;
        while (!this.m) {
            boolean z3 = this.f20665n;
            T tPoll = this.i.poll();
            boolean z4 = tPoll == null;
            if (z3) {
                if (z && z2) {
                    if (P(ykiVar, bedVar)) {
                        return;
                    } else {
                        z2 = false;
                    }
                }
                if (z4) {
                    O(bedVar);
                    return;
                }
            }
            if (z4) {
                iAddAndGet = this.q.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                bedVar.onNext(tPoll);
            }
        }
        this.f20663j.lazySet(null);
        ykiVar.clear();
    }

    public void O(bed<? super T> bedVar) {
        this.f20663j.lazySet(null);
        Throwable th = this.o;
        if (th != null) {
            bedVar.onError(th);
        } else {
            bedVar.onComplete();
        }
    }

    public boolean P(g4h<T> g4hVar, bed<? super T> bedVar) {
        Throwable th = this.o;
        if (th == null) {
            return false;
        }
        this.f20663j.lazySet(null);
        g4hVar.clear();
        bedVar.onError(th);
        return true;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (this.f20665n || this.m) {
            return;
        }
        this.f20665n = true;
        K();
        L();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        abd.d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f20665n || this.m) {
            h4g.r(th);
            return;
        }
        this.o = th;
        this.f20665n = true;
        K();
        L();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        abd.d(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f20665n || this.m) {
            return;
        }
        this.i.offer(t);
        L();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (this.f20665n || this.m) {
            cv5Var.dispose();
        }
    }

    public UnicastSubject(int i, Runnable runnable, boolean z) {
        this.i = new yki<>(abd.e(i, "capacityHint"));
        this.k = new AtomicReference<>(abd.d(runnable, "onTerminate"));
        this.f20664l = z;
        this.f20663j = new AtomicReference<>();
        this.p = new AtomicBoolean();
        this.q = new UnicastQueueDisposable();
    }
}
