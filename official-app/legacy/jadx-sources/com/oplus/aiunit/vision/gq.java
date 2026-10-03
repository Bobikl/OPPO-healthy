package com.oplus.aiunit.vision;

import com.heytap.common.bean.NetworkType;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.okhttp.extension.request.OKHttpRequestHandler;
import com.heytap.webview.extension.protocol.Const;
import io.protostuff.MapSchema;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.CertificatePinner;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010U\u001a\u00020\n\u0012\u0006\u0010V\u001a\u00020\u0005\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00109\u001a\u000204\u0012\b\u0010?\u001a\u0004\u0018\u00010:\u0012\b\u0010D\u001a\u0004\u0018\u00010@\u0012\b\u0010H\u001a\u0004\u0018\u00010E\u0012\u0006\u0010L\u001a\u00020I\u0012\b\u0010P\u001a\u0004\u0018\u00010M\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020(0'\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020-0'\u0012\u0006\u0010T\u001a\u00020Q¢\u0006\u0004\bW\u0010XB\u0091\u0001\b\u0016\u0012\u0006\u0010U\u001a\u00020\n\u0012\u0006\u0010V\u001a\u00020\u0005\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00109\u001a\u000204\u0012\b\u0010?\u001a\u0004\u0018\u00010:\u0012\b\u0010D\u001a\u0004\u0018\u00010@\u0012\b\u0010H\u001a\u0004\u0018\u00010E\u0012\u0006\u0010L\u001a\u00020I\u0012\b\u0010P\u001a\u0004\u0018\u00010M\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020(0'\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020-0'\u0012\u0006\u0010T\u001a\u00020Q\u0012\b\u0010$\u001a\u0004\u0018\u00010\n\u0012\b\u0010!\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bW\u0010YB\u0093\u0001\b\u0016\u0012\u0006\u0010&\u001a\u00020\f\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00109\u001a\u000204\u0012\b\u0010?\u001a\u0004\u0018\u00010:\u0012\b\u0010D\u001a\u0004\u0018\u00010@\u0012\b\u0010H\u001a\u0004\u0018\u00010E\u0012\u0006\u0010L\u001a\u00020I\u0012\b\u0010P\u001a\u0004\u0018\u00010M\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020(0'\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020-0'\u0012\u0006\u0010T\u001a\u00020Q\u0012\b\u0010$\u001a\u0004\u0018\u00010\n\u0012\b\u0010!\u001a\u0004\u0018\u00010\n\u0012\b\u0010Z\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bW\u0010[J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\f8G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\n8G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u0004\u0018\u00010\n8G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u0017\u0010&\u001a\u00020\f8G¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b%\u0010\u0010R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020(0'8G¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020-0'8G¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b\u0014\u0010+R\u0017\u00103\u001a\u0002008\u0007¢\u0006\f\n\u0004\b*\u00101\u001a\u0004\b\u001b\u00102R\u0017\u00109\u001a\u0002048\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010?\u001a\u0004\u0018\u00010:8\u0007¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010D\u001a\u0004\u0018\u00010@8\u0007¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b.\u0010CR\u0019\u0010H\u001a\u0004\u0018\u00010E8\u0007¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\b\r\u0010GR\u0017\u0010L\u001a\u00020I8\u0007¢\u0006\f\n\u0004\b7\u0010J\u001a\u0004\b;\u0010KR\u0019\u0010P\u001a\u0004\u0018\u00010M8\u0007¢\u0006\f\n\u0004\b=\u0010N\u001a\u0004\b5\u0010OR\u0017\u0010T\u001a\u00020Q8\u0007¢\u0006\f\n\u0004\b\u001d\u0010R\u001a\u0004\bA\u0010S¨\u0006\\"}, d2 = {"Lcom/oplus/aiunit/vision/gq;", "", "other", "", "equals", "", "hashCode", "that", MapSchema.FIELD_NAME_ENTRY, "(Lcom/oplus/aiunit/vision/gq;)Z", "", "toString", "Lcom/oplus/aiunit/vision/uk9;", "a", "Lcom/oplus/aiunit/vision/uk9;", "fullUrl", "()Lcom/oplus/aiunit/vision/uk9;", "setFullUrl", "(Lcom/oplus/aiunit/vision/uk9;)V", "Lcom/heytap/common/bean/NetworkType;", "b", "Lcom/heytap/common/bean/NetworkType;", "f", "()Lcom/heytap/common/bean/NetworkType;", LogFieldKey.LEVEL_KEY, "(Lcom/heytap/common/bean/NetworkType;)V", "network", "c", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "setTargetIp", "(Ljava/lang/String;)V", OKHttpRequestHandler.RSP_TARGET_IP, "d", "setDomainName", "domainName", LogFieldKey.PROCESS_NAME_KEY, "url", "", "Lokhttp3/Protocol;", "Ljava/util/List;", b2n.g, "()Ljava/util/List;", "protocols", "Lcom/oplus/aiunit/vision/oz3;", b2n.f, "connectionSpecs", "Lcom/oplus/aiunit/vision/qx5;", "Lcom/oplus/aiunit/vision/qx5;", "()Lcom/oplus/aiunit/vision/qx5;", "dns", "Ljavax/net/SocketFactory;", "i", "Ljavax/net/SocketFactory;", LogFieldKey.MESSAGE_KEY, "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "j", "Ljavax/net/ssl/SSLSocketFactory;", "n", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", MapSchema.FIELD_NAME_KEY, "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "Lokhttp3/CertificatePinner;", "()Lokhttp3/CertificatePinner;", "certificatePinner", "Lcom/oplus/aiunit/vision/en0;", "Lcom/oplus/aiunit/vision/en0;", "()Lcom/oplus/aiunit/vision/en0;", "proxyAuthenticator", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "()Ljava/net/ProxySelector;", "proxySelector", "uriHost", "uriPort", "<init>", "(Ljava/lang/String;ILcom/oplus/aiunit/vision/qx5;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lcom/oplus/aiunit/vision/en0;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "(Ljava/lang/String;ILcom/oplus/aiunit/vision/qx5;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lcom/oplus/aiunit/vision/en0;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;Ljava/lang/String;Ljava/lang/String;)V", "networkType", "(Lcom/oplus/aiunit/vision/uk9;Lcom/oplus/aiunit/vision/qx5;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lcom/oplus/aiunit/vision/en0;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/common/bean/NetworkType;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class gq {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public uk9 fullUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public NetworkType network;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String targetIp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String domainName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uk9 url;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<Protocol> protocols;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<oz3> connectionSpecs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final qx5 dns;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final SocketFactory socketFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final SSLSocketFactory sslSocketFactory;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final HostnameVerifier hostnameVerifier;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final CertificatePinner certificatePinner;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final en0 proxyAuthenticator;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Proxy proxy;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final ProxySelector proxySelector;

    public gq(@NotNull String uriHost, int i, @NotNull qx5 dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable CertificatePinner certificatePinner, @NotNull en0 proxyAuthenticator, @Nullable Proxy proxy, @NotNull List<? extends Protocol> protocols, @NotNull List<oz3> connectionSpecs, @NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = proxyAuthenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.network = NetworkType.DEFAULT;
        this.url = new uk9.a().q(sSLSocketFactory != null ? Const.Scheme.SCHEME_HTTPS : "http").g(uriHost).m(i).c();
        this.protocols = sqk.T(protocols);
        this.connectionSpecs = sqk.T(connectionSpecs);
    }

    @JvmName(name = "certificatePinner")
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @JvmName(name = "connectionSpecs")
    @NotNull
    public final List<oz3> b() {
        return this.connectionSpecs;
    }

    @JvmName(name = "dns")
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final qx5 getDns() {
        return this.dns;
    }

    @JvmName(name = "domainName")
    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDomainName() {
        return this.domainName;
    }

    public final boolean e(@NotNull gq that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.dns, that.dns) && Intrinsics.areEqual(this.proxyAuthenticator, that.proxyAuthenticator) && Intrinsics.areEqual(this.protocols, that.protocols) && Intrinsics.areEqual(this.connectionSpecs, that.connectionSpecs) && Intrinsics.areEqual(this.proxySelector, that.proxySelector) && Intrinsics.areEqual(this.proxy, that.proxy) && Intrinsics.areEqual(this.sslSocketFactory, that.sslSocketFactory) && Intrinsics.areEqual(this.hostnameVerifier, that.hostnameVerifier) && Intrinsics.areEqual(this.certificatePinner, that.certificatePinner) && this.url.getPort() == that.url.getPort();
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof gq) {
            gq gqVar = (gq) other;
            if (Intrinsics.areEqual(this.url, gqVar.url) && e(gqVar)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final NetworkType getNetwork() {
        return this.network;
    }

    @JvmName(name = "hostnameVerifier")
    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @JvmName(name = "protocols")
    @NotNull
    public final List<Protocol> h() {
        return this.protocols;
    }

    public int hashCode() {
        return ((((((((((((((((((((((527 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner)) * 31) + Objects.hashCode(this.domainName)) * 31) + Objects.hashCode(this.targetIp);
    }

    @JvmName(name = "proxy")
    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @JvmName(name = "proxyAuthenticator")
    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final en0 getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @JvmName(name = "proxySelector")
    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    public final void l(@NotNull NetworkType networkType) {
        Intrinsics.checkNotNullParameter(networkType, "<set-?>");
        this.network = networkType;
    }

    @JvmName(name = "socketFactory")
    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @JvmName(name = "sslSocketFactory")
    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @JvmName(name = OKHttpRequestHandler.RSP_TARGET_IP)
    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getTargetIp() {
        return this.targetIp;
    }

    @JvmName(name = "url")
    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final uk9 getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        Object obj;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.url.getHost());
        sb2.append(':');
        sb2.append(this.url.getPort());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        if (this.domainName != null) {
            str = "domainName=" + this.domainName;
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gq(@NotNull String uriHost, int i, @NotNull qx5 dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable CertificatePinner certificatePinner, @NotNull en0 proxyAuthenticator, @Nullable Proxy proxy, @NotNull List<? extends Protocol> protocols, @NotNull List<oz3> connectionSpecs, @NotNull ProxySelector proxySelector, @Nullable String str, @Nullable String str2) {
        this(uriHost, i, dns, socketFactory, sSLSocketFactory, hostnameVerifier, certificatePinner, proxyAuthenticator, proxy, protocols, connectionSpecs, proxySelector);
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.domainName = str;
        this.targetIp = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gq(@NotNull uk9 url, @NotNull qx5 dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable CertificatePinner certificatePinner, @NotNull en0 proxyAuthenticator, @Nullable Proxy proxy, @NotNull List<? extends Protocol> protocols, @NotNull List<oz3> connectionSpecs, @NotNull ProxySelector proxySelector, @Nullable String str, @Nullable String str2, @Nullable NetworkType networkType) {
        this(url.getHost(), url.getPort(), dns, socketFactory, sSLSocketFactory, hostnameVerifier, certificatePinner, proxyAuthenticator, proxy, protocols, connectionSpecs, proxySelector, str, str2);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        if (networkType != null) {
            this.network = networkType;
        }
        this.fullUrl = url;
    }
}
