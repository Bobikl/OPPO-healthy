package com.lifesense.plugin.ble;

import com.lifesense.plugin.ble.data.LSUpgradeState;

/* JADX INFO: loaded from: classes5.dex */
public interface OnUpgradingListener {
    void onProgressUpdate(String str, int i);

    void onStateChanged(String str, LSUpgradeState lSUpgradeState, int i);
}
