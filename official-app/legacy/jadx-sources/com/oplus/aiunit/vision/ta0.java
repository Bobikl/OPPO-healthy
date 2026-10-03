package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class ta0 {
    public ApplicationInfo a(String str) {
        ApplicationInfo applicationInfoB;
        Context contextG = ep6.g();
        if (contextG == null) {
            return null;
        }
        for (String str2 : d(contextG)) {
            ProviderInfo providerInfoResolveContentProvider = contextG.getPackageManager().resolveContentProvider(c(str2), 128);
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
        return str + ".oplus.epona";
    }

    public final String[] d(Context context) {
        try {
            return e(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128), "epona_packages");
        } catch (PackageManager.NameNotFoundException unused) {
            l7b.d("Epona->AppFinder", "not find application info", new Object[0]);
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
