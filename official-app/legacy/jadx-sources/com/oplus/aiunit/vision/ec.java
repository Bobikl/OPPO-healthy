package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.util.AcLogUtil;

/* JADX INFO: loaded from: classes6.dex */
public class ec {
    public static String a = "";

    public static boolean a(Context context, String str) {
        jf.B().x(context, str);
        return jf.B().m(context) != null;
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        hl.a(context);
        hl.b(context);
    }

    public static String c(Context context) {
        try {
            String strF = hl.f(context);
            return strF != null ? strF : "0";
        } catch (Exception e2) {
            AcLogUtil.e("AcAccountUtils", "getAccountIdTokenHash e: " + e2.getMessage());
            return "0";
        }
    }

    public static String d(Context context) {
        try {
            String strD = hl.d(context);
            return strD != null ? strD : "0";
        } catch (Throwable th) {
            AcLogUtil.e("AcAccountUtils", "getAccountInfoHash error", th);
            return "0";
        }
    }

    public static Intent e(Context context, String str, String str2, String str3) {
        AcLogUtil.i("AcAccountUtils", "getAccountInfoImplicitIntent invoke  traceId=" + str2, true);
        Intent intent = new Intent();
        intent.setAction(str);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage(context.getPackageName());
        intent.putExtra(AcBaseConstants.a.HEADER_BIZ_TRACE_ID, str2);
        intent.putExtra("from", str3);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        AcLogUtil.d("AcAccountUtils", "getAccountInfoImplicitIntent created implicit intent");
        return intent;
    }

    public static int f(Context context) {
        try {
            return hl.e(context);
        } catch (Throwable th) {
            AcLogUtil.e("AcAccountUtils", "get login status error: " + th);
            return 0;
        }
    }

    public static String g(Context context) {
        if (TextUtils.isEmpty(a)) {
            String strH = jf.B().h(context, AcBaseConstants.a.X_SYS_DUID);
            a = strH;
            if (TextUtils.isEmpty(strH)) {
                a = o8.d(context) + m7.b();
                jf.B().s(context, AcBaseConstants.a.X_SYS_DUID, a);
            }
        }
        return a;
    }

    public static String h(Context context) {
        return l(context, (String) lg.e().a(context).b("SP_KEY_SDK_CONFIG", ""));
    }

    public static boolean i(Context context) {
        try {
            String strC = c(context);
            String strM = jf.B().m(context);
            return strM == null ? a(context, strC) : !TextUtils.equals(strM, strC);
        } catch (Exception e2) {
            AcLogUtil.e("AcAccountUtils", "isAccountChange e:" + e2.getMessage());
            return false;
        }
    }

    public static boolean j(Context context) {
        String strD = d(context);
        if (TextUtils.isEmpty(strD) || "0".equals(strD)) {
            AcLogUtil.i("AcAccountUtils", "isAccountInfoChanged ac version is not support");
            return true;
        }
        String strL = jf.B().l(context);
        if (strL == null) {
            return true;
        }
        return !TextUtils.equals(strL, strD);
    }

    public static String k(String str, String str2) {
        JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
        JsonObject asJsonObject2 = JsonParser.parseString(str2).getAsJsonObject();
        for (String str3 : asJsonObject2.keySet()) {
            asJsonObject.add(str3, asJsonObject2.get(str3));
        }
        return asJsonObject.toString();
    }

    public static String l(Context context, String str) {
        try {
            String strA = s8.a(context, "open_req_feq_config.json");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strA)) {
                AcLogUtil.i("AcAccountUtils", "merge json");
                str = k(strA, str);
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            AcLogUtil.i("AcAccountUtils", "read default json");
            return strA;
        } catch (Throwable th) {
            AcLogUtil.e("AcAccountUtils", "getSdkConfig fail", th);
            return "";
        }
    }
}
