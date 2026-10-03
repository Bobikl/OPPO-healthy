package com.oplus.backup.sdk.common.bean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J)\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/oplus/backup/sdk/common/bean/FileWrapper;", "", "type", "", "path", "", "length", "", "(ILjava/lang/String;J)V", "isFile", "", "()Z", "isFolder", "getLength", "()J", "setLength", "(J)V", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "getType", "()I", "setType", "(I)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "backup-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class FileWrapper {
    private long length;

    @Nullable
    private String path;
    private int type;

    public FileWrapper() {
        this(0, null, 0L, 7, null);
    }

    public static /* synthetic */ FileWrapper copy$default(FileWrapper fileWrapper, int i, String str, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fileWrapper.type;
        }
        if ((i2 & 2) != 0) {
            str = fileWrapper.path;
        }
        if ((i2 & 4) != 0) {
            j2 = fileWrapper.length;
        }
        return fileWrapper.copy(i, str, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLength() {
        return this.length;
    }

    @NotNull
    public final FileWrapper copy(int type, @Nullable String path, long length) {
        return new FileWrapper(type, path, length);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileWrapper)) {
            return false;
        }
        FileWrapper fileWrapper = (FileWrapper) other;
        return this.type == fileWrapper.type && Intrinsics.areEqual(this.path, fileWrapper.path) && this.length == fileWrapper.length;
    }

    public final long getLength() {
        return this.length;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type) * 31;
        String str = this.path;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.length);
    }

    public final boolean isFile() {
        return this.type == 8;
    }

    public final boolean isFolder() {
        return this.type == 4;
    }

    public final void setLength(long j2) {
        this.length = j2;
    }

    public final void setPath(@Nullable String str) {
        this.path = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "FileWrapper(type=" + this.type + ", path=" + ((Object) this.path) + ", length=" + this.length + ')';
    }

    public FileWrapper(int i, @Nullable String str, long j2) {
        this.type = i;
        this.path = str;
        this.length = j2;
    }

    public /* synthetic */ FileWrapper(int i, String str, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0L : j2);
    }
}
