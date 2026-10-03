package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.p14;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableUsing$UsingObserver<R> extends AtomicReference<Object> implements bs3, cv5 {
    private static final long serialVersionUID = -674404550052917487L;
    final p14<? super R> disposer;
    final bs3 downstream;
    final boolean eager;
    cv5 upstream;

    public CompletableUsing$UsingObserver(bs3 bs3Var, R r, p14<? super R> p14Var, boolean z) {
        super(r);
        this.downstream = bs3Var;
        this.disposer = p14Var;
        this.eager = z;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.upstream.dispose();
        this.upstream = DisposableHelper.DISPOSED;
        disposeResourceAfter();
    }

    public void disposeResourceAfter() {
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

    @Override // com.oplus.aiunit.vision.bs3
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
                iu6.b(th);
                this.downstream.onError(th);
                return;
            }
        }
        this.downstream.onComplete();
        if (this.eager) {
            return;
        }
        disposeResourceAfter();
    }

    @Override // com.oplus.aiunit.vision.bs3
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
        disposeResourceAfter();
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }
}
