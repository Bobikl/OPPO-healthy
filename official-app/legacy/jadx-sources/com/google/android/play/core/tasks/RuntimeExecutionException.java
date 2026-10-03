package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes14.dex */
public class RuntimeExecutionException extends RuntimeException {
    public RuntimeExecutionException(Throwable th) {
        super(th);
    }

    public final int getErrorCode() {
        return -100;
    }
}
