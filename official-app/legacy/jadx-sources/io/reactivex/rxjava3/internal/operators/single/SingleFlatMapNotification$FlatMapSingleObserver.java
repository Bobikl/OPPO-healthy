package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleFlatMapNotification$FlatMapSingleObserver<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements l6h<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 4375739915521278546L;
    final l6h<? super R> downstream;
    final d08<? super Throwable, ? extends s6h<? extends R>> onErrorMapper;
    final d08<? super T, ? extends s6h<? extends R>> onSuccessMapper;
    io.reactivex.rxjava3.disposables.a upstream;

    public final class a implements l6h<R> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            SingleFlatMapNotification$FlatMapSingleObserver.this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(SingleFlatMapNotification$FlatMapSingleObserver.this, aVar);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(R r) {
            SingleFlatMapNotification$FlatMapSingleObserver.this.downstream.onSuccess(r);
        }
    }

    public SingleFlatMapNotification$FlatMapSingleObserver(l6h<? super R> l6hVar, d08<? super T, ? extends s6h<? extends R>> d08Var, d08<? super Throwable, ? extends s6h<? extends R>> d08Var2) {
        this.downstream = l6hVar;
        this.onSuccessMapper = d08Var;
        this.onErrorMapper = d08Var2;
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

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        try {
            s6h<? extends R> s6hVarApply = this.onErrorMapper.apply(th);
            Objects.requireNonNull(s6hVarApply, "The onErrorMapper returned a null SingleSource");
            s6h<? extends R> s6hVar = s6hVarApply;
            if (isDisposed()) {
                return;
            }
            s6hVar.b(new a());
        } catch (Throwable th2) {
            hu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        try {
            s6h<? extends R> s6hVarApply = this.onSuccessMapper.apply(t);
            Objects.requireNonNull(s6hVarApply, "The onSuccessMapper returned a null SingleSource");
            s6h<? extends R> s6hVar = s6hVarApply;
            if (isDisposed()) {
                return;
            }
            s6hVar.b(new a());
        } catch (Throwable th) {
            hu6.b(th);
            this.downstream.onError(th);
        }
    }
}
