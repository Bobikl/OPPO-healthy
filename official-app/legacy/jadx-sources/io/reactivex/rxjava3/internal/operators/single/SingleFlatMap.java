package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f5h;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleFlatMap<T, R> extends f5h<R> {
    public final s6h<? extends T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d08<? super T, ? extends s6h<? extends R>> f20614j;

    public static final class SingleFlatMapCallback<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements l6h<T>, io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = 3258103020495908596L;
        final l6h<? super R> downstream;
        final d08<? super T, ? extends s6h<? extends R>> mapper;

        public static final class a<R> implements l6h<R> {
            public final AtomicReference<io.reactivex.rxjava3.disposables.a> i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final l6h<? super R> f20615j;

            public a(AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference, l6h<? super R> l6hVar) {
                this.i = atomicReference;
                this.f20615j = l6hVar;
            }

            @Override // com.oplus.aiunit.vision.l6h
            public void onError(Throwable th) {
                this.f20615j.onError(th);
            }

            @Override // com.oplus.aiunit.vision.l6h
            public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
                DisposableHelper.replace(this.i, aVar);
            }

            @Override // com.oplus.aiunit.vision.l6h
            public void onSuccess(R r) {
                this.f20615j.onSuccess(r);
            }
        }

        public SingleFlatMapCallback(l6h<? super R> l6hVar, d08<? super T, ? extends s6h<? extends R>> d08Var) {
            this.downstream = l6hVar;
            this.mapper = d08Var;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.setOnce(this, aVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            try {
                s6h<? extends R> s6hVarApply = this.mapper.apply(t);
                Objects.requireNonNull(s6hVarApply, "The single returned by the mapper is null");
                s6h<? extends R> s6hVar = s6hVarApply;
                if (isDisposed()) {
                    return;
                }
                s6hVar.b(new a(this, this.downstream));
            } catch (Throwable th) {
                hu6.b(th);
                this.downstream.onError(th);
            }
        }
    }

    public SingleFlatMap(s6h<? extends T> s6hVar, d08<? super T, ? extends s6h<? extends R>> d08Var) {
        this.f20614j = d08Var;
        this.i = s6hVar;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super R> l6hVar) {
        this.i.b(new SingleFlatMapCallback(l6hVar, this.f20614j));
    }
}
