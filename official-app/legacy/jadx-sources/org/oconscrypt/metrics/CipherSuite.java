package org.oconscrypt.metrics;

import com.garmin.fit.e;

/* JADX INFO: loaded from: classes11.dex */
public enum CipherSuite {
    UNKNOWN_CIPHER_SUITE(0),
    TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA(49162),
    TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA(49172),
    TLS_RSA_WITH_AES_256_CBC_SHA(53),
    TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA(49161),
    TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA(49171),
    TLS_RSA_WITH_AES_128_CBC_SHA(47),
    TLS_RSA_WITH_3DES_EDE_CBC_SHA(10),
    TLS_RSA_WITH_AES_128_GCM_SHA256(156),
    TLS_RSA_WITH_AES_256_GCM_SHA384(e.TotalFractionalDescentFieldNum),
    TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256(49199),
    TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384(49200),
    TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256(49195),
    TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384(49196),
    TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256(52393),
    TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256(52392),
    TLS_PSK_WITH_AES_128_CBC_SHA(140),
    TLS_PSK_WITH_AES_256_CBC_SHA(141),
    TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA(49205),
    TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA(49206),
    TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256(52396),
    TLS_AES_128_GCM_SHA256(4865),
    TLS_AES_256_GCM_SHA384(4866),
    TLS_CHACHA20_POLY1305_SHA256(4867),
    TLS_CIPHER_FAILED(65535);

    final short id;

    CipherSuite(int i) {
        this.id = (short) i;
    }

    public static CipherSuite forName(String str) {
        if ("SSL_RSA_WITH_3DES_EDE_CBC_SHA".equals(str)) {
            return TLS_RSA_WITH_3DES_EDE_CBC_SHA;
        }
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return UNKNOWN_CIPHER_SUITE;
        }
    }

    public int getId() {
        return this.id;
    }
}
