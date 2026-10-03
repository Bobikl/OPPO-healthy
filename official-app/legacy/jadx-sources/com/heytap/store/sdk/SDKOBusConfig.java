package com.heytap.store.sdk;

import androidx.annotation.Keep;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.f04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/heytap/store/sdk/SDKOBusConfig;", "", "appId", "", HttpConst.APP_KEY, "", f04.JSON_KEY_APP_SECRET, "(JLjava/lang/String;Ljava/lang/String;)V", "getAppId", "()J", "getAppKey", "()Ljava/lang/String;", "getAppSecret", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "heytapstoresdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SDKOBusConfig {
    private final long appId;

    @NotNull
    private final String appKey;

    @NotNull
    private final String appSecret;

    public SDKOBusConfig(long j2, @NotNull String appKey, @NotNull String appSecret) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(appSecret, "appSecret");
        this.appId = j2;
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    public static /* synthetic */ SDKOBusConfig copy$default(SDKOBusConfig sDKOBusConfig, long j2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = sDKOBusConfig.appId;
        }
        if ((i & 2) != 0) {
            str = sDKOBusConfig.appKey;
        }
        if ((i & 4) != 0) {
            str2 = sDKOBusConfig.appSecret;
        }
        return sDKOBusConfig.copy(j2, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppKey() {
        return this.appKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppSecret() {
        return this.appSecret;
    }

    @NotNull
    public final SDKOBusConfig copy(long appId, @NotNull String appKey, @NotNull String appSecret) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(appSecret, "appSecret");
        return new SDKOBusConfig(appId, appKey, appSecret);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SDKOBusConfig)) {
            return false;
        }
        SDKOBusConfig sDKOBusConfig = (SDKOBusConfig) other;
        return this.appId == sDKOBusConfig.appId && Intrinsics.areEqual(this.appKey, sDKOBusConfig.appKey) && Intrinsics.areEqual(this.appSecret, sDKOBusConfig.appSecret);
    }

    public final long getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getAppKey() {
        return this.appKey;
    }

    @NotNull
    public final String getAppSecret() {
        return this.appSecret;
    }

    public int hashCode() {
        return (((Long.hashCode(this.appId) * 31) + this.appKey.hashCode()) * 31) + this.appSecret.hashCode();
    }

    @NotNull
    public String toString() {
        return "SDKOBusConfig(appId=" + this.appId + ", appKey=" + this.appKey + ", appSecret=" + this.appSecret + ')';
    }
}
