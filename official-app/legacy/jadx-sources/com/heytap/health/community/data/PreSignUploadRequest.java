package com.heytap.health.community.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/community/data/PreSignUploadRequest;", "", "bizType", "", "clientFileId", "", "fileSuffix", "fileMd5", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBizType", "()I", "getClientFileId", "()Ljava/lang/String;", "getFileMd5", "getFileSuffix", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "community_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PreSignUploadRequest {
    private final int bizType;

    @NotNull
    private final String clientFileId;

    @NotNull
    private final String fileMd5;

    @NotNull
    private final String fileSuffix;

    public PreSignUploadRequest(int i, @NotNull String clientFileId, @NotNull String fileSuffix, @NotNull String fileMd5) {
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        Intrinsics.checkNotNullParameter(fileSuffix, "fileSuffix");
        Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
        this.bizType = i;
        this.clientFileId = clientFileId;
        this.fileSuffix = fileSuffix;
        this.fileMd5 = fileMd5;
    }

    public static /* synthetic */ PreSignUploadRequest copy$default(PreSignUploadRequest preSignUploadRequest, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = preSignUploadRequest.bizType;
        }
        if ((i2 & 2) != 0) {
            str = preSignUploadRequest.clientFileId;
        }
        if ((i2 & 4) != 0) {
            str2 = preSignUploadRequest.fileSuffix;
        }
        if ((i2 & 8) != 0) {
            str3 = preSignUploadRequest.fileMd5;
        }
        return preSignUploadRequest.copy(i, str, str2, str3);
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
    public final String getFileSuffix() {
        return this.fileSuffix;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileMd5() {
        return this.fileMd5;
    }

    @NotNull
    public final PreSignUploadRequest copy(int bizType, @NotNull String clientFileId, @NotNull String fileSuffix, @NotNull String fileMd5) {
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        Intrinsics.checkNotNullParameter(fileSuffix, "fileSuffix");
        Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
        return new PreSignUploadRequest(bizType, clientFileId, fileSuffix, fileMd5);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreSignUploadRequest)) {
            return false;
        }
        PreSignUploadRequest preSignUploadRequest = (PreSignUploadRequest) other;
        return this.bizType == preSignUploadRequest.bizType && Intrinsics.areEqual(this.clientFileId, preSignUploadRequest.clientFileId) && Intrinsics.areEqual(this.fileSuffix, preSignUploadRequest.fileSuffix) && Intrinsics.areEqual(this.fileMd5, preSignUploadRequest.fileMd5);
    }

    public final int getBizType() {
        return this.bizType;
    }

    @NotNull
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @NotNull
    public final String getFileMd5() {
        return this.fileMd5;
    }

    @NotNull
    public final String getFileSuffix() {
        return this.fileSuffix;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.bizType) * 31) + this.clientFileId.hashCode()) * 31) + this.fileSuffix.hashCode()) * 31) + this.fileMd5.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreSignUploadRequest(bizType=" + this.bizType + ", clientFileId=" + this.clientFileId + ", fileSuffix=" + this.fileSuffix + ", fileMd5=" + this.fileMd5 + ")";
    }
}
