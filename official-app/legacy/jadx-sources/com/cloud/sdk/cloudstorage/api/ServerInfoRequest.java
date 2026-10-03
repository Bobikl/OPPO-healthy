package com.cloud.sdk.cloudstorage.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/cloud/sdk/cloudstorage/api/ServerInfoRequest;", "", "appId", "", Fields.SDK_VERSION, "serverVersion", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getAppId", "()Ljava/lang/String;", "getSdkVersion", "getServerVersion", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class ServerInfoRequest {

    @SerializedName("appId")
    @Expose
    @NotNull
    private final String appId;

    @SerializedName(Fields.SDK_VERSION)
    @Expose
    @NotNull
    private final String sdkVersion;

    @SerializedName("serverVersion")
    @Expose
    private final long serverVersion;

    public ServerInfoRequest(@NotNull String appId, @NotNull String sdkVersion, long j2) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.appId = appId;
        this.sdkVersion = sdkVersion;
        this.serverVersion = j2;
    }

    public static /* synthetic */ ServerInfoRequest copy$default(ServerInfoRequest serverInfoRequest, String str, String str2, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverInfoRequest.appId;
        }
        if ((i & 2) != 0) {
            str2 = serverInfoRequest.sdkVersion;
        }
        if ((i & 4) != 0) {
            j2 = serverInfoRequest.serverVersion;
        }
        return serverInfoRequest.copy(str, str2, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getServerVersion() {
        return this.serverVersion;
    }

    @NotNull
    public final ServerInfoRequest copy(@NotNull String appId, @NotNull String sdkVersion, long serverVersion) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        return new ServerInfoRequest(appId, sdkVersion, serverVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerInfoRequest)) {
            return false;
        }
        ServerInfoRequest serverInfoRequest = (ServerInfoRequest) other;
        return Intrinsics.areEqual(this.appId, serverInfoRequest.appId) && Intrinsics.areEqual(this.sdkVersion, serverInfoRequest.sdkVersion) && this.serverVersion == serverInfoRequest.serverVersion;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final long getServerVersion() {
        return this.serverVersion;
    }

    public int hashCode() {
        String str = this.appId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sdkVersion;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j2 = this.serverVersion;
        return iHashCode2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    @NotNull
    public String toString() {
        return "ServerInfoRequest(appId=" + this.appId + ", sdkVersion=" + this.sdkVersion + ", serverVersion=" + this.serverVersion + ")";
    }

    public /* synthetic */ ServerInfoRequest(String str, String str2, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 0L : j2);
    }
}
