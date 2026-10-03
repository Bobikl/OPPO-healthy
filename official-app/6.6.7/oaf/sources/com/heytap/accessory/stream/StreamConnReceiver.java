package com.heytap.accessory.stream;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.heytap.accessory.logging.SdkLog;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class StreamConnReceiver extends BroadcastReceiver {
    public static final String INTERNAL_STREAM_REQUEST_ACTION = "com.heytap.accessory.streamconnection.internal";
    private String TAG = StreamConnReceiver.class.getSimpleName();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        SdkLog.d(this.TAG, "onReceive");
        if (intent != null) {
            try {
                if (intent.getAction() != null && StreamTransfer.ACTION_STREAM_TRANSFER_REQUESTED.equalsIgnoreCase(intent.getAction())) {
                    SdkLog.i(this.TAG, "Intent action is " + intent.getAction());
                    String stringExtra = intent.getStringExtra("agentClass");
                    SdkLog.d(this.TAG, "onReceive: implClass" + stringExtra);
                    StreamTransfer streamTransfer = StreamTransferManager.getStreamTransfer(stringExtra);
                    if (streamTransfer != null) {
                        streamTransfer.informIncomingSTRequest(context, intent);
                    } else {
                        SdkLog.e(this.TAG, "onReceive:streamTransfer is null");
                    }
                }
            } catch (Exception e) {
                SdkLog.e(this.TAG, "StreamConnReceiver receive exception:" + e);
            }
        }
    }
}
