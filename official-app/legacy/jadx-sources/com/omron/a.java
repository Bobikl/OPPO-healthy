package com.omron;

import android.support.annotation.MainThread;
import com.omron.lib.BleScanDevice;

/* JADX INFO: loaded from: classes5.dex */
@MainThread
public interface a {
    void onBleScan(BleScanDevice bleScanDevice, int i, byte[] bArr);

    void onCycleEnd();
}
