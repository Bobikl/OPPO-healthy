package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.o14;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableUsing$UsingObserver<R> extends AtomicReference<Object> implements as3, a {
    private static final long serialVersionUID = -674404550052917487L;
    final o14<? super R> disposer;
    final as3 downstream;
    final boolean eager;
    a upstream;

    public CompletableUsing$UsingObserver(as3 as3Var, R r, o14<? super R> o14Var, boolean z) {
        super(r);
        this.downstream = as3Var;
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

    @Override // com.oplus.aiunit.vision.as3
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

    @Override // com.oplus.aiunit.vision.as3
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

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }
}
