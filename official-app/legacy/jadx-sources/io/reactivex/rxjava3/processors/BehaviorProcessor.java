package io.reactivex.rxjava3.processors;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.ou7;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.we0;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class BehaviorProcessor<T> extends ou7<T> {

    public static final class BehaviorSubscription<T> extends AtomicLong implements c3j, we0.a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;
        volatile boolean cancelled;
        final v2j<? super T> downstream;
        boolean emitting;
        boolean fastPath;
        long index;
        boolean next;
        we0<Object> queue;
        final BehaviorProcessor<T> state;

        public BehaviorSubscription(v2j<? super T> v2jVar, BehaviorProcessor<T> behaviorProcessor) {
            this.downstream = v2jVar;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            throw null;
        }

        public void emitFirst() {
            if (this.cancelled) {
                return;
            }
            synchronized (this) {
                if (this.cancelled) {
                    return;
                }
                if (!this.next) {
                    throw null;
                }
            }
        }

        public void emitLoop() {
            we0<Object> we0Var;
            while (!this.cancelled) {
                synchronized (this) {
                    we0Var = this.queue;
                    if (we0Var == null) {
                        this.emitting = false;
                        return;
                    }
                    this.queue = null;
                }
                we0Var.d(this);
            }
        }

        public void emitNext(Object obj, long j2) {
            if (this.cancelled) {
                return;
            }
            if (!this.fastPath) {
                synchronized (this) {
                    if (this.cancelled) {
                        return;
                    }
                    if (this.index == j2) {
                        return;
                    }
                    if (this.emitting) {
                        we0<Object> we0Var = this.queue;
                        if (we0Var == null) {
                            we0Var = new we0<>(4);
                            this.queue = we0Var;
                        }
                        we0Var.c(obj);
                        return;
                    }
                    this.next = true;
                    this.fastPath = true;
                }
            }
            test(obj);
        }

        public boolean isFull() {
            return get() == 0;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                vr0.a(this, j2);
            }
        }

        @Override // com.oplus.aiunit.vision.we0.a, com.oplus.aiunit.vision.mpe
        public boolean test(Object obj) {
            if (this.cancelled) {
                return true;
            }
            if (NotificationLite.isComplete(obj)) {
                this.downstream.onComplete();
                return true;
            }
            if (NotificationLite.isError(obj)) {
                this.downstream.onError(NotificationLite.getError(obj));
                return true;
            }
            long j2 = get();
            if (j2 == 0) {
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.downstream.onNext((Object) NotificationLite.getValue(obj));
            if (j2 == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }
}
