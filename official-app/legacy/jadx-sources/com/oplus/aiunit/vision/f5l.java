package com.oplus.aiunit.vision;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes11.dex */
public final class f5l implements s6m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, f5l> f11229c;
    public final int a;
    public final String b;

    static {
        HashMap map = new HashMap();
        map.put(a(MessageDigestAlgorithms.SHA_256, 32, 16, 67), new f5l(16777217, "WOTSP_SHA2-256_W16"));
        map.put(a(MessageDigestAlgorithms.SHA_512, 64, 16, 131), new f5l(33554434, "WOTSP_SHA2-512_W16"));
        map.put(a("SHAKE128", 32, 16, 67), new f5l(50331651, "WOTSP_SHAKE128_W16"));
        map.put(a("SHAKE256", 64, 16, 131), new f5l(67108868, "WOTSP_SHAKE256_W16"));
        f11229c = Collections.unmodifiableMap(map);
    }

    public f5l(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static String a(String str, int i, int i2, int i3) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3;
    }

    public static f5l b(String str, int i, int i2, int i3) {
        if (str != null) {
            return f11229c.get(a(str, i, i2, i3));
        }
        throw new NullPointerException("algorithmName == null");
    }

    public String toString() {
        return this.b;
    }
}
