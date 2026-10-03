package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public class j3n {
    public static final String a = "resultStatus";
    public static final String b = "memo";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f12747c = "result";

    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            if (matcher.find()) {
                return matcher.group(2);
            }
        } catch (Throwable th) {
            qrm.d(th);
        }
        return "?";
    }

    public static Map<String, String> b() {
        com.alipay.sdk.m.j.c cVarB = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.CANCELED.b());
        HashMap map = new HashMap();
        map.put(a, Integer.toString(cVarB.b()));
        map.put(b, cVarB.a());
        map.put("result", "");
        return map;
    }

    public static Map<String, String> c(qam qamVar, String str) {
        Map<String, String> mapB = b();
        try {
            return d(str);
        } catch (Throwable th) {
            l9m.d(qamVar, sgm.f16581l, sgm.q, th);
            return mapB;
        }
    }

    public static Map<String, String> d(String str) {
        String[] strArrSplit = str.split(";");
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            String strSubstring = str2.substring(0, str2.indexOf("={"));
            map.put(strSubstring, e(str2, strSubstring));
        }
        return map;
    }

    public static String e(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }
}
