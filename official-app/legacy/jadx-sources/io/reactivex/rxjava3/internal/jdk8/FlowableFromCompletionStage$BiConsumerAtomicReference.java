package io.reactivex.rxjava3.internal.jdk8;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFromCompletionStage$BiConsumerAtomicReference<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
    private static final long serialVersionUID = 45838553147237545L;

    @Override // java.util.function.BiConsumer
    public void accept(T t, Throwable th) {
        BiConsumer<T, Throwable> biConsumer = get();
        if (biConsumer != null) {
            biConsumer.accept(t, th);
        }
    }
}
