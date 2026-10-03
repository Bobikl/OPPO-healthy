package com.heytap.store.base.core.util.download;

import com.heytap.store.base.core.util.download.StoreDownloadTask;
import com.heytap.store.base.core.util.file.FileUtils;
import com.oplus.aiunit.vision.cuf;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/base/core/util/download/StoreDownloadTask;", "Lcom/heytap/store/base/core/util/download/DownLoadTask;", "Lcom/oplus/aiunit/vision/cuf;", "responseBody", "", "totalLength", "", "downloadNormalFile", "", "fileUrl", "isNeedBreakPointDownLoad", "Lcom/heytap/store/base/core/util/download/DownLoadTask$DownLoadListener;", "listener", "<init>", "(Ljava/lang/String;ZLcom/heytap/store/base/core/util/download/DownLoadTask$DownLoadListener;)V", "Core_release"}, k = 1, mv = {1, 6, 0})
public final class StoreDownloadTask extends DownLoadTask {
    public StoreDownloadTask(@Nullable String str, boolean z, @Nullable DownLoadTask.DownLoadListener<?> downLoadListener) {
        super(str, z, downLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: downloadNormalFile$lambda-0, reason: not valid java name */
    public static final void m4795downloadNormalFile$lambda0(StoreDownloadTask this$0, CommonSaveFileTask commonSaveFileTask, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.mIsCancel) {
            this$0.callDownLoadProgress(null, j2, j4);
        } else {
            commonSaveFileTask.cancel();
            this$0.callDownLoadFail(null, null);
        }
    }

    /* JADX INFO: renamed from: downloadNormalFile$lambda-1, reason: not valid java name */
    private static final void m4796downloadNormalFile$lambda1(StoreDownloadTask this$0, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.callDownLoadProgress(null, j2, j4);
    }

    @Override // com.heytap.store.base.core.util.download.DownLoadTask
    public boolean downloadNormalFile(@Nullable cuf responseBody, long totalLength) {
        String fileSavePath = this.fileSavePath;
        Intrinsics.checkNotNullExpressionValue(fileSavePath, "fileSavePath");
        if (!StringsKt__StringsJVMKt.endsWith$default(fileSavePath, ".pdf", false, 2, null)) {
            return super.downloadNormalFile(responseBody, totalLength);
        }
        Intrinsics.checkNotNull(responseBody);
        final long f10249l = responseBody.getContentLength();
        final CommonSaveFileTask commonSaveFileTaskNewInstance = CommonSaveFileTask.newInstance();
        this.fileSavePath = Intrinsics.stringPlus("Download/Store/", this.fileName);
        return commonSaveFileTaskNewInstance.save(responseBody.a(), FileUtils.getFileDescriptorW(FileUtils.createDownloadPathUri(this.fileName)), f10249l, new CommonSaveFileTask.ProgressHandler() { // from class: com.oplus.aiunit.vision.jvi
            @Override // com.heytap.store.base.core.util.download.CommonSaveFileTask.ProgressHandler
            public final void updateProgress(long j2, long j3) {
                StoreDownloadTask.m4795downloadNormalFile$lambda0(this.a, commonSaveFileTaskNewInstance, f10249l, j2, j3);
            }
        });
    }
}
