package io.reactivex.rxjava3.internal.jdk8;

import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.g7f;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.it3;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.wt7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableFromStream<T> extends wt7<T> {

    public static abstract class AbstractStreamSubscription<T> extends AtomicLong implements g7f<T> {
        private static final long serialVersionUID = -9082954702547571853L;
        volatile boolean cancelled;
        AutoCloseable closeable;
        Iterator<T> iterator;
        boolean once;

        public AbstractStreamSubscription(Iterator<T> it, AutoCloseable autoCloseable) {
            this.iterator = it;
            this.closeable = autoCloseable;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void cancel() {
            this.cancelled = true;
            request(1L);
        }

        @Override // com.oplus.aiunit.vision.f4h
        public void clear() {
            this.iterator = null;
            AutoCloseable autoCloseable = this.closeable;
            this.closeable = null;
            if (autoCloseable != null) {
                FlowableFromStream.D(autoCloseable);
            }
        }

        @Override // com.oplus.aiunit.vision.f4h
        public boolean isEmpty() {
            Iterator<T> it = this.iterator;
            if (it == null) {
                return true;
            }
            if (!this.once || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // com.oplus.aiunit.vision.f4h
        public boolean offer(T t) {
            throw new UnsupportedOperationException();
        }

        @Override // com.oplus.aiunit.vision.f4h
        public T poll() {
            Iterator<T> it = this.iterator;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            T next = this.iterator.next();
            Objects.requireNonNull(next, "The Stream's Iterator.next() returned a null value");
            return next;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void request(long j2) {
            if (SubscriptionHelper.validate(j2) && vr0.a(this, j2) == 0) {
                run(j2);
            }
        }

        @Override // com.oplus.aiunit.vision.e7f
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(Long.MAX_VALUE);
            return 1;
        }

        public abstract void run(long j2);

        public boolean offer(T t, T t2) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class StreamConditionalSubscription<T> extends AbstractStreamSubscription<T> {
        private static final long serialVersionUID = -9082954702547571853L;
        final it3<? super T> downstream;

        public StreamConditionalSubscription(it3<? super T> it3Var, Iterator<T> it, AutoCloseable autoCloseable) {
            super(it, autoCloseable);
            this.downstream = it3Var;
        }

        @Override // io.reactivex.rxjava3.internal.jdk8.FlowableFromStream.AbstractStreamSubscription
        public void run(long j2) {
            Iterator<T> it = this.iterator;
            it3<? super T> it3Var = this.downstream;
            long j3 = 0;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    Objects.requireNonNull(next, "The Stream's Iterator returned a null value");
                    if (it3Var.tryOnNext(next)) {
                        j3++;
                    }
                    if (this.cancelled) {
                        continue;
                    } else {
                        try {
                            if (!it.hasNext()) {
                                it3Var.onComplete();
                                this.cancelled = true;
                            } else if (j3 != j2) {
                                continue;
                            } else {
                                j2 = get();
                                if (j3 != j2) {
                                    continue;
                                } else if (compareAndSet(j2, 0L)) {
                                    return;
                                } else {
                                    j2 = get();
                                }
                            }
                        } catch (Throwable th) {
                            hu6.b(th);
                            it3Var.onError(th);
                            this.cancelled = true;
                        }
                    }
                } catch (Throwable th2) {
                    hu6.b(th2);
                    it3Var.onError(th2);
                    this.cancelled = true;
                }
            }
            clear();
        }
    }

    public static final class StreamSubscription<T> extends AbstractStreamSubscription<T> {
        private static final long serialVersionUID = -9082954702547571853L;
        final v2j<? super T> downstream;

        public StreamSubscription(v2j<? super T> v2jVar, Iterator<T> it, AutoCloseable autoCloseable) {
            super(it, autoCloseable);
            this.downstream = v2jVar;
        }

        @Override // io.reactivex.rxjava3.internal.jdk8.FlowableFromStream.AbstractStreamSubscription
        public void run(long j2) {
            Iterator<T> it = this.iterator;
            v2j<? super T> v2jVar = this.downstream;
            long j3 = 0;
            while (!this.cancelled) {
                try {
                    T next = it.next();
                    Objects.requireNonNull(next, "The Stream's Iterator returned a null value");
                    v2jVar.onNext(next);
                    if (this.cancelled) {
                        continue;
                    } else {
                        try {
                            if (it.hasNext()) {
                                j3++;
                                if (j3 != j2) {
                                    continue;
                                } else {
                                    j2 = get();
                                    if (j3 != j2) {
                                        continue;
                                    } else if (compareAndSet(j2, 0L)) {
                                        return;
                                    } else {
                                        j2 = get();
                                    }
                                }
                            } else {
                                v2jVar.onComplete();
                                this.cancelled = true;
                            }
                        } catch (Throwable th) {
                            hu6.b(th);
                            v2jVar.onError(th);
                            this.cancelled = true;
                        }
                    }
                } catch (Throwable th2) {
                    hu6.b(th2);
                    v2jVar.onError(th2);
                    this.cancelled = true;
                }
            }
            clear();
        }
    }

    public static void D(AutoCloseable autoCloseable) {
        try {
            autoCloseable.close();
        } catch (Throwable th) {
            hu6.b(th);
            g4g.u(th);
        }
    }
}
