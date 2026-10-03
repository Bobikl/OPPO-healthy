package com.lifesense.plugin.ble.a;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import com.heytap.store.base.core.http.HttpUtils;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.device.a.a.u;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes5.dex */
public class h extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f8684c;
    private g a;
    private Handler b;

    public h(g gVar) {
        if (gVar != null) {
            this.a = gVar;
        }
    }

    public void a(Context context, Intent intent) {
        String str;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        LSConnectState lSConnectState = LSConnectState.Unknown;
        if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
            str = "device is disconnected now,mac=" + bluetoothDevice.getAddress();
            lSConnectState = LSConnectState.Disconnect;
        } else if ("android.bluetooth.device.action.ACL_CONNECTED".equals(intent.getAction())) {
            str = "connected success,mac=" + bluetoothDevice.getAddress();
            lSConnectState = LSConnectState.ConnectSuccess;
        } else if ("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED".equals(intent.getAction())) {
            str = "device is disconnect request now,mac=" + bluetoothDevice.getAddress();
            lSConnectState = LSConnectState.RequestDisconnect;
        } else if ("android.bluetooth.device.action.CLASS_CHANGED".equals(intent.getAction())) {
            bluetoothDevice.getAddress();
            return;
        } else {
            if ("android.bluetooth.device.action.NAME_CHANGED".equals(intent.getAction())) {
                bluetoothDevice.getAddress();
                return;
            }
            str = "";
        }
        String str2 = str;
        if (LSConnectState.RequestDisconnect == lSConnectState || LSConnectState.Disconnect == lSConnectState || LSConnectState.ConnectSuccess == lSConnectState) {
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Broadcast_Message, true, str2, null);
        }
        g gVar = this.a;
        if (gVar != null) {
            gVar.a(bluetoothDevice, lSConnectState);
        }
    }

    public void b(Context context, Intent intent) {
        StringBuilder sb;
        String str;
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
        String string = "bluetooth state change broadcast >> " + intExtra + HttpUtils.EQUAL_SIGN;
        if (intExtra == 0) {
            sb = new StringBuilder();
            sb.append(string);
            str = DeviceInfoCompat.DeviceState.DISCONNECTED;
        } else if (intExtra == 1) {
            sb = new StringBuilder();
            sb.append(string);
            str = DeviceInfoCompat.DeviceState.CONNECTING;
        } else if (intExtra == 2) {
            sb = new StringBuilder();
            sb.append(string);
            str = DeviceInfoCompat.DeviceState.CONNECTED;
        } else if (intExtra != 3) {
            switch (intExtra) {
                case 10:
                    sb = new StringBuilder();
                    sb.append(string);
                    str = DebugKt.DEBUG_PROPERTY_VALUE_OFF;
                    break;
                case 11:
                    sb = new StringBuilder();
                    sb.append(string);
                    str = "turning on";
                    break;
                case 12:
                    sb = new StringBuilder();
                    sb.append(string);
                    str = "on";
                    break;
                case 13:
                    sb = new StringBuilder();
                    sb.append(string);
                    str = "turning off";
                    break;
            }
        } else {
            sb = new StringBuilder();
            sb.append(string);
            str = "disconnecting";
        }
        sb.append(str);
        string = sb.toString();
        String str2 = string;
        Log.e("LS-BLE", str2);
        com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Broadcast_Message, true, str2, null);
        g gVar = this.a;
        if (gVar != null) {
            gVar.a(intExtra);
        }
        g gVar2 = f8684c;
        if (gVar2 != null) {
            gVar2.a(intExtra);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (this.b == null) {
            this.b = u.a().h();
        }
        if (context == null || intent == null || this.b == null || (action = intent.getAction()) == null || action.length() == 0) {
            return;
        }
        try {
            this.b.post(new i(this, action, context, intent));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        String str2;
        if ("android.intent.action.SCREEN_ON".equalsIgnoreCase(str)) {
            str2 = "Screen On";
        } else if (!"android.intent.action.SCREEN_OFF".equalsIgnoreCase(str)) {
            return;
        } else {
            str2 = "Screen Off";
        }
        com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Broadcast_Message, true, str2, null);
    }

    public static void a(g gVar) {
        f8684c = gVar;
    }
}
