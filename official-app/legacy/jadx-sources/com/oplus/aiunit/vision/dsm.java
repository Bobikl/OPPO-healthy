package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import com.heytap.openid.sdk.HeytapIDSDK;

/* JADX INFO: loaded from: classes8.dex */
public class dsm {
    public static boolean a = false;
    public static Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f10680c;

    public static int a() {
        return Build.VERSION.SDK_INT;
    }

    public static String b(Context context) {
        if (f10680c == null) {
            c(context);
            try {
                String ouid = HeytapIDSDK.getOUID(context);
                f10680c = ouid;
                if (ouid == null) {
                    f10680c = "";
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return f10680c;
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
