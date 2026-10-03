package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.os.OplusBuild;

/* JADX INFO: loaded from: classes8.dex */
public class wqd {
    public static final boolean IS_OS_VERSION_11_3 = a();

    public static boolean a() {
        try {
            return OplusBuild.getOplusOSVERSION() >= ((Integer) Class.forName("com.oplus.os.OplusBuild").getField("OplusOS_11_3").get(null)).intValue();
        } catch (Exception e2) {
            Log.w("OplusVersionUtils", "isOsVersion_11_3: " + e2.toString());
            return false;
        }
    }
}
