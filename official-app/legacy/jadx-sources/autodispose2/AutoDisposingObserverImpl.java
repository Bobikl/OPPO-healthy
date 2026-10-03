package autodispose2;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.ev5;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
final class AutoDisposingObserverImpl<T> extends AtomicInteger implements aed, io.reactivex.rxjava3.disposables.a {
    private final aed<? super T> delegate;
    private final ds3 scope;
    final AtomicReference<io.reactivex.rxjava3.disposables.a> mainDisposable = new AtomicReference<>();
    final AtomicReference<io.reactivex.rxjava3.disposables.a> scopeDisposable = new AtomicReference<>();
    private final AtomicThrowable error = new AtomicThrowable();

    public class a extends ev5 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onComplete() {
            AutoDisposingObserverImpl.this.scopeDisposable.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.dispose(AutoDisposingObserverImpl.this.mainDisposable);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onError(Throwable th) {
            AutoDisposingObserverImpl.this.scopeDisposable.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposingObserverImpl.this.onError(th);
        }
    }

    public AutoDisposingObserverImpl(ds3 ds3Var, aed<? super T> aedVar) {
        this.scope = ds3Var;
        this.delegate = aedVar;
    }

    public aed<? super T> delegateObserver() {
        return this.delegate;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        AutoDisposableHelper.dispose(this.scopeDisposable);
        AutoDisposableHelper.dispose(this.mainDisposable);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.mainDisposable.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        this.mainDisposable.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.scopeDisposable);
        d.a(this.delegate, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (isDisposed()) {
            return;
        }
        this.mainDisposable.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.scopeDisposable);
        d.c(this.delegate, th, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        if (isDisposed() || !d.e(this.delegate, t, this, this.error)) {
            return;
        }
        this.mainDisposable.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.scopeDisposable);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        a aVar2 = new a();
        if (autodispose2.a.d(this.scopeDisposable, aVar2, AutoDisposingObserverImpl.class)) {
            this.delegate.onSubscribe(this);
            this.scope.a(aVar2);
            autodispose2.a.d(this.mainDisposable, aVar, AutoDisposingObserverImpl.class);
        }
    }
}
