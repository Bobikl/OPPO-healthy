package io.reactivex.processors;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.pu7;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.xt7;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class UnicastProcessor<T> extends pu7<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yki<T> f20513j;
    public final AtomicReference<Runnable> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20514l;
    public volatile boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Throwable f20515n;
    public final AtomicReference<v2j<? super T>> o;
    public volatile boolean p;
    public final AtomicBoolean q;
    public final BasicIntQueueSubscription<T> r;
    public final AtomicLong s;
    public boolean t;

    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public UnicastQueueSubscription() {
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
        public void cancel() {
            if (UnicastProcessor.this.p) {
                return;
            }
            UnicastProcessor.this.p = true;
            UnicastProcessor.this.k();
            UnicastProcessor unicastProcessor = UnicastProcessor.this;
            if (unicastProcessor.t || unicastProcessor.r.getAndIncrement() != 0) {
                return;
            }
            UnicastProcessor.this.f20513j.clear();
            UnicastProcessor.this.o.lazySet(null);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
        public void clear() {
            UnicastProcessor.this.f20513j.clear();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
        public boolean isEmpty() {
            return UnicastProcessor.this.f20513j.isEmpty();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
        public T poll() {
            return UnicastProcessor.this.f20513j.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
        public void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                wr0.a(UnicastProcessor.this.s, j2);
                UnicastProcessor.this.l();
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f7f
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.t = true;
            return 2;
        }
    }

    public UnicastProcessor(int i) {
        this(i, null, true);
    }

    public static <T> UnicastProcessor<T> i() {
        return new UnicastProcessor<>(xt7.a());
    }

    public static <T> UnicastProcessor<T> j(int i, Runnable runnable) {
        abd.d(runnable, "onTerminate");
        return new UnicastProcessor<>(i, runnable);
    }

    @Override // com.oplus.aiunit.vision.xt7
    public void g(v2j<? super T> v2jVar) {
        if (this.q.get() || !this.q.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), v2jVar);
            return;
        }
        v2jVar.onSubscribe(this.r);
        this.o.set(v2jVar);
        if (this.p) {
            this.o.lazySet(null);
        } else {
            l();
        }
    }

    public boolean h(boolean z, boolean z2, boolean z3, v2j<? super T> v2jVar, yki<T> ykiVar) {
        if (this.p) {
            ykiVar.clear();
            this.o.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.f20515n != null) {
            ykiVar.clear();
            this.o.lazySet(null);
            v2jVar.onError(this.f20515n);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.f20515n;
        this.o.lazySet(null);
        if (th != null) {
            v2jVar.onError(th);
        } else {
            v2jVar.onComplete();
        }
        return true;
    }

    public void k() {
        Runnable andSet = this.k.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    public void l() {
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
            m(v2jVar);
        } else {
            n(v2jVar);
        }
    }

    public void m(v2j<? super T> v2jVar) {
        yki<T> ykiVar = this.f20513j;
        int iAddAndGet = 1;
        boolean z = !this.f20514l;
        while (!this.p) {
            boolean z2 = this.m;
            if (z && z2 && this.f20515n != null) {
                ykiVar.clear();
                this.o.lazySet(null);
                v2jVar.onError(this.f20515n);
                return;
            }
            v2jVar.onNext(null);
            if (z2) {
                this.o.lazySet(null);
                Throwable th = this.f20515n;
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
        ykiVar.clear();
        this.o.lazySet(null);
    }

    public void n(v2j<? super T> v2jVar) {
        long j2;
        yki<T> ykiVar = this.f20513j;
        boolean z = true;
        boolean z2 = !this.f20514l;
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
                T tPoll = ykiVar.poll();
                boolean z4 = tPoll == null ? z : false;
                j2 = j4;
                if (h(z2, z3, z4, v2jVar, ykiVar)) {
                    return;
                }
                if (z4) {
                    break;
                }
                v2jVar.onNext(tPoll);
                j4 = 1 + j2;
                z = true;
            }
            if (j3 == j4 && h(z2, this.m, ykiVar.isEmpty(), v2jVar, ykiVar)) {
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
        k();
        l();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        abd.d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.m || this.p) {
            h4g.r(th);
            return;
        }
        this.f20515n = th;
        this.m = true;
        k();
        l();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        abd.d(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.m || this.p) {
            return;
        }
        this.f20513j.offer(t);
        l();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (this.m || this.p) {
            c3jVar.cancel();
        } else {
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    public UnicastProcessor(int i, Runnable runnable) {
        this(i, runnable, true);
    }

    public UnicastProcessor(int i, Runnable runnable, boolean z) {
        this.f20513j = new yki<>(abd.e(i, "capacityHint"));
        this.k = new AtomicReference<>(runnable);
        this.f20514l = z;
        this.o = new AtomicReference<>();
        this.q = new AtomicBoolean();
        this.r = new UnicastQueueSubscription();
        this.s = new AtomicLong();
    }
}
