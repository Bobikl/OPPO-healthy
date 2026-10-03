package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.ec8;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableGroupBy$GroupBySubscriber<T, K, V> extends AtomicLong implements vu7<T>, c3j {
    static final Object NULL_KEY = new Object();
    private static final long serialVersionUID = -3688291656102519502L;
    final int bufferSize;
    final boolean delayError;
    boolean done;
    final v2j<? super ec8<K, V>> downstream;
    long emittedGroups;
    final Queue<a<K, V>> evictedGroups;
    final Map<Object, a<K, V>> groups;
    final d08<? super T, ? extends K> keySelector;
    final int limit;
    c3j upstream;
    final d08<? super T, ? extends V> valueSelector;
    final AtomicBoolean cancelled = new AtomicBoolean();
    final AtomicInteger groupCount = new AtomicInteger(1);
    final AtomicLong groupConsumed = new AtomicLong();

    public FlowableGroupBy$GroupBySubscriber(v2j<? super ec8<K, V>> v2jVar, d08<? super T, ? extends K> d08Var, d08<? super T, ? extends V> d08Var2, int i, boolean z, Map<Object, a<K, V>> map, Queue<a<K, V>> queue) {
        this.downstream = v2jVar;
        this.keySelector = d08Var;
        this.valueSelector = d08Var2;
        this.bufferSize = i;
        this.limit = i - (i >> 2);
        this.delayError = z;
        this.groups = map;
        this.evictedGroups = queue;
    }

    private void completeEvictions() {
        if (this.evictedGroups != null) {
            int i = 0;
            while (true) {
                a<K, V> aVarPoll = this.evictedGroups.poll();
                if (aVarPoll == null) {
                    break;
                } else if (aVarPoll.k.tryComplete()) {
                    i++;
                }
            }
            if (i != 0) {
                this.groupCount.addAndGet(-i);
            }
        }
    }

    public static String groupHangWarning(long j2) {
        return "Unable to emit a new group (#" + j2 + ") due to lack of requests. Please make sure the downstream can always accept a new group as well as each group is consumed in order for the whole operator to be able to proceed.";
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled.compareAndSet(false, true)) {
            completeEvictions();
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        Iterator<a<K, V>> it = this.groups.values().iterator();
        while (it.hasNext()) {
            it.next().onComplete();
        }
        this.groups.clear();
        completeEvictions();
        this.done = true;
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
            return;
        }
        this.done = true;
        Iterator<a<K, V>> it = this.groups.values().iterator();
        while (it.hasNext()) {
            it.next().onError(th);
        }
        this.groups.clear();
        completeEvictions();
        this.downstream.onError(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        boolean z;
        if (this.done) {
            return;
        }
        try {
            K kApply = this.keySelector.apply(t);
            Object obj = kApply != null ? kApply : NULL_KEY;
            a aVarD = this.groups.get(obj);
            if (aVarD != null) {
                z = false;
            } else {
                if (this.cancelled.get()) {
                    return;
                }
                aVarD = a.D(kApply, this.bufferSize, this, this.delayError);
                this.groups.put(obj, (a<K, V>) aVarD);
                this.groupCount.getAndIncrement();
                z = true;
            }
            try {
                aVarD.onNext(ExceptionHelper.c(this.valueSelector.apply(t), "The valueSelector returned a null value."));
                completeEvictions();
                if (z) {
                    if (this.emittedGroups == get()) {
                        this.upstream.cancel();
                        onError(new MissingBackpressureException(groupHangWarning(this.emittedGroups)));
                        return;
                    }
                    this.emittedGroups++;
                    this.downstream.onNext(aVarD);
                    if (aVarD.k.tryAbandon()) {
                        cancel(kApply);
                        aVarD.onComplete();
                        requestGroup(1L);
                    }
                }
            } catch (Throwable th) {
                hu6.b(th);
                this.upstream.cancel();
                if (z) {
                    if (this.emittedGroups == get()) {
                        MissingBackpressureException missingBackpressureException = new MissingBackpressureException(groupHangWarning(this.emittedGroups));
                        missingBackpressureException.initCause(th);
                        onError(missingBackpressureException);
                        return;
                    }
                    this.downstream.onNext(aVarD);
                }
                onError(th);
            }
        } catch (Throwable th2) {
            hu6.b(th2);
            this.upstream.cancel();
            onError(th2);
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(this.bufferSize);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this, j2);
        }
    }

    public void requestGroup(long j2) {
        long j3;
        long jC;
        AtomicLong atomicLong = this.groupConsumed;
        int i = this.limit;
        do {
            j3 = atomicLong.get();
            jC = vr0.c(j3, j2);
        } while (!atomicLong.compareAndSet(j3, jC));
        while (true) {
            long j4 = i;
            if (jC < j4) {
                return;
            }
            if (atomicLong.compareAndSet(jC, jC - j4)) {
                this.upstream.request(j4);
            }
            jC = atomicLong.get();
        }
    }

    public void cancel(K k) {
        if (k == null) {
            k = (K) NULL_KEY;
        }
        if (this.groups.remove(k) == null || this.groupCount.decrementAndGet() != 0) {
            return;
        }
        this.upstream.cancel();
    }
}
