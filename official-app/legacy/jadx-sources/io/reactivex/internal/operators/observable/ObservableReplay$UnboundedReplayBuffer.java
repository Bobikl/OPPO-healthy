package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import io.reactivex.internal.util.NotificationLite;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableReplay$UnboundedReplayBuffer<T> extends ArrayList<Object> implements d<T> {
    private static final long serialVersionUID = 7063189396499112664L;
    volatile int size;

    public ObservableReplay$UnboundedReplayBuffer(int i) {
        super(i);
    }

    @Override // io.reactivex.internal.operators.observable.d
    public void complete() {
        add(NotificationLite.complete());
        this.size++;
    }

    @Override // io.reactivex.internal.operators.observable.d
    public void error(Throwable th) {
        add(NotificationLite.error(th));
        this.size++;
    }

    @Override // io.reactivex.internal.operators.observable.d
    public void next(T t) {
        add(NotificationLite.next(t));
        this.size++;
    }

    @Override // io.reactivex.internal.operators.observable.d
    public void replay(ObservableReplay$InnerDisposable<T> observableReplay$InnerDisposable) {
        if (observableReplay$InnerDisposable.getAndIncrement() != 0) {
            return;
        }
        bed<? super T> bedVar = observableReplay$InnerDisposable.child;
        int iAddAndGet = 1;
        while (!observableReplay$InnerDisposable.isDisposed()) {
            int i = this.size;
            Integer num = (Integer) observableReplay$InnerDisposable.index();
            int iIntValue = num != null ? num.intValue() : 0;
            while (iIntValue < i) {
                if (NotificationLite.accept(get(iIntValue), bedVar) || observableReplay$InnerDisposable.isDisposed()) {
                    return;
                } else {
                    iIntValue++;
                }
            }
            observableReplay$InnerDisposable.index = Integer.valueOf(iIntValue);
            iAddAndGet = observableReplay$InnerDisposable.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }
}
