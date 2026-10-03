package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.o14;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeUsing$UsingObserver<T, D> extends AtomicReference<Object> implements lob<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -674404550052917487L;
    final o14<? super D> disposer;
    final lob<? super T> downstream;
    final boolean eager;
    io.reactivex.rxjava3.disposables.a upstream;

    public MaybeUsing$UsingObserver(lob<? super T> lobVar, D d, o14<? super D> o14Var, boolean z) {
        super(d);
        this.downstream = lobVar;
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

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
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
        this.downstream.onComplete();
        if (this.eager) {
            return;
        }
        disposeResource();
    }

    @Override // com.oplus.aiunit.vision.lob
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

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
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
