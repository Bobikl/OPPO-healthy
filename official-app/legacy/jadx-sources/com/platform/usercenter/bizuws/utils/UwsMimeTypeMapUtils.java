package com.platform.usercenter.bizuws.utils;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;

/* JADX INFO: loaded from: classes9.dex */
public class UwsMimeTypeMapUtils {
    public static String getFileExtensionFromUrl(String str) {
        int iLastIndexOf;
        String lowerCase = str.toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            return "";
        }
        int iLastIndexOf2 = lowerCase.lastIndexOf(35);
        if (iLastIndexOf2 > 0) {
            lowerCase = lowerCase.substring(0, iLastIndexOf2);
        }
        int iLastIndexOf3 = lowerCase.lastIndexOf(63);
        if (iLastIndexOf3 > 0) {
            lowerCase = lowerCase.substring(0, iLastIndexOf3);
        }
        int iLastIndexOf4 = lowerCase.lastIndexOf(47);
        if (iLastIndexOf4 >= 0) {
            lowerCase = lowerCase.substring(iLastIndexOf4 + 1);
        }
        return (lowerCase.isEmpty() || (iLastIndexOf = lowerCase.lastIndexOf(46)) < 0) ? "" : lowerCase.substring(iLastIndexOf + 1);
    }

    public static String getMimeTypeFromExtension(String str) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
    }

    public static String getMimeTypeFromUrl(String str) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(getFileExtensionFromUrl(str));
    }
}
