package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class mp2 {
    public static mp2 c;
    public final SharedPreferences a;
    public final SharedPreferences.Editor b;

    public mp2(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("$oplus_pay_web_container_cache_prefs", 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    public static synchronized mp2 b() {
        if (c == null) {
            c = new mp2(q94.b());
        }
        return c;
    }

    public boolean a() {
        return this.b.commit();
    }

    public String c(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : this.a.getString(str, str2);
    }

    public mp2 d(String str, String str2) {
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
