package com.heytap.health.esim.nec.bean;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\b\u0010)\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006*"}, d2 = {"Lcom/heytap/health/esim/nec/bean/DevAuthorization;", "", HintConstants.AUTOFILL_HINT_USERNAME, "", "realm", "nonce", ConnectIdLogic.PARAM_ALGORITHM, "opaque", "qop", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, ParserTag.TAG_URI, "nc", "cnonce", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlgorithm", "()Ljava/lang/String;", "getCnonce", "getNc", "getNonce", "getOpaque", "getQop", "getRealm", "getResponse", "getUri", "getUsername", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DevAuthorization {
    public static final int $stable = 0;

    @NotNull
    private final String algorithm;

    @NotNull
    private final String cnonce;

    @NotNull
    private final String nc;

    @NotNull
    private final String nonce;

    @NotNull
    private final String opaque;

    @NotNull
    private final String qop;

    @NotNull
    private final String realm;

    @NotNull
    private final String response;

    @NotNull
    private final String uri;

    @NotNull
    private final String username;

    public DevAuthorization(@NotNull String username, @NotNull String realm, @NotNull String nonce, @NotNull String algorithm, @NotNull String opaque, @NotNull String qop, @NotNull String response, @NotNull String uri, @NotNull String nc, @NotNull String cnonce) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(realm, "realm");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(opaque, "opaque");
        Intrinsics.checkNotNullParameter(qop, "qop");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(nc, "nc");
        Intrinsics.checkNotNullParameter(cnonce, "cnonce");
        this.username = username;
        this.realm = realm;
        this.nonce = nonce;
        this.algorithm = algorithm;
        this.opaque = opaque;
        this.qop = qop;
        this.response = response;
        this.uri = uri;
        this.nc = nc;
        this.cnonce = cnonce;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCnonce() {
        return this.cnonce;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRealm() {
        return this.realm;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOpaque() {
        return this.opaque;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getQop() {
        return this.qop;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getResponse() {
        return this.response;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNc() {
        return this.nc;
    }

    @NotNull
    public final DevAuthorization copy(@NotNull String username, @NotNull String realm, @NotNull String nonce, @NotNull String algorithm, @NotNull String opaque, @NotNull String qop, @NotNull String response, @NotNull String uri, @NotNull String nc, @NotNull String cnonce) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(realm, "realm");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(opaque, "opaque");
        Intrinsics.checkNotNullParameter(qop, "qop");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(nc, "nc");
        Intrinsics.checkNotNullParameter(cnonce, "cnonce");
        return new DevAuthorization(username, realm, nonce, algorithm, opaque, qop, response, uri, nc, cnonce);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevAuthorization)) {
            return false;
        }
        DevAuthorization devAuthorization = (DevAuthorization) other;
        return Intrinsics.areEqual(this.username, devAuthorization.username) && Intrinsics.areEqual(this.realm, devAuthorization.realm) && Intrinsics.areEqual(this.nonce, devAuthorization.nonce) && Intrinsics.areEqual(this.algorithm, devAuthorization.algorithm) && Intrinsics.areEqual(this.opaque, devAuthorization.opaque) && Intrinsics.areEqual(this.qop, devAuthorization.qop) && Intrinsics.areEqual(this.response, devAuthorization.response) && Intrinsics.areEqual(this.uri, devAuthorization.uri) && Intrinsics.areEqual(this.nc, devAuthorization.nc) && Intrinsics.areEqual(this.cnonce, devAuthorization.cnonce);
    }

    @NotNull
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @NotNull
    public final String getCnonce() {
        return this.cnonce;
    }

    @NotNull
    public final String getNc() {
        return this.nc;
    }

    @NotNull
    public final String getNonce() {
        return this.nonce;
    }

    @NotNull
    public final String getOpaque() {
        return this.opaque;
    }

    @NotNull
    public final String getQop() {
        return this.qop;
    }

    @NotNull
    public final String getRealm() {
        return this.realm;
    }

    @NotNull
    public final String getResponse() {
        return this.response;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (((((((((((((((((this.username.hashCode() * 31) + this.realm.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.algorithm.hashCode()) * 31) + this.opaque.hashCode()) * 31) + this.qop.hashCode()) * 31) + this.response.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.nc.hashCode()) * 31) + this.cnonce.hashCode();
    }

    @NotNull
    public String toString() {
        return "Digest username=\"" + this.username + "\",realm=\"" + this.realm + "\",nonce=\"" + this.nonce + "\",response=\"" + this.response + "\",uri=\"" + this.uri + "\",opaque=\"" + this.opaque + "\",qop=\"" + this.qop + "\",algorithm=" + this.algorithm + ",nc=" + this.nc + ",cnonce=\"" + this.cnonce + "\"";
    }

    public /* synthetic */ DevAuthorization(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "/" : str8, (i & 256) != 0 ? "00000001" : str9, (i & 512) != 0 ? "" : str10);
    }
}
