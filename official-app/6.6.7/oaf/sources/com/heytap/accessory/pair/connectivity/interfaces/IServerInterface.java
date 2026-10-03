package com.heytap.accessory.pair.connectivity.interfaces;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IServerInterface {
    void registerCallback(IServerEventListener iServerEventListener);

    boolean start();

    void stop();

    void unregisterCallback();
}
