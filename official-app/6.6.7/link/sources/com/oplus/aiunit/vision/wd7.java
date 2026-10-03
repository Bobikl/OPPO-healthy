package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class wd7 implements lw9<IWearableListener> {
    public FileTransferTask a;

    public wd7(FileTransferTask fileTransferTask) {
        this.a = fileTransferTask;
    }

    public static wd7 a(FileTransferTask fileTransferTask) {
        return new wd7(fileTransferTask);
    }

    @Override // com.oplus.aiunit.vision.lw9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void execute(IWearableListener iWearableListener) {
        if (iWearableListener == null) {
            return;
        }
        try {
            iWearableListener.onTransferProgress(this.a);
        } catch (RemoteException e) {
            uml.b("FileTransferProgressTask", "onTransferProgress RemoteException: " + e.getMessage());
        }
    }

    public String toString() {
        return "FileTransferProgressTask{mFileTransferTask=" + this.a + '}';
    }
}
