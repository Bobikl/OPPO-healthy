package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class o93 {
    public String a;
    public a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14846c = false;
    public sn9 d;

    public static class a {
        public String a;
        public String b;

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public vt9 c() {
            return null;
        }

        public a d(String str) {
            this.b = str;
            return this;
        }
    }

    public static o93 a(String str, a aVar, sn9 sn9Var) {
        return new o93().g(str).i(aVar).h(false).f(sn9Var);
    }

    public sn9 b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public a d() {
        return this.b;
    }

    public boolean e() {
        return this.f14846c;
    }

    public o93 f(sn9 sn9Var) {
        this.d = sn9Var;
        return this;
    }

    public o93 g(String str) {
        this.a = str;
        return this;
    }

    public o93 h(boolean z) {
        this.f14846c = z;
        return this;
    }

    public o93 i(a aVar) {
        this.b = aVar;
        return this;
    }
}
