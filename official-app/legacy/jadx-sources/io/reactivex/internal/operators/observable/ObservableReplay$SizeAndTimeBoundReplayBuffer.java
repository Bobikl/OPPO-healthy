package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.uzj;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableReplay$SizeAndTimeBoundReplayBuffer<T> extends ObservableReplay$BoundedReplayBuffer<T> {
    private static final long serialVersionUID = 3457957419649567404L;
    final int limit;
    final long maxAge;
    final zeg scheduler;
    final TimeUnit unit;

    public ObservableReplay$SizeAndTimeBoundReplayBuffer(int i, long j2, TimeUnit timeUnit, zeg zegVar) {
        this.scheduler = zegVar;
        this.limit = i;
        this.maxAge = j2;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.internal.operators.observable.ObservableReplay$BoundedReplayBuffer
    public Object enterTransform(Object obj) {
        return new uzj(obj, this.scheduler.b(this.unit), this.unit);
    }

    @Override // io.reactivex.internal.operators.observable.ObservableReplay$BoundedReplayBuffer
    public ObservableReplay$Node getHead() {
        ObservableReplay$Node observableReplay$Node;
        long jB = this.scheduler.b(this.unit) - this.maxAge;
        ObservableReplay$Node observableReplay$Node2 = get();
        ObservableReplay$Node observableReplay$Node3 = observableReplay$Node2.get();
        while (true) {
            ObservableReplay$Node observableReplay$Node4 = observableReplay$Node3;
            observableReplay$Node = observableReplay$Node2;
            observableReplay$Node2 = observableReplay$Node4;
            if (observableReplay$Node2 == null) {
                break;
            }
            uzj uzjVar = (uzj) observableReplay$Node2.value;
            if (NotificationLite.isComplete(uzjVar.b()) || NotificationLite.isError(uzjVar.b()) || uzjVar.a() > jB) {
                break;
            }
            observableReplay$Node3 = observableReplay$Node2.get();
        }
        return observableReplay$Node;
    }

    @Override // io.reactivex.internal.operators.observable.ObservableReplay$BoundedReplayBuffer
    public Object leaveTransform(Object obj) {
        return ((uzj) obj).b();
    }

    @Override // io.reactivex.internal.operators.observable.ObservableReplay$BoundedReplayBuffer
    public void truncate() {
        ObservableReplay$Node observableReplay$Node;
        long jB = this.scheduler.b(this.unit) - this.maxAge;
        ObservableReplay$Node observableReplay$Node2 = get();
        ObservableReplay$Node observableReplay$Node3 = observableReplay$Node2.get();
        int i = 0;
        while (true) {
            ObservableReplay$Node observableReplay$Node4 = observableReplay$Node3;
            observableReplay$Node = observableReplay$Node2;
            observableReplay$Node2 = observableReplay$Node4;
            if (observableReplay$Node2 != null) {
                int i2 = this.size;
                if (i2 <= this.limit) {
                    if (((uzj) observableReplay$Node2.value).a() > jB) {
                        break;
                    }
                    i++;
                    this.size--;
                    observableReplay$Node3 = observableReplay$Node2.get();
                } else {
                    i++;
                    this.size = i2 - 1;
                    observableReplay$Node3 = observableReplay$Node2.get();
                }
            } else {
                break;
            }
        }
        if (i != 0) {
            setFirst(observableReplay$Node);
        }
    }

    @Override // io.reactivex.internal.operators.observable.ObservableReplay$BoundedReplayBuffer
    public void truncateFinal() {
        ObservableReplay$Node observableReplay$Node;
        long jB = this.scheduler.b(this.unit) - this.maxAge;
        ObservableReplay$Node observableReplay$Node2 = get();
        ObservableReplay$Node observableReplay$Node3 = observableReplay$Node2.get();
        int i = 0;
        while (true) {
            ObservableReplay$Node observableReplay$Node4 = observableReplay$Node3;
            observableReplay$Node = observableReplay$Node2;
            observableReplay$Node2 = observableReplay$Node4;
            if (observableReplay$Node2 == null || this.size <= 1 || ((uzj) observableReplay$Node2.value).a() > jB) {
                break;
            }
            i++;
            this.size--;
            observableReplay$Node3 = observableReplay$Node2.get();
        }
        if (i != 0) {
            setFirst(observableReplay$Node);
        }
    }
}
