package com.lifesense.android.bluetooth.core;

import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.OperationCommand;
import com.lifesense.android.bluetooth.core.bean.constant.ProductUserInfoType;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PairCallback {
    public void onClearUserRecordsStateChange(String str, int i) {
    }

    @Deprecated
    public void onDeviceConfigInfoSettingSuccess(String str, ProductUserInfoType productUserInfoType) {
    }

    public void onDeviceOperationCommandUpdate(String str, OperationCommand operationCommand, Object obj) {
    }

    public void onDeviceUnitUpdateStateChange(String str, int i) {
    }

    public void onPairResults(LsDeviceInfo lsDeviceInfo, int i) {
    }

    public void onUnbindResults(LsDeviceInfo lsDeviceInfo, int i) {
    }

    public void onWifiPasswordConfigResults(LsDeviceInfo lsDeviceInfo, boolean z, int i) {
    }
}
