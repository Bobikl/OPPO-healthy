package com.heytap.store.homemodule.data;

import com.oplus.aiunit.vision.hp6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jk\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u0006/"}, d2 = {"Lcom/heytap/store/homemodule/data/HomePagingRecommendData;", "", "row", "", "col", "itemConfig", "Lcom/heytap/store/homemodule/data/ItemConfig;", "currPage", hp6.DETAIL_ENTRY, "", "Lcom/heytap/store/homemodule/data/HomeItemDetail;", "headerInfo", "Lcom/heytap/store/homemodule/data/HomeItemHeaderInfo;", "moduleCode", "", "statisticTitle", "weight", "(IILcom/heytap/store/homemodule/data/ItemConfig;ILjava/util/List;Lcom/heytap/store/homemodule/data/HomeItemHeaderInfo;Ljava/lang/String;Ljava/lang/String;I)V", "getCol", "()I", "getCurrPage", "getDetails", "()Ljava/util/List;", "getHeaderInfo", "()Lcom/heytap/store/homemodule/data/HomeItemHeaderInfo;", "getItemConfig", "()Lcom/heytap/store/homemodule/data/ItemConfig;", "getModuleCode", "()Ljava/lang/String;", "getRow", "getStatisticTitle", "getWeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HomePagingRecommendData {
    private final int col;
    private final int currPage;

    @NotNull
    private final List<HomeItemDetail> details;

    @Nullable
    private final HomeItemHeaderInfo headerInfo;

    @NotNull
    private final ItemConfig itemConfig;

    @NotNull
    private final String moduleCode;
    private final int row;

    @NotNull
    private final String statisticTitle;
    private final int weight;

    /* JADX WARN: Multi-variable type inference failed */
    public HomePagingRecommendData(int i, int i2, @NotNull ItemConfig itemConfig, int i3, @NotNull List<? extends HomeItemDetail> details, @Nullable HomeItemHeaderInfo homeItemHeaderInfo, @NotNull String moduleCode, @NotNull String statisticTitle, int i4) {
        Intrinsics.checkNotNullParameter(itemConfig, "itemConfig");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(moduleCode, "moduleCode");
        Intrinsics.checkNotNullParameter(statisticTitle, "statisticTitle");
        this.row = i;
        this.col = i2;
        this.itemConfig = itemConfig;
        this.currPage = i3;
        this.details = details;
        this.headerInfo = homeItemHeaderInfo;
        this.moduleCode = moduleCode;
        this.statisticTitle = statisticTitle;
        this.weight = i4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRow() {
        return this.row;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCol() {
        return this.col;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ItemConfig getItemConfig() {
        return this.itemConfig;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCurrPage() {
        return this.currPage;
    }

    @NotNull
    public final List<HomeItemDetail> component5() {
        return this.details;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HomeItemHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatisticTitle() {
        return this.statisticTitle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    @NotNull
    public final HomePagingRecommendData copy(int row, int col, @NotNull ItemConfig itemConfig, int currPage, @NotNull List<? extends HomeItemDetail> details, @Nullable HomeItemHeaderInfo headerInfo, @NotNull String moduleCode, @NotNull String statisticTitle, int weight) {
        Intrinsics.checkNotNullParameter(itemConfig, "itemConfig");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(moduleCode, "moduleCode");
        Intrinsics.checkNotNullParameter(statisticTitle, "statisticTitle");
        return new HomePagingRecommendData(row, col, itemConfig, currPage, details, headerInfo, moduleCode, statisticTitle, weight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomePagingRecommendData)) {
            return false;
        }
        HomePagingRecommendData homePagingRecommendData = (HomePagingRecommendData) other;
        return this.row == homePagingRecommendData.row && this.col == homePagingRecommendData.col && Intrinsics.areEqual(this.itemConfig, homePagingRecommendData.itemConfig) && this.currPage == homePagingRecommendData.currPage && Intrinsics.areEqual(this.details, homePagingRecommendData.details) && Intrinsics.areEqual(this.headerInfo, homePagingRecommendData.headerInfo) && Intrinsics.areEqual(this.moduleCode, homePagingRecommendData.moduleCode) && Intrinsics.areEqual(this.statisticTitle, homePagingRecommendData.statisticTitle) && this.weight == homePagingRecommendData.weight;
    }

    public final int getCol() {
        return this.col;
    }

    public final int getCurrPage() {
        return this.currPage;
    }

    @NotNull
    public final List<HomeItemDetail> getDetails() {
        return this.details;
    }

    @Nullable
    public final HomeItemHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    @NotNull
    public final ItemConfig getItemConfig() {
        return this.itemConfig;
    }

    @NotNull
    public final String getModuleCode() {
        return this.moduleCode;
    }

    public final int getRow() {
        return this.row;
    }

    @NotNull
    public final String getStatisticTitle() {
        return this.statisticTitle;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.row) * 31) + Integer.hashCode(this.col)) * 31) + this.itemConfig.hashCode()) * 31) + Integer.hashCode(this.currPage)) * 31) + this.details.hashCode()) * 31;
        HomeItemHeaderInfo homeItemHeaderInfo = this.headerInfo;
        return ((((((iHashCode + (homeItemHeaderInfo == null ? 0 : homeItemHeaderInfo.hashCode())) * 31) + this.moduleCode.hashCode()) * 31) + this.statisticTitle.hashCode()) * 31) + Integer.hashCode(this.weight);
    }

    @NotNull
    public String toString() {
        return "HomePagingRecommendData(row=" + this.row + ", col=" + this.col + ", itemConfig=" + this.itemConfig + ", currPage=" + this.currPage + ", details=" + this.details + ", headerInfo=" + this.headerInfo + ", moduleCode=" + this.moduleCode + ", statisticTitle=" + this.statisticTitle + ", weight=" + this.weight + ')';
    }
}
