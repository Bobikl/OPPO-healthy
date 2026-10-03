package io.reactivex.internal.subscribers;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements wu7<T>, c3j {
    static final long COMPLETE_MASK = Long.MIN_VALUE;
    static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    protected final v2j<? super R> downstream;
    protected long produced;
    protected c3j upstream;
    protected R value;

    public SinglePostCompleteSubscriber(v2j<? super R> v2jVar) {
        this.downstream = v2jVar;
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public final void complete(R r) {
        long j2 = this.produced;
        if (j2 != 0) {
            wr0.e(this, j2);
        }
        while (true) {
            long j3 = get();
            if ((j3 & Long.MIN_VALUE) != 0) {
                onDrop(r);
                return;
            }
            if ((j3 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onNext(r);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.value = null;
                }
            }
        }
    }

    public abstract /* synthetic */ void onComplete();

    public void onDrop(R r) {
    }

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(Object obj);

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public final void request(long j2) {
        long j3;
        if (SubscriptionHelper.validate(j2)) {
            do {
                j3 = get();
                if ((j3 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j3, wr0.c(j3, j2)));
            this.upstream.request(j2);
        }
    }
}
