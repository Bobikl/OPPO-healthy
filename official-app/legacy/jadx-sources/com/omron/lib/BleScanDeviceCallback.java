package com.omron.lib;

import android.support.annotation.MainThread;
import com.omron.lib.common.OMRONBLEErrMsg;

/* JADX INFO: loaded from: classes5.dex */
@MainThread
public interface BleScanDeviceCallback extends com.omron.a {
    @Override // com.omron.a
    /* synthetic */ void onBleScan(BleScanDevice bleScanDevice, int i, byte[] bArr);

    void onBleScanFailure(OMRONBLEErrMsg oMRONBLEErrMsg);

    @Override // com.omron.a
    /* synthetic */ void onCycleEnd();
}
