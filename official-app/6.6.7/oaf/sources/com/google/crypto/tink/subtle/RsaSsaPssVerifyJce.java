package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class RsaSsaPssVerifyJce implements PublicKeyVerify {
    private final Enums.HashType mgf1Hash;
    private final RSAPublicKey publicKey;
    private final int saltLength;
    private final Enums.HashType sigHash;

    public RsaSsaPssVerifyJce(RSAPublicKey rSAPublicKey, Enums.HashType hashType, Enums.HashType hashType2, int i) throws GeneralSecurityException {
        Validators.validateSignatureHash(hashType);
        Validators.validateRsaModulusSize(rSAPublicKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(rSAPublicKey.getPublicExponent());
        this.publicKey = rSAPublicKey;
        this.sigHash = hashType;
        this.mgf1Hash = hashType2;
        this.saltLength = i;
    }

    private void emsaPssVerify(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        Validators.validateSignatureHash(this.sigHash);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(this.sigHash));
        byte[] bArrDigest = engineFactory.digest(bArr);
        int digestLength = engineFactory.getDigestLength();
        int length = bArr2.length;
        if (length < this.saltLength + digestLength + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArr2[bArr2.length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, i3);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, bArrCopyOf.length, bArrCopyOf.length + digestLength);
        int i4 = 0;
        while (true) {
            int i5 = i3;
            MessageDigest messageDigest = engineFactory;
            byte[] bArr3 = bArrDigest;
            long j = (((long) length) * 8) - ((long) i);
            if (i4 < j) {
                if (((bArrCopyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i4++;
                i3 = i5;
                engineFactory = messageDigest;
                bArrDigest = bArr3;
            } else {
                byte[] bArrMgf1 = SubtleUtil.mgf1(bArrCopyOfRange, i5, this.mgf1Hash);
                int length2 = bArrMgf1.length;
                byte[] bArr4 = new byte[length2];
                for (int i6 = 0; i6 < length2; i6++) {
                    bArr4[i6] = (byte) (bArrMgf1[i6] ^ bArrCopyOf[i6]);
                }
                for (int i7 = 0; i7 <= j; i7++) {
                    int i8 = i7 / 8;
                    bArr4[i8] = (byte) ((~(1 << (7 - (i7 % 8)))) & bArr4[i8]);
                }
                int i9 = 0;
                while (true) {
                    int i10 = this.saltLength;
                    if (i9 >= (i2 - i10) - 2) {
                        if (bArr4[(i2 - i10) - 2] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr4, length2 - i10, length2);
                        int i11 = digestLength + 8;
                        byte[] bArr5 = new byte[this.saltLength + i11];
                        System.arraycopy(bArr3, 0, bArr5, 8, bArr3.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr5, i11, bArrCopyOfRange2.length);
                        if (!Bytes.equal(messageDigest.digest(bArr5), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr4[i9] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i9++;
                }
            }
        }
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        BigInteger publicExponent = this.publicKey.getPublicExponent();
        BigInteger modulus = this.publicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        int iBitLength2 = ((modulus.bitLength() - 1) + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigIntegerBytes2Integer = SubtleUtil.bytes2Integer(bArr);
        if (bigIntegerBytes2Integer.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        emsaPssVerify(bArr2, SubtleUtil.integer2Bytes(bigIntegerBytes2Integer.modPow(publicExponent, modulus), iBitLength2), modulus.bitLength() - 1);
    }
}
