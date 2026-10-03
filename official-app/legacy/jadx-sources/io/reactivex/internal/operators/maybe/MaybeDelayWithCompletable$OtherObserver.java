package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.aob;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeDelayWithCompletable$OtherObserver<T> extends AtomicReference<cv5> implements bs3, cv5 {
    private static final long serialVersionUID = 703409937383992161L;
    final mob<? super T> downstream;
    final qob<T> source;

    public MaybeDelayWithCompletable$OtherObserver(mob<? super T> mobVar, qob<T> qobVar) {
        this.downstream = mobVar;
        this.source = qobVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onComplete() {
        this.source.a(new aob(this, this.downstream));
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            this.downstream.onSubscribe(this);
        }
    }
}
