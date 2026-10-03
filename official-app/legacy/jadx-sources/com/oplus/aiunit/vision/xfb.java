package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public class xfb {
    public final String a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f18606c;

    public xfb(String str, float f, float f2) {
        this.a = str;
        this.f18606c = f2;
        this.b = f;
    }

    public boolean a(String str) {
        if (this.a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.a.endsWith("\r")) {
            String str2 = this.a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
