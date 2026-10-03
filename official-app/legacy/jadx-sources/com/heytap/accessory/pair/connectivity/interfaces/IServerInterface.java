package com.heytap.accessory.pair.connectivity.interfaces;

/* JADX INFO: loaded from: classes14.dex */
public interface IServerInterface {
    void registerCallback(IServerEventListener iServerEventListener);

    boolean start();

    void stop();

    void unregisterCallback();
}
