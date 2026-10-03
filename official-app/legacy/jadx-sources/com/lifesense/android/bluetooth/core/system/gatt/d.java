package com.lifesense.android.bluetooth.core.system.gatt;

import android.bluetooth.BluetoothGatt;
import android.os.Message;
import com.lifesense.android.bluetooth.core.bean.constant.CharacteristicStatus;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.bean.constant.DisconnectStatus;
import com.lifesense.android.bluetooth.core.system.gatt.common.e;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends com.lifesense.android.bluetooth.core.business.log.a {
    public abstract String getCurrentStatus();

    public abstract String getWriteCharacteristicStatus();

    public abstract boolean isEnableLogUpgradeFileAllData(UUID uuid, int i, byte[] bArr);

    public abstract void parseHandlerMessage(Message message);

    public abstract void postBluetoothGattCreated(BluetoothGatt bluetoothGatt);

    public abstract void postCancelConnectionRequest(DisconnectStatus disconnectStatus);

    public abstract void postCharacteristicActionStateChange(CharacteristicStatus characteristicStatus, UUID uuid, UUID uuid2);

    public abstract void postCharacteristicChange(UUID uuid, UUID uuid2, byte[] bArr);

    public abstract void postCharacteristicRead(UUID uuid, UUID uuid2, byte[] bArr);

    public abstract void postCharacteristicWrite(UUID uuid, UUID uuid2, byte[] bArr, com.lifesense.android.bluetooth.core.protocol.frame.c cVar);

    public abstract void postConnectionRequest(String str);

    public abstract void postConnectionTimeoutMessage();

    public abstract void postDeviceConnectStateChange(BluetoothGatt bluetoothGatt, DeviceConnectState deviceConnectState, int i, int i2);

    public abstract void postDeviceReconnectMessage();

    public abstract void postDeviceReconnectRequest(String str);

    public abstract void postDisableCharacteristicTimeout(com.lifesense.android.bluetooth.core.system.gatt.common.b bVar);

    public abstract void postEnableCharacteristicTimeout(com.lifesense.android.bluetooth.core.system.gatt.common.b bVar);

    public abstract void postGattServiceDiscovered(BluetoothGatt bluetoothGatt, int i, e eVar);

    public abstract void postReadCharacteristicTimeout(com.lifesense.android.bluetooth.core.system.gatt.common.b bVar);

    public abstract void postWriteCharacteristicTimeout(com.lifesense.android.bluetooth.core.system.gatt.common.b bVar);
}
