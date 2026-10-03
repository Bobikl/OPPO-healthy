package autodispose2;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
enum AutoDisposableHelper implements io.reactivex.rxjava3.disposables.a {
    DISPOSED;

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return true;
    }

    public static boolean dispose(AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference) {
        io.reactivex.rxjava3.disposables.a andSet;
        io.reactivex.rxjava3.disposables.a aVar = atomicReference.get();
        AutoDisposableHelper autoDisposableHelper = DISPOSED;
        if (aVar == autoDisposableHelper || (andSet = atomicReference.getAndSet(autoDisposableHelper)) == autoDisposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }
}
