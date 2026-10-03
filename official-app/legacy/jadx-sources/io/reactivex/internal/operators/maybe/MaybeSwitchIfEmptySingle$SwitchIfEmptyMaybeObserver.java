package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.t6h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeSwitchIfEmptySingle$SwitchIfEmptyMaybeObserver<T> extends AtomicReference<cv5> implements mob<T>, cv5 {
    private static final long serialVersionUID = 4603919676453758899L;
    final m6h<? super T> downstream;
    final t6h<? extends T> other;

    public static final class a<T> implements m6h<T> {
        public final m6h<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicReference<cv5> f20479j;

        public a(m6h<? super T> m6hVar, AtomicReference<cv5> atomicReference) {
            this.i = m6hVar;
            this.f20479j = atomicReference;
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onError(Throwable th) {
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this.f20479j, cv5Var);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSuccess(T t) {
            this.i.onSuccess(t);
        }
    }

    public MaybeSwitchIfEmptySingle$SwitchIfEmptyMaybeObserver(m6h<? super T> m6hVar, t6h<? extends T> t6hVar) {
        this.downstream = m6hVar;
        this.other = t6hVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        cv5 cv5Var = get();
        if (cv5Var == DisposableHelper.DISPOSED || !compareAndSet(cv5Var, null)) {
            return;
        }
        this.other.a(new a(this.downstream, this));
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }
}
