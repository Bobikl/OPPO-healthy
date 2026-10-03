package com.omron.lib.device.bf;

import com.omron.lib.common.OMRONBLECallbackBase;
import com.omron.lib.device.DeviceInfo;
import com.omron.lib.model.BodyfatData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface OmronBfBleCallBack extends OMRONBLECallbackBase {
    void onBindBodyFatComplete(String str, String str2, String str3, String str4, String str5, String str6, String str7, DeviceInfo deviceInfo, List<BodyfatData> list);

    void onBodyFatDataReadComplete(String str, String str2, String str3, String str4, List<BodyfatData> list, String str5, String str6, String str7);

    void onScanBodyFatComplete();
}
