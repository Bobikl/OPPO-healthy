package com.cloud.sdk.cloudstorage.api;

import com.oplus.aiunit.vision.av1;
import com.oplus.aiunit.vision.m1e;
import com.oplus.aiunit.vision.oi8;
import com.oplus.aiunit.vision.xr2;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'J4\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¨\u0006\r"}, d2 = {"Lcom/cloud/sdk/cloudstorage/api/FileUploadService;", "", "", "", "headers", "Lcom/oplus/aiunit/vision/xr2;", "Lcom/cloud/sdk/cloudstorage/api/BusinessResponse;", "Lcom/cloud/sdk/cloudstorage/api/ServerFileInfo;", "createBigFileUploadTask", "Lcom/cloud/sdk/cloudstorage/api/CompleteTaskRequest;", "request", "Lcom/cloud/sdk/cloudstorage/api/CompleteTaskInfo;", "completeBigFileUploadTask", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public interface FileUploadService {
    @m1e("/log-service/v2/upload-complete")
    @NotNull
    xr2<BusinessResponse<CompleteTaskInfo>> completeBigFileUploadTask(@oi8 @NotNull Map<String, String> headers, @av1 @NotNull CompleteTaskRequest request);

    @m1e("/log-service/v2/init-multipart-upload")
    @NotNull
    xr2<BusinessResponse<ServerFileInfo>> createBigFileUploadTask(@oi8 @NotNull Map<String, String> headers);
}
