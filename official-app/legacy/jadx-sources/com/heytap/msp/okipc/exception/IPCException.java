package com.heytap.msp.okipc.exception;

/* JADX INFO: loaded from: classes19.dex */
public abstract class IPCException extends RuntimeException {
    public IPCException() {
        this(null, null);
    }

    public IPCException(String str) {
        this(str, null);
    }

    public IPCException(Throwable th) {
        this(null, th);
    }

    public IPCException(String str, Throwable th) {
        super(str, th);
    }
}
