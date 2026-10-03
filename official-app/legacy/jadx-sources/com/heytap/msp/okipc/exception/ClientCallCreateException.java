package com.heytap.msp.okipc.exception;

/* JADX INFO: loaded from: classes19.dex */
public class ClientCallCreateException extends IPCClientException {
    public ClientCallCreateException(String str, Throwable th) {
        super(str, th);
    }

    public ClientCallCreateException(Throwable th) {
        this(th.getMessage(), th);
    }

    public ClientCallCreateException(String str) {
        super(str, null);
    }
}
