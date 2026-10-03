package com.heytap.msp.ipc.interceptor;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public static final int CODE_OK = 0;
    public static final a SUCCESS = new a();
    public final int a = 0;
    public final String b = "";

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean c() {
        return this.a != 0;
    }

    public String toString() {
        return "InterceptResult{code=" + this.a + ", message='" + this.b + "'}";
    }
}
