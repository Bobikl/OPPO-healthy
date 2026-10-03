package com.heytap.store.base.core.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Keep;
import com.heytap.store.platform.tools.LogUtils;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceStatusDispatcher {
    private static final String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
    private static final String TAG = "DeviceStatusDispatcher";
    private static String mCurNetWorkType;
    private static DeviceStatusDispatcher sInstance;
    private static final Object sLock = new Object();
    private final Context mContext;
    private final ArrayList<DeviceNetworkStatusListener> mDeviceNetworkStatusListeners = new ArrayList<>();
    private final SparseArray<SMSReceiverParam> mDeviceSmsListeners = new SparseArray<>();
    private final Receiver mReceiver;

    public interface DeviceNetworkStatusListener {
        void onNetworkChanged(String str);
    }

    public interface DeviceSmsListener {
        void onSmsRCodeReceive(int i, String str);
    }

    public static class NetworkType {
        public static final String NETWORK_TYPE_DATA = "NETWORK_TYPE_DATA";
        public static final String NETWORK_TYPE_NONE = "NETWORK_TYPE_NONE";
        public static final String NETWORK_TYPE_UNMETERED = "NETWORK_TYPE_UNMETERED";
    }

    public static class Receiver extends BroadcastReceiver {
        private final WeakReference<DeviceStatusDispatcher> mRef;

        public Receiver(DeviceStatusDispatcher deviceStatusDispatcher) {
            this.mRef = new WeakReference<>(deviceStatusDispatcher);
        }

        private SmsMessage receiveSms(Intent intent) {
            if (intent == null) {
                return null;
            }
            Object[] objArr = (Object[]) intent.getExtras().get("pdus");
            SmsMessage[] smsMessageArr = new SmsMessage[objArr.length];
            for (Object obj : objArr) {
                SmsMessage smsMessageCreateFromPdu = SmsMessage.createFromPdu((byte[]) obj);
                smsMessageArr[0] = smsMessageCreateFromPdu;
                if (smsMessageCreateFromPdu != null && !TextUtils.isEmpty(smsMessageCreateFromPdu.getDisplayMessageBody())) {
                    return smsMessageArr[0];
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0074 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0076  */
        /* JADX WARN: Code duplicated, block: B:25:0x0084 A[LOOP:0: B:23:0x007e->B:25:0x0084, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:26:0x0092  */
        /* JADX WARN: Code duplicated, block: B:37:0x00c6 A[ORIG_RETURN, RETURN] */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SmsMessage smsMessageReceiveSms;
            boolean z;
            DeviceStatusDispatcher deviceStatusDispatcher;
            int i;
            Iterator it;
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            String action = intent.getAction();
            LogUtils.INSTANCE.i(DeviceStatusDispatcher.TAG, "DeviceStatusDispatcher.Receiver action=" + action);
            if (!"android.provider.Telephony.SMS_RECEIVED".equals(action)) {
                boolean zEquals = DeviceStatusDispatcher.CONNECTIVITY_ACTION.equals(action);
                smsMessageReceiveSms = null;
                if (zEquals) {
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                        switch (activeNetworkInfo.getType()) {
                            case 0:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                String unused = DeviceStatusDispatcher.mCurNetWorkType = NetworkType.NETWORK_TYPE_DATA;
                                break;
                            case 1:
                            case 6:
                                String unused2 = DeviceStatusDispatcher.mCurNetWorkType = NetworkType.NETWORK_TYPE_UNMETERED;
                                break;
                            default:
                                String unused3 = DeviceStatusDispatcher.mCurNetWorkType = NetworkType.NETWORK_TYPE_NONE;
                                break;
                        }
                    } else {
                        String unused4 = DeviceStatusDispatcher.mCurNetWorkType = NetworkType.NETWORK_TYPE_NONE;
                    }
                    z = true;
                }
                deviceStatusDispatcher = this.mRef.get();
                if (deviceStatusDispatcher != null) {
                    if (!z) {
                        if (smsMessageReceiveSms != null || TextUtils.isEmpty(smsMessageReceiveSms.getDisplayMessageBody())) {
                        }
                        for (int i2 = 0; i2 < deviceStatusDispatcher.mDeviceSmsListeners.size(); i2++) {
                            SMSReceiverParam sMSReceiverParam = (SMSReceiverParam) deviceStatusDispatcher.mDeviceSmsListeners.valueAt(i2);
                            if (sMSReceiverParam != null && (i = sMSReceiverParam.codeLenght) > 0) {
                                sMSReceiverParam.listener.onSmsRCodeReceive(sMSReceiverParam.registerTag, SMSCodeProvider.getSMSCode(smsMessageReceiveSms, i));
                            }
                        }
                        return;
                    }
                    it = deviceStatusDispatcher.mDeviceNetworkStatusListeners.iterator();
                    while (it.hasNext()) {
                        ((DeviceNetworkStatusListener) it.next()).onNetworkChanged(DeviceStatusDispatcher.mCurNetWorkType);
                    }
                }
            }
            smsMessageReceiveSms = receiveSms(intent);
            z = false;
            deviceStatusDispatcher = this.mRef.get();
            if (deviceStatusDispatcher != null) {
                if (!z) {
                    it = deviceStatusDispatcher.mDeviceNetworkStatusListeners.iterator();
                    while (it.hasNext()) {
                        ((DeviceNetworkStatusListener) it.next()).onNetworkChanged(DeviceStatusDispatcher.mCurNetWorkType);
                    }
                } else if (smsMessageReceiveSms != null) {
                }
            }
        }
    }

    @Keep
    public class SMSReceiverParam {
        public final int codeLenght;
        public final DeviceSmsListener listener;
        public final int registerTag;

        public SMSReceiverParam(int i, int i2, DeviceSmsListener deviceSmsListener) {
            this.registerTag = i;
            this.codeLenght = i2;
            this.listener = deviceSmsListener;
        }
    }

    private DeviceStatusDispatcher(Context context) {
        this.mContext = context.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter(CONNECTIVITY_ACTION);
        intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
        Receiver receiver = new Receiver(this);
        this.mReceiver = receiver;
        context.registerReceiver(receiver, intentFilter);
    }

    public static DeviceStatusDispatcher getInstance(Context context) {
        synchronized (sLock) {
            if (sInstance == null) {
                sInstance = new DeviceStatusDispatcher(context.getApplicationContext());
            }
        }
        return sInstance;
    }

    public void destroy() {
        this.mContext.unregisterReceiver(this.mReceiver);
    }

    public void register(DeviceNetworkStatusListener deviceNetworkStatusListener) {
        if (deviceNetworkStatusListener == null || this.mDeviceNetworkStatusListeners.contains(deviceNetworkStatusListener)) {
            return;
        }
        this.mDeviceNetworkStatusListeners.add(deviceNetworkStatusListener);
    }

    public void regitserSms(int i, int i2, DeviceSmsListener deviceSmsListener) {
        if (deviceSmsListener == null || i2 <= 0) {
            return;
        }
        this.mDeviceSmsListeners.append(i, new SMSReceiverParam(i, i2, deviceSmsListener));
    }

    public void unRegitserSms(int i) {
        this.mDeviceSmsListeners.delete(i);
    }

    public void unregister(DeviceNetworkStatusListener deviceNetworkStatusListener) {
        if (deviceNetworkStatusListener != null) {
            this.mDeviceNetworkStatusListeners.remove(deviceNetworkStatusListener);
        }
    }
}
