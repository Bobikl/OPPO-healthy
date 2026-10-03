package io.reactivex.rxjava3.internal.jdk8;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableCollectWithCollector$CollectorObserver<T, A, R> extends DeferredScalarDisposable<R> implements aed<T> {
    private static final long serialVersionUID = -229544830565448758L;
    final BiConsumer<A, T> accumulator;
    A container;
    boolean done;
    final Function<A, R> finisher;
    a upstream;

    public ObservableCollectWithCollector$CollectorObserver(aed<? super R> aedVar, A a, BiConsumer<A, T> biConsumer, Function<A, R> function) {
        super(aedVar);
        this.container = a;
        this.accumulator = biConsumer;
        this.finisher = function;
    }

    @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.upstream = DisposableHelper.DISPOSED;
        A a = this.container;
        this.container = null;
        try {
            R rApply = this.finisher.apply(a);
            Objects.requireNonNull(rApply, "The finisher returned a null value");
            complete(rApply);
        } catch (Throwable th) {
            hu6.b(th);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
            return;
        }
        this.done = true;
        this.upstream = DisposableHelper.DISPOSED;
        this.container = null;
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            this.accumulator.accept(this.container, t);
        } catch (Throwable th) {
            hu6.b(th);
            this.upstream.dispose();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }
}
