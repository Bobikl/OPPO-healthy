package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006$"}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreNearShopInfo;", "", "shopCode", "", "name", "shopBusinessStart", "shopBusinessEnd", "distance", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getDistance", "()D", "setDistance", "(D)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getShopBusinessEnd", "setShopBusinessEnd", "getShopBusinessStart", "setShopBusinessStart", "getShopCode", "setShopCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OStoreNearShopInfo {
    private double distance;

    @NotNull
    private String name;

    @NotNull
    private String shopBusinessEnd;

    @NotNull
    private String shopBusinessStart;

    @NotNull
    private String shopCode;

    public OStoreNearShopInfo() {
        this(null, null, null, null, 0.0d, 31, null);
    }

    public static /* synthetic */ OStoreNearShopInfo copy$default(OStoreNearShopInfo oStoreNearShopInfo, String str, String str2, String str3, String str4, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oStoreNearShopInfo.shopCode;
        }
        if ((i & 2) != 0) {
            str2 = oStoreNearShopInfo.name;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = oStoreNearShopInfo.shopBusinessStart;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = oStoreNearShopInfo.shopBusinessEnd;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            d = oStoreNearShopInfo.distance;
        }
        return oStoreNearShopInfo.copy(str, str5, str6, str7, d);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShopCode() {
        return this.shopCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShopBusinessStart() {
        return this.shopBusinessStart;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShopBusinessEnd() {
        return this.shopBusinessEnd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    @NotNull
    public final OStoreNearShopInfo copy(@NotNull String shopCode, @NotNull String name, @NotNull String shopBusinessStart, @NotNull String shopBusinessEnd, double distance) {
        Intrinsics.checkNotNullParameter(shopCode, "shopCode");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(shopBusinessStart, "shopBusinessStart");
        Intrinsics.checkNotNullParameter(shopBusinessEnd, "shopBusinessEnd");
        return new OStoreNearShopInfo(shopCode, name, shopBusinessStart, shopBusinessEnd, distance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OStoreNearShopInfo)) {
            return false;
        }
        OStoreNearShopInfo oStoreNearShopInfo = (OStoreNearShopInfo) other;
        return Intrinsics.areEqual(this.shopCode, oStoreNearShopInfo.shopCode) && Intrinsics.areEqual(this.name, oStoreNearShopInfo.name) && Intrinsics.areEqual(this.shopBusinessStart, oStoreNearShopInfo.shopBusinessStart) && Intrinsics.areEqual(this.shopBusinessEnd, oStoreNearShopInfo.shopBusinessEnd) && Intrinsics.areEqual((Object) Double.valueOf(this.distance), (Object) Double.valueOf(oStoreNearShopInfo.distance));
    }

    public final double getDistance() {
        return this.distance;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getShopBusinessEnd() {
        return this.shopBusinessEnd;
    }

    @NotNull
    public final String getShopBusinessStart() {
        return this.shopBusinessStart;
    }

    @NotNull
    public final String getShopCode() {
        return this.shopCode;
    }

    public int hashCode() {
        return (((((((this.shopCode.hashCode() * 31) + this.name.hashCode()) * 31) + this.shopBusinessStart.hashCode()) * 31) + this.shopBusinessEnd.hashCode()) * 31) + Double.hashCode(this.distance);
    }

    public final void setDistance(double d) {
        this.distance = d;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setShopBusinessEnd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shopBusinessEnd = str;
    }

    public final void setShopBusinessStart(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shopBusinessStart = str;
    }

    public final void setShopCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shopCode = str;
    }

    @NotNull
    public String toString() {
        return "OStoreNearShopInfo(shopCode=" + this.shopCode + ", name=" + this.name + ", shopBusinessStart=" + this.shopBusinessStart + ", shopBusinessEnd=" + this.shopBusinessEnd + ", distance=" + this.distance + ')';
    }

    public OStoreNearShopInfo(@NotNull String shopCode, @NotNull String name, @NotNull String shopBusinessStart, @NotNull String shopBusinessEnd, double d) {
        Intrinsics.checkNotNullParameter(shopCode, "shopCode");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(shopBusinessStart, "shopBusinessStart");
        Intrinsics.checkNotNullParameter(shopBusinessEnd, "shopBusinessEnd");
        this.shopCode = shopCode;
        this.name = name;
        this.shopBusinessStart = shopBusinessStart;
        this.shopBusinessEnd = shopBusinessEnd;
        this.distance = d;
    }

    public /* synthetic */ OStoreNearShopInfo(String str, String str2, String str3, String str4, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0.0d : d);
    }
}
