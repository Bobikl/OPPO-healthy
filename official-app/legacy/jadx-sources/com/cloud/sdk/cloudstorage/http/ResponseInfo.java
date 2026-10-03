package com.cloud.sdk.cloudstorage.http;

import io.netty.util.internal.StringUtil;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0016\u0018\u0000 22\u00020\u0001:\u00012B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0011J\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\"H\u0002J\u0006\u0010$\u001a\u00020\"J\u0006\u0010%\u001a\u00020\"J\b\u0010&\u001a\u00020\"H\u0002J\u0006\u0010'\u001a\u00020\"J\u0006\u0010(\u001a\u00020\"J\u0006\u0010)\u001a\u00020\"J\u0006\u0010*\u001a\u00020\"J\u0006\u0010+\u001a\u00020\"J\u0006\u0010,\u001a\u00020\"J\u0006\u0010-\u001a\u00020\"J\u0006\u0010.\u001a\u00020\"J\u0006\u0010/\u001a\u00020\"J\u0006\u00100\u001a\u00020\"J\b\u00101\u001a\u00020\u0006H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001e¨\u00063"}, d2 = {"Lcom/cloud/sdk/cloudstorage/http/ResponseInfo;", "", "statusCode", "", "headers", "", "", "bodyJsonObject", "Lorg/json/JSONObject;", "host", "path", "ip", "port", "duration", "", "sent", "error", "(ILjava/util/Map;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJLjava/lang/String;)V", "getBodyJsonObject", "()Lorg/json/JSONObject;", "getDuration", "()J", "getError", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getHost", "getIp", "getPath", "getPort", "()I", "getSent", "getStatusCode", "accessTokenExpire", "", "isBodyNotNull", "isConnectionBroken", "isDeleted", "isIoTypeTwo", "isNeedReUploadBlock", "isNeedUpdateConfig", "isNeedUpdateToken", "isNetworkBroken", "isOK", "isPaused", "isServerError", "isUnderTrafficLimit", "needRetry", "publicKeyExpire", "toString", "Companion", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public class ResponseInfo {
    public static final int AuthExpired = -9;
    public static final int Cancelled = -7;
    public static final int CannotConnectToHost = -1004;
    public static final int ConfigException = -1006;
    public static final int InvalidArgument = -4;
    public static final int InvalidFile = -3;
    public static final int InvalidFileSize = -10;
    public static final int InvalidToken = -5;
    public static final int NetworkConnectionLost = -1005;
    public static final int NetworkError = -1;
    public static final int Paused = -2;
    public static final int SyncStatusNoSupport = -11;
    public static final int TimedOut = -1001;
    public static final int TrafficLimit = -8;
    public static final int UnknownHost = -1003;
    public static final int ZeroSizeFile = -6;

    @Nullable
    private final JSONObject bodyJsonObject;
    private final long duration;

    @Nullable
    private final String error;

    @NotNull
    private final Map<String, String> headers;

    @Nullable
    private final String host;

    @Nullable
    private final String ip;

    @Nullable
    private final String path;
    private final int port;
    private final long sent;
    private final int statusCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "ResponseInfo";

    @NotNull
    private static final int[] ResponseCodes = {200, 222, 403, 500, 502, 503, 507, ServerException.SERVICE_READ_TIMEOUT};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/cloud/sdk/cloudstorage/http/ResponseInfo$Companion;", "", "()V", "AuthExpired", "", "Cancelled", "CannotConnectToHost", "ConfigException", "InvalidArgument", "InvalidFile", "InvalidFileSize", "InvalidToken", "NetworkConnectionLost", "NetworkError", "Paused", "ResponseCodes", "", "getResponseCodes", "()[I", "SyncStatusNoSupport", "TAG", "", "TimedOut", "TrafficLimit", "UnknownHost", "ZeroSizeFile", "deleted", "Lcom/cloud/sdk/cloudstorage/http/ResponseInfo;", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ResponseInfo deleted() {
            return new ResponseInfo(-7, new HashMap(), null, "", "", "", -1, 0L, 0L, "cancelled by user");
        }

        @NotNull
        public final int[] getResponseCodes() {
            return ResponseInfo.ResponseCodes;
        }
    }

    public ResponseInfo(int i, @NotNull Map<String, String> headers, @Nullable JSONObject jSONObject, @Nullable String str, @Nullable String str2, @Nullable String str3, int i2, long j2, long j3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.headers = headers;
        this.bodyJsonObject = jSONObject;
        this.statusCode = i == 507 ? -8 : i;
        this.host = str;
        this.path = str2;
        this.duration = j2;
        this.error = str4;
        this.ip = str3;
        this.port = i2;
        this.sent = j3;
    }

    private final boolean isBodyNotNull() {
        return this.bodyJsonObject != null;
    }

    private final boolean isIoTypeTwo() {
        Map<String, String> map = this.headers;
        return map != null && this.statusCode == 507 && map.get(HttpHeaders.LEVEL) != null && Intrinsics.areEqual(this.headers.get(HttpHeaders.LEVEL), "2");
    }

    public final boolean accessTokenExpire() {
        return this.statusCode == 403;
    }

    @Nullable
    public final JSONObject getBodyJsonObject() {
        return this.bodyJsonObject;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final String getHost() {
        return this.host;
    }

    @Nullable
    public final String getIp() {
        return this.ip;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public final int getPort() {
        return this.port;
    }

    public final long getSent() {
        return this.sent;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final boolean isConnectionBroken() {
        return this.statusCode == -1005;
    }

    public final boolean isDeleted() {
        return this.statusCode == -7;
    }

    public final boolean isNeedReUploadBlock() {
        int i = this.statusCode;
        return i == 598 || i == 599;
    }

    public final boolean isNeedUpdateConfig() {
        int i = this.statusCode;
        return i == 502 || i == 503 || isIoTypeTwo() || this.statusCode == 222;
    }

    public final boolean isNeedUpdateToken() {
        int i = this.statusCode;
        return i == 403 || i == -1005;
    }

    public final boolean isNetworkBroken() {
        int i = this.statusCode;
        return i == -1 || i == -1003 || i == -1004 || i == -1001 || i == -9 || i == -10;
    }

    public final boolean isOK() {
        return this.statusCode == 200 && !isUnderTrafficLimit();
    }

    public final boolean isPaused() {
        return this.statusCode == -2;
    }

    public final boolean isServerError() {
        return this.statusCode >= 500;
    }

    public final boolean isUnderTrafficLimit() {
        Map<String, String> map = this.headers;
        if (map == null || this.bodyJsonObject == null) {
            return false;
        }
        return (this.statusCode == -8 && map.get(HttpHeaders.SERVER_TIME) != null) || (this.statusCode == 200 && isBodyNotNull() && this.bodyJsonObject.optJSONObject("data") != null && this.bodyJsonObject.optJSONObject("data").optBoolean("ioLimit"));
    }

    public final boolean needRetry() {
        int i;
        return !isPaused() && (isNetworkBroken() || isServerError() || (i = this.statusCode) == 222 || i == 403 || i == -1005 || (i == 200 && this.error != null));
    }

    public final boolean publicKeyExpire() {
        return this.statusCode == 222;
    }

    @NotNull
    public String toString() {
        return "{sdkVersion:3.0.0, status:" + this.statusCode + ", host:" + this.host + ", path:" + this.path + StringUtil.COMMA + " mIp:" + this.ip + ", mPort:" + this.port + ", mDuration:" + this.duration + ", mSent:" + this.sent + ", mBody:" + this.bodyJsonObject + ", mError:" + this.error + '}';
    }

    public /* synthetic */ ResponseInfo(int i, Map map, JSONObject jSONObject, String str, String str2, String str3, int i2, long j2, long j3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, map, (i3 & 4) != 0 ? null : jSONObject, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? "" : str3, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? 0L : j2, (i3 & 256) != 0 ? 0L : j3, (i3 & 512) != 0 ? "" : str4);
    }
}
