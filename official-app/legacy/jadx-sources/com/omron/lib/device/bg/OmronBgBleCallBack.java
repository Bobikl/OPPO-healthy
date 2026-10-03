package com.omron.lib.device.bg;

import com.omron.lib.common.OMRONBLECallbackBase;
import com.omron.lib.model.bg.BGData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface OmronBgBleCallBack extends OMRONBLECallbackBase {
    void onBindComplete(String str, String str2, String str3, List<BGData> list);

    void onDataReadComplete(String str, String str2, String str3, List<BGData> list);
}
