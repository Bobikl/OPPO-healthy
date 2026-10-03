package com.heytap.accessory.stream;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.heytap.accessory.file.model.TransferProgress;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.stream.model.MultiTransferErrorMsg;
import com.heytap.accessory.stream.model.TransferErrorMsg;
import org.json.JSONException;

/* JADX INFO: loaded from: classes14.dex */
public class StreamCallbackReceiver extends ResultReceiver {
    public static final String COMPLETE_CONN_ID_KEY = "connectionId";
    public static final String COMPLETE_TRAN_ID_KEY = "transactionId";
    public static final int MULTI_TRANSFER_ERROR = 103;
    public static final int NORMAL_TRANSFER_ERROR = 102;
    private static final String TAG = "StreamCallbackReceiver";
    public static final int TRANSFER_COMPLETE = 101;
    private StreamTransfer.IStreamTransferCallback mAppCallback;

    public StreamCallbackReceiver(Handler handler, StreamTransfer.IStreamTransferCallback iStreamTransferCallback) {
        super(handler);
        this.mAppCallback = iStreamTransferCallback;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        String string = bundle.getString("CallBackJson");
        switch (i) {
            case 99:
                TransferProgress transferProgress = new TransferProgress();
                try {
                    transferProgress.fromJSON(string);
                    long connectionId = transferProgress.getConnectionId();
                    int transactionId = transferProgress.getTransactionId();
                    SdkLog.i(TAG, "onReceiveResult mConnectionId:" + connectionId + " mTransactionId:" + transactionId);
                    this.mAppCallback.onTransferRequested(connectionId, transactionId);
                } catch (Exception unused) {
                    SdkLog.w(TAG, "RESULT_FILE_TRANSFER_SETUP_RSP fromJSON Exception");
                }
                break;
            case 100:
            default:
                SdkLog.e(TAG, "Wrong resultCode");
                break;
            case 101:
                SdkLog.i(TAG, "Transfer Complete");
                this.mAppCallback.onTransferCompleted(bundle.getLong("connectionId"), bundle.getInt("transactionId"), 0);
                break;
            case 102:
                String str = TAG;
                SdkLog.e(str, "ST Error");
                TransferErrorMsg transferErrorMsg = new TransferErrorMsg();
                try {
                    transferErrorMsg.fromJSON(string);
                    long connectionId2 = transferErrorMsg.getConnectionId();
                    int transactionId2 = transferErrorMsg.getTransactionId();
                    int errorCode = transferErrorMsg.getErrorCode();
                    SdkLog.e(str, "ST Error:" + errorCode);
                    this.mAppCallback.onTransferCompleted(connectionId2, transactionId2, errorCode);
                } catch (JSONException unused2) {
                    SdkLog.w(TAG, "NORMAL_TRANSFER_ERROR fromJSON Exception");
                    return;
                }
                break;
            case 103:
                SdkLog.e(TAG, "ST Error");
                MultiTransferErrorMsg multiTransferErrorMsg = new MultiTransferErrorMsg();
                try {
                    multiTransferErrorMsg.fromJSON(string);
                    this.mAppCallback.onCancelAllCompleted(multiTransferErrorMsg.getTransactionIds(), multiTransferErrorMsg.getErrorCode());
                } catch (JSONException unused3) {
                    SdkLog.w(TAG, "MULTI_TRANSFER_ERROR fromJSON Exception");
                    return;
                }
                break;
        }
    }
}
