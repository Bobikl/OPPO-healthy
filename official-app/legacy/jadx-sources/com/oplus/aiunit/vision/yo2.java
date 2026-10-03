package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class yo2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static yo2 f19080c;
    public final SharedPreferences a;
    public final SharedPreferences.Editor b;

    public yo2(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("$oplus_pay_web_container_cache_prefs", 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    public static synchronized yo2 b() {
        if (f19080c == null) {
            f19080c = new yo2(c94.b());
        }
        return f19080c;
    }

    public boolean a() {
        return this.b.commit();
    }

    public String c(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : this.a.getString(str, str2);
    }

    public yo2 d(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str2 == null) {
                this.b.remove(str);
            } else {
                this.b.putString(str, str2);
            }
        }
        return this;
    }
}
