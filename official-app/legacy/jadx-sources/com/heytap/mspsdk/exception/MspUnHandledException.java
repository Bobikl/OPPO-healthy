package com.heytap.mspsdk.exception;

/* JADX INFO: loaded from: classes19.dex */
public class MspUnHandledException extends MspSdkException {
    public MspUnHandledException(Throwable th) {
        super("unhandled: " + th.getMessage(), th, -1);
    }
}
