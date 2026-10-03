package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableRangeLong$RangeDisposable extends BasicIntQueueDisposable<Long> {
    private static final long serialVersionUID = 396518478098735504L;
    final aed<? super Long> downstream;
    final long end;
    boolean fused;
    long index;

    public ObservableRangeLong$RangeDisposable(aed<? super Long> aedVar, long j2, long j3) {
        this.downstream = aedVar;
        this.index = j2;
        this.end = j3;
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
    public void clear() {
        this.index = this.end;
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
    public void dispose() {
        set(1);
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() != 0;
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
    public boolean isEmpty() {
        return this.index == this.end;
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.e7f
    public int requestFusion(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.fused = true;
        return 1;
    }

    public void run() {
        if (this.fused) {
            return;
        }
        aed<? super Long> aedVar = this.downstream;
        long j2 = this.end;
        for (long j3 = this.index; j3 != j2 && get() == 0; j3++) {
            aedVar.onNext(Long.valueOf(j3));
        }
        if (get() == 0) {
            lazySet(1);
            aedVar.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
    public Long poll() {
        long j2 = this.index;
        if (j2 != this.end) {
            this.index = 1 + j2;
            return Long.valueOf(j2);
        }
        lazySet(1);
        return null;
    }
}
