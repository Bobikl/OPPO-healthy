package com.heytap.health.esim.nec.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/esim/nec/bean/WWWAuthenticate;", "", "()V", ConnectIdLogic.PARAM_ALGORITHM, "", "getAlgorithm", "()Ljava/lang/String;", "setAlgorithm", "(Ljava/lang/String;)V", "nonce", "getNonce", "setNonce", "opaque", "getOpaque", "setOpaque", "qop", "getQop", "setQop", "realm", "getRealm", "setRealm", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WWWAuthenticate {
    public static final int $stable = 8;

    @NotNull
    private String realm = "";

    @NotNull
    private String nonce = "";

    @NotNull
    private String algorithm = "";

    @NotNull
    private String opaque = "";

    @NotNull
    private String qop = "";

    @NotNull
    public final String getAlgorithm() {
        return this.algorithm;
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

    public final void setAlgorithm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.algorithm = str;
    }

    public final void setNonce(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nonce = str;
    }

    public final void setOpaque(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.opaque = str;
    }

    public final void setQop(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.qop = str;
    }

    public final void setRealm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.realm = str;
    }

    @NotNull
    public String toString() {
        return "WWWAuthenticate(realm='" + this.realm + "', nonce='" + this.nonce + "', algorithm='" + this.algorithm + "', opaque='" + this.opaque + "', qop='" + this.qop + "')";
    }
}
