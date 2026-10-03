package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cvf;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleDelayWithPublisher$OtherSubscriber<T, U> extends AtomicReference<a> implements vu7<U>, a {
    private static final long serialVersionUID = -8565274649390031272L;
    boolean done;
    final l6h<? super T> downstream;
    final s6h<T> source;
    c3j upstream;

    public SingleDelayWithPublisher$OtherSubscriber(l6h<? super T> l6hVar, s6h<T> s6hVar) {
        this.downstream = l6hVar;
        this.source = s6hVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.upstream.cancel();
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.source.b(new cvf(this, this.downstream));
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
        } else {
            this.done = true;
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(U u) {
        this.upstream.cancel();
        onComplete();
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }
}
