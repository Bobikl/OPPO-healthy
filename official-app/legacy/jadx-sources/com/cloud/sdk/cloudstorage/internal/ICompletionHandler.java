package com.cloud.sdk.cloudstorage.internal;

import com.cloud.sdk.cloudstorage.http.ResponseInfo;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/cloud/sdk/cloudstorage/internal/ICompletionHandler;", "", "complete", "", UTraceSQLiteHelperKt.COL_INFO, "Lcom/cloud/sdk/cloudstorage/http/ResponseInfo;", "data", "", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public interface ICompletionHandler {
    void complete(@NotNull ResponseInfo info, @Nullable byte[] data);
}
