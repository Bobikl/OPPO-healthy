package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.p14;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeUsing$UsingObserver<T, D> extends AtomicReference<Object> implements mob<T>, cv5 {
    private static final long serialVersionUID = -674404550052917487L;
    final p14<? super D> disposer;
    final mob<? super T> downstream;
    final boolean eager;
    cv5 upstream;

    public MaybeUsing$UsingObserver(mob<? super T> mobVar, D d, p14<? super D> p14Var, boolean z) {
        super(d);
        this.downstream = mobVar;
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

    @Override // com.oplus.aiunit.vision.mob
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

    @Override // com.oplus.aiunit.vision.mob
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

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.mob
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
        disposeResourceAfter();
    }
}
