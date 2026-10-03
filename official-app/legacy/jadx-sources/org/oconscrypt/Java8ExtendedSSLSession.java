package org.oconscrypt;

import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;

/* JADX INFO: loaded from: classes11.dex */
class Java8ExtendedSSLSession extends Java7ExtendedSSLSession {
    private boolean isOfferToResume;

    public Java8ExtendedSSLSession(ExternalSession externalSession) {
        super(externalSession);
        this.isOfferToResume = false;
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public final List<SNIServerName> getRequestedServerNames() {
        String requestedServerName = this.delegate.getRequestedServerName();
        return requestedServerName == null ? Collections.emptyList() : Collections.singletonList(new SNIHostName(requestedServerName));
    }

    public boolean isOfferToResume() {
        return this.isOfferToResume;
    }

    public void offerToResume(boolean z) {
        this.isOfferToResume = z;
    }
}
