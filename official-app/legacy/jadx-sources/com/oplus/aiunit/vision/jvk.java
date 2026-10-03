package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.util.Log;
import com.oplus.os.OplusBuild;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class jvk {
    public static final String a = d();
    public static final String b = b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static AtomicBoolean f13047c;

    public static boolean a() {
        ProviderInfo providerInfoResolveContentProvider;
        AtomicBoolean atomicBoolean = f13047c;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        Context contextG = ep6.g();
        if (contextG == null || (providerInfoResolveContentProvider = contextG.getPackageManager().resolveContentProvider(a, 128)) == null) {
            return false;
        }
        boolean zEquals = b.equals(providerInfoResolveContentProvider.packageName);
        f13047c = new AtomicBoolean(zEquals);
        return zEquals;
    }

    public static String b() {
        return j() ? q04.APP_PLATFORM_PACKAGE_NAME : (String) c();
    }

    public static Object c() {
        return kvk.a();
    }

    public static String d() {
        return j() ? "com.oplus.appplatform.dispatcher" : (String) e();
    }

    public static Object e() {
        return kvk.b();
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        return true;
    }

    public static boolean h() {
        return true;
    }

    public static boolean i(int i) {
        try {
            return OplusBuild.getOplusOSVERSION() >= i;
        } catch (Throwable th) {
            Log.d("VersionUtils", "Get OsVersion Exception : " + th.toString());
            return false;
        }
    }

    public static boolean j() {
        return i(22);
    }

    public static boolean k() {
        return true;
    }

    public static boolean l() {
        return true;
    }

    public static boolean m() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean n() {
        return Build.VERSION.SDK_INT >= 31 || "S".equals(Build.VERSION.CODENAME);
    }
}
