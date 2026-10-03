package com.cloud.sdk.cloudstorage.utils;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/OCConstants;", "", "()V", "Companion", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class OCConstants {
    public static final int MAX_RETRY_TIME = 5;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = 2;
    public static final int RESULT_CODE_CANCEL = 3;
    public static final int RESULT_CODE_FAIL = 2;
    public static final int RESULT_CODE_PAUSE = 4;
    public static final int RESULT_CODE_SUCCESS = 1;

    @NotNull
    public static final String SDK_VERSION = "3.0.0";
}
