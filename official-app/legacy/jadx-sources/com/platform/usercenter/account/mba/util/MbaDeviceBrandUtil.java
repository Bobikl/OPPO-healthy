package com.platform.usercenter.account.mba.util;

import android.os.Build;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;

/* JADX INFO: loaded from: classes9.dex */
public class MbaDeviceBrandUtil {
    public static boolean isOplusBrand() {
        String str = Build.BRAND;
        return UCCommonXor8Provider.isBrandGreen(str) || UCCommonXor8Provider.isBrandRed(str) || UCCommonXor8Provider.isBrandOrange(str);
    }
}
