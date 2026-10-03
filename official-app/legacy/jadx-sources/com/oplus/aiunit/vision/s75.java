package com.oplus.aiunit.vision;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes11.dex */
public final class s75 implements s6m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, s75> f16490c;
    public final int a;
    public final String b;

    static {
        HashMap map = new HashMap();
        map.put(a(MessageDigestAlgorithms.SHA_256, 32, 16, 67, 10), new s75(16777217, "XMSS_SHA2-256_W16_H10"));
        map.put(a(MessageDigestAlgorithms.SHA_256, 32, 16, 67, 16), new s75(33554434, "XMSS_SHA2-256_W16_H16"));
        map.put(a(MessageDigestAlgorithms.SHA_256, 32, 16, 67, 20), new s75(50331651, "XMSS_SHA2-256_W16_H20"));
        map.put(a(MessageDigestAlgorithms.SHA_512, 64, 16, 131, 10), new s75(67108868, "XMSS_SHA2-512_W16_H10"));
        map.put(a(MessageDigestAlgorithms.SHA_512, 64, 16, 131, 16), new s75(83886085, "XMSS_SHA2-512_W16_H16"));
        map.put(a(MessageDigestAlgorithms.SHA_512, 64, 16, 131, 20), new s75(100663302, "XMSS_SHA2-512_W16_H20"));
        map.put(a("SHAKE128", 32, 16, 67, 10), new s75(117440519, "XMSS_SHAKE128_W16_H10"));
        map.put(a("SHAKE128", 32, 16, 67, 16), new s75(134217736, "XMSS_SHAKE128_W16_H16"));
        map.put(a("SHAKE128", 32, 16, 67, 20), new s75(150994953, "XMSS_SHAKE128_W16_H20"));
        map.put(a("SHAKE256", 64, 16, 131, 10), new s75(167772170, "XMSS_SHAKE256_W16_H10"));
        map.put(a("SHAKE256", 64, 16, 131, 16), new s75(184549387, "XMSS_SHAKE256_W16_H16"));
        map.put(a("SHAKE256", 64, 16, 131, 20), new s75(201326604, "XMSS_SHAKE256_W16_H20"));
        f16490c = Collections.unmodifiableMap(map);
    }

    public s75(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static String a(String str, int i, int i2, int i3, int i4) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4;
    }

    public static s75 b(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return f16490c.get(a(str, i, i2, i3, i4));
        }
        throw new NullPointerException("algorithmName == null");
    }

    public String toString() {
        return this.b;
    }
}
