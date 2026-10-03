package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class qam {
    public static final String A = "act_info";
    public static final String B = "UTF-8";
    public static final String C = "new_external_info==";
    public static final String m = "\"&";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f15709n = "&";
    public static final String o = "bizcontext=\"";
    public static final String p = "bizcontext=";
    public static final String q = "\"";
    public static final String r = "appkey";
    public static final String s = "ty";
    public static final String t = "sv";
    public static final String u = "an";
    public static final String v = "setting";
    public static final String w = "av";
    public static final String x = "sdk_start_time";
    public static final String y = "extInfo";
    public static final String z = "ap_link_token";
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f15710c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15711e;
    public final int f;
    public final String g;
    public boolean h = false;
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15712j = false;
    public final ActivityInfo k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sgm f15713l;

    public static final class a {
        public static final HashMap<UUID, qam> a = new HashMap<>();
        public static final HashMap<String, qam> b = new HashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f15714c = "i_uuid_b_c";

        public static qam a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra(f15714c);
            if (serializableExtra instanceof UUID) {
                return a.remove((UUID) serializableExtra);
            }
            return null;
        }

        public static qam b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return b.remove(str);
        }

        public static void c(qam qamVar, Intent intent) {
            if (qamVar == null || intent == null) {
                return;
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            a.put(uuidRandomUUID, qamVar);
            intent.putExtra(f15714c, uuidRandomUUID);
        }

        public static void d(qam qamVar, String str) {
            if (qamVar == null || TextUtils.isEmpty(str)) {
                return;
            }
            b.put(str, qamVar);
        }
    }

    public qam(Context context, String str, String str2) {
        String str3;
        this.a = "";
        this.b = "";
        this.f15710c = null;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        this.f15713l = new sgm(context, zIsEmpty);
        String strJ = j(str, this.b);
        this.d = strJ;
        this.f15711e = SystemClock.elapsedRealtime();
        this.f = com.alipay.sdk.m.u.a.U();
        ActivityInfo activityInfoD = com.alipay.sdk.m.u.a.d(context);
        this.k = activityInfoD;
        this.g = str2;
        if (!zIsEmpty) {
            l9m.c(this, sgm.f16581l, "eptyp", str2 + "|" + strJ);
            if (activityInfoD != null) {
                str3 = activityInfoD.name + "|" + activityInfoD.launchMode;
            } else {
                str3 = "null";
            }
            l9m.c(this, sgm.f16581l, "actInfo", str3);
            l9m.c(this, sgm.f16581l, NotificationCompat.CATEGORY_SYSTEM, com.alipay.sdk.m.u.a.k(this));
            l9m.c(this, sgm.f16581l, "sdkv", ham.k);
        }
        try {
            this.f15710c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.a = packageInfo.versionName;
            this.b = packageInfo.packageName;
        } catch (Exception e2) {
            qrm.d(e2);
        }
        if (!zIsEmpty) {
            l9m.b(this, sgm.f16581l, "u" + com.alipay.sdk.m.u.a.U());
            l9m.c(this, sgm.f16581l, sgm.Q, "" + SystemClock.elapsedRealtime());
            l9m.a(context, this, str, this.d);
        }
        if (zIsEmpty || !h9m.I().y()) {
            return;
        }
        h9m.I().f(this, this.f15710c, true, 2);
    }

    public static HashMap<String, String> f(qam qamVar) {
        HashMap<String, String> map = new HashMap<>();
        if (qamVar != null) {
            map.put("sdk_ver", ham.f12086j);
            map.put("app_name", qamVar.b);
            map.put("token", qamVar.d);
            map.put("call_type", qamVar.g);
            map.put("ts_api_invoke", String.valueOf(qamVar.f15711e));
            sam.d(qamVar, map);
        }
        return map;
    }

    public static String j(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            objArr[2] = Long.valueOf(System.currentTimeMillis());
            objArr[3] = UUID.randomUUID().toString();
            return String.format("EP%s%s_%s", "1", com.alipay.sdk.m.u.a.W(String.format(locale, "%s%s%d%s", objArr)), Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            return "-";
        }
    }

    public static qam w() {
        return null;
    }

    public Context a() {
        return this.f15710c;
    }

    public String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith(C)) {
            return p(str);
        }
        return u(str) ? n(str) : r(str);
    }

    public final String c(String str, String str2) {
        return str + e(new JSONObject()) + str2;
    }

    public final String d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(str2);
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!TextUtils.isEmpty(strArrSplit[i]) && strArrSplit[i].startsWith(str3)) {
                return strArrSplit[i];
            }
        }
        return null;
    }

    public String e(JSONObject jSONObject) {
        String str;
        try {
            if (!jSONObject.has(r)) {
                jSONObject.put(r, ham.g);
            }
            if (!jSONObject.has(s)) {
                jSONObject.put(s, "and_lite");
            }
            if (!jSONObject.has(t)) {
                jSONObject.put(t, ham.i);
            }
            if (!jSONObject.has(u)) {
                jSONObject.put(u, this.b);
            }
            if (!jSONObject.has(w)) {
                jSONObject.put(w, this.a);
            }
            if (!jSONObject.has(x)) {
                jSONObject.put(x, System.currentTimeMillis());
            }
            if (!jSONObject.has(y)) {
                jSONObject.put(y, v());
            }
            if (!jSONObject.has(A)) {
                if (this.k != null) {
                    str = this.k.name + "|" + this.k.launchMode;
                } else {
                    str = "null";
                }
                jSONObject.put(A, str);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            l9m.e(this, sgm.f16581l, "fmt3", th, String.valueOf(jSONObject));
            qrm.d(th);
            return jSONObject != null ? jSONObject.toString() : "{}";
        }
    }

    public void g(boolean z2) {
        this.i = z2;
    }

    public String h() {
        return this.b;
    }

    public final String i(String str) throws JSONException {
        return e(new JSONObject(str));
    }

    public final String k(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject;
        String strSubstring = str.substring(str2.length());
        boolean z2 = false;
        String strSubstring2 = strSubstring.substring(0, strSubstring.length() - str3.length());
        if (strSubstring2.length() >= 2 && strSubstring2.startsWith("\"") && strSubstring2.endsWith("\"")) {
            jSONObject = new JSONObject(strSubstring2.substring(1, strSubstring2.length() - 1));
            z2 = true;
        } else {
            jSONObject = new JSONObject(strSubstring2);
        }
        String strE = e(jSONObject);
        if (z2) {
            strE = "\"" + strE + "\"";
        }
        return str2 + strE + str3;
    }

    public void l(boolean z2) {
        this.h = z2;
    }

    public String m() {
        return this.a;
    }

    public final String n(String str) {
        String str2;
        try {
            String strD = d(str, "&", p);
            if (TextUtils.isEmpty(strD)) {
                str2 = str + "&" + c(p, "");
            } else {
                int iIndexOf = str.indexOf(strD);
                str2 = str.substring(0, iIndexOf) + k(strD, p, "") + str.substring(iIndexOf + strD.length());
            }
            return str2;
        } catch (Throwable th) {
            l9m.e(this, sgm.f16581l, "fmt1", th, str);
            return str;
        }
    }

    public void o(boolean z2) {
        this.f15712j = z2;
    }

    public final String p(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str.substring(19));
            jSONObject.put("bizcontext", i(jSONObject.optString("bizcontext")));
            return C + jSONObject.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public boolean q() {
        return this.i;
    }

    public final String r(String str) {
        String str2;
        try {
            String strD = d(str, m, o);
            if (TextUtils.isEmpty(strD)) {
                str2 = str + "&" + c(o, "\"");
            } else {
                if (!strD.endsWith("\"")) {
                    strD = strD + "\"";
                }
                int iIndexOf = str.indexOf(strD);
                str2 = str.substring(0, iIndexOf) + k(strD, o, "\"") + str.substring(iIndexOf + strD.length());
            }
            return str2;
        } catch (Throwable th) {
            l9m.e(this, sgm.f16581l, "fmt2", th, str);
            return str;
        }
    }

    public boolean s() {
        return this.h;
    }

    public boolean t() {
        return this.f15712j;
    }

    public final boolean u(String str) {
        return !str.contains(m);
    }

    public final JSONObject v() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(z, this.d);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
