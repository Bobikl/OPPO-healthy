package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.dvf;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.t6h;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleDelayWithPublisher$OtherSubscriber<T, U> extends AtomicReference<cv5> implements wu7<U>, cv5 {
    private static final long serialVersionUID = -8565274649390031272L;
    boolean done;
    final m6h<? super T> downstream;
    final t6h<T> source;
    c3j upstream;

    public SingleDelayWithPublisher$OtherSubscriber(m6h<? super T> m6hVar, t6h<T> t6hVar) {
        this.downstream = m6hVar;
        this.source = t6hVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.upstream.cancel();
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.source.a(new dvf(this, this.downstream));
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
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

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }
}
