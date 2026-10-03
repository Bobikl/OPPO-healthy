package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.jt3;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableRangeLong$RangeConditionalSubscription extends FlowableRangeLong$BaseRangeSubscription {
    private static final long serialVersionUID = 2587302975077663557L;
    final jt3<? super Long> downstream;

    public FlowableRangeLong$RangeConditionalSubscription(jt3<? super Long> jt3Var, long j2, long j3) {
        super(j2, j3);
        this.downstream = jt3Var;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong$BaseRangeSubscription
    public void fastPath() {
        long j2 = this.end;
        jt3<? super Long> jt3Var = this.downstream;
        for (long j3 = this.index; j3 != j2; j3++) {
            if (this.cancelled) {
                return;
            }
            jt3Var.tryOnNext(Long.valueOf(j3));
        }
        if (this.cancelled) {
            return;
        }
        jt3Var.onComplete();
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong$BaseRangeSubscription
    public void slowPath(long j2) {
        long j3 = this.end;
        long j4 = this.index;
        jt3<? super Long> jt3Var = this.downstream;
        do {
            long j5 = 0;
            while (true) {
                if (j5 == j2 || j4 == j3) {
                    if (j4 == j3) {
                        if (this.cancelled) {
                            return;
                        }
                        jt3Var.onComplete();
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
                    if (jt3Var.tryOnNext(Long.valueOf(j4))) {
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
