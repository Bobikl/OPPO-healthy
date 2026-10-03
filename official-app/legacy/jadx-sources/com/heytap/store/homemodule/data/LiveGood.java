package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J>\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/heytap/store/homemodule/data/LiveGood;", "", "skuId", "", SensorsBean.PRICE, "", "originPrice", "", "iconUrl", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "setIconUrl", "(Ljava/lang/String;)V", "getOriginPrice", "setOriginPrice", "getPrice", "()Ljava/lang/Double;", "setPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getSkuId", "()Ljava/lang/Integer;", "setSkuId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/store/homemodule/data/LiveGood;", "equals", "", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class LiveGood {

    @Nullable
    private String iconUrl;

    @Nullable
    private String originPrice;

    @Nullable
    private Double price;

    @Nullable
    private Integer skuId;

    public LiveGood(@Nullable Integer num, @Nullable Double d, @Nullable String str, @Nullable String str2) {
        this.skuId = num;
        this.price = d;
        this.originPrice = str;
        this.iconUrl = str2;
    }

    public static /* synthetic */ LiveGood copy$default(LiveGood liveGood, Integer num, Double d, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = liveGood.skuId;
        }
        if ((i & 2) != 0) {
            d = liveGood.price;
        }
        if ((i & 4) != 0) {
            str = liveGood.originPrice;
        }
        if ((i & 8) != 0) {
            str2 = liveGood.iconUrl;
        }
        return liveGood.copy(num, d, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getSkuId() {
        return this.skuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOriginPrice() {
        return this.originPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final LiveGood copy(@Nullable Integer skuId, @Nullable Double price, @Nullable String originPrice, @Nullable String iconUrl) {
        return new LiveGood(skuId, price, originPrice, iconUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveGood)) {
            return false;
        }
        LiveGood liveGood = (LiveGood) other;
        return Intrinsics.areEqual(this.skuId, liveGood.skuId) && Intrinsics.areEqual((Object) this.price, (Object) liveGood.price) && Intrinsics.areEqual(this.originPrice, liveGood.originPrice) && Intrinsics.areEqual(this.iconUrl, liveGood.iconUrl);
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getOriginPrice() {
        return this.originPrice;
    }

    @Nullable
    public final Double getPrice() {
        return this.price;
    }

    @Nullable
    public final Integer getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        Integer num = this.skuId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d = this.price;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.originPrice;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setOriginPrice(@Nullable String str) {
        this.originPrice = str;
    }

    public final void setPrice(@Nullable Double d) {
        this.price = d;
    }

    public final void setSkuId(@Nullable Integer num) {
        this.skuId = num;
    }

    @NotNull
    public String toString() {
        return "LiveGood(skuId=" + this.skuId + ", price=" + this.price + ", originPrice=" + ((Object) this.originPrice) + ", iconUrl=" + ((Object) this.iconUrl) + ')';
    }
}
