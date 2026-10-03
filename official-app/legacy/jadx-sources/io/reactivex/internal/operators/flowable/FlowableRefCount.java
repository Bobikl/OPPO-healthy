package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.p14;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.xt7;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableRefCount<T> extends xt7<T> {

    public static final class RefConnection extends AtomicReference<cv5> implements Runnable, p14<cv5> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final FlowableRefCount<?> parent;
        long subscriberCount;
        cv5 timer;

        public RefConnection(FlowableRefCount<?> flowableRefCount) {
        }

        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }

        @Override // com.oplus.aiunit.vision.p14
        public void accept(cv5 cv5Var) throws Exception {
            DisposableHelper.replace(this, cv5Var);
            throw null;
        }
    }

    public static final class RefCountSubscriber<T> extends AtomicBoolean implements wu7<T>, c3j {
        private static final long serialVersionUID = -7419642935409022375L;
        final RefConnection connection;
        final v2j<? super T> downstream;
        final FlowableRefCount<T> parent;
        c3j upstream;

        public RefCountSubscriber(v2j<? super T> v2jVar, FlowableRefCount<T> flowableRefCount, RefConnection refConnection) {
            this.downstream = v2jVar;
            this.connection = refConnection;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void cancel() {
            this.upstream.cancel();
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onComplete() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                throw null;
            }
            h4g.r(th);
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(T t) {
            this.downstream.onNext(t);
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
            this.upstream.request(j2);
        }
    }
}
