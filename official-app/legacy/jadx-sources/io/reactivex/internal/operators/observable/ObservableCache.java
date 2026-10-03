package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.n6;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableCache<T> extends n6<T, T> implements bed<T> {

    public static final class CacheDisposable<T> extends AtomicInteger implements cv5 {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final bed<? super T> downstream;
        long index;
        a<T> node;
        int offset;
        final ObservableCache<T> parent;

        public CacheDisposable(bed<? super T> bedVar, ObservableCache<T> observableCache) {
            this.downstream = bedVar;
            throw null;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            throw null;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.disposed;
        }
    }

    public static final class a<T> {
    }
}
