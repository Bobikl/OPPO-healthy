package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/health_archives/bean/DeleteFileRequestBean;", "", "key", "", "clientFileIdList", "", "(Ljava/lang/String;Ljava/util/List;)V", "getClientFileIdList", "()Ljava/util/List;", "setClientFileIdList", "(Ljava/util/List;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DeleteFileRequestBean {

    @Nullable
    private List<String> clientFileIdList;

    @Nullable
    private String key;

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteFileRequestBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeleteFileRequestBean copy$default(DeleteFileRequestBean deleteFileRequestBean, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deleteFileRequestBean.key;
        }
        if ((i & 2) != 0) {
            list = deleteFileRequestBean.clientFileIdList;
        }
        return deleteFileRequestBean.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final List<String> component2() {
        return this.clientFileIdList;
    }

    @NotNull
    public final DeleteFileRequestBean copy(@Nullable String key, @Nullable List<String> clientFileIdList) {
        return new DeleteFileRequestBean(key, clientFileIdList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteFileRequestBean)) {
            return false;
        }
        DeleteFileRequestBean deleteFileRequestBean = (DeleteFileRequestBean) other;
        return Intrinsics.areEqual(this.key, deleteFileRequestBean.key) && Intrinsics.areEqual(this.clientFileIdList, deleteFileRequestBean.clientFileIdList);
    }

    @Nullable
    public final List<String> getClientFileIdList() {
        return this.clientFileIdList;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.clientFileIdList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setClientFileIdList(@Nullable List<String> list) {
        this.clientFileIdList = list;
    }

    public final void setKey(@Nullable String str) {
        this.key = str;
    }

    @NotNull
    public String toString() {
        return "DeleteFileRequestBean(key=" + this.key + ", clientFileIdList=" + this.clientFileIdList + ")";
    }

    public DeleteFileRequestBean(@Nullable String str, @Nullable List<String> list) {
        this.key = str;
        this.clientFileIdList = list;
    }

    public /* synthetic */ DeleteFileRequestBean(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
