package com.oplus.aiunit.vision;

import java.net.URL;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class wpm {
    public String b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18360e;
    public int a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f18359c = null;
    public byte[] d = null;

    public wpm(String str, byte b) {
        this.b = str;
    }

    public final URL a() {
        try {
            return new URL(this.b);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(String str) {
        if (str != null) {
            this.d = str.getBytes();
            this.f18360e = str;
        }
    }

    public final String c() {
        return this.a == 1 ? "POST" : "GET";
    }

    public final String d() {
        return this.f18360e;
    }

    public final HashMap e() {
        return this.f18359c;
    }
}
