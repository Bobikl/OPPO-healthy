package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.p14;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableRefCount<T> extends kbd<T> {

    public static final class RefConnection extends AtomicReference<cv5> implements Runnable, p14<cv5> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final ObservableRefCount<?> parent;
        long subscriberCount;
        cv5 timer;

        public RefConnection(ObservableRefCount<?> observableRefCount) {
        }

        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }

        @Override // com.oplus.aiunit.vision.p14
        public void accept(cv5 cv5Var) throws Exception {
            DisposableHelper.replace(this, cv5Var);
            throw null;
        }
    }

    public static final class RefCountObserver<T> extends AtomicBoolean implements bed<T>, cv5 {
        private static final long serialVersionUID = -7419642935409022375L;
        final RefConnection connection;
        final bed<? super T> downstream;
        final ObservableRefCount<T> parent;
        cv5 upstream;

        public RefCountObserver(bed<? super T> bedVar, ObservableRefCount<T> observableRefCount, RefConnection refConnection) {
            this.downstream = bedVar;
            this.connection = refConnection;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                throw null;
            }
            h4g.r(th);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            if (DisposableHelper.validate(this.upstream, cv5Var)) {
                this.upstream = cv5Var;
                this.downstream.onSubscribe(this);
            }
        }
    }
}
