package com.lifesense.android.bluetooth.core.system.broadcast;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.business.log.d;
import com.lifesense.android.bluetooth.core.business.sync.DeviceSyncCentre;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes4.dex */
public class b extends BroadcastReceiver {
    public com.lifesense.android.bluetooth.core.system.broadcast.a a;
    public Handler b;

    public class a implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Intent f8631c;

        public a(String str, Context context, Intent intent) {
            this.a = str;
            this.b = context;
            this.f8631c = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            if ("android.intent.action.SCREEN_ON".equalsIgnoreCase(this.a) || "android.intent.action.SCREEN_OFF".equalsIgnoreCase(this.a)) {
                b.this.a(this.b, this.a);
            } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equalsIgnoreCase(this.a)) {
                b.this.a(this.b, this.f8631c);
            } else {
                b.this.b(this.b, this.f8631c);
            }
        }
    }

    public b(com.lifesense.android.bluetooth.core.system.broadcast.a aVar) {
        if (aVar != null) {
            this.a = aVar;
        }
    }

    public void a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
        d.d().a(null, com.lifesense.android.bluetooth.core.business.log.report.a.Broadcast_Message, true, "bluetooth state change broadcast >> " + intExtra, null);
        com.lifesense.android.bluetooth.core.system.broadcast.a aVar = this.a;
        if (aVar != null) {
            aVar.a(intExtra);
        }
    }

    public void b(Context context, Intent intent) {
        String str;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        DeviceConnectState deviceConnectState = DeviceConnectState.UNKNOWN;
        String str2 = "";
        if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
            String str3 = "device is disconnected now,mac=" + bluetoothDevice.getAddress();
            deviceConnectState = DeviceConnectState.DISCONNECTED;
            com.lifesense.android.bluetooth.core.protocol.worker.a protocolHandler = DeviceSyncCentre.getInstance().getProtocolHandler(bluetoothDevice.getAddress().replaceAll(":", ""));
            if (protocolHandler != null) {
                protocolHandler.setDeviceConnect(deviceConnectState);
            }
            str = str3;
        } else {
            if ("android.bluetooth.device.action.ACL_CONNECTED".equals(intent.getAction())) {
                str2 = "connected success,mac=" + bluetoothDevice.getAddress();
                deviceConnectState = DeviceConnectState.CONNECTED_SUCCESS;
            } else if ("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED".equals(intent.getAction())) {
                str2 = "device is disconnect request now,mac=" + bluetoothDevice.getAddress();
                deviceConnectState = DeviceConnectState.DISCONNECT_REQUEST;
            } else if ("android.bluetooth.device.action.CLASS_CHANGED".equals(intent.getAction())) {
                bluetoothDevice.getAddress();
                return;
            } else if ("android.bluetooth.device.action.NAME_CHANGED".equals(intent.getAction())) {
                bluetoothDevice.getAddress();
                return;
            }
            str = str2;
        }
        if (DeviceConnectState.DISCONNECT_REQUEST == deviceConnectState || DeviceConnectState.DISCONNECTED == deviceConnectState || DeviceConnectState.CONNECTED_SUCCESS == deviceConnectState) {
            d.d().a(null, com.lifesense.android.bluetooth.core.business.log.report.a.Broadcast_Message, true, str, null);
        }
        com.lifesense.android.bluetooth.core.system.broadcast.a aVar = this.a;
        if (aVar != null) {
            aVar.a(bluetoothDevice, deviceConnectState);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (this.b == null) {
            this.b = DeviceSyncCentre.getInstance().getDeviceCentreHandler();
        }
        if (context == null || intent == null || this.b == null || (action = intent.getAction()) == null || action.length() == 0) {
            return;
        }
        try {
            this.b.post(new a(action, context, intent));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(Context context, String str) {
        d dVarD;
        com.lifesense.android.bluetooth.core.business.log.report.a aVar;
        String str2;
        boolean z;
        String str3;
        if ("android.intent.action.SCREEN_ON".equalsIgnoreCase(str)) {
            dVarD = d.d();
            aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Broadcast_Message;
            str2 = null;
            z = true;
            str3 = "Screen On";
        } else {
            if (!"android.intent.action.SCREEN_OFF".equalsIgnoreCase(str)) {
                return;
            }
            dVarD = d.d();
            aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Broadcast_Message;
            str2 = null;
            z = true;
            str3 = "Screen Off";
        }
        dVarD.a(str2, aVar, z, str3, null);
    }
}
