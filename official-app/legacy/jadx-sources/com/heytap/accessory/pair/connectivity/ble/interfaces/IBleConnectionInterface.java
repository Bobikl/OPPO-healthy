package com.heytap.accessory.pair.connectivity.ble.interfaces;

import com.heytap.accessory.pair.connectivity.param.message.FPBleMessageParam;

/* JADX INFO: loaded from: classes14.dex */
public interface IBleConnectionInterface {
    void close();

    int connect();

    String getRemoteDeviceName();

    boolean isConnectionProper();

    boolean write(byte[] bArr, FPBleMessageParam fPBleMessageParam);
}
