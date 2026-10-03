package io.reactivex.rxjava3.schedulers;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.xrj;
import io.reactivex.rxjava3.disposables.a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class TestScheduler$TestWorker extends cfg.c {

    public final class QueueRemove extends AtomicReference<xrj> implements a {
        private static final long serialVersionUID = -7874968252110604360L;
        final /* synthetic */ TestScheduler$TestWorker this$1;

        public QueueRemove(TestScheduler$TestWorker testScheduler$TestWorker, xrj xrjVar) {
            lazySet(xrjVar);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (getAndSet(null) != null) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return get() == null;
        }
    }
}
