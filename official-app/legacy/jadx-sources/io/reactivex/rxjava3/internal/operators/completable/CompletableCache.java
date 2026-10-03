package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.pr3;
import io.reactivex.rxjava3.disposables.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class CompletableCache extends pr3 implements as3 {

    public final class InnerCompletableCache extends AtomicBoolean implements a {
        private static final long serialVersionUID = 8943152917179642732L;
        final as3 downstream;
        final /* synthetic */ CompletableCache this$0;

        public InnerCompletableCache(CompletableCache completableCache, as3 as3Var) {
            this.downstream = as3Var;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return get();
        }
    }
}
