package com.heytap.accessory.pair.connectivity.interfaces;

/* JADX INFO: loaded from: classes14.dex */
public interface IConnectionEventListener {
    void onConnectionStateChanged(String str, int i, int i2);

    void onMessageDispatched(String str, byte[] bArr);

    void onMessageReceived(String str, byte[] bArr);
}
