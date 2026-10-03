package org.oconscrypt;

import com.heytap.conscrypt.Strategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ClientSessionContext extends AbstractSessionContext {
    private SSLClientSessionCache persistentCache;
    private final Map<HostAndPort, List<NativeSslSession>> sessionsByHostAndPort;

    public static final class HostAndPort {
        final String host;
        final int port;

        public HostAndPort(String str, int i) {
            this.host = str;
            this.port = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof HostAndPort)) {
                return false;
            }
            HostAndPort hostAndPort = (HostAndPort) obj;
            return this.host.equals(hostAndPort.host) && this.port == hostAndPort.port;
        }

        public int hashCode() {
            return (this.host.hashCode() * 31) + this.port;
        }
    }

    public ClientSessionContext() {
        super(10);
        this.sessionsByHostAndPort = new HashMap();
    }

    private NativeSslSession getSession(String str, int i) {
        NativeSslSession nativeSslSession;
        byte[] sessionData;
        NativeSslSession nativeSslSessionNewInstance;
        if (str == null) {
            return null;
        }
        HostAndPort hostAndPort = new HostAndPort(str, i);
        synchronized (this.sessionsByHostAndPort) {
            List<NativeSslSession> list = this.sessionsByHostAndPort.get(hostAndPort);
            nativeSslSession = (list == null || list.size() <= 0) ? null : list.get(0);
        }
        if (nativeSslSession != null && nativeSslSession.isValid()) {
            return nativeSslSession;
        }
        SSLClientSessionCache sSLClientSessionCache = this.persistentCache;
        if (sSLClientSessionCache == null || (sessionData = sSLClientSessionCache.getSessionData(str, i)) == null || (nativeSslSessionNewInstance = NativeSslSession.newInstance(this, sessionData, str, i)) == null || !nativeSslSessionNewInstance.isValid()) {
            return null;
        }
        putSession(hostAndPort, nativeSslSessionNewInstance);
        return nativeSslSessionNewInstance;
    }

    private void putSession(HostAndPort hostAndPort, NativeSslSession nativeSslSession) {
        synchronized (this.sessionsByHostAndPort) {
            List<NativeSslSession> arrayList = this.sessionsByHostAndPort.get(hostAndPort);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.sessionsByHostAndPort.put(hostAndPort, arrayList);
            }
            if (arrayList.size() > 0 && arrayList.get(0).isSingleUse() != nativeSslSession.isSingleUse()) {
                while (!arrayList.isEmpty()) {
                    removeSession(arrayList.get(0));
                }
                this.sessionsByHostAndPort.put(hostAndPort, arrayList);
            }
            arrayList.add(nativeSslSession);
        }
    }

    private void removeSession(HostAndPort hostAndPort, NativeSslSession nativeSslSession) {
        synchronized (this.sessionsByHostAndPort) {
            List<NativeSslSession> list = this.sessionsByHostAndPort.get(hostAndPort);
            if (list != null) {
                list.remove(nativeSslSession);
                if (list.isEmpty()) {
                    this.sessionsByHostAndPort.remove(hostAndPort);
                }
            }
        }
    }

    public synchronized NativeSslSession getCachedSession(String str, int i, SSLParametersImpl sSLParametersImpl) {
        boolean z;
        if (str == null) {
            return null;
        }
        NativeSslSession session = getSession(str, i);
        if (session == null) {
            return null;
        }
        String protocol = session.getProtocol();
        String[] strArr = sSLParametersImpl.enabledProtocols;
        int length = strArr.length;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            }
            if (protocol.equals(strArr[i2])) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            return null;
        }
        String cipherSuite = session.getCipherSuite();
        for (String str2 : sSLParametersImpl.getEnabledCipherSuites()) {
            if (cipherSuite.equals(str2)) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            return null;
        }
        if (getStrategy() == Strategy.GOOGLE_RECOMMEND && session.isSingleUse()) {
            removeSession(session);
        }
        return session;
    }

    @Override // org.oconscrypt.AbstractSessionContext
    public NativeSslSession getSessionFromPersistentCache(byte[] bArr) {
        return null;
    }

    @Override // org.oconscrypt.AbstractSessionContext
    public void onBeforeAddSession(NativeSslSession nativeSslSession, Boolean bool) {
        byte[] bytes;
        NativeSslSession nativeSslSessionNewInstance;
        String peerHost = nativeSslSession.getPeerHost();
        int peerPort = nativeSslSession.getPeerPort();
        if (peerHost == null) {
            return;
        }
        putSession(new HostAndPort(peerHost, peerPort), nativeSslSession);
        if (this.persistentCache != null) {
            if (getStrategy() == Strategy.GOOGLE_RECOMMEND && nativeSslSession.isSingleUse()) {
                return;
            }
            byte[] sessionData = this.persistentCache.getSessionData(peerHost, peerPort);
            if ((sessionData == null || (((nativeSslSessionNewInstance = NativeSslSession.newInstance(this, sessionData, peerHost, peerPort)) == null || !nativeSslSessionNewInstance.isValid()) && !bool.booleanValue())) && (bytes = nativeSslSession.toBytes()) != null) {
                this.persistentCache.putSessionData(nativeSslSession.toSSLSession(), bytes);
            }
        }
    }

    @Override // org.oconscrypt.AbstractSessionContext
    public void onBeforeRemoveSession(NativeSslSession nativeSslSession) {
        String peerHost = nativeSslSession.getPeerHost();
        if (peerHost == null) {
            return;
        }
        removeSession(new HostAndPort(peerHost, nativeSslSession.getPeerPort()), nativeSslSession);
    }

    public void setPersistentCache(SSLClientSessionCache sSLClientSessionCache) {
        this.persistentCache = sSLClientSessionCache;
    }

    public int size() {
        int size;
        synchronized (this.sessionsByHostAndPort) {
            Iterator<List<NativeSslSession>> it = this.sessionsByHostAndPort.values().iterator();
            size = 0;
            while (it.hasNext()) {
                size += it.next().size();
            }
        }
        return size;
    }
}
