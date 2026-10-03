package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.squareup.moshi.Json;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class u1n {
    public static final String b = w0n.t("SRFZHZUVZT3BOa0ZiemZRQQ");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f17262c = w0n.t("FbGJzX3Nkaw");
    public static final String d = w0n.t("SWjJuYVh2eEMwSzVmNklFSmh0UXpVb2xtOVM4eU9Ua3E");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17263e = w0n.t("FQU5EU0RLMTA");
    public static final String f = w0n.t("FMTAw");
    public static boolean g = false;
    public String a = "";

    public class a implements p0n.c {
        public u1n a = new u1n();

        @Override // com.oplus.aiunit.vision.p0n.c
        public final String a() {
            return u1n.e();
        }

        @Override // com.oplus.aiunit.vision.p0n.c
        public final com.amap.api.col.p0003sl.la b(byte[] bArr, Map<String, String> map) {
            return new com.amap.api.col.p0003sl.h0(bArr, map);
        }

        @Override // com.oplus.aiunit.vision.p0n.c
        public final String c(String str, String str2, String str3, String str4) {
            return this.a.c(str, str2, str3, str4);
        }

        @Override // com.oplus.aiunit.vision.p0n.c
        public final String a(Context context, String str) {
            return u1n.b(context, str);
        }

        @Override // com.oplus.aiunit.vision.p0n.c
        public final Map<String, String> b() {
            return this.a.d();
        }
    }

    public static p0n.c a() {
        return new a();
    }

    public static String b(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt(w0n.t("UY29kZQ")) != 1) {
                return "";
            }
            String strOptString = new JSONObject(jSONObject.optString(w0n.t("FZGF0YQ"))).optString(w0n.t("FYWRpdQ"));
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            v1n.b(strOptString);
            q1n.a(context).c(strOptString);
            return strOptString;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String e() {
        return v1n.a();
    }

    public final String c(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(w0n.t("LdGlk"), str);
            jSONObject.put(w0n.t("FZGl1"), str2);
            jSONObject.put(w0n.t("AZGl1Mg"), str3);
            jSONObject.put(w0n.t("EZGl1Mw"), str4);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String string = jSONObject.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String strB = x1n.b();
        if (!TextUtils.isEmpty(strB)) {
            String strA = s1n.a(e3n.a((string + Json.UNSET_NAME).getBytes(), strB.getBytes()));
            if (!TextUtils.isEmpty(strA)) {
                try {
                    return w0n.t("Fa2V5PQ") + URLEncoder.encode(s1n.a(w1n.b(strB.getBytes("utf-8"), w1n.a(f())))) + w0n.t("SJmRhdGE9") + URLEncoder.encode(strA);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    public final synchronized Map<String, String> d() {
        if (g) {
            return null;
        }
        g = true;
        HashMap map = new HashMap();
        map.put(w0n.t("FZW50"), w0n.t("FMg"));
        StringBuilder sb = new StringBuilder();
        sb.append(w0n.t("SY2hhbm5lbD0"));
        String str = f17262c;
        sb.append(str);
        sb.append(w0n.t("SJmRpdj0"));
        String str2 = f17263e;
        sb.append(str2);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(str2);
        stringBuffer.append(w0n.t("FQA"));
        stringBuffer.append(d);
        String strD = x1n.d(stringBuffer.toString());
        sb.append(w0n.t("FJnNpZ249"));
        sb.append(strD.toUpperCase(Locale.US));
        sb.append(w0n.t("SJm91dHB1dD1qc29u") + Json.UNSET_NAME);
        map.put(w0n.t("FaW4"), s1n.a(e3n.a(sb.toString().getBytes(), b.getBytes())));
        map.put(w0n.t("Sa2V5dA"), f);
        return map;
    }

    public final String f() {
        if (!TextUtils.isEmpty(this.a)) {
            return this.a;
        }
        String strA = q0n.a("TUpJaVFGNk5LXHtSX1ZwQlRiV1VVZmtYWU1haV1hYWHCiXJtZcKLdmp8wpFewo1/wphwwoFzZmR8aWp6X2k6XsKDwoF+WGbChGdAScKLwoVXfmNxYEvCjcKLSG7CjGNvwoZtVFZ7WMKXYMKfwo5dZcKHfzZXUG85X0hNOVJrb2U8ZlJGW8KCe8KOV8KQWllrcGrCjcKIT25lUHPCicKGVsKKeG5fwp56XsKbc8KJbUVYR0pqU09gfE5/WT5YeHNAwoDCh1Z4V8KQT3JQYmxQbcKYwpFxdG/Ci3rCmMKQwop+YVbCmWFxwpxBdW07Zjp/ODlAbcKEY1pQwoJowohbV1VmV1laWmtcYGbClXfCk2NvesKdwohdWFnCol/CjWTCmMKicG1ENnAvPFtpcXtfclhfXsKAwolgRWNbS29OwpFafV3CkMKLTcKCwolrU3DCmGnCmX9wdsKPcXDCg3LCnFpGcDVTeTxNWW07bXJePVRfQn3ChGNraFhbwpNcwpXChMKNaFVjeVF8wojChm9YbmvChGDCmHvChGVQWjo0Z3o9djleOztWcVxSfWE9woLChkZdcGTCgVzCjMKUVE12wpV5bcKVwprCnntZworCgsKfwpHCksKnwpHClURURW9YaDtwXU1bck5YX3hSVFZUYlxKWFlua1xeYm9jU8KDa3ZrwpZ5am9Za3jCknR3fA");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strA.length(); i++) {
            stringBuffer.append((char) (strA.charAt(i) - (i % 48)));
        }
        String string = stringBuffer.toString();
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i2 = 0; i2 < string.length() / 2; i2++) {
            stringBuffer2.append((char) ((string.charAt(i2) + string.charAt((string.length() - 1) - i2)) / 2));
        }
        String string2 = stringBuffer2.toString();
        this.a = string2;
        return string2;
    }
}
