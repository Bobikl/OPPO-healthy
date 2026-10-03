package io.reactivex.processors;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.pu7;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.ve0;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class BehaviorProcessor<T> extends pu7<T> {

    public static final class BehaviorSubscription<T> extends AtomicLong implements c3j, ve0.a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;
        volatile boolean cancelled;
        final v2j<? super T> downstream;
        boolean emitting;
        boolean fastPath;
        long index;
        boolean next;
        ve0<Object> queue;
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
            ve0<Object> ve0Var;
            while (!this.cancelled) {
                synchronized (this) {
                    ve0Var = this.queue;
                    if (ve0Var == null) {
                        this.emitting = false;
                        return;
                    }
                    this.queue = null;
                }
                ve0Var.c(this);
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
                        ve0<Object> ve0Var = this.queue;
                        if (ve0Var == null) {
                            ve0Var = new ve0<>(4);
                            this.queue = ve0Var;
                        }
                        ve0Var.b(obj);
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
                wr0.a(this, j2);
            }
        }

        @Override // com.oplus.aiunit.vision.ve0.a, com.oplus.aiunit.vision.npe
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
