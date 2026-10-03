package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class j7e {
    public static final String TAG = "ParamUtil";
    public static final String TYPE_CONSTANT = "CONSTANT";
    public static final String TYPE_PARSMETER = "PARSMETER";

    public static String a(bv9 bv9Var, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.hashCode();
        if (str.equals(TYPE_CONSTANT)) {
            return str3;
        }
        if (str.equals(TYPE_PARSMETER)) {
            return c(str3, str2);
        }
        return bv9Var == null ? "" : bv9Var.getParamValue(str);
    }

    public static Map<String, String> b(String str) {
        try {
            HashMap map = new HashMap();
            String strSubstring = str.substring(str.indexOf("?") + 1);
            String[] strArrSplit = strSubstring.contains("&") ? strSubstring.split("&") : new String[]{strSubstring};
            if (strArrSplit.length > 0) {
                for (String str2 : strArrSplit) {
                    String[] strArrSplit2 = str2.split(HttpUtils.EQUAL_SIGN);
                    String strDecode = URLDecoder.decode(strArrSplit2[0], "UTF-8");
                    String strDecode2 = strArrSplit2.length > 1 ? URLDecoder.decode(strArrSplit2[1], "UTF-8") : "";
                    if (!TextUtils.isEmpty(strDecode2) && !"null".equalsIgnoreCase(strDecode2)) {
                        map.put(strDecode, strDecode2);
                    }
                }
            }
            return map;
        } catch (UnsupportedEncodingException e2) {
            q7b.g(TAG, e2);
            return null;
        }
    }

    public static String c(String str, String str2) {
        Map<String, String> mapB;
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (mapB = b(str2)) == null || mapB.size() == 0) ? "" : mapB.get(str);
    }
}
