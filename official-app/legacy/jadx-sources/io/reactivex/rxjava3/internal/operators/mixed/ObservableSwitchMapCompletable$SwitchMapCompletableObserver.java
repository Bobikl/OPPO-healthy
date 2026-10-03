package io.reactivex.rxjava3.internal.operators.mixed;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.as3;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableSwitchMapCompletable$SwitchMapCompletableObserver<T> implements aed<T>, a {

    public static final class SwitchMapInnerObserver extends AtomicReference<a> implements as3 {
        private static final long serialVersionUID = -8003404460084760287L;
        final ObservableSwitchMapCompletable$SwitchMapCompletableObserver<?> parent;

        public SwitchMapInnerObserver(ObservableSwitchMapCompletable$SwitchMapCompletableObserver<?> observableSwitchMapCompletable$SwitchMapCompletableObserver) {
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onComplete() {
            throw null;
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onError(Throwable th) {
            throw null;
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onSubscribe(a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }
    }
}
