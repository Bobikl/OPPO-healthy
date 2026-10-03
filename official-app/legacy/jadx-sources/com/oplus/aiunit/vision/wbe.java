package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;
import com.platform.usercenter.account.newcommon.router.LinkInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class wbe {
    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).getBoolean(str2);
        } catch (JSONException unused) {
            return false;
        }
    }

    public static boolean b(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(Context context, String str, String str2) {
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    public static String d(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String e(Context context, String str, String str2) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return (Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(str, PackageManager.ApplicationInfoFlags.of(128L)) : packageManager.getApplicationInfo(str, 128)).metaData.getString(str2);
        } catch (Throwable th) {
            qae.c("getAppMetadata error: " + th.getMessage());
            return null;
        }
    }

    public static String f(Context context) {
        if (j(context)) {
            return ebe.O_PAY_PKG_NAME;
        }
        if (i(context)) {
            return ebe.N_PAY_PKG_NAME;
        }
        return h(context) ? ebe.F_PAY_PKG_NAME : "";
    }

    public static int g(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception unused) {
            qae.b("Not Installed : " + str);
            return 1;
        }
    }

    public static boolean h(Context context) {
        return k(context, ebe.F_PAY_PKG_NAME);
    }

    public static boolean i(Context context) {
        return k(context, ebe.N_PAY_PKG_NAME);
    }

    public static boolean j(Context context) {
        return k(context, ebe.O_PAY_PKG_NAME);
    }

    public static boolean k(Context context, String str) {
        PackageInfo packageInfo;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            qae.b("Not Installed : " + str);
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static void l(Context context, int i, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", i);
            jSONObject.put("order", str);
            jSONObject.put(sbe.PAY_SDK_PREPAYTOKEN, str2);
            jSONObject.put("reportByPaySdk", LinkInfo.CALL_TYPE_SDK);
            jSONObject.put("msg", str4);
            jSONObject.put("expandInfo", str3);
            Intent intent = new Intent(ebe.ACTION_NOTIFY_PAY_RESULT);
            intent.putExtra(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, jSONObject.toString());
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0026;
            nbe.j(i + "", str2, str, value, transactionProcessStatusCodes.getStatusCode(), BizResult.SUCCESS.getValue(), transactionProcessStatusCodes.getDesc() + str4);
        } catch (JSONException e2) {
            qae.b("sendBroadCast : " + e2.getMessage());
        }
    }

    public static String m(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).getString(str2);
        } catch (JSONException unused) {
            return "";
        }
    }
}
