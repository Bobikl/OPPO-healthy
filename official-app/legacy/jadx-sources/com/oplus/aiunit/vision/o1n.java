package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class o1n {
    public v0n a;

    public static class a {
        public static Map<String, o1n> a = new HashMap();
    }

    public static class b {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f14739c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.f14739c = str3;
        }

        public static b a(JSONObject jSONObject) {
            try {
                return new b(jSONObject.optString(Fields.SDK_VERSION), jSONObject.optString("cpuType"), jSONObject.optString("content"));
            } catch (Throwable unused) {
                return null;
            }
        }

        public static List<b> d(String str) {
            if (TextUtils.isEmpty(str)) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(a(jSONArray.getJSONObject(i)));
                }
                return arrayList;
            } catch (Throwable unused) {
                return new ArrayList();
            }
        }

        public static JSONArray e(List<b> list) {
            if (list == null) {
                return new JSONArray();
            }
            JSONArray jSONArray = new JSONArray();
            for (b bVar : list) {
                if (bVar != null) {
                    if (!TextUtils.isEmpty(bVar.f14739c)) {
                        jSONArray.put(bVar.f());
                    }
                }
            }
            return jSONArray;
        }

        public final JSONObject f() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Fields.SDK_VERSION, this.a);
                jSONObject.put("cpuType", this.b);
                jSONObject.put("content", this.f14739c);
                return jSONObject;
            } catch (Throwable unused) {
                return new JSONObject();
            }
        }

        public final boolean g(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                str = this.a;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = this.b;
            }
            return this.a.equals(str) && this.b.equals(str2);
        }
    }

    public o1n(v0n v0nVar) {
        this.a = v0nVar;
    }

    public static o1n a(v0n v0nVar) {
        if (v0nVar == null || TextUtils.isEmpty(v0nVar.a())) {
            return null;
        }
        if (a.a.get(v0nVar.a()) == null) {
            a.a.put(v0nVar.a(), new o1n(v0nVar));
        }
        return a.a.get(v0nVar.a());
    }

    public static String b(Context context, String str, String str2) {
        return e(context, "C7ADB20F22F238708BA5EE26D0401DB9" + t0n.d(str), "ik".concat(String.valueOf(str2)));
    }

    public static String e(Context context, String str, String str2) {
        return (context == null || TextUtils.isEmpty(str2)) ? "" : w0n.g(m0n.e(w0n.x(context.getSharedPreferences(str, 0).getString(str2, ""))));
    }

    public static void f(Context context, String str, String str2, String str3) {
        if (str3 == null || TextUtils.isEmpty(str)) {
            return;
        }
        g(context, "C7ADB20F22F238708BA5EE26D0401DB9" + t0n.d(str), "ik".concat(String.valueOf(str2)), str3);
    }

    public static void g(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return;
        }
        String strD = w0n.D(m0n.c(w0n.n(str3)));
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, strD);
        editorEdit.commit();
    }

    public final String c(Context context, String str, String str2, String str3) {
        v0n v0nVar;
        if (context != null && (v0nVar = this.a) != null && !TextUtils.isEmpty(v0nVar.a())) {
            List<b> listD = b.d(b(context, this.a.a(), str3));
            if (listD.size() == 0) {
                return "";
            }
            for (int i = 0; i < listD.size(); i++) {
                b bVar = listD.get(i);
                if (bVar.g(str, str2)) {
                    return bVar.f14739c;
                }
            }
        }
        return null;
    }

    public final void d(Context context, String str, String str2, String str3, String str4) {
        v0n v0nVar;
        if (context == null || (v0nVar = this.a) == null || TextUtils.isEmpty(v0nVar.a())) {
            return;
        }
        List<b> listD = b.d(b(context, this.a.a(), str3));
        for (int i = 0; i < listD.size(); i++) {
            b bVar = listD.get(i);
            if (bVar.g(str, str2)) {
                bVar.f14739c = str4;
                f(context, this.a.a(), str3, b.e(listD).toString());
                return;
            }
        }
        listD.add(new b(str, str2, str4));
        f(context, this.a.a(), str3, b.e(listD).toString());
    }
}
