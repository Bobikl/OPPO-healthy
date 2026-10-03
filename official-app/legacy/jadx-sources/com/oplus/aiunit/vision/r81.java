package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
public abstract class r81 {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16119c;
    public r81 d;

    public r81(String str, String str2) {
        this.b = str;
        this.a = str2;
        this.f16119c = v9g.w().E(str2, "").contains(this.b);
    }

    public boolean a(String str) {
        if (TextUtils.equals(this.a, str)) {
            return this.f16119c;
        }
        r81 r81Var = this.d;
        if (r81Var != null) {
            return r81Var.a(str);
        }
        return false;
    }

    public abstract void b();

    public abstract boolean c(boolean z);

    public boolean d(String str, boolean z) {
        if (TextUtils.equals(this.a, str)) {
            return c(z);
        }
        r81 r81Var = this.d;
        if (r81Var != null) {
            return r81Var.d(str, z);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("updateShow with empty tag: ");
        sb.append(str);
        return false;
    }
}
