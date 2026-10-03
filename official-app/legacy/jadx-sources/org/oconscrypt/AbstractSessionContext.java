package org.oconscrypt;

import com.heytap.conscrypt.Strategy;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* JADX INFO: loaded from: classes11.dex */
abstract class AbstractSessionContext implements SSLSessionContext {
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 28800;
    private volatile int maximumSize;
    private volatile int timeout = DEFAULT_SESSION_TIMEOUT_SECONDS;
    private volatile long sslCtxNativePointer = NativeCrypto.SSL_CTX_new();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Map<ByteArray, NativeSslSession> sessions = new LinkedHashMap<ByteArray, NativeSslSession>() { // from class: org.oconscrypt.AbstractSessionContext.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<ByteArray, NativeSslSession> entry) {
            if (AbstractSessionContext.this.maximumSize <= 0 || size() <= AbstractSessionContext.this.maximumSize) {
                return false;
            }
            AbstractSessionContext.this.onBeforeRemoveSession(entry.getValue());
            return true;
        }
    };
    private Strategy strategy = Strategy.GOOGLE_RECOMMEND;

    public AbstractSessionContext(int i) {
        this.maximumSize = i;
    }

    private void freeNative() {
        this.lock.writeLock().lock();
        try {
            if (isValid()) {
                long j2 = this.sslCtxNativePointer;
                this.sslCtxNativePointer = 0L;
                NativeCrypto.SSL_CTX_free(j2, this);
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    private boolean isValid() {
        return this.sslCtxNativePointer != 0;
    }

    private void setTimeout(int i) {
        this.lock.writeLock().lock();
        try {
            if (isValid()) {
                NativeCrypto.SSL_CTX_set_timeout(this.sslCtxNativePointer, this, i);
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    private void trimToSize() {
        synchronized (this.sessions) {
            int size = this.sessions.size();
            if (size > this.maximumSize) {
                int i = size - this.maximumSize;
                Iterator<NativeSslSession> it = this.sessions.values().iterator();
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    onBeforeRemoveSession(it.next());
                    it.remove();
                    i = i2;
                }
            }
        }
    }

    public final void cacheSession(NativeSslSession nativeSslSession) {
        byte[] id = nativeSslSession.getId();
        if (id == null || id.length == 0) {
            return;
        }
        synchronized (this.sessions) {
            ByteArray byteArray = new ByteArray(id);
            if (this.sessions.containsKey(byteArray)) {
                removeSession(this.sessions.get(byteArray));
            }
            onBeforeAddSession(nativeSslSession, Boolean.FALSE);
            this.sessions.put(byteArray, nativeSslSession);
        }
    }

    public void finalize() throws Throwable {
        try {
            freeNative();
        } finally {
            super.finalize();
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final Enumeration<byte[]> getIds() {
        final Iterator it;
        synchronized (this.sessions) {
            it = Arrays.asList((NativeSslSession[]) this.sessions.values().toArray(new NativeSslSession[0])).iterator();
        }
        return new Enumeration<byte[]>() { // from class: org.oconscrypt.AbstractSessionContext.2
            private NativeSslSession next;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                if (this.next != null) {
                    return true;
                }
                while (it.hasNext()) {
                    NativeSslSession nativeSslSession = (NativeSslSession) it.next();
                    if (nativeSslSession.isValid()) {
                        this.next = nativeSslSession;
                        return true;
                    }
                }
                this.next = null;
                return false;
            }

            @Override // java.util.Enumeration
            public byte[] nextElement() {
                if (!hasMoreElements()) {
                    throw new NoSuchElementException();
                }
                byte[] id = this.next.getId();
                this.next = null;
                return id;
            }
        };
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final SSLSession getSession(byte[] bArr) {
        NativeSslSession nativeSslSession;
        if (bArr == null) {
            throw new NullPointerException("sessionId");
        }
        ByteArray byteArray = new ByteArray(bArr);
        synchronized (this.sessions) {
            nativeSslSession = this.sessions.get(byteArray);
        }
        if (nativeSslSession == null || !nativeSslSession.isValid()) {
            return null;
        }
        return nativeSslSession.toSSLSession();
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionCacheSize() {
        return this.maximumSize;
    }

    public final NativeSslSession getSessionFromCache(byte[] bArr) {
        NativeSslSession nativeSslSession;
        if (bArr == null) {
            return null;
        }
        synchronized (this.sessions) {
            nativeSslSession = this.sessions.get(new ByteArray(bArr));
        }
        if (nativeSslSession == null || !nativeSslSession.isValid()) {
            return getSessionFromPersistentCache(bArr);
        }
        if (getStrategy() == Strategy.GOOGLE_RECOMMEND && nativeSslSession.isSingleUse()) {
            removeSession(nativeSslSession);
        }
        return nativeSslSession;
    }

    public abstract NativeSslSession getSessionFromPersistentCache(byte[] bArr);

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionTimeout() {
        return this.timeout;
    }

    public final Strategy getStrategy() {
        return this.strategy;
    }

    public long newSsl() throws SSLException {
        this.lock.readLock().lock();
        try {
            if (!isValid()) {
                throw new SSLException("Invalid session context");
            }
            long jSSL_new = NativeCrypto.SSL_new(this.sslCtxNativePointer, this);
            this.lock.readLock().unlock();
            return jSSL_new;
        } catch (Throwable th) {
            this.lock.readLock().unlock();
            throw th;
        }
    }

    public abstract void onBeforeAddSession(NativeSslSession nativeSslSession, Boolean bool);

    public abstract void onBeforeRemoveSession(NativeSslSession nativeSslSession);

    public final void removeSession(NativeSslSession nativeSslSession) {
        byte[] id = nativeSslSession.getId();
        if (id == null || id.length == 0) {
            return;
        }
        onBeforeRemoveSession(nativeSslSession);
        ByteArray byteArray = new ByteArray(id);
        synchronized (this.sessions) {
            this.sessions.remove(byteArray);
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionCacheSize(int i) throws IllegalArgumentException {
        if (i < 0) {
            throw new IllegalArgumentException("size < 0");
        }
        int i2 = this.maximumSize;
        this.maximumSize = i;
        if (i < i2) {
            trimToSize();
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionTimeout(int i) throws IllegalArgumentException {
        if (i < 0) {
            throw new IllegalArgumentException("seconds < 0");
        }
        synchronized (this.sessions) {
            this.timeout = i;
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            setTimeout(i);
            Iterator<NativeSslSession> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                NativeSslSession next = it.next();
                if (!next.isValid()) {
                    onBeforeRemoveSession(next);
                    it.remove();
                }
            }
        }
    }

    public void setSesssionIdContext(byte[] bArr) {
        this.lock.writeLock().lock();
        try {
            if (isValid()) {
                NativeCrypto.SSL_CTX_set_session_id_context(this.sslCtxNativePointer, this, bArr);
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public final void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public final void cacheSession(NativeSslSession nativeSslSession, Boolean bool) {
        byte[] id = nativeSslSession.getId();
        if (id == null || id.length == 0) {
            return;
        }
        synchronized (this.sessions) {
            ByteArray byteArray = new ByteArray(id);
            if (this.sessions.containsKey(byteArray)) {
                removeSession(this.sessions.get(byteArray));
            }
            onBeforeAddSession(nativeSslSession, bool);
            this.sessions.put(byteArray, nativeSslSession);
        }
    }
}
