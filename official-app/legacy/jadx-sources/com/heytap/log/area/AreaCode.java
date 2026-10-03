package com.heytap.log.area;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.util.AppUtil;

/* JADX INFO: loaded from: classes19.dex */
public class AreaCode {
    private String TRACK_REGION;
    private String USER_REGION;
    private String WHO_IS_YOUR_LOWER;
    private byte[] oppoBytes;
    private String TRACK_OP_REGION = "ro.vendor.oplus.regionmark";
    private String USER_PI_REGION = "ro.oplus.pipeline.region";
    private String USER_OPLUS_REGION = "persist.sys.oplus.region";

    public AreaCode() {
        byte[] bArr = {111, 112, 112, 111};
        this.oppoBytes = bArr;
        this.WHO_IS_YOUR_LOWER = String.valueOf(bArr);
        this.USER_REGION = "persist.sys." + this.WHO_IS_YOUR_LOWER + ".region";
        this.TRACK_REGION = "ro." + this.WHO_IS_YOUR_LOWER + ".regionmark";
    }

    public String getCountryCode() {
        String strInnerCountryCode = innerCountryCode();
        return isSupportRegion(strInnerCountryCode) ? strInnerCountryCode : "";
    }

    public String innerCountryCode() {
        String defaultCountry;
        try {
            defaultCountry = AppUtil.getSystemProperties(this.USER_OPLUS_REGION, "");
            try {
                if (!TextUtils.isEmpty(defaultCountry)) {
                    return defaultCountry;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            defaultCountry = "";
        }
        try {
            defaultCountry = AppUtil.getSystemProperties(this.USER_REGION, "");
            if (!TextUtils.isEmpty(defaultCountry)) {
                return defaultCountry;
            }
        } catch (Exception unused3) {
        }
        try {
            defaultCountry = AppUtil.getSystemProperties(this.USER_PI_REGION, "");
            if (!TextUtils.isEmpty(defaultCountry)) {
                return defaultCountry;
            }
        } catch (Exception unused4) {
        }
        try {
            defaultCountry = AppUtil.getSystemProperties(this.TRACK_REGION, "");
            if (!TextUtils.isEmpty(defaultCountry)) {
                return defaultCountry;
            }
        } catch (Exception unused5) {
        }
        try {
            defaultCountry = AppUtil.getSystemProperties(this.TRACK_OP_REGION, "");
            if (!TextUtils.isEmpty(defaultCountry)) {
                return defaultCountry;
            }
        } catch (Exception unused6) {
        }
        if (TextUtils.isEmpty(defaultCountry)) {
            String country = AppUtil.getAppContext().getResources().getConfiguration().locale.getCountry();
            if (AppUtil.getDefaultCountry().equalsIgnoreCase(country)) {
                country = AppUtil.getDefaultCountry();
            }
            defaultCountry = country;
            if (TextUtils.isEmpty(defaultCountry)) {
                defaultCountry = AppUtil.getDefaultCountry();
            }
        }
        Log.d("AreaCode", "autoRegionValue = " + defaultCountry);
        return defaultCountry;
    }

    public boolean isSupportRegion(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "CN".equalsIgnoreCase(str) || "OC".equalsIgnoreCase(str) || AppUtil.AREA_SG_SET.contains(str.toUpperCase()) || AppUtil.getInCountry().equalsIgnoreCase(str);
    }
}
