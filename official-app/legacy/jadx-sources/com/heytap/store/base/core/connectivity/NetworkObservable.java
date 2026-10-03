package com.heytap.store.base.core.connectivity;

import android.content.Context;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkObservable extends Observable {
    private final Context context;

    public NetworkObservable(Context context) {
        this.context = context;
    }

    @Override // java.util.Observable
    public void addObserver(Observer observer) {
        try {
            super.addObserver(observer);
            observer.update(this, ConnectivityManagerProxy.simplizeNetworkInfo(this.context, ConnectivityManagerProxy.getCurrentActiveNetworkInfo(this.context)));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // java.util.Observable
    public void notifyObservers(Object obj) {
        try {
            setChanged();
            super.notifyObservers(obj);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
