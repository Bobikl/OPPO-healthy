package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.p14;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableUsing$UsingObserver<T, D> extends AtomicBoolean implements bed<T>, cv5 {
    private static final long serialVersionUID = 5904473792286235046L;
    final p14<? super D> disposer;
    final bed<? super T> downstream;
    final boolean eager;
    final D resource;
    cv5 upstream;

    public ObservableUsing$UsingObserver(bed<? super T> bedVar, D d, p14<? super D> p14Var, boolean z) {
        this.downstream = bedVar;
        this.resource = d;
        this.disposer = p14Var;
        this.eager = z;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        disposeAfter();
        this.upstream.dispose();
    }

    public void disposeAfter() {
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th) {
                iu6.b(th);
                h4g.r(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (!this.eager) {
            this.downstream.onComplete();
            this.upstream.dispose();
            disposeAfter();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th) {
                iu6.b(th);
                this.downstream.onError(th);
                return;
            }
        }
        this.upstream.dispose();
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (!this.eager) {
            this.downstream.onError(th);
            this.upstream.dispose();
            disposeAfter();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.disposer.accept(this.resource);
            } catch (Throwable th2) {
                iu6.b(th2);
                th = new CompositeException(th, th2);
            }
        }
        this.upstream.dispose();
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }
}
