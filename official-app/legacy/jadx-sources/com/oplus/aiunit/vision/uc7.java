package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: classes5.dex */
public class uc7 implements ev9<IWearableListener> {
    public FileTransferTask a;

    public uc7(FileTransferTask fileTransferTask) {
        this.a = fileTransferTask;
    }

    public static uc7 a(FileTransferTask fileTransferTask) {
        return new uc7(fileTransferTask);
    }

    @Override // com.oplus.aiunit.vision.ev9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void execute(IWearableListener iWearableListener) {
        if (iWearableListener == null) {
            return;
        }
        try {
            iWearableListener.onTransferProgress(this.a);
        } catch (RemoteException e2) {
            wil.b("FileTransferProgressTask", "onTransferProgress RemoteException: " + e2.getMessage());
        }
    }

    public String toString() {
        return "FileTransferProgressTask{mFileTransferTask=" + this.a + '}';
    }
}
