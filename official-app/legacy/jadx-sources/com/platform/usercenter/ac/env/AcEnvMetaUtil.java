package com.platform.usercenter.ac.env;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes9.dex */
public class AcEnvMetaUtil {
    private static final String ENV_CLAZZ = "env_clazz";
    private static final String ENV_INIT = "env_init";

    public static void checkMeta(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            String string = applicationInfo.metaData.getString(ENV_CLAZZ, "");
            String string2 = applicationInfo.metaData.getString(ENV_INIT, "");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                return;
            }
            Class<?> cls = Class.forName(string);
            cls.getMethod(string2, Context.class).invoke(cls, context);
        } catch (Exception unused) {
        }
    }
}
