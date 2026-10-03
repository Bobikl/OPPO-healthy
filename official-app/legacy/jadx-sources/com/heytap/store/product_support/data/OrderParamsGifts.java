package com.heytap.store.product_support.data;

import com.google.gson.JsonObject;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/heytap/store/product_support/data/OrderParamsGifts;", "", "name", "", "goodsSkuId", "erpCode", SensorsBean.PRICE, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getErpCode", "()Ljava/lang/String;", "getGoodsSkuId", "getName", "getPrice", "()D", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getJsonObject", "Lcom/google/gson/JsonObject;", "hashCode", "", "toString", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OrderParamsGifts {

    @NotNull
    private final String erpCode;

    @NotNull
    private final String goodsSkuId;

    @NotNull
    private final String name;
    private final double price;

    public OrderParamsGifts(@NotNull String name, @NotNull String goodsSkuId, @NotNull String erpCode, double d) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(goodsSkuId, "goodsSkuId");
        Intrinsics.checkNotNullParameter(erpCode, "erpCode");
        this.name = name;
        this.goodsSkuId = goodsSkuId;
        this.erpCode = erpCode;
        this.price = d;
    }

    public static /* synthetic */ OrderParamsGifts copy$default(OrderParamsGifts orderParamsGifts, String str, String str2, String str3, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderParamsGifts.name;
        }
        if ((i & 2) != 0) {
            str2 = orderParamsGifts.goodsSkuId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = orderParamsGifts.erpCode;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            d = orderParamsGifts.price;
        }
        return orderParamsGifts.copy(str, str4, str5, d);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGoodsSkuId() {
        return this.goodsSkuId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErpCode() {
        return this.erpCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    @NotNull
    public final OrderParamsGifts copy(@NotNull String name, @NotNull String goodsSkuId, @NotNull String erpCode, double price) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(goodsSkuId, "goodsSkuId");
        Intrinsics.checkNotNullParameter(erpCode, "erpCode");
        return new OrderParamsGifts(name, goodsSkuId, erpCode, price);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderParamsGifts)) {
            return false;
        }
        OrderParamsGifts orderParamsGifts = (OrderParamsGifts) other;
        return Intrinsics.areEqual(this.name, orderParamsGifts.name) && Intrinsics.areEqual(this.goodsSkuId, orderParamsGifts.goodsSkuId) && Intrinsics.areEqual(this.erpCode, orderParamsGifts.erpCode) && Intrinsics.areEqual((Object) Double.valueOf(this.price), (Object) Double.valueOf(orderParamsGifts.price));
    }

    @NotNull
    public final String getErpCode() {
        return this.erpCode;
    }

    @NotNull
    public final String getGoodsSkuId() {
        return this.goodsSkuId;
    }

    @NotNull
    public final JsonObject getJsonObject() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", getGoodsSkuId());
        jsonObject.addProperty(SensorsBean.PRICE, Double.valueOf(getPrice()));
        return jsonObject;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getPrice() {
        return this.price;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.goodsSkuId.hashCode()) * 31) + this.erpCode.hashCode()) * 31) + Double.hashCode(this.price);
    }

    @NotNull
    public String toString() {
        return "OrderParamsGifts(name=" + this.name + ", goodsSkuId=" + this.goodsSkuId + ", erpCode=" + this.erpCode + ", price=" + this.price + ')';
    }
}
