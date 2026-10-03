package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k6;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class MaybeFlatten<T, R> extends k6<T, R> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d08<? super T, ? extends pob<? extends R>> f20541j;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = 4375739915521278546L;
        final lob<? super R> downstream;
        final d08<? super T, ? extends pob<? extends R>> mapper;
        io.reactivex.rxjava3.disposables.a upstream;

        public final class a implements lob<R> {
            public a() {
            }

            @Override // com.oplus.aiunit.vision.lob
            public void onComplete() {
                FlatMapMaybeObserver.this.downstream.onComplete();
            }

            @Override // com.oplus.aiunit.vision.lob
            public void onError(Throwable th) {
                FlatMapMaybeObserver.this.downstream.onError(th);
            }

            @Override // com.oplus.aiunit.vision.lob
            public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
                DisposableHelper.setOnce(FlatMapMaybeObserver.this, aVar);
            }

            @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
            public void onSuccess(R r) {
                FlatMapMaybeObserver.this.downstream.onSuccess(r);
            }
        }

        public FlatMapMaybeObserver(lob<? super R> lobVar, d08<? super T, ? extends pob<? extends R>> d08Var) {
            this.downstream = lobVar;
            this.mapper = d08Var;
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
            this.downstream.onComplete();
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onError(Throwable th) {
            this.downstream.onError(th);
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
                pob<? extends R> pobVarApply = this.mapper.apply(t);
                Objects.requireNonNull(pobVarApply, "The mapper returned a null MaybeSource");
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

    public MaybeFlatten(pob<T> pobVar, d08<? super T, ? extends pob<? extends R>> d08Var) {
        super(pobVar);
        this.f20541j = d08Var;
    }

    @Override // com.oplus.aiunit.vision.xnb
    public void l(lob<? super R> lobVar) {
        this.i.a(new FlatMapMaybeObserver(lobVar, this.f20541j));
    }
}
