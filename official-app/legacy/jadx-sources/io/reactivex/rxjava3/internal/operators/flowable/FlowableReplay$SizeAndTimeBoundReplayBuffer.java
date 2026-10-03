package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.vzj;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableReplay$SizeAndTimeBoundReplayBuffer<T> extends FlowableReplay$BoundedReplayBuffer<T> {
    private static final long serialVersionUID = 3457957419649567404L;
    final int limit;
    final long maxAge;
    final cfg scheduler;
    final TimeUnit unit;

    public FlowableReplay$SizeAndTimeBoundReplayBuffer(int i, long j2, TimeUnit timeUnit, cfg cfgVar, boolean z) {
        super(z);
        this.scheduler = cfgVar;
        this.limit = i;
        this.maxAge = j2;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay$BoundedReplayBuffer
    public Object enterTransform(Object obj, boolean z) {
        return new vzj(obj, z ? Long.MAX_VALUE : this.scheduler.f(this.unit), this.unit);
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay$BoundedReplayBuffer
    public FlowableReplay$Node getHead() {
        FlowableReplay$Node flowableReplay$Node;
        long jF = this.scheduler.f(this.unit) - this.maxAge;
        FlowableReplay$Node flowableReplay$Node2 = get();
        FlowableReplay$Node flowableReplay$Node3 = flowableReplay$Node2.get();
        while (true) {
            FlowableReplay$Node flowableReplay$Node4 = flowableReplay$Node3;
            flowableReplay$Node = flowableReplay$Node2;
            flowableReplay$Node2 = flowableReplay$Node4;
            if (flowableReplay$Node2 == null) {
                break;
            }
            vzj vzjVar = (vzj) flowableReplay$Node2.value;
            if (NotificationLite.isComplete(vzjVar.b()) || NotificationLite.isError(vzjVar.b()) || vzjVar.a() > jF) {
                break;
            }
            flowableReplay$Node3 = flowableReplay$Node2.get();
        }
        return flowableReplay$Node;
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay$BoundedReplayBuffer
    public Object leaveTransform(Object obj) {
        return ((vzj) obj).b();
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay$BoundedReplayBuffer
    public void truncate() {
        FlowableReplay$Node flowableReplay$Node;
        long jF = this.scheduler.f(this.unit) - this.maxAge;
        FlowableReplay$Node flowableReplay$Node2 = get();
        FlowableReplay$Node flowableReplay$Node3 = flowableReplay$Node2.get();
        int i = 0;
        while (true) {
            FlowableReplay$Node flowableReplay$Node4 = flowableReplay$Node3;
            flowableReplay$Node = flowableReplay$Node2;
            flowableReplay$Node2 = flowableReplay$Node4;
            int i2 = this.size;
            if (i2 > 1) {
                if (i2 <= this.limit) {
                    if (((vzj) flowableReplay$Node2.value).a() > jF) {
                        break;
                    }
                    i++;
                    this.size--;
                    flowableReplay$Node3 = flowableReplay$Node2.get();
                } else {
                    i++;
                    this.size = i2 - 1;
                    flowableReplay$Node3 = flowableReplay$Node2.get();
                }
            } else {
                break;
            }
        }
        if (i != 0) {
            setFirst(flowableReplay$Node);
        }
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay$BoundedReplayBuffer
    public void truncateFinal() {
        FlowableReplay$Node flowableReplay$Node;
        long jF = this.scheduler.f(this.unit) - this.maxAge;
        FlowableReplay$Node flowableReplay$Node2 = get();
        FlowableReplay$Node flowableReplay$Node3 = flowableReplay$Node2.get();
        int i = 0;
        while (true) {
            FlowableReplay$Node flowableReplay$Node4 = flowableReplay$Node3;
            flowableReplay$Node = flowableReplay$Node2;
            flowableReplay$Node2 = flowableReplay$Node4;
            if (this.size <= 1 || ((vzj) flowableReplay$Node2.value).a() > jF) {
                break;
            }
            i++;
            this.size--;
            flowableReplay$Node3 = flowableReplay$Node2.get();
        }
        if (i != 0) {
            setFirst(flowableReplay$Node);
        }
    }
}
