package com.heytap.health.community.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/community/data/PostRespData;", "", "dataList", "", "Lcom/heytap/health/community/data/Post;", "scrollId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getDataList", "()Ljava/util/List;", "getScrollId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PostRespData {

    @NotNull
    private final List<Post> dataList;

    @Nullable
    private final String scrollId;

    public PostRespData(@NotNull List<Post> dataList, @Nullable String str) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
        this.scrollId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostRespData copy$default(PostRespData postRespData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = postRespData.dataList;
        }
        if ((i & 2) != 0) {
            str = postRespData.scrollId;
        }
        return postRespData.copy(list, str);
    }

    @NotNull
    public final List<Post> component1() {
        return this.dataList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScrollId() {
        return this.scrollId;
    }

    @NotNull
    public final PostRespData copy(@NotNull List<Post> dataList, @Nullable String scrollId) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return new PostRespData(dataList, scrollId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostRespData)) {
            return false;
        }
        PostRespData postRespData = (PostRespData) other;
        return Intrinsics.areEqual(this.dataList, postRespData.dataList) && Intrinsics.areEqual(this.scrollId, postRespData.scrollId);
    }

    @NotNull
    public final List<Post> getDataList() {
        return this.dataList;
    }

    @Nullable
    public final String getScrollId() {
        return this.scrollId;
    }

    public int hashCode() {
        int iHashCode = this.dataList.hashCode() * 31;
        String str = this.scrollId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "PostRespData(dataList=" + this.dataList + ", scrollId=" + this.scrollId + ")";
    }
}
