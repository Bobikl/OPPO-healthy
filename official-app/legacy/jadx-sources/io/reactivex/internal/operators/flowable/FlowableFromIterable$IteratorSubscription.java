package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.v2j;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFromIterable$IteratorSubscription<T> extends FlowableFromIterable$BaseRangeSubscription<T> {
    private static final long serialVersionUID = -6022804456014692607L;
    final v2j<? super T> downstream;

    public FlowableFromIterable$IteratorSubscription(v2j<? super T> v2jVar, Iterator<? extends T> it) {
        super(it);
        this.downstream = v2jVar;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable$BaseRangeSubscription
    public void fastPath() {
        Iterator<? extends T> it = this.it;
        v2j<? super T> v2jVar = this.downstream;
        while (!this.cancelled) {
            try {
                T next = it.next();
                if (this.cancelled) {
                    return;
                }
                if (next == null) {
                    v2jVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
                v2jVar.onNext(next);
                if (this.cancelled) {
                    return;
                }
                try {
                    if (!it.hasNext()) {
                        if (this.cancelled) {
                            return;
                        }
                        v2jVar.onComplete();
                        return;
                    }
                } catch (Throwable th) {
                    iu6.b(th);
                    v2jVar.onError(th);
                    return;
                }
            } catch (Throwable th2) {
                iu6.b(th2);
                v2jVar.onError(th2);
                return;
            }
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable$BaseRangeSubscription
    public void slowPath(long j2) {
        Iterator<? extends T> it = this.it;
        v2j<? super T> v2jVar = this.downstream;
        do {
            long j3 = 0;
            while (true) {
                if (j3 == j2) {
                    j2 = get();
                    if (j3 == j2) {
                        break;
                    }
                } else {
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        T next = it.next();
                        if (this.cancelled) {
                            return;
                        }
                        if (next == null) {
                            v2jVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        v2jVar.onNext(next);
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                if (this.cancelled) {
                                    return;
                                }
                                v2jVar.onComplete();
                                return;
                            }
                            j3++;
                        } catch (Throwable th) {
                            iu6.b(th);
                            v2jVar.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        iu6.b(th2);
                        v2jVar.onError(th2);
                        return;
                    }
                }
            }
            j2 = addAndGet(-j3);
        } while (j2 != 0);
    }
}
