package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
public class qbm {
    public static final String a = "DeviceUtil";
    public static final String b = "oppo";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15738c = "oneplus";
    public static final String d = "realme";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f15739e = "com.oneplus.mobilephone";
    public static final a f = new a();
    public static String g = "";

    public static class a {
        public boolean a = false;
        public String b = "";
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(g)) {
            return g;
        }
        if (c(context)) {
            g = "oneplus";
        } else if (f()) {
            g = "realme";
        } else if (e()) {
            g = b;
        } else {
            g = Build.BRAND;
        }
        return g;
    }

    public static String b() {
        return Build.MODEL;
    }

    public static boolean c(Context context) {
        if (context == null) {
            hpm.e("DeviceUtil", "isBrandP context is null", new Object[0]);
            return false;
        }
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str) || !str.equalsIgnoreCase("oneplus")) {
            return context.getPackageManager().hasSystemFeature(f15739e);
        }
        return true;
    }

    @SuppressLint({"UnsafeHashAlgorithmDetector"})
    public static String d() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method method = cls.getMethod(ParserTag.TAG_GET, String.class, String.class);
            a aVar = f;
            aVar.b = (String) method.invoke(cls, "ro.product.brand.sub", "");
            aVar.a = true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            a aVar2 = f;
            aVar2.b = "";
            aVar2.a = false;
            hpm.e("DeviceUtil", "getSubBrand failed : " + e2.getMessage(), new Object[0]);
        }
        return f.b;
    }

    public static boolean e() {
        String str = Build.BRAND;
        return !TextUtils.isEmpty(str) && str.equalsIgnoreCase(b);
    }

    public static boolean f() {
        a aVar = f;
        String strD = aVar.a ? aVar.b : d();
        if (TextUtils.isEmpty(strD) || !strD.equalsIgnoreCase("realme")) {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.equalsIgnoreCase("realme")) {
                return false;
            }
        }
        return true;
    }
}
