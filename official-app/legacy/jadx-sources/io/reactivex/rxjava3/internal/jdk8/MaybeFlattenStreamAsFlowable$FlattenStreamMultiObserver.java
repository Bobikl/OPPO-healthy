package io.reactivex.rxjava3.internal.jdk8;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlattenStreamAsFlowable$FlattenStreamMultiObserver<T, R> extends BasicIntQueueSubscription<R> implements lob<T>, l6h<T> {
    private static final long serialVersionUID = 7363336003027148283L;
    volatile boolean cancelled;
    AutoCloseable close;
    final v2j<? super R> downstream;
    long emitted;
    volatile Iterator<? extends R> iterator;
    final d08<? super T, ? extends Stream<? extends R>> mapper;
    boolean once;
    boolean outputFused;
    final AtomicLong requested = new AtomicLong();
    a upstream;

    public MaybeFlattenStreamAsFlowable$FlattenStreamMultiObserver(v2j<? super R> v2jVar, d08<? super T, ? extends Stream<? extends R>> d08Var) {
        this.downstream = v2jVar;
        this.mapper = d08Var;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        this.upstream.dispose();
        if (this.outputFused) {
            return;
        }
        drain();
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
    public void clear() {
        this.iterator = null;
        AutoCloseable autoCloseable = this.close;
        this.close = null;
        close(autoCloseable);
    }

    public void close(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<? super R> v2jVar = this.downstream;
        long j2 = this.emitted;
        long j3 = this.requested.get();
        Iterator<? extends R> it = this.iterator;
        int iAddAndGet = 1;
        while (true) {
            if (this.cancelled) {
                clear();
            } else if (this.outputFused) {
                if (it != null) {
                    v2jVar.onNext(null);
                    v2jVar.onComplete();
                }
            } else if (it != null && j2 != j3) {
                try {
                    R next = it.next();
                    if (!this.cancelled) {
                        v2jVar.onNext(next);
                        j2++;
                        if (!this.cancelled) {
                            try {
                                boolean zHasNext = it.hasNext();
                                if (!this.cancelled && !zHasNext) {
                                    v2jVar.onComplete();
                                    this.cancelled = true;
                                }
                            } catch (Throwable th) {
                                hu6.b(th);
                                v2jVar.onError(th);
                                this.cancelled = true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    hu6.b(th2);
                    v2jVar.onError(th2);
                    this.cancelled = true;
                }
            }
            this.emitted = j2;
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            j3 = this.requested.get();
            if (it == null) {
                it = this.iterator;
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
    public boolean isEmpty() {
        Iterator<? extends R> it = this.iterator;
        if (it == null) {
            return true;
        }
        if (!this.once || it.hasNext()) {
            return false;
        }
        clear();
        return true;
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        try {
            Stream<? extends R> streamApply = this.mapper.apply(t);
            Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
            Stream<? extends R> stream = streamApply;
            Iterator<? extends R> it = stream.iterator();
            if (!it.hasNext()) {
                this.downstream.onComplete();
                close(stream);
            } else {
                this.iterator = it;
                this.close = stream;
                drain();
            }
        } catch (Throwable th) {
            hu6.b(th);
            this.downstream.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f4h
    public R poll() throws Throwable {
        Iterator<? extends R> it = this.iterator;
        if (it == null) {
            return null;
        }
        if (!this.once) {
            this.once = true;
        } else if (!it.hasNext()) {
            clear();
            return null;
        }
        return it.next();
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this.requested, j2);
            drain();
        }
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
