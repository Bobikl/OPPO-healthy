package com.oplus.aiunit.vision;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes11.dex */
public final class r75 implements s6m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, r75> f16106c;
    public final int a;
    public final String b;

    static {
        HashMap map = new HashMap();
        map.put(a(MessageDigestAlgorithms.SHA_256, 32, 16, 67, 20, 2), new r75(16777217, "XMSSMT_SHA2-256_W16_H20_D2"));
        map.put(a(MessageDigestAlgorithms.SHA_256, 32, 16, 67, 20, 4), new r75(16777217, "XMSSMT_SHA2-256_W16_H20_D4"));
        map.put(a(MessageDigestAlgorithms.SHA_256, 32, 16, 67, 40, 2), new r75(16777217, "XMSSMT_SHA2-256_W16_H40_D2"));
        map.put(a(MessageDigestAlgorithms.SHA_256, 32, 16, 67, 40, 2), new r75(16777217, "XMSSMT_SHA2-256_W16_H40_D4"));
        map.put(a(MessageDigestAlgorithms.SHA_256, 32, 16, 67, 40, 4), new r75(16777217, "XMSSMT_SHA2-256_W16_H40_D8"));
        map.put(a(MessageDigestAlgorithms.SHA_256, 32, 16, 67, 60, 8), new r75(16777217, "XMSSMT_SHA2-256_W16_H60_D3"));
        map.put(a(MessageDigestAlgorithms.SHA_256, 32, 16, 67, 60, 6), new r75(16777217, "XMSSMT_SHA2-256_W16_H60_D6"));
        map.put(a(MessageDigestAlgorithms.SHA_256, 32, 16, 67, 60, 12), new r75(16777217, "XMSSMT_SHA2-256_W16_H60_D12"));
        map.put(a("SHA2-512", 64, 16, 131, 20, 2), new r75(16777217, "XMSSMT_SHA2-512_W16_H20_D2"));
        map.put(a("SHA2-512", 64, 16, 131, 20, 4), new r75(16777217, "XMSSMT_SHA2-512_W16_H20_D4"));
        map.put(a("SHA2-512", 64, 16, 131, 40, 2), new r75(16777217, "XMSSMT_SHA2-512_W16_H40_D2"));
        map.put(a("SHA2-512", 64, 16, 131, 40, 4), new r75(16777217, "XMSSMT_SHA2-512_W16_H40_D4"));
        map.put(a("SHA2-512", 64, 16, 131, 40, 8), new r75(16777217, "XMSSMT_SHA2-512_W16_H40_D8"));
        map.put(a("SHA2-512", 64, 16, 131, 60, 3), new r75(16777217, "XMSSMT_SHA2-512_W16_H60_D3"));
        map.put(a("SHA2-512", 64, 16, 131, 60, 6), new r75(16777217, "XMSSMT_SHA2-512_W16_H60_D6"));
        map.put(a("SHA2-512", 64, 16, 131, 60, 12), new r75(16777217, "XMSSMT_SHA2-512_W16_H60_D12"));
        map.put(a("SHAKE128", 32, 16, 67, 20, 2), new r75(16777217, "XMSSMT_SHAKE128_W16_H20_D2"));
        map.put(a("SHAKE128", 32, 16, 67, 20, 4), new r75(16777217, "XMSSMT_SHAKE128_W16_H20_D4"));
        map.put(a("SHAKE128", 32, 16, 67, 40, 2), new r75(16777217, "XMSSMT_SHAKE128_W16_H40_D2"));
        map.put(a("SHAKE128", 32, 16, 67, 40, 4), new r75(16777217, "XMSSMT_SHAKE128_W16_H40_D4"));
        map.put(a("SHAKE128", 32, 16, 67, 40, 8), new r75(16777217, "XMSSMT_SHAKE128_W16_H40_D8"));
        map.put(a("SHAKE128", 32, 16, 67, 60, 3), new r75(16777217, "XMSSMT_SHAKE128_W16_H60_D3"));
        map.put(a("SHAKE128", 32, 16, 67, 60, 6), new r75(16777217, "XMSSMT_SHAKE128_W16_H60_D6"));
        map.put(a("SHAKE128", 32, 16, 67, 60, 12), new r75(16777217, "XMSSMT_SHAKE128_W16_H60_D12"));
        map.put(a("SHAKE256", 64, 16, 131, 20, 2), new r75(16777217, "XMSSMT_SHAKE256_W16_H20_D2"));
        map.put(a("SHAKE256", 64, 16, 131, 20, 4), new r75(16777217, "XMSSMT_SHAKE256_W16_H20_D4"));
        map.put(a("SHAKE256", 64, 16, 131, 40, 2), new r75(16777217, "XMSSMT_SHAKE256_W16_H40_D2"));
        map.put(a("SHAKE256", 64, 16, 131, 40, 4), new r75(16777217, "XMSSMT_SHAKE256_W16_H40_D4"));
        map.put(a("SHAKE256", 64, 16, 131, 40, 8), new r75(16777217, "XMSSMT_SHAKE256_W16_H40_D8"));
        map.put(a("SHAKE256", 64, 16, 131, 60, 3), new r75(16777217, "XMSSMT_SHAKE256_W16_H60_D3"));
        map.put(a("SHAKE256", 64, 16, 131, 60, 6), new r75(16777217, "XMSSMT_SHAKE256_W16_H60_D6"));
        map.put(a("SHAKE256", 64, 16, 131, 60, 12), new r75(16777217, "XMSSMT_SHAKE256_W16_H60_D12"));
        f16106c = Collections.unmodifiableMap(map);
    }

    public r75(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static String a(String str, int i, int i2, int i3, int i4, int i5) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4 + "-" + i5;
    }

    public static r75 b(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return f16106c.get(a(str, i, i2, i3, i4, i5));
        }
        throw new NullPointerException("algorithmName == null");
    }

    public String toString() {
        return this.b;
    }
}
