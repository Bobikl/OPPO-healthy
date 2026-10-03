package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.fc8;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableGroupBy$GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<fc8<K, V>> implements wu7<T> {
    static final Object NULL_KEY = new Object();
    private static final long serialVersionUID = -3688291656102519502L;
    final int bufferSize;
    final boolean delayError;
    boolean done;
    final v2j<? super fc8<K, V>> downstream;
    Throwable error;
    final Queue<a<K, V>> evictedGroups;
    volatile boolean finished;
    final Map<Object, a<K, V>> groups;
    final j08<? super T, ? extends K> keySelector;
    boolean outputFused;
    final yki<fc8<K, V>> queue;
    c3j upstream;
    final j08<? super T, ? extends V> valueSelector;
    final AtomicBoolean cancelled = new AtomicBoolean();
    final AtomicLong requested = new AtomicLong();
    final AtomicInteger groupCount = new AtomicInteger(1);

    public FlowableGroupBy$GroupBySubscriber(v2j<? super fc8<K, V>> v2jVar, j08<? super T, ? extends K> j08Var, j08<? super T, ? extends V> j08Var2, int i, boolean z, Map<Object, a<K, V>> map, Queue<a<K, V>> queue) {
        this.downstream = v2jVar;
        this.keySelector = j08Var;
        this.valueSelector = j08Var2;
        this.bufferSize = i;
        this.delayError = z;
        this.groups = map;
        this.evictedGroups = queue;
        this.queue = new yki<>(i);
    }

    private void completeEvictions() {
        if (this.evictedGroups != null) {
            int i = 0;
            while (true) {
                a<K, V> aVarPoll = this.evictedGroups.poll();
                if (aVarPoll == null) {
                    break;
                }
                aVarPoll.onComplete();
                i++;
            }
            if (i != 0) {
                this.groupCount.addAndGet(-i);
            }
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled.compareAndSet(false, true)) {
            completeEvictions();
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, v2j<?> v2jVar, yki<?> ykiVar) {
        if (this.cancelled.get()) {
            ykiVar.clear();
            return true;
        }
        if (this.delayError) {
            if (!z || !z2) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                v2jVar.onError(th);
            } else {
                v2jVar.onComplete();
            }
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            ykiVar.clear();
            v2jVar.onError(th2);
            return true;
        }
        if (!z2) {
            return false;
        }
        v2jVar.onComplete();
        return true;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public void clear() {
        this.queue.clear();
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        if (this.outputFused) {
            drainFused();
        } else {
            drainNormal();
        }
    }

    public void drainFused() {
        Throwable th;
        yki<fc8<K, V>> ykiVar = this.queue;
        v2j<? super fc8<K, V>> v2jVar = this.downstream;
        int iAddAndGet = 1;
        while (!this.cancelled.get()) {
            boolean z = this.finished;
            if (z && !this.delayError && (th = this.error) != null) {
                ykiVar.clear();
                v2jVar.onError(th);
                return;
            }
            v2jVar.onNext(null);
            if (z) {
                Throwable th2 = this.error;
                if (th2 != null) {
                    v2jVar.onError(th2);
                    return;
                } else {
                    v2jVar.onComplete();
                    return;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        ykiVar.clear();
    }

    public void drainNormal() {
        yki<fc8<K, V>> ykiVar = this.queue;
        v2j<? super fc8<K, V>> v2jVar = this.downstream;
        int iAddAndGet = 1;
        do {
            long j2 = this.requested.get();
            long j3 = 0;
            while (j3 != j2) {
                boolean z = this.finished;
                fc8<K, V> fc8VarPoll = ykiVar.poll();
                boolean z2 = fc8VarPoll == null;
                if (checkTerminated(z, z2, v2jVar, ykiVar)) {
                    return;
                }
                if (z2) {
                    break;
                }
                v2jVar.onNext(fc8VarPoll);
                j3++;
            }
            if (j3 == j2 && checkTerminated(this.finished, ykiVar.isEmpty(), v2jVar, ykiVar)) {
                return;
            }
            if (j3 != 0) {
                if (j2 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j3);
                }
                this.upstream.request(j3);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return this.queue.isEmpty();
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
        Queue<a<K, V>> queue = this.evictedGroups;
        if (queue != null) {
            queue.clear();
        }
        this.done = true;
        this.finished = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.done = true;
        Iterator<a<K, V>> it = this.groups.values().iterator();
        while (it.hasNext()) {
            it.next().onError(th);
        }
        this.groups.clear();
        Queue<a<K, V>> queue = this.evictedGroups;
        if (queue != null) {
            queue.clear();
        }
        this.error = th;
        this.finished = true;
        drain();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        boolean z;
        a aVar;
        if (this.done) {
            return;
        }
        yki<fc8<K, V>> ykiVar = this.queue;
        try {
            K kApply = this.keySelector.apply(t);
            Object obj = kApply != null ? kApply : NULL_KEY;
            a<K, V> aVar2 = this.groups.get(obj);
            if (aVar2 != null) {
                z = false;
                aVar = aVar2;
            } else {
                if (this.cancelled.get()) {
                    return;
                }
                a aVarH = a.h(kApply, this.bufferSize, this, this.delayError);
                this.groups.put(obj, aVarH);
                this.groupCount.getAndIncrement();
                z = true;
                aVar = aVarH;
            }
            try {
                aVar.onNext(abd.d(this.valueSelector.apply(t), "The valueSelector returned null"));
                completeEvictions();
                if (z) {
                    ykiVar.offer(aVar);
                    drain();
                }
            } catch (Throwable th) {
                iu6.b(th);
                this.upstream.cancel();
                onError(th);
            }
        } catch (Throwable th2) {
            iu6.b(th2);
            this.upstream.cancel();
            onError(th2);
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(this.bufferSize);
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            drain();
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f7f
    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public fc8<K, V> poll() {
        return this.queue.poll();
    }

    public void cancel(K k) {
        if (k == null) {
            k = (K) NULL_KEY;
        }
        this.groups.remove(k);
        if (this.groupCount.decrementAndGet() == 0) {
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }
    }
}
