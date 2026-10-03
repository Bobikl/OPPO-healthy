package com.heytap.accessory.pair.connectivity.interfaces;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IConnectionEventListener {
    void onConnectionStateChanged(String str, int i, int i2);

    void onMessageDispatched(String str, byte[] bArr);

    void onMessageReceived(String str, byte[] bArr);
}
