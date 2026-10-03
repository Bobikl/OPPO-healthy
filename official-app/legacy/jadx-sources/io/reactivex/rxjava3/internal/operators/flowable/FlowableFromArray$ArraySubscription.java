package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.v2j;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFromArray$ArraySubscription<T> extends FlowableFromArray$BaseArraySubscription<T> {
    private static final long serialVersionUID = 2587302975077663557L;
    final v2j<? super T> downstream;

    public FlowableFromArray$ArraySubscription(v2j<? super T> v2jVar, T[] tArr) {
        super(tArr);
        this.downstream = v2jVar;
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray$BaseArraySubscription
    public void fastPath() {
        T[] tArr = this.array;
        int length = tArr.length;
        v2j<? super T> v2jVar = this.downstream;
        for (int i = this.index; i != length; i++) {
            if (this.cancelled) {
                return;
            }
            T t = tArr[i];
            if (t == null) {
                v2jVar.onError(new NullPointerException("The element at index " + i + " is null"));
                return;
            }
            v2jVar.onNext(t);
        }
        if (this.cancelled) {
            return;
        }
        v2jVar.onComplete();
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray$BaseArraySubscription
    public void slowPath(long j2) {
        T[] tArr = this.array;
        int length = tArr.length;
        int i = this.index;
        v2j<? super T> v2jVar = this.downstream;
        do {
            long j3 = 0;
            while (true) {
                if (j3 == j2 || i == length) {
                    if (i == length) {
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
                    T t = tArr[i];
                    if (t == null) {
                        v2jVar.onError(new NullPointerException("The element at index " + i + " is null"));
                        return;
                    }
                    v2jVar.onNext(t);
                    j3++;
                    i++;
                }
            }
            this.index = i;
            j2 = addAndGet(-j3);
        } while (j2 != 0);
    }
}
