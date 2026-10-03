package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver<T> extends AtomicReference<cv5> implements mob<T>, cv5 {
    private static final long serialVersionUID = -2223459372976438024L;
    final mob<? super T> downstream;
    final qob<? extends T> other;

    public static final class a<T> implements mob<T> {
        public final mob<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicReference<cv5> f20478j;

        public a(mob<? super T> mobVar, AtomicReference<cv5> atomicReference) {
            this.i = mobVar;
            this.f20478j = atomicReference;
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onComplete() {
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onError(Throwable th) {
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this.f20478j, cv5Var);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSuccess(T t) {
            this.i.onSuccess(t);
        }
    }

    public MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver(mob<? super T> mobVar, qob<? extends T> qobVar) {
        this.downstream = mobVar;
        this.other = qobVar;
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
