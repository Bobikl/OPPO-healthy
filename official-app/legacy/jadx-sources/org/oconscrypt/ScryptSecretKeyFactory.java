package org.oconscrypt;

import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;

/* JADX INFO: loaded from: classes11.dex */
public class ScryptSecretKeyFactory extends SecretKeyFactorySpi {

    public static class NotImplementedException extends RuntimeException {
        private static final long serialVersionUID = -7755435858585859108L;

        public NotImplementedException() {
            super("Not implemented");
        }
    }

    public static class ScryptKey implements SecretKey {
        private static final long serialVersionUID = 2024924811854189128L;
        private final byte[] key;

        public ScryptKey(byte[] bArr) {
            this.key = bArr;
        }

        @Override // java.security.Key
        public String getAlgorithm() {
            return "SCRYPT";
        }

        @Override // java.security.Key
        public byte[] getEncoded() {
            return this.key;
        }

        @Override // java.security.Key
        public String getFormat() {
            return "RAW";
        }
    }

    private Object getValue(KeySpec keySpec, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return keySpec.getClass().getMethod(str, null).invoke(keySpec, new Object[0]);
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        byte[] bArr;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        char[] password;
        if (keySpec instanceof ScryptKeySpec) {
            ScryptKeySpec scryptKeySpec = (ScryptKeySpec) keySpec;
            password = scryptKeySpec.getPassword();
            byte[] salt = scryptKeySpec.getSalt();
            int costParameter = scryptKeySpec.getCostParameter();
            int blockSize = scryptKeySpec.getBlockSize();
            int parallelizationParameter = scryptKeySpec.getParallelizationParameter();
            iIntValue4 = scryptKeySpec.getKeyLength();
            iIntValue3 = parallelizationParameter;
            iIntValue2 = blockSize;
            iIntValue = costParameter;
            bArr = salt;
        } else {
            try {
                char[] cArr = (char[]) getValue(keySpec, "getPassword");
                bArr = (byte[]) getValue(keySpec, "getSalt");
                iIntValue = ((Integer) getValue(keySpec, "getCostParameter")).intValue();
                iIntValue2 = ((Integer) getValue(keySpec, "getBlockSize")).intValue();
                iIntValue3 = ((Integer) getValue(keySpec, "getParallelizationParameter")).intValue();
                iIntValue4 = ((Integer) getValue(keySpec, "getKeyLength")).intValue();
                password = cArr;
            } catch (Exception e2) {
                throw new InvalidKeySpecException("Not a valid scrypt KeySpec", e2);
            }
        }
        if (iIntValue4 % 8 == 0) {
            return new ScryptKey(NativeCrypto.Scrypt_generate_key(new String(password).getBytes(StandardCharsets.UTF_8), bArr, iIntValue, iIntValue2, iIntValue3, iIntValue4 / 8));
        }
        throw new InvalidKeySpecException("Cannot produce fractional-byte outputs");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        if (secretKey == null) {
            throw new InvalidKeySpecException("Null KeySpec");
        }
        throw new NotImplementedException();
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        if (secretKey == null) {
            throw new InvalidKeyException("Null SecretKey");
        }
        throw new NotImplementedException();
    }
}
