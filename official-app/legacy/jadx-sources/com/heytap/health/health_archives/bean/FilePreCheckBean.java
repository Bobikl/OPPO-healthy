package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\"B/\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b\n\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001c¨\u0006#"}, d2 = {"Lcom/heytap/health/health_archives/bean/FilePreCheckBean;", "", "", "component1", "component2", "", "component3", "component4", "md5", "clientFileId", "isArchive", "errorCode", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getMd5", "()Ljava/lang/String;", "setMd5", "(Ljava/lang/String;)V", "getClientFileId", "setClientFileId", "I", "()I", "setArchive", "(I)V", "getErrorCode", "setErrorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "Companion", "a", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class FilePreCheckBean {
    public static final int HAS_ARCHIVE = 1;
    public static final int NO_ARCHIVE = 0;

    @NotNull
    private String clientFileId;
    private int errorCode;
    private int isArchive;

    @NotNull
    private String md5;

    public FilePreCheckBean() {
        this(null, null, 0, 0, 15, null);
    }

    public static /* synthetic */ FilePreCheckBean copy$default(FilePreCheckBean filePreCheckBean, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = filePreCheckBean.md5;
        }
        if ((i3 & 2) != 0) {
            str2 = filePreCheckBean.clientFileId;
        }
        if ((i3 & 4) != 0) {
            i = filePreCheckBean.isArchive;
        }
        if ((i3 & 8) != 0) {
            i2 = filePreCheckBean.errorCode;
        }
        return filePreCheckBean.copy(str, str2, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientFileId() {
        return this.clientFileId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIsArchive() {
        return this.isArchive;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final FilePreCheckBean copy(@NotNull String md5, @NotNull String clientFileId, int isArchive, int errorCode) {
        Intrinsics.checkNotNullParameter(md5, "md5");
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        return new FilePreCheckBean(md5, clientFileId, isArchive, errorCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilePreCheckBean)) {
            return false;
        }
        FilePreCheckBean filePreCheckBean = (FilePreCheckBean) other;
        return Intrinsics.areEqual(this.md5, filePreCheckBean.md5) && Intrinsics.areEqual(this.clientFileId, filePreCheckBean.clientFileId) && this.isArchive == filePreCheckBean.isArchive && this.errorCode == filePreCheckBean.errorCode;
    }

    @NotNull
    public final String getClientFileId() {
        return this.clientFileId;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getMd5() {
        return this.md5;
    }

    public int hashCode() {
        return (((((this.md5.hashCode() * 31) + this.clientFileId.hashCode()) * 31) + Integer.hashCode(this.isArchive)) * 31) + Integer.hashCode(this.errorCode);
    }

    public final int isArchive() {
        return this.isArchive;
    }

    public final void setArchive(int i) {
        this.isArchive = i;
    }

    public final void setClientFileId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientFileId = str;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setMd5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.md5 = str;
    }

    @NotNull
    public String toString() {
        return "FilePreCheckBean(md5=" + this.md5 + ", clientFileId=" + this.clientFileId + ", isArchive=" + this.isArchive + ", errorCode=" + this.errorCode + ")";
    }

    public FilePreCheckBean(@NotNull String md5, @NotNull String clientFileId, int i, int i2) {
        Intrinsics.checkNotNullParameter(md5, "md5");
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        this.md5 = md5;
        this.clientFileId = clientFileId;
        this.isArchive = i;
        this.errorCode = i2;
    }

    public /* synthetic */ FilePreCheckBean(String str, String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? -1 : i2);
    }
}
