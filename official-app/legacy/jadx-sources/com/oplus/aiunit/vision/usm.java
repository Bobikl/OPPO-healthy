package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.cloud.sdk.cloudstorage.http.FileSyncModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class usm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f17590c = "msp-gzip";
    public static final String d = "Msp-Param";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17591e = "Operation-Type";
    public static final String f = "content-type";
    public static final String g = "Version";
    public static final String h = "AppId";
    public static final String i = "des-mode";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f17592j = "namespace";
    public static final String k = "api_name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f17593l = "api_version";
    public static final String m = "data";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f17594n = "params";
    public static final String o = "public_key";
    public static final String p = "device";
    public static final String q = "action";
    public static final String r = "type";
    public static final String s = "method";
    public boolean a = true;
    public boolean b = true;

    public static String e(mam.b bVar, String str) {
        Map<String, List<String>> map;
        List<String> list;
        if (bVar == null || str == null || (map = bVar.a) == null || (list = map.get(str)) == null) {
            return null;
        }
        return TextUtils.join(",", list);
    }

    public static JSONObject k(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put("method", str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public static boolean l(mam.b bVar) {
        return Boolean.valueOf(e(bVar, f17590c)).booleanValue();
    }

    public static boolean m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            if (!jSONObject.has("params")) {
                return false;
            }
            String strOptString = jSONObject.getJSONObject("params").optString(o, null);
            if (TextUtils.isEmpty(strOptString)) {
                return false;
            }
            ugm.c(strOptString);
            return true;
        } catch (JSONException e2) {
            qrm.d(e2);
            return false;
        }
    }

    public ygm a(qam qamVar, Context context) throws Throwable {
        return b(qamVar, context, "");
    }

    public ygm b(qam qamVar, Context context, String str) throws Throwable {
        return c(qamVar, context, str, t4n.a(context));
    }

    public ygm c(qam qamVar, Context context, String str, String str2) throws Throwable {
        return d(qamVar, context, str, str2, true);
    }

    public ygm d(qam qamVar, Context context, String str, String str2, boolean z) throws Throwable {
        qrm.f(ham.A, "Packet: " + str2);
        xkm xkmVar = new xkm(this.b);
        ygm ygmVar = new ygm(f(qamVar), g(qamVar, str, j()));
        Map<String, String> mapI = i(false, str);
        vom vomVarC = xkmVar.c(ygmVar, this.a, mapI.get("iSr"));
        mam.b bVarA = mam.a(context, new mam.a(str2, i(vomVarC.b(), str), vomVarC.a()));
        if (bVarA == null) {
            throw new RuntimeException("Response is null.");
        }
        ygm ygmVarB = xkmVar.b(new vom(l(bVarA), bVarA.f14006c), mapI.get("iSr"));
        return (ygmVarB != null && m(ygmVarB.b()) && z) ? d(qamVar, context, str, str2, false) : ygmVarB;
    }

    public String f(qam qamVar) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        map.put("device", Build.MODEL);
        map.put(f17592j, "com.alipay.mobilecashier");
        map.put(k, "com.alipay.mcpay");
        map.put(f17593l, n());
        return h(qamVar, map, new HashMap<>());
    }

    public String g(qam qamVar, String str, JSONObject jSONObject) {
        chm chmVarE = chm.e();
        ram ramVarA = ram.a(chmVarE.c());
        JSONObject jSONObjectA = yom.a(new JSONObject(), jSONObject);
        try {
            jSONObjectA.put("external_info", str);
            jSONObjectA.put("tid", ramVarA.g());
            jSONObjectA.put("user_agent", chmVarE.a().b(qamVar, ramVarA, o()));
            jSONObjectA.put("has_alipay", com.alipay.sdk.m.u.a.w(qamVar, chmVarE.c(), gam.d, false));
            jSONObjectA.put("has_msp_app", com.alipay.sdk.m.u.a.Z(chmVarE.c()));
            jSONObjectA.put("app_key", ham.g);
            jSONObjectA.put("utdid", chmVarE.d());
            jSONObjectA.put("new_client_key", ramVarA.f());
            jSONObjectA.put("pa", ugm.e(chmVarE.c()));
        } catch (Throwable th) {
            l9m.d(qamVar, sgm.f16581l, "BodyErr", th);
            qrm.d(th);
        }
        return jSONObjectA.toString();
    }

    public String h(qam qamVar, HashMap<String, String> map, HashMap<String, String> map2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        if (map2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
        }
        jSONObject.put("data", jSONObject2);
        return jSONObject.toString();
    }

    public Map<String, String> i(boolean z, String str) {
        HashMap map = new HashMap();
        map.put(f17590c, String.valueOf(z));
        map.put(f17591e, "alipay.msp.cashier.dispatch.bytes");
        map.put(f, FileSyncModel.streamMime);
        map.put(g, "2.0");
        map.put(h, "TAOBAO");
        map.put(d, nam.a(str));
        map.put(i, "CBC");
        return map;
    }

    public abstract JSONObject j() throws JSONException;

    public String n() {
        return "4.9.0";
    }

    public abstract boolean o();
}
