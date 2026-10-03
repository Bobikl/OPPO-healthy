package com.cloud.sdk.cloudstorage.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/cloud/sdk/cloudstorage/api/ServerFileInfoResponse;", "", "code", "", "msg", "", "data", "Lcom/cloud/sdk/cloudstorage/api/ServerFileInfo;", "(ILjava/lang/String;Lcom/cloud/sdk/cloudstorage/api/ServerFileInfo;)V", "getCode", "()I", "getData", "()Lcom/cloud/sdk/cloudstorage/api/ServerFileInfo;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class ServerFileInfoResponse {

    @SerializedName("code")
    @Expose
    private final int code;

    @SerializedName("data")
    @Expose
    @NotNull
    private final ServerFileInfo data;

    @SerializedName("errmsg")
    @Expose
    @NotNull
    private final String msg;

    public ServerFileInfoResponse(int i, @NotNull String msg, @NotNull ServerFileInfo data) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(data, "data");
        this.code = i;
        this.msg = msg;
        this.data = data;
    }

    public static /* synthetic */ ServerFileInfoResponse copy$default(ServerFileInfoResponse serverFileInfoResponse, int i, String str, ServerFileInfo serverFileInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = serverFileInfoResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = serverFileInfoResponse.msg;
        }
        if ((i2 & 4) != 0) {
            serverFileInfo = serverFileInfoResponse.data;
        }
        return serverFileInfoResponse.copy(i, str, serverFileInfo);
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
    public final ServerFileInfo getData() {
        return this.data;
    }

    @NotNull
    public final ServerFileInfoResponse copy(int code, @NotNull String msg, @NotNull ServerFileInfo data) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(data, "data");
        return new ServerFileInfoResponse(code, msg, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerFileInfoResponse)) {
            return false;
        }
        ServerFileInfoResponse serverFileInfoResponse = (ServerFileInfoResponse) other;
        return this.code == serverFileInfoResponse.code && Intrinsics.areEqual(this.msg, serverFileInfoResponse.msg) && Intrinsics.areEqual(this.data, serverFileInfoResponse.data);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final ServerFileInfo getData() {
        return this.data;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        int i = this.code * 31;
        String str = this.msg;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        ServerFileInfo serverFileInfo = this.data;
        return iHashCode + (serverFileInfo != null ? serverFileInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ServerFileInfoResponse(code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + ")";
    }
}
