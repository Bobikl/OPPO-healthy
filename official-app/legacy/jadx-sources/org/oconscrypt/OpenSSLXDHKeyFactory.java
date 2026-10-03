package org.oconscrypt;

import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public final class OpenSSLXDHKeyFactory extends KeyFactorySpi {
    private KeySpec constructJavaPrivateKeySpec(Class<?> cls, OpenSSLX25519PrivateKey openSSLX25519PrivateKey) throws InvalidKeySpecException {
        if (cls == null) {
            throw new InvalidKeySpecException("Could not find java.security.spec.XECPrivateKeySpec");
        }
        try {
            return (KeySpec) cls.getConstructor(AlgorithmParameterSpec.class, byte[].class).newInstance(new OpenSSLXECParameterSpec(OpenSSLXECParameterSpec.X25519), openSSLX25519PrivateKey.getU());
        } catch (IllegalAccessException e2) {
            throw new InvalidKeySpecException("Could not find java.security.spec.XECPrivateKeySpec", e2);
        } catch (InstantiationException e3) {
            throw new InvalidKeySpecException("Could not find java.security.spec.XECPrivateKeySpec", e3);
        } catch (NoSuchMethodException e4) {
            throw new InvalidKeySpecException("Could not find java.security.spec.XECPrivateKeySpec", e4);
        } catch (InvocationTargetException e5) {
            throw new InvalidKeySpecException("Could not find java.security.spec.XECPrivateKeySpec", e5);
        }
    }

    private KeySpec constructJavaPublicKeySpec(Class<?> cls, OpenSSLX25519PublicKey openSSLX25519PublicKey) throws InvalidKeySpecException {
        try {
            return (KeySpec) cls.getConstructor(AlgorithmParameterSpec.class, BigInteger.class).newInstance(new OpenSSLXECParameterSpec(OpenSSLXECParameterSpec.X25519), new BigInteger(1, openSSLX25519PublicKey.getU()));
        } catch (IllegalAccessException e2) {
            throw new InvalidKeySpecException("Could not find java.security.spec.XECPublicKeySpec", e2);
        } catch (InstantiationException e3) {
            throw new InvalidKeySpecException("Could not find java.security.spec.XECPublicKeySpec", e3);
        } catch (NoSuchMethodException e4) {
            throw new InvalidKeySpecException("Could not find java.security.spec.XECPublicKeySpec", e4);
        } catch (InvocationTargetException e5) {
            throw new InvalidKeySpecException("Could not find java.security.spec.XECPublicKeySpec", e5);
        }
    }

    private static Class<?> getJavaPrivateKeySpec() {
        try {
            return Class.forName("java.security.spec.XECPrivateKeySpec");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static Class<?> getJavaPublicKeySpec() {
        try {
            return Class.forName("java.security.spec.XECPublicKeySpec");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            return new OpenSSLX25519PrivateKey((PKCS8EncodedKeySpec) keySpec);
        }
        throw new InvalidKeySpecException("Must use ECPrivateKeySpec or PKCS8EncodedKeySpec; was " + keySpec.getClass().getName());
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            return new OpenSSLX25519PublicKey((X509EncodedKeySpec) keySpec);
        }
        throw new InvalidKeySpecException("Must use ECPublicKeySpec or X509EncodedKeySpec; was " + keySpec.getClass().getName());
    }

    @Override // java.security.KeyFactorySpi
    public <T extends KeySpec> T engineGetKeySpec(Key key, Class<T> cls) throws InvalidKeySpecException {
        if (key == null) {
            throw new InvalidKeySpecException("key == null");
        }
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (!"XDH".equals(key.getAlgorithm())) {
            throw new InvalidKeySpecException("Key must be an XDH key");
        }
        Class<?> javaPublicKeySpec = getJavaPublicKeySpec();
        Class<?> javaPrivateKeySpec = getJavaPrivateKeySpec();
        if (javaPublicKeySpec != null && (key instanceof PublicKey) && javaPublicKeySpec.isAssignableFrom(cls)) {
            byte[] encoded = key.getEncoded();
            if (!"X.509".equals(key.getFormat()) || encoded == null) {
                throw new InvalidKeySpecException("Not a valid X.509 encoding");
            }
            return (T) constructJavaPublicKeySpec(javaPublicKeySpec, (OpenSSLX25519PublicKey) engineGeneratePublic(new X509EncodedKeySpec(encoded)));
        }
        if (javaPrivateKeySpec != null && (key instanceof PrivateKey) && javaPrivateKeySpec.isAssignableFrom(cls)) {
            byte[] encoded2 = key.getEncoded();
            if (!"PKCS#8".equals(key.getFormat()) || encoded2 == null) {
                throw new InvalidKeySpecException("Not a valid PKCS#8 encoding");
            }
            return (T) constructJavaPrivateKeySpec(javaPrivateKeySpec, (OpenSSLX25519PrivateKey) engineGeneratePrivate(new PKCS8EncodedKeySpec(encoded2)));
        }
        if ((key instanceof PrivateKey) && PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
            byte[] encoded3 = key.getEncoded();
            if ("PKCS#8".equals(key.getFormat())) {
                if (encoded3 != null) {
                    return new PKCS8EncodedKeySpec(encoded3);
                }
                throw new InvalidKeySpecException("Key is not encodable");
            }
            throw new InvalidKeySpecException("Encoding type must be PKCS#8; was " + key.getFormat());
        }
        if (!(key instanceof PublicKey) || !X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            throw new InvalidKeySpecException("Unsupported key type and key spec combination; key=" + key.getClass().getName() + ", keySpec=" + cls.getName());
        }
        byte[] encoded4 = key.getEncoded();
        if ("X.509".equals(key.getFormat())) {
            if (encoded4 != null) {
                return new X509EncodedKeySpec(encoded4);
            }
            throw new InvalidKeySpecException("Key is not encodable");
        }
        throw new InvalidKeySpecException("Encoding type must be X.509; was " + key.getFormat());
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if ((key instanceof OpenSSLX25519PublicKey) || (key instanceof OpenSSLX25519PrivateKey)) {
            return key;
        }
        if ((key instanceof PrivateKey) && "PKCS#8".equals(key.getFormat())) {
            byte[] encoded = key.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("Key does not support encoding");
            }
            try {
                return engineGeneratePrivate(new PKCS8EncodedKeySpec(encoded));
            } catch (InvalidKeySpecException e2) {
                throw new InvalidKeyException(e2);
            }
        }
        if (!(key instanceof PublicKey) || !"X.509".equals(key.getFormat())) {
            throw new InvalidKeyException("Key must be EC public or private key; was " + key.getClass().getName());
        }
        byte[] encoded2 = key.getEncoded();
        if (encoded2 == null) {
            throw new InvalidKeyException("Key does not support encoding");
        }
        try {
            return engineGeneratePublic(new X509EncodedKeySpec(encoded2));
        } catch (InvalidKeySpecException e3) {
            throw new InvalidKeyException(e3);
        }
    }
}
