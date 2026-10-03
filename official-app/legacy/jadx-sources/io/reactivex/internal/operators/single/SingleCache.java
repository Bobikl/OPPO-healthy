package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.g5h;
import com.oplus.aiunit.vision.m6h;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleCache<T> extends g5h<T> implements m6h<T> {

    public static final class CacheDisposable<T> extends AtomicBoolean implements cv5 {
        private static final long serialVersionUID = 7514387411091976596L;
        final m6h<? super T> downstream;
        final SingleCache<T> parent;

        public CacheDisposable(m6h<? super T> m6hVar, SingleCache<T> singleCache) {
            this.downstream = m6hVar;
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
