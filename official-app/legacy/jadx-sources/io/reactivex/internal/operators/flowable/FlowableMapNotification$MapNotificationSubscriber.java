package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableMapNotification$MapNotificationSubscriber<T, R> extends SinglePostCompleteSubscriber<T, R> {
    private static final long serialVersionUID = 2757120512858778108L;
    final Callable<? extends R> onCompleteSupplier;
    final j08<? super Throwable, ? extends R> onErrorMapper;
    final j08<? super T, ? extends R> onNextMapper;

    public FlowableMapNotification$MapNotificationSubscriber(v2j<? super R> v2jVar, j08<? super T, ? extends R> j08Var, j08<? super Throwable, ? extends R> j08Var2, Callable<? extends R> callable) {
        super(v2jVar);
        this.onNextMapper = j08Var;
        this.onErrorMapper = j08Var2;
        this.onCompleteSupplier = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        try {
            complete(abd.d(this.onCompleteSupplier.call(), "The onComplete publisher returned is null"));
        } catch (Throwable th) {
            iu6.b(th);
            this.downstream.onError(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        try {
            complete(abd.d(this.onErrorMapper.apply(th), "The onError publisher returned is null"));
        } catch (Throwable th2) {
            iu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        try {
            Object objD = abd.d(this.onNextMapper.apply(t), "The onNext publisher returned is null");
            this.produced++;
            this.downstream.onNext(objD);
        } catch (Throwable th) {
            iu6.b(th);
            this.downstream.onError(th);
        }
    }
}
