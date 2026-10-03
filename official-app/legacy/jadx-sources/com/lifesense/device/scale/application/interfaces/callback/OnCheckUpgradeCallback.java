package com.lifesense.device.scale.application.interfaces.callback;

import com.lifesense.device.scale.device.dto.device.FirmwareInfo;

/* JADX INFO: loaded from: classes4.dex */
public interface OnCheckUpgradeCallback {
    void onCheckUpgradeFail(int i, String str);

    void onCheckUpgradeSuccess(FirmwareInfo firmwareInfo);
}
