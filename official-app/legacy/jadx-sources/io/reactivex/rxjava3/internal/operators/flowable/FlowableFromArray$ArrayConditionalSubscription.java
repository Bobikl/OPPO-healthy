package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.it3;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFromArray$ArrayConditionalSubscription<T> extends FlowableFromArray$BaseArraySubscription<T> {
    private static final long serialVersionUID = 2587302975077663557L;
    final it3<? super T> downstream;

    public FlowableFromArray$ArrayConditionalSubscription(it3<? super T> it3Var, T[] tArr) {
        super(tArr);
        this.downstream = it3Var;
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray$BaseArraySubscription
    public void fastPath() {
        T[] tArr = this.array;
        int length = tArr.length;
        it3<? super T> it3Var = this.downstream;
        for (int i = this.index; i != length; i++) {
            if (this.cancelled) {
                return;
            }
            T t = tArr[i];
            if (t == null) {
                it3Var.onError(new NullPointerException("The element at index " + i + " is null"));
                return;
            }
            it3Var.tryOnNext(t);
        }
        if (this.cancelled) {
            return;
        }
        it3Var.onComplete();
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray$BaseArraySubscription
    public void slowPath(long j2) {
        T[] tArr = this.array;
        int length = tArr.length;
        int i = this.index;
        it3<? super T> it3Var = this.downstream;
        do {
            long j3 = 0;
            while (true) {
                if (j3 == j2 || i == length) {
                    if (i == length) {
                        if (this.cancelled) {
                            return;
                        }
                        it3Var.onComplete();
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
                    T t = tArr[i];
                    if (t == null) {
                        it3Var.onError(new NullPointerException("The element at index " + i + " is null"));
                        return;
                    }
                    if (it3Var.tryOnNext(t)) {
                        j3++;
                    }
                    i++;
                }
            }
            this.index = i;
            j2 = addAndGet(-j3);
        } while (j2 != 0);
    }
}
