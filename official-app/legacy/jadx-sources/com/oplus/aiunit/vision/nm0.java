package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes19.dex */
public class nm0 {
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f14556c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, wfe> f14557e;
    public String f;

    public nm0(String str, int i, byte[] bArr) {
        this.a = str;
        this.b = i;
        this.f14556c = bArr;
    }

    public boolean a(String str, String str2) {
        wfe wfeVar = this.f14557e.get(str);
        if (wfeVar != null) {
            return wfeVar.a(str2);
        }
        return false;
    }

    public int b() {
        return this.b;
    }

    public byte[] c() {
        return this.f14556c;
    }

    public String d() {
        return this.f;
    }

    public void e() {
        this.f14557e = new ConcurrentHashMap();
        for (String str : glj.c(new String(this.f14556c), ";")) {
            int iIndexOf = str.indexOf(",");
            if (iIndexOf != -1) {
                String strSubstring = str.substring(0, iIndexOf);
                String strSubstring2 = str.substring(iIndexOf + 1);
                if (TextUtils.equals(strSubstring, "epona") || TextUtils.equals(strSubstring, "tingle")) {
                    this.f14557e.put(strSubstring, new wfe(strSubstring2));
                    i1e.b("Package : " + this.a + " Permission : type [" + strSubstring + "] -" + glj.c(strSubstring2, ","));
                }
            }
        }
    }

    public boolean f() {
        return System.currentTimeMillis() - this.d > n04.CACHE_UPDATE_TIME;
    }

    public void g(String str) {
        this.f = str;
    }

    public void h() {
        this.d = System.currentTimeMillis();
    }
}
