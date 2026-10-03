package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: classes5.dex */
public class rc7 implements ev9<IWearableListener> {
    public final FileTransferTask a;

    public rc7(FileTransferTask fileTransferTask) {
        this.a = fileTransferTask;
    }

    public static rc7 a(FileTransferTask fileTransferTask) {
        return new rc7(fileTransferTask);
    }

    @Override // com.oplus.aiunit.vision.ev9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void execute(IWearableListener iWearableListener) {
        if (iWearableListener == null) {
            return;
        }
        try {
            if (!this.a.isChecked() && this.a.isReceiveTask()) {
                iWearableListener.checkFileInfo(this.a);
                tc7.e().i(this.a.getTaskId(), this.a.getErrorCode());
            }
        } catch (RemoteException e2) {
            wil.b("FileTransferCompleteTas", "receiveFileComplete RemoteException: " + e2.getMessage());
        }
        try {
            iWearableListener.onTransferComplete(this.a);
        } catch (RemoteException e3) {
            wil.b("FileTransferCompleteTas", "onTransferComplete RemoteException: " + e3.getMessage());
        }
    }

    public String toString() {
        return "FileTransferCompleteTask{mFileTransferTask=" + this.a + '}';
    }
}
