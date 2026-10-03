package com.oplus.oms.split.full.signature;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes8.dex */
class VerbatimX509Certificate extends WrappedX509Certificate {
    private final byte[] mEncodedVerbatim;

    public VerbatimX509Certificate(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.mEncodedVerbatim = bArr;
    }

    @Override // com.oplus.oms.split.full.signature.WrappedX509Certificate, java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        return this.mEncodedVerbatim;
    }
}
