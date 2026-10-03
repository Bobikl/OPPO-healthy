package io.reactivex.parallel;

import com.oplus.aiunit.vision.nd1;

/* JADX INFO: loaded from: classes10.dex */
public enum ParallelFailureHandling implements nd1<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // com.oplus.aiunit.vision.nd1
    public ParallelFailureHandling apply(Long l2, Throwable th) {
        return this;
    }
}
