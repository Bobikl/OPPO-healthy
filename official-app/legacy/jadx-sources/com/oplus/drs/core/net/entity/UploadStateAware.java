package com.oplus.drs.core.net.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oppo.obus.common.configmetadata.core.entity.AreaConfig;

/* JADX INFO: loaded from: classes6.dex */
public class UploadStateAware {
    public static final int HTTP_BAD_GATEWAY = 502;
    public static final int HTTP_BAD_REQUEST = 400;
    public static final int HTTP_BASE64_DECODE_FAILED = 444;
    public static final int HTTP_BODY_INVALID = 453;
    public static final int HTTP_DECOMPRESS_FAILED = 441;
    public static final int HTTP_DECRYPT_FAILED = 440;
    public static final int HTTP_DESERIALIZE_FAILED = 442;
    public static final int HTTP_FORBIDDEN = 403;
    public static final int HTTP_HQUEUE_WRITE_FAILED = 454;
    public static final int HTTP_INTERNAL_SERVER_ERROR = 500;
    public static final int HTTP_INVALID_PROTOCOL = 443;
    public static final int HTTP_INVALID_SOURCE_SDK_TYPE = 435;
    public static final int HTTP_KAFKA_CLUSTER_INIT_FAILED = 558;
    public static final int HTTP_METHOD_NOT_ALLOWED = 405;
    public static final int HTTP_NOT_DEFINED = 999;
    public static final int HTTP_NOT_ENOUGH_URL_PARAMS = 430;
    public static final int HTTP_NOT_FOUND = 404;
    public static final int HTTP_NO_BODY_FOUND = 452;
    public static final int HTTP_NO_BUSINESS_ERROR = 501;
    public static final int HTTP_NO_DECODE_BODY_FOUND = 455;
    public static final int HTTP_NO_HEAD_FOUND = 451;
    public static final int HTTP_NO_ROUTE_INFO = 536;
    public static final int HTTP_NO_SUITABLE_SENDER = 537;
    public static final int HTTP_PARSE_JSON_FAILED = 450;
    public static final int HTTP_PUSH_KAFKA_FAILED = 556;
    public static final int HTTP_PUSH_KAFKA_TIMEOUT = 557;
    public static final int HTTP_RATE_LIMIT = 429;
    public static final int HTTP_REQUEST_EXPIRED = 433;
    public static final int HTTP_SERVICE_FUSE = 507;
    public static final int HTTP_SERVICE_TIMEOUT = 509;
    public static final int HTTP_SERVICE_UNAVAILABLE = 503;
    public static final int HTTP_URL_APPID_INVALID = 432;
    public static final int HTTP_URL_SIGN_INVALID = 434;
    public static final int HTTP_URL_TIMESTAMP_INVALID = 431;
    public static final int INPUT_JSON_ERROR = 2;
    public static final int NETWORK_ERROR = 4;
    public static final int NO_APP_KEY_SECRET = 1;
    public static final int NO_NETWORK = 5;
    public static final int OUTPUT_JSON_ERROR = 3;
    public static final int SERVER_APP_ID_NOT_SUPPORTED = 536;
    public static final int SERVER_BUSINESS_ERROR = 7;
    public static final int SERVER_GATEWAY_ERROR = 6;
    public static final int SUCCESS = 200;
    private final boolean businessResponse;
    private final int code;
    private final AreaConfig data;

    @Nullable
    private final Throwable exception;
    private final int httpCode;
    private final long retryAfterMs;

    public UploadStateAware(int i, AreaConfig areaConfig) {
        this(i, areaConfig, 0, null, false, 0L);
    }

    public static UploadStateAware fail(int i) {
        return new UploadStateAware(i, null, 0, null, false, 0L);
    }

    public static UploadStateAware failWithHttpCode(int i, int i2) {
        return new UploadStateAware(i, null, i2, null, false, 0L);
    }

    public static UploadStateAware success(AreaConfig areaConfig) {
        return new UploadStateAware(200, areaConfig, 200, null, false, 0L);
    }

    public int getCode() {
        return this.code;
    }

    public AreaConfig getData() {
        return this.data;
    }

    @Nullable
    public Throwable getException() {
        return this.exception;
    }

    public int getHttpCode() {
        return this.httpCode;
    }

    public long getRetryAfterMs() {
        return this.retryAfterMs;
    }

    public boolean isBusinessResponse() {
        return this.businessResponse;
    }

    public boolean isServerError() {
        int i = this.httpCode;
        if (i <= 0) {
            i = this.code;
        }
        return i >= 500 && i < 600;
    }

    public boolean isSuccess() {
        return this.code == 200;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UploadStateAware{code=");
        sb.append(this.code);
        sb.append(", httpCode=");
        sb.append(this.httpCode);
        sb.append(", businessResponse=");
        sb.append(this.businessResponse);
        sb.append(", retryAfterMs=");
        sb.append(this.retryAfterMs);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", exception=");
        Throwable th = this.exception;
        sb.append(th != null ? th.getClass().getSimpleName() : "null");
        sb.append('}');
        return sb.toString();
    }

    public UploadStateAware(int i, AreaConfig areaConfig, int i2, @Nullable Throwable th, boolean z) {
        this(i, areaConfig, i2, th, z, 0L);
    }

    public static UploadStateAware fail(int i, @Nullable Throwable th) {
        return new UploadStateAware(i, null, 0, th, false, 0L);
    }

    public static UploadStateAware failWithHttpCode(int i, int i2, boolean z) {
        return new UploadStateAware(i, null, i2, null, z, 0L);
    }

    public UploadStateAware(int i, AreaConfig areaConfig, int i2, @Nullable Throwable th, boolean z, long j2) {
        this.code = i;
        this.data = areaConfig;
        this.httpCode = i2;
        this.exception = th;
        this.businessResponse = z;
        this.retryAfterMs = Math.max(0L, j2);
    }

    public static UploadStateAware failWithHttpCode(int i, int i2, boolean z, long j2) {
        return new UploadStateAware(i, null, i2, null, z, j2);
    }
}
