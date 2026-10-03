package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class p7b {
    public static final int DEBUG = 3;
    public static final int ERROR = 1;
    public static final int INFO = 2;
    public static final int NONE = 0;
    public final String a;
    public int b;

    public p7b(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public void a(String str) {
        if (this.b >= 3) {
            x38.app.debug(this.a, str);
        }
    }

    public void b(String str) {
        if (this.b >= 1) {
            x38.app.error(this.a, str);
        }
    }

    public void c(String str, Throwable th) {
        if (this.b >= 1) {
            x38.app.error(this.a, str, th);
        }
    }

    public int d() {
        return this.b;
    }

    public void e(String str) {
        if (this.b >= 2) {
            x38.app.c(this.a, str);
        }
    }
}
