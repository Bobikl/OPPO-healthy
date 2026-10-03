package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.xt7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableOnBackpressureLatest<T> extends g6<T, T> {

    public static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements wu7<T>, c3j {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        volatile boolean done;
        final v2j<? super T> downstream;
        Throwable error;
        c3j upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<T> current = new AtomicReference<>();

        public BackpressureLatestSubscriber(v2j<? super T> v2jVar) {
            this.downstream = v2jVar;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.current.lazySet(null);
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, v2j<?> v2jVar, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                atomicReference.lazySet(null);
                v2jVar.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            v2jVar.onComplete();
            return true;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            v2j<? super T> v2jVar = this.downstream;
            AtomicLong atomicLong = this.requested;
            AtomicReference<T> atomicReference = this.current;
            int iAddAndGet = 1;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == atomicLong.get()) {
                        break;
                    }
                    boolean z = this.done;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (checkTerminated(z, z2, v2jVar, atomicReference)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    v2jVar.onNext(andSet);
                    j2++;
                }
                if (j2 == atomicLong.get()) {
                    if (checkTerminated(this.done, atomicReference.get() == null, v2jVar, atomicReference)) {
                        return;
                    }
                }
                if (j2 != 0) {
                    wr0.e(atomicLong, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(T t) {
            this.current.lazySet(t);
            drain();
        }

        @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
        public void onSubscribe(c3j c3jVar) {
            if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
                this.upstream = c3jVar;
                this.downstream.onSubscribe(this);
                c3jVar.request(Long.MAX_VALUE);
            }
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                wr0.a(this.requested, j2);
                drain();
            }
        }
    }

    public FlowableOnBackpressureLatest(xt7<T> xt7Var) {
        super(xt7Var);
    }

    @Override // com.oplus.aiunit.vision.xt7
    public void g(v2j<? super T> v2jVar) {
        this.f11648j.f(new BackpressureLatestSubscriber(v2jVar));
    }
}
