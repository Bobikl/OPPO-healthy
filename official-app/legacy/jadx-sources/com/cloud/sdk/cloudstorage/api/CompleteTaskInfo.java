package com.cloud.sdk.cloudstorage.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/cloud/sdk/cloudstorage/api/CompleteTaskInfo;", "", "hash", "", "key", "bucket", "fsize", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getBucket", "()Ljava/lang/String;", "getFsize", "()J", "getHash", "getKey", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class CompleteTaskInfo {

    @SerializedName("bucket")
    @Expose
    @NotNull
    private final String bucket;

    @SerializedName("fsize")
    @Expose
    private final long fsize;

    @SerializedName("hash")
    @Expose
    @NotNull
    private final String hash;

    @SerializedName("key")
    @Expose
    @NotNull
    private final String key;

    public CompleteTaskInfo(@NotNull String hash, @NotNull String key, @NotNull String bucket, long j2) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bucket, "bucket");
        this.hash = hash;
        this.key = key;
        this.bucket = bucket;
        this.fsize = j2;
    }

    public static /* synthetic */ CompleteTaskInfo copy$default(CompleteTaskInfo completeTaskInfo, String str, String str2, String str3, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = completeTaskInfo.hash;
        }
        if ((i & 2) != 0) {
            str2 = completeTaskInfo.key;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = completeTaskInfo.bucket;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j2 = completeTaskInfo.fsize;
        }
        return completeTaskInfo.copy(str, str4, str5, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBucket() {
        return this.bucket;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getFsize() {
        return this.fsize;
    }

    @NotNull
    public final CompleteTaskInfo copy(@NotNull String hash, @NotNull String key, @NotNull String bucket, long fsize) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bucket, "bucket");
        return new CompleteTaskInfo(hash, key, bucket, fsize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompleteTaskInfo)) {
            return false;
        }
        CompleteTaskInfo completeTaskInfo = (CompleteTaskInfo) other;
        return Intrinsics.areEqual(this.hash, completeTaskInfo.hash) && Intrinsics.areEqual(this.key, completeTaskInfo.key) && Intrinsics.areEqual(this.bucket, completeTaskInfo.bucket) && this.fsize == completeTaskInfo.fsize;
    }

    @NotNull
    public final String getBucket() {
        return this.bucket;
    }

    public final long getFsize() {
        return this.fsize;
    }

    @NotNull
    public final String getHash() {
        return this.hash;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        String str = this.hash;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.key;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bucket;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j2 = this.fsize;
        return iHashCode3 + ((int) (j2 ^ (j2 >>> 32)));
    }

    @NotNull
    public String toString() {
        return "CompleteTaskInfo(hash=" + this.hash + ", key=" + this.key + ", bucket=" + this.bucket + ", fsize=" + this.fsize + ")";
    }
}
