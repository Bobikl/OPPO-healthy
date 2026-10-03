package org.oconscrypt;

import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes11.dex */
public interface SSLServerSessionCache {
    byte[] getSessionData(byte[] bArr);

    void putSessionData(SSLSession sSLSession, byte[] bArr);
}
