package com.cloud.sdk.cloudstorage.common;

import com.cloud.sdk.cloudstorage.http.ResponseInfo;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u001b\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/cloud/sdk/cloudstorage/common/ErrorInfo;", "Lcom/cloud/sdk/cloudstorage/http/ResponseInfo;", "errorCode", "", "message", "", "(ILjava/lang/String;)V", UTraceSQLiteHelperKt.COL_INFO, "(ILcom/cloud/sdk/cloudstorage/http/ResponseInfo;)V", "Companion", "ErrorCode", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class ErrorInfo extends ResponseInfo {
    public static final int ENV_ERROR_EMPTY_CONFIG = -104;
    public static final int ENV_ERROR_NOT_INIT = -102;
    public static final int ENV_ERROR_NO_HOST = -101;
    public static final int ENV_ERROR_NO_NETWORK = -103;
    public static final int OC_OPTION_ERROR_DIR = -113;
    public static final int OC_OPTION_ERROR_DUPLICATE_REQUEST = -112;
    public static final int OC_OPTION_ERROR_FILE_NOT_EXIST = -114;
    public static final int OC_OPTION_ERROR_REQUEST_HOST = -111;
    public static final int OC_OPTION_ERROR_USER_CANCEL = -116;
    public static final int OC_OPTION_ERROR_ZERO_SIZE = -115;
    public static final int UPLOAD_ERROR_BIG_B_PUT = -226;
    public static final int UPLOAD_ERROR_BIG_INIT_MULTIPART_UPLOAD = -223;
    public static final int UPLOAD_ERROR_BIG_MAKE_BLOCK = -224;
    public static final int UPLOAD_ERROR_BIG_UPLOAD_PART = -225;
    public static final int UPLOAD_ERROR_CHECK_UPLOAD_STATUS = -228;
    public static final int UPLOAD_ERROR_DELETE_OLD_FILE = -204;
    public static final int UPLOAD_ERROR_ENCRYPT_BODY = -203;
    public static final int UPLOAD_ERROR_HTTP_REQUEST = -221;
    public static final int UPLOAD_ERROR_HTTP_REQUEST_PRE = -222;
    public static final int UPLOAD_ERROR_ILLEGAL_HTTP_REQUEST = -211;
    public static final int UPLOAD_ERROR_UPDATE_SERVER_CONFIG = -201;
    public static final int UPLOAD_ERROR_UPDATE_TOKEN = -202;
    public static final int UPLOAD_ERROR_UPLOAD_COMPLETE = -227;

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/cloud/sdk/cloudstorage/common/ErrorInfo$ErrorCode;", "", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
    public @interface ErrorCode {
    }

    public ErrorInfo(int i, @Nullable String str) {
        super(i, new LinkedHashMap(), null, "", "", "", -1, 0L, 0L, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorInfo(int i, @NotNull ResponseInfo info) {
        super(i, info.getHeaders(), info.getBodyJsonObject(), info.getHost(), info.getPath(), info.getIp(), info.getPort(), info.getDuration(), info.getSent(), "[" + info.getStatusCode() + "] " + info.getError());
        Intrinsics.checkNotNullParameter(info, "info");
    }
}
