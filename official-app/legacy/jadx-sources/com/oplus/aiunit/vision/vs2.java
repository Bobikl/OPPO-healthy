package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpUtils;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\f\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0000\"\u0014\u0010\u0005\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006\"\u0014\u0010\f\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006\"\u0014\u0010\u000e\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006\"\u0014\u0010\u0010\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006\"\u0014\u0010\u0011\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006\"\u0014\u0010\u0012\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006\"\u0014\u0010\u0014\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006\"\u0014\u0010\u0015\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006\"\u0014\u0010\u0016\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006\"\u0014\u0010\u0017\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006\"\u0014\u0010\u0018\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006\"\u0014\u0010\u0019\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006\"\u0014\u0010\u001a\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006\"\u0014\u0010\u001b\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006\"\u0014\u0010\u001c\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006\"\u0014\u0010\u001d\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006\"\u0014\u0010\u001e\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006\"\u0014\u0010\u001f\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006\"\u0014\u0010 \u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006\"\u0014\u0010!\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006\"\u0014\u0010\"\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006\"\u0014\u0010#\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006\"\u0014\u0010$\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006\"\u0014\u0010%\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0006\"\u0014\u0010&\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0006\"\u0014\u0010'\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0006\"\u0014\u0010(\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0006\"\u0014\u0010)\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0006\"\u0014\u0010*\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0006\"\u0014\u0010+\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0006\"\u0014\u0010,\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0006\"\u0014\u0010-\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0006\"\u0014\u0010.\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0006\"\u0014\u0010/\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0006\"\u0014\u00100\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0006\"\u0014\u00101\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0006\"\u0014\u00102\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0006\"\u0014\u00103\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0006\"\u0014\u00105\u001a\u0002048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00107\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0006\"\u0014\u00108\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0006\"\u0014\u00109\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0006\"\u0014\u0010:\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0006\"\u0014\u0010;\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0006\"\u0014\u0010<\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0006\"\u0014\u0010=\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0006\"\u0014\u0010>\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0006\"\u0014\u0010?\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u0006¨\u0006@"}, d2 = {"", "", "c", "a", "b", "DOMAIN", "Ljava/lang/String;", "PATH", "DEST_IP", "METHOD", "PROTOCOL", "PACKAGE_NAME", "SDK_VERSION", "OS_VERSION", "NETWORK_CONNECTED", "NETWORK_TYPE", "CARRIER", "MODEL", "DNS_TIME", "CONNECT_TIME", "TLS_TIME", "WRITE_HEADER_TIME", "WRITE_BODY_TIME", "READ_HEADER_TIME", "READ_BODY_TIME", "REQUEST_TIME", "RTT_COST", "CONNECT_TIME_LIST", "TLS_TIME_LIST", "WRITE_HEADER_TIME_LIST", "WRITE_BODY_TIME_LIST", "READ_HEADER_TIME_LIST", "READ_BODY_TIME_LIST", "REQUEST_TIME_LIST", "CALL_TIME", "REQUEST_BODY_SIZE", "CALL_EXCEPTION", "RESPONSE_BODY_SIZE", "TOTAL_FAILED_IP_COUNT", "CONN_EXTRA", "RETRY_EXTRA", "TOTAL_CONNECT_COUNT", "RETRY_COUNT", "IS_REUSE", "IS_RACE", "CALL_SUCCESS", "RESPONSE_CODE", "CDN_INFO", "ACQUIRED_TIME", "TLS_VERSION", "TLS_RESUME", "TAP_GLSB_KEY", "", "APP_CODE", "I", "HTTP_CATEGORY", "HTTP_EVENT_ID", "HTTP_DN_UNIT_FAIL", "HTTP_BODY_FAIL", "QUIC_EVENT_ID", "QUIC_BODY_ID", "HTTP_BODY_ID", "HTTP_DNS_ID", "NETWORK_LINK_ID", "okhttp4_extension_release"}, k = 2, mv = {1, 4, 0})
public final class vs2 {

    @NotNull
    public static final String ACQUIRED_TIME = "acquired_time";
    public static final int APP_CODE = 20214;

    @NotNull
    public static final String CALL_EXCEPTION = "call_exception";

    @NotNull
    public static final String CALL_SUCCESS = "call_success";

    @NotNull
    public static final String CALL_TIME = "call_time";

    @NotNull
    public static final String CARRIER = "carrier";

    @NotNull
    public static final String CDN_INFO = "X-IP-Source";

    @NotNull
    public static final String CONNECT_TIME = "connect_time";

    @NotNull
    public static final String CONNECT_TIME_LIST = "connect_time_list";

    @NotNull
    public static final String CONN_EXTRA = "conn_extra";

    @NotNull
    public static final String DEST_IP = "dest_ip";

    @NotNull
    public static final String DNS_TIME = "dns_time";

    @NotNull
    public static final String DOMAIN = "domain";

    @NotNull
    public static final String HTTP_BODY_FAIL = "10007";

    @NotNull
    public static final String HTTP_BODY_ID = "10010";

    @NotNull
    public static final String HTTP_CATEGORY = "10000";

    @NotNull
    public static final String HTTP_DNS_ID = "10011";

    @NotNull
    public static final String HTTP_DN_UNIT_FAIL = "10006";

    @NotNull
    public static final String HTTP_EVENT_ID = "10001";

    @NotNull
    public static final String IS_RACE = "is_race";

    @NotNull
    public static final String IS_REUSE = "is_reuse";

    @NotNull
    public static final String METHOD = "method";

    @NotNull
    public static final String MODEL = "model";

    @NotNull
    public static final String NETWORK_CONNECTED = "network_connected";

    @NotNull
    public static final String NETWORK_LINK_ID = "10012";

    @NotNull
    public static final String NETWORK_TYPE = "network_type";

    @NotNull
    public static final String OS_VERSION = "os_version";

    @NotNull
    public static final String PACKAGE_NAME = "package_name";

    @NotNull
    public static final String PATH = "path";

    @NotNull
    public static final String PROTOCOL = "protocol";

    @NotNull
    public static final String QUIC_BODY_ID = "10009";

    @NotNull
    public static final String QUIC_EVENT_ID = "10008";

    @NotNull
    public static final String READ_BODY_TIME = "read_body_time";

    @NotNull
    public static final String READ_BODY_TIME_LIST = "read_body_time_list";

    @NotNull
    public static final String READ_HEADER_TIME = "read_header_time";

    @NotNull
    public static final String READ_HEADER_TIME_LIST = "read_header_time_list";

    @NotNull
    public static final String REQUEST_BODY_SIZE = "request_body_size";

    @NotNull
    public static final String REQUEST_TIME = "request_time";

    @NotNull
    public static final String REQUEST_TIME_LIST = "request_time_list";

    @NotNull
    public static final String RESPONSE_BODY_SIZE = "response_body_size";

    @NotNull
    public static final String RESPONSE_CODE = "response_code";

    @NotNull
    public static final String RETRY_COUNT = "retry_count";

    @NotNull
    public static final String RETRY_EXTRA = "retry_extra";

    @NotNull
    public static final String RTT_COST = "rtt_cost";

    @NotNull
    public static final String SDK_VERSION = "sdk_version";

    @NotNull
    public static final String TAP_GLSB_KEY = "tap_glsb_key";

    @NotNull
    public static final String TLS_RESUME = "tls_resume";

    @NotNull
    public static final String TLS_TIME = "tls_time";

    @NotNull
    public static final String TLS_TIME_LIST = "tls_time_list";

    @NotNull
    public static final String TLS_VERSION = "tls_version";

    @NotNull
    public static final String TOTAL_CONNECT_COUNT = "total_conn_count";

    @NotNull
    public static final String TOTAL_FAILED_IP_COUNT = "total_failed_ip_count";

    @NotNull
    public static final String WRITE_BODY_TIME = "write_body_time";

    @NotNull
    public static final String WRITE_BODY_TIME_LIST = "write_body_time_list";

    @NotNull
    public static final String WRITE_HEADER_TIME = "write_header_time";

    @NotNull
    public static final String WRITE_HEADER_TIME_LIST = "write_header_time_list";

    @NotNull
    public static final String a(@NotNull Throwable detail) throws JSONException {
        Intrinsics.checkNotNullParameter(detail, "$this$detail");
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("name", detail.getClass().getName());
        jSONObject.accumulate("message", detail.getMessage());
        Throwable cause = detail.getCause();
        jSONObject.accumulate("cause_name", cause != null ? cause.getClass().getName() : null);
        Throwable cause2 = detail.getCause();
        jSONObject.accumulate("cause_message", cause2 != null ? cause2.getMessage() : null);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "oj.toString()");
        return string;
    }

    @NotNull
    public static final String b(@NotNull String jsonReplace) {
        Intrinsics.checkNotNullParameter(jsonReplace, "$this$jsonReplace");
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(jsonReplace, ":", HttpUtils.EQUAL_SIGN, false, 4, (Object) null);
        if (strReplace$default != null) {
            return StringsKt__StringsJVMKt.replace$default(strReplace$default, ",", ";", false, 4, (Object) null);
        }
        return null;
    }

    @NotNull
    public static final String c(@NotNull Throwable type) {
        Intrinsics.checkNotNullParameter(type, "$this$type");
        StringBuilder sb = new StringBuilder();
        while (type != null) {
            sb.append(":");
            sb.append(type.getClass().getSimpleName());
            type = type.getCause();
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "type.toString()");
        return string;
    }
}
