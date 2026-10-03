package io.reactivex.rxjava3.disposables;

import com.oplus.aiunit.vision.Cdo;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes10.dex */
final class ActionDisposable extends ReferenceDisposable<Cdo> {
    private static final long serialVersionUID = -8219729196779211169L;

    public ActionDisposable(Cdo cdo) {
        super(cdo);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "ActionDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }

    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    public void onDisposed(Cdo cdo) {
        try {
            cdo.run();
        } catch (Throwable th) {
            throw ExceptionHelper.h(th);
        }
    }
}
