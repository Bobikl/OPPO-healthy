package com.heytap.msp.okipc.exception;

/* JADX INFO: loaded from: classes19.dex */
public enum IPCServerExceptionType {
    TIMEOUT(504),
    BUNDLE_ERROR(401),
    UNKNOWN_PROTOCOL(402),
    ROUTE_ERROR(502),
    EXECUTE_ERROR(500),
    UNCAUGHT_ERROR(503),
    REJECTED(509);

    private final int statusCode;

    IPCServerExceptionType(int i) {
        this.statusCode = i;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
