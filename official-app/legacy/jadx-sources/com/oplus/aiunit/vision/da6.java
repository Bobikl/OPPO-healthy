package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class da6 {
    public static mb6 a(String str) {
        f86 f86VarA = ea6.a(str);
        if (f86VarA == null) {
            try {
                f86VarA = ea6.b(new n1(str));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (f86VarA == null) {
            return null;
        }
        return new mb6(str, f86VarA.a(), f86VarA.b(), f86VarA.d(), f86VarA.c(), f86VarA.e());
    }
}
