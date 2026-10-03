package com.oplus.aiunit.vision;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class hgf {
    /* JADX WARN: Code duplicated, block: B:10:0x001b A[Catch: JSONException -> 0x0021, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0021, blocks: (B:4:0x0006, B:6:0x000c, B:9:0x0015, B:10:0x001b), top: B:22:0x0006 }] */
    public static String a(String str, int i, long j2) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                if (str.isEmpty() || str.equals("{}")) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(str);
                }
            } catch (JSONException e2) {
                z6b.p("ReconciliationUtil", "json parse failed.", e2);
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("count", jSONObject.optLong("count", 0L) + j2);
            String string = Integer.toString(i);
            jSONObject.put(string, jSONObject.optLong(string, 0L) + j2);
        } catch (JSONException e3) {
            z6b.p("ReconciliationUtil", "json put failed.", e3);
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b A[Catch: JSONException -> 0x0021, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0021, blocks: (B:4:0x0006, B:6:0x000c, B:9:0x0015, B:10:0x001b), top: B:22:0x0006 }] */
    public static String b(String str, long j2) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                if (str.isEmpty() || str.equals("{}")) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(str);
                }
            } catch (JSONException e2) {
                z6b.p("ReconciliationUtil", "json parse failed.", e2);
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("retry_total", jSONObject.optLong("retry_total", 0L) + j2);
        } catch (JSONException e3) {
            z6b.p("ReconciliationUtil", "json put failed.", e3);
        }
        return jSONObject.toString();
    }

    public static long c(long j2) {
        return (j2 / 3600000) * 3600000;
    }

    public static long d(String str) {
        if (str == null || str.isEmpty() || str.equals("{}")) {
            return 0L;
        }
        try {
            return new JSONObject(str).optLong("count", 0L);
        } catch (Exception unused) {
            return 0L;
        }
    }
}
