package com.heytap.accessory.pair.provider.bleserver.receiver;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.heytap.accessory.pair.logging.PairLog;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class ConnectionReceiver extends BroadcastReceiver {
    public static final int PAIRING_VARIANT_CONSENT = 3;
    private static final String TAG = "ConnectionReceiver";
    private OnConnectionCallback mCallback;

    public interface OnConnectionCallback {
        void onPassKeyGot(int i, BluetoothDevice bluetoothDevice);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if (intent.getAction().equals("android.bluetooth.device.action.PAIRING_REQUEST")) {
                abortBroadcast();
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", -1);
                int type = bluetoothDevice.getType();
                int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", 0);
                PairLog.d(TAG, "Receive PAIRING_REQUEST : " + bluetoothDevice.getName() + " , pin : " + intExtra2 + " , deviceType : " + type + " , pairType " + intExtra);
                if (intExtra == 2) {
                    this.mCallback.onPassKeyGot(intExtra2, bluetoothDevice);
                }
            } else if (intent.getAction().equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED")) {
                int intExtra3 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", -1);
                int intExtra4 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE", -1);
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                PairLog.d(TAG, "Receive CONNECTION_STATE_CHANGED : " + bluetoothDevice2.getName() + " , deviceType : " + bluetoothDevice2.getType() + " , pairType " + bluetoothDevice2.getType() + " , address " + bluetoothDevice2.getAddress() + " , bonded " + bluetoothDevice2.getBondState() + " , connect state " + intExtra3 + " , pre state " + intExtra4);
            } else if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                PairLog.d(TAG, "Receive STATE_CHANGED : state " + intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) + " , pre state " + intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1));
            }
        } catch (Exception e) {
            PairLog.e(TAG, "onReceive: ex " + e);
        }
    }

    public void setCallback(OnConnectionCallback onConnectionCallback) {
        this.mCallback = onConnectionCallback;
    }
}
