package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0002\u0012\u0017B9\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a¢\u0006\u0004\b&\u0010'J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0017\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001c\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010!R\u0019\u0010%\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001f8G¢\u0006\u0006\u001a\u0004\b$\u0010!¨\u0006)"}, d2 = {"Lcom/oplus/aiunit/vision/oz3;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "isFallback", "", "c", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", MapSchema.FIELD_NAME_ENTRY, "other", "equals", "", "hashCode", "", "toString", b2n.f, "a", "Z", "f", "()Z", "isTls", "b", b2n.g, "supportsTlsExtensions", "", "[Ljava/lang/String;", "cipherSuitesAsString", "d", "tlsVersionsAsString", "", "Lcom/oplus/aiunit/vision/ib3;", "()Ljava/util/List;", "cipherSuites", "Lokhttp3/TlsVersion;", "i", "tlsVersions", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class oz3 {

    @JvmField
    @NotNull
    public static final oz3 CLEARTEXT;

    @JvmField
    @NotNull
    public static final oz3 COMPATIBLE_TLS;

    @JvmField
    @NotNull
    public static final oz3 MODERN_TLS;

    @JvmField
    @NotNull
    public static final oz3 MODERN_TLS_WITHOUT_TLS13;

    @JvmField
    @NotNull
    public static final oz3 RESTRICTED_TLS;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ib3[] f15117e;
    public static final ib3[] f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isTls;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean supportsTlsExtensions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String[] cipherSuitesAsString;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String[] tlsVersionsAsString;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b#\u0010%J!\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0002\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0006\u0010\u0013\u001a\u00020\u0012R\"\u0010\u0019\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/oz3$a;", "", "", "Lcom/oplus/aiunit/vision/ib3;", "cipherSuites", "b", "([Lcom/oplus/aiunit/vision/ib3;)Lcom/oplus/aiunit/vision/oz3$a;", "", "c", "([Ljava/lang/String;)Lcom/oplus/aiunit/vision/oz3$a;", "Lokhttp3/TlsVersion;", "tlsVersions", "f", "([Lokhttp3/TlsVersion;)Lcom/oplus/aiunit/vision/oz3$a;", MapSchema.FIELD_NAME_ENTRY, "", "supportsTlsExtensions", "d", "Lcom/oplus/aiunit/vision/oz3;", "a", "Z", "getTls$okhttp4_extension_release", "()Z", "setTls$okhttp4_extension_release", "(Z)V", "tls", "[Ljava/lang/String;", "getCipherSuites$okhttp4_extension_release", "()[Ljava/lang/String;", "setCipherSuites$okhttp4_extension_release", "([Ljava/lang/String;)V", "getTlsVersions$okhttp4_extension_release", "setTlsVersions$okhttp4_extension_release", "getSupportsTlsExtensions$okhttp4_extension_release", "setSupportsTlsExtensions$okhttp4_extension_release", "<init>", "connectionSpec", "(Lcom/oplus/aiunit/vision/oz3;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean tls;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String[] cipherSuites;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String[] tlsVersions;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public boolean supportsTlsExtensions;

        public a(boolean z) {
            this.tls = z;
        }

        @NotNull
        public final oz3 a() {
            return new oz3(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        @NotNull
        public final a b(@NotNull ib3... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (ib3 ib3Var : cipherSuites) {
                arrayList.add(ib3Var.getJavaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return c((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @NotNull
        public final a c(@NotNull String... cipherSuites) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object objClone = cipherSuites.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.cipherSuites = (String[]) objClone;
            return this;
        }

        @Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @NotNull
        public final a d(boolean supportsTlsExtensions) {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.supportsTlsExtensions = supportsTlsExtensions;
            return this;
        }

        @NotNull
        public final a e(@NotNull String... tlsVersions) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object objClone = tlsVersions.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.tlsVersions = (String[]) objClone;
            return this;
        }

        @NotNull
        public final a f(@NotNull TlsVersion... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.javaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(@NotNull oz3 connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.tls = connectionSpec.getIsTls();
            this.cipherSuites = connectionSpec.cipherSuitesAsString;
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.getSupportsTlsExtensions();
        }
    }

    static {
        ib3 ib3Var = ib3.TLS_AES_128_GCM_SHA256;
        ib3 ib3Var2 = ib3.TLS_AES_256_GCM_SHA384;
        ib3 ib3Var3 = ib3.TLS_CHACHA20_POLY1305_SHA256;
        ib3 ib3Var4 = ib3.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
        ib3 ib3Var5 = ib3.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
        ib3 ib3Var6 = ib3.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
        ib3 ib3Var7 = ib3.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
        ib3 ib3Var8 = ib3.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        ib3 ib3Var9 = ib3.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        ib3[] ib3VarArr = {ib3Var, ib3Var2, ib3Var3, ib3Var4, ib3Var5, ib3Var6, ib3Var7, ib3Var8, ib3Var9};
        f15117e = ib3VarArr;
        ib3[] ib3VarArr2 = {ib3Var, ib3Var2, ib3Var3, ib3Var4, ib3Var5, ib3Var6, ib3Var7, ib3Var8, ib3Var9, ib3.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, ib3.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, ib3.TLS_RSA_WITH_AES_128_GCM_SHA256, ib3.TLS_RSA_WITH_AES_256_GCM_SHA384, ib3.TLS_RSA_WITH_AES_128_CBC_SHA, ib3.TLS_RSA_WITH_AES_256_CBC_SHA, ib3.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f = ib3VarArr2;
        a aVarB = new a(true).b((ib3[]) Arrays.copyOf(ib3VarArr, ib3VarArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        RESTRICTED_TLS = aVarB.f(tlsVersion, tlsVersion2).d(true).a();
        MODERN_TLS = new a(true).b((ib3[]) Arrays.copyOf(ib3VarArr2, ib3VarArr2.length)).f(tlsVersion, tlsVersion2).d(true).a();
        a aVarB2 = new a(true).b((ib3[]) Arrays.copyOf(ib3VarArr2, ib3VarArr2.length));
        TlsVersion tlsVersion3 = TlsVersion.TLS_1_1;
        TlsVersion tlsVersion4 = TlsVersion.TLS_1_0;
        COMPATIBLE_TLS = aVarB2.f(tlsVersion, tlsVersion2, tlsVersion3, tlsVersion4).d(true).a();
        MODERN_TLS_WITHOUT_TLS13 = new a(true).b((ib3[]) Arrays.copyOf(ib3VarArr2, ib3VarArr2.length)).f(tlsVersion2, tlsVersion3, tlsVersion4).d(true).a();
        CLEARTEXT = new a(false).a();
    }

    public oz3(boolean z, boolean z2, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.isTls = z;
        this.supportsTlsExtensions = z2;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    public final void c(@NotNull SSLSocket sslSocket, boolean isFallback) throws CloneNotSupportedException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        oz3 oz3VarG = g(sslSocket, isFallback);
        if (oz3VarG.i() != null) {
            sslSocket.setEnabledProtocols(oz3VarG.tlsVersionsAsString);
        }
        if (oz3VarG.d() != null) {
            sslSocket.setEnabledCipherSuites(oz3VarG.cipherSuitesAsString);
        }
    }

    @JvmName(name = "cipherSuites")
    @Nullable
    public final List<ib3> d() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ib3.INSTANCE.b(str));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    public final boolean e(@NotNull SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !sqk.s(strArr, socket.getEnabledProtocols(), ComparisonsKt__ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.cipherSuitesAsString;
        return strArr2 == null || sqk.s(strArr2, socket.getEnabledCipherSuites(), ib3.INSTANCE.c());
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof oz3)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        boolean z = this.isTls;
        oz3 oz3Var = (oz3) other;
        if (z != oz3Var.isTls) {
            return false;
        }
        return !z || (Arrays.equals(this.cipherSuitesAsString, oz3Var.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, oz3Var.tlsVersionsAsString) && this.supportsTlsExtensions == oz3Var.supportsTlsExtensions);
    }

    @JvmName(name = "isTls")
    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    public final oz3 g(SSLSocket sslSocket, boolean isFallback) throws CloneNotSupportedException {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.cipherSuitesAsString != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = sqk.C(enabledCipherSuites, this.cipherSuitesAsString, ib3.INSTANCE.c());
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = sqk.C(enabledProtocols, this.tlsVersionsAsString, ComparisonsKt__ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int iV = sqk.v(supportedCipherSuites, "TLS_FALLBACK_SCSV", ib3.INSTANCE.c());
        if (isFallback && iV != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iV];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = sqk.m(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarC = aVar.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarC.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    @JvmName(name = "supportsTlsExtensions")
    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSupportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    @JvmName(name = "tlsVersions")
    @Nullable
    public final List<TlsVersion> i() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.INSTANCE.a(str));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    @NotNull
    public String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
    }
}
