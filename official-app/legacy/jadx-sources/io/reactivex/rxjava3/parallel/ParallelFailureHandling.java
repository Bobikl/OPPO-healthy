package io.reactivex.rxjava3.parallel;

import com.oplus.aiunit.vision.md1;

/* JADX INFO: loaded from: classes10.dex */
public enum ParallelFailureHandling implements md1<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // com.oplus.aiunit.vision.md1
    public ParallelFailureHandling apply(Long l2, Throwable th) {
        return this;
    }
}
