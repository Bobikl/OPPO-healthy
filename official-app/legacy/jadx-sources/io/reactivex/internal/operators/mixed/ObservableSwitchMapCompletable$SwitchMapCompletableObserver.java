package io.reactivex.internal.operators.mixed;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableSwitchMapCompletable$SwitchMapCompletableObserver<T> implements bed<T>, cv5 {

    public static final class SwitchMapInnerObserver extends AtomicReference<cv5> implements bs3 {
        private static final long serialVersionUID = -8003404460084760287L;
        final ObservableSwitchMapCompletable$SwitchMapCompletableObserver<?> parent;

        public SwitchMapInnerObserver(ObservableSwitchMapCompletable$SwitchMapCompletableObserver<?> observableSwitchMapCompletable$SwitchMapCompletableObserver) {
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onComplete() {
            throw null;
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onError(Throwable th) {
            throw null;
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }
    }
}
