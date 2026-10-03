package com.cloud.sdk.cloudstorage.api;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/cloud/sdk/cloudstorage/api/CloudServerException;", "Lcom/cloud/sdk/cloudstorage/api/ApiException;", "apiType", "Lcom/cloud/sdk/cloudstorage/api/ApiType;", "code", "", "message", "", "(Lcom/cloud/sdk/cloudstorage/api/ApiType;ILjava/lang/String;)V", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class CloudServerException extends ApiException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudServerException(@NotNull ApiType apiType, int i, @NotNull String message) {
        super(apiType, i, message, null);
        Intrinsics.checkNotNullParameter(apiType, "apiType");
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
