package com.oplus.aiunit.vision;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.spongycastle.pqc.jcajce.provider.newhope.BCNHPrivateKey;
import org.spongycastle.pqc.jcajce.provider.newhope.BCNHPublicKey;

/* JADX INFO: loaded from: classes11.dex */
public class bec extends KeyFactorySpi implements oi0 {
    @Override // com.oplus.aiunit.vision.oi0
    public PrivateKey a(pwe pweVar) throws IOException {
        return new BCNHPrivateKey(pweVar);
    }

    @Override // com.oplus.aiunit.vision.oi0
    public PublicKey b(t2j t2jVar) throws IOException {
        return new BCNHPublicKey(t2jVar);
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return a(pwe.g(r1.i(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e2) {
                throw new InvalidKeySpecException(e2.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return b(t2j.h(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e2) {
                throw new InvalidKeySpecException(e2.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof BCNHPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCNHPublicKey)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCNHPrivateKey) || (key instanceof BCNHPublicKey)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
