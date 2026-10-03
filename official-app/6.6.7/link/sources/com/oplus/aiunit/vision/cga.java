package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface cga {
    void checkFileInfo(FileTransferTask fileTransferTask);

    void onTransferComplete(FileTransferTask fileTransferTask);

    void onTransferProgress(FileTransferTask fileTransferTask);

    void onTransferRequested(FileTransferTask fileTransferTask);
}
