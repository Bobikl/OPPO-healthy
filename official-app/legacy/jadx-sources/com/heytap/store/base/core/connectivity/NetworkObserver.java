package com.heytap.store.base.core.connectivity;

import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NetworkObserver implements Observer {
    public abstract void notify(ConnectivityManagerProxy.SimpleNetworkInfo simpleNetworkInfo);

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        notify((ConnectivityManagerProxy.SimpleNetworkInfo) obj);
    }
}
