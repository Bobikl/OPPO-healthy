package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes19.dex */
public class gq5 {
    public static final String a = vye.a();
    public static final String b = vye.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f11857c = vye.c();
    public static b d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile String f11858e = null;

    public static class b {
        public boolean a;
        public String b;

        public b() {
            this.a = false;
            this.b = "";
        }
    }

    public static String a() {
        return Build.BRAND;
    }

    public static String b(Context context) {
        if (!TextUtils.isEmpty(f11858e)) {
            return f11858e;
        }
        if (e(context)) {
            f11858e = b;
        } else if (f()) {
            f11858e = f11857c;
        } else if (d()) {
            f11858e = a;
        } else {
            f11858e = a();
        }
        return f11858e;
    }

    public static String c() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            d.b = (String) cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(cls, "ro.product.brand.sub", "");
            d.a = true;
        } catch (Exception e2) {
            d.b = "";
            d.a = false;
            e6b.a("upgrade_DeviceUtil", "getSubBrand failed : " + e2.getMessage());
        }
        return d.b;
    }

    public static boolean d() {
        String strA = a();
        return !TextUtils.isEmpty(strA) && strA.equalsIgnoreCase(a);
    }

    public static boolean e(Context context) {
        String strA = a();
        if (!TextUtils.isEmpty(strA) && strA.equalsIgnoreCase(b)) {
            return true;
        }
        try {
            return context.getPackageManager().hasSystemFeature(vye.j());
        } catch (Throwable th) {
            e6b.a("upgrade_DeviceUtil", "isBrandP failed : " + th.getMessage());
            return false;
        }
    }

    public static boolean f() {
        String strC = d.a ? d.b : c();
        return (!TextUtils.isEmpty(strC) && strC.equalsIgnoreCase(f11857c)) || (!TextUtils.isEmpty(a()) && a().equalsIgnoreCase(f11857c));
    }
}
