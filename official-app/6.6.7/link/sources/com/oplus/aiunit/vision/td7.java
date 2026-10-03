package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class td7 implements lw9<IWearableListener> {
    public final FileTransferTask a;

    public td7(FileTransferTask fileTransferTask) {
        this.a = fileTransferTask;
    }

    public static td7 a(FileTransferTask fileTransferTask) {
        return new td7(fileTransferTask);
    }

    @Override // com.oplus.aiunit.vision.lw9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void execute(IWearableListener iWearableListener) {
        if (iWearableListener == null) {
            return;
        }
        try {
            if (!this.a.isChecked() && this.a.isReceiveTask()) {
                iWearableListener.checkFileInfo(this.a);
                vd7.e().i(this.a.getTaskId(), this.a.getErrorCode());
            }
        } catch (RemoteException e) {
            uml.b("FileTransferCompleteTas", "receiveFileComplete RemoteException: " + e.getMessage());
        }
        try {
            iWearableListener.onTransferComplete(this.a);
        } catch (RemoteException e2) {
            uml.b("FileTransferCompleteTas", "onTransferComplete RemoteException: " + e2.getMessage());
        }
    }

    public String toString() {
        return "FileTransferCompleteTask{mFileTransferTask=" + this.a + '}';
    }
}
