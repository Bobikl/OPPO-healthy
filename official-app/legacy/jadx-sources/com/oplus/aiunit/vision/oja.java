package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class oja {
    public final HashMap<String, rr9> a = new HashMap<>();

    public static class a {
        public static final oja a = new oja();
    }

    public static oja c() {
        return a.a;
    }

    public void a(rr9 rr9Var) {
        b(null, rr9Var);
    }

    public void b(String str, rr9 rr9Var) {
        this.a.put(e(str, rr9Var.getJsApiProduct(), rr9Var.getJsApiMethod()), rr9Var);
    }

    @Nullable
    public rr9 d(String str, String str2, String str3) {
        rr9 rr9Var = this.a.get(e(str, str2, str3));
        return (rr9Var != null || str == null) ? rr9Var : this.a.get(e(null, str2, str3));
    }

    @NonNull
    public final String e(String str, String str2, String str3) {
        return TextUtils.isEmpty(str) ? String.format("%s-%s", str2, str3) : String.format("%s-%s-%s", str, str2, str3);
    }
}
