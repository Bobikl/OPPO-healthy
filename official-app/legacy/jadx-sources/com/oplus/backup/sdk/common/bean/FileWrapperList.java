package com.oplus.backup.sdk.common.bean;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u001d\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/oplus/backup/sdk/common/bean/FileWrapperList;", "", "list", "Ljava/util/ArrayList;", "Lcom/oplus/backup/sdk/common/bean/FileWrapper;", "Lkotlin/collections/ArrayList;", "fromIndex", "", "endIndex", "totalCount", "(Ljava/util/ArrayList;III)V", "getEndIndex", "()I", "getFromIndex", "getList", "()Ljava/util/ArrayList;", "getTotalCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "backup-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class FileWrapperList {
    private final int endIndex;
    private final int fromIndex;

    @Nullable
    private final ArrayList<FileWrapper> list;
    private final int totalCount;

    public FileWrapperList(@Nullable ArrayList<FileWrapper> arrayList, int i, int i2, int i3) {
        this.list = arrayList;
        this.fromIndex = i;
        this.endIndex = i2;
        this.totalCount = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileWrapperList copy$default(FileWrapperList fileWrapperList, ArrayList arrayList, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            arrayList = fileWrapperList.list;
        }
        if ((i4 & 2) != 0) {
            i = fileWrapperList.fromIndex;
        }
        if ((i4 & 4) != 0) {
            i2 = fileWrapperList.endIndex;
        }
        if ((i4 & 8) != 0) {
            i3 = fileWrapperList.totalCount;
        }
        return fileWrapperList.copy(arrayList, i, i2, i3);
    }

    @Nullable
    public final ArrayList<FileWrapper> component1() {
        return this.list;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFromIndex() {
        return this.fromIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    public final FileWrapperList copy(@Nullable ArrayList<FileWrapper> list, int fromIndex, int endIndex, int totalCount) {
        return new FileWrapperList(list, fromIndex, endIndex, totalCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileWrapperList)) {
            return false;
        }
        FileWrapperList fileWrapperList = (FileWrapperList) other;
        return Intrinsics.areEqual(this.list, fileWrapperList.list) && this.fromIndex == fileWrapperList.fromIndex && this.endIndex == fileWrapperList.endIndex && this.totalCount == fileWrapperList.totalCount;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getFromIndex() {
        return this.fromIndex;
    }

    @Nullable
    public final ArrayList<FileWrapper> getList() {
        return this.list;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        ArrayList<FileWrapper> arrayList = this.list;
        return ((((((arrayList == null ? 0 : arrayList.hashCode()) * 31) + Integer.hashCode(this.fromIndex)) * 31) + Integer.hashCode(this.endIndex)) * 31) + Integer.hashCode(this.totalCount);
    }

    @NotNull
    public String toString() {
        return "FileWrapperList(list=" + this.list + ", fromIndex=" + this.fromIndex + ", endIndex=" + this.endIndex + ", totalCount=" + this.totalCount + ')';
    }
}
