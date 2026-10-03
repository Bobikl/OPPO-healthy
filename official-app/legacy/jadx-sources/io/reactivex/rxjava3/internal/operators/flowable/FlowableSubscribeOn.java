package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.f6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.wt7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableSubscribeOn<T> extends f6<T, T> {
    public final cfg k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20531l;

    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements vu7<T>, c3j, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final v2j<? super T> downstream;
        final boolean nonScheduledRequests;
        k3f<T> source;
        final cfg.c worker;
        final AtomicReference<c3j> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public static final class a implements Runnable {
            public final c3j i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final long f20532j;

            public a(c3j c3jVar, long j2) {
                this.i = c3jVar;
                this.f20532j = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.i.request(this.f20532j);
            }
        }

        public SubscribeOnSubscriber(v2j<? super T> v2jVar, cfg.c cVar, k3f<T> k3fVar, boolean z) {
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

        @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
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
                vr0.a(this.requested, j2);
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

    public FlowableSubscribeOn(wt7<T> wt7Var, cfg cfgVar, boolean z) {
        super(wt7Var);
        this.k = cfgVar;
        this.f20531l = z;
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        cfg.c cVarC = this.k.c();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(v2jVar, cVarC, this.f11230j, this.f20531l);
        v2jVar.onSubscribe(subscribeOnSubscriber);
        cVarC.b(subscribeOnSubscriber);
    }
}
