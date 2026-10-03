package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.z12;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableRepeatUntil$RepeatUntilObserver<T> extends AtomicInteger implements bed<T> {
    private static final long serialVersionUID = -7098360935104053232L;
    final bed<? super T> downstream;
    final kdd<? extends T> source;
    final z12 stop;
    final SequentialDisposable upstream;

    public ObservableRepeatUntil$RepeatUntilObserver(bed<? super T> bedVar, z12 z12Var, SequentialDisposable sequentialDisposable, kdd<? extends T> kddVar) {
        this.downstream = bedVar;
        this.upstream = sequentialDisposable;
        this.source = kddVar;
        this.stop = z12Var;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        try {
            if (this.stop.getAsBoolean()) {
                this.downstream.onComplete();
            } else {
                subscribeNext();
            }
        } catch (Throwable th) {
            iu6.b(th);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        this.upstream.replace(cv5Var);
    }

    public void subscribeNext() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                this.source.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }
}
