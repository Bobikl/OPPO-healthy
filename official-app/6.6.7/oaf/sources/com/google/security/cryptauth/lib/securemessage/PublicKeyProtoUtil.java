package com.google.security.cryptauth.lib.securemessage;

import com.google.protobuf.ByteString;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class PublicKeyProtoUtil {
    public static final int ANDROID_HONEYCOMB_SDK_INT = 11;
    private static final String DH_ALG = "DH";
    private static final BigInteger DH_G;
    public static final int DH_LEN = 512;
    private static final String EC_ALG = "EC";
    private static final BigInteger EC_P256_A;
    private static final BigInteger EC_P256_B;
    private static final String EC_P256_COMMON_NAME = "secp256r1";
    private static final String EC_P256_OPENSSL_NAME = "prime256v1";
    private static final BigInteger EC_P256_P;
    private static final ECParameterSpec EC_P256_PARAMS;
    private static final Boolean IS_LEGACY_CRYPTO_REQUIRED;
    private static final int MAX_DH2048_ENCODING_BYTES = 257;
    private static final int MAX_P256_ENCODING_BYTES = 33;
    private static final int MAX_RSA2048_ENCODING_BYTES = 257;
    private static final int RSA2048_MODULUS_BITS = 2048;
    private static final String RSA_ALG = "RSA";
    private static final BigInteger TWO;
    public static final BigInteger DH_P = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AACAA68FFFFFFFFFFFFFFFF", 16);
    private static final BigInteger ONE = new BigInteger("1");

    public static /* synthetic */ class 1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$security$cryptauth$lib$securemessage$SecureMessageProto$PublicKeyType;

        static {
            int[] iArr = new int[SecureMessageProto.PublicKeyType.values().length];
            $SwitchMap$com$google$security$cryptauth$lib$securemessage$SecureMessageProto$PublicKeyType = iArr;
            try {
                iArr[SecureMessageProto.PublicKeyType.EC_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securemessage$SecureMessageProto$PublicKeyType[SecureMessageProto.PublicKeyType.RSA2048.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$security$cryptauth$lib$securemessage$SecureMessageProto$PublicKeyType[SecureMessageProto.PublicKeyType.DH2048_MODP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static abstract class DHKeyShim {
        private BigInteger mEitherXorY;
        private DHParameterSpec mParams;

        public DHKeyShim(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
            this.mEitherXorY = bigInteger;
            this.mParams = dHParameterSpec;
        }

        public String getAlgorithm() {
            return PublicKeyProtoUtil.DH_ALG;
        }

        public byte[] getEncoded() {
            return null;
        }

        public String getFormat() {
            return null;
        }

        public DHParameterSpec getParams() {
            return this.mParams;
        }

        public BigInteger getX() {
            return this.mEitherXorY;
        }

        public BigInteger getY() {
            return this.mEitherXorY;
        }
    }

    public static class DHPrivateKeyShim extends DHKeyShim implements DHPrivateKey {
        public DHPrivateKeyShim(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
            super(bigInteger, dHParameterSpec);
        }
    }

    public static class DHPublicKeyShim extends DHKeyShim implements DHPublicKey {
        public DHPublicKeyShim(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
            super(bigInteger, dHParameterSpec);
        }
    }

    static {
        BigInteger bigInteger = new BigInteger("2");
        TWO = bigInteger;
        DH_G = bigInteger;
        IS_LEGACY_CRYPTO_REQUIRED = Boolean.valueOf(determineIfLegacyCryptoRequired());
        ECParameterSpec params = isLegacyCryptoRequired() ? null : ((ECPublicKey) generateEcP256KeyPair().getPublic()).getParams();
        EC_P256_PARAMS = params;
        EC_P256_P = isLegacyCryptoRequired() ? null : ((ECFieldFp) params.getCurve().getField()).getP();
        EC_P256_A = isLegacyCryptoRequired() ? null : params.getCurve().getA();
        EC_P256_B = isLegacyCryptoRequired() ? null : params.getCurve().getB();
    }

    private PublicKeyProtoUtil() {
    }

    private static boolean determineIfLegacyCryptoRequired() {
        try {
            getEcKeyGen();
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static byte[] encodeDh2048PrivateKey(DHPrivateKey dHPrivateKey) {
        return dHPrivateKey.getX().toByteArray();
    }

    public static SecureMessageProto.DhPublicKey encodeDh2048PublicKey(PublicKey publicKey) {
        return SecureMessageProto.DhPublicKey.newBuilder().setY(ByteString.copyFrom(pkToDHPublicKey(publicKey).getY().toByteArray())).build();
    }

    public static SecureMessageProto.EcP256PublicKey encodeEcPublicKey(PublicKey publicKey) {
        ECPublicKey eCPublicKeyPkToECPublicKey = pkToECPublicKey(publicKey);
        return SecureMessageProto.EcP256PublicKey.newBuilder().setX(extractX(eCPublicKeyPkToECPublicKey)).setY(extractY(eCPublicKeyPkToECPublicKey)).build();
    }

    public static SecureMessageProto.GenericPublicKey encodePublicKey(PublicKey publicKey) {
        publicKey.getClass();
        if (publicKey instanceof ECPublicKey) {
            return SecureMessageProto.GenericPublicKey.newBuilder().setType(SecureMessageProto.PublicKeyType.EC_P256).setEcP256PublicKey(encodeEcPublicKey(publicKey)).build();
        }
        if (publicKey instanceof RSAPublicKey) {
            return SecureMessageProto.GenericPublicKey.newBuilder().setType(SecureMessageProto.PublicKeyType.RSA2048).setRsa2048PublicKey(encodeRsa2048PublicKey(publicKey)).build();
        }
        if (publicKey instanceof DHPublicKey) {
            return SecureMessageProto.GenericPublicKey.newBuilder().setType(SecureMessageProto.PublicKeyType.DH2048_MODP).setDh2048PublicKey(encodeDh2048PublicKey(publicKey)).build();
        }
        throw new IllegalArgumentException("Unsupported PublicKey type");
    }

    public static SecureMessageProto.SimpleRsaPublicKey encodeRsa2048PublicKey(PublicKey publicKey) {
        RSAPublicKey rSAPublicKeyPkToRSAPublicKey = pkToRSAPublicKey(publicKey);
        return SecureMessageProto.SimpleRsaPublicKey.newBuilder().setN(ByteString.copyFrom(rSAPublicKeyPkToRSAPublicKey.getModulus().toByteArray())).setE(rSAPublicKeyPkToRSAPublicKey.getPublicExponent().intValue()).build();
    }

    private static ByteString extractX(ECPublicKey eCPublicKey) {
        return ByteString.copyFrom(eCPublicKey.getW().getAffineX().toByteArray());
    }

    private static ByteString extractY(ECPublicKey eCPublicKey) {
        return ByteString.copyFrom(eCPublicKey.getW().getAffineY().toByteArray());
    }

    public static KeyPair generateDh2048KeyPair() {
        try {
            return getDhKeyGen().generateKeyPair();
        } catch (InvalidAlgorithmParameterException unused) {
            BigInteger bigInteger = DH_P;
            BigInteger bigInteger2 = DH_G;
            DHParameterSpec dHParameterSpec = new DHParameterSpec(bigInteger, bigInteger2);
            BigInteger bigInteger3 = new BigInteger(512, new SecureRandom());
            return new KeyPair(new DHPublicKeyShim(bigInteger2.modPow(bigInteger3, bigInteger), dHParameterSpec), new DHPrivateKeyShim(bigInteger3, dHParameterSpec));
        }
    }

    public static KeyPair generateEcP256KeyPair() {
        return getEcKeyGen().generateKeyPair();
    }

    public static KeyPair generateRSA2048KeyPair() {
        return getRsaKeyGen().generateKeyPair();
    }

    private static KeyPairGenerator getDhKeyGen() throws InvalidAlgorithmParameterException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(DH_ALG);
            keyPairGenerator.initialize(new DHParameterSpec(DH_P, DH_G, 512));
            return keyPairGenerator;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static KeyPairGenerator getEcKeyGen() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(EC_ALG);
            try {
                try {
                    keyPairGenerator.initialize(new ECGenParameterSpec(EC_P256_OPENSSL_NAME));
                    return keyPairGenerator;
                } catch (InvalidAlgorithmParameterException unused) {
                    keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
                    return keyPairGenerator;
                }
            } catch (InvalidAlgorithmParameterException unused2) {
                throw new RuntimeException("Unable to find the NIST P-256 curve");
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static KeyPairGenerator getRsaKeyGen() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(RSA_ALG);
            keyPairGenerator.initialize(2048);
            return keyPairGenerator;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static boolean isLegacyCryptoRequired() {
        return IS_LEGACY_CRYPTO_REQUIRED.booleanValue();
    }

    public static DHPrivateKey parseDh2048PrivateKey(byte[] bArr) throws InvalidKeySpecException {
        validateDhEncoding(bArr);
        try {
            BigInteger bigInteger = new BigInteger(bArr);
            validateDhGroupElement(bigInteger);
            return new DHPrivateKeyShim(bigInteger, new DHParameterSpec(DH_P, DH_G));
        } catch (NumberFormatException unused) {
            throw new InvalidKeySpecException();
        }
    }

    public static DHPublicKey parseDh2048PublicKey(SecureMessageProto.DhPublicKey dhPublicKey) throws InvalidKeySpecException {
        if (!dhPublicKey.hasY()) {
            throw new InvalidKeySpecException("required field is missing");
        }
        byte[] byteArray = dhPublicKey.getY().toByteArray();
        validateDhEncoding(byteArray);
        try {
            BigInteger bigInteger = new BigInteger(byteArray);
            validateDhGroupElement(bigInteger);
            try {
                return (DHPublicKey) KeyFactory.getInstance(DH_ALG).generatePublic(new DHPublicKeySpec(bigInteger, DH_P, DH_G));
            } catch (NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        } catch (NumberFormatException unused) {
            throw new InvalidKeySpecException();
        }
    }

    public static ECPublicKey parseEcPublicKey(SecureMessageProto.EcP256PublicKey ecP256PublicKey) throws InvalidKeySpecException {
        if (!ecP256PublicKey.hasX() || !ecP256PublicKey.hasY()) {
            throw new InvalidKeySpecException("Key is missing a required coordinate");
        }
        if (isLegacyCryptoRequired()) {
            throw new InvalidKeySpecException("Elliptic Curve keys not supported on this platform");
        }
        byte[] byteArray = ecP256PublicKey.getX().toByteArray();
        byte[] byteArray2 = ecP256PublicKey.getY().toByteArray();
        try {
            validateEcP256CoordinateEncoding(byteArray);
            validateEcP256CoordinateEncoding(byteArray2);
            BigInteger bigInteger = new BigInteger(byteArray);
            BigInteger bigInteger2 = new BigInteger(byteArray2);
            validateEcP256CurvePoint(bigInteger, bigInteger2);
            return (ECPublicKey) KeyFactory.getInstance(EC_ALG).generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), EC_P256_PARAMS));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static PublicKey parsePublicKey(SecureMessageProto.GenericPublicKey genericPublicKey) throws InvalidKeySpecException {
        if (!genericPublicKey.hasType()) {
            throw new InvalidKeySpecException("GenericPublicKey.type is a required field");
        }
        int i = 1.$SwitchMap$com$google$security$cryptauth$lib$securemessage$SecureMessageProto$PublicKeyType[genericPublicKey.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new InvalidKeySpecException("Unsupported GenericPublicKey type: " + genericPublicKey.getType());
                }
                if (genericPublicKey.hasDh2048PublicKey()) {
                    return parseDh2048PublicKey(genericPublicKey.getDh2048PublicKey());
                }
            } else if (genericPublicKey.hasRsa2048PublicKey()) {
                return parseRsa2048PublicKey(genericPublicKey.getRsa2048PublicKey());
            }
        } else if (genericPublicKey.hasEcP256PublicKey()) {
            return parseEcPublicKey(genericPublicKey.getEcP256PublicKey());
        }
        throw new InvalidKeySpecException("key object is missing for key type: " + genericPublicKey.getType());
    }

    public static RSAPublicKey parseRsa2048PublicKey(SecureMessageProto.SimpleRsaPublicKey simpleRsaPublicKey) throws InvalidKeySpecException {
        if (!simpleRsaPublicKey.hasN()) {
            throw new InvalidKeySpecException("required field is missing");
        }
        byte[] byteArray = simpleRsaPublicKey.getN().toByteArray();
        validateSimpleRsaEncoding(byteArray);
        BigInteger bigInteger = new BigInteger(byteArray);
        if (bigInteger.bitLength() != 2048) {
            throw new InvalidKeySpecException();
        }
        try {
            return (RSAPublicKey) KeyFactory.getInstance(RSA_ALG).generatePublic(new RSAPublicKeySpec(bigInteger, BigInteger.valueOf(simpleRsaPublicKey.getE())));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static DHPublicKey pkToDHPublicKey(PublicKey publicKey) {
        publicKey.getClass();
        if (publicKey instanceof DHPublicKey) {
            return (DHPublicKey) publicKey;
        }
        throw new IllegalArgumentException("Not a DH Public Key");
    }

    private static ECPublicKey pkToECPublicKey(PublicKey publicKey) {
        publicKey.getClass();
        if (publicKey instanceof ECPublicKey) {
            return (ECPublicKey) publicKey;
        }
        throw new IllegalArgumentException("Not an EC Public Key");
    }

    private static RSAPublicKey pkToRSAPublicKey(PublicKey publicKey) {
        publicKey.getClass();
        if (publicKey instanceof RSAPublicKey) {
            return (RSAPublicKey) publicKey;
        }
        throw new IllegalArgumentException("Not an RSA Public Key");
    }

    private static BigInteger squareMod(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.multiply(bigInteger).mod(bigInteger2);
    }

    private static void validateDhEncoding(byte[] bArr) throws InvalidKeySpecException {
        if (bArr.length == 0 || bArr.length > 257) {
            throw new InvalidKeySpecException();
        }
    }

    private static void validateDhGroupElement(BigInteger bigInteger) throws InvalidKeySpecException {
        BigInteger bigInteger2 = ONE;
        if (bigInteger.compareTo(bigInteger2) < 1 || bigInteger.compareTo(DH_P.subtract(bigInteger2)) > -1) {
            throw new InvalidKeySpecException();
        }
    }

    private static void validateEcP256CoordinateEncoding(byte[] bArr) throws InvalidKeySpecException {
        if (bArr.length == 0 || bArr.length > 33 || (bArr.length == 33 && bArr[0] != 0)) {
            throw new InvalidKeySpecException();
        }
    }

    private static void validateEcP256CurvePoint(BigInteger bigInteger, BigInteger bigInteger2) throws InvalidKeySpecException {
        if (bigInteger.signum() == -1 || bigInteger2.signum() == -1) {
            throw new InvalidKeySpecException("Point encoding must use only non-negative integers");
        }
        BigInteger bigInteger3 = EC_P256_P;
        if (bigInteger.compareTo(bigInteger3) >= 0 || bigInteger2.compareTo(bigInteger3) >= 0) {
            throw new InvalidKeySpecException("Point lies outside of the expected field");
        }
        if (!squareMod(bigInteger2, bigInteger3).equals(squareMod(bigInteger, bigInteger3).add(EC_P256_A).multiply(bigInteger).mod(bigInteger3).add(EC_P256_B).mod(bigInteger3))) {
            throw new InvalidKeySpecException("Point does not lie on the expected curve");
        }
    }

    private static void validateSimpleRsaEncoding(byte[] bArr) throws InvalidKeySpecException {
        if (bArr.length == 0 || bArr.length > 257) {
            throw new InvalidKeySpecException();
        }
    }
}
