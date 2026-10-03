package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ram {
    public static final String g = "alipay_tid_storage";
    public static final String h = "tidinfo";
    public static final String i = "tid";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f16142j = "client_key";
    public static final String k = "timestamp";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f16143l = "vimei";
    public static final String m = "vimsi";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Context f16144n;
    public static ram o;
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16145c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16146e;
    public boolean f = false;

    public static class a {
        public static String a() {
            String packageName;
            try {
                packageName = ram.f16144n.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                qrm.d(th);
                packageName = "";
            }
            return (packageName + "0000000000000000000000000000").substring(0, 24);
        }

        public static String b(String str, String str2, boolean z) {
            if (ram.f16144n == null) {
                return null;
            }
            String string = ram.f16144n.getSharedPreferences(str, 0).getString(str2, null);
            if (!TextUtils.isEmpty(string) && z) {
                string = ssm.a(a(), string, string);
                if (TextUtils.isEmpty(string)) {
                    qrm.f(ham.A, "tid_str: pref failed");
                }
            }
            qrm.f(ham.A, "tid_str: from local");
            return string;
        }

        public static void c(String str, String str2, String str3, boolean z) {
            if (ram.f16144n == null) {
                return;
            }
            SharedPreferences sharedPreferences = ram.f16144n.getSharedPreferences(str, 0);
            if (z) {
                String strA = a();
                String strC = ssm.c(strA, str3, str3);
                if (TextUtils.isEmpty(strC)) {
                    String.format("LocalPreference::putLocalPreferences failed %s，%s", str3, strA);
                }
                str3 = strC;
            }
            sharedPreferences.edit().putString(str2, str3).apply();
        }

        public static void d(String str, String str2) {
            if (ram.f16144n == null) {
                return;
            }
            ram.f16144n.getSharedPreferences(str, 0).edit().remove(str2).apply();
        }
    }

    public static synchronized ram a(Context context) {
        if (o == null) {
            o = new ram();
        }
        if (f16144n == null) {
            o.e(context);
        }
        return o;
    }

    public void b(String str, String str2) {
        qrm.f(ham.A, "tid_str: save");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.a = str;
        this.b = str2;
        this.f16145c = System.currentTimeMillis();
        l();
        m();
    }

    public final boolean c(String str, String str2, String str3, String str4) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4);
    }

    public String d() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        return hexString.length() > 10 ? hexString.substring(hexString.length() - 10) : hexString;
    }

    public final void e(Context context) {
        if (context != null) {
            f16144n = context.getApplicationContext();
        }
        if (this.f) {
            return;
        }
        this.f = true;
        j();
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.a;
    }

    public final String i() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    public final void j() {
        String strOptString;
        String strOptString2;
        String strOptString3;
        String str;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        String strOptString4 = null;
        try {
            String strB = a.b(g, h, true);
            if (TextUtils.isEmpty(strB)) {
                str = null;
                strOptString2 = null;
                strOptString3 = null;
            } else {
                JSONObject jSONObject = new JSONObject(strB);
                strOptString = jSONObject.optString("tid", "");
                try {
                    strOptString2 = jSONObject.optString(f16142j, "");
                    try {
                        lValueOf = Long.valueOf(jSONObject.optLong("timestamp", System.currentTimeMillis()));
                        strOptString3 = jSONObject.optString(f16143l, "");
                        try {
                            strOptString4 = jSONObject.optString(m, "");
                        } catch (Exception e2) {
                            e = e2;
                            qrm.d(e);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        strOptString3 = null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    strOptString2 = null;
                    strOptString3 = strOptString2;
                    qrm.d(e);
                    str = strOptString4;
                    strOptString4 = strOptString;
                    qrm.f(ham.A, "tid_str: load");
                    if (c(strOptString4, strOptString2, strOptString3, str)) {
                        k();
                        return;
                    }
                    this.a = strOptString4;
                    this.b = strOptString2;
                    this.f16145c = lValueOf.longValue();
                    this.d = strOptString3;
                    this.f16146e = str;
                }
                str = strOptString4;
                strOptString4 = strOptString;
            }
        } catch (Exception e5) {
            e = e5;
            strOptString = null;
            strOptString2 = null;
        }
        qrm.f(ham.A, "tid_str: load");
        if (c(strOptString4, strOptString2, strOptString3, str)) {
            k();
            return;
        }
        this.a = strOptString4;
        this.b = strOptString2;
        this.f16145c = lValueOf.longValue();
        this.d = strOptString3;
        this.f16146e = str;
    }

    public final void k() {
        this.a = "";
        this.b = d();
        this.f16145c = System.currentTimeMillis();
        this.d = i();
        this.f16146e = i();
        a.d(g, h);
    }

    public final void l() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.a);
            jSONObject.put(f16142j, this.b);
            jSONObject.put("timestamp", this.f16145c);
            jSONObject.put(f16143l, this.d);
            jSONObject.put(m, this.f16146e);
            a.c(g, h, jSONObject.toString(), true);
        } catch (Exception e2) {
            qrm.d(e2);
        }
    }

    public final void m() {
    }
}
