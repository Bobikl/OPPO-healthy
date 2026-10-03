package com.cloud.sdk.cloudstorage.internal;

import java.io.IOException;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/cloud/sdk/cloudstorage/internal/ICancelHandler;", "", "isCancelled", "", "CancellationException", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public interface ICancelHandler {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/cloud/sdk/cloudstorage/internal/ICancelHandler$CancellationException;", "Ljava/io/IOException;", "()V", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
    public static final class CancellationException extends IOException {
    }

    boolean isCancelled();
}
