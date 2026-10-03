package com.cloud.sdk.cloudstorage.common;

import com.cloud.sdk.cloudstorage.upload.CloudStorageManager;
import com.cloud.sdk.cloudstorage.utils.OCConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0014"}, d2 = {"Lcom/cloud/sdk/cloudstorage/common/OCloudSyncAgent;", "", "()V", "addUploadFile", "", "fileRequest", "Lcom/cloud/sdk/cloudstorage/common/UploadRequest;", "fileRequests", "", "cancelAllLowUpload", "cancelAllUpload", "cancelUpload", "filePath", "", "getSdkVersion", "init", "options", "Lcom/cloud/sdk/cloudstorage/common/OCloudSdkOptions;", "pauseAllUpload", "pauseUpload", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class OCloudSyncAgent {

    @NotNull
    public static final OCloudSyncAgent INSTANCE = new OCloudSyncAgent();

    private OCloudSyncAgent() {
    }

    public final void addUploadFile(@NotNull List<UploadRequest> fileRequests) {
        Intrinsics.checkNotNullParameter(fileRequests, "fileRequests");
        CloudStorageManager.INSTANCE.addUploadFile(fileRequests);
    }

    public final void cancelAllLowUpload() {
        CloudStorageManager.INSTANCE.cancelAllLow();
    }

    public final void cancelAllUpload() {
        CloudStorageManager.INSTANCE.cancelAll();
    }

    public final void cancelUpload(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        CloudStorageManager.INSTANCE.cancel(filePath);
    }

    @NotNull
    public final String getSdkVersion() {
        return OCConstants.SDK_VERSION;
    }

    public final void init(@NotNull OCloudSdkOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        CloudStorageManager.INSTANCE.init(options);
    }

    @Deprecated(message = "The function has deprecated!", replaceWith = @ReplaceWith(expression = "OCloudSyncAgent.cancelAllUpload()", imports = {"com.cloud.sdk.cloudstorage.common.OCloudSyncAgent"}))
    public final void pauseAllUpload() {
        CloudStorageManager.INSTANCE.cancelAll();
    }

    @Deprecated(message = "The function has deprecated!", replaceWith = @ReplaceWith(expression = "OCloudSyncAgent.cancelUpload(filePath)", imports = {"com.cloud.sdk.cloudstorage.common.OCloudSyncAgent"}))
    public final void pauseUpload(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        CloudStorageManager.INSTANCE.cancel(filePath);
    }

    public final void addUploadFile(@NotNull UploadRequest fileRequest) {
        Intrinsics.checkNotNullParameter(fileRequest, "fileRequest");
        CloudStorageManager.addUploadFile$default(CloudStorageManager.INSTANCE, fileRequest, null, 2, null);
    }
}
