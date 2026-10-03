package io.netty.handler.ssl;

import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.handler.ssl.util.LazyJavaxX509Certificate;
import io.netty.handler.ssl.util.LazyX509Certificate;
import io.netty.internal.tcnative.AsyncTask;
import io.netty.internal.tcnative.Buffer;
import io.netty.internal.tcnative.SSL;
import io.netty.util.AbstractReferenceCounted;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCounted;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetectorFactory;
import io.netty.util.ResourceLeakTracker;
import io.netty.util.internal.EmptyArrays;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.SuppressJava6Requirement;
import io.netty.util.internal.ThrowableUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes10.dex */
public class ReferenceCountedOpenSslEngine extends SSLEngine implements ReferenceCounted, ApplicationProtocolAccessor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_SSLV2 = 0;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_SSLV3 = 1;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_TLSv1 = 2;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_TLSv1_1 = 3;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_TLSv1_2 = 4;
    private static final int OPENSSL_OP_NO_PROTOCOL_INDEX_TLSv1_3 = 5;
    private Object algorithmConstraints;
    final ByteBufAllocator alloc;
    private final OpenSslApplicationProtocolNegotiator apn;
    private volatile String applicationProtocol;
    private volatile ClientAuth clientAuth;
    private final boolean clientMode;
    private volatile boolean destroyed;
    private final boolean enableOcsp;
    private String endPointIdentificationAlgorithm;
    private final OpenSslEngineMap engineMap;
    private String[] explicitlyEnabledProtocols;
    private HandshakeState handshakeState;
    private boolean isInboundDone;
    final boolean jdkCompatibilityMode;
    private volatile long lastAccessed;
    private final ResourceLeakTracker<ReferenceCountedOpenSslEngine> leak;
    private volatile Collection<?> matchers;
    private int maxWrapBufferSize;
    private int maxWrapOverhead;
    private volatile boolean needTask;
    private long networkBIO;
    private boolean outboundClosed;
    private final ReferenceCountedOpenSslContext parentContext;
    private Throwable pendingException;
    private boolean receivedShutdown;
    private final AbstractReferenceCounted refCnt;
    private final OpenSslSession session;
    private boolean sessionSet;
    private final ByteBuffer[] singleDstBuffer;
    private final ByteBuffer[] singleSrcBuffer;
    private List<String> sniHostNames;
    private long ssl;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) ReferenceCountedOpenSslEngine.class);
    private static final ResourceLeakDetector<ReferenceCountedOpenSslEngine> leakDetector = ResourceLeakDetectorFactory.instance().newResourceLeakDetector(ReferenceCountedOpenSslEngine.class);
    private static final int[] OPENSSL_OP_NO_PROTOCOLS = {SSL.SSL_OP_NO_SSLv2, SSL.SSL_OP_NO_SSLv3, SSL.SSL_OP_NO_TLSv1, SSL.SSL_OP_NO_TLSv1_1, SSL.SSL_OP_NO_TLSv1_2, SSL.SSL_OP_NO_TLSv1_3};
    static final int MAX_PLAINTEXT_LENGTH = SSL.SSL_MAX_PLAINTEXT_LENGTH;
    static final int MAX_RECORD_SIZE = SSL.SSL_MAX_RECORD_LENGTH;
    private static final SSLEngineResult NEED_UNWRAP_OK = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, 0);
    private static final SSLEngineResult NEED_UNWRAP_CLOSED = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, 0);
    private static final SSLEngineResult NEED_WRAP_OK = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, 0);
    private static final SSLEngineResult NEED_WRAP_CLOSED = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, 0);
    private static final SSLEngineResult CLOSED_NOT_HANDSHAKING = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);

    /* JADX INFO: renamed from: io.netty.handler.ssl.ReferenceCountedOpenSslEngine$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ClientAuth;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState;

        static {
            int[] iArr = new int[ApplicationProtocolConfig.Protocol.values().length];
            $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol = iArr;
            try {
                iArr[ApplicationProtocolConfig.Protocol.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[ApplicationProtocolConfig.Protocol.ALPN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[ApplicationProtocolConfig.Protocol.NPN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[ApplicationProtocolConfig.Protocol.NPN_AND_ALPN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ClientAuth.values().length];
            $SwitchMap$io$netty$handler$ssl$ClientAuth = iArr2;
            try {
                iArr2[ClientAuth.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ClientAuth[ClientAuth.REQUIRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ClientAuth[ClientAuth.OPTIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[HandshakeState.values().length];
            $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState = iArr3;
            try {
                iArr3[HandshakeState.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState[HandshakeState.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState[HandshakeState.STARTED_IMPLICITLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState[HandshakeState.STARTED_EXPLICITLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public final class AsyncTaskDecorator extends TaskDecorator<AsyncTask> implements AsyncRunnable {
        public AsyncTaskDecorator(AsyncTask asyncTask) {
            super(asyncTask);
        }

        @Override // io.netty.handler.ssl.AsyncRunnable
        public void run(Runnable runnable) {
            if (ReferenceCountedOpenSslEngine.this.isDestroyed()) {
                return;
            }
            this.task.runAsync(ReferenceCountedOpenSslEngine.this.new TaskDecorator(runnable));
        }
    }

    public final class DefaultOpenSslSession implements OpenSslSession {
        private String cipher;
        private volatile long creationTime;
        private volatile Certificate[] localCertificateChain;
        private Certificate[] peerCerts;
        private String protocol;
        private final OpenSslSessionContext sessionContext;
        private Map<String, Object> values;
        private X509Certificate[] x509PeerCerts;
        private boolean valid = true;
        private OpenSslSessionId id = OpenSslSessionId.NULL_ID;
        private volatile int applicationBufferSize = ReferenceCountedOpenSslEngine.MAX_PLAINTEXT_LENGTH;

        public DefaultOpenSslSession(OpenSslSessionContext openSslSessionContext) {
            this.sessionContext = openSslSessionContext;
        }

        private void initCerts(byte[][] bArr, int i) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                int i3 = i + i2;
                this.peerCerts[i3] = new LazyX509Certificate(bArr[i2]);
                this.x509PeerCerts[i3] = new LazyJavaxX509Certificate(bArr[i2]);
            }
        }

        private SSLSessionBindingEvent newSSLSessionBindingEvent(String str) {
            return new SSLSessionBindingEvent(ReferenceCountedOpenSslEngine.this.session, str);
        }

        private void notifyUnbound(Object obj, String str) {
            if (obj instanceof SSLSessionBindingListener) {
                ((SSLSessionBindingListener) obj).valueUnbound(newSSLSessionBindingEvent(str));
            }
        }

        @Override // javax.net.ssl.SSLSession
        public int getApplicationBufferSize() {
            return this.applicationBufferSize;
        }

        @Override // javax.net.ssl.SSLSession
        public String getCipherSuite() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                String str = this.cipher;
                return str == null ? "SSL_NULL_WITH_NULL_NULL" : str;
            }
        }

        @Override // javax.net.ssl.SSLSession
        public long getCreationTime() {
            long j2;
            synchronized (ReferenceCountedOpenSslEngine.this) {
                j2 = this.creationTime;
            }
            return j2;
        }

        @Override // javax.net.ssl.SSLSession
        public byte[] getId() {
            return sessionId().cloneBytes();
        }

        @Override // javax.net.ssl.SSLSession
        public long getLastAccessedTime() {
            long j2 = ReferenceCountedOpenSslEngine.this.lastAccessed;
            return j2 == -1 ? getCreationTime() : j2;
        }

        @Override // javax.net.ssl.SSLSession
        public Certificate[] getLocalCertificates() {
            Certificate[] certificateArr = this.localCertificateChain;
            if (certificateArr == null) {
                return null;
            }
            return (Certificate[]) certificateArr.clone();
        }

        @Override // javax.net.ssl.SSLSession
        public Principal getLocalPrincipal() {
            Certificate[] certificateArr = this.localCertificateChain;
            if (certificateArr == null || certificateArr.length == 0) {
                return null;
            }
            return ((java.security.cert.X509Certificate) certificateArr[0]).getSubjectX500Principal();
        }

        @Override // javax.net.ssl.SSLSession
        public int getPacketBufferSize() {
            return ReferenceCountedOpenSslEngine.this.maxEncryptedPacketLength();
        }

        @Override // javax.net.ssl.SSLSession
        public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
            X509Certificate[] x509CertificateArr;
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (ReferenceCountedOpenSslEngine.isEmpty(this.x509PeerCerts)) {
                    throw new SSLPeerUnverifiedException("peer not verified");
                }
                x509CertificateArr = (X509Certificate[]) this.x509PeerCerts.clone();
            }
            return x509CertificateArr;
        }

        @Override // javax.net.ssl.SSLSession
        public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
            Certificate[] certificateArr;
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (ReferenceCountedOpenSslEngine.isEmpty(this.peerCerts)) {
                    throw new SSLPeerUnverifiedException("peer not verified");
                }
                certificateArr = (Certificate[]) this.peerCerts.clone();
            }
            return certificateArr;
        }

        @Override // javax.net.ssl.SSLSession
        public String getPeerHost() {
            return ReferenceCountedOpenSslEngine.this.getPeerHost();
        }

        @Override // javax.net.ssl.SSLSession
        public int getPeerPort() {
            return ReferenceCountedOpenSslEngine.this.getPeerPort();
        }

        @Override // javax.net.ssl.SSLSession
        public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
            return ((java.security.cert.X509Certificate) getPeerCertificates()[0]).getSubjectX500Principal();
        }

        @Override // javax.net.ssl.SSLSession
        public String getProtocol() {
            String version = this.protocol;
            if (version == null) {
                synchronized (ReferenceCountedOpenSslEngine.this) {
                    version = !ReferenceCountedOpenSslEngine.this.isDestroyed() ? SSL.getVersion(ReferenceCountedOpenSslEngine.this.ssl) : "";
                }
            }
            return version;
        }

        @Override // javax.net.ssl.SSLSession
        public Object getValue(String str) {
            ObjectUtil.checkNotNull(str, "name");
            synchronized (this) {
                Map<String, Object> map = this.values;
                if (map == null) {
                    return null;
                }
                return map.get(str);
            }
        }

        @Override // javax.net.ssl.SSLSession
        public String[] getValueNames() {
            synchronized (this) {
                Map<String, Object> map = this.values;
                if (map != null && !map.isEmpty()) {
                    return (String[]) map.keySet().toArray(new String[0]);
                }
                return EmptyArrays.EMPTY_STRINGS;
            }
        }

        @Override // io.netty.handler.ssl.OpenSslSession
        public void handshakeFinished(byte[] bArr, String str, String str2, byte[] bArr2, byte[][] bArr3, long j2, long j3) throws SSLException {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (ReferenceCountedOpenSslEngine.this.isDestroyed()) {
                    throw new SSLException("Already closed");
                }
                this.creationTime = j2;
                OpenSslSessionId openSslSessionId = this.id;
                OpenSslSessionId openSslSessionId2 = OpenSslSessionId.NULL_ID;
                if (openSslSessionId == openSslSessionId2) {
                    if (bArr != null) {
                        openSslSessionId2 = new OpenSslSessionId(bArr);
                    }
                    this.id = openSslSessionId2;
                }
                this.cipher = ReferenceCountedOpenSslEngine.this.toJavaCipherSuite(str);
                this.protocol = str2;
                if (ReferenceCountedOpenSslEngine.this.clientMode) {
                    if (ReferenceCountedOpenSslEngine.isEmpty(bArr3)) {
                        this.peerCerts = EmptyArrays.EMPTY_CERTIFICATES;
                        this.x509PeerCerts = EmptyArrays.EMPTY_JAVAX_X509_CERTIFICATES;
                    } else {
                        this.peerCerts = new Certificate[bArr3.length];
                        this.x509PeerCerts = new X509Certificate[bArr3.length];
                        initCerts(bArr3, 0);
                    }
                } else if (ReferenceCountedOpenSslEngine.isEmpty(bArr2)) {
                    this.peerCerts = EmptyArrays.EMPTY_CERTIFICATES;
                    this.x509PeerCerts = EmptyArrays.EMPTY_JAVAX_X509_CERTIFICATES;
                } else if (ReferenceCountedOpenSslEngine.isEmpty(bArr3)) {
                    this.peerCerts = new Certificate[]{new LazyX509Certificate(bArr2)};
                    this.x509PeerCerts = new X509Certificate[]{new LazyJavaxX509Certificate(bArr2)};
                } else {
                    Certificate[] certificateArr = new Certificate[bArr3.length + 1];
                    this.peerCerts = certificateArr;
                    this.x509PeerCerts = new X509Certificate[bArr3.length + 1];
                    certificateArr[0] = new LazyX509Certificate(bArr2);
                    this.x509PeerCerts[0] = new LazyJavaxX509Certificate(bArr2);
                    initCerts(bArr3, 1);
                }
                ReferenceCountedOpenSslEngine.this.calculateMaxWrapOverhead();
                ReferenceCountedOpenSslEngine.this.handshakeState = HandshakeState.FINISHED;
            }
        }

        @Override // javax.net.ssl.SSLSession
        public void invalidate() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                this.valid = false;
                this.sessionContext.removeFromCache(this.id);
            }
        }

        @Override // javax.net.ssl.SSLSession
        public boolean isValid() {
            boolean z;
            synchronized (ReferenceCountedOpenSslEngine.this) {
                z = this.valid || this.sessionContext.isInCache(this.id);
            }
            return z;
        }

        @Override // javax.net.ssl.SSLSession
        public void putValue(String str, Object obj) {
            Object objPut;
            ObjectUtil.checkNotNull(str, "name");
            ObjectUtil.checkNotNull(obj, "value");
            synchronized (this) {
                Map map = this.values;
                if (map == null) {
                    map = new HashMap(2);
                    this.values = map;
                }
                objPut = map.put(str, obj);
            }
            if (obj instanceof SSLSessionBindingListener) {
                ((SSLSessionBindingListener) obj).valueBound(newSSLSessionBindingEvent(str));
            }
            notifyUnbound(objPut, str);
        }

        @Override // javax.net.ssl.SSLSession
        public void removeValue(String str) {
            ObjectUtil.checkNotNull(str, "name");
            synchronized (this) {
                Map<String, Object> map = this.values;
                if (map == null) {
                    return;
                }
                notifyUnbound(map.remove(str), str);
            }
        }

        @Override // io.netty.handler.ssl.OpenSslSession
        public OpenSslSessionId sessionId() {
            OpenSslSessionId openSslSessionId;
            byte[] sessionId;
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (this.id == OpenSslSessionId.NULL_ID && !ReferenceCountedOpenSslEngine.this.isDestroyed() && (sessionId = SSL.getSessionId(ReferenceCountedOpenSslEngine.this.ssl)) != null) {
                    this.id = new OpenSslSessionId(sessionId);
                }
                openSslSessionId = this.id;
            }
            return openSslSessionId;
        }

        @Override // io.netty.handler.ssl.OpenSslSession
        public void setLocalCertificate(Certificate[] certificateArr) {
            this.localCertificateChain = certificateArr;
        }

        @Override // io.netty.handler.ssl.OpenSslSession
        public void setSessionId(OpenSslSessionId openSslSessionId) {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (this.id == OpenSslSessionId.NULL_ID) {
                    this.id = openSslSessionId;
                    this.creationTime = System.currentTimeMillis();
                }
            }
        }

        public String toString() {
            return "DefaultOpenSslSession{sessionContext=" + this.sessionContext + ", id=" + this.id + '}';
        }

        @Override // io.netty.handler.ssl.OpenSslSession
        public void tryExpandApplicationBufferSize(int i) {
            if (i > ReferenceCountedOpenSslEngine.MAX_PLAINTEXT_LENGTH) {
                int i2 = this.applicationBufferSize;
                int i3 = ReferenceCountedOpenSslEngine.MAX_RECORD_SIZE;
                if (i2 != i3) {
                    this.applicationBufferSize = i3;
                }
            }
        }

        @Override // javax.net.ssl.SSLSession
        public OpenSslSessionContext getSessionContext() {
            return this.sessionContext;
        }
    }

    public enum HandshakeState {
        NOT_STARTED,
        STARTED_IMPLICITLY,
        STARTED_EXPLICITLY,
        FINISHED
    }

    public class TaskDecorator<R extends Runnable> implements Runnable {
        protected final R task;

        public TaskDecorator(R r) {
            this.task = r;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReferenceCountedOpenSslEngine.this.runAndResetNeedTask(this.task);
        }
    }

    public ReferenceCountedOpenSslEngine(ReferenceCountedOpenSslContext referenceCountedOpenSslContext, ByteBufAllocator byteBufAllocator, String str, int i, boolean z, boolean z2) {
        super(str, i);
        this.handshakeState = HandshakeState.NOT_STARTED;
        this.refCnt = new AbstractReferenceCounted() { // from class: io.netty.handler.ssl.ReferenceCountedOpenSslEngine.1
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // io.netty.util.AbstractReferenceCounted
            public void deallocate() {
                ReferenceCountedOpenSslEngine.this.shutdown();
                if (ReferenceCountedOpenSslEngine.this.leak != null) {
                    ReferenceCountedOpenSslEngine.this.leak.close(ReferenceCountedOpenSslEngine.this);
                }
                ReferenceCountedOpenSslEngine.this.parentContext.release();
            }

            @Override // io.netty.util.ReferenceCounted
            public ReferenceCounted touch(Object obj) {
                if (ReferenceCountedOpenSslEngine.this.leak != null) {
                    ReferenceCountedOpenSslEngine.this.leak.record(obj);
                }
                return ReferenceCountedOpenSslEngine.this;
            }
        };
        ClientAuth clientAuth = ClientAuth.NONE;
        this.clientAuth = clientAuth;
        this.lastAccessed = -1L;
        this.singleSrcBuffer = new ByteBuffer[1];
        this.singleDstBuffer = new ByteBuffer[1];
        OpenSsl.ensureAvailability();
        this.engineMap = referenceCountedOpenSslContext.engineMap;
        boolean z3 = referenceCountedOpenSslContext.enableOcsp;
        this.enableOcsp = z3;
        this.jdkCompatibilityMode = z;
        this.alloc = (ByteBufAllocator) ObjectUtil.checkNotNull(byteBufAllocator, "alloc");
        this.apn = (OpenSslApplicationProtocolNegotiator) referenceCountedOpenSslContext.applicationProtocolNegotiator();
        boolean zIsClient = referenceCountedOpenSslContext.isClient();
        this.clientMode = zIsClient;
        if (PlatformDependent.javaVersion() >= 7) {
            this.session = new ExtendedOpenSslSession(new DefaultOpenSslSession(referenceCountedOpenSslContext.sessionContext())) { // from class: io.netty.handler.ssl.ReferenceCountedOpenSslEngine.2
                private String[] peerSupportedSignatureAlgorithms;
                private List requestedServerNames;

                @Override // io.netty.handler.ssl.ExtendedOpenSslSession, javax.net.ssl.ExtendedSSLSession
                public String[] getPeerSupportedSignatureAlgorithms() {
                    String[] strArr;
                    String[] sigAlgs;
                    synchronized (ReferenceCountedOpenSslEngine.this) {
                        if (this.peerSupportedSignatureAlgorithms == null) {
                            if (ReferenceCountedOpenSslEngine.this.isDestroyed() || (sigAlgs = SSL.getSigAlgs(ReferenceCountedOpenSslEngine.this.ssl)) == null) {
                                this.peerSupportedSignatureAlgorithms = EmptyArrays.EMPTY_STRINGS;
                            } else {
                                LinkedHashSet linkedHashSet = new LinkedHashSet(sigAlgs.length);
                                for (String str2 : sigAlgs) {
                                    String javaName = SignatureAlgorithmConverter.toJavaName(str2);
                                    if (javaName != null) {
                                        linkedHashSet.add(javaName);
                                    }
                                }
                                this.peerSupportedSignatureAlgorithms = (String[]) linkedHashSet.toArray(new String[0]);
                            }
                        }
                        strArr = (String[]) this.peerSupportedSignatureAlgorithms.clone();
                    }
                    return strArr;
                }

                @Override // io.netty.handler.ssl.ExtendedOpenSslSession, javax.net.ssl.ExtendedSSLSession
                public List getRequestedServerNames() {
                    List list;
                    if (ReferenceCountedOpenSslEngine.this.clientMode) {
                        return Java8SslUtils.getSniHostNames((List<String>) ReferenceCountedOpenSslEngine.this.sniHostNames);
                    }
                    synchronized (ReferenceCountedOpenSslEngine.this) {
                        if (this.requestedServerNames == null) {
                            if (ReferenceCountedOpenSslEngine.this.isDestroyed() || SSL.getSniHostname(ReferenceCountedOpenSslEngine.this.ssl) == null) {
                                this.requestedServerNames = Collections.emptyList();
                            } else {
                                this.requestedServerNames = Java8SslUtils.getSniHostName(SSL.getSniHostname(ReferenceCountedOpenSslEngine.this.ssl).getBytes(CharsetUtil.UTF_8));
                            }
                        }
                        list = this.requestedServerNames;
                    }
                    return list;
                }

                @Override // io.netty.handler.ssl.ExtendedOpenSslSession
                public List<byte[]> getStatusResponses() {
                    byte[] ocspResponse = null;
                    if (ReferenceCountedOpenSslEngine.this.enableOcsp && ReferenceCountedOpenSslEngine.this.clientMode) {
                        synchronized (ReferenceCountedOpenSslEngine.this) {
                            ocspResponse = ReferenceCountedOpenSslEngine.this.isDestroyed() ? null : SSL.getOcspResponse(ReferenceCountedOpenSslEngine.this.ssl);
                        }
                    }
                    return ocspResponse == null ? Collections.emptyList() : Collections.singletonList(ocspResponse);
                }
            };
        } else {
            this.session = new DefaultOpenSslSession(referenceCountedOpenSslContext.sessionContext());
        }
        if (!referenceCountedOpenSslContext.sessionContext().useKeyManager()) {
            this.session.setLocalCertificate(referenceCountedOpenSslContext.keyCertChain);
        }
        Lock lock = referenceCountedOpenSslContext.ctxLock.readLock();
        lock.lock();
        try {
            long jNewSSL = SSL.newSSL(referenceCountedOpenSslContext.ctx, !referenceCountedOpenSslContext.isClient());
            lock.unlock();
            synchronized (this) {
                this.ssl = jNewSSL;
                try {
                    this.networkBIO = SSL.bioNewByteBuffer(jNewSSL, referenceCountedOpenSslContext.getBioNonApplicationBufferSize());
                    if (!zIsClient) {
                        clientAuth = referenceCountedOpenSslContext.clientAuth;
                    }
                    setClientAuth(clientAuth);
                    String[] strArr = referenceCountedOpenSslContext.protocols;
                    if (strArr != null) {
                        setEnabledProtocols0(strArr, true);
                    } else {
                        this.explicitlyEnabledProtocols = getEnabledProtocols();
                    }
                    if (zIsClient && SslUtils.isValidHostNameForSNI(str) && (PlatformDependent.javaVersion() < 8 || Java8SslUtils.isValidHostNameForSNI(str))) {
                        SSL.setTlsExtHostName(this.ssl, str);
                        this.sniHostNames = Collections.singletonList(str);
                    }
                    if (z3) {
                        SSL.enableOcsp(this.ssl);
                    }
                    if (!z) {
                        long j2 = this.ssl;
                        SSL.setMode(j2, SSL.getMode(j2) | SSL.SSL_MODE_ENABLE_PARTIAL_WRITE);
                    }
                    if (isProtocolEnabled(SSL.getOptions(this.ssl), SSL.SSL_OP_NO_TLSv1_3, SslProtocols.TLS_v1_3)) {
                        if (zIsClient ? ReferenceCountedOpenSslContext.CLIENT_ENABLE_SESSION_TICKET_TLSV13 : ReferenceCountedOpenSslContext.SERVER_ENABLE_SESSION_TICKET_TLSV13) {
                            SSL.clearOptions(this.ssl, SSL.SSL_OP_NO_TICKET);
                        }
                    }
                    if (OpenSsl.isBoringSSL() && zIsClient) {
                        SSL.setRenegotiateMode(this.ssl, SSL.SSL_RENEGOTIATE_ONCE);
                    }
                    calculateMaxWrapOverhead();
                } catch (Throwable th) {
                    shutdown();
                    PlatformDependent.throwException(th);
                }
            }
            this.parentContext = referenceCountedOpenSslContext;
            referenceCountedOpenSslContext.retain();
            this.leak = z2 ? leakDetector.track(this) : null;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    private static long bufferAddress(ByteBuffer byteBuffer) {
        return PlatformDependent.hasUnsafe() ? PlatformDependent.directBufferAddress(byteBuffer) : Buffer.address(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calculateMaxWrapOverhead() {
        this.maxWrapOverhead = SSL.getMaxWrapOverhead(this.ssl);
        this.maxWrapBufferSize = this.jdkCompatibilityMode ? maxEncryptedPacketLength0() : maxEncryptedPacketLength0() << 4;
    }

    private void checkEngineClosed() throws SSLException {
        if (isDestroyed()) {
            throw new SSLException("engine closed");
        }
    }

    private void closeAll() throws SSLException {
        this.receivedShutdown = true;
        closeOutbound();
        closeInbound();
    }

    private boolean doSSLShutdown() {
        if (SSL.isInInit(this.ssl) != 0) {
            return false;
        }
        int iShutdownSSL = SSL.shutdownSSL(this.ssl);
        if (iShutdownSSL >= 0) {
            return true;
        }
        int error = SSL.getError(this.ssl, iShutdownSSL);
        if (error != SSL.SSL_ERROR_SYSCALL && error != SSL.SSL_ERROR_SSL) {
            SSL.clearError();
            return true;
        }
        InternalLogger internalLogger = logger;
        if (internalLogger.isDebugEnabled()) {
            int lastErrorNumber = SSL.getLastErrorNumber();
            internalLogger.debug("SSL_shutdown failed: OpenSSL error: {} {}", Integer.valueOf(lastErrorNumber), SSL.getErrorString(lastErrorNumber));
        }
        shutdown();
        return false;
    }

    private SSLEngineResult handleUnwrapException(int i, int i2, SSLException sSLException) throws SSLException {
        int lastErrorNumber = SSL.getLastErrorNumber();
        if (lastErrorNumber != 0) {
            return sslReadErrorResult(SSL.SSL_ERROR_SSL, lastErrorNumber, i, i2);
        }
        throw sSLException;
    }

    private SSLEngineResult.HandshakeStatus handshake() throws SSLException {
        if (this.needTask) {
            return SSLEngineResult.HandshakeStatus.NEED_TASK;
        }
        if (this.handshakeState == HandshakeState.FINISHED) {
            return SSLEngineResult.HandshakeStatus.FINISHED;
        }
        checkEngineClosed();
        if (this.pendingException != null) {
            if (SSL.doHandshake(this.ssl) <= 0) {
                SSL.clearError();
            }
            return handshakeException();
        }
        this.engineMap.add(this);
        if (!this.sessionSet) {
            this.parentContext.sessionContext().setSessionFromCache(getPeerHost(), getPeerPort(), this.ssl);
            this.sessionSet = true;
        }
        if (this.lastAccessed == -1) {
            this.lastAccessed = System.currentTimeMillis();
        }
        int iDoHandshake = SSL.doHandshake(this.ssl);
        if (iDoHandshake > 0) {
            if (SSL.bioLengthNonApplication(this.networkBIO) > 0) {
                return SSLEngineResult.HandshakeStatus.NEED_WRAP;
            }
            this.session.handshakeFinished(SSL.getSessionId(this.ssl), SSL.getCipherForSSL(this.ssl), SSL.getVersion(this.ssl), SSL.getPeerCertificate(this.ssl), SSL.getPeerCertChain(this.ssl), SSL.getTime(this.ssl) * 1000, 1000 * this.parentContext.sessionTimeout());
            selectApplicationProtocol();
            return SSLEngineResult.HandshakeStatus.FINISHED;
        }
        int error = SSL.getError(this.ssl, iDoHandshake);
        if (error == SSL.SSL_ERROR_WANT_READ || error == SSL.SSL_ERROR_WANT_WRITE) {
            return pendingStatus(SSL.bioLengthNonApplication(this.networkBIO));
        }
        if (error == SSL.SSL_ERROR_WANT_X509_LOOKUP || error == SSL.SSL_ERROR_WANT_CERTIFICATE_VERIFY || error == SSL.SSL_ERROR_WANT_PRIVATE_KEY_OPERATION) {
            return SSLEngineResult.HandshakeStatus.NEED_TASK;
        }
        if (needWrapAgain(SSL.getLastErrorNumber())) {
            return SSLEngineResult.HandshakeStatus.NEED_WRAP;
        }
        if (this.pendingException != null) {
            return handshakeException();
        }
        throw shutdownWithError("SSL_do_handshake", error);
    }

    private SSLEngineResult.HandshakeStatus handshakeException() throws SSLException {
        if (SSL.bioLengthNonApplication(this.networkBIO) > 0) {
            return SSLEngineResult.HandshakeStatus.NEED_WRAP;
        }
        Throwable th = this.pendingException;
        this.pendingException = null;
        shutdown();
        if (th instanceof SSLHandshakeException) {
            throw ((SSLHandshakeException) th);
        }
        SSLHandshakeException sSLHandshakeException = new SSLHandshakeException("General OpenSslEngine problem");
        sSLHandshakeException.initCause(th);
        throw sSLHandshakeException;
    }

    private boolean isBytesAvailableEnoughForWrap(int i, int i2, int i3) {
        return ((long) i) - (((long) this.maxWrapOverhead) * ((long) i3)) >= ((long) i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestroyed() {
        return this.destroyed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    private static boolean isEndPointVerificationEnabled(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    private static boolean isProtocolEnabled(int i, int i2, String str) {
        return (i & i2) == 0 && OpenSsl.SUPPORTED_PROTOCOLS_SET.contains(str);
    }

    private SSLEngineResult.HandshakeStatus mayFinishHandshake(SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i2) throws SSLException {
        if ((handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP && i2 > 0) || (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP && i > 0)) {
            return handshake();
        }
        SSLEngineResult.HandshakeStatus handshakeStatus2 = SSLEngineResult.HandshakeStatus.FINISHED;
        if (handshakeStatus != handshakeStatus2) {
            handshakeStatus2 = getHandshakeStatus();
        }
        return mayFinishHandshake(handshakeStatus2);
    }

    private boolean needPendingStatus() {
        return (this.handshakeState == HandshakeState.NOT_STARTED || isDestroyed() || (this.handshakeState == HandshakeState.FINISHED && !isInboundDone() && !isOutboundDone())) ? false : true;
    }

    private boolean needWrapAgain(int i) {
        if (SSL.bioLengthNonApplication(this.networkBIO) <= 0) {
            return false;
        }
        String errorString = SSL.getErrorString(i);
        Throwable sSLException = this.handshakeState == HandshakeState.FINISHED ? new SSLException(errorString) : new SSLHandshakeException(errorString);
        Throwable th = this.pendingException;
        if (th == null) {
            this.pendingException = sSLException;
        } else {
            ThrowableUtil.addSuppressed(th, sSLException);
        }
        SSL.clearError();
        return true;
    }

    private SSLEngineResult newResult(SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i2) {
        return newResult(SSLEngineResult.Status.OK, handshakeStatus, i, i2);
    }

    private SSLEngineResult newResultMayFinishHandshake(SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i2) throws SSLException {
        return newResult(mayFinishHandshake(handshakeStatus, i, i2), i, i2);
    }

    private static SSLEngineResult.HandshakeStatus pendingStatus(int i) {
        return i > 0 ? SSLEngineResult.HandshakeStatus.NEED_WRAP : SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
    }

    private int readPlaintextData(ByteBuffer byteBuffer) throws SSLException {
        int fromSSL;
        int iPosition = byteBuffer.position();
        if (byteBuffer.isDirect()) {
            fromSSL = SSL.readFromSSL(this.ssl, bufferAddress(byteBuffer) + ((long) iPosition), byteBuffer.limit() - iPosition);
            if (fromSSL > 0) {
                byteBuffer.position(iPosition + fromSSL);
            }
        } else {
            int iLimit = byteBuffer.limit();
            int iMin = Math.min(maxEncryptedPacketLength0(), iLimit - iPosition);
            ByteBuf byteBufDirectBuffer = this.alloc.directBuffer(iMin);
            try {
                fromSSL = SSL.readFromSSL(this.ssl, OpenSsl.memoryAddress(byteBufDirectBuffer), iMin);
                if (fromSSL > 0) {
                    byteBuffer.limit(iPosition + fromSSL);
                    byteBufDirectBuffer.getBytes(byteBufDirectBuffer.readerIndex(), byteBuffer);
                    byteBuffer.limit(iLimit);
                }
            } finally {
                byteBufDirectBuffer.release();
            }
        }
        return fromSSL;
    }

    private void rejectRemoteInitiatedRenegotiation() throws SSLHandshakeException {
        if (isDestroyed()) {
            return;
        }
        if (((this.clientMode || SSL.getHandshakeCount(this.ssl) <= 1) && (!this.clientMode || SSL.getHandshakeCount(this.ssl) <= 2)) || SslProtocols.TLS_v1_3.equals(this.session.getProtocol()) || this.handshakeState != HandshakeState.FINISHED) {
            return;
        }
        shutdown();
        throw new SSLHandshakeException("remote-initiated renegotiation not allowed");
    }

    private void resetSingleDstBuffer() {
        this.singleDstBuffer[0] = null;
    }

    private void resetSingleSrcBuffer() {
        this.singleSrcBuffer[0] = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void runAndResetNeedTask(Runnable runnable) {
        try {
            if (isDestroyed()) {
                this.needTask = false;
            } else {
                runnable.run();
                this.needTask = false;
            }
        } catch (Throwable th) {
            this.needTask = false;
            throw th;
        }
    }

    private void selectApplicationProtocol() throws SSLException {
        ApplicationProtocolConfig.SelectedListenerFailureBehavior selectedListenerFailureBehavior = this.apn.selectedListenerFailureBehavior();
        List<String> listProtocols = this.apn.protocols();
        int i = AnonymousClass3.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[this.apn.protocol().ordinal()];
        if (i != 1) {
            if (i == 2) {
                String alpnSelected = SSL.getAlpnSelected(this.ssl);
                if (alpnSelected != null) {
                    this.applicationProtocol = selectApplicationProtocol(listProtocols, selectedListenerFailureBehavior, alpnSelected);
                    return;
                }
                return;
            }
            if (i == 3) {
                String nextProtoNegotiated = SSL.getNextProtoNegotiated(this.ssl);
                if (nextProtoNegotiated != null) {
                    this.applicationProtocol = selectApplicationProtocol(listProtocols, selectedListenerFailureBehavior, nextProtoNegotiated);
                    return;
                }
                return;
            }
            if (i != 4) {
                throw new Error();
            }
            String alpnSelected2 = SSL.getAlpnSelected(this.ssl);
            if (alpnSelected2 == null) {
                alpnSelected2 = SSL.getNextProtoNegotiated(this.ssl);
            }
            if (alpnSelected2 != null) {
                this.applicationProtocol = selectApplicationProtocol(listProtocols, selectedListenerFailureBehavior, alpnSelected2);
            }
        }
    }

    private void setClientAuth(ClientAuth clientAuth) {
        if (this.clientMode) {
            return;
        }
        synchronized (this) {
            if (this.clientAuth == clientAuth) {
                return;
            }
            if (!isDestroyed()) {
                int i = AnonymousClass3.$SwitchMap$io$netty$handler$ssl$ClientAuth[clientAuth.ordinal()];
                if (i == 1) {
                    SSL.setVerify(this.ssl, 0, 10);
                } else if (i == 2) {
                    SSL.setVerify(this.ssl, 2, 10);
                } else {
                    if (i != 3) {
                        throw new Error(clientAuth.toString());
                    }
                    SSL.setVerify(this.ssl, 1, 10);
                }
            }
            this.clientAuth = clientAuth;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035 A[PHI: r0 r5
  0x0035: PHI (r0v15 int) = (r0v7 int), (r0v9 int), (r0v11 int), (r0v13 int), (r0v16 int) binds: [B:45:0x0070, B:38:0x0061, B:31:0x0052, B:24:0x0043, B:17:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r5v13 int) = (r5v9 int), (r5v10 int), (r5v11 int), (r5v12 int), (r5v0 int) binds: [B:45:0x0070, B:38:0x0061, B:31:0x0052, B:24:0x0043, B:17:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    private void setEnabledProtocols0(String[] strArr, boolean z) {
        ObjectUtil.checkNotNullWithIAE(strArr, "protocols");
        int length = OPENSSL_OP_NO_PROTOCOLS.length;
        int length2 = strArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= length2) {
                synchronized (this) {
                    if (z) {
                        this.explicitlyEnabledProtocols = strArr;
                    }
                    if (isDestroyed()) {
                        throw new IllegalStateException("failed to enable protocols: " + Arrays.asList(strArr));
                    }
                    SSL.clearOptions(this.ssl, SSL.SSL_OP_NO_SSLv2 | SSL.SSL_OP_NO_SSLv3 | SSL.SSL_OP_NO_TLSv1 | SSL.SSL_OP_NO_TLSv1_1 | SSL.SSL_OP_NO_TLSv1_2 | SSL.SSL_OP_NO_TLSv1_3);
                    int i4 = 0;
                    for (int i5 = 0; i5 < length; i5++) {
                        i4 |= OPENSSL_OP_NO_PROTOCOLS[i5];
                    }
                    int i6 = i2 + 1;
                    while (true) {
                        int[] iArr = OPENSSL_OP_NO_PROTOCOLS;
                        if (i6 < iArr.length) {
                            i4 |= iArr[i6];
                            i6++;
                        } else {
                            SSL.setOptions(this.ssl, i4);
                        }
                    }
                }
                return;
            }
            String str = strArr[i];
            if (!OpenSsl.SUPPORTED_PROTOCOLS_SET.contains(str)) {
                throw new IllegalArgumentException("Protocol " + str + " is not supported.");
            }
            if (str.equals(SslProtocols.SSL_v2)) {
                if (length > 0) {
                    length = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
            } else if (str.equals(SslProtocols.SSL_v3)) {
                if (length > 1) {
                    length = 1;
                }
                if (i2 < 1) {
                    i2 = i3;
                }
            } else if (str.equals(SslProtocols.TLS_v1)) {
                i3 = 2;
                if (length > 2) {
                    length = 2;
                }
                if (i2 < 2) {
                    i2 = i3;
                }
            } else if (str.equals(SslProtocols.TLS_v1_1)) {
                i3 = 3;
                if (length > 3) {
                    length = 3;
                }
                if (i2 < 3) {
                    i2 = i3;
                }
            } else if (str.equals(SslProtocols.TLS_v1_2)) {
                i3 = 4;
                if (length > 4) {
                    length = 4;
                }
                if (i2 < 4) {
                    i2 = i3;
                }
            } else if (str.equals(SslProtocols.TLS_v1_3)) {
                i3 = 5;
                if (length > 5) {
                    length = 5;
                }
                if (i2 < 5) {
                    i2 = i3;
                }
            }
            i++;
        }
    }

    private SSLException shutdownWithError(String str, int i) {
        return shutdownWithError(str, i, SSL.getLastErrorNumber());
    }

    private ByteBuffer[] singleDstBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleDstBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private ByteBuffer[] singleSrcBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleSrcBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private int sslPending0() {
        if (this.handshakeState != HandshakeState.FINISHED) {
            return 0;
        }
        return SSL.sslPending(this.ssl);
    }

    private SSLEngineResult sslReadErrorResult(int i, int i2, int i3, int i4) throws SSLException {
        if (needWrapAgain(i2)) {
            return new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_WRAP, i3, i4);
        }
        throw shutdownWithError("SSL_read", i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String toJavaCipherSuite(String str) {
        if (str == null) {
            return null;
        }
        return CipherSuiteConverter.toJava(str, toJavaCipherSuitePrefix(SSL.getVersion(this.ssl)));
    }

    private static String toJavaCipherSuitePrefix(String str) {
        char cCharAt = 0;
        if (str != null && !str.isEmpty()) {
            cCharAt = str.charAt(0);
        }
        if (cCharAt != 'S') {
            return cCharAt != 'T' ? LanConstants.OPERATOR_UNKNOWN : "TLS";
        }
        return "SSL";
    }

    private ByteBuf writeEncryptedData(ByteBuffer byteBuffer, int i) throws Throwable {
        int iPosition = byteBuffer.position();
        if (byteBuffer.isDirect()) {
            SSL.bioSetByteBuffer(this.networkBIO, bufferAddress(byteBuffer) + ((long) iPosition), i, false);
            return null;
        }
        ByteBuf byteBufDirectBuffer = this.alloc.directBuffer(i);
        try {
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(iPosition + i);
            byteBufDirectBuffer.writeBytes(byteBuffer);
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            SSL.bioSetByteBuffer(this.networkBIO, OpenSsl.memoryAddress(byteBufDirectBuffer), i, false);
            return byteBufDirectBuffer;
        } catch (Throwable th) {
            byteBufDirectBuffer.release();
            PlatformDependent.throwException(th);
            return null;
        }
    }

    private int writePlaintextData(ByteBuffer byteBuffer, int i) {
        int iWriteToSSL;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        if (byteBuffer.isDirect()) {
            iWriteToSSL = SSL.writeToSSL(this.ssl, bufferAddress(byteBuffer) + ((long) iPosition), i);
            if (iWriteToSSL > 0) {
                byteBuffer.position(iPosition + iWriteToSSL);
            }
        } else {
            ByteBuf byteBufDirectBuffer = this.alloc.directBuffer(i);
            try {
                byteBuffer.limit(iPosition + i);
                byteBufDirectBuffer.setBytes(0, byteBuffer);
                byteBuffer.limit(iLimit);
                iWriteToSSL = SSL.writeToSSL(this.ssl, OpenSsl.memoryAddress(byteBufDirectBuffer), i);
                if (iWriteToSSL > 0) {
                    byteBuffer.position(iPosition + iWriteToSSL);
                } else {
                    byteBuffer.position(iPosition);
                }
            } finally {
                byteBufDirectBuffer.release();
            }
        }
        return iWriteToSSL;
    }

    public final synchronized String[] authMethods() {
        if (isDestroyed()) {
            return EmptyArrays.EMPTY_STRINGS;
        }
        return SSL.authenticationMethods(this.ssl);
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void beginHandshake() throws SSLException {
        int i = AnonymousClass3.$SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState[this.handshakeState.ordinal()];
        if (i == 1) {
            this.handshakeState = HandshakeState.STARTED_EXPLICITLY;
            if (handshake() == SSLEngineResult.HandshakeStatus.NEED_TASK) {
                this.needTask = true;
            }
            calculateMaxWrapOverhead();
        } else {
            if (i == 2) {
                throw new SSLException("renegotiation unsupported");
            }
            if (i == 3) {
                checkEngineClosed();
                this.handshakeState = HandshakeState.STARTED_EXPLICITLY;
                calculateMaxWrapOverhead();
            } else if (i != 4) {
                throw new Error();
            }
        }
    }

    public synchronized void bioSetFd(int i) {
        if (!isDestroyed()) {
            SSL.bioSetFd(this.ssl, i);
        }
    }

    public final int calculateMaxLengthForWrap(int i, int i2) {
        return (int) Math.min(this.maxWrapBufferSize, ((long) i) + (((long) this.maxWrapOverhead) * ((long) i2)));
    }

    public final boolean checkSniHostnameMatch(byte[] bArr) {
        return Java8SslUtils.checkSniHostnameMatch(this.matchers, bArr);
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void closeInbound() throws SSLException {
        if (this.isInboundDone) {
            return;
        }
        this.isInboundDone = true;
        if (isOutboundDone()) {
            shutdown();
        }
        if (this.handshakeState != HandshakeState.NOT_STARTED && !this.receivedShutdown) {
            throw new SSLException("Inbound closed before receiving peer's close_notify: possible truncation attack?");
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void closeOutbound() {
        if (this.outboundClosed) {
            return;
        }
        this.outboundClosed = true;
        if (this.handshakeState == HandshakeState.NOT_STARTED || isDestroyed()) {
            shutdown();
        } else if ((SSL.getShutdown(this.ssl) & SSL.SSL_SENT_SHUTDOWN) != SSL.SSL_SENT_SHUTDOWN) {
            doSSLShutdown();
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public String getApplicationProtocol() {
        return this.applicationProtocol;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized Runnable getDelegatedTask() {
        if (isDestroyed()) {
            return null;
        }
        AsyncTask task = SSL.getTask(this.ssl);
        if (task == null) {
            return null;
        }
        if (task instanceof AsyncTask) {
            return new AsyncTaskDecorator(task);
        }
        return new TaskDecorator(task);
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getEnableSessionCreation() {
        return false;
    }

    @Override // javax.net.ssl.SSLEngine
    public final String[] getEnabledCipherSuites() {
        String[] strArr;
        boolean z;
        synchronized (this) {
            if (isDestroyed()) {
                return EmptyArrays.EMPTY_STRINGS;
            }
            String[] ciphers = SSL.getCiphers(this.ssl);
            if (isProtocolEnabled(SSL.getOptions(this.ssl), SSL.SSL_OP_NO_TLSv1_3, SslProtocols.TLS_v1_3)) {
                strArr = OpenSsl.EXTRA_SUPPORTED_TLS_1_3_CIPHERS;
                z = true;
            } else {
                strArr = EmptyArrays.EMPTY_STRINGS;
                z = false;
            }
            if (ciphers == null) {
                return EmptyArrays.EMPTY_STRINGS;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(ciphers.length + strArr.length);
            synchronized (this) {
                for (int i = 0; i < ciphers.length; i++) {
                    String javaCipherSuite = toJavaCipherSuite(ciphers[i]);
                    if (javaCipherSuite == null) {
                        javaCipherSuite = ciphers[i];
                    }
                    if ((z && OpenSsl.isTlsv13Supported()) || !SslUtils.isTLSv13Cipher(javaCipherSuite)) {
                        linkedHashSet.add(javaCipherSuite);
                    }
                }
                Collections.addAll(linkedHashSet, strArr);
            }
            return (String[]) linkedHashSet.toArray(new String[0]);
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final String[] getEnabledProtocols() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(SslProtocols.SSL_v2_HELLO);
        synchronized (this) {
            if (isDestroyed()) {
                return (String[]) arrayList.toArray(new String[0]);
            }
            int options = SSL.getOptions(this.ssl);
            if (isProtocolEnabled(options, SSL.SSL_OP_NO_TLSv1, SslProtocols.TLS_v1)) {
                arrayList.add(SslProtocols.TLS_v1);
            }
            if (isProtocolEnabled(options, SSL.SSL_OP_NO_TLSv1_1, SslProtocols.TLS_v1_1)) {
                arrayList.add(SslProtocols.TLS_v1_1);
            }
            if (isProtocolEnabled(options, SSL.SSL_OP_NO_TLSv1_2, SslProtocols.TLS_v1_2)) {
                arrayList.add(SslProtocols.TLS_v1_2);
            }
            if (isProtocolEnabled(options, SSL.SSL_OP_NO_TLSv1_3, SslProtocols.TLS_v1_3)) {
                arrayList.add(SslProtocols.TLS_v1_3);
            }
            if (isProtocolEnabled(options, SSL.SSL_OP_NO_SSLv2, SslProtocols.SSL_v2)) {
                arrayList.add(SslProtocols.SSL_v2);
            }
            if (isProtocolEnabled(options, SSL.SSL_OP_NO_SSLv3, SslProtocols.SSL_v3)) {
                arrayList.add(SslProtocols.SSL_v3);
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public String getHandshakeApplicationProtocol() {
        return this.applicationProtocol;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLSession getHandshakeSession() {
        int i = AnonymousClass3.$SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState[this.handshakeState.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        return this.session;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        if (!needPendingStatus()) {
            return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        }
        if (this.needTask) {
            return SSLEngineResult.HandshakeStatus.NEED_TASK;
        }
        return pendingStatus(SSL.bioLengthNonApplication(this.networkBIO));
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getNeedClientAuth() {
        return this.clientAuth == ClientAuth.REQUIRE;
    }

    @Override // io.netty.handler.ssl.ApplicationProtocolAccessor
    public String getNegotiatedApplicationProtocol() {
        return this.applicationProtocol;
    }

    public byte[] getOcspResponse() {
        if (!this.enableOcsp) {
            throw new IllegalStateException("OCSP stapling is not enabled");
        }
        if (!this.clientMode) {
            throw new IllegalStateException("Not a client SSLEngine");
        }
        synchronized (this) {
            if (isDestroyed()) {
                return EmptyArrays.EMPTY_BYTES;
            }
            return SSL.getOcspResponse(this.ssl);
        }
    }

    @Override // javax.net.ssl.SSLEngine
    @SuppressJava6Requirement(reason = "Usage guarded by java version check")
    public final synchronized SSLParameters getSSLParameters() {
        SSLParameters sSLParameters;
        sSLParameters = super.getSSLParameters();
        int iJavaVersion = PlatformDependent.javaVersion();
        if (iJavaVersion >= 7) {
            sSLParameters.setEndpointIdentificationAlgorithm(this.endPointIdentificationAlgorithm);
            Java7SslParametersUtils.setAlgorithmConstraints(sSLParameters, this.algorithmConstraints);
            if (iJavaVersion >= 8) {
                List<String> list = this.sniHostNames;
                if (list != null) {
                    Java8SslUtils.setSniHostNames(sSLParameters, list);
                }
                if (!isDestroyed()) {
                    Java8SslUtils.setUseCipherSuitesOrder(sSLParameters, (SSL.getOptions(this.ssl) & SSL.SSL_OP_CIPHER_SERVER_PREFERENCE) != 0);
                }
                Java8SslUtils.setSNIMatchers(sSLParameters, this.matchers);
            }
        }
        return sSLParameters;
    }

    @Override // javax.net.ssl.SSLEngine
    public final SSLSession getSession() {
        return this.session;
    }

    @Override // javax.net.ssl.SSLEngine
    public final String[] getSupportedCipherSuites() {
        return (String[]) OpenSsl.AVAILABLE_CIPHER_SUITES.toArray(new String[0]);
    }

    @Override // javax.net.ssl.SSLEngine
    public final String[] getSupportedProtocols() {
        return (String[]) OpenSsl.SUPPORTED_PROTOCOLS_SET.toArray(new String[0]);
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getUseClientMode() {
        return this.clientMode;
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getWantClientAuth() {
        return this.clientAuth == ClientAuth.OPTIONAL;
    }

    public final void initHandshakeException(Throwable th) {
        Throwable th2 = this.pendingException;
        if (th2 == null) {
            this.pendingException = th;
        } else {
            ThrowableUtil.addSuppressed(th2, th);
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized boolean isInboundDone() {
        return this.isInboundDone;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    @Override // javax.net.ssl.SSLEngine
    public final synchronized boolean isOutboundDone() {
        boolean z;
        if (this.outboundClosed) {
            long j2 = this.networkBIO;
            if (j2 == 0 || SSL.bioLengthNonApplication(j2) == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z;
    }

    public synchronized boolean isSessionReused() {
        if (isDestroyed()) {
            return false;
        }
        return SSL.isSessionReused(this.ssl);
    }

    public final synchronized SecretKeySpec masterKey() {
        if (isDestroyed()) {
            return null;
        }
        return new SecretKeySpec(SSL.getMasterKey(this.ssl), "AES");
    }

    public final synchronized int maxEncryptedPacketLength() {
        return maxEncryptedPacketLength0();
    }

    public final int maxEncryptedPacketLength0() {
        return this.maxWrapOverhead + MAX_PLAINTEXT_LENGTH;
    }

    public final synchronized int maxWrapOverhead() {
        return this.maxWrapOverhead;
    }

    @Override // io.netty.util.ReferenceCounted
    public final int refCnt() {
        return this.refCnt.refCnt();
    }

    @Override // io.netty.util.ReferenceCounted
    public final boolean release() {
        return this.refCnt.release();
    }

    @Override // io.netty.util.ReferenceCounted
    public final ReferenceCounted retain() {
        this.refCnt.retain();
        return this;
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setEnableSessionCreation(boolean z) {
        if (z) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setEnabledCipherSuites(String[] strArr) {
        ObjectUtil.checkNotNull(strArr, "cipherSuites");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        CipherSuiteConverter.convertToCipherStrings(Arrays.asList(strArr), sb, sb2, OpenSsl.isBoringSSL());
        String string = sb.toString();
        String string2 = sb2.toString();
        if (!OpenSsl.isTlsv13Supported() && !string2.isEmpty()) {
            throw new IllegalArgumentException("TLSv1.3 is not supported by this java version.");
        }
        synchronized (this) {
            if (isDestroyed()) {
                throw new IllegalStateException("failed to enable cipher suites: " + string);
            }
            try {
                SSL.setCipherSuites(this.ssl, string, false);
                if (OpenSsl.isTlsv13Supported()) {
                    SSL.setCipherSuites(this.ssl, OpenSsl.checkTls13Ciphers(logger, string2), true);
                }
                HashSet hashSet = new HashSet(this.explicitlyEnabledProtocols.length);
                Collections.addAll(hashSet, this.explicitlyEnabledProtocols);
                if (string.isEmpty()) {
                    hashSet.remove(SslProtocols.TLS_v1);
                    hashSet.remove(SslProtocols.TLS_v1_1);
                    hashSet.remove(SslProtocols.TLS_v1_2);
                    hashSet.remove(SslProtocols.SSL_v3);
                    hashSet.remove(SslProtocols.SSL_v2);
                    hashSet.remove(SslProtocols.SSL_v2_HELLO);
                }
                if (string2.isEmpty()) {
                    hashSet.remove(SslProtocols.TLS_v1_3);
                }
                setEnabledProtocols0((String[]) hashSet.toArray(EmptyArrays.EMPTY_STRINGS), false);
            } catch (Exception e2) {
                throw new IllegalStateException("failed to enable cipher suites: " + string, e2);
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setEnabledProtocols(String[] strArr) {
        setEnabledProtocols0(strArr, true);
    }

    public final boolean setKeyMaterial(OpenSslKeyMaterial openSslKeyMaterial) throws Exception {
        synchronized (this) {
            if (isDestroyed()) {
                return false;
            }
            SSL.setKeyMaterial(this.ssl, openSslKeyMaterial.certificateChainAddress(), openSslKeyMaterial.privateKeyAddress());
            this.session.setLocalCertificate(openSslKeyMaterial.certificateChain());
            return true;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setNeedClientAuth(boolean z) {
        setClientAuth(z ? ClientAuth.REQUIRE : ClientAuth.NONE);
    }

    public void setOcspResponse(byte[] bArr) {
        if (!this.enableOcsp) {
            throw new IllegalStateException("OCSP stapling is not enabled");
        }
        if (this.clientMode) {
            throw new IllegalStateException("Not a server SSLEngine");
        }
        synchronized (this) {
            if (!isDestroyed()) {
                SSL.setOcspResponse(this.ssl, bArr);
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    @SuppressJava6Requirement(reason = "Usage guarded by java version check")
    public final synchronized void setSSLParameters(SSLParameters sSLParameters) {
        int iJavaVersion = PlatformDependent.javaVersion();
        if (iJavaVersion >= 7) {
            if (sSLParameters.getAlgorithmConstraints() != null) {
                throw new IllegalArgumentException("AlgorithmConstraints are not supported.");
            }
            boolean zIsDestroyed = isDestroyed();
            if (iJavaVersion >= 8) {
                if (!zIsDestroyed) {
                    if (this.clientMode) {
                        List<String> sniHostNames = Java8SslUtils.getSniHostNames(sSLParameters);
                        Iterator<String> it = sniHostNames.iterator();
                        while (it.hasNext()) {
                            SSL.setTlsExtHostName(this.ssl, it.next());
                        }
                        this.sniHostNames = sniHostNames;
                    }
                    if (Java8SslUtils.getUseCipherSuitesOrder(sSLParameters)) {
                        SSL.setOptions(this.ssl, SSL.SSL_OP_CIPHER_SERVER_PREFERENCE);
                    } else {
                        SSL.clearOptions(this.ssl, SSL.SSL_OP_CIPHER_SERVER_PREFERENCE);
                    }
                }
                this.matchers = sSLParameters.getSNIMatchers();
            }
            String endpointIdentificationAlgorithm = sSLParameters.getEndpointIdentificationAlgorithm();
            if (!zIsDestroyed && this.clientMode && isEndPointVerificationEnabled(endpointIdentificationAlgorithm)) {
                SSL.setVerify(this.ssl, 2, -1);
            }
            this.endPointIdentificationAlgorithm = endpointIdentificationAlgorithm;
            this.algorithmConstraints = sSLParameters.getAlgorithmConstraints();
        }
        super.setSSLParameters(sSLParameters);
    }

    public final void setSessionId(OpenSslSessionId openSslSessionId) {
        this.session.setSessionId(openSslSessionId);
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setUseClientMode(boolean z) {
        if (z != this.clientMode) {
            throw new UnsupportedOperationException();
        }
    }

    public final synchronized void setVerify(int i, int i2) {
        if (!isDestroyed()) {
            SSL.setVerify(this.ssl, i, i2);
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setWantClientAuth(boolean z) {
        setClientAuth(z ? ClientAuth.OPTIONAL : ClientAuth.NONE);
    }

    public final synchronized void shutdown() {
        if (!this.destroyed) {
            this.destroyed = true;
            OpenSslEngineMap openSslEngineMap = this.engineMap;
            if (openSslEngineMap != null) {
                openSslEngineMap.remove(this.ssl);
            }
            SSL.freeSSL(this.ssl);
            this.networkBIO = 0L;
            this.ssl = 0L;
            this.outboundClosed = true;
            this.isInboundDone = true;
        }
        SSL.clearError();
    }

    public final synchronized int sslPending() {
        return sslPending0();
    }

    public final synchronized long sslPointer() {
        return this.ssl;
    }

    @Override // io.netty.util.ReferenceCounted
    public final ReferenceCounted touch() {
        this.refCnt.touch();
        return this;
    }

    public final SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer[] byteBufferArr2, int i3, int i4) throws SSLException {
        int i5;
        int i6;
        int i7;
        int i8;
        int iMin;
        int iMin2;
        ByteBuf byteBufWriteEncryptedData;
        int i9 = i;
        int i10 = i3;
        ObjectUtil.checkNotNullWithIAE(byteBufferArr, "srcs");
        if (i9 >= byteBufferArr.length || (i5 = i9 + i2) > byteBufferArr.length) {
            throw new IndexOutOfBoundsException("offset: " + i9 + ", length: " + i2 + " (expected: offset <= offset + length <= srcs.length (" + byteBufferArr.length + "))");
        }
        ObjectUtil.checkNotNullWithIAE(byteBufferArr2, "dsts");
        if (i10 >= byteBufferArr2.length || (i6 = i10 + i4) > byteBufferArr2.length) {
            throw new IndexOutOfBoundsException("offset: " + i10 + ", length: " + i4 + " (expected: offset <= offset + length <= dsts.length (" + byteBufferArr2.length + "))");
        }
        long jRemaining = 0;
        for (int i11 = i10; i11 < i6; i11++) {
            ByteBuffer byteBuffer = (ByteBuffer) ObjectUtil.checkNotNullArrayParam(byteBufferArr2[i11], i11, "dsts");
            if (byteBuffer.isReadOnly()) {
                throw new ReadOnlyBufferException();
            }
            jRemaining += (long) byteBuffer.remaining();
        }
        long jRemaining2 = 0;
        for (int i12 = i9; i12 < i5; i12++) {
            jRemaining2 += (long) ((ByteBuffer) ObjectUtil.checkNotNullArrayParam(byteBufferArr[i12], i12, "srcs")).remaining();
        }
        synchronized (this) {
            if (isInboundDone()) {
                return (isOutboundDone() || isDestroyed()) ? CLOSED_NOT_HANDSHAKING : NEED_WRAP_CLOSED;
            }
            SSLEngineResult.HandshakeStatus handshakeStatusHandshake = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
            HandshakeState handshakeState = this.handshakeState;
            if (handshakeState != HandshakeState.FINISHED) {
                if (handshakeState != HandshakeState.STARTED_EXPLICITLY) {
                    this.handshakeState = HandshakeState.STARTED_IMPLICITLY;
                }
                handshakeStatusHandshake = handshake();
                if (handshakeStatusHandshake == SSLEngineResult.HandshakeStatus.NEED_TASK) {
                    return newResult(handshakeStatusHandshake, 0, 0);
                }
                if (handshakeStatusHandshake == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                    return NEED_WRAP_OK;
                }
                if (this.isInboundDone) {
                    return NEED_WRAP_CLOSED;
                }
            }
            int iSslPending0 = sslPending0();
            if (!this.jdkCompatibilityMode) {
                i7 = iSslPending0;
                if (jRemaining2 == 0 && i7 <= 0) {
                    return newResultMayFinishHandshake(SSLEngineResult.Status.BUFFER_UNDERFLOW, handshakeStatusHandshake, 0, 0);
                }
                if (jRemaining == 0) {
                    return newResultMayFinishHandshake(SSLEngineResult.Status.BUFFER_OVERFLOW, handshakeStatusHandshake, 0, 0);
                }
                i8 = 0;
                iMin = (int) Math.min(2147483647L, jRemaining2);
            } else {
                if (jRemaining2 < 5) {
                    return newResultMayFinishHandshake(SSLEngineResult.Status.BUFFER_UNDERFLOW, handshakeStatusHandshake, 0, 0);
                }
                iMin = SslUtils.getEncryptedPacketLength(byteBufferArr, i);
                if (iMin == -2) {
                    throw new NotSslRecordException("not an SSL/TLS record");
                }
                int i13 = iMin - 5;
                i7 = iSslPending0;
                if (i13 > jRemaining) {
                    if (i13 <= MAX_RECORD_SIZE) {
                        this.session.tryExpandApplicationBufferSize(i13);
                        return newResultMayFinishHandshake(SSLEngineResult.Status.BUFFER_OVERFLOW, handshakeStatusHandshake, 0, 0);
                    }
                    throw new SSLException("Illegal packet length: " + i13 + " > " + this.session.getApplicationBufferSize());
                }
                if (jRemaining2 < iMin) {
                    return newResultMayFinishHandshake(SSLEngineResult.Status.BUFFER_UNDERFLOW, handshakeStatusHandshake, 0, 0);
                }
                i8 = 0;
            }
            int iSslPending1 = i7;
            int i14 = i8;
            loop2: while (true) {
                try {
                    ByteBuffer byteBuffer2 = byteBufferArr[i9];
                    int iRemaining = byteBuffer2.remaining();
                    if (iRemaining != 0) {
                        iMin2 = Math.min(iMin, iRemaining);
                        try {
                            byteBufWriteEncryptedData = writeEncryptedData(byteBuffer2, iMin2);
                        } catch (SSLException e2) {
                            SSLEngineResult sSLEngineResultHandleUnwrapException = handleUnwrapException(i8, i14, e2);
                            SSL.bioClearByteBuffer(this.networkBIO);
                            rejectRemoteInitiatedRenegotiation();
                            return sSLEngineResultHandleUnwrapException;
                        }
                    } else if (iSslPending1 <= 0) {
                        i9++;
                        if (i9 >= i5) {
                            break;
                        }
                    } else {
                        iMin2 = SSL.bioLengthByteBuffer(this.networkBIO);
                        byteBufWriteEncryptedData = null;
                    }
                    while (true) {
                        try {
                            ByteBuffer byteBuffer3 = byteBufferArr2[i10];
                            if (!byteBuffer3.hasRemaining()) {
                                i10++;
                                if (i10 >= i6) {
                                    if (byteBufWriteEncryptedData == null) {
                                        break loop2;
                                    }
                                    byteBufWriteEncryptedData.release();
                                    break loop2;
                                }
                            } else {
                                int i15 = iSslPending1;
                                try {
                                    int plaintextData = readPlaintextData(byteBuffer3);
                                    SSLEngineResult.HandshakeStatus handshakeStatus = handshakeStatusHandshake;
                                    int i16 = i5;
                                    int iBioLengthByteBuffer = iMin2 - SSL.bioLengthByteBuffer(this.networkBIO);
                                    i8 += iBioLengthByteBuffer;
                                    iMin -= iBioLengthByteBuffer;
                                    iMin2 -= iBioLengthByteBuffer;
                                    byteBuffer2.position(byteBuffer2.position() + iBioLengthByteBuffer);
                                    if (plaintextData > 0) {
                                        i14 += plaintextData;
                                        if (byteBuffer3.hasRemaining()) {
                                            handshakeStatusHandshake = handshakeStatus;
                                            if (iMin != 0 && !this.jdkCompatibilityMode) {
                                                iSslPending1 = i15;
                                            }
                                            if (byteBufWriteEncryptedData == null) {
                                                break loop2;
                                            }
                                            byteBufWriteEncryptedData.release();
                                            break loop2;
                                        }
                                        iSslPending1 = sslPending0();
                                        i10++;
                                        if (i10 >= i6) {
                                            SSLEngineResult sSLEngineResultNewResult = iSslPending1 > 0 ? newResult(SSLEngineResult.Status.BUFFER_OVERFLOW, handshakeStatus, i8, i14) : newResultMayFinishHandshake(isInboundDone() ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK, handshakeStatus, i8, i14);
                                            if (byteBufWriteEncryptedData != null) {
                                                byteBufWriteEncryptedData.release();
                                            }
                                            SSL.bioClearByteBuffer(this.networkBIO);
                                            rejectRemoteInitiatedRenegotiation();
                                            return sSLEngineResultNewResult;
                                        }
                                        handshakeStatusHandshake = handshakeStatus;
                                        i5 = i16;
                                    } else {
                                        handshakeStatusHandshake = handshakeStatus;
                                        int error = SSL.getError(this.ssl, plaintextData);
                                        if (error != SSL.SSL_ERROR_WANT_READ && error != SSL.SSL_ERROR_WANT_WRITE) {
                                            if (error == SSL.SSL_ERROR_ZERO_RETURN) {
                                                if (!this.receivedShutdown) {
                                                    closeAll();
                                                }
                                                SSLEngineResult sSLEngineResultNewResultMayFinishHandshake = newResultMayFinishHandshake(isInboundDone() ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK, handshakeStatusHandshake, i8, i14);
                                                if (byteBufWriteEncryptedData != null) {
                                                    byteBufWriteEncryptedData.release();
                                                }
                                                SSL.bioClearByteBuffer(this.networkBIO);
                                                rejectRemoteInitiatedRenegotiation();
                                                return sSLEngineResultNewResultMayFinishHandshake;
                                            }
                                            if (error != SSL.SSL_ERROR_WANT_X509_LOOKUP && error != SSL.SSL_ERROR_WANT_CERTIFICATE_VERIFY && error != SSL.SSL_ERROR_WANT_PRIVATE_KEY_OPERATION) {
                                                SSLEngineResult sSLEngineResultSslReadErrorResult = sslReadErrorResult(error, SSL.getLastErrorNumber(), i8, i14);
                                                if (byteBufWriteEncryptedData != null) {
                                                    byteBufWriteEncryptedData.release();
                                                }
                                                SSL.bioClearByteBuffer(this.networkBIO);
                                                rejectRemoteInitiatedRenegotiation();
                                                return sSLEngineResultSslReadErrorResult;
                                            }
                                            SSLEngineResult sSLEngineResultNewResult2 = newResult(isInboundDone() ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_TASK, i8, i14);
                                            if (byteBufWriteEncryptedData != null) {
                                                byteBufWriteEncryptedData.release();
                                            }
                                            SSL.bioClearByteBuffer(this.networkBIO);
                                            rejectRemoteInitiatedRenegotiation();
                                            return sSLEngineResultNewResult2;
                                        }
                                        i9++;
                                        i5 = i16;
                                        if (i9 >= i5) {
                                            if (byteBufWriteEncryptedData == null) {
                                                break;
                                            }
                                            byteBufWriteEncryptedData.release();
                                            break loop2;
                                        }
                                        if (byteBufWriteEncryptedData != null) {
                                            byteBufWriteEncryptedData.release();
                                        }
                                        iSslPending1 = i15;
                                    }
                                } catch (SSLException e3) {
                                    SSLEngineResult sSLEngineResultHandleUnwrapException2 = handleUnwrapException(i8, i14, e3);
                                    if (byteBufWriteEncryptedData != null) {
                                        byteBufWriteEncryptedData.release();
                                    }
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    rejectRemoteInitiatedRenegotiation();
                                    return sSLEngineResultHandleUnwrapException2;
                                }
                            }
                        } catch (Throwable th) {
                            if (byteBufWriteEncryptedData != null) {
                                byteBufWriteEncryptedData.release();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    SSL.bioClearByteBuffer(this.networkBIO);
                    rejectRemoteInitiatedRenegotiation();
                    throw th2;
                }
            }
            SSL.bioClearByteBuffer(this.networkBIO);
            rejectRemoteInitiatedRenegotiation();
            if (!this.receivedShutdown && (SSL.getShutdown(this.ssl) & SSL.SSL_RECEIVED_SHUTDOWN) == SSL.SSL_RECEIVED_SHUTDOWN) {
                closeAll();
            }
            return newResultMayFinishHandshake(isInboundDone() ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK, handshakeStatusHandshake, i8, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:291:0x051e A[Catch: all -> 0x0536, TryCatch #4 {, blocks: (B:9:0x0019, B:11:0x001f, B:13:0x0025, B:16:0x002c, B:18:0x0031, B:17:0x002f, B:31:0x008a, B:33:0x0091, B:35:0x00a8, B:34:0x009a, B:40:0x00b8, B:42:0x00bf, B:44:0x00d6, B:43:0x00c8, B:49:0x00e4, B:51:0x00eb, B:53:0x0102, B:52:0x00f4, B:58:0x0111, B:60:0x0118, B:62:0x012f, B:61:0x0121, B:289:0x0517, B:291:0x051e, B:293:0x0535, B:292:0x052d, B:78:0x015d, B:80:0x0164, B:82:0x017b, B:81:0x016d, B:85:0x0185, B:87:0x018c, B:89:0x01a3, B:88:0x0195, B:94:0x01b9, B:96:0x01c0, B:98:0x01d7, B:97:0x01c9, B:107:0x01f6, B:109:0x01fd, B:111:0x0214, B:110:0x0206, B:119:0x0225, B:121:0x022c, B:123:0x0243, B:122:0x0235, B:129:0x0253, B:131:0x025a, B:133:0x0271, B:132:0x0263, B:155:0x02c4, B:157:0x02cb, B:159:0x02e2, B:158:0x02d4, B:164:0x02f0, B:166:0x02f7, B:168:0x030e, B:167:0x0300, B:201:0x038b, B:203:0x0392, B:205:0x03a9, B:204:0x039b, B:220:0x03e4, B:222:0x03eb, B:224:0x0402, B:223:0x03f4, B:227:0x040a, B:229:0x0411, B:231:0x0428, B:230:0x041a, B:236:0x0434, B:238:0x043b, B:240:0x0452, B:239:0x0444, B:246:0x0460, B:248:0x0467, B:250:0x047e, B:249:0x0470, B:253:0x0486, B:255:0x048d, B:257:0x04a4, B:256:0x0496, B:269:0x04c0, B:271:0x04c7, B:273:0x04de, B:272:0x04d0, B:182:0x0344, B:184:0x034b, B:186:0x0362, B:185:0x0354, B:276:0x04e4, B:278:0x04eb, B:280:0x0502, B:279:0x04f4), top: B:304:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:292:0x052d A[Catch: all -> 0x0536, TryCatch #4 {, blocks: (B:9:0x0019, B:11:0x001f, B:13:0x0025, B:16:0x002c, B:18:0x0031, B:17:0x002f, B:31:0x008a, B:33:0x0091, B:35:0x00a8, B:34:0x009a, B:40:0x00b8, B:42:0x00bf, B:44:0x00d6, B:43:0x00c8, B:49:0x00e4, B:51:0x00eb, B:53:0x0102, B:52:0x00f4, B:58:0x0111, B:60:0x0118, B:62:0x012f, B:61:0x0121, B:289:0x0517, B:291:0x051e, B:293:0x0535, B:292:0x052d, B:78:0x015d, B:80:0x0164, B:82:0x017b, B:81:0x016d, B:85:0x0185, B:87:0x018c, B:89:0x01a3, B:88:0x0195, B:94:0x01b9, B:96:0x01c0, B:98:0x01d7, B:97:0x01c9, B:107:0x01f6, B:109:0x01fd, B:111:0x0214, B:110:0x0206, B:119:0x0225, B:121:0x022c, B:123:0x0243, B:122:0x0235, B:129:0x0253, B:131:0x025a, B:133:0x0271, B:132:0x0263, B:155:0x02c4, B:157:0x02cb, B:159:0x02e2, B:158:0x02d4, B:164:0x02f0, B:166:0x02f7, B:168:0x030e, B:167:0x0300, B:201:0x038b, B:203:0x0392, B:205:0x03a9, B:204:0x039b, B:220:0x03e4, B:222:0x03eb, B:224:0x0402, B:223:0x03f4, B:227:0x040a, B:229:0x0411, B:231:0x0428, B:230:0x041a, B:236:0x0434, B:238:0x043b, B:240:0x0452, B:239:0x0444, B:246:0x0460, B:248:0x0467, B:250:0x047e, B:249:0x0470, B:253:0x0486, B:255:0x048d, B:257:0x04a4, B:256:0x0496, B:269:0x04c0, B:271:0x04c7, B:273:0x04de, B:272:0x04d0, B:182:0x0344, B:184:0x034b, B:186:0x0362, B:185:0x0354, B:276:0x04e4, B:278:0x04eb, B:280:0x0502, B:279:0x04f4), top: B:304:0x0019 }] */
    @Override // javax.net.ssl.SSLEngine
    public final SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer byteBuffer) throws SSLException {
        int i3;
        ByteBuf byteBufDirectBuffer;
        SSLEngineResult.HandshakeStatus handshakeStatusHandshake;
        int iBioLengthByteBuffer;
        int iWritePlaintextData;
        ObjectUtil.checkNotNullWithIAE(byteBufferArr, "srcs");
        ObjectUtil.checkNotNullWithIAE(byteBuffer, "dst");
        if (i >= byteBufferArr.length || (i3 = i + i2) > byteBufferArr.length) {
            throw new IndexOutOfBoundsException("offset: " + i + ", length: " + i2 + " (expected: offset <= offset + length <= srcs.length (" + byteBufferArr.length + "))");
        }
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        synchronized (this) {
            if (isOutboundDone()) {
                return (isInboundDone() || isDestroyed()) ? CLOSED_NOT_HANDSHAKING : NEED_UNWRAP_CLOSED;
            }
            ByteBuf byteBuf = null;
            int i4 = 0;
            int i5 = 0;
            i4 = 0;
            try {
                if (byteBuffer.isDirect()) {
                    SSL.bioSetByteBuffer(this.networkBIO, bufferAddress(byteBuffer) + ((long) byteBuffer.position()), byteBuffer.remaining(), true);
                    byteBufDirectBuffer = null;
                } else {
                    byteBufDirectBuffer = this.alloc.directBuffer(byteBuffer.remaining());
                    try {
                        SSL.bioSetByteBuffer(this.networkBIO, OpenSsl.memoryAddress(byteBufDirectBuffer), byteBufDirectBuffer.writableBytes(), true);
                    } catch (Throwable th) {
                        th = th;
                        byteBuf = byteBufDirectBuffer;
                        SSL.bioClearByteBuffer(this.networkBIO);
                        if (byteBuf != null) {
                            byteBuffer.put(byteBuf.internalNioBuffer(byteBuf.readerIndex(), i4));
                            byteBuf.release();
                        } else {
                            byteBuffer.position(byteBuffer.position() + i4);
                        }
                        throw th;
                    }
                }
                int iBioLengthByteBuffer2 = SSL.bioLengthByteBuffer(this.networkBIO);
                try {
                    try {
                        if (this.outboundClosed) {
                            if (!isBytesAvailableEnoughForWrap(byteBuffer.remaining(), 2, 1)) {
                                SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, getHandshakeStatus(), 0, 0);
                                SSL.bioClearByteBuffer(this.networkBIO);
                                if (byteBufDirectBuffer == null) {
                                    byteBuffer.position(byteBuffer.position() + 0);
                                } else {
                                    byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), 0));
                                    byteBufDirectBuffer.release();
                                }
                                return sSLEngineResult;
                            }
                            int iBioFlushByteBuffer = SSL.bioFlushByteBuffer(this.networkBIO);
                            if (iBioFlushByteBuffer <= 0) {
                                SSLEngineResult sSLEngineResultNewResultMayFinishHandshake = newResultMayFinishHandshake(SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
                                SSL.bioClearByteBuffer(this.networkBIO);
                                if (byteBufDirectBuffer == null) {
                                    byteBuffer.position(byteBuffer.position() + iBioFlushByteBuffer);
                                } else {
                                    byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioFlushByteBuffer));
                                    byteBufDirectBuffer.release();
                                }
                                return sSLEngineResultNewResultMayFinishHandshake;
                            }
                            if (!doSSLShutdown()) {
                                SSLEngineResult sSLEngineResultNewResultMayFinishHandshake2 = newResultMayFinishHandshake(SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, iBioFlushByteBuffer);
                                SSL.bioClearByteBuffer(this.networkBIO);
                                if (byteBufDirectBuffer == null) {
                                    byteBuffer.position(byteBuffer.position() + iBioFlushByteBuffer);
                                } else {
                                    byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioFlushByteBuffer));
                                    byteBufDirectBuffer.release();
                                }
                                return sSLEngineResultNewResultMayFinishHandshake2;
                            }
                            int iBioLengthByteBuffer3 = iBioLengthByteBuffer2 - SSL.bioLengthByteBuffer(this.networkBIO);
                            SSLEngineResult sSLEngineResultNewResultMayFinishHandshake3 = newResultMayFinishHandshake(SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, iBioLengthByteBuffer3);
                            SSL.bioClearByteBuffer(this.networkBIO);
                            if (byteBufDirectBuffer == null) {
                                byteBuffer.position(byteBuffer.position() + iBioLengthByteBuffer3);
                            } else {
                                byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioLengthByteBuffer3));
                                byteBufDirectBuffer.release();
                            }
                            return sSLEngineResultNewResultMayFinishHandshake3;
                        }
                        SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                        HandshakeState handshakeState = this.handshakeState;
                        if (handshakeState != HandshakeState.FINISHED) {
                            if (handshakeState != HandshakeState.STARTED_EXPLICITLY) {
                                this.handshakeState = HandshakeState.STARTED_IMPLICITLY;
                            }
                            int iBioFlushByteBuffer2 = SSL.bioFlushByteBuffer(this.networkBIO);
                            try {
                                if (this.pendingException != null) {
                                    if (iBioFlushByteBuffer2 > 0) {
                                        SSLEngineResult sSLEngineResultNewResult = newResult(SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, iBioFlushByteBuffer2);
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (byteBufDirectBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + iBioFlushByteBuffer2);
                                        } else {
                                            byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioFlushByteBuffer2));
                                            byteBufDirectBuffer.release();
                                        }
                                        return sSLEngineResultNewResult;
                                    }
                                    SSLEngineResult sSLEngineResultNewResult2 = newResult(handshakeException(), 0, 0);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (byteBufDirectBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + iBioFlushByteBuffer2);
                                    } else {
                                        byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioFlushByteBuffer2));
                                        byteBufDirectBuffer.release();
                                    }
                                    return sSLEngineResultNewResult2;
                                }
                                handshakeStatusHandshake = handshake();
                                iBioLengthByteBuffer = iBioLengthByteBuffer2 - SSL.bioLengthByteBuffer(this.networkBIO);
                                if (handshakeStatusHandshake == SSLEngineResult.HandshakeStatus.NEED_TASK) {
                                    SSLEngineResult sSLEngineResultNewResult3 = newResult(handshakeStatusHandshake, 0, iBioLengthByteBuffer);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (byteBufDirectBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + iBioLengthByteBuffer);
                                    } else {
                                        byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioLengthByteBuffer));
                                        byteBufDirectBuffer.release();
                                    }
                                    return sSLEngineResultNewResult3;
                                }
                                if (iBioLengthByteBuffer > 0) {
                                    SSLEngineResult.HandshakeStatus handshakeStatus2 = SSLEngineResult.HandshakeStatus.FINISHED;
                                    if (handshakeStatusHandshake != handshakeStatus2) {
                                        handshakeStatus2 = iBioLengthByteBuffer == iBioLengthByteBuffer2 ? SSLEngineResult.HandshakeStatus.NEED_WRAP : getHandshakeStatus(SSL.bioLengthNonApplication(this.networkBIO));
                                    }
                                    SSLEngineResult sSLEngineResultNewResult4 = newResult(mayFinishHandshake(handshakeStatus2), 0, iBioLengthByteBuffer);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (byteBufDirectBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + iBioLengthByteBuffer);
                                    } else {
                                        byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioLengthByteBuffer));
                                        byteBufDirectBuffer.release();
                                    }
                                    return sSLEngineResultNewResult4;
                                }
                                if (handshakeStatusHandshake == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                                    SSLEngineResult sSLEngineResult2 = isOutboundDone() ? NEED_UNWRAP_CLOSED : NEED_UNWRAP_OK;
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (byteBufDirectBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + iBioLengthByteBuffer);
                                    } else {
                                        byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioLengthByteBuffer));
                                        byteBufDirectBuffer.release();
                                    }
                                    return sSLEngineResult2;
                                }
                                if (this.outboundClosed) {
                                    int iBioFlushByteBuffer3 = SSL.bioFlushByteBuffer(this.networkBIO);
                                    SSLEngineResult sSLEngineResultNewResultMayFinishHandshake4 = newResultMayFinishHandshake(handshakeStatusHandshake, 0, iBioFlushByteBuffer3);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (byteBufDirectBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + iBioFlushByteBuffer3);
                                    } else {
                                        byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioFlushByteBuffer3));
                                        byteBufDirectBuffer.release();
                                    }
                                    return sSLEngineResultNewResultMayFinishHandshake4;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                byteBuf = byteBufDirectBuffer;
                                i4 = iBioFlushByteBuffer2;
                                SSL.bioClearByteBuffer(this.networkBIO);
                                if (byteBuf != null) {
                                    byteBuffer.put(byteBuf.internalNioBuffer(byteBuf.readerIndex(), i4));
                                    byteBuf.release();
                                } else {
                                    byteBuffer.position(byteBuffer.position() + i4);
                                }
                                throw th;
                            }
                        } else {
                            handshakeStatusHandshake = handshakeStatus;
                            iBioLengthByteBuffer = 0;
                        }
                        if (this.jdkCompatibilityMode) {
                            int iRemaining = 0;
                            for (int i6 = i; i6 < i3; i6++) {
                                ByteBuffer byteBuffer2 = byteBufferArr[i6];
                                if (byteBuffer2 == null) {
                                    throw new IllegalArgumentException("srcs[" + i6 + "] is null");
                                }
                                int i7 = MAX_PLAINTEXT_LENGTH;
                                if (iRemaining != i7 && ((iRemaining = iRemaining + byteBuffer2.remaining()) > i7 || iRemaining < 0)) {
                                    iRemaining = i7;
                                }
                            }
                            if (!isBytesAvailableEnoughForWrap(byteBuffer.remaining(), iRemaining, 1)) {
                                SSLEngineResult sSLEngineResult3 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, getHandshakeStatus(), 0, 0);
                                SSL.bioClearByteBuffer(this.networkBIO);
                                if (byteBufDirectBuffer == null) {
                                    byteBuffer.position(byteBuffer.position() + iBioLengthByteBuffer);
                                } else {
                                    byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioLengthByteBuffer));
                                    byteBufDirectBuffer.release();
                                }
                                return sSLEngineResult3;
                            }
                        }
                        int iBioFlushByteBuffer4 = SSL.bioFlushByteBuffer(this.networkBIO);
                        if (iBioFlushByteBuffer4 > 0) {
                            SSLEngineResult sSLEngineResultNewResultMayFinishHandshake5 = newResultMayFinishHandshake(handshakeStatusHandshake, 0, iBioFlushByteBuffer4);
                            SSL.bioClearByteBuffer(this.networkBIO);
                            if (byteBufDirectBuffer == null) {
                                byteBuffer.position(byteBuffer.position() + iBioFlushByteBuffer4);
                            } else {
                                byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioFlushByteBuffer4));
                                byteBufDirectBuffer.release();
                            }
                            return sSLEngineResultNewResultMayFinishHandshake5;
                        }
                        Throwable th3 = this.pendingException;
                        if (th3 != null) {
                            this.pendingException = null;
                            shutdown();
                            throw new SSLException(th3);
                        }
                        while (i < i3) {
                            ByteBuffer byteBuffer3 = byteBufferArr[i];
                            int iRemaining2 = byteBuffer3.remaining();
                            if (iRemaining2 != 0) {
                                if (this.jdkCompatibilityMode) {
                                    iWritePlaintextData = writePlaintextData(byteBuffer3, Math.min(iRemaining2, MAX_PLAINTEXT_LENGTH - i5));
                                } else {
                                    int iRemaining3 = (byteBuffer.remaining() - iBioFlushByteBuffer4) - this.maxWrapOverhead;
                                    if (iRemaining3 <= 0) {
                                        SSLEngineResult sSLEngineResult4 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, getHandshakeStatus(), i5, iBioFlushByteBuffer4);
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (byteBufDirectBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + iBioFlushByteBuffer4);
                                        } else {
                                            byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioFlushByteBuffer4));
                                            byteBufDirectBuffer.release();
                                        }
                                        return sSLEngineResult4;
                                    }
                                    iWritePlaintextData = writePlaintextData(byteBuffer3, Math.min(iRemaining2, iRemaining3));
                                }
                                int iBioLengthByteBuffer4 = SSL.bioLengthByteBuffer(this.networkBIO);
                                int i8 = (iBioLengthByteBuffer2 - iBioLengthByteBuffer4) + iBioFlushByteBuffer4;
                                if (iWritePlaintextData > 0) {
                                    i5 += iWritePlaintextData;
                                    if (!this.jdkCompatibilityMode && i8 != byteBuffer.remaining()) {
                                        iBioFlushByteBuffer4 = i8;
                                        iBioLengthByteBuffer2 = iBioLengthByteBuffer4;
                                    }
                                    SSLEngineResult sSLEngineResultNewResultMayFinishHandshake6 = newResultMayFinishHandshake(handshakeStatusHandshake, i5, i8);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (byteBufDirectBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + i8);
                                    } else {
                                        byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), i8));
                                        byteBufDirectBuffer.release();
                                    }
                                    return sSLEngineResultNewResultMayFinishHandshake6;
                                }
                                int error = SSL.getError(this.ssl, iWritePlaintextData);
                                if (error == SSL.SSL_ERROR_ZERO_RETURN) {
                                    if (this.receivedShutdown) {
                                        SSLEngineResult sSLEngineResultNewResult5 = newResult(SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, i5, i8);
                                        SSL.bioClearByteBuffer(this.networkBIO);
                                        if (byteBufDirectBuffer == null) {
                                            byteBuffer.position(byteBuffer.position() + i8);
                                        } else {
                                            byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), i8));
                                            byteBufDirectBuffer.release();
                                        }
                                        return sSLEngineResultNewResult5;
                                    }
                                    closeAll();
                                    int iBioLengthByteBuffer5 = i8 + (iBioLengthByteBuffer4 - SSL.bioLengthByteBuffer(this.networkBIO));
                                    SSLEngineResult.HandshakeStatus handshakeStatus3 = SSLEngineResult.HandshakeStatus.FINISHED;
                                    if (handshakeStatusHandshake != handshakeStatus3) {
                                        handshakeStatus3 = iBioLengthByteBuffer5 == byteBuffer.remaining() ? SSLEngineResult.HandshakeStatus.NEED_WRAP : getHandshakeStatus(SSL.bioLengthNonApplication(this.networkBIO));
                                    }
                                    SSLEngineResult sSLEngineResultNewResult6 = newResult(mayFinishHandshake(handshakeStatus3), i5, iBioLengthByteBuffer5);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (byteBufDirectBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + iBioLengthByteBuffer5);
                                    } else {
                                        byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioLengthByteBuffer5));
                                        byteBufDirectBuffer.release();
                                    }
                                    return sSLEngineResultNewResult6;
                                }
                                if (error == SSL.SSL_ERROR_WANT_READ) {
                                    SSLEngineResult sSLEngineResultNewResult7 = newResult(SSLEngineResult.HandshakeStatus.NEED_UNWRAP, i5, i8);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (byteBufDirectBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + i8);
                                    } else {
                                        byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), i8));
                                        byteBufDirectBuffer.release();
                                    }
                                    return sSLEngineResultNewResult7;
                                }
                                if (error != SSL.SSL_ERROR_WANT_WRITE) {
                                    if (error != SSL.SSL_ERROR_WANT_X509_LOOKUP && error != SSL.SSL_ERROR_WANT_CERTIFICATE_VERIFY && error != SSL.SSL_ERROR_WANT_PRIVATE_KEY_OPERATION) {
                                        throw shutdownWithError("SSL_write", error);
                                    }
                                    SSLEngineResult sSLEngineResultNewResult8 = newResult(SSLEngineResult.HandshakeStatus.NEED_TASK, i5, i8);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (byteBufDirectBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + i8);
                                    } else {
                                        byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), i8));
                                        byteBufDirectBuffer.release();
                                    }
                                    return sSLEngineResultNewResult8;
                                }
                                if (i8 > 0) {
                                    SSLEngineResult sSLEngineResultNewResult9 = newResult(SSLEngineResult.HandshakeStatus.NEED_WRAP, i5, i8);
                                    SSL.bioClearByteBuffer(this.networkBIO);
                                    if (byteBufDirectBuffer == null) {
                                        byteBuffer.position(byteBuffer.position() + i8);
                                    } else {
                                        byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), i8));
                                        byteBufDirectBuffer.release();
                                    }
                                    return sSLEngineResultNewResult9;
                                }
                                SSLEngineResult sSLEngineResultNewResult10 = newResult(SSLEngineResult.Status.BUFFER_OVERFLOW, handshakeStatusHandshake, i5, i8);
                                SSL.bioClearByteBuffer(this.networkBIO);
                                if (byteBufDirectBuffer == null) {
                                    byteBuffer.position(byteBuffer.position() + i8);
                                } else {
                                    byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), i8));
                                    byteBufDirectBuffer.release();
                                }
                                return sSLEngineResultNewResult10;
                            }
                            i++;
                        }
                        SSLEngineResult sSLEngineResultNewResultMayFinishHandshake7 = newResultMayFinishHandshake(handshakeStatusHandshake, i5, iBioFlushByteBuffer4);
                        SSL.bioClearByteBuffer(this.networkBIO);
                        if (byteBufDirectBuffer == null) {
                            byteBuffer.position(byteBuffer.position() + iBioFlushByteBuffer4);
                        } else {
                            byteBuffer.put(byteBufDirectBuffer.internalNioBuffer(byteBufDirectBuffer.readerIndex(), iBioFlushByteBuffer4));
                            byteBufDirectBuffer.release();
                        }
                        return sSLEngineResultNewResultMayFinishHandshake7;
                    } catch (Throwable th4) {
                        th = th4;
                        byteBuf = byteBufDirectBuffer;
                        i4 = iBioLengthByteBuffer2;
                    }
                } catch (Throwable th5) {
                    i4 = byteBufferArr;
                    th = th5;
                    byteBuf = byteBufDirectBuffer;
                    SSL.bioClearByteBuffer(this.networkBIO);
                    if (byteBuf != null) {
                        byteBuffer.put(byteBuf.internalNioBuffer(byteBuf.readerIndex(), i4));
                        byteBuf.release();
                    } else {
                        byteBuffer.position(byteBuffer.position() + i4);
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    private SSLEngineResult newResult(SSLEngineResult.Status status, SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i2) {
        if (!isOutboundDone()) {
            if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_TASK) {
                this.needTask = true;
            }
            return new SSLEngineResult(status, handshakeStatus, i, i2);
        }
        if (isInboundDone()) {
            handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
            shutdown();
        }
        return new SSLEngineResult(SSLEngineResult.Status.CLOSED, handshakeStatus, i, i2);
    }

    private SSLEngineResult newResultMayFinishHandshake(SSLEngineResult.Status status, SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i2) throws SSLException {
        return newResult(status, mayFinishHandshake(handshakeStatus, i, i2), i, i2);
    }

    private SSLException shutdownWithError(String str, int i, int i2) {
        String errorString = SSL.getErrorString(i2);
        InternalLogger internalLogger = logger;
        if (internalLogger.isDebugEnabled()) {
            internalLogger.debug("{} failed with {}: OpenSSL error: {} {}", str, Integer.valueOf(i), Integer.valueOf(i2), errorString);
        }
        shutdown();
        if (this.handshakeState == HandshakeState.FINISHED) {
            return new SSLException(errorString);
        }
        SSLHandshakeException sSLHandshakeException = new SSLHandshakeException(errorString);
        Throwable th = this.pendingException;
        if (th != null) {
            sSLHandshakeException.initCause(th);
            this.pendingException = null;
        }
        return sSLHandshakeException;
    }

    @Override // io.netty.util.ReferenceCounted
    public final boolean release(int i) {
        return this.refCnt.release(i);
    }

    @Override // io.netty.util.ReferenceCounted
    public final ReferenceCounted retain(int i) {
        this.refCnt.retain(i);
        return this;
    }

    @Override // io.netty.util.ReferenceCounted
    public final ReferenceCounted touch(Object obj) {
        this.refCnt.touch(obj);
        return this;
    }

    private SSLEngineResult.HandshakeStatus mayFinishHandshake(SSLEngineResult.HandshakeStatus handshakeStatus) throws SSLException {
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            if (this.handshakeState != HandshakeState.FINISHED) {
                return handshake();
            }
            if (!isDestroyed() && SSL.bioLengthNonApplication(this.networkBIO) > 0) {
                return SSLEngineResult.HandshakeStatus.NEED_WRAP;
            }
        }
        return handshakeStatus;
    }

    private SSLEngineResult.HandshakeStatus getHandshakeStatus(int i) {
        if (needPendingStatus()) {
            if (this.needTask) {
                return SSLEngineResult.HandshakeStatus.NEED_TASK;
            }
            return pendingStatus(i);
        }
        return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    private String selectApplicationProtocol(List<String> list, ApplicationProtocolConfig.SelectedListenerFailureBehavior selectedListenerFailureBehavior, String str) throws SSLException {
        if (selectedListenerFailureBehavior == ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT) {
            return str;
        }
        int size = list.size();
        if (list.contains(str)) {
            return str;
        }
        if (selectedListenerFailureBehavior == ApplicationProtocolConfig.SelectedListenerFailureBehavior.CHOOSE_MY_LAST_PROTOCOL) {
            return list.get(size - 1);
        }
        throw new SSLException("unknown protocol " + str);
    }

    public final SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) throws SSLException {
        return unwrap(byteBufferArr, 0, byteBufferArr.length, byteBufferArr2, 0, byteBufferArr2.length);
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) throws SSLException {
        SSLEngineResult sSLEngineResultUnwrap;
        try {
            sSLEngineResultUnwrap = unwrap(singleSrcBuffer(byteBuffer), 0, 1, byteBufferArr, i, i2);
            resetSingleSrcBuffer();
        } catch (Throwable th) {
            resetSingleSrcBuffer();
            throw th;
        }
        return sSLEngineResultUnwrap;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws SSLException {
        SSLEngineResult sSLEngineResultUnwrap;
        try {
            sSLEngineResultUnwrap = unwrap(singleSrcBuffer(byteBuffer), singleDstBuffer(byteBuffer2));
            resetSingleSrcBuffer();
            resetSingleDstBuffer();
        } catch (Throwable th) {
            resetSingleSrcBuffer();
            resetSingleDstBuffer();
            throw th;
        }
        return sSLEngineResultUnwrap;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) throws SSLException {
        SSLEngineResult sSLEngineResultUnwrap;
        try {
            sSLEngineResultUnwrap = unwrap(singleSrcBuffer(byteBuffer), byteBufferArr);
            resetSingleSrcBuffer();
        } catch (Throwable th) {
            resetSingleSrcBuffer();
            throw th;
        }
        return sSLEngineResultUnwrap;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws SSLException {
        SSLEngineResult sSLEngineResultWrap;
        try {
            sSLEngineResultWrap = wrap(singleSrcBuffer(byteBuffer), byteBuffer2);
            resetSingleSrcBuffer();
        } catch (Throwable th) {
            resetSingleSrcBuffer();
            throw th;
        }
        return sSLEngineResultWrap;
    }
}
