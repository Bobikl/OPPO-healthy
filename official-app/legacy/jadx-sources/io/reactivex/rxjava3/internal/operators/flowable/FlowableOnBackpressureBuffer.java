package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.b4h;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.f6;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.wt7;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableOnBackpressureBuffer<T> extends f6<T, T> {
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20529l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Cdo f20530n;

    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements vu7<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final v2j<? super T> downstream;
        Throwable error;
        final Cdo onOverflow;
        boolean outputFused;
        final b4h<T> queue;
        final AtomicLong requested = new AtomicLong();
        c3j upstream;

        public BackpressureBufferSubscriber(v2j<? super T> v2jVar, int i, boolean z, boolean z2, Cdo cdo) {
            this.downstream = v2jVar;
            this.onOverflow = cdo;
            this.delayError = z2;
            this.queue = z ? new xki<>(i) : new SpscArrayQueue<>(i);
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.clear();
        }

        public boolean checkTerminated(boolean z, boolean z2, v2j<? super T> v2jVar) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.delayError) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    v2jVar.onError(th);
                } else {
                    v2jVar.onComplete();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                v2jVar.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            v2jVar.onComplete();
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                b4h<T> b4hVar = this.queue;
                v2j<? super T> v2jVar = this.downstream;
                int iAddAndGet = 1;
                while (!checkTerminated(this.done, b4hVar.isEmpty(), v2jVar)) {
                    long j2 = this.requested.get();
                    long j3 = 0;
                    while (j3 != j2) {
                        boolean z = this.done;
                        T tPoll = b4hVar.poll();
                        boolean z2 = tPoll == null;
                        if (checkTerminated(z, z2, v2jVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        v2jVar.onNext(tPoll);
                        j3++;
                    }
                    if (j3 == j2 && checkTerminated(this.done, b4hVar.isEmpty(), v2jVar)) {
                        return;
                    }
                    if (j3 != 0 && j2 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j3);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                drain();
            }
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(T t) {
            if (this.queue.offer(t)) {
                if (this.outputFused) {
                    this.downstream.onNext(null);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            this.upstream.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.onOverflow.run();
            } catch (Throwable th) {
                hu6.b(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
        public void onSubscribe(c3j c3jVar) {
            if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
                this.upstream = c3jVar;
                this.downstream.onSubscribe(this);
                c3jVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
        public T poll() {
            return this.queue.poll();
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
        public void request(long j2) {
            if (this.outputFused || !SubscriptionHelper.validate(j2)) {
                return;
            }
            vr0.a(this.requested, j2);
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.e7f
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }
    }

    public FlowableOnBackpressureBuffer(wt7<T> wt7Var, int i, boolean z, boolean z2, Cdo cdo) {
        super(wt7Var);
        this.k = i;
        this.f20529l = z;
        this.m = z2;
        this.f20530n = cdo;
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        this.f11230j.y(new BackpressureBufferSubscriber(v2jVar, this.k, this.f20529l, this.m, this.f20530n));
    }
}
