package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class n73 {
    public static String a;

    public static String a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String b(Context context) {
        if (a == null) {
            String strD = d(context);
            if (strD == null) {
                strD = c(context);
            }
            a = strD;
        }
        return a;
    }

    public static String c(Context context) {
        String strA = m73.a(new File(a(context)));
        Log.i("ChannelReaderUtil", "getChannelByV1 , channel = " + strA);
        return strA;
    }

    public static String d(Context context) {
        String strB = m73.b(new File(a(context)));
        Log.i("ChannelReaderUtil", "getChannelByV2 , channel = " + strB);
        return strB;
    }
}
