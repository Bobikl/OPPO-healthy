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

/* JADX INFO: renamed from: com.oplus.aiunit.vision.mrd, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000eR\u001c\u0010 \u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000b\u0010\u001fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u0010\u0010\u001fR\u001a\u0010%\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b$\u0010\u000eR\u001a\u0010(\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010\u000eR\u001a\u0010+\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b*\u0010\u000eR\u001a\u0010.\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\f\u001a\u0004\b-\u0010\u000e¨\u0006/"}, d2 = {"Lcom/oplus/aiunit/vision/mrd;", "", "", "d", "c", "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getCountry", "()Ljava/lang/String;", "country", "b", "getCurrency", DeepLinkInterpreter.KEY_CURRENCY, "", "J", "getExpireTime", "()J", "expireTime", "getOrderId", "orderId", MapSchema.FIELD_NAME_ENTRY, "getPartnerCode", "partnerCode", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "payStatus", b2n.f, "signStatus", b2n.g, "getPrePayToken", sbe.PAY_SDK_PREPAYTOKEN, "i", "getPrice", SensorsBean.PRICE, "j", "getProductId", Fields.PRODUCT_ID, MapSchema.FIELD_NAME_KEY, "getProductName", sbe.PAY_SDK_PRODUCTNAME, "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class OrderState {
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
    @Nullable
    private final Integer payStatus;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("signStatus")
    @Nullable
    private final Integer signStatus;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName(sbe.PAY_SDK_PREPAYTOKEN)
    @NotNull
    private final String prePayToken;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName(SensorsBean.PRICE)
    @NotNull
    private final String price;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName(Fields.PRODUCT_ID)
    @NotNull
    private final String productId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName(sbe.PAY_SDK_PRODUCTNAME)
    @NotNull
    private final String productName;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getPayStatus() {
        return this.payStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getSignStatus() {
        return this.signStatus;
    }

    public final boolean c() {
        Integer num;
        Integer num2;
        Integer num3 = this.payStatus;
        return (num3 != null && num3.intValue() == 0 && this.signStatus == null) || ((num = this.payStatus) != null && num.intValue() == 0 && (num2 = this.signStatus) != null && num2.intValue() == -2);
    }

    public final boolean d() {
        Integer num = this.signStatus;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        Integer num2 = this.payStatus;
        return num2 != null && num2.intValue() == 1;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderState)) {
            return false;
        }
        OrderState orderState = (OrderState) other;
        return Intrinsics.areEqual(this.country, orderState.country) && Intrinsics.areEqual(this.currency, orderState.currency) && this.expireTime == orderState.expireTime && Intrinsics.areEqual(this.orderId, orderState.orderId) && Intrinsics.areEqual(this.partnerCode, orderState.partnerCode) && Intrinsics.areEqual(this.payStatus, orderState.payStatus) && Intrinsics.areEqual(this.signStatus, orderState.signStatus) && Intrinsics.areEqual(this.prePayToken, orderState.prePayToken) && Intrinsics.areEqual(this.price, orderState.price) && Intrinsics.areEqual(this.productId, orderState.productId) && Intrinsics.areEqual(this.productName, orderState.productName);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.country.hashCode() * 31) + this.currency.hashCode()) * 31) + Long.hashCode(this.expireTime)) * 31) + this.orderId.hashCode()) * 31) + this.partnerCode.hashCode()) * 31;
        Integer num = this.payStatus;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.signStatus;
        return ((((((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.prePayToken.hashCode()) * 31) + this.price.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.productName.hashCode();
    }

    @NotNull
    public String toString() {
        return "OrderState(country=" + this.country + ", currency=" + this.currency + ", expireTime=" + this.expireTime + ", orderId=" + this.orderId + ", partnerCode=" + this.partnerCode + ", payStatus=" + this.payStatus + ", signStatus=" + this.signStatus + ", prePayToken=" + this.prePayToken + ", price=" + this.price + ", productId=" + this.productId + ", productName=" + this.productName + ")";
    }
}
