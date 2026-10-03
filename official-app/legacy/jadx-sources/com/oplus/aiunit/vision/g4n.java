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
public abstract class g4n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g4n f11632c;
    public byte[] d = null;

    public g4n() {
    }

    public final byte[] a() throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        byte[] bArrB = b(this.d);
        g4n g4nVar = this.f11632c;
        if (g4nVar == null) {
            return bArrB;
        }
        g4nVar.d = bArrB;
        return g4nVar.a();
    }

    public abstract byte[] b(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException;

    public void c(byte[] bArr) {
    }

    public g4n(g4n g4nVar) {
        this.f11632c = g4nVar;
    }
}
