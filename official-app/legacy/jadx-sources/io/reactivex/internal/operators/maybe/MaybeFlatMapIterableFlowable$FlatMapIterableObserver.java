package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlatMapIterableFlowable$FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements mob<T> {
    private static final long serialVersionUID = -8938804753851907758L;
    volatile boolean cancelled;
    final v2j<? super R> downstream;
    volatile Iterator<? extends R> it;
    final j08<? super T, ? extends Iterable<? extends R>> mapper;
    boolean outputFused;
    final AtomicLong requested = new AtomicLong();
    cv5 upstream;

    public MaybeFlatMapIterableFlowable$FlatMapIterableObserver(v2j<? super R> v2jVar, j08<? super T, ? extends Iterable<? extends R>> j08Var) {
        this.downstream = v2jVar;
        this.mapper = j08Var;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        this.upstream.dispose();
        this.upstream = DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public void clear() {
        this.it = null;
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<? super R> v2jVar = this.downstream;
        Iterator<? extends R> it = this.it;
        if (this.outputFused && it != null) {
            v2jVar.onNext(null);
            v2jVar.onComplete();
            return;
        }
        int iAddAndGet = 1;
        while (true) {
            if (it != null) {
                long j2 = this.requested.get();
                if (j2 == Long.MAX_VALUE) {
                    fastPath(v2jVar, it);
                    return;
                }
                long j3 = 0;
                while (j3 != j2) {
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        v2jVar.onNext((Object) abd.d(it.next(), "The iterator returned a null value"));
                        if (this.cancelled) {
                            return;
                        }
                        j3++;
                        try {
                            if (!it.hasNext()) {
                                v2jVar.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            iu6.b(th);
                            v2jVar.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        iu6.b(th2);
                        v2jVar.onError(th2);
                        return;
                    }
                }
                if (j3 != 0) {
                    wr0.e(this.requested, j3);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (it == null) {
                it = this.it;
            }
        }
    }

    public void fastPath(v2j<? super R> v2jVar, Iterator<? extends R> it) {
        while (!this.cancelled) {
            try {
                v2jVar.onNext(it.next());
                if (this.cancelled) {
                    return;
                }
                try {
                    if (!it.hasNext()) {
                        v2jVar.onComplete();
                        return;
                    }
                } catch (Throwable th) {
                    iu6.b(th);
                    v2jVar.onError(th);
                    return;
                }
            } catch (Throwable th2) {
                iu6.b(th2);
                v2jVar.onError(th2);
                return;
            }
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return this.it == null;
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.upstream = DisposableHelper.DISPOSED;
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        try {
            Iterator<? extends R> it = this.mapper.apply(t).iterator();
            if (!it.hasNext()) {
                this.downstream.onComplete();
            } else {
                this.it = it;
                drain();
            }
        } catch (Throwable th) {
            iu6.b(th);
            this.downstream.onError(th);
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public R poll() throws Exception {
        Iterator<? extends R> it = this.it;
        if (it == null) {
            return null;
        }
        R r = (R) abd.d(it.next(), "The iterator returned a null value");
        if (!it.hasNext()) {
            this.it = null;
        }
        return r;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            drain();
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f7f
    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }
}
