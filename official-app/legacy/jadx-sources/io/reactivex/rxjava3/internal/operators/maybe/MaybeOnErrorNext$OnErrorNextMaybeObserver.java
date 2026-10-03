package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeOnErrorNext$OnErrorNextMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 2026620218879969836L;
    final lob<? super T> downstream;
    final d08<? super Throwable, ? extends pob<? extends T>> resumeFunction;

    public static final class a<T> implements lob<T> {
        public final lob<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.a> f20542j;

        public a(lob<? super T> lobVar, AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference) {
            this.i = lobVar;
            this.f20542j = atomicReference;
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onComplete() {
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onError(Throwable th) {
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this.f20542j, aVar);
        }

        @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            this.i.onSuccess(t);
        }
    }

    public MaybeOnErrorNext$OnErrorNextMaybeObserver(lob<? super T> lobVar, d08<? super Throwable, ? extends pob<? extends T>> d08Var) {
        this.downstream = lobVar;
        this.resumeFunction = d08Var;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        try {
            pob<? extends T> pobVarApply = this.resumeFunction.apply(th);
            Objects.requireNonNull(pobVarApply, "The resumeFunction returned a null MaybeSource");
            pob<? extends T> pobVar = pobVarApply;
            DisposableHelper.replace(this, null);
            pobVar.a(new a(this.downstream, this));
        } catch (Throwable th2) {
            hu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }
}
