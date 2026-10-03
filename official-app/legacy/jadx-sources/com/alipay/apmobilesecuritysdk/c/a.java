package com.alipay.apmobilesecuritysdk.c;

import android.content.Context;
import android.os.Build;
import com.oplus.aiunit.vision.adm;
import com.oplus.aiunit.vision.gqm;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static synchronized void a(Context context, String str, String str2, String str3) {
        adm admVarB = b(context, str, str2, str3);
        gqm.b(context.getFilesDir().getAbsolutePath() + "/log/ap", new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log", admVarB.toString());
    }

    public static adm b(Context context, String str, String str2, String str3) {
        String packageName;
        try {
            packageName = context.getPackageName();
        } catch (Throwable unused) {
            packageName = "";
        }
        return new adm(Build.MODEL, packageName, "APPSecuritySDK-ALIPAYSDK", "3.4.0.202311031119", str, str2, str3);
    }

    public static synchronized void a(String str) {
        gqm.a(str);
    }

    public static synchronized void a(Throwable th) {
        gqm.c(th);
    }
}
