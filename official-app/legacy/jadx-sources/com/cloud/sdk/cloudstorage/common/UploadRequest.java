package com.cloud.sdk.cloudstorage.common;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0005J\u0006\u0010&\u001a\u00020$J\u0006\u0010\u0018\u001a\u00020\u000eJ\u0006\u0010'\u001a\u00020\u000eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/cloud/sdk/cloudstorage/common/UploadRequest;", "", "filePath", "", "priority", "", "PprogressCallback", "Lcom/cloud/sdk/cloudstorage/common/IProgressCallback;", "PcompleteCallback", "Lcom/cloud/sdk/cloudstorage/common/ICompleteCallback;", "PcheckUploadStatus", "Lcom/cloud/sdk/cloudstorage/common/ICheckUploadStatus;", "requestId", "needWeak", "", "(Ljava/lang/String;ILcom/cloud/sdk/cloudstorage/common/IProgressCallback;Lcom/cloud/sdk/cloudstorage/common/ICompleteCallback;Lcom/cloud/sdk/cloudstorage/common/ICheckUploadStatus;IZ)V", "checkUploadStatus", "getCheckUploadStatus", "()Lcom/cloud/sdk/cloudstorage/common/ICheckUploadStatus;", "completeCallback", "getCompleteCallback", "()Lcom/cloud/sdk/cloudstorage/common/ICompleteCallback;", "getFilePath", "()Ljava/lang/String;", "isCancel", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getNeedWeak", "()Z", "getPriority", "()I", "progressCallback", "getProgressCallback", "()Lcom/cloud/sdk/cloudstorage/common/IProgressCallback;", "getRequestId", "retryTimes", "cancel", "", "getRetryTime", "incRetryTime", "isValid", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class UploadRequest {

    @Nullable
    private final ICheckUploadStatus checkUploadStatus;

    @Nullable
    private final ICompleteCallback completeCallback;

    @NotNull
    private final String filePath;
    private AtomicBoolean isCancel;
    private final boolean needWeak;
    private final int priority;

    @Nullable
    private final IProgressCallback progressCallback;
    private final int requestId;
    private int retryTimes;

    @JvmOverloads
    public UploadRequest(@NotNull String str) {
        this(str, 0, null, null, null, 0, false, 126, null);
    }

    public final void cancel() {
        this.isCancel.getAndSet(true);
    }

    @Nullable
    public final ICheckUploadStatus getCheckUploadStatus() {
        return this.checkUploadStatus;
    }

    @Nullable
    public final ICompleteCallback getCompleteCallback() {
        return this.completeCallback;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    public final boolean getNeedWeak() {
        return this.needWeak;
    }

    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final IProgressCallback getProgressCallback() {
        return this.progressCallback;
    }

    public final int getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: getRetryTime, reason: from getter */
    public final int getRetryTimes() {
        return this.retryTimes;
    }

    public final void incRetryTime() {
        this.retryTimes++;
    }

    public final boolean isCancel() {
        return this.isCancel.get();
    }

    public final boolean isValid() {
        String str = this.filePath;
        if ((str == null || StringsKt__StringsJVMKt.isBlank(str)) || this.checkUploadStatus == null) {
            return false;
        }
        int i = this.priority;
        return i == 1 || i == 2;
    }

    @JvmOverloads
    public UploadRequest(@NotNull String str, int i) {
        this(str, i, null, null, null, 0, false, 124, null);
    }

    @JvmOverloads
    public UploadRequest(@NotNull String str, int i, @Nullable IProgressCallback iProgressCallback) {
        this(str, i, iProgressCallback, null, null, 0, false, 120, null);
    }

    @JvmOverloads
    public UploadRequest(@NotNull String str, int i, @Nullable IProgressCallback iProgressCallback, @Nullable ICompleteCallback iCompleteCallback) {
        this(str, i, iProgressCallback, iCompleteCallback, null, 0, false, 112, null);
    }

    @JvmOverloads
    public UploadRequest(@NotNull String str, int i, @Nullable IProgressCallback iProgressCallback, @Nullable ICompleteCallback iCompleteCallback, @Nullable ICheckUploadStatus iCheckUploadStatus) {
        this(str, i, iProgressCallback, iCompleteCallback, iCheckUploadStatus, 0, false, 96, null);
    }

    @JvmOverloads
    public UploadRequest(@NotNull String str, int i, @Nullable IProgressCallback iProgressCallback, @Nullable ICompleteCallback iCompleteCallback, @Nullable ICheckUploadStatus iCheckUploadStatus, int i2) {
        this(str, i, iProgressCallback, iCompleteCallback, iCheckUploadStatus, i2, false, 64, null);
    }

    @JvmOverloads
    public UploadRequest(@NotNull String filePath, int i, @Nullable IProgressCallback iProgressCallback, @Nullable ICompleteCallback iCompleteCallback, @Nullable ICheckUploadStatus iCheckUploadStatus, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.priority = i;
        this.requestId = i2;
        this.needWeak = z;
        this.progressCallback = z ? (IProgressCallback) new WeakReference(iProgressCallback).get() : iProgressCallback;
        this.completeCallback = z ? (ICompleteCallback) new WeakReference(iCompleteCallback).get() : iCompleteCallback;
        this.checkUploadStatus = z ? (ICheckUploadStatus) new WeakReference(iCheckUploadStatus).get() : iCheckUploadStatus;
        this.isCancel = new AtomicBoolean(false);
    }

    public /* synthetic */ UploadRequest(String str, int i, IProgressCallback iProgressCallback, ICompleteCallback iCompleteCallback, ICheckUploadStatus iCheckUploadStatus, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 2 : i, (i3 & 4) != 0 ? null : iProgressCallback, (i3 & 8) != 0 ? null : iCompleteCallback, (i3 & 16) == 0 ? iCheckUploadStatus : null, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) == 0 ? z : false);
    }
}
