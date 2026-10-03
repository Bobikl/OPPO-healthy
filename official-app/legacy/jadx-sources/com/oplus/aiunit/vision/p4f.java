package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.open.web.security.JniInterface;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class p4f {
    public static final int AUTH_QQ = 2;
    public static final int AUTH_QZONE = 3;
    public static final int AUTH_WEB = 1;
    public static SharedPreferences g;
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15193c;
    public int d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f15194e = -1;
    public ncm f;

    public p4f(String str) {
        this.a = str;
    }

    @TargetApi(11)
    public static synchronized SharedPreferences a() {
        if (g == null) {
            g = uum.a().getSharedPreferences("token_info_file", 0);
        }
        return g;
    }

    public static String b(String str) {
        return Base64.encodeToString(com.tencent.open.utils.b.K(str), 2) + "_aes_google";
    }

    public static synchronized JSONObject c(String str, ncm ncmVar) {
        String strD;
        if (uum.a() == null) {
            q8g.i("QQToken", "loadJsonPreference context null");
            return null;
        }
        if (str == null) {
            q8g.i("QQToken", "loadJsonPreference prefKey is null");
            return null;
        }
        String string = a().getString(b(str), "");
        if (TextUtils.isEmpty(string)) {
            if (!JniInterface.isJniOk) {
                yzm.h(cm0.SECURE_LIB_FILE_NAME, cm0.SECURE_LIB_NAME, 5);
                JniInterface.a();
            }
            if (!JniInterface.isJniOk) {
                q8g.i("QQToken", "loadJsonPreference jni load fail SECURE_LIB_VERSION=5");
                return null;
            }
            String strF = f(str);
            String string2 = a().getString(strF, "");
            try {
                if (TextUtils.isEmpty(string2)) {
                    String strE = e(str);
                    String string3 = a().getString(strE, "");
                    try {
                        if (TextUtils.isEmpty(string3)) {
                            q8g.i("QQToken", "loadJsonPreference oldDesValue null");
                            return null;
                        }
                        try {
                            strD = JniInterface.d1(string3);
                            if (TextUtils.isEmpty(strD)) {
                                q8g.i("QQToken", "loadJsonPreference decodeResult d1 empty");
                                a().edit().remove(strE).apply();
                                return null;
                            }
                            d(str, new JSONObject(strD), ncmVar);
                            a().edit().remove(strE).apply();
                        } catch (Exception e2) {
                            q8g.g("QQToken", "Catch Exception", e2);
                            a().edit().remove(strE).apply();
                            return null;
                        }
                    } catch (Throwable th) {
                        a().edit().remove(strE).apply();
                        throw th;
                    }
                } else {
                    try {
                        strD = JniInterface.d2(string2);
                        d(str, new JSONObject(strD), ncmVar);
                        a().edit().remove(strF).apply();
                    } catch (Exception e3) {
                        q8g.g("QQToken", "Catch Exception", e3);
                        a().edit().remove(strF).apply();
                        return null;
                    }
                }
            } catch (Throwable th2) {
                a().edit().remove(strF).apply();
                throw th2;
            }
            throw th;
        }
        strD = ncmVar.d(string);
        try {
            JSONObject jSONObject = new JSONObject(strD);
            q8g.i("QQToken", "loadJsonPreference sucess");
            return jSONObject;
        } catch (Exception e4) {
            q8g.i("QQToken", "loadJsonPreference decode " + e4.toString());
            return null;
        }
    }

    public static synchronized boolean d(String str, JSONObject jSONObject, ncm ncmVar) {
        if (uum.a() == null) {
            q8g.i("QQToken", "saveJsonPreference context null");
            return false;
        }
        if (str == null || jSONObject == null) {
            q8g.i("QQToken", "saveJsonPreference prefKey or jsonObject null");
            return false;
        }
        try {
            String string = jSONObject.getString(s04.PARAM_EXPIRES_IN);
            if (TextUtils.isEmpty(string)) {
                q8g.i("QQToken", "expires is null");
                return false;
            }
            jSONObject.put(s04.PARAM_EXPIRES_TIME, System.currentTimeMillis() + (Long.parseLong(string) * 1000));
            String strB = b(str);
            String strA = ncmVar.a(jSONObject.toString());
            if (strB.length() > 6 && strA != null) {
                a().edit().putString(strB, strA).commit();
                q8g.i("QQToken", "saveJsonPreference sucess");
                return true;
            }
            q8g.i("QQToken", "saveJsonPreference keyEncode or josnEncode null");
            return false;
        } catch (Exception e2) {
            q8g.f("QQToken", "saveJsonPreference exception:" + e2.toString());
            return false;
        }
    }

    @Deprecated
    public static String e(String str) {
        return Base64.encodeToString(com.tencent.open.utils.b.K(str), 2);
    }

    @Deprecated
    public static String f(String str) {
        return Base64.encodeToString(com.tencent.open.utils.b.K(str), 2) + "_spkey";
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.a;
    }

    public String i() {
        return this.f15193c;
    }

    public String j() {
        String strI = i();
        try {
            if (TextUtils.isEmpty(strI)) {
                JSONObject jSONObjectL = l(this.a);
                if (jSONObjectL != null) {
                    strI = jSONObjectL.getString("openid");
                    if (!TextUtils.isEmpty(strI)) {
                        o(strI);
                    }
                }
                q8g.i("QQToken", "getOpenId from Session openId = " + strI + " appId = " + this.a);
            } else {
                q8g.i("QQToken", "getOpenId from field openId = " + strI + " appId = " + this.a);
            }
        } catch (Exception e2) {
            q8g.i("QQToken", "getLocalOpenIdByAppId " + e2.toString());
        }
        return strI;
    }

    public boolean k() {
        return this.b != null && System.currentTimeMillis() < this.f15194e;
    }

    public JSONObject l(String str) {
        try {
            if (this.f == null) {
                this.f = new ncm(uum.a());
            }
            return c(str, this.f);
        } catch (Exception e2) {
            q8g.i("QQToken", "login loadSession" + e2.toString());
            return null;
        }
    }

    public void m(String str) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.remove(f(str));
        editorEdit.remove(f(str));
        editorEdit.remove(b(str));
        editorEdit.apply();
        q8g.i("QQToken", "removeSession sucess");
    }

    public void n(String str, String str2) throws NumberFormatException {
        this.b = str;
        this.f15194e = 0L;
        if (str2 != null) {
            this.f15194e = System.currentTimeMillis() + (Long.parseLong(str2) * 1000);
        }
    }

    public void o(String str) {
        this.f15193c = str;
    }
}
