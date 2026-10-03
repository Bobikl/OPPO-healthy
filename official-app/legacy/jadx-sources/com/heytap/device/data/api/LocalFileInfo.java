package com.heytap.device.data.api;

import androidx.annotation.Keep;
import com.heytap.log.consts.LogSenderConst;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/device/data/api/LocalFileInfo;", "", LogSenderConst.FILENAME, "", "(Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LocalFileInfo {

    @NotNull
    private final String fileName;

    public LocalFileInfo(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.fileName = fileName;
    }

    public static /* synthetic */ LocalFileInfo copy$default(LocalFileInfo localFileInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localFileInfo.fileName;
        }
        return localFileInfo.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final LocalFileInfo copy(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new LocalFileInfo(fileName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocalFileInfo) && Intrinsics.areEqual(this.fileName, ((LocalFileInfo) other).fileName);
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public int hashCode() {
        return this.fileName.hashCode();
    }

    @NotNull
    public String toString() {
        return "LocalFileInfo(fileName=" + this.fileName + ")";
    }
}
