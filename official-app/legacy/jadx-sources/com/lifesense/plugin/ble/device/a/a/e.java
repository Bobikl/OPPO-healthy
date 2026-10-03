package com.lifesense.plugin.ble.device.a.a;

import android.os.Bundle;
import android.os.Message;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSDevicePairSetting;
import com.lifesense.plugin.ble.data.LSProtocolType;

/* JADX INFO: loaded from: classes5.dex */
class e extends com.lifesense.plugin.ble.device.a.b {
    final /* synthetic */ d a;

    public e(d dVar) {
        this.a = dVar;
    }

    @Override // com.lifesense.plugin.ble.device.a.b
    public void a(LSDeviceInfo lSDeviceInfo, int i) {
        if (lSDeviceInfo != null && LSProtocolType.BPMStart.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) && lSDeviceInfo.getMacAddress() != null) {
            lSDeviceInfo.setBroadcastID(lSDeviceInfo.getMacAddress().replace(":", ""));
        }
        Message messageObtainMessage = this.a.q.obtainMessage();
        messageObtainMessage.obj = lSDeviceInfo;
        messageObtainMessage.arg1 = 8;
        messageObtainMessage.arg2 = i;
        this.a.q.sendMessage(messageObtainMessage);
    }

    @Override // com.lifesense.plugin.ble.device.a.b
    public void a(String str) {
        Message messageObtainMessage = this.a.q.obtainMessage();
        messageObtainMessage.obj = str;
        messageObtainMessage.arg1 = 21;
        this.a.q.sendMessage(messageObtainMessage);
    }

    @Override // com.lifesense.plugin.ble.device.a.b
    public void a(String str, LSDevicePairSetting lSDevicePairSetting) {
        Message messageObtainMessage = this.a.q.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putString("deviceMac", str);
        messageObtainMessage.setData(bundle);
        messageObtainMessage.obj = lSDevicePairSetting;
        messageObtainMessage.arg1 = 20;
        this.a.q.sendMessage(messageObtainMessage);
    }
}
