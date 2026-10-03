package org.spongycastle.crypto.tls;

import com.oplus.aiunit.vision.gz;

/* JADX INFO: loaded from: classes11.dex */
public class TlsFatalAlert extends TlsException {
    protected short alertDescription;

    public TlsFatalAlert(short s) {
        this(s, null);
    }

    public short getAlertDescription() {
        return this.alertDescription;
    }

    public TlsFatalAlert(short s, Throwable th) {
        super(gz.b(s), th);
        this.alertDescription = s;
    }
}
