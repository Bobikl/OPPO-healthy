package com.platform.usercenter.uws.util;

import android.content.Context;
import com.oplus.aiunit.vision.rnl;
import com.platform.usercenter.tools.device.UCDeviceTypeFactory;
import com.platform.usercenter.tools.os.UCRuntimeEnvironment;

/* JADX INFO: loaded from: classes9.dex */
public class UwsUaBuilder extends rnl {
    public static final String HARDWARE_TYPE = " hardwareType/";
    public static final String IS_EXP = " IsExp/";

    private UwsUaBuilder(Context context, String str) {
        super(context, str);
    }

    public static UwsUaBuilder with(Context context, String str) {
        if (context != null) {
            return new UwsUaBuilder(context, str);
        }
        throw new RuntimeException("UwsUaBuilder context should not be null!");
    }

    @Override // com.oplus.aiunit.vision.rnl
    public UwsUaBuilder appendCommon() {
        super.appendCommon();
        StringBuilder sb = this.mStringBuilder;
        sb.append(IS_EXP);
        sb.append(UCRuntimeEnvironment.sIsExp ? "1" : "0");
        sb.append(HARDWARE_TYPE);
        sb.append(UCDeviceTypeFactory.getDeviceType(this.mContext));
        return this;
    }
}
