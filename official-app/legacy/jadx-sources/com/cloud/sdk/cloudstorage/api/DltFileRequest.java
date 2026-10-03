package com.cloud.sdk.cloudstorage.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/cloud/sdk/cloudstorage/api/DltFileRequest;", "", "fileKey", "", "(Ljava/lang/String;)V", "getFileKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class DltFileRequest {

    @SerializedName("key")
    @Expose
    @NotNull
    private final String fileKey;

    public DltFileRequest(@NotNull String fileKey) {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        this.fileKey = fileKey;
    }

    public static /* synthetic */ DltFileRequest copy$default(DltFileRequest dltFileRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dltFileRequest.fileKey;
        }
        return dltFileRequest.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileKey() {
        return this.fileKey;
    }

    @NotNull
    public final DltFileRequest copy(@NotNull String fileKey) {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        return new DltFileRequest(fileKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof DltFileRequest) && Intrinsics.areEqual(this.fileKey, ((DltFileRequest) other).fileKey);
        }
        return true;
    }

    @NotNull
    public final String getFileKey() {
        return this.fileKey;
    }

    public int hashCode() {
        String str = this.fileKey;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "DltFileRequest(fileKey=" + this.fileKey + ")";
    }
}
