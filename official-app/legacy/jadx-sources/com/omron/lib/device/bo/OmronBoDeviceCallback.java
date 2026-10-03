package com.omron.lib.device.bo;

import android.support.annotation.NonNull;
import com.omron.lib.BleScanDevice;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface OmronBoDeviceCallback {
    void bindBoDevice(@NonNull String str, OmronBoBleCallBack omronBoBleCallBack);

    void getBoDeviceData(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull OmronBoBleCallBack omronBoBleCallBack);

    void startBoMonitoring(@NonNull List<BleScanDevice> list, @NonNull OmronBoBleCallBack omronBoBleCallBack);

    void stopBoConnect();

    void stopBoMonitoring();
}
