package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Binder;
import com.google.gson.Gson;
import com.heytap.health.wallet.service.model.ResultData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class moa {
    public static String a(Context context) {
        return b(context, null);
    }

    public static String b(Context context, String str) {
        try {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid != null && packagesForUid.length > 0) {
                if (packagesForUid.length > 1) {
                    t6b.h("get Mul PackageName size:" + packagesForUid.length);
                }
                if (str != null) {
                    for (String str2 : packagesForUid) {
                        if (str.equals(str2)) {
                            return str;
                        }
                    }
                }
                return packagesForUid[0];
            }
            return null;
        } catch (Exception e2) {
            t6b.b("Wallet_MainActivity", "Exception e =" + e2.getMessage());
            return null;
        }
    }

    public static String c(String str, Context context) {
        try {
            return x70.d(str, context);
        } catch (Exception e2) {
            t6b.b("Wallet_MainActivity", "Exception e =" + e2.getMessage());
            return null;
        }
    }

    public static final boolean d() {
        return gl4.managerApi.isCurrentConnected();
    }

    public static boolean e(Context context) {
        return rpc.c();
    }

    public static String f(String str, String str2, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pkg", str);
            jSONObject.put("sign", str2);
            jSONObject.put("timestamp", j2);
        } catch (JSONException e2) {
            t6b.b("Wallet_MainActivity", "JSONException e =" + e2.getMessage());
        } catch (Exception e3) {
            t6b.b("Wallet_MainActivity", "Exception e =" + e3.getMessage());
        }
        return jSONObject.toString();
    }

    public static String g(ResultData resultData) {
        String json = new Gson().toJson(resultData);
        if (resultData != null && resultData.getResultCode() != 0) {
            t6b.i("Wallet_MainActivity", json);
        }
        return json;
    }
}
