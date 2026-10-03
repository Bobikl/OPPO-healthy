package com.heytap.health.esim.nec.bean;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/esim/nec/bean/FirstAuthorization;", "", HintConstants.AUTOFILL_HINT_USERNAME, "", "realm", "nonce", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, ParserTag.TAG_URI, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNonce", "()Ljava/lang/String;", "getRealm", "getResponse", "getUri", "getUsername", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FirstAuthorization {
    public static final int $stable = 0;

    @NotNull
    private final String nonce;

    @NotNull
    private final String realm;

    @NotNull
    private final String response;

    @NotNull
    private final String uri;

    @NotNull
    private final String username;

    public FirstAuthorization(@NotNull String username, @NotNull String realm, @NotNull String nonce, @NotNull String response, @NotNull String uri) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(realm, "realm");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.username = username;
        this.realm = realm;
        this.nonce = nonce;
        this.response = response;
        this.uri = uri;
    }

    public static /* synthetic */ FirstAuthorization copy$default(FirstAuthorization firstAuthorization, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = firstAuthorization.username;
        }
        if ((i & 2) != 0) {
            str2 = firstAuthorization.realm;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = firstAuthorization.nonce;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = firstAuthorization.response;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = firstAuthorization.uri;
        }
        return firstAuthorization.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
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
    public final String getResponse() {
        return this.response;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @NotNull
    public final FirstAuthorization copy(@NotNull String username, @NotNull String realm, @NotNull String nonce, @NotNull String response, @NotNull String uri) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(realm, "realm");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new FirstAuthorization(username, realm, nonce, response, uri);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirstAuthorization)) {
            return false;
        }
        FirstAuthorization firstAuthorization = (FirstAuthorization) other;
        return Intrinsics.areEqual(this.username, firstAuthorization.username) && Intrinsics.areEqual(this.realm, firstAuthorization.realm) && Intrinsics.areEqual(this.nonce, firstAuthorization.nonce) && Intrinsics.areEqual(this.response, firstAuthorization.response) && Intrinsics.areEqual(this.uri, firstAuthorization.uri);
    }

    @NotNull
    public final String getNonce() {
        return this.nonce;
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
        return (((((((this.username.hashCode() * 31) + this.realm.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.response.hashCode()) * 31) + this.uri.hashCode();
    }

    @NotNull
    public String toString() {
        return "Digest username=\"" + this.username + "\",realm=\"" + this.realm + "\",nonce=\"" + this.nonce + "\",response=\"" + this.response + "\",uri=\"" + this.uri + "\"";
    }

    public /* synthetic */ FirstAuthorization(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "/" : str5);
    }
}
