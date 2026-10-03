package io.reactivex.internal.disposables;

import com.oplus.aiunit.vision.cv5;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<cv5> implements cv5 {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeDisposable(int i) {
        super(i);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        cv5 andSet;
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                cv5 cv5Var = get(i);
                DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                if (cv5Var != disposableHelper && (andSet = getAndSet(i, disposableHelper)) != disposableHelper && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get(0) == DisposableHelper.DISPOSED;
    }

    public cv5 replaceResource(int i, cv5 cv5Var) {
        cv5 cv5Var2;
        do {
            cv5Var2 = get(i);
            if (cv5Var2 == DisposableHelper.DISPOSED) {
                cv5Var.dispose();
                return null;
            }
        } while (!compareAndSet(i, cv5Var2, cv5Var));
        return cv5Var2;
    }

    public boolean setResource(int i, cv5 cv5Var) {
        cv5 cv5Var2;
        do {
            cv5Var2 = get(i);
            if (cv5Var2 == DisposableHelper.DISPOSED) {
                cv5Var.dispose();
                return false;
            }
        } while (!compareAndSet(i, cv5Var2, cv5Var));
        if (cv5Var2 == null) {
            return true;
        }
        cv5Var2.dispose();
        return true;
    }
}
