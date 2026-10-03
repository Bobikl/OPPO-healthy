package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.jt3;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFromIterable$IteratorConditionalSubscription<T> extends FlowableFromIterable$BaseRangeSubscription<T> {
    private static final long serialVersionUID = -6022804456014692607L;
    final jt3<? super T> downstream;

    public FlowableFromIterable$IteratorConditionalSubscription(jt3<? super T> jt3Var, Iterator<? extends T> it) {
        super(it);
        this.downstream = jt3Var;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable$BaseRangeSubscription
    public void fastPath() {
        Iterator<? extends T> it = this.it;
        jt3<? super T> jt3Var = this.downstream;
        while (!this.cancelled) {
            try {
                T next = it.next();
                if (this.cancelled) {
                    return;
                }
                if (next == null) {
                    jt3Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
                jt3Var.tryOnNext(next);
                if (this.cancelled) {
                    return;
                }
                try {
                    if (!it.hasNext()) {
                        if (this.cancelled) {
                            return;
                        }
                        jt3Var.onComplete();
                        return;
                    }
                } catch (Throwable th) {
                    iu6.b(th);
                    jt3Var.onError(th);
                    return;
                }
            } catch (Throwable th2) {
                iu6.b(th2);
                jt3Var.onError(th2);
                return;
            }
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable$BaseRangeSubscription
    public void slowPath(long j2) {
        Iterator<? extends T> it = this.it;
        jt3<? super T> jt3Var = this.downstream;
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
                            jt3Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        boolean zTryOnNext = jt3Var.tryOnNext(next);
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                if (this.cancelled) {
                                    return;
                                }
                                jt3Var.onComplete();
                                return;
                            } else if (zTryOnNext) {
                                j3++;
                            }
                        } catch (Throwable th) {
                            iu6.b(th);
                            jt3Var.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        iu6.b(th2);
                        jt3Var.onError(th2);
                        return;
                    }
                }
            }
            j2 = addAndGet(-j3);
        } while (j2 != 0);
    }
}
