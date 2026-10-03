package com.heytap.mspsdk.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class b {
    public static final String MSP_RELATIVE_CONNECT_AUHORITY = "com.heytap.msp.v2.dectect.provider";
    public final int a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7392c;

    public b(String str, String str2, int i) {
        this.f7392c = str;
        this.b = str2;
        this.a = i;
    }

    public static b a() {
        return new b("", "", 0);
    }

    public static boolean c() {
        return com.heytap.mspsdk.util.d.f() && com.heytap.mspsdk.util.d.e() && (com.heytap.mspsdk.util.d.d() || !com.heytap.mspsdk.util.b.b());
    }

    public static boolean f() {
        if (com.heytap.mspsdk.util.d.f()) {
            return (com.heytap.mspsdk.util.d.e() || com.heytap.mspsdk.util.b.b()) ? false : true;
        }
        return true;
    }

    public static b g(Context context) {
        if (!c()) {
            PackageInfo packageInfoB = com.heytap.mspsdk.util.a.b(context);
            return packageInfoB != null ? new b(packageInfoB.packageName, packageInfoB.versionName, packageInfoB.versionCode) : a();
        }
        ApplicationInfo applicationInfoA = com.heytap.mspsdk.util.a.a(context);
        if (applicationInfoA == null) {
            return a();
        }
        String string = applicationInfoA.metaData.getString("mspCoreName");
        if (string == null) {
            string = "";
        }
        return new b(applicationInfoA.packageName, string, applicationInfoA.metaData.getInt("mspCoreCode"));
    }

    public boolean b() {
        return !TextUtils.isEmpty(this.f7392c);
    }

    public boolean d() {
        return b() ? "com.heytap.htms".equals(this.f7392c) : !c();
    }

    public boolean e() {
        return this.a >= 2000000;
    }

    public String h() {
        return this.f7392c;
    }

    public int i() {
        return this.a;
    }

    public String j() {
        return this.b;
    }
}
