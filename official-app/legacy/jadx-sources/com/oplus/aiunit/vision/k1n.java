package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class k1n {
    public static int a = 1;
    public static int b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13127c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13128e = System.currentTimeMillis();
    public String f;

    public k1n(int i, String str, String str2) {
        this.f13127c = str2;
        this.d = i;
        this.f = str;
    }

    public static k1n b(String str, String str2) {
        return new k1n(a, str, str2);
    }

    public static String c(int i) {
        return i == b ? "error" : UTraceSQLiteHelperKt.COL_INFO;
    }

    public static String d(List<k1n> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<k1n> it = list.iterator();
                    while (it.hasNext()) {
                        String strH = h(it.next());
                        if (!TextUtils.isEmpty(strH)) {
                            jSONArray.put(strH);
                        }
                    }
                    return jSONArray.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public static boolean e(k1n k1nVar) {
        return (k1nVar == null || TextUtils.isEmpty(k1nVar.g())) ? false : true;
    }

    public static k1n f(String str, String str2) {
        return new k1n(b, str, str2);
    }

    public static String h(k1n k1nVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(UTraceSQLiteHelperKt.COL_INFO, k1nVar.g());
            jSONObject.put("session", k1nVar.j());
            jSONObject.put("timestamp", k1nVar.f13128e);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final int a() {
        return this.d;
    }

    public final String g() {
        new JSONObject();
        return this.f13127c;
    }

    public final String i() {
        return c(this.d);
    }

    public final String j() {
        return this.f;
    }
}
