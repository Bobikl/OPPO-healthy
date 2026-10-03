package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableUsing$UsingSubscriber<T, D> extends AtomicBoolean implements vu7<T>, c3j {
    private static final long serialVersionUID = 5904473792286235046L;
    final o14<? super D> disposer;
    final v2j<? super T> downstream;
    final boolean eager;
    final D resource;
    c3j upstream;

    public FlowableUsing$UsingSubscriber(v2j<? super T> v2jVar, D d, o14<? super D> o14Var, boolean z) {
        this.downstream = v2jVar;
        this.resource = d;
        this.disposer = o14Var;
        this.eager = z;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.eager) {
            disposeResource();
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        } else {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
            disposeResource();
        }
    }

    public void disposeResource() {
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (!this.eager) {
            this.downstream.onComplete();
            disposeResource();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th) {
                hu6.b(th);
                this.downstream.onError(th);
                return;
            }
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (!this.eager) {
            this.downstream.onError(th);
            disposeResource();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th2) {
                th = th2;
                hu6.b(th);
            }
        }
        th = null;
        if (th != null) {
            this.downstream.onError(new CompositeException(th, th));
        } else {
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.downstream.onNext(t);
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
        this.upstream.request(j2);
    }
}
