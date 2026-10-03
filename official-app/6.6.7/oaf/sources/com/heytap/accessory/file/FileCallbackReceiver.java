package com.heytap.accessory.file;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.heytap.accessory.file.model.MultiTransferErrorMsg;
import com.heytap.accessory.file.model.TransferCompleteMsg;
import com.heytap.accessory.file.model.TransferErrorMsg;
import com.heytap.accessory.file.model.TransferProgress;
import com.heytap.accessory.logging.SdkLog;
import org.json.JSONException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
class FileCallbackReceiver extends ResultReceiver {
    public static final String TAG = "FileCallbackReceiver";
    private FileTransfer.IFileTransferCallback mAppCallback;

    public FileCallbackReceiver(Handler handler, FileTransfer.IFileTransferCallback iFileTransferCallback) {
        super(handler);
        this.mAppCallback = iFileTransferCallback;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        String string = bundle.getString("CallBackJson");
        if (string != null) {
            switch (i) {
                case 99:
                    TransferProgress transferProgress = new TransferProgress();
                    try {
                        transferProgress.fromJSON(string);
                        long connectionId = transferProgress.getConnectionId();
                        int transactionId = transferProgress.getTransactionId();
                        SdkLog.i(TAG, "onReceiveResult mConnectionId:" + connectionId + " mTransactionId：" + transactionId);
                        this.mAppCallback.onTransferRequested(connectionId, transactionId, "");
                    } catch (Exception e) {
                        SdkLog.e(TAG, "RESULT_FILE_TRANSFER_SETUP_RSP Exception" + e);
                        return;
                    }
                    break;
                case 100:
                    TransferProgress transferProgress2 = new TransferProgress();
                    try {
                        transferProgress2.fromJSON(string);
                        this.mAppCallback.onProgressChanged(transferProgress2.getConnectionId(), transferProgress2.getTransactionId(), (int) transferProgress2.getProgress());
                    } catch (JSONException e2) {
                        SdkLog.e(TAG, "RESULT_FILE_TRANSFER_PROGRESS Exception" + e2);
                        return;
                    }
                    break;
                case 101:
                    TransferCompleteMsg transferCompleteMsg = new TransferCompleteMsg();
                    try {
                        SdkLog.i(TAG, "Transfer Complete:" + string);
                        transferCompleteMsg.fromJSON(string);
                        long connectionId2 = transferCompleteMsg.getConnectionId();
                        int transactionId2 = transferCompleteMsg.getTransactionId();
                        String sourcePath = transferCompleteMsg.getSourcePath();
                        String destPath = transferCompleteMsg.getDestPath();
                        long fileSize = transferCompleteMsg.getFileSize();
                        if (destPath.length() == 0) {
                            this.mAppCallback.onTransferCompleted(connectionId2, transactionId2, sourcePath, fileSize, 0);
                        } else {
                            this.mAppCallback.onTransferCompleted(connectionId2, transactionId2, destPath, fileSize, 0);
                        }
                    } catch (JSONException e3) {
                        SdkLog.e(TAG, "RESULT_FILE_TRANSFER_COMPLETE Exception" + e3);
                        return;
                    }
                    break;
                case 102:
                    SdkLog.e(TAG, "RESULT_FILE_TRANSFER_ERROR");
                    TransferErrorMsg transferErrorMsg = new TransferErrorMsg();
                    try {
                        transferErrorMsg.fromJSON(string);
                        this.mAppCallback.onTransferCompleted(transferErrorMsg.getConnectionId(), transferErrorMsg.getTransactionId(), null, 0L, transferErrorMsg.getErrorCode());
                    } catch (JSONException e4) {
                        SdkLog.e(TAG, "RESULT_FILE_TRANSFER_ERROR Exception" + e4);
                        return;
                    }
                    break;
                case 103:
                    SdkLog.e(TAG, "RESULT_FILE_TRANSFER_CANCEL_ALL");
                    MultiTransferErrorMsg multiTransferErrorMsg = new MultiTransferErrorMsg();
                    try {
                        multiTransferErrorMsg.fromJSON(string);
                        this.mAppCallback.onCancelAllCompleted(multiTransferErrorMsg.getTransactionIds(), multiTransferErrorMsg.getErrorCode());
                    } catch (JSONException e5) {
                        SdkLog.e(TAG, "RESULT_FILE_TRANSFER_CANCEL_ALL Exception" + e5);
                        return;
                    }
                    break;
                default:
                    SdkLog.e(TAG, "Wrong resultCode:" + i);
                    break;
            }
        }
    }
}
