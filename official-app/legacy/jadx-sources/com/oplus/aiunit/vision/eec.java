package com.oplus.aiunit.vision;

import java.util.Hashtable;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class eec {
    public static final Hashtable a = new Hashtable();
    public static final Hashtable b = new Hashtable();

    static {
        a("B-571", i5g.sect571r1);
        a("B-409", i5g.sect409r1);
        a("B-283", i5g.sect283r1);
        a("B-233", i5g.sect233r1);
        a("B-163", i5g.sect163r2);
        a("K-571", i5g.sect571k1);
        a("K-409", i5g.sect409k1);
        a("K-283", i5g.sect283k1);
        a("K-233", i5g.sect233k1);
        a("K-163", i5g.sect163k1);
        a("P-521", i5g.secp521r1);
        a("P-384", i5g.secp384r1);
        a("P-256", i5g.secp256r1);
        a("P-224", i5g.secp224r1);
        a("P-192", i5g.secp192r1);
    }

    public static void a(String str, n1 n1Var) {
        a.put(str, n1Var);
        b.put(n1Var, str);
    }

    public static h5m b(String str) {
        n1 n1Var = (n1) a.get(Strings.i(str));
        if (n1Var != null) {
            return c(n1Var);
        }
        return null;
    }

    public static h5m c(n1 n1Var) {
        return h5g.i(n1Var);
    }

    public static String d(n1 n1Var) {
        return (String) b.get(n1Var);
    }

    public static n1 e(String str) {
        return (n1) a.get(Strings.i(str));
    }
}
