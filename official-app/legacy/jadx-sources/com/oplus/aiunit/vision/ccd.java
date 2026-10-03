package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public interface ccd<T> extends ml6<T> {
    boolean isDisposed();

    void setCancellable(ax2 ax2Var);

    void setDisposable(io.reactivex.rxjava3.disposables.a aVar);

    boolean tryOnError(Throwable th);
}
