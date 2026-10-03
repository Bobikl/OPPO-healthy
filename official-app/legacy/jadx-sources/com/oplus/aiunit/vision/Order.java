package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.lrd, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\t\u0010\fR\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0012\u0010\u001dR\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\u0019\u0010\fR\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b'\u0010\fR\u001a\u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b\u001b\u0010\f¨\u0006+"}, d2 = {"Lcom/oplus/aiunit/vision/lrd;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCountry", "()Ljava/lang/String;", "country", "b", "getCurrency", DeepLinkInterpreter.KEY_CURRENCY, "", "c", "J", "getExpireTime", "()J", "expireTime", "d", "orderId", MapSchema.FIELD_NAME_ENTRY, "partnerCode", "f", "I", "()I", "payStatus", b2n.f, sbe.PAY_SDK_PREPAYTOKEN, b2n.g, SensorsBean.PRICE, "i", "getProductId", Fields.PRODUCT_ID, "j", "getSignPartnerOrder", "signPartnerOrder", MapSchema.FIELD_NAME_KEY, sbe.PAY_SDK_PRODUCTNAME, "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Order {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(DeepLinkInterpreter.KEY_CURRENCY)
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("expireTime")
    private final long expireTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("orderId")
    @NotNull
    private final String orderId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("partnerCode")
    @NotNull
    private final String partnerCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("payStatus")
    private final int payStatus;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName(sbe.PAY_SDK_PREPAYTOKEN)
    @NotNull
    private final String prePayToken;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName(SensorsBean.PRICE)
    @NotNull
    private final String price;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName(Fields.PRODUCT_ID)
    @NotNull
    private final String productId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("signPartnerOrder")
    @NotNull
    private final String signPartnerOrder;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName(sbe.PAY_SDK_PRODUCTNAME)
    @NotNull
    private final String productName;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPartnerCode() {
        return this.partnerCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPayStatus() {
        return this.payStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPrePayToken() {
        return this.prePayToken;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Order)) {
            return false;
        }
        Order order = (Order) other;
        return Intrinsics.areEqual(this.country, order.country) && Intrinsics.areEqual(this.currency, order.currency) && this.expireTime == order.expireTime && Intrinsics.areEqual(this.orderId, order.orderId) && Intrinsics.areEqual(this.partnerCode, order.partnerCode) && this.payStatus == order.payStatus && Intrinsics.areEqual(this.prePayToken, order.prePayToken) && Intrinsics.areEqual(this.price, order.price) && Intrinsics.areEqual(this.productId, order.productId) && Intrinsics.areEqual(this.signPartnerOrder, order.signPartnerOrder) && Intrinsics.areEqual(this.productName, order.productName);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    public int hashCode() {
        return (((((((((((((((((((this.country.hashCode() * 31) + this.currency.hashCode()) * 31) + Long.hashCode(this.expireTime)) * 31) + this.orderId.hashCode()) * 31) + this.partnerCode.hashCode()) * 31) + Integer.hashCode(this.payStatus)) * 31) + this.prePayToken.hashCode()) * 31) + this.price.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.signPartnerOrder.hashCode()) * 31) + this.productName.hashCode();
    }

    @NotNull
    public String toString() {
        return "Order(country=" + this.country + ", currency=" + this.currency + ", expireTime=" + this.expireTime + ", orderId=" + this.orderId + ", partnerCode=" + this.partnerCode + ", payStatus=" + this.payStatus + ", prePayToken=" + this.prePayToken + ", price=" + this.price + ", productId=" + this.productId + ", signPartnerOrder=" + this.signPartnerOrder + ", productName=" + this.productName + ")";
    }
}
