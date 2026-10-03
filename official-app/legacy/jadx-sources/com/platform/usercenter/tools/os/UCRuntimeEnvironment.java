package com.platform.usercenter.tools.os;

import android.content.Context;
import com.oplus.aiunit.vision.alf;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.basic.provider.UCSystemInfoXor8Provider;
import com.platform.usercenter.tools.device.UCDeviceInfoUtil;

/* JADX INFO: loaded from: classes9.dex */
public class UCRuntimeEnvironment {
    public static boolean isOrange = false;
    public static boolean isRed = false;
    private static boolean mHasInit = false;
    public static int mRomVersionCode = 0;
    public static String regionMark = "CN";
    public static boolean sIsExp;

    public static String getXBusinessSystem() {
        if (isOrange) {
            return UCCommonXor8Provider.getBrandOrangeUppercase();
        }
        return isRed ? UCCommonXor8Provider.getBrandRed() : UCCommonXor8Provider.getBrandGreenUppercase();
    }

    public static void init(Context context) {
        boolean z;
        boolean z2;
        if (mHasInit) {
            return;
        }
        boolean z3 = true;
        mHasInit = true;
        mRomVersionCode = UCOSVersionUtil.getOSVersionCode();
        isOrange = UCDeviceInfoUtil.isOrange();
        isRed = UCDeviceInfoUtil.isRed(context);
        regionMark = UCDeviceInfoUtil.getRegionMark();
        boolean zIsRedExpOS = isRedExpOS();
        int i = mRomVersionCode;
        if (i > 18) {
            z2 = !"CN".equalsIgnoreCase(regionMark);
            z = false;
        } else {
            z = i <= 9 ? alf.US.equalsIgnoreCase(SystemPropertyUtils.get(UCSystemInfoXor8Provider.expPropertySystemNameXor8(), "")) || zIsRedExpOS : context.getPackageManager().hasSystemFeature(UCSystemInfoXor8Provider.getExpSystemFeatureNameXor8()) || zIsRedExpOS;
            z2 = false;
        }
        if (!zIsRedExpOS && !z && !z2) {
            z3 = false;
        }
        sIsExp = z3;
    }

    private static boolean isRedExpOS() {
        return "OverSeas".equalsIgnoreCase(SystemPropertyUtils.get("persist.sys.oem.region", ""));
    }
}
