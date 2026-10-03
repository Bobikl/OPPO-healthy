package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.v2j;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableRangeLong$RangeSubscription extends FlowableRangeLong$BaseRangeSubscription {
    private static final long serialVersionUID = 2587302975077663557L;
    final v2j<? super Long> downstream;

    public FlowableRangeLong$RangeSubscription(v2j<? super Long> v2jVar, long j2, long j3) {
        super(j2, j3);
        this.downstream = v2jVar;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong$BaseRangeSubscription
    public void fastPath() {
        long j2 = this.end;
        v2j<? super Long> v2jVar = this.downstream;
        for (long j3 = this.index; j3 != j2; j3++) {
            if (this.cancelled) {
                return;
            }
            v2jVar.onNext(Long.valueOf(j3));
        }
        if (this.cancelled) {
            return;
        }
        v2jVar.onComplete();
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong$BaseRangeSubscription
    public void slowPath(long j2) {
        long j3 = this.end;
        long j4 = this.index;
        v2j<? super Long> v2jVar = this.downstream;
        do {
            long j5 = 0;
            while (true) {
                if (j5 == j2 || j4 == j3) {
                    if (j4 == j3) {
                        if (this.cancelled) {
                            return;
                        }
                        v2jVar.onComplete();
                        return;
                    } else {
                        j2 = get();
                        if (j5 == j2) {
                            break;
                        }
                    }
                } else {
                    if (this.cancelled) {
                        return;
                    }
                    v2jVar.onNext(Long.valueOf(j4));
                    j5++;
                    j4++;
                }
            }
            this.index = j4;
            j2 = addAndGet(-j5);
        } while (j2 != 0);
    }
}
