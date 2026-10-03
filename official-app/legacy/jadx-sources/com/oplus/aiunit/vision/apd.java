package com.oplus.aiunit.vision;

import androidx.annotation.RequiresApi;
import com.oplus.compat.utils.util.UnSupportedApiVersionException;
import com.oplus.content.OplusFeatureConfigManager;

/* JADX INFO: loaded from: classes4.dex */
public class apd {
    @RequiresApi(api = 29)
    public static boolean a(String str) throws UnSupportedApiVersionException {
        if (jvk.m()) {
            return OplusFeatureConfigManager.getInstance().hasFeature(str);
        }
        if (jvk.l()) {
            return ep6.g().getPackageManager().hasSystemFeature(str);
        }
        throw new UnSupportedApiVersionException("not supported before Q");
    }
}
