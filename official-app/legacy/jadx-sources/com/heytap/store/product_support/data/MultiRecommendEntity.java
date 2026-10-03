package com.heytap.store.product_support.data;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/heytap/store/product_support/data/MultiRecommendEntity;", "", "viewPagerId", "", "tabs", "", "Lcom/heytap/store/product_support/data/RecommendTabEntity;", "selectPosition", "reportData", "Lcom/heytap/store/product_support/data/RecommendReportData;", "(ILjava/util/List;ILcom/heytap/store/product_support/data/RecommendReportData;)V", "getReportData", "()Lcom/heytap/store/product_support/data/RecommendReportData;", "getSelectPosition", "()I", "getTabs", "()Ljava/util/List;", "getViewPagerId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class MultiRecommendEntity {

    @NotNull
    private final RecommendReportData reportData;
    private final int selectPosition;

    @NotNull
    private final List<RecommendTabEntity> tabs;
    private final int viewPagerId;

    public MultiRecommendEntity(int i, @NotNull List<RecommendTabEntity> tabs, int i2, @NotNull RecommendReportData reportData) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        this.viewPagerId = i;
        this.tabs = tabs;
        this.selectPosition = i2;
        this.reportData = reportData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiRecommendEntity copy$default(MultiRecommendEntity multiRecommendEntity, int i, List list, int i2, RecommendReportData recommendReportData, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = multiRecommendEntity.viewPagerId;
        }
        if ((i3 & 2) != 0) {
            list = multiRecommendEntity.tabs;
        }
        if ((i3 & 4) != 0) {
            i2 = multiRecommendEntity.selectPosition;
        }
        if ((i3 & 8) != 0) {
            recommendReportData = multiRecommendEntity.reportData;
        }
        return multiRecommendEntity.copy(i, list, i2, recommendReportData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getViewPagerId() {
        return this.viewPagerId;
    }

    @NotNull
    public final List<RecommendTabEntity> component2() {
        return this.tabs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSelectPosition() {
        return this.selectPosition;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RecommendReportData getReportData() {
        return this.reportData;
    }

    @NotNull
    public final MultiRecommendEntity copy(int viewPagerId, @NotNull List<RecommendTabEntity> tabs, int selectPosition, @NotNull RecommendReportData reportData) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        return new MultiRecommendEntity(viewPagerId, tabs, selectPosition, reportData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiRecommendEntity)) {
            return false;
        }
        MultiRecommendEntity multiRecommendEntity = (MultiRecommendEntity) other;
        return this.viewPagerId == multiRecommendEntity.viewPagerId && Intrinsics.areEqual(this.tabs, multiRecommendEntity.tabs) && this.selectPosition == multiRecommendEntity.selectPosition && Intrinsics.areEqual(this.reportData, multiRecommendEntity.reportData);
    }

    @NotNull
    public final RecommendReportData getReportData() {
        return this.reportData;
    }

    public final int getSelectPosition() {
        return this.selectPosition;
    }

    @NotNull
    public final List<RecommendTabEntity> getTabs() {
        return this.tabs;
    }

    public final int getViewPagerId() {
        return this.viewPagerId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.viewPagerId) * 31) + this.tabs.hashCode()) * 31) + Integer.hashCode(this.selectPosition)) * 31) + this.reportData.hashCode();
    }

    @NotNull
    public String toString() {
        return "MultiRecommendEntity(viewPagerId=" + this.viewPagerId + ", tabs=" + this.tabs + ", selectPosition=" + this.selectPosition + ", reportData=" + this.reportData + ')';
    }

    public /* synthetic */ MultiRecommendEntity(int i, List list, int i2, RecommendReportData recommendReportData, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i3 & 4) != 0 ? 0 : i2, recommendReportData);
    }
}
