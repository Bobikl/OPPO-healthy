package com.oplus.aiunit.vision;

import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u0000 B2\u00020\u0001:\u0002CDB\u0007¢\u0006\u0004\b@\u0010AJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0011\u0010\u0013\u001a\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\f0\nH\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J \u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J*\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J2\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\"\u001a\u00020!H\u0016J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0016J\u0018\u00100\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00103\u001a\u000202H\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0016J\u0018\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00103\u001a\u000202H\u0016J\u0018\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00103\u001a\u000202H\u0016J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010?\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010>\u001a\u000202H\u0016¨\u0006E"}, d2 = {"Lcom/oplus/aiunit/vision/wr6;", "", "Lcom/oplus/aiunit/vision/wr2;", "call", "", "callStart", "newSteam", "Lcom/oplus/aiunit/vision/uk9;", "url", "proxySelectStart", "", "Ljava/net/Proxy;", "Lkotlin/jvm/JvmSuppressWildcards;", "proxies", "proxySelectEnd", "", "domainName", "dnsStart", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "connectSocketEnd", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", "protocol", "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lcom/oplus/aiunit/vision/jy3;", "connection", "connectionAcquired", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "requestFailed", "responseHeadersStart", "Lcom/oplus/aiunit/vision/ytf;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "<init>", "()V", "Companion", "b", "c", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public abstract class wr6 {

    @JvmField
    @NotNull
    public static final wr6 NONE = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/oplus/aiunit/vision/wr6$a", "Lcom/oplus/aiunit/vision/wr6;", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends wr6 {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/wr6$c;", "", "Lcom/oplus/aiunit/vision/wr2;", "call", "Lcom/oplus/aiunit/vision/wr6;", "a", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public interface c {
        @NotNull
        wr6 a(@NotNull wr2 call);
    }

    public void cacheConditionalHit(@NotNull wr2 call, @NotNull ytf cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void cacheHit(@NotNull wr2 call, @NotNull ytf response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void cacheMiss(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callEnd(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callFailed(@NotNull wr2 call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void callStart(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void canceled(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void connectEnd(@NotNull wr2 call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectFailed(@NotNull wr2 call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void connectSocketEnd(@NotNull wr2 call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectStart(@NotNull wr2 call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectionAcquired(@NotNull wr2 call, @NotNull jy3 connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void connectionReleased(@NotNull wr2 call, @NotNull jy3 connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void dnsEnd(@NotNull wr2 call, @NotNull String domainName, @NotNull List<InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void dnsStart(@NotNull wr2 call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    public void newSteam(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void proxySelectEnd(@NotNull wr2 call, @NotNull uk9 url, @NotNull List<Proxy> proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public void proxySelectStart(@NotNull wr2 call, @NotNull uk9 url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void requestBodyEnd(@NotNull wr2 call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestBodyStart(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestFailed(@NotNull wr2 call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void requestHeadersEnd(@NotNull wr2 call, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void requestHeadersStart(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyEnd(@NotNull wr2 call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyStart(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseFailed(@NotNull wr2 call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void responseHeadersEnd(@NotNull wr2 call, @NotNull ytf response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void responseHeadersStart(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void satisfactionFailure(@NotNull wr2 call, @NotNull ytf response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void secureConnectEnd(@NotNull wr2 call, @Nullable Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void secureConnectStart(@NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
