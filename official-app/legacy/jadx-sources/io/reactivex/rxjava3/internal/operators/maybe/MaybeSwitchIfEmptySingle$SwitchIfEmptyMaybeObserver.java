package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.s6h;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeSwitchIfEmptySingle$SwitchIfEmptyMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 4603919676453758899L;
    final l6h<? super T> downstream;
    final s6h<? extends T> other;

    public static final class a<T> implements l6h<T> {
        public final l6h<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.a> f20544j;

        public a(l6h<? super T> l6hVar, AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference) {
            this.i = l6hVar;
            this.f20544j = atomicReference;
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this.f20544j, aVar);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            this.i.onSuccess(t);
        }
    }

    public MaybeSwitchIfEmptySingle$SwitchIfEmptyMaybeObserver(l6h<? super T> l6hVar, s6h<? extends T> s6hVar) {
        this.downstream = l6hVar;
        this.other = s6hVar;
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
        this.other.b(new a(this.downstream, this));
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
