package com.oplus.backup.sdk.common.bean;

import com.heytap.accessory.file.model.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/oplus/backup/sdk/common/bean/TransferFile;", "", "srcPath", "", Constant.DEST_PATH, "type", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getDestPath", "()Ljava/lang/String;", "setDestPath", "(Ljava/lang/String;)V", "getSrcPath", "setSrcPath", "getType", "()I", "setType", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "backup-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class TransferFile {

    @NotNull
    private String destPath;

    @NotNull
    private String srcPath;
    private int type;

    public TransferFile() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ TransferFile copy$default(TransferFile transferFile, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = transferFile.srcPath;
        }
        if ((i2 & 2) != 0) {
            str2 = transferFile.destPath;
        }
        if ((i2 & 4) != 0) {
            i = transferFile.type;
        }
        return transferFile.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSrcPath() {
        return this.srcPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDestPath() {
        return this.destPath;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final TransferFile copy(@NotNull String srcPath, @NotNull String destPath, int type) {
        Intrinsics.checkNotNullParameter(srcPath, "srcPath");
        Intrinsics.checkNotNullParameter(destPath, "destPath");
        return new TransferFile(srcPath, destPath, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferFile)) {
            return false;
        }
        TransferFile transferFile = (TransferFile) other;
        return Intrinsics.areEqual(this.srcPath, transferFile.srcPath) && Intrinsics.areEqual(this.destPath, transferFile.destPath) && this.type == transferFile.type;
    }

    @NotNull
    public final String getDestPath() {
        return this.destPath;
    }

    @NotNull
    public final String getSrcPath() {
        return this.srcPath;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.srcPath.hashCode() * 31) + this.destPath.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    public final void setDestPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.destPath = str;
    }

    public final void setSrcPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.srcPath = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "TransferFile(srcPath=" + this.srcPath + ", destPath=" + this.destPath + ", type=" + this.type + ')';
    }

    public TransferFile(@NotNull String srcPath, @NotNull String destPath, int i) {
        Intrinsics.checkNotNullParameter(srcPath, "srcPath");
        Intrinsics.checkNotNullParameter(destPath, "destPath");
        this.srcPath = srcPath;
        this.destPath = destPath;
        this.type = i;
    }

    public /* synthetic */ TransferFile(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 8 : i);
    }
}
