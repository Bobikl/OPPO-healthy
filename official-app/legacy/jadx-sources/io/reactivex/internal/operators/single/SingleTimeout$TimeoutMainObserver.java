package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.t6h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleTimeout$TimeoutMainObserver<T> extends AtomicReference<cv5> implements m6h<T>, Runnable, cv5 {
    private static final long serialVersionUID = 37497744973048446L;
    final m6h<? super T> downstream;
    final TimeoutFallbackObserver<T> fallback;
    t6h<? extends T> other;
    final AtomicReference<cv5> task = new AtomicReference<>();
    final long timeout;
    final TimeUnit unit;

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<cv5> implements m6h<T> {
        private static final long serialVersionUID = 2071387740092105509L;
        final m6h<? super T> downstream;

        public TimeoutFallbackObserver(m6h<? super T> m6hVar) {
            this.downstream = m6hVar;
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    public SingleTimeout$TimeoutMainObserver(m6h<? super T> m6hVar, t6h<? extends T> t6hVar, long j2, TimeUnit timeUnit) {
        this.downstream = m6hVar;
        this.other = t6hVar;
        this.timeout = j2;
        this.unit = timeUnit;
        if (t6hVar != null) {
            this.fallback = new TimeoutFallbackObserver<>(m6hVar);
        } else {
            this.fallback = null;
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
        DisposableHelper.dispose(this.task);
        TimeoutFallbackObserver<T> timeoutFallbackObserver = this.fallback;
        if (timeoutFallbackObserver != null) {
            DisposableHelper.dispose(timeoutFallbackObserver);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var == disposableHelper || !compareAndSet(cv5Var, disposableHelper)) {
            h4g.r(th);
        } else {
            DisposableHelper.dispose(this.task);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var == disposableHelper || !compareAndSet(cv5Var, disposableHelper)) {
            return;
        }
        DisposableHelper.dispose(this.task);
        this.downstream.onSuccess(t);
    }

    @Override // java.lang.Runnable
    public void run() {
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var == disposableHelper || !compareAndSet(cv5Var, disposableHelper)) {
            return;
        }
        if (cv5Var != null) {
            cv5Var.dispose();
        }
        t6h<? extends T> t6hVar = this.other;
        if (t6hVar == null) {
            this.downstream.onError(new TimeoutException(ExceptionHelper.c(this.timeout, this.unit)));
        } else {
            this.other = null;
            t6hVar.a(this.fallback);
        }
    }
}
