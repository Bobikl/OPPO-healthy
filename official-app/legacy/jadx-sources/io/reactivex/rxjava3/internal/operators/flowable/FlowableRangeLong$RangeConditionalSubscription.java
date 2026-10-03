package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.it3;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableRangeLong$RangeConditionalSubscription extends FlowableRangeLong$BaseRangeSubscription {
    private static final long serialVersionUID = 2587302975077663557L;
    final it3<? super Long> downstream;

    public FlowableRangeLong$RangeConditionalSubscription(it3<? super Long> it3Var, long j2, long j3) {
        super(j2, j3);
        this.downstream = it3Var;
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRangeLong$BaseRangeSubscription
    public void fastPath() {
        long j2 = this.end;
        it3<? super Long> it3Var = this.downstream;
        for (long j3 = this.index; j3 != j2; j3++) {
            if (this.cancelled) {
                return;
            }
            it3Var.tryOnNext(Long.valueOf(j3));
        }
        if (this.cancelled) {
            return;
        }
        it3Var.onComplete();
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRangeLong$BaseRangeSubscription
    public void slowPath(long j2) {
        long j3 = this.end;
        long j4 = this.index;
        it3<? super Long> it3Var = this.downstream;
        do {
            long j5 = 0;
            while (true) {
                if (j5 == j2 || j4 == j3) {
                    if (j4 == j3) {
                        if (this.cancelled) {
                            return;
                        }
                        it3Var.onComplete();
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
                    if (it3Var.tryOnNext(Long.valueOf(j4))) {
                        j5++;
                    }
                    j4++;
                }
            }
            this.index = j4;
            j2 = addAndGet(-j5);
        } while (j2 != 0);
    }
}
