package com.oplus.aiunit.vision;

import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.List;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001QB\u0085\u0001\b\u0000\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020&\u0012\b\u00100\u001a\u0004\u0018\u00010+\u0012\u0006\u00105\u001a\u000201\u0012\b\u0010:\u001a\u0004\u0018\u00010\b\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010H\u001a\u00020\u0006\u0012\u0006\u0010J\u001a\u00020\u0006\u0012\b\u0010N\u001a\u0004\u0018\u00010K\u0012\u0006\u0010S\u001a\u00020O¢\u0006\u0004\b[\u0010\\J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010%\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010*\u001a\u00020&8\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0019\u00100\u001a\u0004\u0018\u00010+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00105\u001a\u0002018\u0007¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b3\u00104R\u0019\u0010:\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010?\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010A\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\b\u0013\u0010>R\u0019\u0010C\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\bB\u0010>R\u0017\u0010H\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010J\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b3\u0010E\u001a\u0004\bI\u0010GR\u001c\u0010N\u001a\u0004\u0018\u00010K8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010L\u001a\u0004\b,\u0010MR\u0017\u0010S\u001a\u00020O8\u0007¢\u0006\f\n\u0004\b=\u0010P\u001a\u0004\bQ\u0010RR\u0011\u0010W\u001a\u00020T8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0011\u0010Z\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006]"}, d2 = {"Lcom/oplus/aiunit/vision/ytf;", "Ljava/io/Closeable;", "", "name", "defaultValue", "s", "", "byteCount", "Lcom/oplus/aiunit/vision/cuf;", "y", "Lcom/oplus/aiunit/vision/ytf$a;", "x", "", "Lcom/oplus/aiunit/vision/w63;", LogFieldKey.LEVEL_KEY, "", "close", "toString", "Lcom/oplus/aiunit/vision/xo2;", "i", "Lcom/oplus/aiunit/vision/xo2;", "lazyCacheControl", "Lokhttp3/Request;", "j", "Lokhttp3/Request;", "C", "()Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", MapSchema.FIELD_NAME_KEY, "Lokhttp3/Protocol;", "A", "()Lokhttp3/Protocol;", "protocol", "Ljava/lang/String;", "v", "()Ljava/lang/String;", "message", "", LogFieldKey.MESSAGE_KEY, "I", "()I", "code", "Lokhttp3/Handshake;", "n", "Lokhttp3/Handshake;", "o", "()Lokhttp3/Handshake;", "handshake", "Lcom/oplus/aiunit/vision/gj8;", "Lcom/oplus/aiunit/vision/gj8;", "u", "()Lcom/oplus/aiunit/vision/gj8;", "headers", LogFieldKey.PROCESS_NAME_KEY, "Lcom/oplus/aiunit/vision/cuf;", b2n.f, "()Lcom/oplus/aiunit/vision/cuf;", "body", "q", "Lcom/oplus/aiunit/vision/ytf;", "w", "()Lcom/oplus/aiunit/vision/ytf;", "networkResponse", "r", "cacheResponse", "z", "priorResponse", "t", "J", "D", "()J", "sentRequestAtMillis", c8l.KEY_B, "receivedResponseAtMillis", "Lcom/oplus/aiunit/vision/ju6;", "Lcom/oplus/aiunit/vision/ju6;", "()Lcom/oplus/aiunit/vision/ju6;", "exchange", "Lcom/oplus/aiunit/vision/buf;", "Lcom/oplus/aiunit/vision/buf;", "a", "()Lcom/oplus/aiunit/vision/buf;", "attachInfo", "", "b", "()Z", "isSuccessful", b2n.g, "()Lcom/oplus/aiunit/vision/xo2;", "cacheControl", "<init>", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lcom/oplus/aiunit/vision/gj8;Lcom/oplus/aiunit/vision/cuf;Lcom/oplus/aiunit/vision/ytf;Lcom/oplus/aiunit/vision/ytf;Lcom/oplus/aiunit/vision/ytf;JJLcom/oplus/aiunit/vision/ju6;Lcom/oplus/aiunit/vision/buf;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class ytf implements Closeable {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public xo2 lazyCacheControl;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Request request;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Protocol protocol;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    public final int code;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Handshake handshake;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final gj8 headers;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public final cuf body;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public final ytf networkResponse;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public final ytf cacheResponse;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public final ytf priorResponse;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final long sentRequestAtMillis;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final long receivedResponseAtMillis;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public final ju6 exchange;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final buf attachInfo;

    public ytf(@NotNull Request request, @NotNull Protocol protocol, @NotNull String message, int i, @Nullable Handshake handshake, @NotNull gj8 headers, @Nullable cuf cufVar, @Nullable ytf ytfVar, @Nullable ytf ytfVar2, @Nullable ytf ytfVar3, long j2, long j3, @Nullable ju6 ju6Var, @NotNull buf attachInfo) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(attachInfo, "attachInfo");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i;
        this.handshake = handshake;
        this.headers = headers;
        this.body = cufVar;
        this.networkResponse = ytfVar;
        this.cacheResponse = ytfVar2;
        this.priorResponse = ytfVar3;
        this.sentRequestAtMillis = j2;
        this.receivedResponseAtMillis = j3;
        this.exchange = ju6Var;
        this.attachInfo = attachInfo;
    }

    public static /* synthetic */ String t(ytf ytfVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return ytfVar.s(str, str2);
    }

    @JvmName(name = "protocol")
    @NotNull
    /* JADX INFO: renamed from: A, reason: from getter */
    public final Protocol getProtocol() {
        return this.protocol;
    }

    @JvmName(name = "receivedResponseAtMillis")
    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @JvmName(name = "request")
    @NotNull
    /* JADX INFO: renamed from: C, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    @JvmName(name = "sentRequestAtMillis")
    /* JADX INFO: renamed from: D, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @JvmName(name = "attachInfo")
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final buf getAttachInfo() {
        return this.attachInfo;
    }

    public final boolean b() {
        int i = this.code;
        return 200 <= i && 299 >= i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        cuf cufVar = this.body;
        if (cufVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        cufVar.close();
    }

    @JvmName(name = "body")
    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final cuf getBody() {
        return this.body;
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final xo2 h() {
        xo2 xo2Var = this.lazyCacheControl;
        if (xo2Var != null) {
            return xo2Var;
        }
        xo2 xo2VarB = xo2.INSTANCE.b(this.headers);
        this.lazyCacheControl = xo2VarB;
        return xo2VarB;
    }

    @JvmName(name = "cacheResponse")
    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final ytf getCacheResponse() {
        return this.cacheResponse;
    }

    @NotNull
    public final List<w63> l() {
        String str;
        gj8 gj8Var = this.headers;
        int i = this.code;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return tj9.b(gj8Var, str);
    }

    @JvmName(name = "code")
    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @JvmName(name = "exchange")
    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final ju6 getExchange() {
        return this.exchange;
    }

    @JvmName(name = "handshake")
    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final Handshake getHandshake() {
        return this.handshake;
    }

    @JvmOverloads
    @Nullable
    public final String p(@NotNull String str) {
        return t(this, str, null, 2, null);
    }

    @JvmOverloads
    @Nullable
    public final String s(@NotNull String name, @Nullable String defaultValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strA = this.headers.a(name);
        return strA != null ? strA : defaultValue;
    }

    @NotNull
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.getUrl() + '}';
    }

    @JvmName(name = "headers")
    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public final gj8 getHeaders() {
        return this.headers;
    }

    @JvmName(name = "message")
    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @JvmName(name = "networkResponse")
    @Nullable
    /* JADX INFO: renamed from: w, reason: from getter */
    public final ytf getNetworkResponse() {
        return this.networkResponse;
    }

    @NotNull
    public final a x() {
        return new a(this);
    }

    @NotNull
    public final cuf y(long byteCount) throws IOException {
        cuf cufVar = this.body;
        Intrinsics.checkNotNull(cufVar);
        BufferedSource bufferedSourcePeek = cufVar.getBodySource().peek();
        Buffer buffer = new Buffer();
        bufferedSourcePeek.request(byteCount);
        buffer.write((Source) bufferedSourcePeek, Math.min(byteCount, bufferedSourcePeek.getBuffer().size()));
        return cuf.INSTANCE.d(buffer, this.body.getK(), buffer.size());
    }

    @JvmName(name = "priorResponse")
    @Nullable
    /* JADX INFO: renamed from: z, reason: from getter */
    public final ytf getPriorResponse() {
        return this.priorResponse;
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bt\u0010uB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bt\u0010\\J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0012\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0016J\u0012\u0010%\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010)\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020*H\u0016J\u0017\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\b\u00103\u001a\u00020\u0004H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010\u001c\u001a\u00020M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010$\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010&\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010X\u001a\u0004\b]\u0010Z\"\u0004\b^\u0010\\R$\u0010(\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010X\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\R\"\u0010+\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010-\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010a\u001a\u0004\bf\u0010c\"\u0004\bg\u0010eR$\u0010l\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u00102R\"\u0010s\u001a\u00020m8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010r¨\u0006v"}, d2 = {"Lcom/oplus/aiunit/vision/ytf$a;", "", "", "name", "Lcom/oplus/aiunit/vision/ytf;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "f", MapSchema.FIELD_NAME_ENTRY, "Lokhttp3/Request;", "request", "s", "Lokhttp3/Protocol;", "protocol", LogFieldKey.PROCESS_NAME_KEY, "", "code", b2n.f, "message", LogFieldKey.MESSAGE_KEY, "Lokhttp3/Handshake;", "handshake", "i", "value", "j", "a", "r", "Lcom/oplus/aiunit/vision/gj8;", "headers", MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/cuf;", "body", "b", "Ljava/net/InetSocketAddress;", "socketAddress", "u", "networkResponse", "n", "cacheResponse", "d", "priorResponse", "o", "", "sentRequestAtMillis", "t", "receivedResponseAtMillis", "q", "Lcom/oplus/aiunit/vision/ju6;", "deferredTrailers", LogFieldKey.LEVEL_KEY, "(Lcom/oplus/aiunit/vision/ju6;)V", "c", "Lokhttp3/Request;", "getRequest$okhttp4_extension_release", "()Lokhttp3/Request;", "setRequest$okhttp4_extension_release", "(Lokhttp3/Request;)V", "Lokhttp3/Protocol;", "getProtocol$okhttp4_extension_release", "()Lokhttp3/Protocol;", "setProtocol$okhttp4_extension_release", "(Lokhttp3/Protocol;)V", "I", b2n.g, "()I", "setCode$okhttp4_extension_release", "(I)V", "Ljava/lang/String;", "getMessage$okhttp4_extension_release", "()Ljava/lang/String;", "setMessage$okhttp4_extension_release", "(Ljava/lang/String;)V", "Lokhttp3/Handshake;", "getHandshake$okhttp4_extension_release", "()Lokhttp3/Handshake;", "setHandshake$okhttp4_extension_release", "(Lokhttp3/Handshake;)V", "Lcom/oplus/aiunit/vision/gj8$a;", "Lcom/oplus/aiunit/vision/gj8$a;", "getHeaders$okhttp4_extension_release", "()Lcom/oplus/aiunit/vision/gj8$a;", "setHeaders$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/gj8$a;)V", "Lcom/oplus/aiunit/vision/cuf;", "getBody$okhttp4_extension_release", "()Lcom/oplus/aiunit/vision/cuf;", "setBody$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/cuf;)V", "Lcom/oplus/aiunit/vision/ytf;", "getNetworkResponse$okhttp4_extension_release", "()Lcom/oplus/aiunit/vision/ytf;", "setNetworkResponse$okhttp4_extension_release", "(Lcom/oplus/aiunit/vision/ytf;)V", "getCacheResponse$okhttp4_extension_release", "setCacheResponse$okhttp4_extension_release", "getPriorResponse$okhttp4_extension_release", "setPriorResponse$okhttp4_extension_release", "J", "getSentRequestAtMillis$okhttp4_extension_release", "()J", "setSentRequestAtMillis$okhttp4_extension_release", "(J)V", "getReceivedResponseAtMillis$okhttp4_extension_release", "setReceivedResponseAtMillis$okhttp4_extension_release", "Lcom/oplus/aiunit/vision/ju6;", "getExchange$okhttp4_extension_release", "()Lcom/oplus/aiunit/vision/ju6;", "setExchange$okhttp4_extension_release", "exchange", "Lcom/oplus/aiunit/vision/buf;", "Lcom/oplus/aiunit/vision/buf;", "getAttachInfo", "()Lcom/oplus/aiunit/vision/buf;", "setAttachInfo", "(Lcom/oplus/aiunit/vision/buf;)V", "attachInfo", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Request request;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public Protocol protocol;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int code;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public String message;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Handshake handshake;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public gj8.a headers;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public cuf body;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public ytf networkResponse;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public ytf cacheResponse;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public ytf priorResponse;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public long sentRequestAtMillis;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public long receivedResponseAtMillis;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public ju6 exchange;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public buf attachInfo;

        public a() {
            this.code = -1;
            this.attachInfo = new buf();
            this.headers = new gj8.a();
        }

        @NotNull
        public a a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.b(name, value);
            return this;
        }

        @NotNull
        public a b(@Nullable cuf body) {
            this.body = body;
            return this;
        }

        @NotNull
        public ytf c() {
            int i = this.code;
            if (!(i >= 0)) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.message;
            if (str != null) {
                return new ytf(request, protocol, str, i, this.handshake, this.headers.g(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange, this.attachInfo);
            }
            throw new IllegalStateException("message == null".toString());
        }

        @NotNull
        public a d(@Nullable ytf cacheResponse) {
            f("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        public final void e(ytf response) {
            if (response != null) {
                if (!(response.getBody() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        public final void f(String name, ytf response) {
            if (response != null) {
                if (!(response.getBody() == null)) {
                    throw new IllegalArgumentException((name + ".body != null").toString());
                }
                if (!(response.getNetworkResponse() == null)) {
                    throw new IllegalArgumentException((name + ".networkResponse != null").toString());
                }
                if (!(response.getCacheResponse() == null)) {
                    throw new IllegalArgumentException((name + ".cacheResponse != null").toString());
                }
                if (response.getPriorResponse() == null) {
                    return;
                }
                throw new IllegalArgumentException((name + ".priorResponse != null").toString());
            }
        }

        @NotNull
        public a g(int code) {
            this.code = code;
            return this;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        public a i(@Nullable Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        @NotNull
        public a j(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.k(name, value);
            return this;
        }

        @NotNull
        public a k(@NotNull gj8 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers.d();
            return this;
        }

        public final void l(@NotNull ju6 deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        @NotNull
        public a m(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            return this;
        }

        @NotNull
        public a n(@Nullable ytf networkResponse) {
            f("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        @NotNull
        public a o(@Nullable ytf priorResponse) {
            e(priorResponse);
            this.priorResponse = priorResponse;
            return this;
        }

        @NotNull
        public a p(@NotNull Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        @NotNull
        public a q(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        @NotNull
        public a r(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.headers.j(name);
            return this;
        }

        @NotNull
        public a s(@NotNull Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
            return this;
        }

        @NotNull
        public a t(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        @NotNull
        public a u(@NotNull InetSocketAddress socketAddress) {
            Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
            buf bufVar = this.attachInfo;
            if (bufVar != null) {
                bufVar.c(socketAddress);
            }
            return this;
        }

        public a(@NotNull ytf response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.code = -1;
            this.attachInfo = new buf();
            this.request = response.getRequest();
            this.protocol = response.getProtocol();
            this.code = response.getCode();
            this.message = response.getMessage();
            this.handshake = response.getHandshake();
            this.headers = response.getHeaders().d();
            this.body = response.getBody();
            this.networkResponse = response.getNetworkResponse();
            this.cacheResponse = response.getCacheResponse();
            this.priorResponse = response.getPriorResponse();
            this.sentRequestAtMillis = response.getSentRequestAtMillis();
            this.receivedResponseAtMillis = response.getReceivedResponseAtMillis();
            this.exchange = response.getExchange();
            buf attachInfo = response.getAttachInfo();
            this.attachInfo = attachInfo != null ? attachInfo.a() : null;
        }
    }
}
