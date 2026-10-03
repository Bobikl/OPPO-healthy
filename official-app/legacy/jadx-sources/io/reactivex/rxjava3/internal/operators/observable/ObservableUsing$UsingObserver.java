package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.o14;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableUsing$UsingObserver<T, D> extends AtomicBoolean implements aed<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 5904473792286235046L;
    final o14<? super D> disposer;
    final aed<? super T> downstream;
    final boolean eager;
    final D resource;
    io.reactivex.rxjava3.disposables.a upstream;

    public ObservableUsing$UsingObserver(aed<? super T> aedVar, D d, o14<? super D> o14Var, boolean z) {
        this.downstream = aedVar;
        this.resource = d;
        this.disposer = o14Var;
        this.eager = z;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        if (this.eager) {
            disposeResource();
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        } else {
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
            disposeResource();
        }
    }

    public void disposeResource() {
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (!this.eager) {
            this.downstream.onComplete();
            disposeResource();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th) {
                hu6.b(th);
                this.downstream.onError(th);
                return;
            }
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (!this.eager) {
            this.downstream.onError(th);
            disposeResource();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th2) {
                hu6.b(th2);
                th = new CompositeException(th, th2);
            }
        }
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }
}
