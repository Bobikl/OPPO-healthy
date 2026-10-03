package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import android.text.TextUtils;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.content.OplusFeatureConfigManager;

/* JADX INFO: loaded from: classes6.dex */
public class m8 {
    public static final String DEFAULT_REGION = "CN";
    public static final String TAG = "AcDeviceUtil";
    public static Boolean a;
    public static Boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f13975c;

    public static String a() {
        String strA = yj.a(AcBaseConstants.c.PROPERTY_SYSTEM_REGION_MARK_GREEN_OLD, "CN");
        return "OC".equalsIgnoreCase(strA) ? "CN" : strA;
    }

    public static String b() {
        String strA = yj.a(AcBaseConstants.c.c(), "CN");
        if (TextUtils.isEmpty(strA)) {
            return a();
        }
        return "OC".equalsIgnoreCase(strA) ? "CN" : strA;
    }

    public static boolean c() {
        Boolean bool = f13975c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if (OplusFeatureConfigManager.getInstance().hasFeature(AcBaseConstants.c.SELL_MODE_FEATURE_AFTER_R)) {
                Boolean bool2 = Boolean.TRUE;
                f13975c = bool2;
                return bool2.booleanValue();
            }
            Boolean boolValueOf = Boolean.valueOf(OplusFeatureConfigManager.getInstance().hasFeature(AcBaseConstants.c.SELL_MODE_FEATURE_BEFORE_R));
            f13975c = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (Throwable th) {
            AcLogUtil.e(TAG, "getSellMode failed! Throwable:" + th.getMessage());
            return false;
        }
    }

    public static boolean d(Context context) {
        boolean z;
        boolean z2;
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        int iA = pb.a();
        String strB = b();
        boolean zH = h();
        boolean z3 = true;
        if (iA > 18) {
            z2 = !"CN".equalsIgnoreCase(strB);
            z = false;
        } else {
            z = iA <= 9 ? alf.US.equalsIgnoreCase(yj.a(AcBaseConstants.c.PROPERTY_SYSTEM_RO_VERSION_XOR8, "")) || zH : context.getPackageManager().hasSystemFeature(AcBaseConstants.c.EXP_SYSTEM_FEATURE_NAME_XOR8) || zH;
            z2 = false;
        }
        if (!zH && !z && !z2) {
            z3 = false;
        }
        a = Boolean.valueOf(z3);
        AcLogUtil.d(TAG, "isExp = " + a + ", isRedExp = " + zH + ", isGreenOrOrangeExp = " + z + ", isRegionExp = " + z2);
        return a.booleanValue();
    }

    public static boolean e(Context context) {
        try {
            UserManager userManager = (UserManager) context.getSystemService("user");
            return (userManager == null || userManager.isUserUnlocked()) ? false : true;
        } catch (Throwable th) {
            AcLogUtil.e(TAG, "isFbeMode check error", th);
            return false;
        }
    }

    public static boolean f(Context context) {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(g(context) && d(context) && k7.b(context, AcBaseConstants.c.PKGNAME_OP_XOR_8) >= 82800);
        b = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static boolean g(Context context) {
        if (!context.getPackageManager().hasSystemFeature(AcBaseConstants.c.PROPERTY_FEATURE_RED_XOR8)) {
            String str = AcBaseConstants.c.BRAND_RED;
            String str2 = Build.BRAND;
            if (!str.equalsIgnoreCase(str2) && !"Kepler".equalsIgnoreCase(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean h() {
        return "OverSeas".equalsIgnoreCase(yj.a("persist.sys.oem.region", ""));
    }
}
