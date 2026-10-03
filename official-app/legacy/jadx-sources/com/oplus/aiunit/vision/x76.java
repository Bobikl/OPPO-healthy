package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes11.dex */
public class x76 {
    public static Map a = new HashMap();

    static {
        Enumeration enumerationJ = of4.j();
        while (enumerationJ.hasMoreElements()) {
            String str = (String) enumerationJ.nextElement();
            h5m h5mVarA = ob6.a(str);
            if (h5mVarA != null) {
                a.put(h5mVarA.f(), of4.h(str).f());
            }
        }
        h5m h5mVarH = of4.h("Curve25519");
        a.put(new a86.e(h5mVarH.f().r().b(), h5mVarH.f().n().t(), h5mVarH.f().o().t()), h5mVarH.f());
    }

    public static a86 a(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a2 = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            a86.e eVar = new a86.e(((ECFieldFp) field).getP(), a2, b);
            return a.containsKey(eVar) ? (a86) a.get(eVar) : eVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] iArrB = zb6.b(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new a86.d(m, iArrB[0], iArrB[1], iArrB[2], a2, b);
    }

    public static EllipticCurve b(a86 a86Var, byte[] bArr) {
        return new EllipticCurve(c(a86Var.r()), a86Var.n().t(), a86Var.o().t(), null);
    }

    public static ECField c(ig7 ig7Var) {
        if (y76.g(ig7Var)) {
            return new ECFieldFp(ig7Var.b());
        }
        dne dneVarC = ((ene) ig7Var).c();
        int[] iArrA = dneVarC.a();
        return new ECFieldF2m(dneVarC.b(), eh0.x(eh0.m(iArrA, 1, iArrA.length - 1)));
    }

    public static rb6 d(a86 a86Var, ECPoint eCPoint, boolean z) {
        return a86Var.f(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static rb6 e(ECParameterSpec eCParameterSpec, ECPoint eCPoint, boolean z) {
        return d(a(eCParameterSpec.getCurve()), eCPoint, z);
    }

    public static qb6 f(ECParameterSpec eCParameterSpec, boolean z) {
        a86 a86VarA = a(eCParameterSpec.getCurve());
        return new qb6(a86VarA, d(a86VarA, eCParameterSpec.getGenerator(), z), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    public static ECParameterSpec g(EllipticCurve ellipticCurve, qb6 qb6Var) {
        return qb6Var instanceof mb6 ? new nb6(((mb6) qb6Var).f(), ellipticCurve, new ECPoint(qb6Var.b().f().t(), qb6Var.b().g().t()), qb6Var.d(), qb6Var.c()) : new ECParameterSpec(ellipticCurve, new ECPoint(qb6Var.b().f().t(), qb6Var.b().g().t()), qb6Var.d(), qb6Var.c().intValue());
    }

    public static ECParameterSpec h(f5m f5mVar, a86 a86Var) {
        if (!f5mVar.i()) {
            if (f5mVar.h()) {
                return null;
            }
            h5m h5mVarI = h5m.i(f5mVar.g());
            EllipticCurve ellipticCurveB = b(a86Var, h5mVarI.k());
            return h5mVarI.h() != null ? new ECParameterSpec(ellipticCurveB, new ECPoint(h5mVarI.g().f().t(), h5mVarI.g().g().t()), h5mVarI.j(), h5mVarI.h().intValue()) : new ECParameterSpec(ellipticCurveB, new ECPoint(h5mVarI.g().f().t(), h5mVarI.g().g().t()), h5mVarI.j(), 1);
        }
        n1 n1Var = (n1) f5mVar.g();
        h5m h5mVarG = zb6.g(n1Var);
        if (h5mVarG == null) {
            Map mapC = BouncyCastleProvider.CONFIGURATION.c();
            if (!mapC.isEmpty()) {
                h5mVarG = (h5m) mapC.get(n1Var);
            }
        }
        return new nb6(zb6.d(n1Var), b(a86Var, h5mVarG.k()), new ECPoint(h5mVarG.g().f().t(), h5mVarG.g().g().t()), h5mVarG.j(), h5mVarG.h());
    }

    public static a86 i(g2f g2fVar, f5m f5mVar) {
        Set setB = g2fVar.b();
        if (!f5mVar.i()) {
            if (f5mVar.h()) {
                return g2fVar.a().a();
            }
            if (setB.isEmpty()) {
                return h5m.i(f5mVar.g()).f();
            }
            throw new IllegalStateException("encoded parameters not acceptable");
        }
        n1 n1VarS = n1.s(f5mVar.g());
        if (!setB.isEmpty() && !setB.contains(n1VarS)) {
            throw new IllegalStateException("named curve not acceptable");
        }
        h5m h5mVarG = zb6.g(n1VarS);
        if (h5mVarG == null) {
            h5mVarG = (h5m) g2fVar.c().get(n1VarS);
        }
        return h5mVarG.f();
    }

    public static f86 j(g2f g2fVar, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return zb6.e(g2fVar, f(eCParameterSpec, false));
        }
        qb6 qb6VarA = g2fVar.a();
        return new f86(qb6VarA.a(), qb6VarA.b(), qb6VarA.d(), qb6VarA.c(), qb6VarA.e());
    }
}
