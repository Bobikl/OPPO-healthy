package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class roa {
    public static byte[] a(tz tzVar, f1 f1Var) {
        try {
            return b(new pwe(tzVar, f1Var.c()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(pwe pweVar) {
        try {
            return pweVar.e("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] c(tz tzVar, f1 f1Var) {
        try {
            return d(new t2j(tzVar, f1Var));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] d(t2j t2jVar) {
        try {
            return t2jVar.e("DER");
        } catch (Exception unused) {
            return null;
        }
    }
}
