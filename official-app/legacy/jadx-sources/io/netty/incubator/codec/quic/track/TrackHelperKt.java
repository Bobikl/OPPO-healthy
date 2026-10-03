package io.netty.incubator.codec.quic.track;

import com.heytap.store.base.core.http.HttpUtils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010&\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\f\u0010'\u001a\u00020\u0003*\u00020(H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"APP_CODE", "", "CALL_EXCEPTION", "", "CARRIER", "CODE_PATH", "CONNECT_EXCEPTION", "CONNECT_MODE", "CONNECT_TIME", "CONN_INFO", "DEST_IP", "DNS_TIME", "DOMAIN", "FIRST_CALL_SUCCESS", "FIRST_CALL_TIME", "HTTP_CATEGORY", "LOCAL_IP_LIST", "METHOD", "MODEL", "NETWORK_CONNECTED", "NETWORK_LINK_ID", "NETWORK_TYPE", "OS_VERSION", "PACKAGE_NAME", "PORT", "PROTOCOL", "RECV_EXCEPTION", "RECV_INFO", "RECV_TIME", "REQUEST_TIME", "RESPONSE_CODE", "RETRY_COUNT", "RETRY_INFO", "SDK_VERSION", "SEND_EXCEPTION", "SEND_INFO", "SEND_TIME", "TLS_TIME", "jsonReplace", "type", "", "netty-quic_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TrackHelperKt {
    public static final int APP_CODE = 20214;

    @NotNull
    public static final String CALL_EXCEPTION = "call_exception";

    @NotNull
    public static final String CARRIER = "carrier";

    @NotNull
    public static final String CODE_PATH = "code_path";

    @NotNull
    public static final String CONNECT_EXCEPTION = "connect_exception";

    @NotNull
    public static final String CONNECT_MODE = "connect_mode";

    @NotNull
    public static final String CONNECT_TIME = "connect_time";

    @NotNull
    public static final String CONN_INFO = "conn_info";

    @NotNull
    public static final String DEST_IP = "dest_ip";

    @NotNull
    public static final String DNS_TIME = "dns_time";

    @NotNull
    public static final String DOMAIN = "domain";

    @NotNull
    public static final String FIRST_CALL_SUCCESS = "first_call_success";

    @NotNull
    public static final String FIRST_CALL_TIME = "first_call_time";

    @NotNull
    public static final String HTTP_CATEGORY = "10000";

    @NotNull
    public static final String LOCAL_IP_LIST = "local_ip_list";

    @NotNull
    public static final String METHOD = "method";

    @NotNull
    public static final String MODEL = "model";

    @NotNull
    public static final String NETWORK_CONNECTED = "network_connected";

    @NotNull
    public static final String NETWORK_LINK_ID = "10100";

    @NotNull
    public static final String NETWORK_TYPE = "network_type";

    @NotNull
    public static final String OS_VERSION = "os_version";

    @NotNull
    public static final String PACKAGE_NAME = "package_name";

    @NotNull
    public static final String PORT = "port";

    @NotNull
    public static final String PROTOCOL = "protocol";

    @NotNull
    public static final String RECV_EXCEPTION = "recv_exception";

    @NotNull
    public static final String RECV_INFO = "recv_info";

    @NotNull
    public static final String RECV_TIME = "recv_time";

    @NotNull
    public static final String REQUEST_TIME = "request_time";

    @NotNull
    public static final String RESPONSE_CODE = "response_code";

    @NotNull
    public static final String RETRY_COUNT = "retry_count";

    @NotNull
    public static final String RETRY_INFO = "retry_info";

    @NotNull
    public static final String SDK_VERSION = "sdk_version";

    @NotNull
    public static final String SEND_EXCEPTION = "send_exception";

    @NotNull
    public static final String SEND_INFO = "send_info";

    @NotNull
    public static final String SEND_TIME = "send_time";

    @NotNull
    public static final String TLS_TIME = "tls_time";

    @NotNull
    public static final String jsonReplace(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(str, ":", HttpUtils.EQUAL_SIGN, false, 4, (Object) null);
        if (strReplace$default == null) {
            return null;
        }
        return StringsKt__StringsJVMKt.replace$default(strReplace$default, ",", ";", false, 4, (Object) null);
    }

    @NotNull
    public static final String type(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StringBuilder sb = new StringBuilder();
        while (th != null) {
            sb.append(":");
            sb.append(th.getClass().getSimpleName());
            th = th.getCause();
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "type.toString()");
        return string;
    }
}
