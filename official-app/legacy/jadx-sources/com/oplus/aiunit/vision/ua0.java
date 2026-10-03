package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;

/* JADX INFO: loaded from: classes15.dex */
public class ua0 {
    public ApplicationInfo a(String str) {
        ApplicationInfo applicationInfoB;
        Context contextF = fp6.f();
        if (contextF == null) {
            return null;
        }
        for (String str2 : d(contextF)) {
            ProviderInfo providerInfoResolveContentProvider = contextF.getPackageManager().resolveContentProvider(c(str2), 128);
            if (providerInfoResolveContentProvider != null && (applicationInfoB = b(str, providerInfoResolveContentProvider)) != null) {
                return applicationInfoB;
            }
        }
        return null;
    }

    public final ApplicationInfo b(String str, ProviderInfo providerInfo) {
        ApplicationInfo applicationInfo = providerInfo.applicationInfo;
        for (String str2 : e(applicationInfo, "epona_components")) {
            if (str2.trim().equals(str)) {
                return applicationInfo;
            }
        }
        return null;
    }

    public final String c(String str) {
        return str + ".epona";
    }

    public final String[] d(Context context) {
        try {
            return e(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128), "epona_packages");
        } catch (PackageManager.NameNotFoundException unused) {
            s7b.c("AppFinder", "not find application info", new Object[0]);
            return new String[0];
        }
    }

    public final String[] e(ApplicationInfo applicationInfo, String str) {
        String string;
        String[] strArr = new String[0];
        Bundle bundle = applicationInfo.metaData;
        return (bundle == null || (string = bundle.getString(str)) == null) ? strArr : string.split("\\|");
    }
}
