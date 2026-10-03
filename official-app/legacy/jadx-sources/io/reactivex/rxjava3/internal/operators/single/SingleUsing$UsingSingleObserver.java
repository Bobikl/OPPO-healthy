package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.o14;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleUsing$UsingSingleObserver<T, U> extends AtomicReference<Object> implements l6h<T>, a {
    private static final long serialVersionUID = -5331524057054083935L;
    final o14<? super U> disposer;
    final l6h<? super T> downstream;
    final boolean eager;
    a upstream;

    public SingleUsing$UsingSingleObserver(l6h<? super T> l6hVar, U u, boolean z, o14<? super U> o14Var) {
        super(u);
        this.downstream = l6hVar;
        this.eager = z;
        this.disposer = o14Var;
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
        Object andSet = getAndSet(this);
        if (andSet != this) {
            try {
                this.disposer.accept(andSet);
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        this.upstream = DisposableHelper.DISPOSED;
        if (this.eager) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.disposer.accept(andSet);
            } catch (Throwable th2) {
                hu6.b(th2);
                th = new CompositeException(th, th2);
            }
        }
        this.downstream.onError(th);
        if (this.eager) {
            return;
        }
        disposeResource();
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.upstream = DisposableHelper.DISPOSED;
        if (this.eager) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.disposer.accept(andSet);
            } catch (Throwable th) {
                hu6.b(th);
                this.downstream.onError(th);
                return;
            }
        }
        this.downstream.onSuccess(t);
        if (this.eager) {
            return;
        }
        disposeResource();
    }
}
