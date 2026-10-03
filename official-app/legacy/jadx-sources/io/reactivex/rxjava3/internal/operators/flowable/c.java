package io.reactivex.rxjava3.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public interface c<T> {
    void complete();

    void error(Throwable th);

    void next(T t);

    void replay(FlowableReplay$InnerSubscription<T> flowableReplay$InnerSubscription);
}
