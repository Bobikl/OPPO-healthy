package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;

/* JADX INFO: loaded from: classes8.dex */
public class dm0 {
    public final LruCache<String, om0> a = new LruCache<>(q04.MAX_CACHE);
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10623c;

    public dm0(Context context) {
        this.b = context;
    }

    public om0 a(String str) {
        return this.a.get(str);
    }

    public boolean b(String str, String str2) {
        String strB = i3e.b(this.b, str);
        om0 om0Var = this.a.get(str);
        if (om0Var == null || om0Var.f() || !TextUtils.equals(str2, om0Var.d())) {
            return false;
        }
        return TextUtils.equals(strB, om0Var.b());
    }

    public boolean c() {
        if (TextUtils.isEmpty(this.f10623c)) {
            this.f10623c = a53.f(this.b, "android");
        }
        return TextUtils.equals(this.f10623c, q04.LOCAL_PLATFORM_SIGNATURE);
    }

    public boolean d(String str) {
        if (TextUtils.isEmpty(this.f10623c)) {
            this.f10623c = a53.f(this.b, "android");
        }
        return TextUtils.equals(this.f10623c, str);
    }

    public void e(String str, om0 om0Var, String str2) {
        om0Var.e();
        om0Var.h();
        om0Var.g(str2);
        this.a.put(str, om0Var);
    }
}
