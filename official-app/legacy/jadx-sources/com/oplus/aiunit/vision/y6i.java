package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class y6i {
    public Context a;
    public String b;

    public y6i(Context context) {
        if (context != null) {
            this.b = context.getPackageName();
            this.a = context;
        }
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("\\.config\\.")[0];
    }

    public final Set<String> b() {
        Bundle bundle;
        HashSet hashSet = new HashSet();
        Context context = this.a;
        if (context == null) {
            return hashSet;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(this.b, 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                w7i.a("SplitAABInfoProvider", "App has no applicationInfo or metaData", new Object[0]);
            } else {
                String string = bundle.getString(xbm.f18569e);
                if (string == null || string.isEmpty()) {
                    w7i.a("SplitAABInfoProvider", "App has no fused modules.", new Object[0]);
                } else {
                    Collections.addAll(hashSet, string.split(",", -1));
                    hashSet.remove("");
                }
            }
            return hashSet;
        } catch (PackageManager.NameNotFoundException e2) {
            w7i.f("SplitAABInfoProvider", e2, "App is not found in PackageManager", new Object[0]);
            return hashSet;
        }
    }

    public Set<String> c() {
        Set<String> setB = b();
        String[] strArrD = d();
        if (strArrD == null) {
            w7i.a("SplitAABInfoProvider", "No splits are found or app cannot be found in package manager.", new Object[0]);
            return setB;
        }
        String string = Arrays.toString(strArrD);
        w7i.a("SplitAABInfoProvider", string.length() != 0 ? "Split names are: ".concat(string) : "Split names are: ", new Object[0]);
        for (String str : strArrD) {
            if (!str.startsWith("config.")) {
                setB.add(a(str));
            }
        }
        return setB;
    }

    public final String[] d() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(this.b, 0);
            if (packageInfo != null) {
                return packageInfo.splitNames;
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            w7i.f("SplitAABInfoProvider", e2, "App is not found in PackageManager", new Object[0]);
            return null;
        }
    }
}
