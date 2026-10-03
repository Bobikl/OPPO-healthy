package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.util.Hashtable;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class s0 {
    public static i5m a = new a();
    public static final Hashtable b = new Hashtable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Hashtable f16416c = new Hashtable();
    public static final Hashtable d = new Hashtable();

    public static class a extends i5m {
        @Override // com.oplus.aiunit.vision.i5m
        public h5m a() {
            BigInteger bigIntegerE = s0.e("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger bigIntegerE2 = s0.e("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger bigIntegerE3 = s0.e("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger bigIntegerE4 = s0.e("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            a86 a86VarC = s0.c(new a86.e(bigIntegerE, bigIntegerE2, bigIntegerE3, bigIntegerE4, bigIntegerValueOf));
            return new h5m(a86VarC, new j5m(a86VarC, v79.a("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), bigIntegerE4, bigIntegerValueOf, (byte[]) null);
        }
    }

    static {
        d("FRP256v1", t0.FRP256v1, a);
    }

    public static a86 c(a86 a86Var) {
        return a86Var;
    }

    public static void d(String str, n1 n1Var, i5m i5mVar) {
        b.put(Strings.f(str), n1Var);
        d.put(n1Var, str);
        f16416c.put(n1Var, i5mVar);
    }

    public static BigInteger e(String str) {
        return new BigInteger(1, v79.a(str));
    }

    public static h5m f(String str) {
        n1 n1VarI = i(str);
        if (n1VarI == null) {
            return null;
        }
        return g(n1VarI);
    }

    public static h5m g(n1 n1Var) {
        i5m i5mVar = (i5m) f16416c.get(n1Var);
        if (i5mVar == null) {
            return null;
        }
        return i5mVar.b();
    }

    public static String h(n1 n1Var) {
        return (String) d.get(n1Var);
    }

    public static n1 i(String str) {
        return (n1) b.get(Strings.f(str));
    }
}
