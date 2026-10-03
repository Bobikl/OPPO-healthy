package com.oplus.aiunit.vision;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes12.dex */
public final class d3n extends b3n {
    public d3n() {
    }

    @Override // com.oplus.aiunit.vision.b3n
    public final byte[] a(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        return q0n.b(bArr);
    }

    public d3n(b3n b3nVar) {
        super(b3nVar);
    }
}
