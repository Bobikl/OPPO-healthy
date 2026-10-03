package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import com.oplus.aiunit.vision.vam;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static b a(String str) {
        try {
            if (!vam.c(str)) {
                JSONObject jSONObject = new JSONObject(str);
                return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"));
            }
        } catch (Exception e2) {
            com.alipay.apmobilesecuritysdk.c.a.a(e2);
        }
        return null;
    }

    public static synchronized b b() {
        String strA = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
        if (vam.c(strA)) {
            return null;
        }
        return a(strA);
    }

    public static synchronized b c(Context context) {
        String strA = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
        if (vam.c(strA)) {
            return null;
        }
        return a(strA);
    }

    public static synchronized void a() {
    }

    public static synchronized b b(Context context) {
        String strA;
        strA = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
        if (vam.c(strA)) {
            strA = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
        }
        return a(strA);
    }

    public static synchronized void a(Context context) {
        com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", "");
        com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", "");
    }

    public static synchronized void a(Context context, b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apdid", bVar.a);
            jSONObject.put("deviceInfoHash", bVar.b);
            jSONObject.put("timestamp", bVar.f568c);
            String string = jSONObject.toString();
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", string);
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", string);
        } catch (Exception e2) {
            com.alipay.apmobilesecuritysdk.c.a.a(e2);
        }
    }
}
