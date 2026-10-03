package com.lifesense.plugin.ble.device.a.a;

import android.os.Bundle;
import android.os.Message;
import com.lifesense.plugin.ble.OnSettingListener;
import com.lifesense.plugin.ble.data.LSUpgradeState;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
class k extends com.lifesense.plugin.ble.device.a.b {
    final /* synthetic */ g a;

    public k(g gVar) {
        this.a = gVar;
    }

    @Override // com.lifesense.plugin.ble.device.a.b
    public void a(com.lifesense.plugin.ble.device.proto.q qVar, String str, int i, int i2) {
        String hexString = Integer.toHexString(this.a.L);
        OnSettingListener onSettingListenerA = this.a.a(str, hexString);
        if (LSUpgradeState.UpgradeFailure.getValue() == i || LSUpgradeState.UpgradeSuccess.getValue() == i || LSUpgradeState.VerifyFailure.getValue() == i) {
            this.a.L = 0;
        }
        if (onSettingListenerA != null) {
            onSettingListenerA.onStateChanged(str, i, i2);
            return;
        }
        g gVar = this.a;
        gVar.printLogMessage(gVar.getGeneralLogInfo(str, "failed to callback statChanged,no listener=" + hexString + "; status=" + i, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
    }

    @Override // com.lifesense.plugin.ble.device.a.b
    public synchronized void b(String str, int i) {
        String hexString = Integer.toHexString(i);
        Message messageObtainMessage = this.a.y.obtainMessage();
        messageObtainMessage.arg1 = 3;
        Bundle bundle = new Bundle();
        bundle.putString("mac", str);
        bundle.putString("pushCmd", hexString);
        messageObtainMessage.setData(bundle);
        this.a.y.sendMessage(messageObtainMessage);
    }

    @Override // com.lifesense.plugin.ble.device.a.b
    public void a(String str, int i) {
        String hexString = Integer.toHexString(this.a.L);
        OnSettingListener onSettingListenerA = this.a.a(str, hexString);
        if (onSettingListenerA != null) {
            onSettingListenerA.onProgressUpdate(str, i);
            return;
        }
        g gVar = this.a;
        gVar.printLogMessage(gVar.getGeneralLogInfo(str, "failed to callback onUpgradeProgress,no listener=" + hexString + "; value=" + i, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
    }

    @Override // com.lifesense.plugin.ble.device.a.b
    public synchronized void a(String str, int i, int i2) {
        String hexString = Integer.toHexString(i);
        Message messageObtainMessage = this.a.y.obtainMessage();
        messageObtainMessage.arg1 = 4;
        Bundle bundle = new Bundle();
        bundle.putString("mac", str);
        bundle.putString("pushCmd", hexString);
        bundle.putInt("errorCode", i2);
        messageObtainMessage.setData(bundle);
        this.a.y.sendMessage(messageObtainMessage);
    }

    @Override // com.lifesense.plugin.ble.device.a.b
    public synchronized void a(String str, com.lifesense.plugin.ble.device.ancs.b bVar, com.lifesense.plugin.ble.device.ancs.a aVar) {
        try {
            if (aVar == null) {
                g gVar = this.a;
                gVar.printLogMessage(gVar.getGeneralLogInfo(str, "failed to cancel message timeout,undefined.", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            } else {
                this.a.b(aVar.g(), aVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.lifesense.plugin.ble.device.a.b
    public synchronized void a(String str, byte[] bArr, UUID uuid, UUID uuid2, String str2) {
        Message messageObtainMessage = this.a.y.obtainMessage();
        messageObtainMessage.arg1 = 2;
        Bundle bundle = new Bundle();
        bundle.putString("mac", str);
        bundle.putByteArray("data", bArr);
        bundle.putString("cmdVersion", str2);
        messageObtainMessage.setData(bundle);
        this.a.y.sendMessage(messageObtainMessage);
    }
}
