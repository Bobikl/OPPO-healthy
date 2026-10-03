package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: classes5.dex */
public interface uea {
    void checkFileInfo(FileTransferTask fileTransferTask);

    void onTransferComplete(FileTransferTask fileTransferTask);

    void onTransferProgress(FileTransferTask fileTransferTask);

    void onTransferRequested(FileTransferTask fileTransferTask);
}
