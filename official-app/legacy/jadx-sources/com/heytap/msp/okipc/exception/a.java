package com.heytap.msp.okipc.exception;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class a extends b {
    public static final a a = new a();

    public static a a() {
        return a;
    }

    public IPCException b(int i, String str) {
        IPCServerException iPCServerRejectedException;
        if (i == IPCServerExceptionType.TIMEOUT.getStatusCode()) {
            iPCServerRejectedException = new IPCServerTimeoutException();
        } else if (i == IPCServerExceptionType.BUNDLE_ERROR.getStatusCode()) {
            iPCServerRejectedException = new IPCServerBundleException();
        } else if (i == IPCServerExceptionType.UNKNOWN_PROTOCOL.getStatusCode()) {
            iPCServerRejectedException = new IPCServerUnknownProtocolException();
        } else if (i == IPCServerExceptionType.ROUTE_ERROR.getStatusCode()) {
            iPCServerRejectedException = new IPCServerRouteException();
        } else if (i == IPCServerExceptionType.EXECUTE_ERROR.getStatusCode()) {
            iPCServerRejectedException = new IPCServerExecuteException();
        } else {
            if (i != IPCServerExceptionType.REJECTED.getStatusCode()) {
                return new IPCUnknownException(str);
            }
            iPCServerRejectedException = new IPCServerRejectedException();
        }
        try {
            iPCServerRejectedException.readFrom(new JSONObject(str));
            return iPCServerRejectedException;
        } catch (Exception unused) {
            return new IPCUnknownException(str);
        }
    }
}
