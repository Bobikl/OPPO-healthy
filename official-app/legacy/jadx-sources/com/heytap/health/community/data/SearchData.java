package com.heytap.health.community.data;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/community/data/SearchData;", ExifInterface.GPS_DIRECTION_TRUE, "", "dataList", "", "scrollId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getDataList", "()Ljava/util/List;", "getScrollId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SearchData<T> {

    @NotNull
    private final List<T> dataList;

    @NotNull
    private final String scrollId;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchData(@NotNull List<? extends T> dataList, @NotNull String scrollId) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(scrollId, "scrollId");
        this.dataList = dataList;
        this.scrollId = scrollId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchData copy$default(SearchData searchData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchData.dataList;
        }
        if ((i & 2) != 0) {
            str = searchData.scrollId;
        }
        return searchData.copy(list, str);
    }

    @NotNull
    public final List<T> component1() {
        return this.dataList;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScrollId() {
        return this.scrollId;
    }

    @NotNull
    public final SearchData<T> copy(@NotNull List<? extends T> dataList, @NotNull String scrollId) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(scrollId, "scrollId");
        return new SearchData<>(dataList, scrollId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchData)) {
            return false;
        }
        SearchData searchData = (SearchData) other;
        return Intrinsics.areEqual(this.dataList, searchData.dataList) && Intrinsics.areEqual(this.scrollId, searchData.scrollId);
    }

    @NotNull
    public final List<T> getDataList() {
        return this.dataList;
    }

    @NotNull
    public final String getScrollId() {
        return this.scrollId;
    }

    public int hashCode() {
        return (this.dataList.hashCode() * 31) + this.scrollId.hashCode();
    }

    @NotNull
    public String toString() {
        return "SearchData(dataList=" + this.dataList + ", scrollId=" + this.scrollId + ")";
    }
}
