package com.heytap.accessory.pair.connectivity.ble.interfaces;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IBleConnectionListener {
    void onConnectionStateChanged(int i, int i2);

    void onMessageReceived(byte[] bArr);

    void onMessageSent(String str, byte[] bArr);

    void onMtuChanged(int i);
}
