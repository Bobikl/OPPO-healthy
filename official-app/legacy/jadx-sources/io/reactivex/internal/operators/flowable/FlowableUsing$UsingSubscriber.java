package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.p14;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableUsing$UsingSubscriber<T, D> extends AtomicBoolean implements wu7<T>, c3j {
    private static final long serialVersionUID = 5904473792286235046L;
    final p14<? super D> disposer;
    final v2j<? super T> downstream;
    final boolean eager;
    final D resource;
    c3j upstream;

    public FlowableUsing$UsingSubscriber(v2j<? super T> v2jVar, D d, p14<? super D> p14Var, boolean z) {
        this.downstream = v2jVar;
        this.resource = d;
        this.disposer = p14Var;
        this.eager = z;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        disposeAfter();
        this.upstream.cancel();
    }

    public void disposeAfter() {
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th) {
                iu6.b(th);
                h4g.r(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (!this.eager) {
            this.downstream.onComplete();
            this.upstream.cancel();
            disposeAfter();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th) {
                iu6.b(th);
                this.downstream.onError(th);
                return;
            }
        }
        this.upstream.cancel();
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (!this.eager) {
            this.downstream.onError(th);
            this.upstream.cancel();
            disposeAfter();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th2) {
                th = th2;
                iu6.b(th);
            }
        }
        th = null;
        this.upstream.cancel();
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
