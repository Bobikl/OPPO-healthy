package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableRange$RangeDisposable extends BasicIntQueueDisposable<Integer> {
    private static final long serialVersionUID = 396518478098735504L;
    final bed<? super Integer> downstream;
    final long end;
    boolean fused;
    long index;

    public ObservableRange$RangeDisposable(bed<? super Integer> bedVar, long j2, long j3) {
        this.downstream = bedVar;
        this.index = j2;
        this.end = j3;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
    public void clear() {
        this.index = this.end;
        lazySet(1);
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
    public void dispose() {
        set(1);
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() != 0;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return this.index == this.end;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f7f
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
        bed<? super Integer> bedVar = this.downstream;
        long j2 = this.end;
        for (long j3 = this.index; j3 != j2 && get() == 0; j3++) {
            bedVar.onNext(Integer.valueOf((int) j3));
        }
        if (get() == 0) {
            lazySet(1);
            bedVar.onComplete();
        }
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
    public Integer poll() throws Exception {
        long j2 = this.index;
        if (j2 != this.end) {
            this.index = 1 + j2;
            return Integer.valueOf((int) j2);
        }
        lazySet(1);
        return null;
    }
}
