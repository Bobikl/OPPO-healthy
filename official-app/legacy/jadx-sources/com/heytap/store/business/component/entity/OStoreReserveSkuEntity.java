package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreReserveSkuEntity;", "", "spuId", "", "skuId", "firstCategory", "", "secondCategory", "(JJLjava/lang/String;Ljava/lang/String;)V", "getFirstCategory", "()Ljava/lang/String;", "getSecondCategory", "getSkuId", "()J", "getSpuId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OStoreReserveSkuEntity {

    @NotNull
    private final String firstCategory;

    @NotNull
    private final String secondCategory;
    private final long skuId;
    private final long spuId;

    public OStoreReserveSkuEntity(long j2, long j3, @NotNull String firstCategory, @NotNull String secondCategory) {
        Intrinsics.checkNotNullParameter(firstCategory, "firstCategory");
        Intrinsics.checkNotNullParameter(secondCategory, "secondCategory");
        this.spuId = j2;
        this.skuId = j3;
        this.firstCategory = firstCategory;
        this.secondCategory = secondCategory;
    }

    public static /* synthetic */ OStoreReserveSkuEntity copy$default(OStoreReserveSkuEntity oStoreReserveSkuEntity, long j2, long j3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = oStoreReserveSkuEntity.spuId;
        }
        long j4 = j2;
        if ((i & 2) != 0) {
            j3 = oStoreReserveSkuEntity.skuId;
        }
        long j5 = j3;
        if ((i & 4) != 0) {
            str = oStoreReserveSkuEntity.firstCategory;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = oStoreReserveSkuEntity.secondCategory;
        }
        return oStoreReserveSkuEntity.copy(j4, j5, str3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getSpuId() {
        return this.spuId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSkuId() {
        return this.skuId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirstCategory() {
        return this.firstCategory;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSecondCategory() {
        return this.secondCategory;
    }

    @NotNull
    public final OStoreReserveSkuEntity copy(long spuId, long skuId, @NotNull String firstCategory, @NotNull String secondCategory) {
        Intrinsics.checkNotNullParameter(firstCategory, "firstCategory");
        Intrinsics.checkNotNullParameter(secondCategory, "secondCategory");
        return new OStoreReserveSkuEntity(spuId, skuId, firstCategory, secondCategory);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OStoreReserveSkuEntity)) {
            return false;
        }
        OStoreReserveSkuEntity oStoreReserveSkuEntity = (OStoreReserveSkuEntity) other;
        return this.spuId == oStoreReserveSkuEntity.spuId && this.skuId == oStoreReserveSkuEntity.skuId && Intrinsics.areEqual(this.firstCategory, oStoreReserveSkuEntity.firstCategory) && Intrinsics.areEqual(this.secondCategory, oStoreReserveSkuEntity.secondCategory);
    }

    @NotNull
    public final String getFirstCategory() {
        return this.firstCategory;
    }

    @NotNull
    public final String getSecondCategory() {
        return this.secondCategory;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    public final long getSpuId() {
        return this.spuId;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.spuId) * 31) + Long.hashCode(this.skuId)) * 31) + this.firstCategory.hashCode()) * 31) + this.secondCategory.hashCode();
    }

    @NotNull
    public String toString() {
        return "OStoreReserveSkuEntity(spuId=" + this.spuId + ", skuId=" + this.skuId + ", firstCategory=" + this.firstCategory + ", secondCategory=" + this.secondCategory + ')';
    }

    public /* synthetic */ OStoreReserveSkuEntity(long j2, long j3, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
    }
}
