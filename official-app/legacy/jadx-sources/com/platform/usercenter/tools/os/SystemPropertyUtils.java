package com.platform.usercenter.tools.os;

import com.oplus.smartenginehelper.ParserTag;
import com.oplus.wrapper.os.SystemProperties;
import com.platform.usercenter.tools.UCBasicUtils;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.osdk.CompatUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public class SystemPropertyUtils {
    private static final String TAG = "SystemPropertyUtils";
    private static volatile Method get;

    public static String get(String str, String str2) {
        if (CompatUtils.check(30, 1)) {
            try {
                return SystemProperties.get(str, str2);
            } catch (Throwable th) {
                UCLogUtil.e(UCBasicUtils.SDK_TAG, "SystemPropertyUtilsaddon：" + th);
            }
        }
        try {
            if (get == null) {
                synchronized (SystemPropertyUtils.class) {
                    if (get == null) {
                        get = Class.forName("android.os.SystemProperties").getDeclaredMethod(ParserTag.TAG_GET, String.class, String.class);
                    }
                }
            }
            return (String) get.invoke(null, str, str2);
        } catch (Throwable th2) {
            UCLogUtil.e(UCBasicUtils.SDK_TAG, TAG + th2);
            return str2;
        }
    }
}
