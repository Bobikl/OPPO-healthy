package com.heytap.accessory.pair.provider.bleserver.pairing;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbsConnection {
    public static final int CONNECTION_PAIR_TYPE_BLE = 3;
    public static final int CONNECTION_PAIR_TYPE_BT = 1;
    public static final int CONNECTION_PAIR_TYPE_PC_P2P = 4;
    public static final int CONNECTION_PAIR_TYPE_WIFI = 2;
    protected String mBleMac;

    public AbsConnection(String str) {
        this.mBleMac = str;
    }

    public abstract void close();

    @Nullable
    public abstract String getIpAddress();

    @Nullable
    public abstract String getMacAddress();

    public abstract int getPairType();

    @Nullable
    public abstract String getPairedAddress();

    public abstract void handlePairRequest(byte[] bArr, BluetoothDevice bluetoothDevice);

    public abstract void init();
}
