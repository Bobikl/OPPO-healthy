package com.oplus.aiunit.vision;

import android.content.Context;
import com.amap.api.services.core.AMapException;

/* JADX INFO: loaded from: classes12.dex */
public final class izm {
    public static x3n a;

    public static String a(AMapException aMapException) {
        if (aMapException == null) {
            return null;
        }
        if (aMapException.getErrorLevel() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(aMapException.getErrorCode());
            return sb.toString();
        }
        int errorCode = aMapException.getErrorCode();
        if (errorCode == 0) {
            return "4";
        }
        int iPow = (int) Math.pow(10.0d, Math.floor(Math.log10(errorCode)));
        return String.valueOf((errorCode % iPow) + (iPow * 4));
    }

    public static String b(String str, long j2, boolean z) {
        try {
            return n04.OPEN_BRACE_REGEX + "\"RequestPath\":\"" + str + "\",\"ResponseTime\":" + j2 + ",\"Success\":" + z + "}";
        } catch (Throwable th) {
            qxm.g(th, "StatisticsUtil", "generateNetWorkResponseStatisticsEntity");
            return null;
        }
    }

    public static String c(String str, boolean z) {
        try {
            String strSubstring = "";
            int iIndexOf = str.indexOf("?");
            int length = str.length();
            if (iIndexOf > 0) {
                String strSubstring2 = str.substring(0, iIndexOf);
                int i = iIndexOf + 1;
                strSubstring = i < length ? str.substring(i) : "";
                str = strSubstring2;
            }
            return n04.OPEN_BRACE_REGEX + "\"RequestPath\":\"" + str + "\",\"RequestParm\":\"" + strSubstring + "\",\"IsCacheRequest\":" + z + "}";
        } catch (Throwable th) {
            qxm.g(th, "StatisticsUtil", "generateNetWorkResponseStatisticsEntity");
            return null;
        }
    }

    public static void d(Context context, String str, long j2, boolean z) {
        try {
            String strB = b(str, j2, z);
            if (strB != null && strB.length() > 0) {
                if (a == null) {
                    a = new x3n(context, "sea", "9.7.4", "O002");
                }
                a.a(strB);
                y3n.d(a, context);
            }
        } catch (Throwable th) {
            qxm.g(th, "StatisticsUtil", "recordResponseAction");
        }
    }

    public static void e(Context context, String str, boolean z) {
        try {
            String strC = c(str, z);
            if (strC != null && strC.length() > 0) {
                x3n x3nVar = new x3n(context, "sea", "9.7.4", "O006");
                x3nVar.a(strC);
                y3n.d(x3nVar, context);
            }
        } catch (Throwable th) {
            qxm.g(th, "StatisticsUtil", "recordResponseAction");
        }
    }

    public static void f(String str, String str2, AMapException aMapException) {
        if (str != null) {
            String errorType = aMapException.getErrorType();
            String strA = a(aMapException);
            if (strA == null || strA.length() <= 0) {
                return;
            }
            c2n.k(pxm.a(true), str, errorType, str2, strA);
        }
    }
}
