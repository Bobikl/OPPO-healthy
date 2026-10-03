package com.heytap.health.watchface.business.manager.bean;

import androidx.annotation.Keep;
import com.heytap.health.watchface.network.bean.WatchFaceHomeCard;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/watchface/business/manager/bean/SearchRsp;", "", "scrollId", "", "dataList", "", "Lcom/heytap/health/watchface/network/bean/WatchFaceHomeCard$Item;", "(Ljava/lang/String;Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "getScrollId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SearchRsp {

    @NotNull
    private final List<WatchFaceHomeCard.Item> dataList;

    @NotNull
    private final String scrollId;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchRsp(@NotNull String scrollId, @NotNull List<? extends WatchFaceHomeCard.Item> dataList) {
        Intrinsics.checkNotNullParameter(scrollId, "scrollId");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.scrollId = scrollId;
        this.dataList = dataList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchRsp copy$default(SearchRsp searchRsp, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchRsp.scrollId;
        }
        if ((i & 2) != 0) {
            list = searchRsp.dataList;
        }
        return searchRsp.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScrollId() {
        return this.scrollId;
    }

    @NotNull
    public final List<WatchFaceHomeCard.Item> component2() {
        return this.dataList;
    }

    @NotNull
    public final SearchRsp copy(@NotNull String scrollId, @NotNull List<? extends WatchFaceHomeCard.Item> dataList) {
        Intrinsics.checkNotNullParameter(scrollId, "scrollId");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return new SearchRsp(scrollId, dataList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchRsp)) {
            return false;
        }
        SearchRsp searchRsp = (SearchRsp) other;
        return Intrinsics.areEqual(this.scrollId, searchRsp.scrollId) && Intrinsics.areEqual(this.dataList, searchRsp.dataList);
    }

    @NotNull
    public final List<WatchFaceHomeCard.Item> getDataList() {
        return this.dataList;
    }

    @NotNull
    public final String getScrollId() {
        return this.scrollId;
    }

    public int hashCode() {
        return (this.scrollId.hashCode() * 31) + this.dataList.hashCode();
    }

    @NotNull
    public String toString() {
        return "SearchRsp(scrollId=" + this.scrollId + ", dataList=" + this.dataList + ")";
    }
}
