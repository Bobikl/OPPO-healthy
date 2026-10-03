package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeDoFinally$DoFinallyObserver<T> extends AtomicInteger implements lob<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 4109457741734051389L;
    final lob<? super T> downstream;
    final Cdo onFinally;
    io.reactivex.rxjava3.disposables.a upstream;

    public MaybeDoFinally$DoFinallyObserver(lob<? super T> lobVar, Cdo cdo) {
        this.downstream = lobVar;
        this.onFinally = cdo;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.upstream.dispose();
        runFinally();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        this.downstream.onComplete();
        runFinally();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.downstream.onError(th);
        runFinally();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
        runFinally();
    }

    public void runFinally() {
        if (compareAndSet(0, 1)) {
            try {
                this.onFinally.run();
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
        }
    }
}
