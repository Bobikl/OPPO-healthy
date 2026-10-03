package io.reactivex.rxjava3.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public interface b {
    void innerClose(boolean z, ObservableGroupJoin$LeftRightEndObserver observableGroupJoin$LeftRightEndObserver);

    void innerCloseError(Throwable th);

    void innerComplete(ObservableGroupJoin$LeftRightObserver observableGroupJoin$LeftRightObserver);

    void innerError(Throwable th);

    void innerValue(boolean z, Object obj);
}
