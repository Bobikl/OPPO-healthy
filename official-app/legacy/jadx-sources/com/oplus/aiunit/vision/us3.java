package com.oplus.aiunit.vision;

import android.content.ContentProvider;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes15.dex */
public class us3 {
    public final String a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17586c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17587e = false;
    public Runnable f = null;

    public static final class a {
        public final us3 a;

        public a(String str, boolean z) {
            try {
                Class<?> cls = Class.forName(str);
                StringBuilder sb = new StringBuilder();
                sb.append("clazz check pass,");
                sb.append(cls.getCanonicalName());
                this.a = new us3(str, z, ContentProvider.class.isAssignableFrom(cls));
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        public us3 a() {
            if (TextUtils.isEmpty(this.a.d)) {
                String[] strArrSplit = this.a.a.split("\\.");
                this.a.d = strArrSplit[strArrSplit.length - 1];
            }
            us3 us3Var = this.a;
            if (us3Var.f17586c && !us3Var.b) {
                a7b.f("ComponentInfo", "build() ContentProvider killAppWhenDisable always true");
                this.a.f17587e = true;
            }
            return this.a;
        }

        public a b(Runnable runnable) {
            this.a.f = runnable;
            return this;
        }
    }

    public us3(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.f17586c = z2;
    }
}
