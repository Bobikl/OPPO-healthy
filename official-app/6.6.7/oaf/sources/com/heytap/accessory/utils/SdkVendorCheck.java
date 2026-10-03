package com.heytap.accessory.utils;

import android.os.Build;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SdkVendorCheck {
    private static String strBrand = Build.BRAND;
    private static String strManufacturer = Build.MANUFACTURER;

    private SdkVendorCheck() {
    }

    public static boolean isOppoDevice() {
        String str = strBrand;
        if (str == null || strManufacturer == null) {
            return false;
        }
        return str.compareToIgnoreCase("OPPO") == 0 || strManufacturer.compareToIgnoreCase("OPPO") == 0;
    }
}
