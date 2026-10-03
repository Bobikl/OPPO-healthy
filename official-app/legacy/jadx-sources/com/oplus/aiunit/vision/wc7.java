package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: classes5.dex */
public class wc7 implements ev9<IWearableListener> {
    public FileTransferTask a;

    public wc7(FileTransferTask fileTransferTask) {
        this.a = fileTransferTask;
    }

    public static wc7 a(FileTransferTask fileTransferTask) {
        return new wc7(fileTransferTask);
    }

    @Override // com.oplus.aiunit.vision.ev9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void execute(IWearableListener iWearableListener) {
        if (iWearableListener == null) {
            return;
        }
        try {
            iWearableListener.onTransferRequested(this.a);
        } catch (RemoteException e2) {
            wil.b("FileTransferRequestTask", "onTransferRequested Exception : " + e2.getMessage());
        }
    }

    public String toString() {
        return "FileTransferRequestTask{mFileTransferTask=" + this.a + '}';
    }
}
