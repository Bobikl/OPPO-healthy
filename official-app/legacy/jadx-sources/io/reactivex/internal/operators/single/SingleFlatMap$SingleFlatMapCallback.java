package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.t6h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleFlatMap$SingleFlatMapCallback<T, R> extends AtomicReference<cv5> implements m6h<T>, cv5 {
    private static final long serialVersionUID = 3258103020495908596L;
    final m6h<? super R> downstream;
    final j08<? super T, ? extends t6h<? extends R>> mapper;

    public static final class a<R> implements m6h<R> {
        public final AtomicReference<cv5> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final m6h<? super R> f20503j;

        public a(AtomicReference<cv5> atomicReference, m6h<? super R> m6hVar) {
            this.i = atomicReference;
            this.f20503j = m6hVar;
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onError(Throwable th) {
            this.f20503j.onError(th);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.replace(this.i, cv5Var);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSuccess(R r) {
            this.f20503j.onSuccess(r);
        }
    }

    public SingleFlatMap$SingleFlatMapCallback(m6h<? super R> m6hVar, j08<? super T, ? extends t6h<? extends R>> j08Var) {
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

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        try {
            t6h t6hVar = (t6h) abd.d(this.mapper.apply(t), "The single returned by the mapper is null");
            if (isDisposed()) {
                return;
            }
            t6hVar.a(new a(this, this.downstream));
        } catch (Throwable th) {
            iu6.b(th);
            this.downstream.onError(th);
        }
    }
}
