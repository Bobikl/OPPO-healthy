package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.k6;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class a<T, R> extends k6<T, R> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d08<? super T, ? extends R> f20547j;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.a$a, reason: collision with other inner class name */
    public static final class C1030a<T, R> implements lob<T>, io.reactivex.rxjava3.disposables.a {
        public final lob<? super R> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d08<? super T, ? extends R> f20548j;
        public io.reactivex.rxjava3.disposables.a k;

        public C1030a(lob<? super R> lobVar, d08<? super T, ? extends R> d08Var) {
            this.i = lobVar;
            this.f20548j = d08Var;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            io.reactivex.rxjava3.disposables.a aVar = this.k;
            this.k = DisposableHelper.DISPOSED;
            aVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.k.isDisposed();
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
            if (DisposableHelper.validate(this.k, aVar)) {
                this.k = aVar;
                this.i.onSubscribe(this);
            }
        }

        @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            try {
                R rApply = this.f20548j.apply(t);
                Objects.requireNonNull(rApply, "The mapper returned a null item");
                this.i.onSuccess(rApply);
            } catch (Throwable th) {
                hu6.b(th);
                this.i.onError(th);
            }
        }
    }

    public a(pob<T> pobVar, d08<? super T, ? extends R> d08Var) {
        super(pobVar);
        this.f20547j = d08Var;
    }

    @Override // com.oplus.aiunit.vision.xnb
    public void l(lob<? super R> lobVar) {
        this.i.a(new C1030a(lobVar, this.f20547j));
    }
}
