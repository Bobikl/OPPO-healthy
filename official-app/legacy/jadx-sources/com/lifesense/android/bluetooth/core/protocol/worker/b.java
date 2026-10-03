package com.lifesense.android.bluetooth.core.protocol.worker;

import com.lifesense.android.bluetooth.core.bean.constant.CharacteristicStatus;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.system.gatt.common.e;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public abstract void onCharacteristicChange(UUID uuid, UUID uuid2, byte[] bArr);

    public abstract void onCharacteristicRead(UUID uuid, UUID uuid2, byte[] bArr);

    public abstract void onCharacteristicStatusChange(CharacteristicStatus characteristicStatus, boolean z, UUID uuid, UUID uuid2);

    public abstract void onCharacteristicWrite(UUID uuid, UUID uuid2, byte[] bArr, com.lifesense.android.bluetooth.core.protocol.frame.c cVar);

    public abstract void onConnectionRequestNotify(String str);

    public abstract void onConnectionStateChange(String str, DeviceConnectState deviceConnectState);

    public abstract void onServicesDiscover(e eVar);
}
