package com.heytap.health.community.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, d2 = {"Lcom/heytap/health/community/data/PreSignUploadResponse;", "", "bizType", "", "clientFileId", "", "ocsUrl", "expireIn", "", "modifiedTimestamp", "cloudFileName", "downFileUrl", "(ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V", "getBizType", "()I", "getClientFileId", "()Ljava/lang/String;", "getCloudFileName", "getDownFileUrl", "getExpireIn", "()J", "getModifiedTimestamp", "getOcsUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "community_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PreSignUploadResponse {
    private final int bizType;

    @NotNull
    private final String clientFileId;

    @NotNull
    private final String cloudFileName;

    @NotNull
    private final String downFileUrl;
    private final long expireIn;
    private final long modifiedTimestamp;

    @NotNull
    private final String ocsUrl;

    public PreSignUploadResponse(int i, @NotNull String clientFileId, @NotNull String ocsUrl, long j2, long j3, @NotNull String cloudFileName, @NotNull String downFileUrl) {
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        Intrinsics.checkNotNullParameter(ocsUrl, "ocsUrl");
        Intrinsics.checkNotNullParameter(cloudFileName, "cloudFileName");
        Intrinsics.checkNotNullParameter(downFileUrl, "downFileUrl");
        this.bizType = i;
        this.clientFileId = clientFileId;
        this.ocsUrl = ocsUrl;
        this.expireIn = j2;
        this.modifiedTimestamp = j3;
        this.cloudFileName = cloudFileName;
        this.downFileUrl = downFileUrl;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBizType() {
        return this.bizType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOcsUrl() {
        return this.ocsUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getExpireIn() {
        return this.expireIn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCloudFileName() {
        return this.cloudFileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDownFileUrl() {
        return this.downFileUrl;
    }

    @NotNull
    public final PreSignUploadResponse copy(int bizType, @NotNull String clientFileId, @NotNull String ocsUrl, long expireIn, long modifiedTimestamp, @NotNull String cloudFileName, @NotNull String downFileUrl) {
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        Intrinsics.checkNotNullParameter(ocsUrl, "ocsUrl");
        Intrinsics.checkNotNullParameter(cloudFileName, "cloudFileName");
        Intrinsics.checkNotNullParameter(downFileUrl, "downFileUrl");
        return new PreSignUploadResponse(bizType, clientFileId, ocsUrl, expireIn, modifiedTimestamp, cloudFileName, downFileUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreSignUploadResponse)) {
            return false;
        }
        PreSignUploadResponse preSignUploadResponse = (PreSignUploadResponse) other;
        return this.bizType == preSignUploadResponse.bizType && Intrinsics.areEqual(this.clientFileId, preSignUploadResponse.clientFileId) && Intrinsics.areEqual(this.ocsUrl, preSignUploadResponse.ocsUrl) && this.expireIn == preSignUploadResponse.expireIn && this.modifiedTimestamp == preSignUploadResponse.modifiedTimestamp && Intrinsics.areEqual(this.cloudFileName, preSignUploadResponse.cloudFileName) && Intrinsics.areEqual(this.downFileUrl, preSignUploadResponse.downFileUrl);
    }

    public final int getBizType() {
        return this.bizType;
    }

    @NotNull
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @NotNull
    public final String getCloudFileName() {
        return this.cloudFileName;
    }

    @NotNull
    public final String getDownFileUrl() {
        return this.downFileUrl;
    }

    public final long getExpireIn() {
        return this.expireIn;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    public final String getOcsUrl() {
        return this.ocsUrl;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.bizType) * 31) + this.clientFileId.hashCode()) * 31) + this.ocsUrl.hashCode()) * 31) + Long.hashCode(this.expireIn)) * 31) + Long.hashCode(this.modifiedTimestamp)) * 31) + this.cloudFileName.hashCode()) * 31) + this.downFileUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreSignUploadResponse(bizType=" + this.bizType + ", clientFileId=" + this.clientFileId + ", ocsUrl=" + this.ocsUrl + ", expireIn=" + this.expireIn + ", modifiedTimestamp=" + this.modifiedTimestamp + ", cloudFileName=" + this.cloudFileName + ", downFileUrl=" + this.downFileUrl + ")";
    }
}
