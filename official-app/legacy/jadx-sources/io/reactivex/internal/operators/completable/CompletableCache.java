package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.qr3;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class CompletableCache extends qr3 implements bs3 {

    public final class InnerCompletableCache extends AtomicBoolean implements cv5 {
        private static final long serialVersionUID = 8943152917179642732L;
        final bs3 downstream;
        final /* synthetic */ CompletableCache this$0;

        public InnerCompletableCache(CompletableCache completableCache, bs3 bs3Var) {
            this.downstream = bs3Var;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return get();
        }
    }
}
