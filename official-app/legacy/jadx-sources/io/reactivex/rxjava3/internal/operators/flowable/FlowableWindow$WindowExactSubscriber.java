package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.fv7;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.wt7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableWindow$WindowExactSubscriber<T> extends AtomicInteger implements vu7<T>, c3j, Runnable {
    private static final long serialVersionUID = -2365647875069161133L;
    final int bufferSize;
    final v2j<? super wt7<T>> downstream;
    long index;
    final AtomicBoolean once;
    final long size;
    c3j upstream;
    UnicastProcessor<T> window;

    public FlowableWindow$WindowExactSubscriber(v2j<? super wt7<T>> v2jVar, long j2, int i) {
        super(1);
        this.downstream = v2jVar;
        this.size = j2;
        this.once = new AtomicBoolean();
        this.bufferSize = i;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.once.compareAndSet(false, true)) {
            run();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        UnicastProcessor<T> unicastProcessor = this.window;
        if (unicastProcessor != null) {
            this.window = null;
            unicastProcessor.onComplete();
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        UnicastProcessor<T> unicastProcessor = this.window;
        if (unicastProcessor != null) {
            this.window = null;
            unicastProcessor.onError(th);
        }
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        fv7 fv7Var;
        long j2 = this.index;
        UnicastProcessor<T> unicastProcessorG = this.window;
        if (j2 == 0) {
            getAndIncrement();
            unicastProcessorG = UnicastProcessor.G(this.bufferSize, this);
            this.window = unicastProcessorG;
            fv7Var = new fv7(unicastProcessorG);
            this.downstream.onNext(fv7Var);
        } else {
            fv7Var = null;
        }
        long j3 = j2 + 1;
        unicastProcessorG.onNext(t);
        if (j3 == this.size) {
            this.index = 0L;
            this.window = null;
            unicastProcessorG.onComplete();
        } else {
            this.index = j3;
        }
        if (fv7Var == null || !fv7Var.D()) {
            return;
        }
        fv7Var.f11520j.onComplete();
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            this.upstream.request(vr0.d(this.size, j2));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (decrementAndGet() == 0) {
            this.upstream.cancel();
        }
    }
}
