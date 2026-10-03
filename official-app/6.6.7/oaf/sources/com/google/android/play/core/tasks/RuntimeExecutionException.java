package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class RuntimeExecutionException extends RuntimeException {
    public RuntimeExecutionException(Throwable th) {
        super(th);
    }

    public final int getErrorCode() {
        return -100;
    }
}
