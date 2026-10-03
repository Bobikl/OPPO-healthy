package com.oplus.aiunit.vision;

import android.os.Build;
import android.text.TextUtils;
import com.oplus.drs.base.util.SystemProperty;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes6.dex */
public class o52 {
    public static final int BRAND_O = 1;
    public static final int BRAND_OP = 3;
    public static final int BRAND_OTHER = -1;
    public static final int BRAND_RM = 2;
    public static final String a = Build.BRAND;
    public static final String b = SystemProperty.get("ro.product.brand.sub", "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile int f14787c = -999;
    public static int d = 0;

    public static int a() {
        if (f14787c == -999) {
            synchronized (o52.class) {
                if (f14787c == -999) {
                    f14787c = b();
                }
            }
        }
        return f14787c;
    }

    public static int b() {
        if (f()) {
            return 2;
        }
        if (e()) {
            return 3;
        }
        return d() ? 1 : -1;
    }

    public static String c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean d() {
        String str = a;
        return !TextUtils.isEmpty(str) && str.equalsIgnoreCase(l04.BRAND_O);
    }

    public static boolean e() {
        String str = a;
        if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase(l04.BRAND_ONE)) {
            return true;
        }
        try {
            return w56.b().getPackageManager().hasSystemFeature(l04.ONE_LABEL_PROPERTIES);
        } catch (Exception e2) {
            z6b.o("BrandUtils", "isBrandOneplus error = [" + c(e2) + "]");
            return false;
        }
    }

    public static boolean f() {
        String str = b;
        if (TextUtils.isEmpty(str) || !str.equalsIgnoreCase(l04.BRAND_R)) {
            String str2 = a;
            if (TextUtils.isEmpty(str2) || !str2.equalsIgnoreCase(l04.BRAND_R)) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean h() {
        return g("com.color.os.ColorBuild") || i();
    }

    public static boolean i() {
        if (d == 0) {
            if (g("com.oplus.os.OplusBuild")) {
                d = 1;
            } else {
                d = 2;
            }
        }
        return d == 1;
    }
}
