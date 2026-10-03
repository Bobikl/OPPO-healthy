package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public class mqm {
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14161c = System.currentTimeMillis() + 86400000;

    public mqm(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public String toString() {
        return "ValueData{value='" + this.a + "', code=" + this.b + ", expired=" + this.f14161c + '}';
    }
}
