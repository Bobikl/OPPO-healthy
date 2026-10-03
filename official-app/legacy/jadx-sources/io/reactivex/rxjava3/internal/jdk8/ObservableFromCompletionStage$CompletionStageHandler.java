package io.reactivex.rxjava3.internal.jdk8;

import com.oplus.aiunit.vision.aed;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableFromCompletionStage$CompletionStageHandler<T> extends DeferredScalarDisposable<T> implements BiConsumer<T, Throwable> {
    private static final long serialVersionUID = 4665335664328839859L;
    final ObservableFromCompletionStage$BiConsumerAtomicReference<T> whenReference;

    public ObservableFromCompletionStage$CompletionStageHandler(aed<? super T> aedVar, ObservableFromCompletionStage$BiConsumerAtomicReference<T> observableFromCompletionStage$BiConsumerAtomicReference) {
        super(aedVar);
        this.whenReference = observableFromCompletionStage$BiConsumerAtomicReference;
    }

    @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
    public void dispose() {
        super.dispose();
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
