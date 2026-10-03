package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.util.Hashtable;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class u18 {
    public static i5m a = new a();
    public static i5m b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Hashtable f17250c = new Hashtable();
    public static final Hashtable d = new Hashtable();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Hashtable f17251e = new Hashtable();

    public static class a extends i5m {
        @Override // com.oplus.aiunit.vision.i5m
        public h5m a() {
            BigInteger bigIntegerE = u18.e("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger bigIntegerE2 = u18.e("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger bigIntegerE3 = u18.e("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger bigIntegerE4 = u18.e("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            a86 a86VarC = u18.c(new a86.e(bigIntegerE, bigIntegerE2, bigIntegerE3, bigIntegerE4, bigIntegerValueOf));
            return new h5m(a86VarC, new j5m(a86VarC, v79.a("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), bigIntegerE4, bigIntegerValueOf, (byte[]) null);
        }
    }

    public static class b extends i5m {
        @Override // com.oplus.aiunit.vision.i5m
        public h5m a() {
            BigInteger bigIntegerE = u18.e("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger bigIntegerE2 = u18.e("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger bigIntegerE3 = u18.e("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger bigIntegerE4 = u18.e("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            a86 a86VarC = u18.c(new a86.e(bigIntegerE, bigIntegerE2, bigIntegerE3, bigIntegerE4, bigIntegerValueOf));
            return new h5m(a86VarC, new j5m(a86VarC, v79.a("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2")), bigIntegerE4, bigIntegerValueOf, (byte[]) null);
        }
    }

    static {
        d("wapip192v1", v18.wapip192v1, b);
        d("sm2p256v1", v18.sm2p256v1, a);
    }

    public static a86 c(a86 a86Var) {
        return a86Var;
    }

    public static void d(String str, n1 n1Var, i5m i5mVar) {
        f17250c.put(Strings.f(str), n1Var);
        f17251e.put(n1Var, str);
        d.put(n1Var, i5mVar);
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
        i5m i5mVar = (i5m) d.get(n1Var);
        if (i5mVar == null) {
            return null;
        }
        return i5mVar.b();
    }

    public static String h(n1 n1Var) {
        return (String) f17251e.get(n1Var);
    }

    public static n1 i(String str) {
        return (n1) f17250c.get(Strings.f(str));
    }
}
