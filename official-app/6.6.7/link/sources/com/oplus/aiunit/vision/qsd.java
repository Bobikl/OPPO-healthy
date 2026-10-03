package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.os.OplusBuild;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class qsd {
    public static final boolean IS_OS_VERSION_11_3 = a();

    public static boolean a() {
        try {
            return OplusBuild.getOplusOSVERSION() >= ((Integer) Class.forName("com.oplus.os.OplusBuild").getField("OplusOS_11_3").get(null)).intValue();
        } catch (Exception e) {
            Log.w("OplusVersionUtils", "isOsVersion_11_3: " + e.toString());
            return false;
        }
    }
}
