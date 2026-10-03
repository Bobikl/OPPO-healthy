package io.netty.handler.ssl;

import com.heytap.accessory.pair.utils.SecurityUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.internal.tcnative.Buffer;
import io.netty.internal.tcnative.CertificateCallback;
import io.netty.internal.tcnative.Library;
import io.netty.internal.tcnative.SSL;
import io.netty.internal.tcnative.SSLContext;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;
import io.netty.util.ReferenceCounted;
import io.netty.util.internal.EmptyArrays;
import io.netty.util.internal.NativeLibraryLoader;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class OpenSsl {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final Set<String> AVAILABLE_CIPHER_SUITES;
    private static final Set<String> AVAILABLE_JAVA_CIPHER_SUITES;
    private static final Set<String> AVAILABLE_OPENSSL_CIPHER_SUITES;
    private static final String CERT = "-----BEGIN CERTIFICATE-----\nMIICrjCCAZagAwIBAgIIdSvQPv1QAZQwDQYJKoZIhvcNAQELBQAwFjEUMBIGA1UEAxMLZXhhbXBs\nZS5jb20wIBcNMTgwNDA2MjIwNjU5WhgPOTk5OTEyMzEyMzU5NTlaMBYxFDASBgNVBAMTC2V4YW1w\nbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAggbWsmDQ6zNzRZ5AW8E3eoGl\nqWvOBDb5Fs1oBRrVQHuYmVAoaqwDzXYJ0LOwa293AgWEQ1jpcbZ2hpoYQzqEZBTLnFhMrhRFlH6K\nbJND8Y33kZ/iSVBBDuGbdSbJShlM+4WwQ9IAso4MZ4vW3S1iv5fGGpLgbtXRmBf/RU8omN0Gijlv\nWlLWHWijLN8xQtySFuBQ7ssW8RcKAary3pUm6UUQB+Co6lnfti0Tzag8PgjhAJq2Z3wbsGRnP2YS\nvYoaK6qzmHXRYlp/PxrjBAZAmkLJs4YTm/XFF+fkeYx4i9zqHbyone5yerRibsHaXZWLnUL+rFoe\nMdKvr0VS3sGmhQIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQADQi441pKmXf9FvUV5EHU4v8nJT9Iq\nyqwsKwXnr7AsUlDGHBD7jGrjAXnG5rGxuNKBQ35wRxJATKrUtyaquFUL6H8O6aGQehiFTk6zmPbe\n12Gu44vqqTgIUxnv3JQJiox8S2hMxsSddpeCmSdvmalvD6WG4NthH6B9ZaBEiep1+0s0RUaBYn73\nI7CCUaAtbjfR6pcJjrFk5ei7uwdQZFSJtkP2z8r7zfeANJddAKFlkaMWn7u+OIVuB4XPooWicObk\nNAHFtP65bocUYnDpTVdiyvn8DdqyZ/EO8n1bBKBzuSLplk2msW4pdgaFgY7Vw/0wzcFXfUXmL1uy\nG8sQD/wx\n-----END CERTIFICATE-----";
    private static final Set<String> CLIENT_DEFAULT_PROTOCOLS;
    static final List<String> DEFAULT_CIPHERS;
    private static final String[] DEFAULT_NAMED_GROUPS;
    static final String[] EXTRA_SUPPORTED_TLS_1_3_CIPHERS;
    static final String EXTRA_SUPPORTED_TLS_1_3_CIPHERS_STRING;
    private static final boolean IS_BORINGSSL;
    private static final String KEY = "-----BEGIN PRIVATE KEY-----\nMIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCCBtayYNDrM3NFnkBbwTd6gaWp\na84ENvkWzWgFGtVAe5iZUChqrAPNdgnQs7Brb3cCBYRDWOlxtnaGmhhDOoRkFMucWEyuFEWUfops\nk0PxjfeRn+JJUEEO4Zt1JslKGUz7hbBD0gCyjgxni9bdLWK/l8YakuBu1dGYF/9FTyiY3QaKOW9a\nUtYdaKMs3zFC3JIW4FDuyxbxFwoBqvLelSbpRRAH4KjqWd+2LRPNqDw+COEAmrZnfBuwZGc/ZhK9\nihorqrOYddFiWn8/GuMEBkCaQsmzhhOb9cUX5+R5jHiL3OodvKid7nJ6tGJuwdpdlYudQv6sWh4x\n0q+vRVLewaaFAgMBAAECggEAP8tPJvFtTxhNJAkCloHz0D0vpDHqQBMgntlkgayqmBqLwhyb18pR\ni0qwgh7HHc7wWqOOQuSqlEnrWRrdcI6TSe8R/sErzfTQNoznKWIPYcI/hskk4sdnQ//Yn9/Jvnsv\nU/BBjOTJxtD+sQbhAl80JcA3R+5sArURQkfzzHOL/YMqzAsn5hTzp7HZCxUqBk3KaHRxV7NefeOE\nxlZuWSmxYWfbFIs4kx19/1t7h8CHQWezw+G60G2VBtSBBxDnhBWvqG6R/wpzJ3nEhPLLY9T+XIHe\nipzdMOOOUZorfIg7M+pyYPji+ZIZxIpY5OjrOzXHciAjRtr5Y7l99K1CG1LguQKBgQDrQfIMxxtZ\nvxU/1cRmUV9l7pt5bjV5R6byXq178LxPKVYNjdZ840Q0/OpZEVqaT1xKVi35ohP1QfNjxPLlHD+K\niDAR9z6zkwjIrbwPCnb5kuXy4lpwPcmmmkva25fI7qlpHtbcuQdoBdCfr/KkKaUCMPyY89LCXgEw\n5KTDj64UywKBgQCNfbO+eZLGzhiHhtNJurresCsIGWlInv322gL8CSfBMYl6eNfUTZvUDdFhPISL\nUljKWzXDrjw0ujFSPR0XhUGtiq89H+HUTuPPYv25gVXO+HTgBFZEPl4PpA+BUsSVZy0NddneyqLk\n42Wey9omY9Q8WsdNQS5cbUvy0uG6WFoX7wKBgQDZ1jpW8pa0x2bZsQsm4vo+3G5CRnZlUp+XlWt2\ndDcp5dC0xD1zbs1dc0NcLeGDOTDv9FSl7hok42iHXXq8AygjEm/QcuwwQ1nC2HxmQP5holAiUs4D\nWHM8PWs3wFYPzE459EBoKTxeaeP/uWAn+he8q7d5uWvSZlEcANs/6e77eQKBgD21Ar0hfFfj7mK8\n9E0FeRZBsqK3omkfnhcYgZC11Xa2SgT1yvs2Va2n0RcdM5kncr3eBZav2GYOhhAdwyBM55XuE/sO\neokDVutNeuZ6d5fqV96TRaRBpvgfTvvRwxZ9hvKF4Vz+9wfn/JvCwANaKmegF6ejs7pvmF3whq2k\ndrZVAoGAX5YxQ5XMTD0QbMAl7/6qp6S58xNoVdfCkmkj1ZLKaHKIjS/benkKGlySVQVPexPfnkZx\np/Vv9yyphBoudiTBS9Uog66ueLYZqpgxlM/6OhYg86Gm3U2ycvMxYjBM1NFiyze21AqAhI+HX+Ot\nmraV2/guSgDgZAhukRZzeQ2RucI=\n-----END PRIVATE KEY-----";
    static final String[] NAMED_GROUPS;
    private static final Set<String> SERVER_DEFAULT_PROTOCOLS;
    static final Set<String> SUPPORTED_PROTOCOLS_SET;
    private static final boolean SUPPORTS_KEYMANAGER_FACTORY;
    private static final boolean SUPPORTS_OCSP;
    private static final boolean TLSV13_SUPPORTED;
    private static final Throwable UNAVAILABILITY_CAUSE;
    private static final boolean USE_KEYMANAGER_FACTORY;
    private static final InternalLogger logger;

    /* JADX WARN: Code duplicated, block: B:130:0x02f3 A[Catch: all -> 0x03e8, TryCatch #1 {all -> 0x03e8, blocks: (B:128:0x02ec, B:130:0x02f3, B:133:0x02fa, B:136:0x0301, B:139:0x0308, B:140:0x030b, B:142:0x0313, B:144:0x032e, B:176:0x03c8, B:178:0x03cf, B:181:0x03d6, B:184:0x03dd, B:187:0x03e4, B:188:0x03e7), top: B:238:0x01c6 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02fa A[Catch: all -> 0x03e8, TryCatch #1 {all -> 0x03e8, blocks: (B:128:0x02ec, B:130:0x02f3, B:133:0x02fa, B:136:0x0301, B:139:0x0308, B:140:0x030b, B:142:0x0313, B:144:0x032e, B:176:0x03c8, B:178:0x03cf, B:181:0x03d6, B:184:0x03dd, B:187:0x03e4, B:188:0x03e7), top: B:238:0x01c6 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0301 A[Catch: all -> 0x03e8, TryCatch #1 {all -> 0x03e8, blocks: (B:128:0x02ec, B:130:0x02f3, B:133:0x02fa, B:136:0x0301, B:139:0x0308, B:140:0x030b, B:142:0x0313, B:144:0x032e, B:176:0x03c8, B:178:0x03cf, B:181:0x03d6, B:184:0x03dd, B:187:0x03e4, B:188:0x03e7), top: B:238:0x01c6 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0308 A[Catch: all -> 0x03e8, TryCatch #1 {all -> 0x03e8, blocks: (B:128:0x02ec, B:130:0x02f3, B:133:0x02fa, B:136:0x0301, B:139:0x0308, B:140:0x030b, B:142:0x0313, B:144:0x032e, B:176:0x03c8, B:178:0x03cf, B:181:0x03d6, B:184:0x03dd, B:187:0x03e4, B:188:0x03e7), top: B:238:0x01c6 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0313 A[Catch: all -> 0x03e8, TryCatch #1 {all -> 0x03e8, blocks: (B:128:0x02ec, B:130:0x02f3, B:133:0x02fa, B:136:0x0301, B:139:0x0308, B:140:0x030b, B:142:0x0313, B:144:0x032e, B:176:0x03c8, B:178:0x03cf, B:181:0x03d6, B:184:0x03dd, B:187:0x03e4, B:188:0x03e7), top: B:238:0x01c6 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x032e A[Catch: all -> 0x03e8, TRY_LEAVE, TryCatch #1 {all -> 0x03e8, blocks: (B:128:0x02ec, B:130:0x02f3, B:133:0x02fa, B:136:0x0301, B:139:0x0308, B:140:0x030b, B:142:0x0313, B:144:0x032e, B:176:0x03c8, B:178:0x03cf, B:181:0x03d6, B:184:0x03dd, B:187:0x03e4, B:188:0x03e7), top: B:238:0x01c6 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0342 A[Catch: all -> 0x03ad, TryCatch #5 {all -> 0x03ad, blocks: (B:146:0x0338, B:148:0x0342, B:150:0x034c, B:149:0x0349, B:151:0x0354, B:157:0x0378, B:159:0x0386, B:161:0x03a5, B:160:0x0392), top: B:242:0x0338 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0349 A[Catch: all -> 0x03ad, TryCatch #5 {all -> 0x03ad, blocks: (B:146:0x0338, B:148:0x0342, B:150:0x034c, B:149:0x0349, B:151:0x0354, B:157:0x0378, B:159:0x0386, B:161:0x03a5, B:160:0x0392), top: B:242:0x0338 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0378 A[Catch: all -> 0x03ad, TRY_ENTER, TryCatch #5 {all -> 0x03ad, blocks: (B:146:0x0338, B:148:0x0342, B:150:0x034c, B:149:0x0349, B:151:0x0354, B:157:0x0378, B:159:0x0386, B:161:0x03a5, B:160:0x0392), top: B:242:0x0338 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0386 A[Catch: all -> 0x03ad, TryCatch #5 {all -> 0x03ad, blocks: (B:146:0x0338, B:148:0x0342, B:150:0x034c, B:149:0x0349, B:151:0x0354, B:157:0x0378, B:159:0x0386, B:161:0x03a5, B:160:0x0392), top: B:242:0x0338 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0392 A[Catch: all -> 0x03ad, TryCatch #5 {all -> 0x03ad, blocks: (B:146:0x0338, B:148:0x0342, B:150:0x034c, B:149:0x0349, B:151:0x0354, B:157:0x0378, B:159:0x0386, B:161:0x03a5, B:160:0x0392), top: B:242:0x0338 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x03af  */
    /* JADX WARN: Code duplicated, block: B:178:0x03cf A[Catch: all -> 0x03e8, TryCatch #1 {all -> 0x03e8, blocks: (B:128:0x02ec, B:130:0x02f3, B:133:0x02fa, B:136:0x0301, B:139:0x0308, B:140:0x030b, B:142:0x0313, B:144:0x032e, B:176:0x03c8, B:178:0x03cf, B:181:0x03d6, B:184:0x03dd, B:187:0x03e4, B:188:0x03e7), top: B:238:0x01c6 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x03d6 A[Catch: all -> 0x03e8, TryCatch #1 {all -> 0x03e8, blocks: (B:128:0x02ec, B:130:0x02f3, B:133:0x02fa, B:136:0x0301, B:139:0x0308, B:140:0x030b, B:142:0x0313, B:144:0x032e, B:176:0x03c8, B:178:0x03cf, B:181:0x03d6, B:184:0x03dd, B:187:0x03e4, B:188:0x03e7), top: B:238:0x01c6 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x03dd A[Catch: all -> 0x03e8, TryCatch #1 {all -> 0x03e8, blocks: (B:128:0x02ec, B:130:0x02f3, B:133:0x02fa, B:136:0x0301, B:139:0x0308, B:140:0x030b, B:142:0x0313, B:144:0x032e, B:176:0x03c8, B:178:0x03cf, B:181:0x03d6, B:184:0x03dd, B:187:0x03e4, B:188:0x03e7), top: B:238:0x01c6 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x03e4 A[Catch: all -> 0x03e8, TryCatch #1 {all -> 0x03e8, blocks: (B:128:0x02ec, B:130:0x02f3, B:133:0x02fa, B:136:0x0301, B:139:0x0308, B:140:0x030b, B:142:0x0313, B:144:0x032e, B:176:0x03c8, B:178:0x03cf, B:181:0x03d6, B:184:0x03dd, B:187:0x03e4, B:188:0x03e7), top: B:238:0x01c6 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0424  */
    /* JADX WARN: Code duplicated, block: B:212:0x0495  */
    /* JADX WARN: Code duplicated, block: B:215:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:218:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:221:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:224:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:226:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:229:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:232:0x0500  */
    /* JADX WARN: Code duplicated, block: B:236:0x025b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0267 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x035c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0430 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01fe A[Catch: all -> 0x01ed, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x01ed, blocks: (B:61:0x01ce, B:63:0x01d2, B:65:0x01d8, B:68:0x01e0, B:71:0x01e7, B:77:0x01fe), top: B:244:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0255 A[Catch: all -> 0x0274, TRY_LEAVE, TryCatch #12 {all -> 0x0274, blocks: (B:85:0x024f, B:87:0x0255), top: B:252:0x024f }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0265 A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [long] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    static {
        Throwable th;
        ?? r9;
        boolean z;
        boolean z2;
        ?? r10;
        LinkedHashSet linkedHashSet;
        List<String> listUnmodifiableList;
        LinkedHashSet linkedHashSet2;
        Set<String> setUnmodifiableSet;
        InternalLogger internalLogger;
        boolean z3;
        boolean z4;
        long jNewSSL;
        ?? r13;
        long bio;
        long x509Chain;
        long privateKey;
        String[] ciphers;
        int length;
        int i;
        boolean z5;
        PemPrivateKey pemPrivateKeyValueOf;
        long j2;
        boolean z6;
        long bio2;
        String str;
        String[] strArrSplit;
        LinkedHashSet linkedHashSet3;
        LinkedHashSet linkedHashSet4;
        LinkedHashSet linkedHashSet5;
        int length2;
        int i2;
        String[] strArr;
        String[] strArr2;
        String str2;
        String openSsl;
        boolean zContains;
        boolean z7;
        String str3;
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance((Class<?>) OpenSsl.class);
        logger = internalLoggerFactory;
        DEFAULT_NAMED_GROUPS = new String[]{"x25519", SecurityUtils.SECP256R1, "secp384r1", "secp521r1"};
        if (SystemPropertyUtil.getBoolean("io.netty.handler.ssl.noOpenSsl", false)) {
            e = new UnsupportedOperationException("OpenSSL was explicit disabled with -Dio.netty.handler.ssl.noOpenSsl=true");
            internalLoggerFactory.debug("netty-tcnative explicit disabled; " + OpenSslEngine.class.getSimpleName() + " will be unavailable.", e);
        } else {
            try {
                Class.forName("io.netty.internal.tcnative.SSLContext", false, PlatformDependent.getClassLoader(OpenSsl.class));
                e = null;
            } catch (ClassNotFoundException e2) {
                e = e2;
                logger.debug("netty-tcnative not in the classpath; " + OpenSslEngine.class.getSimpleName() + " will be unavailable.");
            }
            if (e == null) {
                try {
                    loadTcNative();
                    th = e;
                } catch (Throwable th2) {
                    th = th2;
                    logger.debug("Failed to load netty-tcnative; " + OpenSslEngine.class.getSimpleName() + " will be unavailable, unless the application has already loaded the symbols by some other means. See https://netty.io/wiki/forked-tomcat-native.html for more information.", th);
                }
                try {
                    String str4 = SystemPropertyUtil.get("io.netty.handler.ssl.openssl.engine", null);
                    if (str4 == null) {
                        logger.debug("Initialize netty-tcnative using engine: 'default'");
                    } else {
                        logger.debug("Initialize netty-tcnative using engine: '{}'", str4);
                    }
                    initializeTcNative(str4);
                    e = null;
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                    logger.debug("Failed to initialize netty-tcnative; " + OpenSslEngine.class.getSimpleName() + " will be unavailable. See https://netty.io/wiki/forked-tomcat-native.html for more information.", th3);
                    e = th;
                }
            }
        }
        UNAVAILABILITY_CAUSE = e;
        CLIENT_DEFAULT_PROTOCOLS = protocols("jdk.tls.client.protocols");
        SERVER_DEFAULT_PROTOCOLS = protocols("jdk.tls.server.protocols");
        if (e != null) {
            DEFAULT_CIPHERS = Collections.emptyList();
            AVAILABLE_OPENSSL_CIPHER_SUITES = Collections.emptySet();
            AVAILABLE_JAVA_CIPHER_SUITES = Collections.emptySet();
            AVAILABLE_CIPHER_SUITES = Collections.emptySet();
            SUPPORTS_KEYMANAGER_FACTORY = false;
            USE_KEYMANAGER_FACTORY = false;
            SUPPORTED_PROTOCOLS_SET = Collections.emptySet();
            SUPPORTS_OCSP = false;
            TLSV13_SUPPORTED = false;
            IS_BORINGSSL = false;
            EXTRA_SUPPORTED_TLS_1_3_CIPHERS = EmptyArrays.EMPTY_STRINGS;
            EXTRA_SUPPORTED_TLS_1_3_CIPHERS_STRING = "";
            NAMED_GROUPS = DEFAULT_NAMED_GROUPS;
            return;
        }
        logger.debug("netty-tcnative using native library: {}", SSL.versionString());
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet6 = new LinkedHashSet(128);
        String[] strArr3 = DEFAULT_NAMED_GROUPS;
        String[] strArr4 = new String[strArr3.length];
        for (int i3 = 0; i3 < strArr3.length; i3++) {
            strArr4[i3] = GroupsConverter.toOpenSsl(strArr3[i3]);
        }
        boolean zEquals = "BoringSSL".equals(versionString());
        IS_BORINGSSL = zEquals;
        if (zEquals) {
            String[] strArr5 = {Ciphers.TLS_AES_128_GCM_SHA256, Ciphers.TLS_AES_256_GCM_SHA384, Ciphers.TLS_CHACHA20_POLY1305_SHA256};
            EXTRA_SUPPORTED_TLS_1_3_CIPHERS = strArr5;
            StringBuilder sb = new StringBuilder(128);
            for (String str5 : strArr5) {
                sb.append(str5);
                sb.append(":");
            }
            sb.setLength(sb.length() - 1);
            EXTRA_SUPPORTED_TLS_1_3_CIPHERS_STRING = sb.toString();
            r9 = sb;
        } else {
            EXTRA_SUPPORTED_TLS_1_3_CIPHERS = EmptyArrays.EMPTY_STRINGS;
            EXTRA_SUPPORTED_TLS_1_3_CIPHERS_STRING = "";
            r9 = zEquals;
        }
        try {
            try {
                long jMake = SSLContext.make(63, 1);
                try {
                    if (!SslProvider.isTlsv13Supported(SslProvider.JDK)) {
                        z4 = false;
                        SSLContext.setCipherSuite(jMake, "ALL", false);
                        jNewSSL = SSL.newSSL(jMake, true);
                        ciphers = SSL.getCiphers(jNewSSL);
                        length = ciphers.length;
                        for (i = 0; i < length; i++) {
                            str3 = ciphers[i];
                            if (str3 != null) {
                                linkedHashSet6.add(str3);
                            }
                        }
                        z5 = IS_BORINGSSL;
                        r13 = length;
                        if (z5) {
                            Collections.addAll(linkedHashSet6, EXTRA_SUPPORTED_TLS_1_3_CIPHERS);
                            String[] strArr6 = {"AEAD-AES128-GCM-SHA256", "AEAD-AES256-GCM-SHA384", "AEAD-CHACHA20-POLY1305-SHA256"};
                            Collections.addAll(linkedHashSet6, strArr6);
                            r13 = strArr6;
                        }
                        pemPrivateKeyValueOf = PemPrivateKey.valueOf(KEY.getBytes(CharsetUtil.US_ASCII));
                        SSLContext.setCertificateCallback(jMake, (CertificateCallback) null);
                        bio = ReferenceCountedOpenSslContext.toBIO(ByteBufAllocator.DEFAULT, selfSignedCertificate());
                        x509Chain = SSL.parseX509Chain(bio);
                        bio2 = ReferenceCountedOpenSslContext.toBIO(UnpooledByteBufAllocator.DEFAULT, pemPrivateKeyValueOf.retain());
                        privateKey = SSL.parsePrivateKey(bio2, (String) null);
                        SSL.setKeyMaterial(jNewSSL, x509Chain, privateKey);
                        zContains = SystemPropertyUtil.contains("io.netty.handler.ssl.openssl.useKeyManagerFactory");
                        if (!z5) {
                            if (zContains) {
                                logger.info("System property 'io.netty.handler.ssl.openssl.useKeyManagerFactory' is deprecated and will be ignored when using BoringSSL");
                            }
                            z7 = true;
                            z6 = z7;
                            pemPrivateKeyValueOf.release();
                            z = true;
                            bio2 = bio2;
                            SSL.freeSSL(jNewSSL);
                            if (bio != 0) {
                                SSL.freeBIO(bio);
                            }
                            if (bio2 != 0) {
                                SSL.freeBIO(bio2);
                            }
                            if (x509Chain != 0) {
                                SSL.freeX509Chain(x509Chain);
                            }
                            if (privateKey != 0) {
                                SSL.freePrivateKey(privateKey);
                            }
                            str = SystemPropertyUtil.get("jdk.tls.namedGroups", null);
                            if (str != null) {
                                strArrSplit = str.split(",");
                                linkedHashSet3 = new LinkedHashSet(strArrSplit.length);
                                linkedHashSet4 = new LinkedHashSet(strArrSplit.length);
                                linkedHashSet5 = new LinkedHashSet();
                                length2 = strArrSplit.length;
                                i2 = 0;
                                while (i2 < length2) {
                                    str2 = strArrSplit[i2];
                                    String[] strArr7 = strArrSplit;
                                    openSsl = GroupsConverter.toOpenSsl(str2);
                                    boolean z8 = z6;
                                    if (SSLContext.setCurvesList(jMake, new String[]{openSsl})) {
                                        linkedHashSet4.add(openSsl);
                                        linkedHashSet3.add(str2);
                                    } else {
                                        linkedHashSet5.add(str2);
                                    }
                                    i2++;
                                    strArrSplit = strArr7;
                                    z6 = z8;
                                }
                                z2 = z6;
                                if (linkedHashSet3.isEmpty()) {
                                    logger.info("All configured namedGroups are not supported: {}. Use default: {}.", Arrays.toString(linkedHashSet5.toArray(EmptyArrays.EMPTY_STRINGS)), Arrays.toString(DEFAULT_NAMED_GROUPS));
                                } else {
                                    strArr = EmptyArrays.EMPTY_STRINGS;
                                    strArr2 = (String[]) linkedHashSet3.toArray(strArr);
                                    if (linkedHashSet5.isEmpty()) {
                                        logger.info("Using configured namedGroups -D 'jdk.tls.namedGroup': {} ", Arrays.toString(strArr2));
                                    } else {
                                        logger.info("Using supported configured namedGroups: {}. Unsupported namedGroups: {}. ", Arrays.toString(strArr2), Arrays.toString(linkedHashSet5.toArray(strArr)));
                                    }
                                    strArr4 = (String[]) linkedHashSet4.toArray(strArr);
                                }
                            } else {
                                z2 = z6;
                            }
                            strArr3 = strArr4;
                            SSLContext.free(jMake);
                            r10 = z4;
                            boolean z9 = z2;
                            NAMED_GROUPS = strArr3;
                            Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(linkedHashSet6);
                            AVAILABLE_OPENSSL_CIPHER_SUITES = setUnmodifiableSet2;
                            linkedHashSet = new LinkedHashSet(setUnmodifiableSet2.size() * 2);
                            for (String str6 : setUnmodifiableSet2) {
                                if (SslUtils.isTLSv13Cipher(str6)) {
                                    linkedHashSet.add(str6);
                                } else {
                                    linkedHashSet.add(CipherSuiteConverter.toJava(str6, "TLS"));
                                    linkedHashSet.add(CipherSuiteConverter.toJava(str6, "SSL"));
                                }
                            }
                            SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
                            SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
                            SslUtils.addIfSupported(linkedHashSet, arrayList, EXTRA_SUPPORTED_TLS_1_3_CIPHERS);
                            SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet);
                            listUnmodifiableList = Collections.unmodifiableList(arrayList);
                            DEFAULT_CIPHERS = listUnmodifiableList;
                            Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(linkedHashSet);
                            AVAILABLE_JAVA_CIPHER_SUITES = setUnmodifiableSet3;
                            Set<String> set = AVAILABLE_OPENSSL_CIPHER_SUITES;
                            LinkedHashSet linkedHashSet7 = new LinkedHashSet(set.size() + setUnmodifiableSet3.size());
                            linkedHashSet7.addAll(set);
                            linkedHashSet7.addAll(setUnmodifiableSet3);
                            AVAILABLE_CIPHER_SUITES = linkedHashSet7;
                            SUPPORTS_KEYMANAGER_FACTORY = z;
                            USE_KEYMANAGER_FACTORY = z9;
                            linkedHashSet2 = new LinkedHashSet(6);
                            linkedHashSet2.add(SslProtocols.SSL_v2_HELLO);
                            if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                                linkedHashSet2.add(SslProtocols.SSL_v2);
                            }
                            if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                                linkedHashSet2.add(SslProtocols.SSL_v3);
                            }
                            if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                                linkedHashSet2.add(SslProtocols.TLS_v1);
                            }
                            if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                                linkedHashSet2.add(SslProtocols.TLS_v1_1);
                            }
                            if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                                linkedHashSet2.add(SslProtocols.TLS_v1_2);
                            }
                            if (r10 == 0) {
                                TLSV13_SUPPORTED = false;
                            } else {
                                TLSV13_SUPPORTED = false;
                            }
                            setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet2);
                            SUPPORTED_PROTOCOLS_SET = setUnmodifiableSet;
                            SUPPORTS_OCSP = doesSupportOcsp();
                            internalLogger = logger;
                            if (internalLogger.isDebugEnabled()) {
                                internalLogger.debug("Supported protocols (OpenSSL): {} ", setUnmodifiableSet);
                                internalLogger.debug("Default cipher suites (OpenSSL): {}", listUnmodifiableList);
                                return;
                            }
                            return;
                        }
                        z7 = SystemPropertyUtil.getBoolean("io.netty.handler.ssl.openssl.useKeyManagerFactory", true);
                        if (zContains) {
                            logger.info("System property 'io.netty.handler.ssl.openssl.useKeyManagerFactory' is deprecated and so will be ignored in the future");
                        }
                        z6 = z7;
                        pemPrivateKeyValueOf.release();
                        z = true;
                        bio2 = bio2;
                        SSL.freeSSL(jNewSSL);
                        if (bio != 0) {
                            SSL.freeBIO(bio);
                        }
                        if (bio2 != 0) {
                            SSL.freeBIO(bio2);
                        }
                        if (x509Chain != 0) {
                            SSL.freeX509Chain(x509Chain);
                        }
                        if (privateKey != 0) {
                            SSL.freePrivateKey(privateKey);
                        }
                        str = SystemPropertyUtil.get("jdk.tls.namedGroups", null);
                        if (str != null) {
                            strArrSplit = str.split(",");
                            linkedHashSet3 = new LinkedHashSet(strArrSplit.length);
                            linkedHashSet4 = new LinkedHashSet(strArrSplit.length);
                            linkedHashSet5 = new LinkedHashSet();
                            length2 = strArrSplit.length;
                            i2 = 0;
                            while (i2 < length2) {
                                str2 = strArrSplit[i2];
                                String[] strArr8 = strArrSplit;
                                openSsl = GroupsConverter.toOpenSsl(str2);
                                boolean z10 = z6;
                                if (SSLContext.setCurvesList(jMake, new String[]{openSsl})) {
                                    linkedHashSet4.add(openSsl);
                                    linkedHashSet3.add(str2);
                                } else {
                                    linkedHashSet5.add(str2);
                                }
                                i2++;
                                strArrSplit = strArr8;
                                z6 = z10;
                            }
                            z2 = z6;
                            if (linkedHashSet3.isEmpty()) {
                                logger.info("All configured namedGroups are not supported: {}. Use default: {}.", Arrays.toString(linkedHashSet5.toArray(EmptyArrays.EMPTY_STRINGS)), Arrays.toString(DEFAULT_NAMED_GROUPS));
                            } else {
                                strArr = EmptyArrays.EMPTY_STRINGS;
                                strArr2 = (String[]) linkedHashSet3.toArray(strArr);
                                if (linkedHashSet5.isEmpty()) {
                                    logger.info("Using configured namedGroups -D 'jdk.tls.namedGroup': {} ", Arrays.toString(strArr2));
                                } else {
                                    logger.info("Using supported configured namedGroups: {}. Unsupported namedGroups: {}. ", Arrays.toString(strArr2), Arrays.toString(linkedHashSet5.toArray(strArr)));
                                }
                                strArr4 = (String[]) linkedHashSet4.toArray(strArr);
                            }
                        } else {
                            z2 = z6;
                        }
                        strArr3 = strArr4;
                        SSLContext.free(jMake);
                        r10 = z4;
                        boolean z11 = z2;
                        NAMED_GROUPS = strArr3;
                        Set<String> setUnmodifiableSet4 = Collections.unmodifiableSet(linkedHashSet6);
                        AVAILABLE_OPENSSL_CIPHER_SUITES = setUnmodifiableSet4;
                        linkedHashSet = new LinkedHashSet(setUnmodifiableSet4.size() * 2);
                        while (r0.hasNext()) {
                            if (SslUtils.isTLSv13Cipher(str6)) {
                                linkedHashSet.add(CipherSuiteConverter.toJava(str6, "TLS"));
                                linkedHashSet.add(CipherSuiteConverter.toJava(str6, "SSL"));
                            } else {
                                linkedHashSet.add(str6);
                            }
                        }
                        SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
                        SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
                        SslUtils.addIfSupported(linkedHashSet, arrayList, EXTRA_SUPPORTED_TLS_1_3_CIPHERS);
                        SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet);
                        listUnmodifiableList = Collections.unmodifiableList(arrayList);
                        DEFAULT_CIPHERS = listUnmodifiableList;
                        Set<String> setUnmodifiableSet5 = Collections.unmodifiableSet(linkedHashSet);
                        AVAILABLE_JAVA_CIPHER_SUITES = setUnmodifiableSet5;
                        Set<String> set2 = AVAILABLE_OPENSSL_CIPHER_SUITES;
                        LinkedHashSet linkedHashSet8 = new LinkedHashSet(set2.size() + setUnmodifiableSet5.size());
                        linkedHashSet8.addAll(set2);
                        linkedHashSet8.addAll(setUnmodifiableSet5);
                        AVAILABLE_CIPHER_SUITES = linkedHashSet8;
                        SUPPORTS_KEYMANAGER_FACTORY = z;
                        USE_KEYMANAGER_FACTORY = z11;
                        linkedHashSet2 = new LinkedHashSet(6);
                        linkedHashSet2.add(SslProtocols.SSL_v2_HELLO);
                        if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                            linkedHashSet2.add(SslProtocols.SSL_v2);
                        }
                        if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                            linkedHashSet2.add(SslProtocols.SSL_v3);
                        }
                        if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                            linkedHashSet2.add(SslProtocols.TLS_v1);
                        }
                        if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                            linkedHashSet2.add(SslProtocols.TLS_v1_1);
                        }
                        if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                            linkedHashSet2.add(SslProtocols.TLS_v1_2);
                        }
                        if (r10 == 0) {
                            TLSV13_SUPPORTED = false;
                        } else {
                            TLSV13_SUPPORTED = false;
                        }
                        setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet2);
                        SUPPORTED_PROTOCOLS_SET = setUnmodifiableSet;
                        SUPPORTS_OCSP = doesSupportOcsp();
                        internalLogger = logger;
                        if (internalLogger.isDebugEnabled()) {
                            internalLogger.debug("Supported protocols (OpenSSL): {} ", setUnmodifiableSet);
                            internalLogger.debug("Default cipher suites (OpenSSL): {}", listUnmodifiableList);
                            return;
                        }
                        return;
                        logger.debug("Failed to get useKeyManagerFactory system property.");
                        pemPrivateKeyValueOf.release();
                        z = true;
                        bio2 = bio2;
                        SSL.freeSSL(jNewSSL);
                        if (bio != 0) {
                            SSL.freeBIO(bio);
                        }
                        if (bio2 != 0) {
                            SSL.freeBIO(bio2);
                        }
                        if (x509Chain != 0) {
                            SSL.freeX509Chain(x509Chain);
                        }
                        if (privateKey != 0) {
                            SSL.freePrivateKey(privateKey);
                        }
                        str = SystemPropertyUtil.get("jdk.tls.namedGroups", null);
                        if (str != null) {
                            strArrSplit = str.split(",");
                            linkedHashSet3 = new LinkedHashSet(strArrSplit.length);
                            linkedHashSet4 = new LinkedHashSet(strArrSplit.length);
                            linkedHashSet5 = new LinkedHashSet();
                            length2 = strArrSplit.length;
                            i2 = 0;
                            while (i2 < length2) {
                                str2 = strArrSplit[i2];
                                String[] strArr9 = strArrSplit;
                                openSsl = GroupsConverter.toOpenSsl(str2);
                                boolean z12 = z6;
                                if (SSLContext.setCurvesList(jMake, new String[]{openSsl})) {
                                    linkedHashSet4.add(openSsl);
                                    linkedHashSet3.add(str2);
                                } else {
                                    linkedHashSet5.add(str2);
                                }
                                i2++;
                                strArrSplit = strArr9;
                                z6 = z12;
                            }
                            z2 = z6;
                            if (linkedHashSet3.isEmpty()) {
                                logger.info("All configured namedGroups are not supported: {}. Use default: {}.", Arrays.toString(linkedHashSet5.toArray(EmptyArrays.EMPTY_STRINGS)), Arrays.toString(DEFAULT_NAMED_GROUPS));
                            } else {
                                strArr = EmptyArrays.EMPTY_STRINGS;
                                strArr2 = (String[]) linkedHashSet3.toArray(strArr);
                                if (linkedHashSet5.isEmpty()) {
                                    logger.info("Using configured namedGroups -D 'jdk.tls.namedGroup': {} ", Arrays.toString(strArr2));
                                } else {
                                    logger.info("Using supported configured namedGroups: {}. Unsupported namedGroups: {}. ", Arrays.toString(strArr2), Arrays.toString(linkedHashSet5.toArray(strArr)));
                                }
                                strArr4 = (String[]) linkedHashSet4.toArray(strArr);
                            }
                        } else {
                            z2 = z6;
                        }
                        strArr3 = strArr4;
                        SSLContext.free(jMake);
                        r10 = z4;
                        boolean z13 = z2;
                        NAMED_GROUPS = strArr3;
                        Set<String> setUnmodifiableSet6 = Collections.unmodifiableSet(linkedHashSet6);
                        AVAILABLE_OPENSSL_CIPHER_SUITES = setUnmodifiableSet6;
                        linkedHashSet = new LinkedHashSet(setUnmodifiableSet6.size() * 2);
                        while (r0.hasNext()) {
                            if (SslUtils.isTLSv13Cipher(str6)) {
                                linkedHashSet.add(CipherSuiteConverter.toJava(str6, "TLS"));
                                linkedHashSet.add(CipherSuiteConverter.toJava(str6, "SSL"));
                            } else {
                                linkedHashSet.add(str6);
                            }
                        }
                        SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
                        SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
                        SslUtils.addIfSupported(linkedHashSet, arrayList, EXTRA_SUPPORTED_TLS_1_3_CIPHERS);
                        SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet);
                        listUnmodifiableList = Collections.unmodifiableList(arrayList);
                        DEFAULT_CIPHERS = listUnmodifiableList;
                        Set<String> setUnmodifiableSet7 = Collections.unmodifiableSet(linkedHashSet);
                        AVAILABLE_JAVA_CIPHER_SUITES = setUnmodifiableSet7;
                        Set<String> set3 = AVAILABLE_OPENSSL_CIPHER_SUITES;
                        LinkedHashSet linkedHashSet9 = new LinkedHashSet(set3.size() + setUnmodifiableSet7.size());
                        linkedHashSet9.addAll(set3);
                        linkedHashSet9.addAll(setUnmodifiableSet7);
                        AVAILABLE_CIPHER_SUITES = linkedHashSet9;
                        SUPPORTS_KEYMANAGER_FACTORY = z;
                        USE_KEYMANAGER_FACTORY = z13;
                        linkedHashSet2 = new LinkedHashSet(6);
                        linkedHashSet2.add(SslProtocols.SSL_v2_HELLO);
                        if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                            linkedHashSet2.add(SslProtocols.SSL_v2);
                        }
                        if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                            linkedHashSet2.add(SslProtocols.SSL_v3);
                        }
                        if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                            linkedHashSet2.add(SslProtocols.TLS_v1);
                        }
                        if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                            linkedHashSet2.add(SslProtocols.TLS_v1_1);
                        }
                        if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                            linkedHashSet2.add(SslProtocols.TLS_v1_2);
                        }
                        if (r10 == 0) {
                            TLSV13_SUPPORTED = false;
                        } else {
                            TLSV13_SUPPORTED = false;
                        }
                        setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet2);
                        SUPPORTED_PROTOCOLS_SET = setUnmodifiableSet;
                        SUPPORTS_OCSP = doesSupportOcsp();
                        internalLogger = logger;
                        if (internalLogger.isDebugEnabled()) {
                            internalLogger.debug("Supported protocols (OpenSSL): {} ", setUnmodifiableSet);
                            internalLogger.debug("Default cipher suites (OpenSSL): {}", listUnmodifiableList);
                            return;
                        }
                        return;
                    }
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        Iterator<String> it = SslUtils.TLSV13_CIPHERS.iterator();
                        while (it.hasNext()) {
                            String openSsl2 = CipherSuiteConverter.toOpenSsl(it.next(), IS_BORINGSSL);
                            if (openSsl2 != null) {
                                sb2.append(openSsl2);
                                sb2.append(':');
                            }
                        }
                        if (sb2.length() == 0) {
                            z3 = false;
                        } else {
                            sb2.setLength(sb2.length() - 1);
                            SSLContext.setCipherSuite(jMake, sb2.toString(), true);
                            z3 = true;
                        }
                        z4 = z3;
                    } catch (Exception unused) {
                        z4 = false;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    try {
                        SSLContext.setCipherSuite(jMake, "ALL", false);
                        jNewSSL = SSL.newSSL(jMake, true);
                        try {
                            try {
                                ciphers = SSL.getCiphers(jNewSSL);
                                length = ciphers.length;
                                while (i < length) {
                                    try {
                                        str3 = ciphers[i];
                                        if (str3 != null && !str3.isEmpty() && !linkedHashSet6.contains(str3) && (z4 || !SslUtils.isTLSv13Cipher(str3))) {
                                            linkedHashSet6.add(str3);
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        r13 = 0;
                                        bio = 0;
                                        x509Chain = 0;
                                        privateKey = 0;
                                        SSL.freeSSL(jNewSSL);
                                        if (bio != 0) {
                                            SSL.freeBIO(bio);
                                        }
                                        if (r13 != 0) {
                                            SSL.freeBIO((long) r13);
                                        }
                                        if (x509Chain != 0) {
                                            SSL.freeX509Chain(x509Chain);
                                        }
                                        if (privateKey != 0) {
                                            SSL.freePrivateKey(privateKey);
                                        }
                                        throw th;
                                    }
                                }
                                z5 = IS_BORINGSSL;
                                r13 = length;
                                if (z5) {
                                    Collections.addAll(linkedHashSet6, EXTRA_SUPPORTED_TLS_1_3_CIPHERS);
                                    String[] strArr10 = {"AEAD-AES128-GCM-SHA256", "AEAD-AES256-GCM-SHA384", "AEAD-CHACHA20-POLY1305-SHA256"};
                                    Collections.addAll(linkedHashSet6, strArr10);
                                    r13 = strArr10;
                                }
                                try {
                                    pemPrivateKeyValueOf = PemPrivateKey.valueOf(KEY.getBytes(CharsetUtil.US_ASCII));
                                    try {
                                        SSLContext.setCertificateCallback(jMake, (CertificateCallback) null);
                                        bio = ReferenceCountedOpenSslContext.toBIO(ByteBufAllocator.DEFAULT, selfSignedCertificate());
                                        try {
                                            x509Chain = SSL.parseX509Chain(bio);
                                            try {
                                                bio2 = ReferenceCountedOpenSslContext.toBIO(UnpooledByteBufAllocator.DEFAULT, pemPrivateKeyValueOf.retain());
                                                try {
                                                    privateKey = SSL.parsePrivateKey(bio2, (String) null);
                                                    try {
                                                        SSL.setKeyMaterial(jNewSSL, x509Chain, privateKey);
                                                        try {
                                                            zContains = SystemPropertyUtil.contains("io.netty.handler.ssl.openssl.useKeyManagerFactory");
                                                            try {
                                                                try {
                                                                    if (!z5) {
                                                                        if (zContains) {
                                                                            try {
                                                                                logger.info("System property 'io.netty.handler.ssl.openssl.useKeyManagerFactory' is deprecated and will be ignored when using BoringSSL");
                                                                            } catch (Throwable unused2) {
                                                                                z6 = true;
                                                                                logger.debug("Failed to get useKeyManagerFactory system property.");
                                                                            }
                                                                        }
                                                                        z7 = true;
                                                                        z6 = z7;
                                                                        pemPrivateKeyValueOf.release();
                                                                        z = true;
                                                                        bio2 = bio2;
                                                                        SSL.freeSSL(jNewSSL);
                                                                        if (bio != 0) {
                                                                            SSL.freeBIO(bio);
                                                                        }
                                                                        if (bio2 != 0) {
                                                                            SSL.freeBIO(bio2);
                                                                        }
                                                                        if (x509Chain != 0) {
                                                                            SSL.freeX509Chain(x509Chain);
                                                                        }
                                                                        if (privateKey != 0) {
                                                                            SSL.freePrivateKey(privateKey);
                                                                        }
                                                                        str = SystemPropertyUtil.get("jdk.tls.namedGroups", null);
                                                                        if (str != null) {
                                                                            strArrSplit = str.split(",");
                                                                            linkedHashSet3 = new LinkedHashSet(strArrSplit.length);
                                                                            linkedHashSet4 = new LinkedHashSet(strArrSplit.length);
                                                                            linkedHashSet5 = new LinkedHashSet();
                                                                            length2 = strArrSplit.length;
                                                                            i2 = 0;
                                                                            while (i2 < length2) {
                                                                                str2 = strArrSplit[i2];
                                                                                String[] strArr11 = strArrSplit;
                                                                                openSsl = GroupsConverter.toOpenSsl(str2);
                                                                                boolean z14 = z6;
                                                                                if (SSLContext.setCurvesList(jMake, new String[]{openSsl})) {
                                                                                    linkedHashSet4.add(openSsl);
                                                                                    linkedHashSet3.add(str2);
                                                                                } else {
                                                                                    linkedHashSet5.add(str2);
                                                                                }
                                                                                i2++;
                                                                                strArrSplit = strArr11;
                                                                                z6 = z14;
                                                                            }
                                                                            z2 = z6;
                                                                            if (linkedHashSet3.isEmpty()) {
                                                                                logger.info("All configured namedGroups are not supported: {}. Use default: {}.", Arrays.toString(linkedHashSet5.toArray(EmptyArrays.EMPTY_STRINGS)), Arrays.toString(DEFAULT_NAMED_GROUPS));
                                                                            } else {
                                                                                strArr = EmptyArrays.EMPTY_STRINGS;
                                                                                strArr2 = (String[]) linkedHashSet3.toArray(strArr);
                                                                                if (linkedHashSet5.isEmpty()) {
                                                                                    logger.info("Using configured namedGroups -D 'jdk.tls.namedGroup': {} ", Arrays.toString(strArr2));
                                                                                } else {
                                                                                    logger.info("Using supported configured namedGroups: {}. Unsupported namedGroups: {}. ", Arrays.toString(strArr2), Arrays.toString(linkedHashSet5.toArray(strArr)));
                                                                                }
                                                                                strArr4 = (String[]) linkedHashSet4.toArray(strArr);
                                                                            }
                                                                        } else {
                                                                            z2 = z6;
                                                                        }
                                                                        strArr3 = strArr4;
                                                                        SSLContext.free(jMake);
                                                                        r10 = z4;
                                                                        boolean z15 = z2;
                                                                        NAMED_GROUPS = strArr3;
                                                                        Set<String> setUnmodifiableSet8 = Collections.unmodifiableSet(linkedHashSet6);
                                                                        AVAILABLE_OPENSSL_CIPHER_SUITES = setUnmodifiableSet8;
                                                                        linkedHashSet = new LinkedHashSet(setUnmodifiableSet8.size() * 2);
                                                                        while (r0.hasNext()) {
                                                                            if (SslUtils.isTLSv13Cipher(str6)) {
                                                                                linkedHashSet.add(CipherSuiteConverter.toJava(str6, "TLS"));
                                                                                linkedHashSet.add(CipherSuiteConverter.toJava(str6, "SSL"));
                                                                            } else {
                                                                                linkedHashSet.add(str6);
                                                                            }
                                                                        }
                                                                        SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
                                                                        SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
                                                                        SslUtils.addIfSupported(linkedHashSet, arrayList, EXTRA_SUPPORTED_TLS_1_3_CIPHERS);
                                                                        SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet);
                                                                        listUnmodifiableList = Collections.unmodifiableList(arrayList);
                                                                        DEFAULT_CIPHERS = listUnmodifiableList;
                                                                        Set<String> setUnmodifiableSet9 = Collections.unmodifiableSet(linkedHashSet);
                                                                        AVAILABLE_JAVA_CIPHER_SUITES = setUnmodifiableSet9;
                                                                        Set<String> set4 = AVAILABLE_OPENSSL_CIPHER_SUITES;
                                                                        LinkedHashSet linkedHashSet10 = new LinkedHashSet(set4.size() + setUnmodifiableSet9.size());
                                                                        linkedHashSet10.addAll(set4);
                                                                        linkedHashSet10.addAll(setUnmodifiableSet9);
                                                                        AVAILABLE_CIPHER_SUITES = linkedHashSet10;
                                                                        SUPPORTS_KEYMANAGER_FACTORY = z;
                                                                        USE_KEYMANAGER_FACTORY = z15;
                                                                        linkedHashSet2 = new LinkedHashSet(6);
                                                                        linkedHashSet2.add(SslProtocols.SSL_v2_HELLO);
                                                                        if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                                                                            linkedHashSet2.add(SslProtocols.SSL_v2);
                                                                        }
                                                                        if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                                                                            linkedHashSet2.add(SslProtocols.SSL_v3);
                                                                        }
                                                                        if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                                                                            linkedHashSet2.add(SslProtocols.TLS_v1);
                                                                        }
                                                                        if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                                                                            linkedHashSet2.add(SslProtocols.TLS_v1_1);
                                                                        }
                                                                        if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                                                                            linkedHashSet2.add(SslProtocols.TLS_v1_2);
                                                                        }
                                                                        if (r10 == 0) {
                                                                            TLSV13_SUPPORTED = false;
                                                                        } else {
                                                                            TLSV13_SUPPORTED = false;
                                                                        }
                                                                        setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet2);
                                                                        SUPPORTED_PROTOCOLS_SET = setUnmodifiableSet;
                                                                        SUPPORTS_OCSP = doesSupportOcsp();
                                                                        internalLogger = logger;
                                                                        if (internalLogger.isDebugEnabled()) {
                                                                            internalLogger.debug("Supported protocols (OpenSSL): {} ", setUnmodifiableSet);
                                                                            internalLogger.debug("Default cipher suites (OpenSSL): {}", listUnmodifiableList);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    z7 = SystemPropertyUtil.getBoolean("io.netty.handler.ssl.openssl.useKeyManagerFactory", true);
                                                                    if (zContains) {
                                                                        try {
                                                                            logger.info("System property 'io.netty.handler.ssl.openssl.useKeyManagerFactory' is deprecated and so will be ignored in the future");
                                                                        } catch (Throwable unused3) {
                                                                            z6 = z7;
                                                                            logger.debug("Failed to get useKeyManagerFactory system property.");
                                                                        }
                                                                    }
                                                                    z6 = z7;
                                                                    pemPrivateKeyValueOf.release();
                                                                    z = true;
                                                                    bio2 = bio2;
                                                                    SSL.freeSSL(jNewSSL);
                                                                    if (bio != 0) {
                                                                        SSL.freeBIO(bio);
                                                                    }
                                                                    if (bio2 != 0) {
                                                                        SSL.freeBIO(bio2);
                                                                    }
                                                                    if (x509Chain != 0) {
                                                                        SSL.freeX509Chain(x509Chain);
                                                                    }
                                                                    if (privateKey != 0) {
                                                                        SSL.freePrivateKey(privateKey);
                                                                    }
                                                                    str = SystemPropertyUtil.get("jdk.tls.namedGroups", null);
                                                                    if (str != null) {
                                                                        strArrSplit = str.split(",");
                                                                        linkedHashSet3 = new LinkedHashSet(strArrSplit.length);
                                                                        linkedHashSet4 = new LinkedHashSet(strArrSplit.length);
                                                                        linkedHashSet5 = new LinkedHashSet();
                                                                        length2 = strArrSplit.length;
                                                                        i2 = 0;
                                                                        while (i2 < length2) {
                                                                            str2 = strArrSplit[i2];
                                                                            String[] strArr12 = strArrSplit;
                                                                            openSsl = GroupsConverter.toOpenSsl(str2);
                                                                            boolean z16 = z6;
                                                                            try {
                                                                                if (SSLContext.setCurvesList(jMake, new String[]{openSsl})) {
                                                                                    linkedHashSet4.add(openSsl);
                                                                                    linkedHashSet3.add(str2);
                                                                                } else {
                                                                                    linkedHashSet5.add(str2);
                                                                                }
                                                                                i2++;
                                                                                strArrSplit = strArr12;
                                                                                z6 = z16;
                                                                            } catch (Throwable th6) {
                                                                                th = th6;
                                                                            }
                                                                        }
                                                                        z2 = z6;
                                                                        if (linkedHashSet3.isEmpty()) {
                                                                            try {
                                                                                logger.info("All configured namedGroups are not supported: {}. Use default: {}.", Arrays.toString(linkedHashSet5.toArray(EmptyArrays.EMPTY_STRINGS)), Arrays.toString(DEFAULT_NAMED_GROUPS));
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                            }
                                                                        } else {
                                                                            strArr = EmptyArrays.EMPTY_STRINGS;
                                                                            strArr2 = (String[]) linkedHashSet3.toArray(strArr);
                                                                            if (linkedHashSet5.isEmpty()) {
                                                                                logger.info("Using configured namedGroups -D 'jdk.tls.namedGroup': {} ", Arrays.toString(strArr2));
                                                                            } else {
                                                                                logger.info("Using supported configured namedGroups: {}. Unsupported namedGroups: {}. ", Arrays.toString(strArr2), Arrays.toString(linkedHashSet5.toArray(strArr)));
                                                                            }
                                                                            strArr4 = (String[]) linkedHashSet4.toArray(strArr);
                                                                        }
                                                                    } else {
                                                                        z2 = z6;
                                                                    }
                                                                    strArr3 = strArr4;
                                                                    SSLContext.free(jMake);
                                                                    r10 = z4;
                                                                    boolean z17 = z2;
                                                                    NAMED_GROUPS = strArr3;
                                                                    Set<String> setUnmodifiableSet10 = Collections.unmodifiableSet(linkedHashSet6);
                                                                    AVAILABLE_OPENSSL_CIPHER_SUITES = setUnmodifiableSet10;
                                                                    linkedHashSet = new LinkedHashSet(setUnmodifiableSet10.size() * 2);
                                                                    while (r0.hasNext()) {
                                                                        if (SslUtils.isTLSv13Cipher(str6)) {
                                                                            linkedHashSet.add(CipherSuiteConverter.toJava(str6, "TLS"));
                                                                            linkedHashSet.add(CipherSuiteConverter.toJava(str6, "SSL"));
                                                                        } else {
                                                                            linkedHashSet.add(str6);
                                                                        }
                                                                    }
                                                                    SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
                                                                    SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
                                                                    SslUtils.addIfSupported(linkedHashSet, arrayList, EXTRA_SUPPORTED_TLS_1_3_CIPHERS);
                                                                    SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet);
                                                                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                                                                    DEFAULT_CIPHERS = listUnmodifiableList;
                                                                    Set<String> setUnmodifiableSet11 = Collections.unmodifiableSet(linkedHashSet);
                                                                    AVAILABLE_JAVA_CIPHER_SUITES = setUnmodifiableSet11;
                                                                    Set<String> set5 = AVAILABLE_OPENSSL_CIPHER_SUITES;
                                                                    LinkedHashSet linkedHashSet11 = new LinkedHashSet(set5.size() + setUnmodifiableSet11.size());
                                                                    linkedHashSet11.addAll(set5);
                                                                    linkedHashSet11.addAll(setUnmodifiableSet11);
                                                                    AVAILABLE_CIPHER_SUITES = linkedHashSet11;
                                                                    SUPPORTS_KEYMANAGER_FACTORY = z;
                                                                    USE_KEYMANAGER_FACTORY = z17;
                                                                    linkedHashSet2 = new LinkedHashSet(6);
                                                                    linkedHashSet2.add(SslProtocols.SSL_v2_HELLO);
                                                                    if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                                                                        linkedHashSet2.add(SslProtocols.SSL_v2);
                                                                    }
                                                                    if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                                                                        linkedHashSet2.add(SslProtocols.SSL_v3);
                                                                    }
                                                                    if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                                                                        linkedHashSet2.add(SslProtocols.TLS_v1);
                                                                    }
                                                                    if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                                                                        linkedHashSet2.add(SslProtocols.TLS_v1_1);
                                                                    }
                                                                    if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                                                                        linkedHashSet2.add(SslProtocols.TLS_v1_2);
                                                                    }
                                                                    if (r10 == 0 && doesSupportProtocol(32, SSL.SSL_OP_NO_TLSv1_3)) {
                                                                        linkedHashSet2.add(SslProtocols.TLS_v1_3);
                                                                        TLSV13_SUPPORTED = true;
                                                                    } else {
                                                                        TLSV13_SUPPORTED = false;
                                                                    }
                                                                    setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet2);
                                                                    SUPPORTED_PROTOCOLS_SET = setUnmodifiableSet;
                                                                    SUPPORTS_OCSP = doesSupportOcsp();
                                                                    internalLogger = logger;
                                                                    if (internalLogger.isDebugEnabled()) {
                                                                        internalLogger.debug("Supported protocols (OpenSSL): {} ", setUnmodifiableSet);
                                                                        internalLogger.debug("Default cipher suites (OpenSSL): {}", listUnmodifiableList);
                                                                        return;
                                                                    }
                                                                    return;
                                                                    pemPrivateKeyValueOf.release();
                                                                    z = true;
                                                                    bio2 = bio2;
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    r13 = bio2;
                                                                    SSL.freeSSL(jNewSSL);
                                                                    if (bio != 0) {
                                                                        SSL.freeBIO(bio);
                                                                    }
                                                                    if (r13 != 0) {
                                                                        SSL.freeBIO((long) r13);
                                                                    }
                                                                    if (x509Chain != 0) {
                                                                        SSL.freeX509Chain(x509Chain);
                                                                    }
                                                                    if (privateKey != 0) {
                                                                        SSL.freePrivateKey(privateKey);
                                                                    }
                                                                    throw th;
                                                                }
                                                                logger.debug("Failed to get useKeyManagerFactory system property.");
                                                            } catch (Error unused4) {
                                                                z = true;
                                                                bio2 = bio2;
                                                                try {
                                                                    logger.debug("KeyManagerFactory not supported.");
                                                                    pemPrivateKeyValueOf.release();
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                    pemPrivateKeyValueOf.release();
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                                pemPrivateKeyValueOf.release();
                                                                throw th;
                                                            }
                                                        } catch (Throwable unused5) {
                                                            z6 = false;
                                                        }
                                                    } catch (Error unused6) {
                                                        z6 = false;
                                                        z = false;
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                    }
                                                } catch (Error unused7) {
                                                    z6 = false;
                                                    z = false;
                                                    privateKey = 0;
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                }
                                            } catch (Error unused8) {
                                                z6 = false;
                                                z = false;
                                                bio2 = 0;
                                                privateKey = 0;
                                            } catch (Throwable th13) {
                                                th = th13;
                                            }
                                        } catch (Error unused9) {
                                            z6 = false;
                                            z = false;
                                            bio2 = 0;
                                            x509Chain = 0;
                                            privateKey = x509Chain;
                                            logger.debug("KeyManagerFactory not supported.");
                                            pemPrivateKeyValueOf.release();
                                            SSL.freeSSL(jNewSSL);
                                            if (bio != 0) {
                                                SSL.freeBIO(bio);
                                            }
                                            if (bio2 != 0) {
                                                SSL.freeBIO(bio2);
                                            }
                                            if (x509Chain != 0) {
                                                SSL.freeX509Chain(x509Chain);
                                            }
                                            if (privateKey != 0) {
                                                SSL.freePrivateKey(privateKey);
                                            }
                                            str = SystemPropertyUtil.get("jdk.tls.namedGroups", null);
                                            if (str != null) {
                                                strArrSplit = str.split(",");
                                                linkedHashSet3 = new LinkedHashSet(strArrSplit.length);
                                                linkedHashSet4 = new LinkedHashSet(strArrSplit.length);
                                                linkedHashSet5 = new LinkedHashSet();
                                                length2 = strArrSplit.length;
                                                i2 = 0;
                                                while (i2 < length2) {
                                                    str2 = strArrSplit[i2];
                                                    String[] strArr13 = strArrSplit;
                                                    openSsl = GroupsConverter.toOpenSsl(str2);
                                                    boolean z18 = z6;
                                                    if (SSLContext.setCurvesList(jMake, new String[]{openSsl})) {
                                                        linkedHashSet4.add(openSsl);
                                                        linkedHashSet3.add(str2);
                                                    } else {
                                                        linkedHashSet5.add(str2);
                                                    }
                                                    i2++;
                                                    strArrSplit = strArr13;
                                                    z6 = z18;
                                                }
                                                z2 = z6;
                                                if (linkedHashSet3.isEmpty()) {
                                                    logger.info("All configured namedGroups are not supported: {}. Use default: {}.", Arrays.toString(linkedHashSet5.toArray(EmptyArrays.EMPTY_STRINGS)), Arrays.toString(DEFAULT_NAMED_GROUPS));
                                                } else {
                                                    strArr = EmptyArrays.EMPTY_STRINGS;
                                                    strArr2 = (String[]) linkedHashSet3.toArray(strArr);
                                                    if (linkedHashSet5.isEmpty()) {
                                                        logger.info("Using configured namedGroups -D 'jdk.tls.namedGroup': {} ", Arrays.toString(strArr2));
                                                    } else {
                                                        logger.info("Using supported configured namedGroups: {}. Unsupported namedGroups: {}. ", Arrays.toString(strArr2), Arrays.toString(linkedHashSet5.toArray(strArr)));
                                                    }
                                                    strArr4 = (String[]) linkedHashSet4.toArray(strArr);
                                                }
                                            } else {
                                                z2 = z6;
                                            }
                                            strArr3 = strArr4;
                                            SSLContext.free(jMake);
                                            r10 = z4;
                                            boolean z19 = z2;
                                            NAMED_GROUPS = strArr3;
                                            Set<String> setUnmodifiableSet12 = Collections.unmodifiableSet(linkedHashSet6);
                                            AVAILABLE_OPENSSL_CIPHER_SUITES = setUnmodifiableSet12;
                                            linkedHashSet = new LinkedHashSet(setUnmodifiableSet12.size() * 2);
                                            while (r0.hasNext()) {
                                                if (SslUtils.isTLSv13Cipher(str6)) {
                                                    linkedHashSet.add(CipherSuiteConverter.toJava(str6, "TLS"));
                                                    linkedHashSet.add(CipherSuiteConverter.toJava(str6, "SSL"));
                                                } else {
                                                    linkedHashSet.add(str6);
                                                }
                                            }
                                            SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
                                            SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
                                            SslUtils.addIfSupported(linkedHashSet, arrayList, EXTRA_SUPPORTED_TLS_1_3_CIPHERS);
                                            SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet);
                                            listUnmodifiableList = Collections.unmodifiableList(arrayList);
                                            DEFAULT_CIPHERS = listUnmodifiableList;
                                            Set<String> setUnmodifiableSet13 = Collections.unmodifiableSet(linkedHashSet);
                                            AVAILABLE_JAVA_CIPHER_SUITES = setUnmodifiableSet13;
                                            Set<String> set6 = AVAILABLE_OPENSSL_CIPHER_SUITES;
                                            LinkedHashSet linkedHashSet12 = new LinkedHashSet(set6.size() + setUnmodifiableSet13.size());
                                            linkedHashSet12.addAll(set6);
                                            linkedHashSet12.addAll(setUnmodifiableSet13);
                                            AVAILABLE_CIPHER_SUITES = linkedHashSet12;
                                            SUPPORTS_KEYMANAGER_FACTORY = z;
                                            USE_KEYMANAGER_FACTORY = z19;
                                            linkedHashSet2 = new LinkedHashSet(6);
                                            linkedHashSet2.add(SslProtocols.SSL_v2_HELLO);
                                            if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                                                linkedHashSet2.add(SslProtocols.SSL_v2);
                                            }
                                            if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                                                linkedHashSet2.add(SslProtocols.SSL_v3);
                                            }
                                            if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                                                linkedHashSet2.add(SslProtocols.TLS_v1);
                                            }
                                            if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                                                linkedHashSet2.add(SslProtocols.TLS_v1_1);
                                            }
                                            if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                                                linkedHashSet2.add(SslProtocols.TLS_v1_2);
                                            }
                                            if (r10 == 0) {
                                                TLSV13_SUPPORTED = false;
                                            } else {
                                                TLSV13_SUPPORTED = false;
                                            }
                                            setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet2);
                                            SUPPORTED_PROTOCOLS_SET = setUnmodifiableSet;
                                            SUPPORTS_OCSP = doesSupportOcsp();
                                            internalLogger = logger;
                                            if (internalLogger.isDebugEnabled()) {
                                                internalLogger.debug("Supported protocols (OpenSSL): {} ", setUnmodifiableSet);
                                                internalLogger.debug("Default cipher suites (OpenSSL): {}", listUnmodifiableList);
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th14) {
                                            th = th14;
                                            j2 = 0;
                                            pemPrivateKeyValueOf.release();
                                            throw th;
                                        }
                                    } catch (Error unused10) {
                                        z6 = false;
                                        z = false;
                                        bio2 = 0;
                                        bio = 0;
                                        x509Chain = 0;
                                    } catch (Throwable th15) {
                                        th = th15;
                                        j2 = 0;
                                    }
                                    SSL.freeSSL(jNewSSL);
                                    if (bio != 0) {
                                        SSL.freeBIO(bio);
                                    }
                                    if (bio2 != 0) {
                                        SSL.freeBIO(bio2);
                                    }
                                    if (x509Chain != 0) {
                                        SSL.freeX509Chain(x509Chain);
                                    }
                                    if (privateKey != 0) {
                                        SSL.freePrivateKey(privateKey);
                                    }
                                    str = SystemPropertyUtil.get("jdk.tls.namedGroups", null);
                                    if (str != null) {
                                        strArrSplit = str.split(",");
                                        linkedHashSet3 = new LinkedHashSet(strArrSplit.length);
                                        linkedHashSet4 = new LinkedHashSet(strArrSplit.length);
                                        linkedHashSet5 = new LinkedHashSet();
                                        length2 = strArrSplit.length;
                                        i2 = 0;
                                        while (i2 < length2) {
                                            str2 = strArrSplit[i2];
                                            String[] strArr14 = strArrSplit;
                                            openSsl = GroupsConverter.toOpenSsl(str2);
                                            boolean z110 = z6;
                                            if (SSLContext.setCurvesList(jMake, new String[]{openSsl})) {
                                                linkedHashSet4.add(openSsl);
                                                linkedHashSet3.add(str2);
                                            } else {
                                                linkedHashSet5.add(str2);
                                            }
                                            i2++;
                                            strArrSplit = strArr14;
                                            z6 = z110;
                                        }
                                        z2 = z6;
                                        if (linkedHashSet3.isEmpty()) {
                                            logger.info("All configured namedGroups are not supported: {}. Use default: {}.", Arrays.toString(linkedHashSet5.toArray(EmptyArrays.EMPTY_STRINGS)), Arrays.toString(DEFAULT_NAMED_GROUPS));
                                        } else {
                                            strArr = EmptyArrays.EMPTY_STRINGS;
                                            strArr2 = (String[]) linkedHashSet3.toArray(strArr);
                                            if (linkedHashSet5.isEmpty()) {
                                                logger.info("Using configured namedGroups -D 'jdk.tls.namedGroup': {} ", Arrays.toString(strArr2));
                                            } else {
                                                logger.info("Using supported configured namedGroups: {}. Unsupported namedGroups: {}. ", Arrays.toString(strArr2), Arrays.toString(linkedHashSet5.toArray(strArr)));
                                            }
                                            strArr4 = (String[]) linkedHashSet4.toArray(strArr);
                                        }
                                    } else {
                                        z2 = z6;
                                    }
                                    strArr3 = strArr4;
                                    SSLContext.free(jMake);
                                    r10 = z4;
                                    boolean z111 = z2;
                                    NAMED_GROUPS = strArr3;
                                    Set<String> setUnmodifiableSet14 = Collections.unmodifiableSet(linkedHashSet6);
                                    AVAILABLE_OPENSSL_CIPHER_SUITES = setUnmodifiableSet14;
                                    linkedHashSet = new LinkedHashSet(setUnmodifiableSet14.size() * 2);
                                    while (r0.hasNext()) {
                                        if (SslUtils.isTLSv13Cipher(str6)) {
                                            linkedHashSet.add(CipherSuiteConverter.toJava(str6, "TLS"));
                                            linkedHashSet.add(CipherSuiteConverter.toJava(str6, "SSL"));
                                        } else {
                                            linkedHashSet.add(str6);
                                        }
                                    }
                                    SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.DEFAULT_CIPHER_SUITES);
                                    SslUtils.addIfSupported(linkedHashSet, arrayList, SslUtils.TLSV13_CIPHER_SUITES);
                                    SslUtils.addIfSupported(linkedHashSet, arrayList, EXTRA_SUPPORTED_TLS_1_3_CIPHERS);
                                    SslUtils.useFallbackCiphersIfDefaultIsEmpty(arrayList, linkedHashSet);
                                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                                    DEFAULT_CIPHERS = listUnmodifiableList;
                                    Set<String> setUnmodifiableSet15 = Collections.unmodifiableSet(linkedHashSet);
                                    AVAILABLE_JAVA_CIPHER_SUITES = setUnmodifiableSet15;
                                    Set<String> set7 = AVAILABLE_OPENSSL_CIPHER_SUITES;
                                    LinkedHashSet linkedHashSet13 = new LinkedHashSet(set7.size() + setUnmodifiableSet15.size());
                                    linkedHashSet13.addAll(set7);
                                    linkedHashSet13.addAll(setUnmodifiableSet15);
                                    AVAILABLE_CIPHER_SUITES = linkedHashSet13;
                                    SUPPORTS_KEYMANAGER_FACTORY = z;
                                    USE_KEYMANAGER_FACTORY = z111;
                                    linkedHashSet2 = new LinkedHashSet(6);
                                    linkedHashSet2.add(SslProtocols.SSL_v2_HELLO);
                                    if (doesSupportProtocol(1, SSL.SSL_OP_NO_SSLv2)) {
                                        linkedHashSet2.add(SslProtocols.SSL_v2);
                                    }
                                    if (doesSupportProtocol(2, SSL.SSL_OP_NO_SSLv3)) {
                                        linkedHashSet2.add(SslProtocols.SSL_v3);
                                    }
                                    if (doesSupportProtocol(4, SSL.SSL_OP_NO_TLSv1)) {
                                        linkedHashSet2.add(SslProtocols.TLS_v1);
                                    }
                                    if (doesSupportProtocol(8, SSL.SSL_OP_NO_TLSv1_1)) {
                                        linkedHashSet2.add(SslProtocols.TLS_v1_1);
                                    }
                                    if (doesSupportProtocol(16, SSL.SSL_OP_NO_TLSv1_2)) {
                                        linkedHashSet2.add(SslProtocols.TLS_v1_2);
                                    }
                                    if (r10 == 0) {
                                        TLSV13_SUPPORTED = false;
                                    } else {
                                        TLSV13_SUPPORTED = false;
                                    }
                                    setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet2);
                                    SUPPORTED_PROTOCOLS_SET = setUnmodifiableSet;
                                    SUPPORTS_OCSP = doesSupportOcsp();
                                    internalLogger = logger;
                                    if (internalLogger.isDebugEnabled()) {
                                        internalLogger.debug("Supported protocols (OpenSSL): {} ", setUnmodifiableSet);
                                        internalLogger.debug("Default cipher suites (OpenSSL): {}", listUnmodifiableList);
                                        return;
                                    }
                                    return;
                                } catch (Throwable th16) {
                                    th = th16;
                                }
                            } catch (Throwable th17) {
                                th = th17;
                            }
                        } catch (Throwable th18) {
                            th = th18;
                            r13 = 0;
                            bio = 0;
                            x509Chain = 0;
                            privateKey = 0;
                        }
                    } catch (Throwable th19) {
                        th = th19;
                    }
                } catch (Throwable th20) {
                    th = th20;
                }
                SSLContext.free(jMake);
                throw th;
            } catch (Exception e3) {
                e = e3;
                logger.warn("Failed to get the list of available OpenSSL cipher suites.", (Throwable) e);
                r10 = r9;
            }
        } catch (Exception e4) {
            e = e4;
            r9 = 0;
            z = false;
            z2 = false;
            logger.warn("Failed to get the list of available OpenSSL cipher suites.", (Throwable) e);
            r10 = r9;
        }
    }

    private OpenSsl() {
    }

    @Deprecated
    public static Set<String> availableCipherSuites() {
        return availableOpenSslCipherSuites();
    }

    public static Set<String> availableJavaCipherSuites() {
        return AVAILABLE_JAVA_CIPHER_SUITES;
    }

    public static Set<String> availableOpenSslCipherSuites() {
        return AVAILABLE_OPENSSL_CIPHER_SUITES;
    }

    public static String checkTls13Ciphers(InternalLogger internalLogger, String str) {
        boolean z;
        if (IS_BORINGSSL && !str.isEmpty()) {
            String[] strArr = EXTRA_SUPPORTED_TLS_1_3_CIPHERS;
            HashSet hashSet = new HashSet(strArr.length);
            Collections.addAll(hashSet, strArr);
            String[] strArrSplit = str.split(":");
            int length = strArrSplit.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                String str2 = strArrSplit[i];
                if (hashSet.isEmpty() || (!hashSet.remove(str2) && !hashSet.remove(CipherSuiteConverter.toJava(str2, "TLS")))) {
                    z = true;
                    break;
                }
                i++;
            }
            if ((!hashSet.isEmpty()) | z) {
                if (internalLogger.isInfoEnabled()) {
                    StringBuilder sb = new StringBuilder(128);
                    for (String str3 : str.split(":")) {
                        sb.append(CipherSuiteConverter.toJava(str3, "TLS"));
                        sb.append(":");
                    }
                    sb.setLength(sb.length() - 1);
                    internalLogger.info("BoringSSL doesn't allow to enable or disable TLSv1.3 ciphers explicitly. Provided TLSv1.3 ciphers: '{}', default TLSv1.3 ciphers that will be used: '{}'.", sb, EXTRA_SUPPORTED_TLS_1_3_CIPHERS_STRING);
                }
                return EXTRA_SUPPORTED_TLS_1_3_CIPHERS_STRING;
            }
        }
        return str;
    }

    public static String[] defaultProtocols(boolean z) {
        Set<String> set = z ? CLIENT_DEFAULT_PROTOCOLS : SERVER_DEFAULT_PROTOCOLS;
        if (set == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(set.size());
        for (String str : set) {
            if (SUPPORTED_PROTOCOLS_SET.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private static boolean doesSupportOcsp() throws Throwable {
        long jMake;
        if (version() < 268443648) {
            return false;
        }
        try {
            jMake = SSLContext.make(16, 1);
            try {
                SSLContext.enableOcsp(jMake, false);
                if (jMake != -1) {
                    SSLContext.free(jMake);
                }
                return true;
            } catch (Exception unused) {
                if (jMake == -1) {
                    return false;
                }
                SSLContext.free(jMake);
                return false;
            } catch (Throwable th) {
                th = th;
                if (jMake != -1) {
                    SSLContext.free(jMake);
                }
                throw th;
            }
        } catch (Exception unused2) {
            jMake = -1;
        } catch (Throwable th2) {
            th = th2;
            jMake = -1;
        }
    }

    private static boolean doesSupportProtocol(int i, int i2) {
        if (i2 == 0) {
            return false;
        }
        try {
            long jMake = SSLContext.make(i, 2);
            if (jMake == -1) {
                return true;
            }
            SSLContext.free(jMake);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void ensureAvailability() {
        Throwable th = UNAVAILABILITY_CAUSE;
        if (th != null) {
            throw ((Error) new UnsatisfiedLinkError("failed to load the required native library").initCause(th));
        }
    }

    private static boolean initializeTcNative(String str) throws Exception {
        return Library.initialize("provided", str);
    }

    @Deprecated
    public static boolean isAlpnSupported() {
        return ((long) version()) >= 268443648;
    }

    public static boolean isAvailable() {
        return UNAVAILABILITY_CAUSE == null;
    }

    public static boolean isBoringSSL() {
        return IS_BORINGSSL;
    }

    public static boolean isCipherSuiteAvailable(String str) {
        String openSsl = CipherSuiteConverter.toOpenSsl(str, IS_BORINGSSL);
        if (openSsl != null) {
            str = openSsl;
        }
        return AVAILABLE_OPENSSL_CIPHER_SUITES.contains(str);
    }

    public static boolean isOcspSupported() {
        return SUPPORTS_OCSP;
    }

    public static boolean isSessionCacheSupported() {
        return ((long) version()) >= 269484032;
    }

    public static boolean isTlsv13Supported() {
        return TLSV13_SUPPORTED;
    }

    private static void loadTcNative() throws Exception {
        String strNormalizedOs = PlatformDependent.normalizedOs();
        String strNormalizedArch = PlatformDependent.normalizedArch();
        LinkedHashSet linkedHashSet = new LinkedHashSet(5);
        if ("linux".equals(strNormalizedOs)) {
            Iterator<String> it = PlatformDependent.normalizedLinuxClassifiers().iterator();
            while (it.hasNext()) {
                linkedHashSet.add("netty_tcnative_" + strNormalizedOs + '_' + strNormalizedArch + "_" + it.next());
            }
            linkedHashSet.add("netty_tcnative_" + strNormalizedOs + '_' + strNormalizedArch);
            linkedHashSet.add("netty_tcnative_" + strNormalizedOs + '_' + strNormalizedArch + "_fedora");
        } else {
            linkedHashSet.add("netty_tcnative_" + strNormalizedOs + '_' + strNormalizedArch);
        }
        linkedHashSet.add("netty_tcnative_" + strNormalizedArch);
        linkedHashSet.add("netty_tcnative");
        NativeLibraryLoader.loadFirstAvailable(PlatformDependent.getClassLoader(SSLContext.class), (String[]) linkedHashSet.toArray(new String[0]));
    }

    public static long memoryAddress(ByteBuf byteBuf) {
        return byteBuf.hasMemoryAddress() ? byteBuf.memoryAddress() : Buffer.address(byteBuf.internalNioBuffer(0, byteBuf.readableBytes()));
    }

    private static Set<String> protocols(String str) {
        HashSet hashSet = null;
        String str2 = SystemPropertyUtil.get(str, null);
        if (str2 != null) {
            hashSet = new HashSet();
            for (String str3 : str2.split(",")) {
                hashSet.add(str3.trim());
            }
        }
        return hashSet;
    }

    public static void releaseIfNeeded(ReferenceCounted referenceCounted) {
        if (referenceCounted.refCnt() > 0) {
            ReferenceCountUtil.safeRelease(referenceCounted);
        }
    }

    public static X509Certificate selfSignedCertificate() throws CertificateException {
        return (X509Certificate) SslContext.X509_CERT_FACTORY.generateCertificate(new ByteArrayInputStream(CERT.getBytes(CharsetUtil.US_ASCII)));
    }

    @Deprecated
    public static boolean supportsHostnameValidation() {
        return isAvailable();
    }

    public static boolean supportsKeyManagerFactory() {
        return SUPPORTS_KEYMANAGER_FACTORY;
    }

    public static Throwable unavailabilityCause() {
        return UNAVAILABILITY_CAUSE;
    }

    public static boolean useKeyManagerFactory() {
        return USE_KEYMANAGER_FACTORY;
    }

    public static int version() {
        if (isAvailable()) {
            return SSL.version();
        }
        return -1;
    }

    public static String versionString() {
        if (isAvailable()) {
            return SSL.versionString();
        }
        return null;
    }
}
