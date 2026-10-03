package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fob;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.t6h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlatMapSingle$FlatMapMaybeObserver<T, R> extends AtomicReference<cv5> implements mob<T>, cv5 {
    private static final long serialVersionUID = 4827726964688405508L;
    final m6h<? super R> downstream;
    final j08<? super T, ? extends t6h<? extends R>> mapper;

    public MaybeFlatMapSingle$FlatMapMaybeObserver(m6h<? super R> m6hVar, j08<? super T, ? extends t6h<? extends R>> j08Var) {
        this.downstream = m6hVar;
        this.mapper = j08Var;
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
        this.downstream.onError(new NoSuchElementException());
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
        try {
            t6h t6hVar = (t6h) abd.d(this.mapper.apply(t), "The mapper returned a null SingleSource");
            if (isDisposed()) {
                return;
            }
            t6hVar.a(new fob(this, this.downstream));
        } catch (Throwable th) {
            iu6.b(th);
            onError(th);
        }
    }
}
