package com.oplus.aiunit.vision;

import android.os.Build;
import android.text.TextUtils;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes13.dex */
public class byf {
    public static final int SDK_SUB_VERSION_SUPPORT_BLUR = 10;
    public static final int SDK_VERSION = 34;
    public static final int SMOOTH_ROUND_CORNER_TYPE_OS15 = 0;
    public static final int SMOOTH_ROUND_CORNER_TYPE_OS16 = 1;
    public static final int SMOOTH_ROUND_CORNER_TYPE_UNSUPPORTED = -1;
    public static Integer a;
    public static Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Float f9897c;
    public static Boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Integer f9898e;

    public static int a() {
        if (f9898e == null) {
            f9898e = Integer.valueOf(bn2.c());
        }
        if (!f() || f9898e.intValue() < 37) {
            return f() ? 0 : -1;
        }
        return 1;
    }

    public static int b(String str, int i) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod(ParserTag.TAG_GET, String.class).invoke(null, str);
            return !TextUtils.isEmpty(str2) ? Integer.parseInt(str2) : i;
        } catch (ClassNotFoundException e2) {
            bj2.c("RoundCornerUtil", "Class not found:" + e2);
            return i;
        } catch (IllegalAccessException e3) {
            bj2.c("RoundCornerUtil", "Illegal access:" + e3);
            return i;
        } catch (NoSuchMethodException e4) {
            bj2.c("RoundCornerUtil", "Method not found:" + e4);
            return i;
        } catch (InvocationTargetException e5) {
            bj2.c("RoundCornerUtil", "Invocation target exception:" + e5);
            return i;
        }
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT <= 31) {
            return false;
        }
        if (f9898e == null) {
            f9898e = Integer.valueOf(bn2.c());
        }
        if (f9898e.intValue() > 34) {
            return true;
        }
        return f9898e.intValue() == 34 && bn2.d() >= 12;
    }

    public static boolean d() {
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (f()) {
            if (a == null) {
                a = Integer.valueOf(b("persist.sys.oplus.anim_level", 3));
            }
            if (b == null) {
                b = Integer.valueOf(b("persist.sys.oplus.upgrade_anim_level", 3));
            }
            if (f9897c == null) {
                f9897c = Float.valueOf(b("persist.sys.oplus.default_smooth_weight", 170) / 100.0f);
            }
            d = Boolean.valueOf((a.intValue() < 3 || b.intValue() < 3) && f9897c.floatValue() != 2.0f);
        } else {
            d = Boolean.FALSE;
        }
        return d.booleanValue();
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT <= 31) {
            return false;
        }
        if (f9898e == null) {
            f9898e = Integer.valueOf(bn2.c());
        }
        if (f9898e.intValue() > 34) {
            return true;
        }
        return f9898e.intValue() == 34 && bn2.d() >= 10;
    }

    public static boolean f() {
        if (Build.VERSION.SDK_INT <= 31) {
            return false;
        }
        if (f9898e == null) {
            f9898e = Integer.valueOf(bn2.c());
        }
        return f9898e.intValue() >= 34;
    }

    public static boolean g(boolean z) {
        return f() && (!z || e());
    }
}
