package com.omron.lib.device.bp;

import android.support.annotation.NonNull;
import com.omron.lib.BleScanDevice;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface OmronBpDeviceCallback {
    void bindBpDevice(@NonNull String str, @NonNull OmronBpBleCallBack omronBpBleCallBack, String str2);

    void getBpDeviceData(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull OmronBpBleCallBack omronBpBleCallBack);

    void startBpMonitoring(@NonNull List<BleScanDevice> list, @NonNull OmronBpBleCallBack omronBpBleCallBack);

    void stopBpConnect();

    void stopBpMonitoring();
}
