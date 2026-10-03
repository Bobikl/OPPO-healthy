package com.lifesense.plugin.ble.device.proto.A5;

import android.bluetooth.BluetoothGatt;
import com.lifesense.plugin.ble.a.a.u;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
class b extends com.lifesense.plugin.ble.device.proto.p {
    final /* synthetic */ a a;

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // com.lifesense.plugin.ble.device.proto.p
    public void a(BluetoothGatt bluetoothGatt, int i, int i2) {
        a aVar = this.a;
        aVar.printLogMessage(aVar.getGeneralLogInfo(aVar.o, "A5OtaPlugin.onMtuChanged:" + i + "; staus=" + i2, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        this.a.a(i - 3);
    }

    @Override // com.lifesense.plugin.ble.device.proto.p
    public void a(UUID uuid, UUID uuid2, byte[] bArr) {
        if (uuid == null || uuid2 == null || bArr == null) {
            return;
        }
        if (this.a.u) {
            a aVar = this.a;
            aVar.printLogMessage(aVar.getGeneralLogInfo(aVar.o, "onCharacteristicChange.Task canceled", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        } else if (uuid.equals(com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_SERVICE_UUID)) {
            this.a.a(uuid, uuid2, bArr);
        }
    }

    @Override // com.lifesense.plugin.ble.device.proto.p
    public void a(UUID uuid, UUID uuid2, byte[] bArr, u uVar) {
        if (uuid == null || uuid2 == null) {
            return;
        }
        if (this.a.u) {
            a aVar = this.a;
            aVar.printLogMessage(aVar.getGeneralLogInfo(aVar.o, "onCharacteristicWrite.Task canceled", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        } else if (uuid.equals(com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_SERVICE_UUID)) {
            this.a.a(bArr, uuid2);
        }
    }
}
