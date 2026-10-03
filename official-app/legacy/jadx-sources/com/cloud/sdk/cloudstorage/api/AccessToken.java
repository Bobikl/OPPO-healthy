package com.cloud.sdk.cloudstorage.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0010\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\nJ\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/cloud/sdk/cloudstorage/api/AccessToken;", "", "accessToken", "", "aesSecretKey", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getAesSecretKey", "timestamp", "", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "isExpired", "expiredTime", "toString", "Companion", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class AccessToken {
    public static final long TIMEOUT_DEBUG = 110000;
    public static final long TIMEOUT_RELEASE = 1790000;

    @SerializedName("accessToken")
    @Expose
    @NotNull
    private final String accessToken;

    @SerializedName("aesSecretKey")
    @NotNull
    private final String aesSecretKey;
    private final long timestamp;

    public AccessToken(@NotNull String accessToken, @NotNull String aesSecretKey) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(aesSecretKey, "aesSecretKey");
        this.accessToken = accessToken;
        this.aesSecretKey = aesSecretKey;
        this.timestamp = System.currentTimeMillis();
    }

    public static /* synthetic */ AccessToken copy$default(AccessToken accessToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accessToken.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = accessToken.aesSecretKey;
        }
        return accessToken.copy(str, str2);
    }

    public static /* synthetic */ boolean isExpired$default(AccessToken accessToken, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = TIMEOUT_RELEASE;
        }
        return accessToken.isExpired(j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAesSecretKey() {
        return this.aesSecretKey;
    }

    @NotNull
    public final AccessToken copy(@NotNull String accessToken, @NotNull String aesSecretKey) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(aesSecretKey, "aesSecretKey");
        return new AccessToken(accessToken, aesSecretKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) other;
        return Intrinsics.areEqual(this.accessToken, accessToken.accessToken) && Intrinsics.areEqual(this.aesSecretKey, accessToken.aesSecretKey);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getAesSecretKey() {
        return this.aesSecretKey;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.accessToken;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.aesSecretKey;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isExpired(long expiredTime) {
        return System.currentTimeMillis() - this.timestamp > expiredTime;
    }

    @NotNull
    public String toString() {
        return "AccessToken(accessToken=" + this.accessToken + ", aesSecretKey=" + this.aesSecretKey + ")";
    }
}
