package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableResumeNext$ResumeNextObserver extends AtomicReference<cv5> implements bs3, cv5 {
    private static final long serialVersionUID = 5018523762564524046L;
    final bs3 downstream;
    final j08<? super Throwable, ? extends es3> errorMapper;
    boolean once;

    public CompletableResumeNext$ResumeNextObserver(bs3 bs3Var, j08<? super Throwable, ? extends es3> j08Var) {
        this.downstream = bs3Var;
        this.errorMapper = j08Var;
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
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        if (this.once) {
            this.downstream.onError(th);
            return;
        }
        this.once = true;
        try {
            ((es3) abd.d(this.errorMapper.apply(th), "The errorMapper returned a null CompletableSource")).a(this);
        } catch (Throwable th2) {
            iu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.replace(this, cv5Var);
    }
}
