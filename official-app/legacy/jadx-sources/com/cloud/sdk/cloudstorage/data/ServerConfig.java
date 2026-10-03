package com.cloud.sdk.cloudstorage.data;

import com.cloud.sdk.cloudstorage.api.AccessToken;
import com.cloud.sdk.cloudstorage.api.ServerInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/cloud/sdk/cloudstorage/data/ServerConfig;", "", "accessToken", "Lcom/cloud/sdk/cloudstorage/api/AccessToken;", "serverInfo", "Lcom/cloud/sdk/cloudstorage/api/ServerInfo;", "(Lcom/cloud/sdk/cloudstorage/api/AccessToken;Lcom/cloud/sdk/cloudstorage/api/ServerInfo;)V", "getAccessToken", "()Lcom/cloud/sdk/cloudstorage/api/AccessToken;", "getServerInfo", "()Lcom/cloud/sdk/cloudstorage/api/ServerInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class ServerConfig {

    @NotNull
    private final AccessToken accessToken;

    @NotNull
    private final ServerInfo serverInfo;

    public ServerConfig(@NotNull AccessToken accessToken, @NotNull ServerInfo serverInfo) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(serverInfo, "serverInfo");
        this.accessToken = accessToken;
        this.serverInfo = serverInfo;
    }

    public static /* synthetic */ ServerConfig copy$default(ServerConfig serverConfig, AccessToken accessToken, ServerInfo serverInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            accessToken = serverConfig.accessToken;
        }
        if ((i & 2) != 0) {
            serverInfo = serverConfig.serverInfo;
        }
        return serverConfig.copy(accessToken, serverInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ServerInfo getServerInfo() {
        return this.serverInfo;
    }

    @NotNull
    public final ServerConfig copy(@NotNull AccessToken accessToken, @NotNull ServerInfo serverInfo) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(serverInfo, "serverInfo");
        return new ServerConfig(accessToken, serverInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerConfig)) {
            return false;
        }
        ServerConfig serverConfig = (ServerConfig) other;
        return Intrinsics.areEqual(this.accessToken, serverConfig.accessToken) && Intrinsics.areEqual(this.serverInfo, serverConfig.serverInfo);
    }

    @NotNull
    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final ServerInfo getServerInfo() {
        return this.serverInfo;
    }

    public int hashCode() {
        AccessToken accessToken = this.accessToken;
        int iHashCode = (accessToken != null ? accessToken.hashCode() : 0) * 31;
        ServerInfo serverInfo = this.serverInfo;
        return iHashCode + (serverInfo != null ? serverInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ServerConfig(accessToken=" + this.accessToken + ", serverInfo=" + this.serverInfo + ")";
    }
}
