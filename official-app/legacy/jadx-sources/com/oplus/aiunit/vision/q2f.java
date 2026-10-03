package com.oplus.aiunit.vision;

import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes11.dex */
public class q2f implements qia {
    public final Provider a;

    public q2f(Provider provider) {
        this.a = provider;
    }

    @Override // com.oplus.aiunit.vision.qia
    public CertificateFactory a(String str) throws CertificateException {
        return CertificateFactory.getInstance(str, this.a);
    }
}
