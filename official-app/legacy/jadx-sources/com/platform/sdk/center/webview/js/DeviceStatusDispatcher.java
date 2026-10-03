package com.platform.sdk.center.webview.js;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import android.util.SparseArray;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.provider.SMSCodeProvider;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class DeviceStatusDispatcher {
    private static final String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
    public static final String INTENT_ACTIVITY_RECEIVE_SMS = "android.provider.Telephony.SMS_RECEIVED";
    private static final String TAG = "DeviceStatusDispatcher";
    private static String mCurNetWorkType;
    private static DeviceStatusDispatcher sInstance;
    private static Object sLock = new Object();
    private Context mContext;
    private SparseArray<SMSReceiverParam> mDeviceSmsListeners;
    private boolean mInit;
    private a mReceiver;

    public interface DeviceSmsListener {
        void onSmsRCodeReceive(int i, String str);
    }

    @Keep
    public class SMSReceiverParam {
        public int codeLenght;
        public DeviceSmsListener listener;
        public int registerTag;

        public SMSReceiverParam(int i, int i2, DeviceSmsListener deviceSmsListener) {
            this.registerTag = i;
            this.codeLenght = i2;
            this.listener = deviceSmsListener;
        }
    }

    public static class a extends BroadcastReceiver {
        public final WeakReference<DeviceStatusDispatcher> a;

        public a(DeviceStatusDispatcher deviceStatusDispatcher) {
            this.a = new WeakReference<>(deviceStatusDispatcher);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean z;
            DeviceStatusDispatcher deviceStatusDispatcher;
            int i;
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            String action = intent.getAction();
            Object[] objArr = null;
            string = null;
            String string = null;
            if (!"android.provider.Telephony.SMS_RECEIVED".equals(action)) {
                if (DeviceStatusDispatcher.CONNECTIVITY_ACTION.equals(action)) {
                    DeviceStatusDispatcher.getNetWorkType(((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo());
                    z = true;
                }
                deviceStatusDispatcher = this.a.get();
                if (deviceStatusDispatcher != null || z || TextUtils.isEmpty(string)) {
                    return;
                }
                for (int i2 = 0; i2 < deviceStatusDispatcher.mDeviceSmsListeners.size(); i2++) {
                    SMSReceiverParam sMSReceiverParam = (SMSReceiverParam) deviceStatusDispatcher.mDeviceSmsListeners.valueAt(i2);
                    if (sMSReceiverParam != null && (i = sMSReceiverParam.codeLenght) > 0) {
                        sMSReceiverParam.listener.onSmsRCodeReceive(sMSReceiverParam.registerTag, SMSCodeProvider.getSMSCode(string, i));
                    }
                }
                return;
            }
            try {
                objArr = (Object[]) intent.getExtras().get("pdus");
            } catch (Exception e2) {
                UCLogUtil.e(DeviceStatusDispatcher.TAG, e2);
            }
            if (objArr == null) {
                string = "";
            } else {
                SmsMessage[] smsMessageArr = new SmsMessage[objArr.length];
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < objArr.length; i3++) {
                    SmsMessage smsMessageCreateFromPdu = SmsMessage.createFromPdu((byte[]) objArr[i3]);
                    smsMessageArr[i3] = smsMessageCreateFromPdu;
                    if (smsMessageCreateFromPdu != null && !TextUtils.isEmpty(smsMessageCreateFromPdu.getDisplayMessageBody())) {
                        sb.append(smsMessageArr[i3].getDisplayMessageBody());
                    }
                }
                string = sb.toString();
            }
            z = false;
            deviceStatusDispatcher = this.a.get();
            if (deviceStatusDispatcher != null) {
            }
        }
    }

    private DeviceStatusDispatcher(Context context) {
        if (this.mInit) {
            return;
        }
        this.mContext = context.getApplicationContext();
        this.mDeviceSmsListeners = new SparseArray<>();
        IntentFilter intentFilter = new IntentFilter(CONNECTIVITY_ACTION);
        intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
        a aVar = new a(this);
        this.mReceiver = aVar;
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(aVar, intentFilter);
        } else {
            context.registerReceiver(aVar, intentFilter, 2);
        }
        this.mInit = true;
    }

    public static DeviceStatusDispatcher getInstance(Context context) {
        synchronized (sLock) {
            if (sInstance == null) {
                sInstance = new DeviceStatusDispatcher(context.getApplicationContext());
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getNetWorkType(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isAvailable()) {
            setCurNetWorkType(com.heytap.store.base.core.util.DeviceStatusDispatcher.NetworkType.NETWORK_TYPE_NONE);
        }
        switch (networkInfo.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
                setCurNetWorkType(com.heytap.store.base.core.util.DeviceStatusDispatcher.NetworkType.NETWORK_TYPE_DATA);
                break;
            case 1:
            case 6:
                setCurNetWorkType(com.heytap.store.base.core.util.DeviceStatusDispatcher.NetworkType.NETWORK_TYPE_UNMETERED);
                break;
            default:
                setCurNetWorkType(com.heytap.store.base.core.util.DeviceStatusDispatcher.NetworkType.NETWORK_TYPE_NONE);
                break;
        }
    }

    private static void setCurNetWorkType(String str) {
        mCurNetWorkType = str;
    }

    public void destroy() {
        this.mContext.unregisterReceiver(this.mReceiver);
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
}
