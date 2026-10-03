package com.cloud.sdk.cloudstorage.api;

import com.oplus.aiunit.vision.av1;
import com.oplus.aiunit.vision.m1e;
import com.oplus.aiunit.vision.oi8;
import com.oplus.aiunit.vision.xr2;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\nH'J0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\rH'¨\u0006\u0010"}, d2 = {"Lcom/cloud/sdk/cloudstorage/api/CloudService;", "", "", "", "headers", "Lcom/cloud/sdk/cloudstorage/api/AccessTokenRequest;", "request", "Lcom/oplus/aiunit/vision/xr2;", "Lcom/cloud/sdk/cloudstorage/api/AccessTokenResponse;", "fetchAccessToken", "Lcom/cloud/sdk/cloudstorage/api/ServerInfoRequest;", "Lcom/cloud/sdk/cloudstorage/api/ServerInfoResponse;", "fetchServerInfo", "Lcom/cloud/sdk/cloudstorage/api/DltFileRequest;", "Lcom/cloud/sdk/cloudstorage/api/DltFileResponse;", "deleteCacheFile", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public interface CloudService {
    @m1e("/logservice/v1/delete")
    @NotNull
    xr2<DltFileResponse> deleteCacheFile(@oi8 @NotNull Map<String, String> headers, @av1 @NotNull DltFileRequest request);

    @m1e("/logservice/v1/get_access_token")
    @NotNull
    xr2<AccessTokenResponse> fetchAccessToken(@oi8 @NotNull Map<String, String> headers, @av1 @NotNull AccessTokenRequest request);

    @m1e("/logservice/v1/get_common_conf")
    @NotNull
    xr2<ServerInfoResponse> fetchServerInfo(@oi8 @NotNull Map<String, String> headers, @av1 @NotNull ServerInfoRequest request);
}
