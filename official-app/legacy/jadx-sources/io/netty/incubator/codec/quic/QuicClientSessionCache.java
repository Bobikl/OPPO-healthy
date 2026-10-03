package io.netty.incubator.codec.quic;

import android.content.Context;
import android.os.Environment;
import io.netty.util.AsciiString;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class QuicClientSessionCache {
    private static final long CACHE_PERIOD = 604800000;
    private static volatile File cacheDir;
    private static volatile QuicClientSessionCache instance;
    private final Map<HostPort, SessionHolder> sessions = new LinkedHashMap<HostPort, SessionHolder>() { // from class: io.netty.incubator.codec.quic.QuicClientSessionCache.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<HostPort, SessionHolder> entry) {
            int i = QuicClientSessionCache.maxCacheSize.get();
            return i >= 0 && size() > i;
        }
    };
    private static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) QuicClientSessionCache.class);
    private static volatile String dirName = "pskCache";
    private static AtomicLong sessionTimeout = new AtomicLong(604800000);
    private static final int CACHE_MAX_SIZE = 20480;
    private static AtomicInteger maxCacheSize = new AtomicInteger(CACHE_MAX_SIZE);
    private static final Executor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory("Netty SaveSessionCache", true));

    public static final class HostPort {
        private final int hash;
        private final String host;
        private final int port;

        public HostPort(String str, int i) {
            this.host = str;
            this.port = i;
            this.hash = (AsciiString.hashCode(str) * 31) + i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof HostPort)) {
                return false;
            }
            HostPort hostPort = (HostPort) obj;
            return this.port == hostPort.port && this.host.equalsIgnoreCase(hostPort.host);
        }

        public int hashCode() {
            return this.hash;
        }

        public String toString() {
            return this.host + "-" + this.port;
        }
    }

    public static final class SessionHolder implements Serializable {
        private static final long serialVersionUID = 1;
        private long creationTime;
        private boolean isSingleUse;
        private byte[] sessionBytes;
        private long timeout;

        public SessionHolder(long j2, long j3, byte[] bArr, boolean z) {
            this.creationTime = j2;
            this.timeout = j3;
            this.sessionBytes = bArr;
            this.isSingleUse = z;
        }

        public boolean isSingleUse() {
            return this.isSingleUse;
        }

        public boolean isValid() {
            return isValid(System.currentTimeMillis());
        }

        public byte[] sessionBytes() {
            return this.sessionBytes;
        }

        public boolean isValid(long j2) {
            return j2 <= this.creationTime + this.timeout;
        }
    }

    private QuicClientSessionCache(Context context) {
        cacheDir = getDiskCacheDir(context, dirName);
    }

    private File getDiskCacheDir(Context context, String str) {
        File file = new File(("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) ? context.getExternalCacheDir() : context.getCacheDir(), str);
        file.mkdirs();
        return file;
    }

    public static QuicClientSessionCache getInstance(Context context) {
        QuicClientSessionCache quicClientSessionCache;
        if (instance != null) {
            return instance;
        }
        synchronized (QuicClientSessionCache.class) {
            if (instance == null) {
                instance = new QuicClientSessionCache(context);
            }
            quicClientSessionCache = instance;
        }
        return quicClientSessionCache;
    }

    private static HostPort keyFor(String str, int i) {
        if (str != null || i >= 1) {
            return new HostPort(str, i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$threadFactory$0(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static void setSessionCacheDirName(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        dirName = str;
    }

    public static void setSessionCacheSize(int i) {
        maxCacheSize.set(i);
    }

    public static ThreadFactory threadFactory(final String str, final boolean z) {
        return new ThreadFactory() { // from class: io.netty.incubator.codec.quic.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return QuicClientSessionCache.lambda$threadFactory$0(str, z, runnable);
            }
        };
    }

    public byte[] getSession(String str, int i) {
        HostPort hostPortKeyFor = keyFor(str, i);
        if (hostPortKeyFor == null) {
            return null;
        }
        File file = new File(cacheDir, hostPortKeyFor.toString());
        synchronized (this.sessions) {
            SessionHolder sessionHolder = this.sessions.get(hostPortKeyFor);
            if (sessionHolder == null && file.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        try {
                            SessionHolder sessionHolder2 = (SessionHolder) objectInputStream.readObject();
                            this.sessions.put(hostPortKeyFor, sessionHolder2);
                            objectInputStream.close();
                            fileInputStream.close();
                            sessionHolder = sessionHolder2;
                        } catch (Throwable th) {
                            try {
                                objectInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
            if (sessionHolder == null) {
                return null;
            }
            if (sessionHolder.isSingleUse()) {
                this.sessions.remove(hostPortKeyFor);
                file.deleteOnExit();
            }
            if (sessionHolder.isValid()) {
                return sessionHolder.sessionBytes();
            }
            return null;
        }
    }

    public long getSessionCacheSize() {
        return maxCacheSize.get();
    }

    public long getSessionTimeout() {
        return sessionTimeout.get();
    }

    public void removeSession(String str, int i) {
        HostPort hostPortKeyFor = keyFor(str, i);
        if (hostPortKeyFor == null) {
            return;
        }
        File file = new File(cacheDir, hostPortKeyFor.toString());
        synchronized (this.sessions) {
            this.sessions.remove(hostPortKeyFor);
            file.deleteOnExit();
        }
    }

    public boolean saveSession(QuicheQuicChannel quicheQuicChannel) {
        long jLongValue = quicheQuicChannel.getConnection().longValue();
        InetSocketAddress inetSocketAddress = (InetSocketAddress) quicheQuicChannel.remoteAddress();
        byte[] bArrQuiche_conn_get_session = Quiche.quiche_conn_get_session(jLongValue);
        if (bArrQuiche_conn_get_session != null) {
            saveSession(inetSocketAddress.getHostString(), inetSocketAddress.getPort(), System.currentTimeMillis(), sessionTimeout.get(), bArrQuiche_conn_get_session, null, true);
        }
        return bArrQuiche_conn_get_session != null;
    }

    /* JADX INFO: renamed from: saveSession_0, reason: merged with bridge method [inline-methods] */
    public void lambda$saveSession$1(String str, int i, long j2, long j3, byte[] bArr, byte[] bArr2, boolean z) {
        HostPort hostPortKeyFor = keyFor(str, i);
        if (hostPortKeyFor == null) {
            return;
        }
        SessionHolder sessionHolder = new SessionHolder(j2, j3, bArr, z);
        File file = new File(cacheDir, hostPortKeyFor.toString());
        synchronized (this.sessions) {
            this.sessions.put(hostPortKeyFor, sessionHolder);
            file.deleteOnExit();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    try {
                        objectOutputStream.writeObject(sessionHolder);
                        objectOutputStream.flush();
                        objectOutputStream.close();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            objectOutputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        fileOutputStream.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                file.deleteOnExit();
            }
        }
    }

    public void setSessionTimeout(long j2) {
        sessionTimeout.set(j2);
    }

    public void saveSession(final String str, final int i, final long j2, final long j3, final byte[] bArr, final byte[] bArr2, final boolean z) {
        executor.execute(new Runnable() { // from class: io.netty.incubator.codec.quic.b
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$saveSession$1(str, i, j2, j3, bArr, bArr2, z);
            }
        });
    }
}
