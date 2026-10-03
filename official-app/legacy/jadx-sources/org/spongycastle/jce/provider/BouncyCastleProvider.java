package org.spongycastle.jce.provider;

import com.oplus.aiunit.vision.apj;
import com.oplus.aiunit.vision.bec;
import com.oplus.aiunit.vision.g2f;
import com.oplus.aiunit.vision.gc0;
import com.oplus.aiunit.vision.i9f;
import com.oplus.aiunit.vision.k6m;
import com.oplus.aiunit.vision.m6m;
import com.oplus.aiunit.vision.mc3;
import com.oplus.aiunit.vision.n1;
import com.oplus.aiunit.vision.n1e;
import com.oplus.aiunit.vision.oi0;
import com.oplus.aiunit.vision.pwe;
import com.oplus.aiunit.vision.q22;
import com.oplus.aiunit.vision.rob;
import com.oplus.aiunit.vision.t2j;
import com.oplus.aiunit.vision.u6i;
import com.oplus.aiunit.vision.uz;
import com.oplus.aiunit.vision.xob;
import com.oplus.aiunit.vision.yw3;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes11.dex */
public final class BouncyCastleProvider extends Provider implements yw3 {
    private static final String ASYMMETRIC_PACKAGE = "org.spongycastle.jcajce.provider.asymmetric.";
    private static final String DIGEST_PACKAGE = "org.spongycastle.jcajce.provider.digest.";
    private static final String KEYSTORE_PACKAGE = "org.spongycastle.jcajce.provider.keystore.";
    public static final String PROVIDER_NAME = "SC";
    private static final String SECURE_RANDOM_PACKAGE = "org.spongycastle.jcajce.provider.drbg.";
    private static final String SYMMETRIC_PACKAGE = "org.spongycastle.jcajce.provider.symmetric.";
    private static String info = "BouncyCastle Security Provider v1.58";
    public static final g2f CONFIGURATION = new q22();
    private static final Map keyInfoConverters = new HashMap();
    private static final String[] SYMMETRIC_GENERIC = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF"};
    private static final String[] SYMMETRIC_MACS = {"SipHash", "Poly1305"};
    private static final String[] SYMMETRIC_CIPHERS = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624"};
    private static final String[] ASYMMETRIC_GENERIC = {"X509", "IES"};
    private static final String[] ASYMMETRIC_CIPHERS = {"DSA", "DH", apj.Thread_Type_Executor_Cached, "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM"};
    private static final String[] DIGESTS = {"GOST3411", "Keccak", MessageDigestAlgorithms.MD2, "MD4", "MD5", gc0.SHA1, "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", gc0.SHA256, "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "DSTU7564"};
    private static final String[] KEYSTORES = {"BC", "BCFKS", "PKCS12"};
    private static final String[] SECURE_RANDOMS = {"DRBG"};

    public class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            BouncyCastleProvider.this.setup();
            return null;
        }
    }

    public BouncyCastleProvider() {
        super("SC", 1.58d, info);
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
            Class clsA = mc3.a(BouncyCastleProvider.class, str + strArr[i] + "$Mappings");
            if (clsA != null) {
                try {
                    ((uz) clsA.newInstance()).a(this);
                } catch (Exception e2) {
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e2);
                }
            }
        }
    }

    private void loadPQCKeys() {
        addKeyInfoConverter(n1e.sphincs256, new u6i());
        addKeyInfoConverter(n1e.newHope, new bec());
        addKeyInfoConverter(n1e.xmss, new k6m());
        addKeyInfoConverter(n1e.xmss_mt, new m6m());
        addKeyInfoConverter(n1e.mcEliece, new xob());
        addKeyInfoConverter(n1e.mcElieceCca2, new rob());
        addKeyInfoConverter(n1e.rainbow, new i9f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setup() {
        loadAlgorithms(DIGEST_PACKAGE, DIGESTS);
        loadAlgorithms(SYMMETRIC_PACKAGE, SYMMETRIC_GENERIC);
        loadAlgorithms(SYMMETRIC_PACKAGE, SYMMETRIC_MACS);
        loadAlgorithms(SYMMETRIC_PACKAGE, SYMMETRIC_CIPHERS);
        loadAlgorithms(ASYMMETRIC_PACKAGE, ASYMMETRIC_GENERIC);
        loadAlgorithms(ASYMMETRIC_PACKAGE, ASYMMETRIC_CIPHERS);
        loadAlgorithms(KEYSTORE_PACKAGE, KEYSTORES);
        loadAlgorithms(SECURE_RANDOM_PACKAGE, SECURE_RANDOMS);
        loadPQCKeys();
        put("X509Store.CERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.spongycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.spongycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.spongycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.spongycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.spongycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.spongycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.spongycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.spongycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.spongycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        put("CertPathValidator.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.spongycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        put("CertPathValidator.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        put("CertPathBuilder.RFC3280", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        put("CertPathValidator.PKIX", "org.spongycastle.jce.provider.PKIXCertPathValidatorSpi");
        put("CertPathBuilder.PKIX", "org.spongycastle.jce.provider.PKIXCertPathBuilderSpi");
        put("CertStore.Collection", "org.spongycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.spongycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.spongycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
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
        g2f g2fVar = CONFIGURATION;
        synchronized (g2fVar) {
            ((q22) g2fVar).d(str, obj);
        }
    }

    public void addAlgorithm(String str, n1 n1Var, String str2) {
        addAlgorithm(str + "." + n1Var, str2);
        addAlgorithm(str + ".OID." + n1Var, str2);
    }
}
