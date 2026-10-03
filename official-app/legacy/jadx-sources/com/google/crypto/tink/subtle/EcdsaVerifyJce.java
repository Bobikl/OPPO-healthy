package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes14.dex */
public final class EcdsaVerifyJce implements PublicKeyVerify {
    private final EllipticCurves.EcdsaEncoding encoding;
    private final ECPublicKey publicKey;
    private final String signatureAlgorithm;

    public EcdsaVerifyJce(ECPublicKey eCPublicKey, Enums.HashType hashType, EllipticCurves.EcdsaEncoding ecdsaEncoding) throws GeneralSecurityException {
        EllipticCurves.checkPublicKey(eCPublicKey);
        this.signatureAlgorithm = SubtleUtil.toEcdsaAlgo(hashType);
        this.publicKey = eCPublicKey;
        this.encoding = ecdsaEncoding;
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        if (this.encoding == EllipticCurves.EcdsaEncoding.IEEE_P1363) {
            if (bArr.length != EllipticCurves.fieldSizeInBytes(this.publicKey.getParams().getCurve()) * 2) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = EllipticCurves.ecdsaIeee2Der(bArr);
        }
        if (!EllipticCurves.isValidDerEncoding(bArr)) {
            throw new GeneralSecurityException("Invalid signature");
        }
        Signature engineFactory = EngineFactory.SIGNATURE.getInstance(this.signatureAlgorithm);
        engineFactory.initVerify(this.publicKey);
        engineFactory.update(bArr2);
        try {
            zVerify = engineFactory.verify(bArr);
        } catch (RuntimeException unused) {
            zVerify = false;
        }
        if (!zVerify) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }
}
