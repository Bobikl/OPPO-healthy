package com.oplus.drs.core.upload.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.j38;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.core.net.entity.UploadStateAware;
import com.oppo.obus.common.configmetadata.core.exception.ProtobufDeserializationException;
import com.oppo.obus.common.configmetadata.core.exception.ProtobufSerializationException;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.zip.ZipException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class FailureScenarioClassifier {

    public enum FailureScenario {
        NO_NETWORK,
        DNS_TEMPORARY_FAILURE,
        HOST_UNRESOLVABLE,
        CERTIFICATE_INVALID,
        CONNECTION_REFUSED,
        GATEWAY_FAILURE,
        TRANSIENT_CONNECTION_FAILURE,
        REQUEST_BUILD_FAILED,
        APP_DATA_INVALID,
        APP_ID_REJECTED,
        APP_RATE_LIMITED,
        SERVER_BACKOFF,
        PRECHECK_GATE_BLOCKED,
        UNKNOWN
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FailureScenario.values().length];
            a = iArr;
            try {
                iArr[FailureScenario.REQUEST_BUILD_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[FailureScenario.APP_DATA_INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[FailureScenario.APP_ID_REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[FailureScenario.APP_RATE_LIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[FailureScenario.SERVER_BACKOFF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[FailureScenario.TRANSIENT_CONNECTION_FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @NonNull
    public static FailureScenario a(int i, int i2, @Nullable Throwable th, boolean z) {
        FailureScenario failureScenarioB;
        FailureScenario failureScenarioD;
        if (z && i > 0) {
            return c(i);
        }
        if (i2 > 0) {
            return c(i2);
        }
        if (i > 0 && (failureScenarioD = d(i)) != FailureScenario.UNKNOWN && (i != 4 || th == null)) {
            return failureScenarioD;
        }
        if (th != null && (failureScenarioB = b(th)) != FailureScenario.UNKNOWN) {
            return failureScenarioB;
        }
        if (i != 4) {
            return FailureScenario.UNKNOWN;
        }
        z6b.k("FailureScenarioClassifier", "Local result code NETWORK_ERROR without classified exception → TRANSIENT_CONNECTION_FAILURE");
        return FailureScenario.TRANSIENT_CONNECTION_FAILURE;
    }

    public static FailureScenario b(Throwable th) {
        FailureScenario failureScenarioB;
        if (th == null) {
            return FailureScenario.UNKNOWN;
        }
        if (th instanceof UnknownHostException) {
            if (h(th)) {
                z6b.k("FailureScenarioClassifier", "UnknownHostException (temporary DNS failure) → DNS_TEMPORARY_FAILURE");
                return FailureScenario.DNS_TEMPORARY_FAILURE;
            }
            z6b.k("FailureScenarioClassifier", "UnknownHostException (host unresolved) → HOST_UNRESOLVABLE");
            return FailureScenario.HOST_UNRESOLVABLE;
        }
        if ((th instanceof SSLPeerUnverifiedException) || (th instanceof CertificateException)) {
            z6b.k("FailureScenarioClassifier", "SSL peer/certificate error → CERTIFICATE_INVALID: " + th.getClass().getSimpleName());
            return FailureScenario.CERTIFICATE_INVALID;
        }
        if (th instanceof SSLHandshakeException) {
            if (g(th)) {
                z6b.k("FailureScenarioClassifier", "SSLHandshakeException with certificate/trust issue → CERTIFICATE_INVALID");
                return FailureScenario.CERTIFICATE_INVALID;
            }
            if (i(th)) {
                z6b.k("FailureScenarioClassifier", "SSLHandshakeException with transient transport issue → TRANSIENT_CONNECTION_FAILURE");
                return FailureScenario.TRANSIENT_CONNECTION_FAILURE;
            }
            z6b.k("FailureScenarioClassifier", "SSLHandshakeException without certificate evidence → TRANSIENT_CONNECTION_FAILURE");
            return FailureScenario.TRANSIENT_CONNECTION_FAILURE;
        }
        if (th instanceof SSLException) {
            if (g(th)) {
                z6b.k("FailureScenarioClassifier", "SSLException with certificate/trust issue → CERTIFICATE_INVALID");
                return FailureScenario.CERTIFICATE_INVALID;
            }
            if (i(th)) {
                z6b.k("FailureScenarioClassifier", "SSLException with transient transport issue → TRANSIENT_CONNECTION_FAILURE");
                return FailureScenario.TRANSIENT_CONNECTION_FAILURE;
            }
        }
        if (th instanceof SocketTimeoutException) {
            z6b.k("FailureScenarioClassifier", "SocketTimeoutException → TRANSIENT_CONNECTION_FAILURE");
            return FailureScenario.TRANSIENT_CONNECTION_FAILURE;
        }
        if ((th instanceof ProtocolException) || (th instanceof EOFException) || (th instanceof ZipException)) {
            z6b.k("FailureScenarioClassifier", th.getClass().getSimpleName() + " → TRANSIENT_CONNECTION_FAILURE");
            return FailureScenario.TRANSIENT_CONNECTION_FAILURE;
        }
        if ((th instanceof ProtobufSerializationException) || (th instanceof IllegalArgumentException)) {
            z6b.k("FailureScenarioClassifier", th.getClass().getSimpleName() + " → REQUEST_BUILD_FAILED");
            return FailureScenario.REQUEST_BUILD_FAILED;
        }
        if ((th instanceof ProtobufDeserializationException) || (th instanceof JSONException)) {
            z6b.k("FailureScenarioClassifier", th.getClass().getSimpleName() + " → APP_DATA_INVALID");
            return FailureScenario.APP_DATA_INVALID;
        }
        if (!(th instanceof IOException)) {
            Throwable cause = th.getCause();
            if (cause != null && cause != th) {
                return b(cause);
            }
            z6b.k("FailureScenarioClassifier", "Unknown exception: " + th.getClass().getName() + " → UNKNOWN");
            return FailureScenario.UNKNOWN;
        }
        Throwable cause2 = th.getCause();
        if (cause2 != null && (failureScenarioB = b(cause2)) != FailureScenario.UNKNOWN) {
            return failureScenarioB;
        }
        String strJ = j(th);
        if (strJ != null) {
            if (strJ.contains("connection refused") || strJ.contains("connect failed") || strJ.contains("econnrefused")) {
                z6b.k("FailureScenarioClassifier", "Connection refused → CONNECTION_REFUSED");
                return FailureScenario.CONNECTION_REFUSED;
            }
            if (strJ.contains("connection reset") || strJ.contains("econnreset") || strJ.contains("broken pipe") || strJ.contains("epipe")) {
                z6b.k("FailureScenarioClassifier", "Connection reset → TRANSIENT_CONNECTION_FAILURE");
                return FailureScenario.TRANSIENT_CONNECTION_FAILURE;
            }
            if (strJ.contains("network is unreachable") || strJ.contains("enetunreach") || strJ.contains("no route to host") || strJ.contains("ehostunreach")) {
                z6b.k("FailureScenarioClassifier", "Network unreachable / no route to host → NO_NETWORK");
                return FailureScenario.NO_NETWORK;
            }
        }
        return FailureScenario.TRANSIENT_CONNECTION_FAILURE;
    }

    public static FailureScenario c(int i) {
        if (i == 200) {
            return FailureScenario.UNKNOWN;
        }
        if (i == 404 || i == 432 || i == 536) {
            z6b.k("FailureScenarioClassifier", "HTTP " + i + " → APP_ID_REJECTED");
            return FailureScenario.APP_ID_REJECTED;
        }
        if (i == 400 || i == 401 || i == 403 || i == 405 || i == 502 || i == 408 || i == 409) {
            z6b.k("FailureScenarioClassifier", "HTTP " + i + " → GATEWAY_FAILURE");
            return FailureScenario.GATEWAY_FAILURE;
        }
        if (i != 413 && i != 999 && i != 430 && i != 431) {
            switch (i) {
                case UploadStateAware.HTTP_REQUEST_EXPIRED /* 433 */:
                case UploadStateAware.HTTP_URL_SIGN_INVALID /* 434 */:
                case UploadStateAware.HTTP_INVALID_SOURCE_SDK_TYPE /* 435 */:
                    break;
                default:
                    switch (i) {
                        case UploadStateAware.HTTP_DECRYPT_FAILED /* 440 */:
                        case UploadStateAware.HTTP_DECOMPRESS_FAILED /* 441 */:
                        case UploadStateAware.HTTP_DESERIALIZE_FAILED /* 442 */:
                        case 443:
                        case 444:
                            break;
                        default:
                            switch (i) {
                                case 450:
                                case UploadStateAware.HTTP_NO_HEAD_FOUND /* 451 */:
                                case UploadStateAware.HTTP_NO_BODY_FOUND /* 452 */:
                                case UploadStateAware.HTTP_BODY_INVALID /* 453 */:
                                case UploadStateAware.HTTP_HQUEUE_WRITE_FAILED /* 454 */:
                                case UploadStateAware.HTTP_NO_DECODE_BODY_FOUND /* 455 */:
                                    break;
                                default:
                                    if (i == 429) {
                                        z6b.k("FailureScenarioClassifier", "HTTP 429 → APP_RATE_LIMITED");
                                        return FailureScenario.APP_RATE_LIMITED;
                                    }
                                    if (i != 503 && i != 507 && i != 509 && i != 537 && i != 500 && i != 501) {
                                        switch (i) {
                                            case UploadStateAware.HTTP_PUSH_KAFKA_FAILED /* 556 */:
                                            case UploadStateAware.HTTP_PUSH_KAFKA_TIMEOUT /* 557 */:
                                            case UploadStateAware.HTTP_KAFKA_CLUSTER_INIT_FAILED /* 558 */:
                                                break;
                                            default:
                                                if (i >= 400 && i < 500) {
                                                    z6b.k("FailureScenarioClassifier", "HTTP " + i + " (4xx) → GATEWAY_FAILURE");
                                                    return FailureScenario.GATEWAY_FAILURE;
                                                }
                                                if (i < 500 || i >= 600) {
                                                    z6b.k("FailureScenarioClassifier", "HTTP " + i + " → UNKNOWN");
                                                    return FailureScenario.UNKNOWN;
                                                }
                                                z6b.k("FailureScenarioClassifier", "HTTP " + i + " (5xx) → SERVER_BACKOFF");
                                                return FailureScenario.SERVER_BACKOFF;
                                        }
                                    }
                                    z6b.k("FailureScenarioClassifier", "HTTP " + i + " → SERVER_BACKOFF");
                                    return FailureScenario.SERVER_BACKOFF;
                            }
                            break;
                    }
                    break;
            }
        }
        z6b.k("FailureScenarioClassifier", "HTTP " + i + " → APP_DATA_INVALID");
        return FailureScenario.APP_DATA_INVALID;
    }

    @NonNull
    public static FailureScenario d(int i) {
        if (i == 1 || i == 2) {
            z6b.k("FailureScenarioClassifier", "Local result code " + i + " → REQUEST_BUILD_FAILED");
            return FailureScenario.REQUEST_BUILD_FAILED;
        }
        if (i == 3) {
            z6b.k("FailureScenarioClassifier", "Local result code OUTPUT_JSON_ERROR → APP_DATA_INVALID");
            return FailureScenario.APP_DATA_INVALID;
        }
        if (i != 5) {
            return FailureScenario.UNKNOWN;
        }
        z6b.k("FailureScenarioClassifier", "Local result code NO_NETWORK → NO_NETWORK");
        return FailureScenario.NO_NETWORK;
    }

    @NonNull
    public static FailureScenario e(@Nullable j38 j38Var) {
        return (j38Var == null || j38Var.d()) ? FailureScenario.UNKNOWN : FailureScenario.PRECHECK_GATE_BLOCKED;
    }

    public static boolean f(@Nullable FailureScenario failureScenario) {
        if (failureScenario == null) {
            return false;
        }
        int i = a.a[failureScenario.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    public static boolean g(@NonNull Throwable th) {
        if ((th instanceof SSLPeerUnverifiedException) || (th instanceof CertificateException)) {
            return true;
        }
        String strJ = j(th);
        if (strJ != null) {
            return strJ.contains("cert") || strJ.contains("certificate") || strJ.contains("trust") || strJ.contains("certpathvalidator") || strJ.contains("expired") || strJ.contains("hostname") || strJ.contains("verify") || strJ.contains("pinning");
        }
        Throwable cause = th.getCause();
        return (cause == null || cause == th || !g(cause)) ? false : true;
    }

    public static boolean h(@NonNull Throwable th) {
        String strJ = j(th);
        if (strJ == null) {
            return false;
        }
        return strJ.contains("temporary failure in name resolution") || strJ.contains("try again") || strJ.contains("eai_again");
    }

    public static boolean i(@NonNull Throwable th) {
        String strJ = j(th);
        if (strJ == null) {
            return false;
        }
        return strJ.contains("connection reset") || strJ.contains("broken pipe") || strJ.contains("unexpected end of stream") || strJ.contains("unexpected eof") || strJ.contains("software caused connection abort") || strJ.contains("read error") || strJ.contains("write error");
    }

    @Nullable
    public static String j(@NonNull Throwable th) {
        String message = th.getMessage();
        if (message != null && !message.isEmpty()) {
            return message.toLowerCase();
        }
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return null;
        }
        return j(cause);
    }

    public static boolean k(@Nullable FailureScenario failureScenario) {
        return failureScenario == FailureScenario.APP_RATE_LIMITED || failureScenario == FailureScenario.SERVER_BACKOFF;
    }

    public static boolean l(@Nullable FailureScenario failureScenario) {
        return failureScenario == FailureScenario.REQUEST_BUILD_FAILED || failureScenario == FailureScenario.APP_DATA_INVALID || failureScenario == FailureScenario.APP_ID_REJECTED;
    }

    public static boolean m(@Nullable FailureScenario failureScenario) {
        return failureScenario == FailureScenario.HOST_UNRESOLVABLE || failureScenario == FailureScenario.CERTIFICATE_INVALID;
    }

    public static boolean n(@Nullable FailureScenario failureScenario) {
        return failureScenario == FailureScenario.NO_NETWORK || failureScenario == FailureScenario.PRECHECK_GATE_BLOCKED;
    }
}
