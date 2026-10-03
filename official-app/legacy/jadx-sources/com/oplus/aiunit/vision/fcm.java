package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class fcm {
    public static String a(Context context, String str, String str2) {
        synchronized (fcm.class) {
            String strE = null;
            if (context != null) {
                try {
                    if (!vam.c(str) && !vam.c(str2)) {
                        try {
                            String strA = hsm.a(context, str, str2, "");
                            if (vam.c(strA)) {
                                return null;
                            }
                            strE = alm.e(alm.a(), strA);
                        } catch (Throwable unused) {
                        }
                        return strE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    public static void b(Context context, String str, String str2, String str3) {
        synchronized (fcm.class) {
            if (vam.c(str) || vam.c(str2) || context == null) {
                return;
            }
            try {
                String strB = alm.b(alm.a(), str3);
                HashMap map = new HashMap();
                map.put(str2, strB);
                hsm.b(context, str, map);
            } catch (Throwable unused) {
            }
        }
    }
}
