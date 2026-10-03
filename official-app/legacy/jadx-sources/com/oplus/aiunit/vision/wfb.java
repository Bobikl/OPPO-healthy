package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class wfb {
    public final String a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f18237c;

    public wfb(String str, float f, float f2) {
        this.a = str;
        this.f18237c = f2;
        this.b = f;
    }

    public boolean a(String str) {
        if (this.a.equalsIgnoreCase(str)) {
            return true;
        }
        if (prk.n(this.a, "\r")) {
            String str2 = this.a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
