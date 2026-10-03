package com.oplus.aiunit.vision;

import com.heytap.accessory.connectivity.constant.ConnectConstant;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\"\u0014\u0010\u0003\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0005\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004\"#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"", "", "a", "NOT_OAF_ERROR", "I", "OAF_CODE_LEAK_PERMISSION", "", "Ljava/util/Map;", "getOaf_code_reason", "()Ljava/util/Map;", "oaf_code_reason", "oafhost_release"}, k = 2, mv = {1, 8, 0})
public final class nxa {
    public static final int NOT_OAF_ERROR = -1;
    public static final int OAF_CODE_LEAK_PERMISSION = -1141;

    @NotNull
    public static final Map<Integer, String> a;

    static {
        Pair pair = TuplesKt.to(-1010, "ERROR_AUTOCONNECT_CONNECTIVITY_NOT_SUPPORTED");
        Pair pair2 = TuplesKt.to(-1011, "ERROR_AUTOCONNECT_CONNECT_FAILED");
        Pair pair3 = TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_AUTOCONNECT_INVALID_MODE), "ERROR_AUTOCONNECT_INVALID_MODE");
        Pair pair4 = TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_ALREADY_ONGOING_CONNECTION), "ERROR_DISCOVERY_ALREADY_ONGOING_CONNECTION");
        Pair pair5 = TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_SELF_CREDENTIALS_FAILED), "ERROR_DISCOVERY_AUTHENTICATION_SELF_CREDENTIALS_FAILED");
        Pair pair6 = TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_PENDING_ERROR), "ERROR_DISCOVERY_AUTHENTICATION_PENDING_ERROR");
        Pair pair7 = TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_CHANNEL_AUTH_INVALID_STATE), "ERROR_CHANNEL_AUTH_INVALID_STATE");
        Pair pair8 = TuplesKt.to(-1104, "ERROR_DISCOVERY_BLE_ADAPTER_FAILED");
        Pair pair9 = TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_BLE_CREATE_STREAM_FAILED), "ERROR_DISCOVERY_BLE_CREATE_STREAM_FAILED");
        Pair pair10 = TuplesKt.to(-1107, "ERROR_DISCOVERY_BT_ADAPTER_FAILED");
        Pair pair11 = TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_BT_CLOSE_STREAM_FAILED), "ERROR_DISCOVERY_BT_CLOSE_STREAM_FAILED");
        Pair pair12 = TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_BT_CREATE_STREAM_FAILED), "ERROR_DISCOVERY_BT_CREATE_STREAM_FAILED");
        Pair pair13 = TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_BT_SOCKET_CONNECT_TIMEOUT), "ERROR_DISCOVERY_BT_SOCKET_CONNECT_TIMEOUT");
        Pair pair14 = TuplesKt.to(-1113, "ERROR_DISCOVERY_BT_SOCKET_CREATION_FAILED");
        Pair pair15 = TuplesKt.to(-1114, "ERROR_DISCOVERY_BT_SOCKET_LISTEN_FAILED");
        Pair pair16 = TuplesKt.to(-1115, "ERROR_DISCOVERY_BT_SOCKET_READ_FAILED");
        Pair pair17 = TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_BT_SOCKET_WRITE_FAILED), "ERROR_DISCOVERY_BT_SOCKET_WRITE_FAILED");
        Integer numValueOf = Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_CATEGORY_NOT_ALLOWED);
        a = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, TuplesKt.to(numValueOf, "ERROR_DISCOVERY_CATEGORY_NOT_ALLOWED"), TuplesKt.to(numValueOf, "ERROR_DISCOVERY_CATEGORY_NOT_ALLOWED"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_DEVICE_ALREADY_CONNECTED), "ERROR_DISCOVERY_DEVICE_ALREADY_CONNECTED"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_DEVICE_ALREADY_DISCONNECTED), "ERROR_DISCOVERY_DEVICE_ALREADY_DISCONNECTED"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_DEVICE_CONNECTION_IN_PROGRESS), "ERROR_DISCOVERY_DEVICE_CONNECTION_IN_PROGRESS"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_DEVICE_NOT_PAIRED), "ERROR_DISCOVERY_DEVICE_NOT_PAIRED"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_EXCEED_MAX_CONNECTIONS), "ERROR_DISCOVERY_EXCEED_MAX_CONNECTIONS"), TuplesKt.to(-1125, "ERROR_DISCOVERY_INVALID_INPUT_INVALID_DEVICE"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_VERSION_INCOMPATIBLE), "ERROR_DISCOVERY_VERSION_INCOMPATIBLE"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_ACCESSORY_FRAMEWORK_INCOMPATIBLE), "ERROR_DISCOVERY_ACCESSORY_FRAMEWORK_INCOMPATIBLE"), TuplesKt.to(257, "ACCESSORY_DISCONNECTED_NORMAL"), TuplesKt.to(258, "ACCESSORY_DISCONNECTED_NETWORK_FAILURE"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_REMOTE_CREDENTIALS_FAILED), "ERROR_DISCOVERY_AUTHENTICATION_REMOTE_CREDENTIALS_FAILED"), TuplesKt.to(-1106, "ERROR_DISCOVERY_BLE_SOCKET_CONNECT_FAILED"), TuplesKt.to(-1110, "ERROR_DISCOVERY_BT_SOCKET_CLOSE_FAILED"), TuplesKt.to(-1014, "ERROR_WIFIP2P_CONNECT_TIME_OUT"), TuplesKt.to(-1111, "ERROR_DISCOVERY_BT_SOCKET_CONNECT_FAILED"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_BT_SOCKET_READ_WRITE_FAILED), "ERROR_DISCOVERY_BT_SOCKET_READ_WRITE_FAILED"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_SELF_PEER_DESCRIPTION_FAILED), "ERROR_DISCOVERY_SELF_PEER_DESCRIPTION_FAILED"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_BLE_UNSUBSCRIBE), "ERROR_DISCOVERY_BLE_UNSUBSCRIBE"), TuplesKt.to(-1130, "ERROR_DISCOVERY_WIFI_SOCKET_HOST_UNREACHABLE"), TuplesKt.to(-1140, "ERROR_DISCOVERY_INSECURE_BT_AUTH_FAILED"), TuplesKt.to(Integer.valueOf(OAF_CODE_LEAK_PERMISSION), "ERROR_OAF_LEAK_PERMISSION"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_UNKNOWN_REASON), "ERROR_DISCOVERY_AUTHENTICATION_UNKNOWN_REASON"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_KSC_ERROR), "ERROR_DISCOVERY_AUTHENTICATION_KSC_ERROR"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_CHANNEL_AUTH_REACH_MAX_TRY), "ERROR_CHANNEL_AUTH_REACH_MAX_TRY"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_CHANNEL_AUTH_DISCONNECTED_UNEXPECTED), "ERROR_CHANNEL_AUTH_DISCONNECTED_UNEXPECTED"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_CHANNEL_AUTH_TIMEOUT), "ERROR_CHANNEL_AUTH_TIMEOUT"), TuplesKt.to(Integer.valueOf(ConnectConstant.ERROR_CHANNEL_AUTH_RESPONSE_INVALID), "ERROR_CHANNEL_AUTH_RESPONSE_INVALID"));
    }

    @NotNull
    public static final String a(int i) {
        return a.getOrDefault(Integer.valueOf(i), "oaf error not fond explain :" + i);
    }
}
