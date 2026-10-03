package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.xt7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableWindow$WindowSkipSubscriber<T> extends AtomicInteger implements wu7<T>, c3j, Runnable {
    private static final long serialVersionUID = -8792836352386833856L;
    final int bufferSize;
    final v2j<? super xt7<T>> downstream;
    final AtomicBoolean firstRequest;
    long index;
    final AtomicBoolean once;
    final long size;
    final long skip;
    c3j upstream;
    UnicastProcessor<T> window;

    public FlowableWindow$WindowSkipSubscriber(v2j<? super xt7<T>> v2jVar, long j2, long j3, int i) {
        super(1);
        this.downstream = v2jVar;
        this.size = j2;
        this.skip = j3;
        this.once = new AtomicBoolean();
        this.firstRequest = new AtomicBoolean();
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
        long j2 = this.index;
        UnicastProcessor<T> unicastProcessorJ = this.window;
        if (j2 == 0) {
            getAndIncrement();
            unicastProcessorJ = UnicastProcessor.j(this.bufferSize, this);
            this.window = unicastProcessorJ;
            this.downstream.onNext(unicastProcessorJ);
        }
        long j3 = j2 + 1;
        if (unicastProcessorJ != null) {
            unicastProcessorJ.onNext(t);
        }
        if (j3 == this.size) {
            this.window = null;
            unicastProcessorJ.onComplete();
        }
        if (j3 == this.skip) {
            this.index = 0L;
        } else {
            this.index = j3;
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
                this.upstream.request(wr0.d(this.skip, j2));
            } else {
                this.upstream.request(wr0.c(wr0.d(this.size, j2), wr0.d(this.skip - this.size, j2 - 1)));
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (decrementAndGet() == 0) {
            this.upstream.cancel();
        }
    }
}
