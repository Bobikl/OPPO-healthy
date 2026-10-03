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
public final class b4n extends g4n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b3n f9596e;

    public b4n(g4n g4nVar) {
        super(g4nVar);
        this.f9596e = new d3n();
    }

    @Override // com.oplus.aiunit.vision.g4n
    public final byte[] b(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        return this.f9596e.b(bArr);
    }
}
