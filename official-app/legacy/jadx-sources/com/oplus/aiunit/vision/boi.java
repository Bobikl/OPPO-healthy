package com.oplus.aiunit.vision;

import com.client.platform.opensdk.pay.PayResponse;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"", "code", "", "a", "com.oplus.deepthinker.sdk_release"}, k = 2, mv = {1, 6, 0})
public final class boi {
    @NotNull
    public static final String a(int i) {
        if (i == 0) {
            return "NOT_IMPLEMENTED";
        }
        if (i == 1) {
            return "SUCCESS";
        }
        if (i == 2) {
            return "EVENT_NOT_AVAILABLE";
        }
        if (i == 4) {
            return "PID_REGISTER_LIMITED";
        }
        if (i == 8) {
            return "OS_VERSION_NOT_SUPPORT";
        }
        if (i == 16) {
            return "INVALID_PARAMETERS";
        }
        if (i == 32) {
            return "SERVER_INTERNAL_ERROR";
        }
        if (i == 64) {
            return "UNSUPPORTED_PARAMETERS";
        }
        if (i == 128) {
            return "BINDER_TRANSACTION_ERROR";
        }
        if (i == 256) {
            return "PERMISSION_NOT_GRANT";
        }
        switch (i) {
            case 501:
                return "TIMEOUT";
            case 502:
                return "INTERRUPTED";
            case 503:
                return "CANCELED";
            case 504:
                return "NOT_AVAILABLE";
            case 505:
                return "NOT_SUPPORTED";
            case 506:
                return "NOT_REGISTERED";
            case 507:
                return "REMOTE_EXCEPTION";
            default:
                switch (i) {
                    case 5001:
                        return "CAPABILITY_NOT_AVAILABLE";
                    case 5002:
                        return "CAPABILITY_NOT_REGISTERED";
                    case PayResponse.ERROR_PARAM_INVALID /* 5003 */:
                        return "CAPABILITY_NOT_SUBSCRIBED";
                    case PayResponse.ERROR_USER_NOT_EXISTS /* 5004 */:
                        return "CAPABILITY_REGISTERED_REPEAT";
                    case PayResponse.ERROR_AUTH_FAILED /* 5005 */:
                        return "FENCE_NOT_AVAILABLE";
                    case PayResponse.ERROR_MERCHANT_ORDERID_REPEAT /* 5006 */:
                        return "FENCE_NOT_REGISTERED";
                    case 5007:
                        return "FENCE_REGISTRATIONS_LIMIT";
                    case 5008:
                        return "FENCE_REGISTERED_REPEAT";
                    default:
                        return Intrinsics.stringPlus("unknown status code: ", Integer.valueOf(i));
                }
        }
    }
}
