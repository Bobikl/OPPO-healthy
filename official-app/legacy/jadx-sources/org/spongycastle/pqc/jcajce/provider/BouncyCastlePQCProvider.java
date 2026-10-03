package org.spongycastle.pqc.jcajce.provider;

import com.oplus.aiunit.vision.g2f;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.oi0;
import com.oplus.aiunit.vision.pwe;
import com.oplus.aiunit.vision.t2j;
import com.oplus.aiunit.vision.uz;
import com.oplus.aiunit.vision.yw3;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class BouncyCastlePQCProvider extends Provider implements yw3 {
    private static final String ALGORITHM_PACKAGE = "org.spongycastle.pqc.jcajce.provider.";
    public static final g2f CONFIGURATION = null;
    public static String PROVIDER_NAME = "BCPQC";
    private static String info = "BouncyCastle Post-Quantum Security Provider v1.58";
    private static final Map keyInfoConverters = new HashMap();
    private static final String[] ALGORITHMS = {"Rainbow", "McEliece", "SPHINCS", "NH", "XMSS"};

    public class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            BouncyCastlePQCProvider.this.setup();
            return null;
        }
    }

    public static class b implements PrivilegedAction {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public BouncyCastlePQCProvider() {
        super(PROVIDER_NAME, 1.58d, info);
        AccessController.doPrivileged(new a());
    }

    private static oi0 getAsymmetricKeyInfoConverter(n1 n1Var) {
        oi0 oi0Var;
        Map map = keyInfoConverters;
        synchronized (map) {
            oi0Var = (oi0) map.get(n1Var);
        }
        return oi0Var;
    }

    public static PrivateKey getPrivateKey(pwe pweVar) throws IOException {
        oi0 asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(pweVar.h().f());
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.a(pweVar);
    }

    public static PublicKey getPublicKey(t2j t2jVar) throws IOException {
        oi0 asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(t2jVar.f().f());
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.b(t2jVar);
    }

    private void loadAlgorithms(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class clsLoadClass = loadClass(BouncyCastlePQCProvider.class, str + strArr[i] + "$Mappings");
            if (clsLoadClass != null) {
                try {
                    ((uz) clsLoadClass.newInstance()).a(this);
                } catch (Exception e2) {
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e2);
                }
            }
        }
    }

    public static Class loadClass(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new b(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setup() {
        loadAlgorithms(ALGORITHM_PACKAGE, ALGORITHMS);
    }

    public void addAlgorithm(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException("duplicate provider key (" + str + ") found");
    }

    public void addAttributes(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            String str3 = str + " " + str2;
            if (containsKey(str3)) {
                throw new IllegalStateException("duplicate provider attribute key (" + str3 + ") found");
            }
            put(str3, map.get(str2));
        }
    }

    public void addKeyInfoConverter(n1 n1Var, oi0 oi0Var) {
        Map map = keyInfoConverters;
        synchronized (map) {
            map.put(n1Var, oi0Var);
        }
    }

    public boolean hasAlgorithm(String str, String str2) {
        if (!containsKey(str + "." + str2)) {
            if (!containsKey("Alg.Alias." + str + "." + str2)) {
                return false;
            }
        }
        return true;
    }

    public void setParameter(String str, Object obj) {
        synchronized (CONFIGURATION) {
        }
    }

    public void addAlgorithm(String str, n1 n1Var, String str2) {
        if (containsKey(str + "." + str2)) {
            addAlgorithm(str + "." + n1Var, str2);
            addAlgorithm(str + ".OID." + n1Var, str2);
            return;
        }
        throw new IllegalStateException("primary key (" + str + "." + str2 + ") not found");
    }
}
