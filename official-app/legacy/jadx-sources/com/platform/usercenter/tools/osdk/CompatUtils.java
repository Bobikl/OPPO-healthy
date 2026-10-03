package com.platform.usercenter.tools.osdk;

import android.os.Build;
import com.oplus.os.OplusBuild;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class CompatUtils {
    public static final int OSDK_SUB_API_VERSION = 1;

    public static boolean check(int i, int i2) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        try {
            int i3 = OplusBuild.VERSION.SDK_VERSION;
            if (i3 > i) {
                return true;
            }
            return i3 == i && OplusBuild.VERSION.SDK_SUB_VERSION >= i2;
        } catch (Throwable th) {
            UCLogUtil.e(th.getMessage());
        }
        return false;
    }
}
