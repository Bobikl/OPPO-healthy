package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class om0 {
    public final String a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f14983c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, vfe> f14984e;
    public String f;
    public final String g;

    public om0(String str, int i, byte[] bArr, String str2) {
        this.a = str;
        this.b = i;
        this.f14983c = bArr;
        this.g = str2;
    }

    public boolean a(String str, String str2) {
        vfe vfeVar = this.f14984e.get(str);
        if (vfeVar != null) {
            return vfeVar.a(str2);
        }
        return false;
    }

    public String b() {
        return this.g;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.f;
    }

    public void e() {
        this.f14984e = new ConcurrentHashMap();
        for (String str : hlj.c(new String(this.f14983c), ";")) {
            int iIndexOf = str.indexOf(",");
            if (iIndexOf != -1) {
                String strSubstring = str.substring(0, iIndexOf);
                String strSubstring2 = str.substring(iIndexOf + 1);
                if (TextUtils.equals(strSubstring, "epona") || TextUtils.equals(strSubstring, "tingle")) {
                    this.f14984e.put(strSubstring, new vfe(strSubstring2));
                    j1e.b("Package : " + this.a + " Permission : type [" + strSubstring + "] -" + hlj.c(strSubstring2, ","));
                }
            }
        }
    }

    public boolean f() {
        return System.currentTimeMillis() - this.d > q04.CACHE_UPDATE_TIME;
    }

    public void g(String str) {
        this.f = str;
    }

    public void h() {
        this.d = System.currentTimeMillis();
    }
}
