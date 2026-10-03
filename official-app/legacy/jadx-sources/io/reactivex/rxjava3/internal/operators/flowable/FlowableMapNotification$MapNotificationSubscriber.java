package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableMapNotification$MapNotificationSubscriber<T, R> extends SinglePostCompleteSubscriber<T, R> {
    private static final long serialVersionUID = 2757120512858778108L;
    final f4j<? extends R> onCompleteSupplier;
    final d08<? super Throwable, ? extends R> onErrorMapper;
    final d08<? super T, ? extends R> onNextMapper;

    public FlowableMapNotification$MapNotificationSubscriber(v2j<? super R> v2jVar, d08<? super T, ? extends R> d08Var, d08<? super Throwable, ? extends R> d08Var2, f4j<? extends R> f4jVar) {
        super(v2jVar);
        this.onNextMapper = d08Var;
        this.onErrorMapper = d08Var2;
        this.onCompleteSupplier = f4jVar;
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        try {
            R r = this.onCompleteSupplier.get();
            Objects.requireNonNull(r, "The onComplete publisher returned is null");
            complete(r);
        } catch (Throwable th) {
            hu6.b(th);
            this.downstream.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        try {
            R rApply = this.onErrorMapper.apply(th);
            Objects.requireNonNull(rApply, "The onError publisher returned is null");
            complete(rApply);
        } catch (Throwable th2) {
            hu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        try {
            R rApply = this.onNextMapper.apply(t);
            Objects.requireNonNull(rApply, "The onNext publisher returned is null");
            this.produced++;
            this.downstream.onNext(rApply);
        } catch (Throwable th) {
            hu6.b(th);
            this.downstream.onError(th);
        }
    }
}
