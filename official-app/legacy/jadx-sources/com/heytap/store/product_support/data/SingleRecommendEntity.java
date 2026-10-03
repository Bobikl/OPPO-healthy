package com.heytap.store.product_support.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/product_support/data/SingleRecommendEntity;", "", "isLogin", "", "tabData", "Lcom/heytap/store/product_support/data/RecommendTabEntity;", "reportData", "Lcom/heytap/store/product_support/data/RecommendReportData;", "(ZLcom/heytap/store/product_support/data/RecommendTabEntity;Lcom/heytap/store/product_support/data/RecommendReportData;)V", "()Z", "getReportData", "()Lcom/heytap/store/product_support/data/RecommendReportData;", "getTabData", "()Lcom/heytap/store/product_support/data/RecommendTabEntity;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class SingleRecommendEntity {
    private final boolean isLogin;

    @NotNull
    private final RecommendReportData reportData;

    @NotNull
    private final RecommendTabEntity tabData;

    public SingleRecommendEntity(boolean z, @NotNull RecommendTabEntity tabData, @NotNull RecommendReportData reportData) {
        Intrinsics.checkNotNullParameter(tabData, "tabData");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        this.isLogin = z;
        this.tabData = tabData;
        this.reportData = reportData;
    }

    public static /* synthetic */ SingleRecommendEntity copy$default(SingleRecommendEntity singleRecommendEntity, boolean z, RecommendTabEntity recommendTabEntity, RecommendReportData recommendReportData, int i, Object obj) {
        if ((i & 1) != 0) {
            z = singleRecommendEntity.isLogin;
        }
        if ((i & 2) != 0) {
            recommendTabEntity = singleRecommendEntity.tabData;
        }
        if ((i & 4) != 0) {
            recommendReportData = singleRecommendEntity.reportData;
        }
        return singleRecommendEntity.copy(z, recommendTabEntity, recommendReportData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLogin() {
        return this.isLogin;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RecommendTabEntity getTabData() {
        return this.tabData;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RecommendReportData getReportData() {
        return this.reportData;
    }

    @NotNull
    public final SingleRecommendEntity copy(boolean isLogin, @NotNull RecommendTabEntity tabData, @NotNull RecommendReportData reportData) {
        Intrinsics.checkNotNullParameter(tabData, "tabData");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        return new SingleRecommendEntity(isLogin, tabData, reportData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleRecommendEntity)) {
            return false;
        }
        SingleRecommendEntity singleRecommendEntity = (SingleRecommendEntity) other;
        return this.isLogin == singleRecommendEntity.isLogin && Intrinsics.areEqual(this.tabData, singleRecommendEntity.tabData) && Intrinsics.areEqual(this.reportData, singleRecommendEntity.reportData);
    }

    @NotNull
    public final RecommendReportData getReportData() {
        return this.reportData;
    }

    @NotNull
    public final RecommendTabEntity getTabData() {
        return this.tabData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isLogin;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.tabData.hashCode()) * 31) + this.reportData.hashCode();
    }

    public final boolean isLogin() {
        return this.isLogin;
    }

    @NotNull
    public String toString() {
        return "SingleRecommendEntity(isLogin=" + this.isLogin + ", tabData=" + this.tabData + ", reportData=" + this.reportData + ')';
    }

    public /* synthetic */ SingleRecommendEntity(boolean z, RecommendTabEntity recommendTabEntity, RecommendReportData recommendReportData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, recommendTabEntity, recommendReportData);
    }
}
