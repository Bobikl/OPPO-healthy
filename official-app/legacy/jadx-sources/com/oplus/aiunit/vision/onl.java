package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.heytap.webpro.interceptor.OpenJsApiInterceptor;

/* JADX INFO: loaded from: classes3.dex */
public class onl {
    public static final yz3 a;
    public static final kp6 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final omk f14995c;
    public static final kzf d;

    public static class b {
        public qz9 a;
        public fo9 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public yp9 f14996c;
        public qw9 d;

        public void a() {
            if (this.b != null) {
                onl.a.a(this.b);
            }
            if (this.a != null) {
                onl.f14995c.b(this.a);
            }
            if (this.f14996c != null) {
                onl.b.c(this.f14996c);
            }
            if (this.d != null) {
                onl.d.b(this.d);
            }
        }

        public b b(boolean z) {
            onl.j(z);
            return this;
        }

        public b(@NonNull Context context) {
            this.a = null;
            this.b = null;
            this.f14996c = null;
            this.d = null;
            d94.c(context);
        }
    }

    static {
        yz3 yz3Var = new yz3();
        a = yz3Var;
        kp6 kp6Var = new kp6();
        b = kp6Var;
        omk omkVar = new omk();
        f14995c = omkVar;
        kzf kzfVar = new kzf();
        d = kzfVar;
        p48.a();
        oja.c().a(new OpenJsApiInterceptor());
        oja.c().a(new z78());
        omkVar.b(new k75());
        yz3Var.a(new d45());
        kp6Var.c(new n45());
        kzfVar.b(new p55());
    }

    public static fo9 e() {
        return a;
    }

    public static yp9 f() {
        return b;
    }

    public static qw9 g() {
        return d;
    }

    public static qz9 h() {
        return f14995c;
    }

    public static boolean i() {
        return q7b.l();
    }

    public static void j(boolean z) {
        q7b.m(z);
    }

    public static b k(Context context) {
        return new b(context);
    }
}
