package com.heytap.store.base.core.util;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class QuickAppUtil {
    private static final String IS_QUICK = "is_quick=";
    private static final String QUICK_APP = "hap://app";
    private static final String QUICK_GAME = "hap://game";
    private static final String QUICK_LINK = "&quick_link=";
    private static final String QUICK_VERSION = "&quick_version=";

    private static boolean isNoSupportQuickLink(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.contains(IS_QUICK) && str.contains(QUICK_VERSION) && str.contains(QUICK_LINK)) {
                int iIndexOf = str.indexOf(IS_QUICK) + 9;
                int iIndexOf2 = str.indexOf(QUICK_VERSION);
                if (!"1".equals(str.substring(iIndexOf, iIndexOf2))) {
                    return false;
                }
                int i = iIndexOf2 + 15;
                int iIndexOf3 = str.indexOf(QUICK_LINK);
                if (!QuickAppProxy.getInstance().isInstantPlatformInstalled()) {
                    return true;
                }
                if (Long.valueOf(str.substring(i, iIndexOf3)).longValue() > Long.valueOf(QuickAppProxy.getInstance().getInstantVersion()).longValue()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isNoSupportQuickProgram(String str) {
        return isNoSupportQuickLink(str);
    }

    public static boolean isOPPOPhone() {
        return DeviceInfoUtil.isOPPOBrand();
    }

    public static boolean isSupportQuickLink(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (!str.contains(IS_QUICK) || !str.contains(QUICK_VERSION) || !str.contains(QUICK_LINK)) {
                return false;
            }
            int iIndexOf = str.indexOf(IS_QUICK) + 9;
            int iIndexOf2 = str.indexOf(QUICK_VERSION);
            if ("1".equals(str.substring(iIndexOf, iIndexOf2))) {
                return Long.valueOf(str.substring(iIndexOf2 + 15, str.indexOf(QUICK_LINK))).longValue() <= Long.valueOf(QuickAppProxy.getInstance().getInstantVersion()).longValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isWXMiniProgram(String str) {
        return !TextUtils.isEmpty(str) && str.contains("WXMiniProgramID");
    }

    private static boolean startsWithQuickLink(String str) {
        return TextUtils.isEmpty(str) || str.startsWith(QUICK_APP) || str.startsWith(QUICK_GAME);
    }

    public static String subLink(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.contains(QUICK_LINK)) {
                String strSubstring = str.substring(str.indexOf(QUICK_LINK) + 12, str.length());
                if (startsWithQuickLink(strSubstring)) {
                    return strSubstring;
                }
            }
            return (!TextUtils.isEmpty(str) && isWXMiniProgram(str) && str.contains("www.opposhop.cn/app/store")) ? str.substring(str.indexOf("www.opposhop.cn/app/store")) : str;
        } catch (Exception unused) {
            return str;
        }
    }
}
