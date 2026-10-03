package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public class qkm extends aam {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f15836l = 1;
    public static final int m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f15837n = 3;
    public static final String o = "APPKEY_ERROR";
    public static final String p = "SUCCESS";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15838c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15839e;
    public String f;
    public String g;
    public String h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15840j;
    public String k = "";

    public String a() {
        String str = this.f;
        return str == null ? "0" : str;
    }

    public boolean b() {
        return "1".equals(this.f15839e);
    }

    public int c() {
        if (this.a) {
            return vam.c(this.f15838c) ? 2 : 1;
        }
        return o.equals(this.b) ? 3 : 2;
    }
}
