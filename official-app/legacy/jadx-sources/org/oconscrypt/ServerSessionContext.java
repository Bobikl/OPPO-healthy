package org.oconscrypt;

/* JADX INFO: loaded from: classes11.dex */
public final class ServerSessionContext extends AbstractSessionContext {
    private SSLServerSessionCache persistentCache;

    public ServerSessionContext() {
        super(100);
        setSesssionIdContext(new byte[]{32});
    }

    @Override // org.oconscrypt.AbstractSessionContext
    public NativeSslSession getSessionFromPersistentCache(byte[] bArr) {
        byte[] sessionData;
        NativeSslSession nativeSslSessionNewInstance;
        SSLServerSessionCache sSLServerSessionCache = this.persistentCache;
        if (sSLServerSessionCache == null || (sessionData = sSLServerSessionCache.getSessionData(bArr)) == null || (nativeSslSessionNewInstance = NativeSslSession.newInstance(this, sessionData, null, -1)) == null || !nativeSslSessionNewInstance.isValid()) {
            return null;
        }
        cacheSession(nativeSslSessionNewInstance);
        return nativeSslSessionNewInstance;
    }

    @Override // org.oconscrypt.AbstractSessionContext
    public void onBeforeAddSession(NativeSslSession nativeSslSession, Boolean bool) {
        byte[] bytes;
        if (this.persistentCache == null || (bytes = nativeSslSession.toBytes()) == null) {
            return;
        }
        this.persistentCache.putSessionData(nativeSslSession.toSSLSession(), bytes);
    }

    @Override // org.oconscrypt.AbstractSessionContext
    public void onBeforeRemoveSession(NativeSslSession nativeSslSession) {
    }

    public void setPersistentCache(SSLServerSessionCache sSLServerSessionCache) {
        this.persistentCache = sSLServerSessionCache;
    }
}
