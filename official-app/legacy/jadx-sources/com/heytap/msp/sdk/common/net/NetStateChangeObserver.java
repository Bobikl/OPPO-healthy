package com.heytap.msp.sdk.common.net;

/* JADX INFO: loaded from: classes19.dex */
public interface NetStateChangeObserver {
    void onNetConnected(NetworkType networkType);

    void onNetDisconnected();
}
