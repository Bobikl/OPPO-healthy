package io.reactivex.rxjava3.processors;

import com.oplus.aiunit.vision.bbd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.ou7;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.wt7;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class UnicastProcessor<T> extends ou7<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xki<T> f20637j;
    public final AtomicReference<Runnable> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20638l;
    public volatile boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Throwable f20639n;
    public volatile boolean p;
    public boolean t;
    public final AtomicReference<v2j<? super T>> o = new AtomicReference<>();
    public final AtomicBoolean q = new AtomicBoolean();
    public final BasicIntQueueSubscription<T> r = new UnicastQueueSubscription();
    public final AtomicLong s = new AtomicLong();

    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public UnicastQueueSubscription() {
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
        public void cancel() {
            if (UnicastProcessor.this.p) {
                return;
            }
            UnicastProcessor.this.p = true;
            UnicastProcessor.this.I();
            UnicastProcessor.this.o.lazySet(null);
            if (UnicastProcessor.this.r.getAndIncrement() == 0) {
                UnicastProcessor.this.o.lazySet(null);
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                if (unicastProcessor.t) {
                    return;
                }
                unicastProcessor.f20637j.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
        public void clear() {
            UnicastProcessor.this.f20637j.clear();
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
        public boolean isEmpty() {
            return UnicastProcessor.this.f20637j.isEmpty();
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
        public T poll() {
            return UnicastProcessor.this.f20637j.poll();
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
        public void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                vr0.a(UnicastProcessor.this.s, j2);
                UnicastProcessor.this.J();
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.e7f
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.t = true;
            return 2;
        }
    }

    public UnicastProcessor(int i, Runnable runnable, boolean z) {
        this.f20637j = new xki<>(i);
        this.k = new AtomicReference<>(runnable);
        this.f20638l = z;
    }

    public static <T> UnicastProcessor<T> F() {
        return new UnicastProcessor<>(wt7.a(), null, true);
    }

    public static <T> UnicastProcessor<T> G(int i, Runnable runnable) {
        return H(i, runnable, true);
    }

    public static <T> UnicastProcessor<T> H(int i, Runnable runnable, boolean z) {
        Objects.requireNonNull(runnable, "onTerminate");
        bbd.a(i, "capacityHint");
        return new UnicastProcessor<>(i, runnable, z);
    }

    public boolean E(boolean z, boolean z2, boolean z3, v2j<? super T> v2jVar, xki<T> xkiVar) {
        if (this.p) {
            xkiVar.clear();
            this.o.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.f20639n != null) {
            xkiVar.clear();
            this.o.lazySet(null);
            v2jVar.onError(this.f20639n);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.f20639n;
        this.o.lazySet(null);
        if (th != null) {
            v2jVar.onError(th);
        } else {
            v2jVar.onComplete();
        }
        return true;
    }

    public void I() {
        Runnable andSet = this.k.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    public void J() {
        if (this.r.getAndIncrement() != 0) {
            return;
        }
        v2j<? super T> v2jVar = this.o.get();
        int iAddAndGet = 1;
        while (v2jVar == null) {
            iAddAndGet = this.r.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                v2jVar = this.o.get();
            }
        }
        if (this.t) {
            K(v2jVar);
        } else {
            L(v2jVar);
        }
    }

    public void K(v2j<? super T> v2jVar) {
        xki<T> xkiVar = this.f20637j;
        int iAddAndGet = 1;
        boolean z = !this.f20638l;
        while (!this.p) {
            boolean z2 = this.m;
            if (z && z2 && this.f20639n != null) {
                xkiVar.clear();
                this.o.lazySet(null);
                v2jVar.onError(this.f20639n);
                return;
            }
            v2jVar.onNext(null);
            if (z2) {
                this.o.lazySet(null);
                Throwable th = this.f20639n;
                if (th != null) {
                    v2jVar.onError(th);
                    return;
                } else {
                    v2jVar.onComplete();
                    return;
                }
            }
            iAddAndGet = this.r.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        this.o.lazySet(null);
    }

    public void L(v2j<? super T> v2jVar) {
        long j2;
        xki<T> xkiVar = this.f20637j;
        boolean z = true;
        boolean z2 = !this.f20638l;
        int iAddAndGet = 1;
        while (true) {
            long j3 = this.s.get();
            long j4 = 0;
            while (true) {
                if (j3 == j4) {
                    j2 = j4;
                    break;
                }
                boolean z3 = this.m;
                T tPoll = xkiVar.poll();
                boolean z4 = tPoll == null ? z : false;
                j2 = j4;
                if (E(z2, z3, z4, v2jVar, xkiVar)) {
                    return;
                }
                if (z4) {
                    break;
                }
                v2jVar.onNext(tPoll);
                j4 = 1 + j2;
                z = true;
            }
            if (j3 == j4 && E(z2, this.m, xkiVar.isEmpty(), v2jVar, xkiVar)) {
                return;
            }
            if (j2 != 0 && j3 != Long.MAX_VALUE) {
                this.s.addAndGet(-j2);
            }
            iAddAndGet = this.r.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                z = true;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.m || this.p) {
            return;
        }
        this.m = true;
        I();
        J();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        if (this.m || this.p) {
            g4g.u(th);
            return;
        }
        this.f20639n = th;
        this.m = true;
        I();
        J();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        ExceptionHelper.c(t, "onNext called with a null value.");
        if (this.m || this.p) {
            return;
        }
        this.f20637j.offer(t);
        J();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (this.m || this.p) {
            c3jVar.cancel();
        } else {
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        if (this.q.get() || !this.q.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), v2jVar);
            return;
        }
        v2jVar.onSubscribe(this.r);
        this.o.set(v2jVar);
        if (this.p) {
            this.o.lazySet(null);
        } else {
            J();
        }
    }
}
