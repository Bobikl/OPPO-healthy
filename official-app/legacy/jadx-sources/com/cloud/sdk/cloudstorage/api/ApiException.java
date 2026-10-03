package com.cloud.sdk.cloudstorage.api;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/cloud/sdk/cloudstorage/api/ApiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "apiType", "Lcom/cloud/sdk/cloudstorage/api/ApiType;", "code", "", "message", "", "(Lcom/cloud/sdk/cloudstorage/api/ApiType;ILjava/lang/String;)V", "getApiType", "()Lcom/cloud/sdk/cloudstorage/api/ApiType;", "getCode", "()I", "Lcom/cloud/sdk/cloudstorage/api/CloudServerException;", "Lcom/cloud/sdk/cloudstorage/api/HttpException;", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public abstract class ApiException extends Exception {

    @NotNull
    private final ApiType apiType;
    private final int code;

    private ApiException(ApiType apiType, int i, String str) {
        super(str);
        this.apiType = apiType;
        this.code = i;
    }

    @NotNull
    public final ApiType getApiType() {
        return this.apiType;
    }

    public final int getCode() {
        return this.code;
    }

    public /* synthetic */ ApiException(ApiType apiType, int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiType, i, str);
    }
}
