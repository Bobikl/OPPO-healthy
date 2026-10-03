package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.f5h;
import com.oplus.aiunit.vision.l6h;
import io.reactivex.rxjava3.disposables.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleCache<T> extends f5h<T> implements l6h<T> {

    public static final class CacheDisposable<T> extends AtomicBoolean implements a {
        private static final long serialVersionUID = 7514387411091976596L;
        final l6h<? super T> downstream;
        final SingleCache<T> parent;

        public CacheDisposable(l6h<? super T> l6hVar, SingleCache<T> singleCache) {
            this.downstream = l6hVar;
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
