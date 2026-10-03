package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.mob;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlatMapCompletable$FlatMapCompletableObserver<T> extends AtomicReference<cv5> implements mob<T>, bs3, cv5 {
    private static final long serialVersionUID = -2177128922851101253L;
    final bs3 downstream;
    final j08<? super T, ? extends es3> mapper;

    public MaybeFlatMapCompletable$FlatMapCompletableObserver(bs3 bs3Var, j08<? super T, ? extends es3> j08Var) {
        this.downstream = bs3Var;
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
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.replace(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        try {
            es3 es3Var = (es3) abd.d(this.mapper.apply(t), "The mapper returned a null CompletableSource");
            if (isDisposed()) {
                return;
            }
            es3Var.a(this);
        } catch (Throwable th) {
            iu6.b(th);
            onError(th);
        }
    }
}
