package com.heytap.accessory.pair.connectivity.interfaces;

import com.heytap.accessory.pair.connectivity.param.connect.FPConParam;

/* JADX INFO: loaded from: classes14.dex */
public interface IServerEventListener {
    void onConnectionAccepted(FPConParam fPConParam);

    void onConnectionRequested();

    void onError(int i, FPConParam fPConParam);

    void onServicePrepared();
}
