package com.heytap.accessory.accessorymanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.util.Log;
import com.heytap.accessory.bean.PeerAccessory;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public abstract class AccessoryStateChangedReceiver extends BroadcastReceiver {
    private static final String ACTION_ACCESSORY_CONNECTION_STATE_CHANGED = "com.heytap.accessory.device.action.ACCESSORY_CONNECTION_STATE_CHANGED";
    private static final int DEFAULT_ERROR_STATE = -1;
    private static final String EXTRA_ACCESSORY = "accessory";
    private static final String EXTRA_DEVICE_STATE = "deviceState";
    private static final String STATE_CHANGE_INTENT = "android.accessory.device.action.STATE_CHANGED";
    private static final String TAG = "AccessoryStateChangedReceiver";

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        Parcel parcel = null;
        PeerAccessory peerAccessoryCreateFromParcel = null;
        Parcel parcel2 = null;
        PeerAccessory peerAccessoryCreateFromParcel2 = null;
        if (STATE_CHANGE_INTENT.equalsIgnoreCase(intent.getAction())) {
            try {
                byte[] byteArray = intent.getExtras().getByteArray("accessory");
                if (byteArray == null) {
                    Log.e(TAG, "Parcel cannot be unmarshalled");
                    return;
                }
                Parcel parcelObtain = Parcel.obtain();
                if (parcelObtain != null) {
                    try {
                        parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                        parcelObtain.setDataPosition(0);
                        peerAccessoryCreateFromParcel2 = PeerAccessory.CREATOR.createFromParcel(parcelObtain);
                    } catch (Throwable th) {
                        th = th;
                        parcel = parcelObtain;
                        if (parcel != null) {
                            parcel.recycle();
                        }
                        throw th;
                    }
                }
                if (parcelObtain != null) {
                    parcelObtain.recycle();
                }
                int intExtra = intent.getIntExtra(EXTRA_DEVICE_STATE, -1);
                String str = TAG;
                Log.i(str, "State Change Intent Received with state:" + intExtra);
                if (intExtra != -1) {
                    onStateChanged(context, peerAccessoryCreateFromParcel2, intExtra);
                } else {
                    Log.e(str, "Invalid State Received");
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (!ACTION_ACCESSORY_CONNECTION_STATE_CHANGED.equalsIgnoreCase(intent.getAction())) {
                return;
            }
            try {
                byte[] byteArray2 = intent.getExtras().getByteArray("accessory");
                if (byteArray2 == null) {
                    Log.e(TAG, "Parcel cannot be unmarshalled");
                    return;
                }
                Parcel parcelObtain2 = Parcel.obtain();
                if (parcelObtain2 != null) {
                    try {
                        parcelObtain2.unmarshall(byteArray2, 0, byteArray2.length);
                        parcelObtain2.setDataPosition(0);
                        peerAccessoryCreateFromParcel = PeerAccessory.CREATOR.createFromParcel(parcelObtain2);
                    } catch (Throwable th3) {
                        th = th3;
                        parcel2 = parcelObtain2;
                        if (parcel2 != null) {
                            parcel2.recycle();
                        }
                        throw th;
                    }
                }
                if (parcelObtain2 != null) {
                    parcelObtain2.recycle();
                }
                int intExtra2 = intent.getIntExtra(EXTRA_DEVICE_STATE, -1);
                String str2 = TAG;
                Log.i(str2, "State Change Intent Received with state:" + intExtra2);
                if (intExtra2 != -1) {
                    onStateChanged(context, peerAccessoryCreateFromParcel, intExtra2);
                } else {
                    Log.e(str2, "Invalid State Received");
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public abstract void onStateChanged(Context context, PeerAccessory peerAccessory, int i);
}
