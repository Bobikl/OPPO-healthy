package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeOnErrorNext$OnErrorNextMaybeObserver<T> extends AtomicReference<cv5> implements mob<T>, cv5 {
    private static final long serialVersionUID = 2026620218879969836L;
    final boolean allowFatal;
    final mob<? super T> downstream;
    final j08<? super Throwable, ? extends qob<? extends T>> resumeFunction;

    public static final class a<T> implements mob<T> {
        public final mob<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicReference<cv5> f20477j;

        public a(mob<? super T> mobVar, AtomicReference<cv5> atomicReference) {
            this.i = mobVar;
            this.f20477j = atomicReference;
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
            DisposableHelper.setOnce(this.f20477j, cv5Var);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSuccess(T t) {
            this.i.onSuccess(t);
        }
    }

    public MaybeOnErrorNext$OnErrorNextMaybeObserver(mob<? super T> mobVar, j08<? super Throwable, ? extends qob<? extends T>> j08Var, boolean z) {
        this.downstream = mobVar;
        this.resumeFunction = j08Var;
        this.allowFatal = z;
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
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        if (!this.allowFatal && !(th instanceof Exception)) {
            this.downstream.onError(th);
            return;
        }
        try {
            qob qobVar = (qob) abd.d(this.resumeFunction.apply(th), "The resumeFunction returned a null MaybeSource");
            DisposableHelper.replace(this, null);
            qobVar.a(new a(this.downstream, this));
        } catch (Throwable th2) {
            iu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
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
