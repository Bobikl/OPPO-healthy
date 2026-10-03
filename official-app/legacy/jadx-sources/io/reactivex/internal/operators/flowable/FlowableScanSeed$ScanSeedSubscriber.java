package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.c4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.nd1;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableScanSeed$ScanSeedSubscriber<T, R> extends AtomicInteger implements wu7<T>, c3j {
    private static final long serialVersionUID = -1776795561228106469L;
    final nd1<R, ? super T, R> accumulator;
    volatile boolean cancelled;
    int consumed;
    volatile boolean done;
    final v2j<? super R> downstream;
    Throwable error;
    final int limit;
    final int prefetch;
    final c4h<R> queue;
    final AtomicLong requested;
    c3j upstream;
    R value;

    public FlowableScanSeed$ScanSeedSubscriber(v2j<? super R> v2jVar, nd1<R, ? super T, R> nd1Var, R r, int i) {
        this.downstream = v2jVar;
        this.accumulator = nd1Var;
        this.value = r;
        this.prefetch = i;
        this.limit = i - (i >> 2);
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i);
        this.queue = spscArrayQueue;
        spscArrayQueue.offer(r);
        this.requested = new AtomicLong();
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public void drain() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<? super R> v2jVar = this.downstream;
        c4h<R> c4hVar = this.queue;
        int i = this.limit;
        int i2 = this.consumed;
        int iAddAndGet = 1;
        do {
            long j2 = this.requested.get();
            long j3 = 0;
            while (j3 != j2) {
                if (this.cancelled) {
                    c4hVar.clear();
                    return;
                }
                boolean z = this.done;
                if (z && (th = this.error) != null) {
                    c4hVar.clear();
                    v2jVar.onError(th);
                    return;
                }
                R rPoll = c4hVar.poll();
                boolean z2 = rPoll == null;
                if (z && z2) {
                    v2jVar.onComplete();
                    return;
                }
                if (z2) {
                    break;
                }
                v2jVar.onNext(rPoll);
                j3++;
                i2++;
                if (i2 == i) {
                    this.upstream.request(i);
                    i2 = 0;
                }
            }
            if (j3 == j2 && this.done) {
                Throwable th2 = this.error;
                if (th2 != null) {
                    c4hVar.clear();
                    v2jVar.onError(th2);
                    return;
                } else if (c4hVar.isEmpty()) {
                    v2jVar.onComplete();
                    return;
                }
            }
            if (j3 != 0) {
                wr0.e(this.requested, j3);
            }
            this.consumed = i2;
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.error = th;
        this.done = true;
        drain();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        try {
            R r = (R) abd.d(this.accumulator.apply(this.value, t), "The accumulator returned a null value");
            this.value = r;
            this.queue.offer(r);
            drain();
        } catch (Throwable th) {
            iu6.b(th);
            this.upstream.cancel();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(this.prefetch - 1);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            drain();
        }
    }
}
