package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public class em0 {
    public LruCache<String, nm0> a = new LruCache<>(n04.MAX_CACHE);
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10981c;

    public em0(Context context) {
        this.b = context;
        this.f10981c = b53.e(context, "android");
    }

    public boolean a(String str, String str2) {
        nm0 nm0VarB = ym0.b(this.b, str, g3e.b(this.b, str));
        nm0 nm0Var = this.a.get(str);
        if (nm0VarB == null || nm0Var == null || nm0Var.f() || !TextUtils.equals(str2, nm0Var.d())) {
            return false;
        }
        return Arrays.equals(nm0VarB.c(), nm0Var.c());
    }

    public boolean b(String str) {
        return TextUtils.equals(this.f10981c, str);
    }

    public void c(String str, nm0 nm0Var, String str2) {
        nm0Var.e();
        nm0Var.h();
        nm0Var.g(str2);
        this.a.put(str, nm0Var);
    }

    public boolean d(String str, String str2, String str3) {
        nm0 nm0Var = this.a.get(str);
        if (nm0Var == null) {
            return false;
        }
        if (glj.c(str2, ".").size() > 2) {
            str2 = str2.substring(str2.lastIndexOf(".") + 1);
        }
        boolean z = nm0Var.a("epona", str2) || nm0Var.a("epona", str3);
        boolean z2 = nm0Var.a("tingle", str2) || nm0Var.a("tingle", str3);
        if (!z && z2) {
            i1e.b("Action : [" + str2 + "/" + str3 + "] is re-wrapped form Tingle, Caller : [" + str + "]");
        }
        return z || z2;
    }
}
