package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes8.dex */
public class num extends eym {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14652l = "PmsProcessSplitInfo";

    public num(Context context) {
        d(context);
    }

    @Override // com.oplus.aiunit.vision.eym
    public v5n c(v5n v5nVar) {
        PackageInfo packageInfo = null;
        if (v5nVar == null) {
            w7i.c(f14652l, "pre SplitVersionInfo is null", new Object[0]);
            return null;
        }
        if (this.a == null) {
            w7i.i(f14652l, "context is null", new Object[0]);
            return f(v5nVar);
        }
        if (!v5nVar.j().y()) {
            w7i.a(f14652l, "no sota feature, skip!", new Object[0]);
            return f(v5nVar);
        }
        try {
            packageInfo = this.a.getPackageManager().getPackageInfo(v5nVar.j().k(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo == null) {
            w7i.a(f14652l, "package not exist", new Object[0]);
            return f(v5nVar);
        }
        int iR = v5nVar.j().r();
        long longVersionCode = packageInfo.getLongVersionCode();
        int i = (int) longVersionCode;
        if (e(iR, i) && v5nVar.g() < longVersionCode) {
            return f(b(5, i, packageInfo.versionName, v5nVar));
        }
        return f(v5nVar);
    }
}
