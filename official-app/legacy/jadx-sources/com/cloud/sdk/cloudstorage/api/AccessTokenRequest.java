package com.cloud.sdk.cloudstorage.api;

import com.alipay.sdk.m.x.c;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/cloud/sdk/cloudstorage/api/AccessTokenRequest;", "", "appId", "", Fields.SDK_VERSION, "authToken", "apiVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiVersion", "()Ljava/lang/String;", "getAppId", "getAuthToken", "getSdkVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class AccessTokenRequest {

    @SerializedName("apiVersion")
    @Expose
    @NotNull
    private final String apiVersion;

    @SerializedName("appId")
    @Expose
    @NotNull
    private final String appId;

    @SerializedName("authToken")
    @Expose
    @NotNull
    private final String authToken;

    @SerializedName(Fields.SDK_VERSION)
    @Expose
    @NotNull
    private final String sdkVersion;

    public AccessTokenRequest(@NotNull String appId, @NotNull String sdkVersion, @NotNull String authToken, @NotNull String apiVersion) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(authToken, "authToken");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        this.appId = appId;
        this.sdkVersion = sdkVersion;
        this.authToken = authToken;
        this.apiVersion = apiVersion;
    }

    public static /* synthetic */ AccessTokenRequest copy$default(AccessTokenRequest accessTokenRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accessTokenRequest.appId;
        }
        if ((i & 2) != 0) {
            str2 = accessTokenRequest.sdkVersion;
        }
        if ((i & 4) != 0) {
            str3 = accessTokenRequest.authToken;
        }
        if ((i & 8) != 0) {
            str4 = accessTokenRequest.apiVersion;
        }
        return accessTokenRequest.copy(str, str2, str3, str4);
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

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthToken() {
        return this.authToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApiVersion() {
        return this.apiVersion;
    }

    @NotNull
    public final AccessTokenRequest copy(@NotNull String appId, @NotNull String sdkVersion, @NotNull String authToken, @NotNull String apiVersion) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(authToken, "authToken");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        return new AccessTokenRequest(appId, sdkVersion, authToken, apiVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessTokenRequest)) {
            return false;
        }
        AccessTokenRequest accessTokenRequest = (AccessTokenRequest) other;
        return Intrinsics.areEqual(this.appId, accessTokenRequest.appId) && Intrinsics.areEqual(this.sdkVersion, accessTokenRequest.sdkVersion) && Intrinsics.areEqual(this.authToken, accessTokenRequest.authToken) && Intrinsics.areEqual(this.apiVersion, accessTokenRequest.apiVersion);
    }

    @NotNull
    public final String getApiVersion() {
        return this.apiVersion;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getAuthToken() {
        return this.authToken;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        String str = this.appId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sdkVersion;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.authToken;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.apiVersion;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccessTokenRequest(appId=" + this.appId + ", sdkVersion=" + this.sdkVersion + ", authToken=" + this.authToken + ", apiVersion=" + this.apiVersion + ")";
    }

    public /* synthetic */ AccessTokenRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? c.d : str4);
    }
}
