package org.spongycastle.x509;

import com.oplus.aiunit.vision.hp6;
import java.security.cert.CertPath;
import org.spongycastle.i18n.LocalizedException;

/* JADX INFO: loaded from: classes11.dex */
public class CertPathReviewerException extends LocalizedException {
    private CertPath certPath;
    private int index;

    public CertPathReviewerException(hp6 hp6Var, Throwable th) {
        super(hp6Var, th);
        this.index = -1;
        this.certPath = null;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getIndex() {
        return this.index;
    }

    public CertPathReviewerException(hp6 hp6Var) {
        super(hp6Var);
        this.index = -1;
        this.certPath = null;
    }

    public CertPathReviewerException(hp6 hp6Var, Throwable th, CertPath certPath, int i) {
        super(hp6Var, th);
        this.index = -1;
        this.certPath = null;
        if (certPath != null && i != -1) {
            if (i >= -1 && i < certPath.getCertificates().size()) {
                this.certPath = certPath;
                this.index = i;
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public CertPathReviewerException(hp6 hp6Var, CertPath certPath, int i) {
        super(hp6Var);
        this.index = -1;
        this.certPath = null;
        if (certPath != null && i != -1) {
            if (i >= -1 && i < certPath.getCertificates().size()) {
                this.certPath = certPath;
                this.index = i;
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }
}
