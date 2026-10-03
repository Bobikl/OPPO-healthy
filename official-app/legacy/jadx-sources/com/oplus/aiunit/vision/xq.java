package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class xq {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18720c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18721e;

    public xq(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.f18720c = str3;
        this.d = str4;
        this.f18721e = str5;
    }

    public boolean a() {
        return TextUtils.equals("ft", this.f18721e);
    }

    public boolean b() {
        return TextUtils.equals("msg", this.f18721e);
    }

    public String toString() {
        return this.f18720c + " -> " + this.a + ':' + this.b + " (awakenable=" + this.d + " type=" + this.f18721e + ')';
    }
}
