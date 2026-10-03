package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class gn0 {
    public final String a;
    public final int b;
    public final byte[] c;
    public long d;
    public Map<String, uhe> e;
    public String f;
    public final String g;

    public gn0(String str, int i, byte[] bArr, String str2) {
        this.a = str;
        this.b = i;
        this.c = bArr;
        this.g = str2;
    }

    public boolean a(String str, String str2) {
        uhe uheVar = this.e.get(str);
        if (uheVar != null) {
            return uheVar.a(str2);
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
        this.e = new ConcurrentHashMap();
        for (String str : fpj.c(new String(this.c), d14.SEMICOLON_REGEX)) {
            int iIndexOf = str.indexOf(d14.COMMA_REGEX);
            if (iIndexOf != -1) {
                String strSubstring = str.substring(0, iIndexOf);
                String strSubstring2 = str.substring(iIndexOf + 1);
                if (TextUtils.equals(strSubstring, d14.TYPE_EPONA) || TextUtils.equals(strSubstring, d14.TYPE_TINGLE)) {
                    this.e.put(strSubstring, new uhe(strSubstring2));
                    e3e.b("Package : " + this.a + " Permission : type [" + strSubstring + "] -" + fpj.c(strSubstring2, d14.COMMA_REGEX));
                }
            }
        }
    }

    public boolean f() {
        return System.currentTimeMillis() - this.d > d14.CACHE_UPDATE_TIME;
    }

    public void g(String str) {
        this.f = str;
    }

    public void h() {
        this.d = System.currentTimeMillis();
    }
}
