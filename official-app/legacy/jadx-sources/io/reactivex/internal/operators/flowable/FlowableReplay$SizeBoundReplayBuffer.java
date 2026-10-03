package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableReplay$SizeBoundReplayBuffer<T> extends FlowableReplay$BoundedReplayBuffer<T> {
    private static final long serialVersionUID = -5898283885385201806L;
    final int limit;

    public FlowableReplay$SizeBoundReplayBuffer(int i) {
        this.limit = i;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableReplay$BoundedReplayBuffer
    public void truncate() {
        if (this.size > this.limit) {
            removeFirst();
        }
    }
}
