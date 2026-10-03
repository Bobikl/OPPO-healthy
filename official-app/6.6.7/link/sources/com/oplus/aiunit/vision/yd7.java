package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class yd7 implements lw9<IWearableListener> {
    public FileTransferTask a;

    public yd7(FileTransferTask fileTransferTask) {
        this.a = fileTransferTask;
    }

    public static yd7 a(FileTransferTask fileTransferTask) {
        return new yd7(fileTransferTask);
    }

    @Override // com.oplus.aiunit.vision.lw9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void execute(IWearableListener iWearableListener) {
        if (iWearableListener == null) {
            return;
        }
        try {
            iWearableListener.onTransferRequested(this.a);
        } catch (RemoteException e) {
            uml.b("FileTransferRequestTask", "onTransferRequested Exception : " + e.getMessage());
        }
    }

    public String toString() {
        return "FileTransferRequestTask{mFileTransferTask=" + this.a + '}';
    }
}
