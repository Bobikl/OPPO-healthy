package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import com.heytap.openid.sdk.HeytapIDSDK;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class twm {
    public static boolean a = false;
    public static Object b = new Object();
    public static String c;

    public static int a() {
        return Build.VERSION.SDK_INT;
    }

    public static String b(Context context) {
        if (c == null) {
            c(context);
            try {
                String ouid = HeytapIDSDK.getOUID(context);
                c = ouid;
                if (ouid == null) {
                    c = "";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return c;
    }

    public static void c(Context context) {
        if (a) {
            return;
        }
        synchronized (b) {
            if (!a) {
                HeytapIDSDK.init(context);
                a = true;
            }
        }
    }
}
