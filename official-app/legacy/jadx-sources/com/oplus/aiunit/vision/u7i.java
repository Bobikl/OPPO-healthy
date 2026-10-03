package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class u7i {
    public static final int ACTIVATE_APPLICATION_FAILED = -25;
    public static final int CREATE_APPLICATION_FAILED = -24;
    public static final int CREATE_CLASSLOADER_FAILED = -27;
    public static final int CREATE_PROVIDERS_FAILED = -26;
    public static final int INTERNAL_ERROR = -100;
    public static final int INTERRUPTED_ERROR = -99;
    public static final int LOAD_DEX_FAILED = -23;
    public static final int LOAD_LIB_FAILED = -22;
    public static final int LOAD_RES_FAILED = -21;
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17338c;
    public Throwable d;

    public u7i(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.f17338c = i;
    }

    public int a() {
        return this.f17338c;
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("splitName:");
        sb.append(this.a);
        sb.append(";version:");
        sb.append(this.b);
        sb.append(";loadStatus:");
        sb.append(this.f17338c);
        sb.append(";");
        if (this.d != null) {
            sb.append("errorMsg:");
            sb.append(this.d.getMessage());
            sb.append(";");
        }
        return sb.toString();
    }

    public u7i(String str, String str2, int i, Throwable th) {
        this.a = str;
        this.b = str2;
        this.f17338c = i;
        this.d = th;
    }
}
