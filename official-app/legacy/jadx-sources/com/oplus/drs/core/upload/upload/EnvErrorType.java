package com.oplus.drs.core.upload.upload;

import com.oplus.drs.core.upload.executor.FailureScenarioClassifier;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public enum EnvErrorType {
    TIMEOUT,
    CONNECTION,
    DNS_TRANSIENT,
    DOMAIN,
    NETWORK,
    UNKNOWN;

    public static EnvErrorType fromException(Throwable th) {
        EnvErrorType envErrorTypeFromException;
        if (th == null) {
            return UNKNOWN;
        }
        if (th instanceof SocketTimeoutException) {
            return TIMEOUT;
        }
        if (th instanceof UnknownHostException) {
            return FailureScenarioClassifier.h(th) ? DNS_TRANSIENT : DOMAIN;
        }
        if (!(th instanceof IOException)) {
            Throwable cause = th.getCause();
            return (cause == null || cause == th) ? UNKNOWN : fromException(cause);
        }
        String message = th.getMessage();
        if (message != null) {
            if (message.contains("Connection reset") || message.contains("ECONNRESET") || message.contains("Broken pipe") || message.contains("EPIPE")) {
                return CONNECTION;
            }
            if (message.contains("Connection refused") || message.contains("ECONNREFUSED")) {
                return CONNECTION;
            }
            if (message.contains("CertPathValidator") || message.contains("certificate") || message.contains("Certificate") || message.contains("trust anchor") || message.contains("verify") || message.contains("expired")) {
                return DOMAIN;
            }
            if (message.contains("Network is unreachable") || message.contains("ENETUNREACH") || message.contains("No route to host")) {
                return NETWORK;
            }
        }
        Throwable cause2 = th.getCause();
        return (cause2 == null || cause2 == th || (envErrorTypeFromException = fromException(cause2)) == UNKNOWN) ? CONNECTION : envErrorTypeFromException;
    }

    public static EnvErrorType fromHttpStatus(int i) {
        return UNKNOWN;
    }

    public static EnvErrorType fromNetworkProcessCode(int i) {
        return (i == 4 || i == 5) ? NETWORK : UNKNOWN;
    }

    public static EnvErrorType fromUploadCode(int i) {
        if (i != 200 && i != 536 && !looksLikeHttpStatus(i)) {
            return fromNetworkProcessCode(i);
        }
        return UNKNOWN;
    }

    private static boolean looksLikeHttpStatus(int i) {
        return i >= 100 && i < 600;
    }

    public boolean supportsImmediateRetry() {
        return this == TIMEOUT || this == CONNECTION;
    }
}
