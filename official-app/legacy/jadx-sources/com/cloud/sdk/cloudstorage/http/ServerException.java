package com.cloud.sdk.cloudstorage.http;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/cloud/sdk/cloudstorage/http/ServerException;", "", "()V", "Companion", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class ServerException {
    public static final int BAD_GATEWAY = 502;
    public static final int BAD_REQUEST = 400;
    public static final int FORBIDDEN = 403;
    public static final int INSUFFICIENT_STORAGE = 507;
    public static final int NOT_ACCEPTABLE = 406;
    public static final int NOT_FOUND = 404;
    public static final int PARAM_ERROR = 444;
    public static final int PARTIAL_CONTENT = 206;
    public static final int PUBLIC_KEY_EXPIRED = 222;
    public static final int RESULT_OK = 200;
    public static final int RSP_BODY_ERROR = 600;
    public static final int SERVER_ERROR = 500;
    public static final int SERVICE_BLOCK_PUT_FAILED = 599;
    public static final int SERVICE_READ_TIMEOUT = 598;
    public static final int SERVICE_UNAVAILABLE = 503;
    public static final int UNDEFINED = 0;
    private static final long serialVersionUID = 1;
}
