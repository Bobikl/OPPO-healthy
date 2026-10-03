package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSubscribeOn$SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements wu7<T>, c3j, Runnable {
    private static final long serialVersionUID = 8094547886072529208L;
    final v2j<? super T> downstream;
    final boolean nonScheduledRequests;
    k3f<T> source;
    final zeg.c worker;
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();

    public static final class a implements Runnable {
        public final c3j i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f20471j;

        public a(c3j c3jVar, long j2) {
            this.i = c3jVar;
            this.f20471j = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.i.request(this.f20471j);
        }
    }

    public FlowableSubscribeOn$SubscribeOnSubscriber(v2j<? super T> v2jVar, zeg.c cVar, k3f<T> k3fVar, boolean z) {
        this.downstream = v2jVar;
        this.worker = cVar;
        this.source = k3fVar;
        this.nonScheduledRequests = !z;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.downstream.onComplete();
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.downstream.onError(th);
        this.worker.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this.upstream, c3jVar)) {
            long andSet = this.requested.getAndSet(0L);
            if (andSet != 0) {
                requestUpstream(andSet, c3jVar);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            c3j c3jVar = this.upstream.get();
            if (c3jVar != null) {
                requestUpstream(j2, c3jVar);
                return;
            }
            wr0.a(this.requested, j2);
            c3j c3jVar2 = this.upstream.get();
            if (c3jVar2 != null) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    requestUpstream(andSet, c3jVar2);
                }
            }
        }
    }

    public void requestUpstream(long j2, c3j c3jVar) {
        if (this.nonScheduledRequests || Thread.currentThread() == get()) {
            c3jVar.request(j2);
        } else {
            this.worker.b(new a(c3jVar, j2));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        lazySet(Thread.currentThread());
        k3f<T> k3fVar = this.source;
        this.source = null;
        k3fVar.subscribe(this);
    }
}
