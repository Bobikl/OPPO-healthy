package io.reactivex.rxjava3.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public interface b {
    void innerClose(boolean z, FlowableGroupJoin$LeftRightEndSubscriber flowableGroupJoin$LeftRightEndSubscriber);

    void innerCloseError(Throwable th);

    void innerComplete(FlowableGroupJoin$LeftRightSubscriber flowableGroupJoin$LeftRightSubscriber);

    void innerError(Throwable th);

    void innerValue(boolean z, Object obj);
}
