package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlatMapNotification$FlatMapMaybeObserver<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 4375739915521278546L;
    final lob<? super R> downstream;
    final f4j<? extends pob<? extends R>> onCompleteSupplier;
    final d08<? super Throwable, ? extends pob<? extends R>> onErrorMapper;
    final d08<? super T, ? extends pob<? extends R>> onSuccessMapper;
    io.reactivex.rxjava3.disposables.a upstream;

    public final class a implements lob<R> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onComplete() {
            MaybeFlatMapNotification$FlatMapMaybeObserver.this.downstream.onComplete();
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onError(Throwable th) {
            MaybeFlatMapNotification$FlatMapMaybeObserver.this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(MaybeFlatMapNotification$FlatMapMaybeObserver.this, aVar);
        }

        @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
        public void onSuccess(R r) {
            MaybeFlatMapNotification$FlatMapMaybeObserver.this.downstream.onSuccess(r);
        }
    }

    public MaybeFlatMapNotification$FlatMapMaybeObserver(lob<? super R> lobVar, d08<? super T, ? extends pob<? extends R>> d08Var, d08<? super Throwable, ? extends pob<? extends R>> d08Var2, f4j<? extends pob<? extends R>> f4jVar) {
        this.downstream = lobVar;
        this.onSuccessMapper = d08Var;
        this.onErrorMapper = d08Var2;
        this.onCompleteSupplier = f4jVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
        this.upstream.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        try {
            pob<? extends R> pobVar = this.onCompleteSupplier.get();
            Objects.requireNonNull(pobVar, "The onCompleteSupplier returned a null MaybeSource");
            pob<? extends R> pobVar2 = pobVar;
            if (isDisposed()) {
                return;
            }
            pobVar2.a(new a());
        } catch (Throwable th) {
            hu6.b(th);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        try {
            pob<? extends R> pobVarApply = this.onErrorMapper.apply(th);
            Objects.requireNonNull(pobVarApply, "The onErrorMapper returned a null MaybeSource");
            pob<? extends R> pobVar = pobVarApply;
            if (isDisposed()) {
                return;
            }
            pobVar.a(new a());
        } catch (Throwable th2) {
            hu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
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
        try {
            pob<? extends R> pobVarApply = this.onSuccessMapper.apply(t);
            Objects.requireNonNull(pobVarApply, "The onSuccessMapper returned a null MaybeSource");
            pob<? extends R> pobVar = pobVarApply;
            if (isDisposed()) {
                return;
            }
            pobVar.a(new a());
        } catch (Throwable th) {
            hu6.b(th);
            this.downstream.onError(th);
        }
    }
}
