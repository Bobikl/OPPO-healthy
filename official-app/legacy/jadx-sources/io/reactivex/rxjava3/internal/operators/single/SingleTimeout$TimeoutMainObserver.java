package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleTimeout$TimeoutMainObserver<T> extends AtomicReference<a> implements l6h<T>, Runnable, a {
    private static final long serialVersionUID = 37497744973048446L;
    final l6h<? super T> downstream;
    final TimeoutFallbackObserver<T> fallback;
    s6h<? extends T> other;
    final AtomicReference<a> task = new AtomicReference<>();
    final long timeout;
    final TimeUnit unit;

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<a> implements l6h<T> {
        private static final long serialVersionUID = 2071387740092105509L;
        final l6h<? super T> downstream;

        public TimeoutFallbackObserver(l6h<? super T> l6hVar) {
            this.downstream = l6hVar;
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    public SingleTimeout$TimeoutMainObserver(l6h<? super T> l6hVar, s6h<? extends T> s6hVar, long j2, TimeUnit timeUnit) {
        this.downstream = l6hVar;
        this.other = s6hVar;
        this.timeout = j2;
        this.unit = timeUnit;
        if (s6hVar != null) {
            this.fallback = new TimeoutFallbackObserver<>(l6hVar);
        } else {
            this.fallback = null;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
        DisposableHelper.dispose(this.task);
        TimeoutFallbackObserver<T> timeoutFallbackObserver = this.fallback;
        if (timeoutFallbackObserver != null) {
            DisposableHelper.dispose(timeoutFallbackObserver);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar == disposableHelper || !compareAndSet(aVar, disposableHelper)) {
            g4g.u(th);
        } else {
            DisposableHelper.dispose(this.task);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar == disposableHelper || !compareAndSet(aVar, disposableHelper)) {
            return;
        }
        DisposableHelper.dispose(this.task);
        this.downstream.onSuccess(t);
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar == disposableHelper || !compareAndSet(aVar, disposableHelper)) {
            return;
        }
        if (aVar != null) {
            aVar.dispose();
        }
        s6h<? extends T> s6hVar = this.other;
        if (s6hVar == null) {
            this.downstream.onError(new TimeoutException(ExceptionHelper.g(this.timeout, this.unit)));
        } else {
            this.other = null;
            s6hVar.b(this.fallback);
        }
    }
}
