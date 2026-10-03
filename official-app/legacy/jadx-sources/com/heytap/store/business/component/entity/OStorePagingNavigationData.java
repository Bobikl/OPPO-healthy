package com.heytap.store.business.component.entity;

import android.graphics.Point;
import androidx.annotation.Keep;
import com.heytap.store.business.component.view.OStorePagingNavigation;
import com.oplus.aiunit.vision.hp6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003J\t\u0010*\u001a\u00020\u0010HÆ\u0003Jm\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lcom/heytap/store/business/component/entity/OStorePagingNavigationData;", "", "type", "Lcom/heytap/store/business/component/view/OStorePagingNavigation;", "row", "", "col", "itemSize", "Landroid/graphics/Point;", "currPage", hp6.DETAIL_ENTRY, "", "Lcom/heytap/store/business/component/entity/OStoreItemDetail;", "headerInfo", "Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "moduleCode", "", "statisticTitle", "(Lcom/heytap/store/business/component/view/OStorePagingNavigation;IILandroid/graphics/Point;ILjava/util/List;Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;Ljava/lang/String;Ljava/lang/String;)V", "getCol", "()I", "getCurrPage", "getDetails", "()Ljava/util/List;", "getHeaderInfo", "()Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "getItemSize", "()Landroid/graphics/Point;", "getModuleCode", "()Ljava/lang/String;", "getRow", "getStatisticTitle", "getType", "()Lcom/heytap/store/business/component/view/OStorePagingNavigation;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OStorePagingNavigationData {
    private final int col;
    private final int currPage;

    @NotNull
    private final List<OStoreItemDetail> details;

    @Nullable
    private final OStoreHeaderInfo headerInfo;

    @Nullable
    private final Point itemSize;

    @NotNull
    private final String moduleCode;
    private final int row;

    @NotNull
    private final String statisticTitle;

    @NotNull
    private final OStorePagingNavigation type;

    public OStorePagingNavigationData(@NotNull OStorePagingNavigation type, int i, int i2, @Nullable Point point, int i3, @NotNull List<OStoreItemDetail> details, @Nullable OStoreHeaderInfo oStoreHeaderInfo, @NotNull String moduleCode, @NotNull String statisticTitle) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(moduleCode, "moduleCode");
        Intrinsics.checkNotNullParameter(statisticTitle, "statisticTitle");
        this.type = type;
        this.row = i;
        this.col = i2;
        this.itemSize = point;
        this.currPage = i3;
        this.details = details;
        this.headerInfo = oStoreHeaderInfo;
        this.moduleCode = moduleCode;
        this.statisticTitle = statisticTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OStorePagingNavigation getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRow() {
        return this.row;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCol() {
        return this.col;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Point getItemSize() {
        return this.itemSize;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCurrPage() {
        return this.currPage;
    }

    @NotNull
    public final List<OStoreItemDetail> component6() {
        return this.details;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final OStoreHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStatisticTitle() {
        return this.statisticTitle;
    }

    @NotNull
    public final OStorePagingNavigationData copy(@NotNull OStorePagingNavigation type, int row, int col, @Nullable Point itemSize, int currPage, @NotNull List<OStoreItemDetail> details, @Nullable OStoreHeaderInfo headerInfo, @NotNull String moduleCode, @NotNull String statisticTitle) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(moduleCode, "moduleCode");
        Intrinsics.checkNotNullParameter(statisticTitle, "statisticTitle");
        return new OStorePagingNavigationData(type, row, col, itemSize, currPage, details, headerInfo, moduleCode, statisticTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OStorePagingNavigationData)) {
            return false;
        }
        OStorePagingNavigationData oStorePagingNavigationData = (OStorePagingNavigationData) other;
        return this.type == oStorePagingNavigationData.type && this.row == oStorePagingNavigationData.row && this.col == oStorePagingNavigationData.col && Intrinsics.areEqual(this.itemSize, oStorePagingNavigationData.itemSize) && this.currPage == oStorePagingNavigationData.currPage && Intrinsics.areEqual(this.details, oStorePagingNavigationData.details) && Intrinsics.areEqual(this.headerInfo, oStorePagingNavigationData.headerInfo) && Intrinsics.areEqual(this.moduleCode, oStorePagingNavigationData.moduleCode) && Intrinsics.areEqual(this.statisticTitle, oStorePagingNavigationData.statisticTitle);
    }

    public final int getCol() {
        return this.col;
    }

    public final int getCurrPage() {
        return this.currPage;
    }

    @NotNull
    public final List<OStoreItemDetail> getDetails() {
        return this.details;
    }

    @Nullable
    public final OStoreHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    @Nullable
    public final Point getItemSize() {
        return this.itemSize;
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

    @NotNull
    public final OStorePagingNavigation getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + Integer.hashCode(this.row)) * 31) + Integer.hashCode(this.col)) * 31;
        Point point = this.itemSize;
        int iHashCode2 = (((((iHashCode + (point == null ? 0 : point.hashCode())) * 31) + Integer.hashCode(this.currPage)) * 31) + this.details.hashCode()) * 31;
        OStoreHeaderInfo oStoreHeaderInfo = this.headerInfo;
        return ((((iHashCode2 + (oStoreHeaderInfo != null ? oStoreHeaderInfo.hashCode() : 0)) * 31) + this.moduleCode.hashCode()) * 31) + this.statisticTitle.hashCode();
    }

    @NotNull
    public String toString() {
        return "OStorePagingNavigationData(type=" + this.type + ", row=" + this.row + ", col=" + this.col + ", itemSize=" + this.itemSize + ", currPage=" + this.currPage + ", details=" + this.details + ", headerInfo=" + this.headerInfo + ", moduleCode=" + this.moduleCode + ", statisticTitle=" + this.statisticTitle + ')';
    }
}
