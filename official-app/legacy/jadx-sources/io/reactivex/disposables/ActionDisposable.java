package io.reactivex.disposables;

import com.oplus.aiunit.vision.eo;
import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes10.dex */
final class ActionDisposable extends ReferenceDisposable<eo> {
    private static final long serialVersionUID = -8219729196779211169L;

    public ActionDisposable(eo eoVar) {
        super(eoVar);
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(eo eoVar) {
        try {
            eoVar.run();
        } catch (Throwable th) {
            throw ExceptionHelper.d(th);
        }
    }
}
