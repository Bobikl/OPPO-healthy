package org.spongycastle.crypto.tls;

import com.oplus.aiunit.vision.gz;

/* JADX INFO: loaded from: classes11.dex */
public class TlsFatalAlertReceived extends TlsException {
    protected short alertDescription;

    public TlsFatalAlertReceived(short s) {
        super(gz.b(s), null);
        this.alertDescription = s;
    }

    public short getAlertDescription() {
        return this.alertDescription;
    }
}
