package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class g9f {
    public ss9 a;
    public boolean b;

    public static class a {
        public static g9f a = new g9f();
    }

    public static g9f a() {
        return a.a;
    }

    public synchronized boolean b(String str, String str2, String str3) {
        boolean zA;
        if (this.b) {
            ili.a("RadarCheckManager");
        }
        ss9 ss9Var = this.a;
        zA = ss9Var != null ? ss9Var.a(str, str2, str3) : true;
        h9f.c("RadarCheckManager", "[reject] className " + str + " methodName " + str2 + " methodDescription " + str3 + " isInvoke " + zA);
        return !zA;
    }

    public synchronized g9f c(ss9 ss9Var) {
        this.a = ss9Var;
        return this;
    }

    public synchronized g9f d(boolean z) {
        this.b = z;
        return this;
    }
}
