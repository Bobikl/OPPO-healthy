package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableReplay$SizeBoundReplayBuffer<T> extends ObservableReplay$BoundedReplayBuffer<T> {
    private static final long serialVersionUID = -5898283885385201806L;
    final int limit;

    public ObservableReplay$SizeBoundReplayBuffer(int i) {
        this.limit = i;
    }

    @Override // io.reactivex.internal.operators.observable.ObservableReplay$BoundedReplayBuffer
    public void truncate() {
        if (this.size > this.limit) {
            removeFirst();
        }
    }
}
