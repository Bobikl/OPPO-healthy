package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.v2j;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableRange$RangeSubscription extends FlowableRange$BaseRangeSubscription {
    private static final long serialVersionUID = 2587302975077663557L;
    final v2j<? super Integer> downstream;

    public FlowableRange$RangeSubscription(v2j<? super Integer> v2jVar, int i, int i2) {
        super(i, i2);
        this.downstream = v2jVar;
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange$BaseRangeSubscription
    public void fastPath() {
        int i = this.end;
        v2j<? super Integer> v2jVar = this.downstream;
        for (int i2 = this.index; i2 != i; i2++) {
            if (this.cancelled) {
                return;
            }
            v2jVar.onNext(Integer.valueOf(i2));
        }
        if (this.cancelled) {
            return;
        }
        v2jVar.onComplete();
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange$BaseRangeSubscription
    public void slowPath(long j2) {
        int i = this.end;
        int i2 = this.index;
        v2j<? super Integer> v2jVar = this.downstream;
        do {
            long j3 = 0;
            while (true) {
                if (j3 == j2 || i2 == i) {
                    if (i2 == i) {
                        if (this.cancelled) {
                            return;
                        }
                        v2jVar.onComplete();
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
                    v2jVar.onNext(Integer.valueOf(i2));
                    j3++;
                    i2++;
                }
            }
            this.index = i2;
            j2 = addAndGet(-j3);
        } while (j2 != 0);
    }
}
