package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -2223459372976438024L;
    final lob<? super T> downstream;
    final pob<? extends T> other;

    public static final class a<T> implements lob<T> {
        public final lob<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.a> f20543j;

        public a(lob<? super T> lobVar, AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference) {
            this.i = lobVar;
            this.f20543j = atomicReference;
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
            DisposableHelper.setOnce(this.f20543j, aVar);
        }

        @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            this.i.onSuccess(t);
        }
    }

    public MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver(lob<? super T> lobVar, pob<? extends T> pobVar) {
        this.downstream = lobVar;
        this.other = pobVar;
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
        io.reactivex.rxjava3.disposables.a aVar = get();
        if (aVar == DisposableHelper.DISPOSED || !compareAndSet(aVar, null)) {
            return;
        }
        this.other.a(new a(this.downstream, this));
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.downstream.onError(th);
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
