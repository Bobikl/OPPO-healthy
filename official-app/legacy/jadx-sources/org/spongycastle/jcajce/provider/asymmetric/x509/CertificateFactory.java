package org.spongycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;

/* JADX INFO: loaded from: classes11.dex */
public class CertificateFactory extends CertificateFactorySpi {

    public class ExCertificateException extends CertificateException {
        private Throwable cause;
        final /* synthetic */ CertificateFactory this$0;

        public ExCertificateException(CertificateFactory certificateFactory, Throwable th) {
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        public ExCertificateException(CertificateFactory certificateFactory, String str, Throwable th) {
            super(str);
            this.cause = th;
        }
    }
}
