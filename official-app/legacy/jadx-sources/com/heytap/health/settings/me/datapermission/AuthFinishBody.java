package com.heytap.health.settings.me.datapermission;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lcom/heytap/health/settings/me/datapermission/AuthFinishBody;", "", "authorizeCode", "", "redirectUrl", "openId", "ssoid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthorizeCode", "()Ljava/lang/String;", "getOpenId", "getSsoid", "toString", "settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AuthFinishBody {
    public static final int $stable = 0;

    @NotNull
    private final String authorizeCode;

    @NotNull
    private final String openId;

    @NotNull
    private final String redirectUrl;

    @Nullable
    private final String ssoid;

    public AuthFinishBody(@NotNull String authorizeCode, @NotNull String redirectUrl, @NotNull String openId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(authorizeCode, "authorizeCode");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(openId, "openId");
        this.authorizeCode = authorizeCode;
        this.redirectUrl = redirectUrl;
        this.openId = openId;
        this.ssoid = str;
    }

    @NotNull
    public final String getAuthorizeCode() {
        return this.authorizeCode;
    }

    @NotNull
    public final String getOpenId() {
        return this.openId;
    }

    @Nullable
    public final String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    public String toString() {
        return "AuthFinishBody{authorizeCode: " + this.authorizeCode + ",\nredirectUrl: " + this.redirectUrl + "\nopenId: " + this.openId + "\nssoid: " + this.ssoid + "}";
    }
}
