package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0014X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/product_support/data/PriceInfo;", "", "()V", "buyPrice", "", "getBuyPrice", "()Ljava/lang/String;", "currencyTag", "getCurrencyTag", "disCount", "getDisCount", "marketPrice", "getMarketPrice", "originalPrice", "getOriginalPrice", "prefix", "getPrefix", SensorsBean.PRICE, "getPrice", "skuId", "", "getSkuId", "()I", "suffix", "getSuffix", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PriceInfo {

    @Nullable
    private final String buyPrice;

    @Nullable
    private final String currencyTag;

    @Nullable
    private final String disCount;

    @Nullable
    private final String marketPrice;

    @Nullable
    private final String originalPrice;

    @Nullable
    private final String prefix;

    @Nullable
    private final String price;
    private final int skuId;

    @Nullable
    private final String suffix;

    @Nullable
    public final String getBuyPrice() {
        return this.buyPrice;
    }

    @Nullable
    public final String getCurrencyTag() {
        return this.currencyTag;
    }

    @Nullable
    public final String getDisCount() {
        return this.disCount;
    }

    @Nullable
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @Nullable
    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    @Nullable
    public final String getPrefix() {
        return this.prefix;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    public final int getSkuId() {
        return this.skuId;
    }

    @Nullable
    public final String getSuffix() {
        return this.suffix;
    }
}
