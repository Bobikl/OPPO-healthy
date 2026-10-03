package com.cloud.sdk.cloudstorage.upload;

import android.annotation.SuppressLint;
import com.amap.api.maps.model.MyLocationStyle;
import com.cloud.sdk.cloudstorage.api.EapHttpClient;
import com.cloud.sdk.cloudstorage.common.ErrorInfo;
import com.cloud.sdk.cloudstorage.common.ICompleteCallback;
import com.cloud.sdk.cloudstorage.common.OCloudSdkOptions;
import com.cloud.sdk.cloudstorage.common.UploadRequest;
import com.cloud.sdk.cloudstorage.data.ServerConfigRepository;
import com.cloud.sdk.cloudstorage.http.ResponseInfo;
import com.cloud.sdk.cloudstorage.utils.ApkInfo;
import com.cloud.sdk.cloudstorage.utils.DeviceInfo;
import com.cloud.sdk.cloudstorage.utils.FileUtil;
import com.cloud.sdk.cloudstorage.utils.OcsLog;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u0011J\u0006\u0010\u001a\u001a\u00020\u0011J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0014H\u0002J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002J\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\tJ\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/cloud/sdk/cloudstorage/upload/CloudStorageManager;", "", "()V", "TAG", "", "requestQueue", "Ljava/util/concurrent/LinkedBlockingQueue;", "Lcom/cloud/sdk/cloudstorage/common/UploadRequest;", "sdkOptions", "Lcom/cloud/sdk/cloudstorage/common/OCloudSdkOptions;", "getSdkOptions$cloud_storage_sdk_release", "()Lcom/cloud/sdk/cloudstorage/common/OCloudSdkOptions;", "setSdkOptions$cloud_storage_sdk_release", "(Lcom/cloud/sdk/cloudstorage/common/OCloudSdkOptions;)V", "uploadWorker", "Lcom/cloud/sdk/cloudstorage/upload/UploadWorker;", "addUploadFile", "", "request", MyLocationStyle.ERROR_INFO, "Lcom/cloud/sdk/cloudstorage/common/ErrorInfo;", "requestList", "", "cancel", "filePath", "cancelAll", "cancelAllLow", "checkEnv", "checkUploadRequestInfo", "init", "options", "requestUploadConfigFail", UTraceSQLiteHelperKt.COL_INFO, "Lcom/cloud/sdk/cloudstorage/http/ResponseInfo;", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class CloudStorageManager {
    private static final String TAG = "CloudStorageManager";

    @SuppressLint({"StaticFieldLeak"})
    public static OCloudSdkOptions sdkOptions;
    private static UploadWorker uploadWorker;

    @NotNull
    public static final CloudStorageManager INSTANCE = new CloudStorageManager();
    private static final LinkedBlockingQueue<UploadRequest> requestQueue = new LinkedBlockingQueue<>();

    private CloudStorageManager() {
    }

    public static /* synthetic */ void addUploadFile$default(CloudStorageManager cloudStorageManager, UploadRequest uploadRequest, ErrorInfo errorInfo, int i, Object obj) throws InterruptedException {
        if ((i & 2) != 0) {
            errorInfo = cloudStorageManager.checkEnv();
        }
        cloudStorageManager.addUploadFile(uploadRequest, errorInfo);
    }

    private final ErrorInfo checkEnv() {
        synchronized (this) {
            UploadWorker uploadWorker2 = uploadWorker;
            if (uploadWorker2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uploadWorker");
            }
            if (uploadWorker2 != null) {
                Unit unit = Unit.INSTANCE;
                return null;
            }
            OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.upload.CloudStorageManager$checkEnv$1$1
                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "OCloudSDK must be initialized.";
                }
            });
            return new ErrorInfo(-102, "OCloudSDK must be initialized");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ErrorInfo checkUploadRequestInfo(final UploadRequest request) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        if (request == null) {
            objectRef.element = "Option is NULL";
            OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.upload.CloudStorageManager.checkUploadRequestInfo.1
                {
                    super(0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "getOptionExceptionMsg " + ((String) objectRef.element);
                }
            });
            return new ErrorInfo(-111, "invalid OCUploadOption: " + ((String) objectRef.element));
        }
        if (request.isValid()) {
            UploadWorker uploadWorker2 = uploadWorker;
            if (uploadWorker2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uploadWorker");
            }
            if (uploadWorker2.containRequest(request.getFilePath())) {
                return new ErrorInfo(ErrorInfo.OC_OPTION_ERROR_DUPLICATE_REQUEST, "duplicate UploadOption");
            }
            return null;
        }
        objectRef.element = "File path or callback is unavailable";
        OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.upload.CloudStorageManager.checkUploadRequestInfo.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "getOptionExceptionMsg " + ((String) objectRef.element) + ", file path=" + FileUtil.INSTANCE.mosaicEAPLogFileName(request.getFilePath());
            }
        });
        return new ErrorInfo(-111, "invalid OCUploadOption: " + ((String) objectRef.element));
    }

    private final void requestUploadConfigFail(final UploadRequest request, final ResponseInfo info) {
        ICompleteCallback completeCallback = request.getCompleteCallback();
        if (completeCallback != null) {
            String error = info.getError();
            if (error == null) {
                error = "unknown reason";
            }
            completeCallback.onComplete(request, 2, error, info);
        }
        OcsLog.INSTANCE.w(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.upload.CloudStorageManager.requestUploadConfigFail.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "uploadFailed, errCode= " + info.getStatusCode() + ", msg=" + info.getError() + ", path=" + FileUtil.INSTANCE.mosaicEAPLogFileName(request.getFilePath());
            }
        });
    }

    public final void addUploadFile(@NotNull List<UploadRequest> requestList) throws InterruptedException {
        Intrinsics.checkNotNullParameter(requestList, "requestList");
        if (requestList.isEmpty()) {
            OcsLog.INSTANCE.e(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.upload.CloudStorageManager.addUploadFile.1
                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "addUploadFile requestList is empty.";
                }
            });
            return;
        }
        ErrorInfo errorInfoCheckEnv = checkEnv();
        Iterator<UploadRequest> it = requestList.iterator();
        while (it.hasNext()) {
            addUploadFile(it.next(), errorInfoCheckEnv);
        }
    }

    public final void cancel(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        UploadWorker uploadWorker2 = uploadWorker;
        if (uploadWorker2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadWorker");
        }
        uploadWorker2.cancel(filePath);
    }

    public final void cancelAll() {
        UploadWorker uploadWorker2 = uploadWorker;
        if (uploadWorker2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadWorker");
        }
        uploadWorker2.cancelAll();
    }

    public final void cancelAllLow() {
        UploadWorker uploadWorker2 = uploadWorker;
        if (uploadWorker2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadWorker");
        }
        uploadWorker2.cancelAllLowTask();
    }

    @NotNull
    public final OCloudSdkOptions getSdkOptions$cloud_storage_sdk_release() {
        OCloudSdkOptions oCloudSdkOptions = sdkOptions;
        if (oCloudSdkOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sdkOptions");
        }
        return oCloudSdkOptions;
    }

    public final synchronized void init(@NotNull OCloudSdkOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Objects.requireNonNull(options);
        Objects.requireNonNull(options.getRegionMark());
        sdkOptions = options;
        if (options.getDeviceId() == null) {
            OCloudSdkOptions oCloudSdkOptions = sdkOptions;
            if (oCloudSdkOptions == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sdkOptions");
            }
            if (oCloudSdkOptions.getDeviceIdCallback() == null) {
                throw new IllegalArgumentException("Device id must be set");
            }
        }
        OcsLog ocsLog = OcsLog.INSTANCE;
        OCloudSdkOptions oCloudSdkOptions2 = sdkOptions;
        if (oCloudSdkOptions2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sdkOptions");
        }
        ocsLog.setLogHook$cloud_storage_sdk_release(oCloudSdkOptions2.getLogCallback());
        OCloudSdkOptions oCloudSdkOptions3 = sdkOptions;
        if (oCloudSdkOptions3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sdkOptions");
        }
        ocsLog.setVerbose$cloud_storage_sdk_release(oCloudSdkOptions3.getIsVerboseLog());
        DeviceInfo deviceInfo = DeviceInfo.INSTANCE;
        OCloudSdkOptions oCloudSdkOptions4 = sdkOptions;
        if (oCloudSdkOptions4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sdkOptions");
        }
        deviceInfo.init(oCloudSdkOptions4);
        ApkInfo.INSTANCE.init(options.getContext());
        UploadWorker uploadWorker2 = new UploadWorker(requestQueue, new ServerConfigRepository(EapHttpClient.INSTANCE.getConfigService()), 0, 4, null);
        uploadWorker = uploadWorker2;
        uploadWorker2.start();
    }

    public final void setSdkOptions$cloud_storage_sdk_release(@NotNull OCloudSdkOptions oCloudSdkOptions) {
        Intrinsics.checkNotNullParameter(oCloudSdkOptions, "<set-?>");
        sdkOptions = oCloudSdkOptions;
    }

    public final void addUploadFile(@NotNull UploadRequest request, @Nullable ErrorInfo errorInfo) throws InterruptedException {
        Intrinsics.checkNotNullParameter(request, "request");
        ErrorInfo errorInfoCheckUploadRequestInfo = checkUploadRequestInfo(request);
        if (errorInfoCheckUploadRequestInfo != null) {
            requestUploadConfigFail(request, errorInfoCheckUploadRequestInfo);
        } else if (errorInfo != null) {
            requestUploadConfigFail(request, errorInfo);
        } else {
            requestQueue.put(request);
        }
    }
}
