package io.reactivex.processors;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.pu7;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ReplayProcessor<T> extends pu7<T> {

    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        public Node(T t) {
            this.value = t;
        }
    }

    public static final class ReplaySubscription<T> extends AtomicInteger implements c3j {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final v2j<? super T> downstream;
        long emitted;
        Object index;
        final AtomicLong requested = new AtomicLong();
        final ReplayProcessor<T> state;

        public ReplaySubscription(v2j<? super T> v2jVar, ReplayProcessor<T> replayProcessor) {
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

        @Override // com.oplus.aiunit.vision.c3j
        public void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                wr0.a(this.requested, j2);
                throw null;
            }
        }
    }

    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        public TimedNode(T t, long j2) {
            this.value = t;
            this.time = j2;
        }
    }
}
