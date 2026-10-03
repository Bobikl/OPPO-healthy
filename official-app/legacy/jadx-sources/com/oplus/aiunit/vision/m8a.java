package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public abstract class m8a {
    public static void a(ltc ltcVar) {
        if (ltcVar.c() == ltcVar.d()) {
            return;
        }
        d(ltcVar.c(), ltcVar.d());
    }

    public static void b(zrj zrjVar, zrj zrjVar2, int i) {
        if (zrjVar == null || zrjVar2 == null || zrjVar == zrjVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(zrjVar.m());
        ltc ltcVarE = zrjVar.e();
        ltc ltcVarE2 = zrjVar2.e();
        while (ltcVarE != ltcVarE2) {
            sb.append(((zrj) ltcVarE).m());
            ltc ltcVarE3 = ltcVarE.e();
            ltcVarE.l();
            ltcVarE = ltcVarE3;
        }
        zrjVar.n(sb.toString());
    }

    public static void c(ltc ltcVar, ltc ltcVar2) {
        if (ltcVar == ltcVar2 || ltcVar.e() == ltcVar2) {
            return;
        }
        d(ltcVar.e(), ltcVar2.g());
    }

    public static void d(ltc ltcVar, ltc ltcVar2) {
        zrj zrjVar = null;
        zrj zrjVar2 = null;
        int length = 0;
        while (ltcVar != null) {
            if (ltcVar instanceof zrj) {
                zrjVar2 = (zrj) ltcVar;
                if (zrjVar == null) {
                    zrjVar = zrjVar2;
                }
                length += zrjVar2.m().length();
            } else {
                b(zrjVar, zrjVar2, length);
                zrjVar = null;
                zrjVar2 = null;
                length = 0;
            }
            if (ltcVar == ltcVar2) {
                break;
            } else {
                ltcVar = ltcVar.e();
            }
        }
        b(zrjVar, zrjVar2, length);
    }
}
