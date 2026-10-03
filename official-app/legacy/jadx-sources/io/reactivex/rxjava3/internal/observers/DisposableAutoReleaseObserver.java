package io.reactivex.rxjava3.internal.observers;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.fv5;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.o14;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class DisposableAutoReleaseObserver<T> extends AbstractDisposableAutoRelease implements aed<T> {
    private static final long serialVersionUID = 8924480688481408726L;
    final o14<? super T> onNext;

    public DisposableAutoReleaseObserver(fv5 fv5Var, o14<? super T> o14Var, o14<? super Throwable> o14Var2, Cdo cdo) {
        super(fv5Var, o14Var2, cdo);
        this.onNext = o14Var;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        if (get() != DisposableHelper.DISPOSED) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                hu6.b(th);
                get().dispose();
                onError(th);
            }
        }
    }
}
