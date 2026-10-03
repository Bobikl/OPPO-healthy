package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.it3;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.wt7;
import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableFromIterable<T> extends wt7<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Iterable<? extends T> f20527j;

    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        Iterator<? extends T> iterator;
        boolean once;

        public BaseRangeSubscription(Iterator<? extends T> it) {
            this.iterator = it;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.c3j
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.f4h
        public final void clear() {
            this.iterator = null;
        }

        public abstract void fastPath();

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.f4h
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.iterator;
            if (it == null) {
                return true;
            }
            if (!this.once || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.f4h
        public final T poll() {
            Iterator<? extends T> it = this.iterator;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.iterator.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.c3j
        public final void request(long j2) {
            if (SubscriptionHelper.validate(j2) && vr0.a(this, j2) == 0) {
                if (j2 == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription, com.oplus.aiunit.vision.e7f
        public final int requestFusion(int i) {
            return i & 1;
        }

        public abstract void slowPath(long j2);
    }

    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final it3<? super T> downstream;

        public IteratorConditionalSubscription(it3<? super T> it3Var, Iterator<? extends T> it) {
            super(it);
            this.downstream = it3Var;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void fastPath() {
            Iterator<? extends T> it = this.iterator;
            it3<? super T> it3Var = this.downstream;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (next == null) {
                        it3Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    it3Var.tryOnNext(next);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            it3Var.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        hu6.b(th);
                        it3Var.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    hu6.b(th2);
                    it3Var.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void slowPath(long j2) {
            Iterator<? extends T> it = this.iterator;
            it3<? super T> it3Var = this.downstream;
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
                                it3Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zTryOnNext = it3Var.tryOnNext(next);
                            if (this.cancelled) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.cancelled) {
                                        return;
                                    }
                                    it3Var.onComplete();
                                    return;
                                } else if (zTryOnNext) {
                                    j3++;
                                }
                            } catch (Throwable th) {
                                hu6.b(th);
                                it3Var.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            hu6.b(th2);
                            it3Var.onError(th2);
                            return;
                        }
                    }
                }
                j2 = addAndGet(-j3);
            } while (j2 != 0);
        }
    }

    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        final v2j<? super T> downstream;

        public IteratorSubscription(v2j<? super T> v2jVar, Iterator<? extends T> it) {
            super(it);
            this.downstream = v2jVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void fastPath() {
            Iterator<? extends T> it = this.iterator;
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
                        hu6.b(th);
                        v2jVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    hu6.b(th2);
                    v2jVar.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void slowPath(long j2) {
            Iterator<? extends T> it = this.iterator;
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
                                hu6.b(th);
                                v2jVar.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            hu6.b(th2);
                            v2jVar.onError(th2);
                            return;
                        }
                    }
                }
                j2 = addAndGet(-j3);
            } while (j2 != 0);
        }
    }

    public FlowableFromIterable(Iterable<? extends T> iterable) {
        this.f20527j = iterable;
    }

    public static <T> void D(v2j<? super T> v2jVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.complete(v2jVar);
            } else if (v2jVar instanceof it3) {
                v2jVar.onSubscribe(new IteratorConditionalSubscription((it3) v2jVar, it));
            } else {
                v2jVar.onSubscribe(new IteratorSubscription(v2jVar, it));
            }
        } catch (Throwable th) {
            hu6.b(th);
            EmptySubscription.error(th, v2jVar);
        }
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        try {
            D(v2jVar, this.f20527j.iterator());
        } catch (Throwable th) {
            hu6.b(th);
            EmptySubscription.error(th, v2jVar);
        }
    }
}
