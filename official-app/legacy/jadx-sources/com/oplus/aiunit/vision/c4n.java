package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes12.dex */
public final class c4n extends g4n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f9951e;
    public String f;
    public b3n g;
    public Object[] h;

    public c4n(Context context, g4n g4nVar, b3n b3nVar, String str, Object... objArr) {
        super(g4nVar);
        this.f9951e = context;
        this.f = str;
        this.g = b3nVar;
        this.h = objArr;
    }

    @Override // com.oplus.aiunit.vision.g4n
    public final byte[] b(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        String strG = w0n.g(bArr);
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        return w0n.n("{\"pinfo\":\"" + w0n.g(this.g.b(w0n.n(d()))) + "\",\"els\":[" + strG + "]}");
    }

    public final String d() {
        try {
            return String.format(w0n.t(this.f), this.h);
        } catch (Throwable th) {
            th.printStackTrace();
            c2n.r(th, "ofm", "gpj");
            return "";
        }
    }
}
