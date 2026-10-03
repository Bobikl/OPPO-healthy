package io.reactivex.rxjava3.internal.jdk8;

import com.oplus.aiunit.vision.v2j;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFromCompletionStage$CompletionStageHandler<T> extends DeferredScalarSubscription<T> implements BiConsumer<T, Throwable> {
    private static final long serialVersionUID = 4665335664328839859L;
    final FlowableFromCompletionStage$BiConsumerAtomicReference<T> whenReference;

    public FlowableFromCompletionStage$CompletionStageHandler(v2j<? super T> v2jVar, FlowableFromCompletionStage$BiConsumerAtomicReference<T> flowableFromCompletionStage$BiConsumerAtomicReference) {
        super(v2jVar);
        this.whenReference = flowableFromCompletionStage$BiConsumerAtomicReference;
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        this.whenReference.set(null);
    }

    @Override // java.util.function.BiConsumer
    public void accept(T t, Throwable th) {
        if (th != null) {
            this.downstream.onError(th);
        } else if (t != null) {
            complete(t);
        } else {
            this.downstream.onError(new NullPointerException("The CompletionStage terminated with null."));
        }
    }
}
