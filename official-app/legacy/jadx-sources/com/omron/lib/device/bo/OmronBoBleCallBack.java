package com.omron.lib.device.bo;

import com.omron.lib.common.OMRONBLECallbackBase;
import com.omron.lib.device.DeviceInfo;
import com.omron.lib.model.BoData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface OmronBoBleCallBack extends OMRONBLECallbackBase {
    void onBoComplete(String str, String str2, String str3, DeviceInfo deviceInfo, List<BoData> list);

    void onBoDataReadComplete(String str, String str2, String str3, List<BoData> list);
}
