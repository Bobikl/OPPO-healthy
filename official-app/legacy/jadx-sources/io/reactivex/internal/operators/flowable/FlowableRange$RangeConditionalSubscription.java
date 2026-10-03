package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.jt3;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableRange$RangeConditionalSubscription extends FlowableRange$BaseRangeSubscription {
    private static final long serialVersionUID = 2587302975077663557L;
    final jt3<? super Integer> downstream;

    public FlowableRange$RangeConditionalSubscription(jt3<? super Integer> jt3Var, int i, int i2) {
        super(i, i2);
        this.downstream = jt3Var;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableRange$BaseRangeSubscription
    public void fastPath() {
        int i = this.end;
        jt3<? super Integer> jt3Var = this.downstream;
        for (int i2 = this.index; i2 != i; i2++) {
            if (this.cancelled) {
                return;
            }
            jt3Var.tryOnNext(Integer.valueOf(i2));
        }
        if (this.cancelled) {
            return;
        }
        jt3Var.onComplete();
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableRange$BaseRangeSubscription
    public void slowPath(long j2) {
        int i = this.end;
        int i2 = this.index;
        jt3<? super Integer> jt3Var = this.downstream;
        do {
            long j3 = 0;
            while (true) {
                if (j3 == j2 || i2 == i) {
                    if (i2 == i) {
                        if (this.cancelled) {
                            return;
                        }
                        jt3Var.onComplete();
                        return;
                    } else {
                        j2 = get();
                        if (j3 == j2) {
                            break;
                        }
                    }
                } else {
                    if (this.cancelled) {
                        return;
                    }
                    if (jt3Var.tryOnNext(Integer.valueOf(i2))) {
                        j3++;
                    }
                    i2++;
                }
            }
            this.index = i2;
            j2 = addAndGet(-j3);
        } while (j2 != 0);
    }
}
