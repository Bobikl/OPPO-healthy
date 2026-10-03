package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/ko0;", "", "", "a", "Ljava/lang/String;", "getCountry", "()Ljava/lang/String;", "country", "b", "getCurrency", DeepLinkInterpreter.KEY_CURRENCY, "c", "orderId", "d", "partnerCode", "", MapSchema.FIELD_NAME_ENTRY, "I", "getPayStatus", "()I", "payStatus", "f", sbe.PAY_SDK_PREPAYTOKEN, b2n.f, "getPrice", SensorsBean.PRICE, b2n.g, Fields.PRODUCT_ID, "i", "getSignPartnerOrder", "signPartnerOrder", "j", sbe.PAY_SDK_PRODUCTNAME, "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ko0 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(DeepLinkInterpreter.KEY_CURRENCY)
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("orderId")
    @NotNull
    private final String orderId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("partnerCode")
    @NotNull
    private final String partnerCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("payStatus")
    private final int payStatus;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName(sbe.PAY_SDK_PREPAYTOKEN)
    @NotNull
    private final String prePayToken;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName(SensorsBean.PRICE)
    @NotNull
    private final String price;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName(Fields.PRODUCT_ID)
    @NotNull
    private final String productId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("signPartnerOrder")
    @NotNull
    private final String signPartnerOrder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
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

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPrePayToken() {
        return this.prePayToken;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }
}
