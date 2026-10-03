package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.uzj;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableReplay$SizeAndTimeBoundReplayBuffer<T> extends FlowableReplay$BoundedReplayBuffer<T> {
    private static final long serialVersionUID = 3457957419649567404L;
    final int limit;
    final long maxAge;
    final zeg scheduler;
    final TimeUnit unit;

    public FlowableReplay$SizeAndTimeBoundReplayBuffer(int i, long j2, TimeUnit timeUnit, zeg zegVar) {
        this.scheduler = zegVar;
        this.limit = i;
        this.maxAge = j2;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableReplay$BoundedReplayBuffer
    public Object enterTransform(Object obj) {
        return new uzj(obj, this.scheduler.b(this.unit), this.unit);
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableReplay$BoundedReplayBuffer
    public FlowableReplay$Node getHead() {
        FlowableReplay$Node flowableReplay$Node;
        long jB = this.scheduler.b(this.unit) - this.maxAge;
        FlowableReplay$Node flowableReplay$Node2 = get();
        FlowableReplay$Node flowableReplay$Node3 = flowableReplay$Node2.get();
        while (true) {
            FlowableReplay$Node flowableReplay$Node4 = flowableReplay$Node3;
            flowableReplay$Node = flowableReplay$Node2;
            flowableReplay$Node2 = flowableReplay$Node4;
            if (flowableReplay$Node2 == null) {
                break;
            }
            uzj uzjVar = (uzj) flowableReplay$Node2.value;
            if (NotificationLite.isComplete(uzjVar.b()) || NotificationLite.isError(uzjVar.b()) || uzjVar.a() > jB) {
                break;
            }
            flowableReplay$Node3 = flowableReplay$Node2.get();
        }
        return flowableReplay$Node;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableReplay$BoundedReplayBuffer
    public Object leaveTransform(Object obj) {
        return ((uzj) obj).b();
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableReplay$BoundedReplayBuffer
    public void truncate() {
        FlowableReplay$Node flowableReplay$Node;
        long jB = this.scheduler.b(this.unit) - this.maxAge;
        FlowableReplay$Node flowableReplay$Node2 = get();
        FlowableReplay$Node flowableReplay$Node3 = flowableReplay$Node2.get();
        int i = 0;
        while (true) {
            FlowableReplay$Node flowableReplay$Node4 = flowableReplay$Node3;
            flowableReplay$Node = flowableReplay$Node2;
            flowableReplay$Node2 = flowableReplay$Node4;
            if (flowableReplay$Node2 != null) {
                int i2 = this.size;
                if (i2 <= this.limit) {
                    if (((uzj) flowableReplay$Node2.value).a() > jB) {
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

    @Override // io.reactivex.internal.operators.flowable.FlowableReplay$BoundedReplayBuffer
    public void truncateFinal() {
        FlowableReplay$Node flowableReplay$Node;
        long jB = this.scheduler.b(this.unit) - this.maxAge;
        FlowableReplay$Node flowableReplay$Node2 = get();
        FlowableReplay$Node flowableReplay$Node3 = flowableReplay$Node2.get();
        int i = 0;
        while (true) {
            FlowableReplay$Node flowableReplay$Node4 = flowableReplay$Node3;
            flowableReplay$Node = flowableReplay$Node2;
            flowableReplay$Node2 = flowableReplay$Node4;
            if (flowableReplay$Node2 == null || this.size <= 1 || ((uzj) flowableReplay$Node2.value).a() > jB) {
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
