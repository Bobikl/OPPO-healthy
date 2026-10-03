package io.reactivex.rxjava3.internal.observers;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.fv5;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.o14;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class DisposableAutoReleaseMultiObserver<T> extends AbstractDisposableAutoRelease implements l6h<T>, lob<T>, as3 {
    private static final long serialVersionUID = 8924480688481408726L;
    final o14<? super T> onSuccess;

    public DisposableAutoReleaseMultiObserver(fv5 fv5Var, o14<? super T> o14Var, o14<? super Throwable> o14Var2, Cdo cdo) {
        super(fv5Var, o14Var2, cdo);
        this.onSuccess = o14Var;
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar != disposableHelper) {
            lazySet(disposableHelper);
            try {
                this.onSuccess.accept(t);
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
        }
        removeSelf();
    }
}
