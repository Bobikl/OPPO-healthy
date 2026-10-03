package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class vm0 {
    public final LruCache<String, gn0> a = new LruCache<>(d14.MAX_CACHE);
    public final Context b;
    public String c;

    public vm0(Context context) {
        this.b = context;
    }

    public gn0 a(String str) {
        return this.a.get(str);
    }

    public boolean b(String str, String str2) {
        String strB = f5e.b(this.b, str);
        gn0 gn0Var = this.a.get(str);
        if (gn0Var == null || gn0Var.f() || !TextUtils.equals(str2, gn0Var.d())) {
            return false;
        }
        return TextUtils.equals(strB, gn0Var.b());
    }

    public boolean c() {
        if (TextUtils.isEmpty(this.c)) {
            this.c = o53.f(this.b, "android");
        }
        return TextUtils.equals(this.c, d14.LOCAL_PLATFORM_SIGNATURE);
    }

    public boolean d(String str) {
        if (TextUtils.isEmpty(this.c)) {
            this.c = o53.f(this.b, "android");
        }
        return TextUtils.equals(this.c, str);
    }

    public void e(String str, gn0 gn0Var, String str2) {
        gn0Var.e();
        gn0Var.h();
        gn0Var.g(str2);
        this.a.put(str, gn0Var);
    }
}
