package com.heytap.accessory.file;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.heytap.accessory.logging.SdkLog;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes14.dex */
public class FTConnReceiver extends BroadcastReceiver {
    private static final String INTERNAL_FTREQUEST_ACTION = "com.heytap.accessory.ftconnection.internal";
    private String TAG = FTConnReceiver.class.getSimpleName();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        SdkLog.d(this.TAG, "onReceive");
        if (intent != null) {
            try {
                if (intent.getAction() != null && FileTransfer.ACTION_AFP_FILE_TRANSFER_REQUESTED.equalsIgnoreCase(intent.getAction())) {
                    SdkLog.i(this.TAG, "Intent action is " + intent.getAction());
                    String stringExtra = intent.getStringExtra("agentClass");
                    Log.d(this.TAG, "onReceive: implClass" + stringExtra);
                    FileTransfer streamTransfer = FileTransferManager.getStreamTransfer(stringExtra);
                    if (streamTransfer != null) {
                        streamTransfer.informIncomingFTRequest(context, intent);
                    } else {
                        Log.e(this.TAG, "onReceive:fileTransfer is null");
                    }
                }
            } catch (Exception unused) {
                SdkLog.e(this.TAG, "FTConnReceiver receive exception");
            }
        }
    }
}
