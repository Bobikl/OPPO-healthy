package com.heytap.store.product_support.data;

import com.google.gson.JsonObject;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u001e\u001a\u00020\u001fJ\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006#"}, d2 = {"Lcom/heytap/store/product_support/data/OrderParamsInsurance;", "", "erpCode", "", SensorsBean.PRICE, "originPrice", "skuId", "name", "repelType", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErpCode", "()Ljava/lang/String;", "getName", "getOriginPrice", "getPrice", "getRepelType", "getSkuId", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "getJsonObject", "Lcom/google/gson/JsonObject;", "hashCode", "", "toString", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OrderParamsInsurance {

    @NotNull
    private final String erpCode;

    @NotNull
    private final String name;

    @NotNull
    private final String originPrice;

    @NotNull
    private final String price;

    @NotNull
    private final String repelType;

    @NotNull
    private final String skuId;

    @NotNull
    private final String type;

    public OrderParamsInsurance(@NotNull String erpCode, @NotNull String price, @NotNull String originPrice, @NotNull String skuId, @NotNull String name, @NotNull String repelType, @NotNull String type) {
        Intrinsics.checkNotNullParameter(erpCode, "erpCode");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(originPrice, "originPrice");
        Intrinsics.checkNotNullParameter(skuId, "skuId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(repelType, "repelType");
        Intrinsics.checkNotNullParameter(type, "type");
        this.erpCode = erpCode;
        this.price = price;
        this.originPrice = originPrice;
        this.skuId = skuId;
        this.name = name;
        this.repelType = repelType;
        this.type = type;
    }

    public static /* synthetic */ OrderParamsInsurance copy$default(OrderParamsInsurance orderParamsInsurance, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderParamsInsurance.erpCode;
        }
        if ((i & 2) != 0) {
            str2 = orderParamsInsurance.price;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = orderParamsInsurance.originPrice;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = orderParamsInsurance.skuId;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = orderParamsInsurance.name;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = orderParamsInsurance.repelType;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = orderParamsInsurance.type;
        }
        return orderParamsInsurance.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getErpCode() {
        return this.erpCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOriginPrice() {
        return this.originPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSkuId() {
        return this.skuId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRepelType() {
        return this.repelType;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final OrderParamsInsurance copy(@NotNull String erpCode, @NotNull String price, @NotNull String originPrice, @NotNull String skuId, @NotNull String name, @NotNull String repelType, @NotNull String type) {
        Intrinsics.checkNotNullParameter(erpCode, "erpCode");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(originPrice, "originPrice");
        Intrinsics.checkNotNullParameter(skuId, "skuId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(repelType, "repelType");
        Intrinsics.checkNotNullParameter(type, "type");
        return new OrderParamsInsurance(erpCode, price, originPrice, skuId, name, repelType, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderParamsInsurance)) {
            return false;
        }
        OrderParamsInsurance orderParamsInsurance = (OrderParamsInsurance) other;
        return Intrinsics.areEqual(this.erpCode, orderParamsInsurance.erpCode) && Intrinsics.areEqual(this.price, orderParamsInsurance.price) && Intrinsics.areEqual(this.originPrice, orderParamsInsurance.originPrice) && Intrinsics.areEqual(this.skuId, orderParamsInsurance.skuId) && Intrinsics.areEqual(this.name, orderParamsInsurance.name) && Intrinsics.areEqual(this.repelType, orderParamsInsurance.repelType) && Intrinsics.areEqual(this.type, orderParamsInsurance.type);
    }

    @NotNull
    public final String getErpCode() {
        return this.erpCode;
    }

    @NotNull
    public final JsonObject getJsonObject() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", getErpCode());
        jsonObject.addProperty(SensorsBean.PRICE, getPrice());
        jsonObject.addProperty("originPrice", getOriginPrice());
        jsonObject.addProperty("skuId", getSkuId());
        jsonObject.addProperty("name", getName());
        return jsonObject;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getOriginPrice() {
        return this.originPrice;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final String getRepelType() {
        return this.repelType;
    }

    @NotNull
    public final String getSkuId() {
        return this.skuId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((this.erpCode.hashCode() * 31) + this.price.hashCode()) * 31) + this.originPrice.hashCode()) * 31) + this.skuId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.repelType.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "OrderParamsInsurance(erpCode=" + this.erpCode + ", price=" + this.price + ", originPrice=" + this.originPrice + ", skuId=" + this.skuId + ", name=" + this.name + ", repelType=" + this.repelType + ", type=" + this.type + ')';
    }
}
