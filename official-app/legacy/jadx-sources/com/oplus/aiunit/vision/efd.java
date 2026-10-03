package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.taphttp.core.HeyCenter;
import com.heytap.okhttp.extension.DnsStub;
import io.protostuff.MapSchema;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.CertificatePinner;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 ¢\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\r£\u0001B\u0014\b\u0000\u0012\u0007\u0010\u009e\u0001\u001a\u00020\u0012¢\u0006\u0006\b\u009f\u0001\u0010 \u0001B\u000b\b\u0016¢\u0006\u0006\b\u009f\u0001\u0010¡\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0017\u0010\u0019\u001a\u00020\u00148G¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8G¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010%\u001a\u0004\u0018\u00010 8G¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8G¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020'0&8G¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u0017\u00105\u001a\u0002008G¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010:\u001a\u00020\b8G¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010?\u001a\u00020;8G¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b\u0015\u0010>R\u0017\u0010B\u001a\u00020\b8G¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bA\u00109R\u0017\u0010E\u001a\u00020\b8G¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bD\u00109R\u0017\u0010J\u001a\u00020F8G¢\u0006\f\n\u0004\b\u001d\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010O\u001a\u0004\u0018\u00010K8G¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b\u001b\u0010NR\u0017\u0010T\u001a\u00020P8G¢\u0006\f\n\u0004\bH\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010Y\u001a\u0004\u0018\u00010U8G¢\u0006\f\n\u0004\b\u0017\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010^\u001a\u00020Z8G¢\u0006\f\n\u0004\bR\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010`\u001a\u00020;8G¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b_\u0010>R\u0017\u0010e\u001a\u00020a8G¢\u0006\f\n\u0004\b3\u0010b\u001a\u0004\bc\u0010dR\u0016\u0010h\u001a\u0004\u0018\u00010f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010gR\u0019\u0010m\u001a\u0004\u0018\u00010i8G¢\u0006\f\n\u0004\bD\u0010j\u001a\u0004\bk\u0010lR\u001d\u0010p\u001a\b\u0012\u0004\u0012\u00020n0&8G¢\u0006\f\n\u0004\bo\u0010)\u001a\u0004\bL\u0010+R\u001d\u0010s\u001a\b\u0012\u0004\u0012\u00020q0&8G¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\br\u0010+R\u0017\u0010x\u001a\u00020t8G¢\u0006\f\n\u0004\b#\u0010u\u001a\u0004\bv\u0010wR\u0017\u0010|\u001a\u00020y8G¢\u0006\f\n\u0004\bv\u0010z\u001a\u0004\b@\u0010{R\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8G¢\u0006\f\n\u0004\b*\u0010~\u001a\u0004\b-\u0010\u007fR\u001b\u0010\u0084\u0001\u001a\u00030\u0081\u00018G¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0013\u001a\u0005\b!\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0081\u00018G¢\u0006\r\n\u0004\b.\u0010\u0013\u001a\u0005\bC\u0010\u0083\u0001R\u001b\u0010\u0087\u0001\u001a\u00030\u0081\u00018G¢\u0006\u000e\n\u0004\b\u0013\u0010\u0013\u001a\u0006\b\u0086\u0001\u0010\u0083\u0001R\u001b\u0010\u0089\u0001\u001a\u00030\u0081\u00018G¢\u0006\u000e\n\u0004\b\u0011\u0010\u0013\u001a\u0006\b\u0088\u0001\u0010\u0083\u0001R\u001c\u0010\u008b\u0001\u001a\u00030\u0081\u00018G¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010\u0013\u001a\u0006\b\u008a\u0001\u0010\u0083\u0001R\u001b\u0010\u008e\u0001\u001a\u00030\u008c\u00018G¢\u0006\u000e\n\u0004\br\u0010\u0011\u001a\u0006\b\u0082\u0001\u0010\u008d\u0001R\u001b\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0006¢\u0006\u000e\n\u0005\bW\u0010\u0090\u0001\u001a\u0005\bo\u0010\u0091\u0001R\u0019\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b_\u0010\u0094\u0001R\u0016\u0010\u0097\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\\\u0010\u0096\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0099\u0001R\u0014\u0010\u009d\u0001\u001a\u00020f8G¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006¤\u0001"}, d2 = {"Lcom/oplus/aiunit/vision/efd;", "", "Lcom/oplus/aiunit/vision/wr2$a;", "", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/j6i;", "C", "", "x", "Lokhttp3/Request;", "request", "Lcom/oplus/aiunit/vision/wr2;", "a", "Lcom/oplus/aiunit/vision/wnl;", "listener", "Lcom/oplus/aiunit/vision/unl;", "J", "Lcom/oplus/aiunit/vision/efd$a;", "I", "Lcom/oplus/aiunit/vision/ou5;", "i", "Lcom/oplus/aiunit/vision/ou5;", "v", "()Lcom/oplus/aiunit/vision/ou5;", "dispatcher", "Lcom/oplus/aiunit/vision/py3;", "j", "Lcom/oplus/aiunit/vision/py3;", "s", "()Lcom/oplus/aiunit/vision/py3;", "connectionPool", "Lcom/heytap/nearx/taphttp/core/HeyCenter;", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/nearx/taphttp/core/HeyCenter;", "D", "()Lcom/heytap/nearx/taphttp/core/HeyCenter;", "heyCenter", "", "Lcom/oplus/aiunit/vision/jea;", LogFieldKey.LEVEL_KEY, "Ljava/util/List;", UserInfo.SEX_FEMALE, "()Ljava/util/List;", "interceptors", LogFieldKey.MESSAGE_KEY, "H", "networkInterceptors", "Lcom/oplus/aiunit/vision/wr6$c;", "n", "Lcom/oplus/aiunit/vision/wr6$c;", "y", "()Lcom/oplus/aiunit/vision/wr6$c;", "eventListenerFactory", "o", "Z", "Q", "()Z", "retryOnConnectionFailure", "Lcom/oplus/aiunit/vision/en0;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/oplus/aiunit/vision/en0;", "()Lcom/oplus/aiunit/vision/en0;", "authenticator", "q", "z", "followRedirects", "r", "A", "followSslRedirects", "Lcom/oplus/aiunit/vision/qa4;", "Lcom/oplus/aiunit/vision/qa4;", "u", "()Lcom/oplus/aiunit/vision/qa4;", "cookieJar", "Lcom/oplus/aiunit/vision/to2;", "t", "Lcom/oplus/aiunit/vision/to2;", "()Lcom/oplus/aiunit/vision/to2;", "cache", "Lcom/oplus/aiunit/vision/qx5;", "Lcom/oplus/aiunit/vision/qx5;", "w", "()Lcom/oplus/aiunit/vision/qx5;", "dns", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "M", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "O", "()Ljava/net/ProxySelector;", "proxySelector", "N", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "R", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Lcom/oplus/aiunit/vision/oz3;", c8l.KEY_B, "connectionSpecs", "Lokhttp3/Protocol;", "L", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", ExifInterface.LONGITUDE_EAST, "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "Lokhttp3/CertificatePinner;", "()Lokhttp3/CertificatePinner;", "certificatePinner", "Lcom/oplus/aiunit/vision/d53;", "Lcom/oplus/aiunit/vision/d53;", "()Lcom/oplus/aiunit/vision/d53;", "certificateChainCleaner", "", "G", "()I", "callTimeoutMillis", "connectTimeoutMillis", SecureGcmConstants.MESSAGE_KEY, "readTimeoutMillis", "U", "writeTimeoutMillis", "K", "pingIntervalMillis", "", "()J", "minWebSocketMessageToCompress", "Lcom/oplus/aiunit/vision/vyf;", "Lcom/oplus/aiunit/vision/vyf;", "()Lcom/oplus/aiunit/vision/vyf;", "routeDatabase", "Lcom/oplus/aiunit/vision/HeyConfig;", "Lcom/oplus/aiunit/vision/HeyConfig;", "config", "Lcom/oplus/aiunit/vision/j6i;", "speedDispatcher", "Lcom/oplus/aiunit/vision/sx5;", "Lcom/oplus/aiunit/vision/sx5;", "dnsEventListener", "S", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "builder", "<init>", "(Lcom/oplus/aiunit/vision/efd$a;)V", "()V", "Companion", "b", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public class efd implements Cloneable, wr2.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final List<Protocol> Q = sqk.u(Protocol.HTTP_2, Protocol.HTTP_1_1);

    @NotNull
    public static final List<oz3> R;

    @NotNull
    public static final List<oz3> S;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public final X509TrustManager x509TrustManager;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final List<oz3> connectionSpecs;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final List<Protocol> protocols;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final HostnameVerifier hostnameVerifier;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final CertificatePinner certificatePinner;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public final d53 certificateChainCleaner;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final int callTimeoutMillis;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final int connectTimeoutMillis;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final int readTimeoutMillis;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final int writeTimeoutMillis;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final int pingIntervalMillis;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final long minWebSocketMessageToCompress;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public final vyf routeDatabase;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public final HeyConfig config;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final j6i speedDispatcher;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final sx5 dnsEventListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ou5 dispatcher;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final py3 connectionPool;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final HeyCenter heyCenter;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<jea> interceptors;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final List<jea> networkInterceptors;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wr6.c eventListenerFactory;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final boolean retryOnConnectionFailure;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final en0 authenticator;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final boolean followRedirects;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final boolean followSslRedirects;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final qa4 cookieJar;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public final to2 cache;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final qx5 dns;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public final Proxy proxy;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final ProxySelector proxySelector;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final en0 proxyAuthenticator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final SocketFactory socketFactory;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final SSLSocketFactory sslSocketFactoryOrNull;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.efd$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/efd$b;", "", "", "Lokhttp3/Protocol;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/oplus/aiunit/vision/oz3;", "COMPATIBLE_TLS_SPECS", "a", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<oz3> a() {
            return efd.S;
        }

        @NotNull
        public final List<Protocol> b() {
            return efd.Q;
        }
    }

    static {
        oz3 oz3Var = oz3.MODERN_TLS;
        oz3 oz3Var2 = oz3.CLEARTEXT;
        R = sqk.u(oz3Var, oz3Var2);
        S = sqk.u(oz3.COMPATIBLE_TLS, oz3Var2);
    }

    public efd(@NotNull a builder) {
        ProxySelector proxySelector;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.dispatcher = builder.getDispatcher();
        this.connectionPool = builder.getConnectionPool();
        HeyCenter heyCenterD = y79.INSTANCE.d(builder, builder.getConfig());
        this.heyCenter = heyCenterD;
        this.interceptors = sqk.T(builder.C());
        this.networkInterceptors = sqk.T(builder.E());
        this.eventListenerFactory = vr6.INSTANCE.a(builder.getEventListenerFactory(), heyCenterD);
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
        this.authenticator = builder.getAuthenticator();
        this.followRedirects = builder.getFollowRedirects();
        this.followSslRedirects = builder.getFollowSslRedirects();
        this.cookieJar = builder.getCookieJar();
        this.cache = builder.getCache();
        this.dns = DnsStub.INSTANCE.a(builder.getDns(), heyCenterD);
        this.proxy = builder.getProxy();
        if (builder.getProxy() != null) {
            proxySelector = hzc.INSTANCE;
        } else {
            proxySelector = builder.getProxySelector();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = hzc.INSTANCE;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        List<oz3> listU = builder.u();
        this.connectionSpecs = listU;
        this.protocols = builder.G();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        this.connectTimeoutMillis = builder.getConnectTimeout();
        this.readTimeoutMillis = builder.getReadTimeout();
        this.writeTimeoutMillis = builder.getWriteTimeout();
        this.pingIntervalMillis = builder.getPingInterval();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        vyf routeDatabase = builder.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new vyf() : routeDatabase;
        this.config = builder.getConfig();
        this.speedDispatcher = builder.getSpeedDispatcher();
        this.dnsEventListener = new nj9(this);
        List<oz3> list = listU;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((oz3) it.next()).getIsTls()) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        } else if (builder.getSslSocketFactoryOrNull() != null) {
            this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
            d53 certificateChainCleaner = builder.getCertificateChainCleaner();
            Intrinsics.checkNotNull(certificateChainCleaner);
            this.certificateChainCleaner = certificateChainCleaner;
            X509TrustManager x509TrustManagerOrNull = builder.getX509TrustManagerOrNull();
            Intrinsics.checkNotNull(x509TrustManagerOrNull);
            this.x509TrustManager = x509TrustManagerOrNull;
            CertificatePinner certificatePinner = builder.getCertificatePinner();
            Intrinsics.checkNotNull(certificateChainCleaner);
            this.certificatePinner = certificatePinner.e(certificateChainCleaner);
        } else {
            Platform.Companion companion = Platform.INSTANCE;
            X509TrustManager x509TrustManagerPlatformTrustManager = companion.get().platformTrustManager();
            this.x509TrustManager = x509TrustManagerPlatformTrustManager;
            Platform platform = companion.get();
            Intrinsics.checkNotNull(x509TrustManagerPlatformTrustManager);
            this.sslSocketFactoryOrNull = platform.newSslSocketFactory(x509TrustManagerPlatformTrustManager, this.config);
            d53.Companion aVar = d53.INSTANCE;
            Intrinsics.checkNotNull(x509TrustManagerPlatformTrustManager);
            d53 d53VarA = aVar.a(x509TrustManagerPlatformTrustManager);
            this.certificateChainCleaner = d53VarA;
            CertificatePinner certificatePinner2 = builder.getCertificatePinner();
            Intrinsics.checkNotNull(d53VarA);
            this.certificatePinner = certificatePinner2.e(d53VarA);
        }
        T();
    }

    @JvmName(name = "followSslRedirects")
    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    @NotNull
    /* JADX INFO: renamed from: B, reason: from getter */
    public final vyf getRouteDatabase() {
        return this.routeDatabase;
    }

    @NotNull
    /* JADX INFO: renamed from: C, reason: from getter */
    public j6i getSpeedDispatcher() {
        return this.speedDispatcher;
    }

    @JvmName(name = "heyCenter")
    @Nullable
    /* JADX INFO: renamed from: D, reason: from getter */
    public final HeyCenter getHeyCenter() {
        return this.heyCenter;
    }

    @JvmName(name = "hostnameVerifier")
    @NotNull
    /* JADX INFO: renamed from: E, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @JvmName(name = "interceptors")
    @NotNull
    public final List<jea> F() {
        return this.interceptors;
    }

    @JvmName(name = "minWebSocketMessageToCompress")
    /* JADX INFO: renamed from: G, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @JvmName(name = "networkInterceptors")
    @NotNull
    public final List<jea> H() {
        return this.networkInterceptors;
    }

    @NotNull
    public a I() {
        return new a(this);
    }

    @NotNull
    public unl J(@NotNull Request request, @NotNull wnl listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        edf edfVar = new edf(yoj.INSTANCE, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        edfVar.p(this);
        return edfVar;
    }

    @JvmName(name = "pingIntervalMillis")
    /* JADX INFO: renamed from: K, reason: from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @JvmName(name = "protocols")
    @NotNull
    public final List<Protocol> L() {
        return this.protocols;
    }

    @JvmName(name = "proxy")
    @Nullable
    /* JADX INFO: renamed from: M, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @JvmName(name = "proxyAuthenticator")
    @NotNull
    /* JADX INFO: renamed from: N, reason: from getter */
    public final en0 getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @JvmName(name = "proxySelector")
    @NotNull
    /* JADX INFO: renamed from: O, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @JvmName(name = "readTimeoutMillis")
    /* JADX INFO: renamed from: P, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @JvmName(name = "retryOnConnectionFailure")
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @JvmName(name = "socketFactory")
    @NotNull
    /* JADX INFO: renamed from: R, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @JvmName(name = "sslSocketFactory")
    @NotNull
    public final SSLSocketFactory S() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final void T() {
        boolean z;
        List<jea> list = this.interceptors;
        if (list == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        List<jea> list2 = this.networkInterceptors;
        if (list2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list2.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<oz3> list3 = this.connectionSpecs;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (((oz3) it.next()).getIsTls()) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (!z) {
            if (this.sslSocketFactoryOrNull == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.certificateChainCleaner == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.x509TrustManager == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.sslSocketFactoryOrNull == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.certificateChainCleaner == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.x509TrustManager == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!Intrinsics.areEqual(this.certificatePinner, CertificatePinner.DEFAULT)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @JvmName(name = "writeTimeoutMillis")
    /* JADX INFO: renamed from: U, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @JvmName(name = "x509TrustManager")
    @Nullable
    /* JADX INFO: renamed from: V, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    @Override // com.oplus.aiunit.vision.wr2.a
    @NotNull
    public wr2 a(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new dcf(this, request, false);
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    @JvmName(name = "authenticator")
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final en0 getAuthenticator() {
        return this.authenticator;
    }

    @JvmName(name = "cache")
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final to2 getCache() {
        return this.cache;
    }

    @JvmName(name = "callTimeoutMillis")
    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @JvmName(name = "certificateChainCleaner")
    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final d53 getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @JvmName(name = "certificatePinner")
    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @JvmName(name = "connectTimeoutMillis")
    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @JvmName(name = "connectionPool")
    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final py3 getConnectionPool() {
        return this.connectionPool;
    }

    @JvmName(name = "connectionSpecs")
    @NotNull
    public final List<oz3> t() {
        return this.connectionSpecs;
    }

    @JvmName(name = "cookieJar")
    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public final qa4 getCookieJar() {
        return this.cookieJar;
    }

    @JvmName(name = "dispatcher")
    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final ou5 getDispatcher() {
        return this.dispatcher;
    }

    @JvmName(name = "dns")
    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final qx5 getDns() {
        return this.dns;
    }

    public boolean x() {
        j6i j6iVar = this.speedDispatcher;
        return j6iVar != null && j6iVar.getEnableSpeedLimit();
    }

    @JvmName(name = "eventListenerFactory")
    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public final wr6.c getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @JvmName(name = "followRedirects")
    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    @Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÚ\u0001\u0010Û\u0001B\u0014\b\u0010\u0012\u0007\u0010Ü\u0001\u001a\u000209¢\u0006\u0006\bÚ\u0001\u0010Ý\u0001J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u001fJ\u0010\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0007J\u0016\u0010'\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010&\u001a\u00020%J\u0014\u0010+\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,J\u0016\u00103\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201J\u0016\u00104\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201J\u0016\u00105\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201J\u0016\u00106\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201J\u0016\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u00020/2\u0006\u00102\u001a\u000201J\u0006\u0010:\u001a\u000209R\"\u0010A\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR \u0010J\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010G\u001a\u0004\bH\u0010IR \u0010L\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010G\u001a\u0004\bK\u0010IR\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010$\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010\\\u001a\u00020V8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010\u0017\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b]\u0010S\"\u0004\b^\u0010UR\"\u0010a\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010$\u001a\u0004\b_\u0010S\"\u0004\b`\u0010UR\"\u0010h\u001a\u00020b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR$\u0010~\u001a\u0004\u0018\u00010x8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R%\u0010\u0082\u0001\u001a\u00020V8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010W\u001a\u0005\b\u0080\u0001\u0010Y\"\u0005\b\u0081\u0001\u0010[R*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R+\u0010\u0091\u0001\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R+\u0010\u0098\u0001\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R.\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u009a\u0001\u0010G\u001a\u0005\b\u009b\u0001\u0010I\"\u0006\b\u009c\u0001\u0010\u009d\u0001R+\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bC\u0010G\u001a\u0005\b\u009f\u0001\u0010I\"\u0006\b \u0001\u0010\u009d\u0001R(\u0010-\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R)\u0010«\u0001\u001a\u00030¦\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bd\u0010§\u0001\u001a\u0006\b\u008b\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R+\u0010±\u0001\u001a\u0005\u0018\u00010¬\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b=\u0010\u00ad\u0001\u001a\u0006\b\u0084\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R(\u0010¶\u0001\u001a\u00030²\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bo\u0010\u0080\u0001\u001a\u0005\b\u007f\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R)\u0010¸\u0001\u001a\u00030²\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bN\u0010\u0080\u0001\u001a\u0006\b\u009a\u0001\u0010³\u0001\"\u0006\b·\u0001\u0010µ\u0001R)\u0010»\u0001\u001a\u00030²\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b]\u0010\u0080\u0001\u001a\u0006\b¹\u0001\u0010³\u0001\"\u0006\bº\u0001\u0010µ\u0001R)\u0010¾\u0001\u001a\u00030²\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b_\u0010\u0080\u0001\u001a\u0006\b¼\u0001\u0010³\u0001\"\u0006\b½\u0001\u0010µ\u0001R*\u0010Á\u0001\u001a\u00030²\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010\u0080\u0001\u001a\u0006\b¿\u0001\u0010³\u0001\"\u0006\bÀ\u0001\u0010µ\u0001R'\u0010Æ\u0001\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\bH\u0010z\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R,\u0010Í\u0001\u001a\u0005\u0018\u00010Ç\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÂ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R*\u0010Ò\u0001\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bK\u0010Î\u0001\u001a\u0006\b\u0092\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R*\u0010Ù\u0001\u001a\u00030Ó\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¿\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001¨\u0006Þ\u0001"}, d2 = {"Lcom/oplus/aiunit/vision/efd$a;", "", "Lcom/oplus/aiunit/vision/HeyConfig;", "heyConfig", "f", "Lcom/oplus/aiunit/vision/py3;", "connectionPool", b2n.g, "", "Lcom/oplus/aiunit/vision/jea;", ExifInterface.GPS_DIRECTION_TRUE, "interceptor", "a", "b", "Lcom/oplus/aiunit/vision/wr6;", "eventListener", "j", "Lcom/oplus/aiunit/vision/wr6$c;", "eventListenerFactory", MapSchema.FIELD_NAME_KEY, "", "retryOnConnectionFailure", "Y", "followRedirects", LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/to2;", "cache", "d", "Lcom/oplus/aiunit/vision/qx5;", "dns", "i", "Ljava/net/Proxy;", "proxy", ExifInterface.LONGITUDE_WEST, "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Z", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "a0", "", "Lokhttp3/Protocol;", "protocols", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "S", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", MapSchema.FIELD_NAME_ENTRY, b2n.f, "X", "b0", "interval", "U", "Lcom/oplus/aiunit/vision/efd;", "c", "Lcom/oplus/aiunit/vision/ou5;", "Lcom/oplus/aiunit/vision/ou5;", "w", "()Lcom/oplus/aiunit/vision/ou5;", "setDispatcher$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/ou5;)V", "dispatcher", "Lcom/oplus/aiunit/vision/py3;", "t", "()Lcom/oplus/aiunit/vision/py3;", "setConnectionPool$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/py3;)V", "Ljava/util/List;", "C", "()Ljava/util/List;", "interceptors", ExifInterface.LONGITUDE_EAST, "networkInterceptors", "Lcom/oplus/aiunit/vision/wr6$c;", "y", "()Lcom/oplus/aiunit/vision/wr6$c;", "setEventListenerFactory$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/wr6$c;)V", "L", "()Z", "setRetryOnConnectionFailure$okhttp4_extension_release", "(Z)V", "Lcom/oplus/aiunit/vision/en0;", "Lcom/oplus/aiunit/vision/en0;", LogFieldKey.MESSAGE_KEY, "()Lcom/oplus/aiunit/vision/en0;", "setAuthenticator$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/en0;)V", "authenticator", "z", "setFollowRedirects$okhttp4_extension_release", "A", "setFollowSslRedirects$okhttp4_extension_release", "followSslRedirects", "Lcom/oplus/aiunit/vision/qa4;", "Lcom/oplus/aiunit/vision/qa4;", "v", "()Lcom/oplus/aiunit/vision/qa4;", "setCookieJar$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/qa4;)V", "cookieJar", "Lcom/oplus/aiunit/vision/to2;", "n", "()Lcom/oplus/aiunit/vision/to2;", "setCache$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/to2;)V", "Lcom/oplus/aiunit/vision/qx5;", "x", "()Lcom/oplus/aiunit/vision/qx5;", "setDns$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/qx5;)V", "Ljava/net/Proxy;", "H", "()Ljava/net/Proxy;", "setProxy$okhttp4_extension_release", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "J", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp4_extension_release", "(Ljava/net/ProxySelector;)V", "proxySelector", "o", "I", "setProxyAuthenticator$okhttp4_extension_release", "proxyAuthenticator", "Ljavax/net/SocketFactory;", LogFieldKey.PROCESS_NAME_KEY, "Ljavax/net/SocketFactory;", "N", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp4_extension_release", "(Ljavax/net/SocketFactory;)V", "socketFactory", "q", "Ljavax/net/ssl/SSLSocketFactory;", SecureGcmConstants.MESSAGE_KEY, "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp4_extension_release", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "r", "Ljavax/net/ssl/X509TrustManager;", "R", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp4_extension_release", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "Lcom/oplus/aiunit/vision/oz3;", "s", "u", "setConnectionSpecs$okhttp4_extension_release", "(Ljava/util/List;)V", "connectionSpecs", "G", "setProtocols$okhttp4_extension_release", "Ljavax/net/ssl/HostnameVerifier;", c8l.KEY_B, "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp4_extension_release", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/CertificatePinner;", "Lokhttp3/CertificatePinner;", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp4_extension_release", "(Lokhttp3/CertificatePinner;)V", "certificatePinner", "Lcom/oplus/aiunit/vision/d53;", "Lcom/oplus/aiunit/vision/d53;", "()Lcom/oplus/aiunit/vision/d53;", "setCertificateChainCleaner$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/d53;)V", "certificateChainCleaner", "", "()I", "setCallTimeout$okhttp4_extension_release", "(I)V", "callTimeout", "setConnectTimeout$okhttp4_extension_release", "connectTimeout", "K", "setReadTimeout$okhttp4_extension_release", "readTimeout", "Q", "setWriteTimeout$okhttp4_extension_release", "writeTimeout", UserInfo.SEX_FEMALE, "setPingInterval$okhttp4_extension_release", "pingInterval", "D", "()J", "setMinWebSocketMessageToCompress$okhttp4_extension_release", "(J)V", "minWebSocketMessageToCompress", "Lcom/oplus/aiunit/vision/vyf;", "Lcom/oplus/aiunit/vision/vyf;", "M", "()Lcom/oplus/aiunit/vision/vyf;", "setRouteDatabase$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/vyf;)V", "routeDatabase", "Lcom/oplus/aiunit/vision/HeyConfig;", "()Lcom/oplus/aiunit/vision/HeyConfig;", "setConfig$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/HeyConfig;)V", "config", "Lcom/oplus/aiunit/vision/j6i;", "Lcom/oplus/aiunit/vision/j6i;", "O", "()Lcom/oplus/aiunit/vision/j6i;", "setSpeedDispatcher$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/j6i;)V", "speedDispatcher", "<init>", "()V", "okHttpClient", "(Lcom/oplus/aiunit/vision/efd;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        public int writeTimeout;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        public int pingInterval;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        public long minWebSocketMessageToCompress;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        @Nullable
        public vyf routeDatabase;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        @Nullable
        public HeyConfig config;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        @NotNull
        public j6i speedDispatcher;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public ou5 dispatcher;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public py3 connectionPool;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<jea> interceptors;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final List<jea> networkInterceptors;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public wr6.c eventListenerFactory;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public boolean retryOnConnectionFailure;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public en0 authenticator;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public boolean followRedirects;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public boolean followSslRedirects;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public qa4 cookieJar;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public to2 cache;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public qx5 dns;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public Proxy proxy;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public ProxySelector proxySelector;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @NotNull
        public en0 proxyAuthenticator;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @NotNull
        public SocketFactory socketFactory;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @Nullable
        public SSLSocketFactory sslSocketFactoryOrNull;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @Nullable
        public X509TrustManager x509TrustManagerOrNull;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @NotNull
        public List<oz3> connectionSpecs;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @NotNull
        public List<? extends Protocol> protocols;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @NotNull
        public HostnameVerifier hostnameVerifier;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @NotNull
        public CertificatePinner certificatePinner;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @Nullable
        public d53 certificateChainCleaner;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        public int callTimeout;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        public int connectTimeout;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        public int readTimeout;

        public a() {
            this.dispatcher = new ou5();
            this.connectionPool = new py3();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = sqk.e(wr6.NONE);
            this.retryOnConnectionFailure = true;
            en0 en0Var = en0.NONE;
            this.authenticator = en0Var;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = qa4.NO_COOKIES;
            this.dns = qx5.SYSTEM;
            this.proxyAuthenticator = en0Var;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "SocketFactory.getDefault()");
            this.socketFactory = socketFactory;
            Companion companion = efd.INSTANCE;
            this.connectionSpecs = companion.a();
            this.protocols = companion.b();
            this.hostnameVerifier = cfd.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
            this.speedDispatcher = new j6i(new p6i(0.0d, 0.0d, 0L, 0L, 0L, 0L, 63, null));
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        @NotNull
        /* JADX INFO: renamed from: B, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        @NotNull
        public final List<jea> C() {
            return this.interceptors;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        @NotNull
        public final List<jea> E() {
            return this.networkInterceptors;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        @NotNull
        public final List<Protocol> G() {
            return this.protocols;
        }

        @Nullable
        /* JADX INFO: renamed from: H, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        @NotNull
        /* JADX INFO: renamed from: I, reason: from getter */
        public final en0 getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        @Nullable
        /* JADX INFO: renamed from: J, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        /* JADX INFO: renamed from: K, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        @Nullable
        /* JADX INFO: renamed from: M, reason: from getter */
        public final vyf getRouteDatabase() {
            return this.routeDatabase;
        }

        @NotNull
        /* JADX INFO: renamed from: N, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        @NotNull
        /* JADX INFO: renamed from: O, reason: from getter */
        public final j6i getSpeedDispatcher() {
            return this.speedDispatcher;
        }

        @Nullable
        /* JADX INFO: renamed from: P, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        /* JADX INFO: renamed from: Q, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        @Nullable
        /* JADX INFO: renamed from: R, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        @NotNull
        public final a S(@NotNull HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!Intrinsics.areEqual(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        @NotNull
        public final List<jea> T() {
            return this.interceptors;
        }

        @NotNull
        public final a U(long interval, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.pingInterval = sqk.h("interval", interval, unit);
            return this;
        }

        @NotNull
        public final a V(@NotNull List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!(mutableList.contains(protocol) || mutableList.contains(Protocol.HTTP_1_1))) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + mutableList).toString());
            }
            if (!(!mutableList.contains(protocol) || mutableList.size() <= 1)) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + mutableList).toString());
            }
            if (!(!mutableList.contains(Protocol.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + mutableList).toString());
            }
            if (!(!mutableList.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            mutableList.remove(Protocol.SPDY_3);
            if (!Intrinsics.areEqual(mutableList, this.protocols)) {
                this.routeDatabase = null;
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(mutableList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
            this.protocols = listUnmodifiableList;
            return this;
        }

        @NotNull
        public final a W(@Nullable Proxy proxy) {
            if (!Intrinsics.areEqual(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        @NotNull
        public final a X(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.readTimeout = sqk.h("timeout", timeout, unit);
            return this;
        }

        @NotNull
        public final a Y(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        @NotNull
        public final a Z(@NotNull SSLSocketFactory sslSocketFactory) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            if (!Intrinsics.areEqual(sslSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            Platform.Companion companion = Platform.INSTANCE;
            X509TrustManager x509TrustManagerTrustManager = companion.get().trustManager(sslSocketFactory);
            if (x509TrustManagerTrustManager != null) {
                this.x509TrustManagerOrNull = x509TrustManagerTrustManager;
                Platform platform = companion.get();
                X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
                Intrinsics.checkNotNull(x509TrustManager);
                this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + companion.get() + ", sslSocketFactory is " + sslSocketFactory.getClass());
        }

        @NotNull
        public final a a(@NotNull jea interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final a a0(@NotNull SSLSocketFactory sslSocketFactory, @NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if ((!Intrinsics.areEqual(sslSocketFactory, this.sslSocketFactoryOrNull)) || (!Intrinsics.areEqual(trustManager, this.x509TrustManagerOrNull))) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = d53.INSTANCE.a(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        @NotNull
        public final a b(@NotNull jea interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final a b0(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.writeTimeout = sqk.h("timeout", timeout, unit);
            return this;
        }

        @NotNull
        public final efd c() {
            return new efd(this);
        }

        @NotNull
        public final a d(@Nullable to2 cache) {
            this.cache = cache;
            return this;
        }

        @NotNull
        public final a e(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.callTimeout = sqk.h("timeout", timeout, unit);
            return this;
        }

        @NotNull
        public final a f(@Nullable HeyConfig heyConfig) {
            this.config = heyConfig;
            return this;
        }

        @NotNull
        public final a g(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.connectTimeout = sqk.h("timeout", timeout, unit);
            return this;
        }

        @NotNull
        public final a h(@NotNull py3 connectionPool) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            this.connectionPool = connectionPool;
            return this;
        }

        @NotNull
        public final a i(@NotNull qx5 dns) {
            Intrinsics.checkNotNullParameter(dns, "dns");
            if (!Intrinsics.areEqual(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        @NotNull
        public final a j(@NotNull wr6 eventListener) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            this.eventListenerFactory = sqk.e(eventListener);
            return this;
        }

        @NotNull
        public final a k(@NotNull wr6.c eventListenerFactory) {
            Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        @NotNull
        public final a l(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final en0 getAuthenticator() {
            return this.authenticator;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public final to2 getCache() {
            return this.cache;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final d53 getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final CertificatePinner getCertificatePinner() {
            return this.certificatePinner;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final HeyConfig getConfig() {
            return this.config;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        @NotNull
        /* JADX INFO: renamed from: t, reason: from getter */
        public final py3 getConnectionPool() {
            return this.connectionPool;
        }

        @NotNull
        public final List<oz3> u() {
            return this.connectionSpecs;
        }

        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public final qa4 getCookieJar() {
            return this.cookieJar;
        }

        @NotNull
        /* JADX INFO: renamed from: w, reason: from getter */
        public final ou5 getDispatcher() {
            return this.dispatcher;
        }

        @NotNull
        /* JADX INFO: renamed from: x, reason: from getter */
        public final qx5 getDns() {
            return this.dns;
        }

        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public final wr6.c getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull efd okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.getDispatcher();
            this.connectionPool = okHttpClient.getConnectionPool();
            CollectionsKt__MutableCollectionsKt.addAll(this.interceptors, okHttpClient.F());
            CollectionsKt__MutableCollectionsKt.addAll(this.networkInterceptors, okHttpClient.H());
            this.eventListenerFactory = okHttpClient.getEventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.getRetryOnConnectionFailure();
            this.authenticator = okHttpClient.getAuthenticator();
            this.followRedirects = okHttpClient.getFollowRedirects();
            this.followSslRedirects = okHttpClient.getFollowSslRedirects();
            this.cookieJar = okHttpClient.getCookieJar();
            this.cache = okHttpClient.getCache();
            this.dns = okHttpClient.getDns();
            this.proxy = okHttpClient.getProxy();
            this.proxySelector = okHttpClient.getProxySelector();
            this.proxyAuthenticator = okHttpClient.getProxyAuthenticator();
            this.socketFactory = okHttpClient.getSocketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
            this.connectionSpecs = okHttpClient.t();
            this.protocols = okHttpClient.L();
            this.hostnameVerifier = okHttpClient.getHostnameVerifier();
            this.certificatePinner = okHttpClient.getCertificatePinner();
            this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
            this.callTimeout = okHttpClient.getCallTimeoutMillis();
            this.connectTimeout = okHttpClient.getConnectTimeoutMillis();
            this.readTimeout = okHttpClient.getReadTimeoutMillis();
            this.writeTimeout = okHttpClient.getWriteTimeoutMillis();
            this.pingInterval = okHttpClient.getPingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
            this.config = okHttpClient.config;
            this.speedDispatcher = okHttpClient.speedDispatcher;
        }
    }

    public efd() {
        this(new a());
    }
}
