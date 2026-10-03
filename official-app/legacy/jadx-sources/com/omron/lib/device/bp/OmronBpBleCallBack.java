package com.omron.lib.device.bp;

import com.omron.lib.common.OMRONBLECallbackBase;
import com.omron.lib.device.DeviceInfo;
import com.omron.lib.model.BPData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface OmronBpBleCallBack extends OMRONBLECallbackBase {
    void onBindComplete(String str, String str2, String str3, DeviceInfo deviceInfo, List<BPData> list);

    void onDataReadComplete(String str, String str2, String str3, List<BPData> list);
}
