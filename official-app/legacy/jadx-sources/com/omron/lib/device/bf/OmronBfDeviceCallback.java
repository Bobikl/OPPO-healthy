package com.omron.lib.device.bf;

import android.support.annotation.NonNull;
import com.omron.lib.BleScanDevice;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface OmronBfDeviceCallback {
    void bindBfDevice(@NonNull String str, OmronBfBleCallBack omronBfBleCallBack, String str2, String str3, String str4);

    void bindBfUserIndex(int i);

    void getBfDeviceData(@NonNull String str, @NonNull String str2, @NonNull OmronBfBleCallBack omronBfBleCallBack, int i, String str3, String str4, String str5, String str6);

    void startBfMonitoring(@NonNull List<BleScanDevice> list, @NonNull OmronBfBleCallBack omronBfBleCallBack, String str, String str2, String str3);

    void stopBfConnect();

    void stopBfMonitoring();
}
