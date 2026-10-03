package com.heytap.health.watchface.provider.nfc;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/watchface/provider/nfc/ShareDataRsp;", "", "taskId", "", "code", "", "process", "(Ljava/lang/String;II)V", "getCode", "()I", "getProcess", "getTaskId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ShareDataRsp {
    private final int code;
    private final int process;

    @NotNull
    private final String taskId;

    public ShareDataRsp(@NotNull String taskId, int i, int i2) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        this.taskId = taskId;
        this.code = i;
        this.process = i2;
    }

    public static /* synthetic */ ShareDataRsp copy$default(ShareDataRsp shareDataRsp, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = shareDataRsp.taskId;
        }
        if ((i3 & 2) != 0) {
            i = shareDataRsp.code;
        }
        if ((i3 & 4) != 0) {
            i2 = shareDataRsp.process;
        }
        return shareDataRsp.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getProcess() {
        return this.process;
    }

    @NotNull
    public final ShareDataRsp copy(@NotNull String taskId, int code, int process) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        return new ShareDataRsp(taskId, code, process);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareDataRsp)) {
            return false;
        }
        ShareDataRsp shareDataRsp = (ShareDataRsp) other;
        return Intrinsics.areEqual(this.taskId, shareDataRsp.taskId) && this.code == shareDataRsp.code && this.process == shareDataRsp.process;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getProcess() {
        return this.process;
    }

    @NotNull
    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return (((this.taskId.hashCode() * 31) + Integer.hashCode(this.code)) * 31) + Integer.hashCode(this.process);
    }

    @NotNull
    public String toString() {
        return "ShareDataRsp(taskId=" + this.taskId + ", code=" + this.code + ", process=" + this.process + ")";
    }
}
