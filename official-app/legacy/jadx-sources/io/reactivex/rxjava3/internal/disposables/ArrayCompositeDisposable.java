package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.a;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<a> implements a {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeDisposable(int i) {
        super(i);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        a andSet;
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                a aVar = get(i);
                DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                if (aVar != disposableHelper && (andSet = getAndSet(i, disposableHelper)) != disposableHelper && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get(0) == DisposableHelper.DISPOSED;
    }

    public a replaceResource(int i, a aVar) {
        a aVar2;
        do {
            aVar2 = get(i);
            if (aVar2 == DisposableHelper.DISPOSED) {
                aVar.dispose();
                return null;
            }
        } while (!compareAndSet(i, aVar2, aVar));
        return aVar2;
    }

    public boolean setResource(int i, a aVar) {
        a aVar2;
        do {
            aVar2 = get(i);
            if (aVar2 == DisposableHelper.DISPOSED) {
                aVar.dispose();
                return false;
            }
        } while (!compareAndSet(i, aVar2, aVar));
        if (aVar2 == null) {
            return true;
        }
        aVar2.dispose();
        return true;
    }
}
