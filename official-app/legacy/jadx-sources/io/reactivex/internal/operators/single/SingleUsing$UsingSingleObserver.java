package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.p14;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleUsing$UsingSingleObserver<T, U> extends AtomicReference<Object> implements m6h<T>, cv5 {
    private static final long serialVersionUID = -5331524057054083935L;
    final p14<? super U> disposer;
    final m6h<? super T> downstream;
    final boolean eager;
    cv5 upstream;

    public SingleUsing$UsingSingleObserver(m6h<? super T> m6hVar, U u, boolean z, p14<? super U> p14Var) {
        super(u);
        this.downstream = m6hVar;
        this.eager = z;
        this.disposer = p14Var;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.upstream.dispose();
        this.upstream = DisposableHelper.DISPOSED;
        disposeAfter();
    }

    public void disposeAfter() {
        Object andSet = getAndSet(this);
        if (andSet != this) {
            try {
                this.disposer.accept(andSet);
            } catch (Throwable th) {
                iu6.b(th);
                h4g.r(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.m6h
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
                iu6.b(th2);
                th = new CompositeException(th, th2);
            }
        }
        this.downstream.onError(th);
        if (this.eager) {
            return;
        }
        disposeAfter();
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.m6h
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
                iu6.b(th);
                this.downstream.onError(th);
                return;
            }
        }
        this.downstream.onSuccess(t);
        if (this.eager) {
            return;
        }
        disposeAfter();
    }
}
