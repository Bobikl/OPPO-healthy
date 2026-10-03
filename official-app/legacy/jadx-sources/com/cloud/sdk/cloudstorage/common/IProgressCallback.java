package com.cloud.sdk.cloudstorage.common;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/cloud/sdk/cloudstorage/common/IProgressCallback;", "", "onProgress", "", "filePath", "", ParserTag.TAG_PERCENT, "", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public interface IProgressCallback {
    void onProgress(@NotNull String filePath, double percent);
}
