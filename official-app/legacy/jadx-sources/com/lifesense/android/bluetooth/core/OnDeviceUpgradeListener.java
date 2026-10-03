package com.lifesense.android.bluetooth.core;

import com.lifesense.android.bluetooth.core.bean.constant.DeviceUpgradeStatus;

/* JADX INFO: loaded from: classes4.dex */
public interface OnDeviceUpgradeListener {
    void onDeviceUpgradeProcess(int i);

    void onDeviceUpgradeStateChange(String str, DeviceUpgradeStatus deviceUpgradeStatus, int i);
}
