package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class sam {
    public static final String a = "ap_req";
    public static final String b = "ap_args";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f16524c = "ap_resp";

    public static bam a() {
        try {
            try {
                return dam.b("NP", System.currentTimeMillis(), new skm(chm.e().d()), (short) l9m.c.a(chm.e().c()), new evm());
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return dam.c();
        }
    }

    public static HashMap<String, String> b(qam qamVar) {
        HashMap<String, String> map = new HashMap<>();
        try {
            bam bamVarA = a();
            JSONObject jSONObject = new JSONObject();
            Context contextA = qamVar != null ? qamVar.a() : null;
            if (contextA == null) {
                contextA = chm.e().c().getApplicationContext();
            }
            String strL = com.alipay.sdk.m.u.a.l(qamVar, contextA);
            String strC = fgm.c(qamVar, contextA);
            jSONObject.put("ap_q", bamVarA != null ? bamVarA.a() : "");
            jSONObject.put(qam.z, qamVar != null ? qamVar.d : "");
            jSONObject.put("u_pd", String.valueOf(com.alipay.sdk.m.u.a.U()));
            jSONObject.put("u_lk", String.valueOf(com.alipay.sdk.m.u.a.N(com.alipay.sdk.m.u.a.A())));
            jSONObject.put("u_pi", String.valueOf(qamVar != null ? qamVar.g : "_"));
            jSONObject.put("u_fu", strL);
            jSONObject.put("u_oi", strC);
            map.put(a, jSONObject.toString());
            StringBuilder sb = new StringBuilder();
            sb.append(bamVarA != null ? bamVarA.a() : "");
            sb.append("|");
            sb.append(strL);
            l9m.c(qamVar, sgm.f16581l, "ap_q", sb.toString());
        } catch (Exception e2) {
            l9m.d(qamVar, sgm.f16581l, "APMEx1", e2);
        }
        return map;
    }

    public static JSONObject c(qam qamVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(f16524c);
        try {
            if (TextUtils.isEmpty(strOptString)) {
                return null;
            }
            return new JSONObject(strOptString);
        } catch (JSONException e2) {
            l9m.d(qamVar, sgm.f16581l, "APMEx2", e2);
            return null;
        }
    }

    public static void d(qam qamVar, HashMap<String, String> map) {
        JSONObject jSONObjectB = h9m.I().b();
        if (map == null || jSONObjectB == null) {
            return;
        }
        l9m.c(qamVar, sgm.f16581l, "ap_r", jSONObjectB.optString("ap_r"));
        map.putAll(com.alipay.sdk.m.u.a.r(jSONObjectB));
    }

    public static void e(qam qamVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            jSONObject.putOpt(b, jSONObject2);
        } catch (JSONException e2) {
            l9m.d(qamVar, sgm.f16581l, "APMEx2", e2);
        }
    }
}
