package io.reactivex.rxjava3.internal.subscriptions;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.vr0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public class SubscriptionArbiter extends AtomicInteger implements c3j {
    private static final long serialVersionUID = -2189523197179400958L;
    c3j actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<c3j> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public SubscriptionArbiter(boolean z) {
        this.cancelOnReplace = z;
    }

    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        drain();
    }

    final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    final void drainLoop() {
        int iAddAndGet = 1;
        long jC = 0;
        c3j c3jVar = null;
        do {
            c3j andSet = this.missedSubscription.get();
            if (andSet != null) {
                andSet = this.missedSubscription.getAndSet(null);
            }
            long andSet2 = this.missedRequested.get();
            if (andSet2 != 0) {
                andSet2 = this.missedRequested.getAndSet(0L);
            }
            long andSet3 = this.missedProduced.get();
            if (andSet3 != 0) {
                andSet3 = this.missedProduced.getAndSet(0L);
            }
            c3j c3jVar2 = this.actual;
            if (this.cancelled) {
                if (c3jVar2 != null) {
                    c3jVar2.cancel();
                    this.actual = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jC2 = this.requested;
                if (jC2 != Long.MAX_VALUE) {
                    jC2 = vr0.c(jC2, andSet2);
                    if (jC2 != Long.MAX_VALUE) {
                        jC2 -= andSet3;
                        if (jC2 < 0) {
                            SubscriptionHelper.reportMoreProduced(jC2);
                            jC2 = 0;
                        }
                    }
                    this.requested = jC2;
                }
                if (andSet != null) {
                    if (c3jVar2 != null && this.cancelOnReplace) {
                        c3jVar2.cancel();
                    }
                    this.actual = andSet;
                    if (jC2 != 0) {
                        jC = vr0.c(jC, jC2);
                        c3jVar = andSet;
                    }
                } else if (c3jVar2 != null && andSet2 != 0) {
                    jC = vr0.c(jC, andSet2);
                    c3jVar = c3jVar2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jC != 0) {
            c3jVar.request(jC);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j2) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            vr0.a(this.missedProduced, j2);
            drain();
            return;
        }
        long j3 = this.requested;
        if (j3 != Long.MAX_VALUE) {
            long j4 = j3 - j2;
            if (j4 < 0) {
                SubscriptionHelper.reportMoreProduced(j4);
                j4 = 0;
            }
            this.requested = j4;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        drainLoop();
    }

    @Override // com.oplus.aiunit.vision.c3j
    public final void request(long j2) {
        if (!SubscriptionHelper.validate(j2) || this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            vr0.a(this.missedRequested, j2);
            drain();
            return;
        }
        long j3 = this.requested;
        if (j3 != Long.MAX_VALUE) {
            long jC = vr0.c(j3, j2);
            this.requested = jC;
            if (jC == Long.MAX_VALUE) {
                this.unbounded = true;
            }
        }
        c3j c3jVar = this.actual;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (c3jVar != null) {
            c3jVar.request(j2);
        }
    }

    public final void setSubscription(c3j c3jVar) {
        if (this.cancelled) {
            c3jVar.cancel();
            return;
        }
        Objects.requireNonNull(c3jVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            c3j andSet = this.missedSubscription.getAndSet(c3jVar);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            drain();
            return;
        }
        c3j c3jVar2 = this.actual;
        if (c3jVar2 != null && this.cancelOnReplace) {
            c3jVar2.cancel();
        }
        this.actual = c3jVar;
        long j2 = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j2 != 0) {
            c3jVar.request(j2);
        }
    }
}
