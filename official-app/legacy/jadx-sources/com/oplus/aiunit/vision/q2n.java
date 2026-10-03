package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.ocs.OmsConfig;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class q2n {
    public v0n a;

    public q2n(String str) {
        this.a = null;
        try {
            this.a = new v0n.a(str, "1.0", OmsConfig.VERSION_NAME).c(new String[]{UTraceSQLiteHelperKt.COL_INFO}).d();
        } catch (com.amap.api.col.p0003sl.ik unused) {
        }
    }

    public static v0n a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String strOptString = jSONObject.optString("a");
            String strOptString2 = jSONObject.optString("b");
            String strOptString3 = jSONObject.optString("c");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("d");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i));
            }
            return new v0n.a(strOptString, strOptString2, strOptString).a(strOptString3).c((String[]) arrayList.toArray(new String[0])).d();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final List<v0n> b(Context context) {
        v0n v0nVarA;
        try {
            JSONArray jSONArray = new JSONArray(p2n.a(context, this.a, "rbck"));
            if (jSONArray.length() == 0) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    v0nVarA = a(jSONArray.getJSONObject(i));
                } catch (JSONException unused) {
                    v0nVarA = null;
                }
                if (v0nVarA != null) {
                    arrayList.add(v0nVarA);
                }
            }
            return arrayList;
        } catch (JSONException unused2) {
            return new ArrayList();
        }
    }

    public final void c(Context context, v0n v0nVar) {
        JSONArray jSONArray;
        if (v0nVar == null) {
            return;
        }
        ArrayList<v0n> arrayList = new ArrayList();
        arrayList.add(v0nVar);
        if (arrayList.size() == 0) {
            jSONArray = new JSONArray();
        } else {
            jSONArray = new JSONArray();
            for (v0n v0nVar2 : arrayList) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("a", v0nVar2.a());
                    jSONObject.put("b", v0nVar2.e());
                    jSONObject.put("c", v0nVar2.f());
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; v0nVar2.i() != null && i < v0nVar2.i().length; i++) {
                        jSONArray2.put(v0nVar2.i()[i]);
                    }
                    jSONObject.put("d", jSONArray2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                jSONArray.put(jSONObject);
            }
        }
        String string = jSONArray.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        p2n.b(context, this.a, "rbck", string);
    }
}
