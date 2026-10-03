package com.lifesense.android.bluetooth.core.business;

import com.lifesense.android.bluetooth.core.bean.BleScanResults;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;

/* JADX INFO: loaded from: classes4.dex */
public interface h extends a {
    void onBleScanResults(BleScanResults bleScanResults);

    void onDeviceScanResults(String str, LsDeviceInfo lsDeviceInfo);

    void onScanFailure();

    void onScanTimeout();
}
