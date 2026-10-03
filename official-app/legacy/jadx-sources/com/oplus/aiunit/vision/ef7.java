package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes3.dex */
public class ef7 {
    public static final String FIND_MY_PHONE_LAUNCHER = "com.oppo.findmyphone.LAUNCHER";

    public static boolean a(Context context, String str) {
        ApplicationInfo applicationInfoB = b(context.getPackageManager());
        if (applicationInfoB == null) {
            return false;
        }
        boolean zX = ilj.x();
        boolean z = applicationInfoB.metaData.getBoolean("support.device.action", false);
        boolean zW6 = zda.a(str).W6();
        a7b.f("FindMyPhoneAgent", "[isSupportDevice] --> systemSupport=" + z + ", supportFindDevice=" + zW6 + ", isLinkage=" + zX);
        return zX && z && zW6;
    }

    public static ApplicationInfo b(PackageManager packageManager) {
        try {
            return packageManager.getApplicationInfo("com.coloros.findmyphone", 128);
        } catch (Exception e2) {
            a7b.b("FindMyPhoneAgent", "[queryApplicationInfo] --> " + e2.getMessage());
            return null;
        }
    }

    public static void c(Context context) {
        try {
            Intent intent = new Intent();
            intent.setPackage("com.coloros.findmyphone");
            intent.setAction(FIND_MY_PHONE_LAUNCHER);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            a7b.b("FindMyPhoneAgent", "[startFindMyPhone] --> " + e2.getMessage());
        }
    }
}
