package io.reactivex.rxjava3.internal.jdk8;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableFlatMapStream$FlatMapStreamObserver<T, R> extends AtomicInteger implements aed<T>, a {
    private static final long serialVersionUID = -5127032662980523968L;
    volatile boolean disposed;
    boolean done;
    final aed<? super R> downstream;
    final d08<? super T, ? extends Stream<? extends R>> mapper;
    a upstream;

    public ObservableFlatMapStream$FlatMapStreamObserver(aed<? super R> aedVar, d08<? super T, ? extends Stream<? extends R>> d08Var) {
        this.downstream = aedVar;
        this.mapper = d08Var;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.disposed = true;
        this.upstream.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.disposed;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
        } else {
            this.done = true;
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            Stream<? extends R> streamApply = this.mapper.apply(t);
            Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
            Stream<? extends R> stream = streamApply;
            try {
                for (R r : stream) {
                    if (this.disposed) {
                        this.done = true;
                        break;
                    }
                    Objects.requireNonNull(r, "The Stream's Iterator.next returned a null value");
                    if (this.disposed) {
                        this.done = true;
                        break;
                    }
                    this.downstream.onNext(r);
                    if (this.disposed) {
                        this.done = true;
                        break;
                    }
                }
                stream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        stream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            hu6.b(th4);
            this.upstream.dispose();
            onError(th4);
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
