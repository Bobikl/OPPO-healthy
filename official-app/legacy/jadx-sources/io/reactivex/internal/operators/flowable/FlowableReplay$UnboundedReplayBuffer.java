package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.internal.util.NotificationLite;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableReplay$UnboundedReplayBuffer<T> extends ArrayList<Object> implements c<T> {
    private static final long serialVersionUID = 7063189396499112664L;
    volatile int size;

    public FlowableReplay$UnboundedReplayBuffer(int i) {
        super(i);
    }

    @Override // io.reactivex.internal.operators.flowable.c
    public void complete() {
        add(NotificationLite.complete());
        this.size++;
    }

    @Override // io.reactivex.internal.operators.flowable.c
    public void error(Throwable th) {
        add(NotificationLite.error(th));
        this.size++;
    }

    @Override // io.reactivex.internal.operators.flowable.c
    public void next(T t) {
        add(NotificationLite.next(t));
        this.size++;
    }

    @Override // io.reactivex.internal.operators.flowable.c
    public void replay(FlowableReplay$InnerSubscription<T> flowableReplay$InnerSubscription) {
        synchronized (flowableReplay$InnerSubscription) {
            if (flowableReplay$InnerSubscription.emitting) {
                flowableReplay$InnerSubscription.missed = true;
                return;
            }
            flowableReplay$InnerSubscription.emitting = true;
            v2j<? super T> v2jVar = flowableReplay$InnerSubscription.child;
            while (!flowableReplay$InnerSubscription.isDisposed()) {
                int i = this.size;
                Integer num = (Integer) flowableReplay$InnerSubscription.index();
                int iIntValue = num != null ? num.intValue() : 0;
                long j2 = flowableReplay$InnerSubscription.get();
                long j3 = j2;
                long j4 = 0;
                while (j3 != 0 && iIntValue < i) {
                    Object obj = get(iIntValue);
                    try {
                        if (NotificationLite.accept(obj, v2jVar) || flowableReplay$InnerSubscription.isDisposed()) {
                            return;
                        }
                        iIntValue++;
                        j3--;
                        j4++;
                    } catch (Throwable th) {
                        iu6.b(th);
                        flowableReplay$InnerSubscription.dispose();
                        if (NotificationLite.isError(obj) || NotificationLite.isComplete(obj)) {
                            return;
                        }
                        v2jVar.onError(th);
                        return;
                    }
                }
                if (j4 != 0) {
                    flowableReplay$InnerSubscription.index = Integer.valueOf(iIntValue);
                    if (j2 != Long.MAX_VALUE) {
                        flowableReplay$InnerSubscription.produced(j4);
                    }
                }
                synchronized (flowableReplay$InnerSubscription) {
                    if (!flowableReplay$InnerSubscription.missed) {
                        flowableReplay$InnerSubscription.emitting = false;
                        return;
                    }
                    flowableReplay$InnerSubscription.missed = false;
                }
            }
        }
    }
}
