package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.m6;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableTakeLast<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f20586j;

    public static final class TakeLastObserver<T> extends ArrayDeque<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = 7240042530241604978L;
        volatile boolean cancelled;
        final int count;
        final aed<? super T> downstream;
        io.reactivex.rxjava3.disposables.a upstream;

        public TakeLastObserver(aed<? super T> aedVar, int i) {
            this.downstream = aedVar;
            this.count = i;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            aed<? super T> aedVar = this.downstream;
            while (!this.cancelled) {
                T tPoll = poll();
                if (tPoll == null) {
                    aedVar.onComplete();
                    return;
                }
                aedVar.onNext(tPoll);
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.count == size()) {
                poll();
            }
            offer(t);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.upstream, aVar)) {
                this.upstream = aVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLast(jdd<T> jddVar, int i) {
        super(jddVar);
        this.f20586j = i;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new TakeLastObserver(aedVar, this.f20586j));
    }
}
