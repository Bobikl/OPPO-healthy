package com.heytap.accessory.pair.seeker.pairing.workers;

import com.heytap.accessory.pair.utils.SecurityUtils;
import java.security.KeyPair;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes14.dex */
public class KeyGenerateHelper {
    public static KeyPair genKeyPair() {
        return SecurityUtils.generateECKeys(SecurityUtils.SECP256R1);
    }

    public static byte[] generatePublicKey(KeyPair keyPair) {
        return SecurityUtils.convertPublicKeyByte((ECPublicKey) keyPair.getPublic());
    }

    public static byte[] generateSharedSecret(KeyPair keyPair, byte[] bArr) {
        return SecurityUtils.generateSharedSecret(keyPair.getPrivate(), SecurityUtils.convertPublicKey(bArr, ((ECPublicKey) keyPair.getPublic()).getParams()));
    }
}
