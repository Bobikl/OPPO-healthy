package com.cloud.sdk.cloudstorage.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/cloud/sdk/cloudstorage/api/CompleteTaskResponse;", "", "code", "", "msg", "", UTraceSQLiteHelperKt.COL_INFO, "Lcom/cloud/sdk/cloudstorage/api/CompleteTaskInfo;", "(ILjava/lang/String;Lcom/cloud/sdk/cloudstorage/api/CompleteTaskInfo;)V", "getCode", "()I", "getInfo", "()Lcom/cloud/sdk/cloudstorage/api/CompleteTaskInfo;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class CompleteTaskResponse {

    @SerializedName("code")
    @Expose
    private final int code;

    @SerializedName("data")
    @Expose
    @NotNull
    private final CompleteTaskInfo info;

    @SerializedName("errmsg")
    @Expose
    @NotNull
    private final String msg;

    public CompleteTaskResponse(int i, @NotNull String msg, @NotNull CompleteTaskInfo info) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(info, "info");
        this.code = i;
        this.msg = msg;
        this.info = info;
    }

    public static /* synthetic */ CompleteTaskResponse copy$default(CompleteTaskResponse completeTaskResponse, int i, String str, CompleteTaskInfo completeTaskInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = completeTaskResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = completeTaskResponse.msg;
        }
        if ((i2 & 4) != 0) {
            completeTaskInfo = completeTaskResponse.info;
        }
        return completeTaskResponse.copy(i, str, completeTaskInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CompleteTaskInfo getInfo() {
        return this.info;
    }

    @NotNull
    public final CompleteTaskResponse copy(int code, @NotNull String msg, @NotNull CompleteTaskInfo info) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(info, "info");
        return new CompleteTaskResponse(code, msg, info);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompleteTaskResponse)) {
            return false;
        }
        CompleteTaskResponse completeTaskResponse = (CompleteTaskResponse) other;
        return this.code == completeTaskResponse.code && Intrinsics.areEqual(this.msg, completeTaskResponse.msg) && Intrinsics.areEqual(this.info, completeTaskResponse.info);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final CompleteTaskInfo getInfo() {
        return this.info;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        int i = this.code * 31;
        String str = this.msg;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        CompleteTaskInfo completeTaskInfo = this.info;
        return iHashCode + (completeTaskInfo != null ? completeTaskInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CompleteTaskResponse(code=" + this.code + ", msg=" + this.msg + ", info=" + this.info + ")";
    }
}
