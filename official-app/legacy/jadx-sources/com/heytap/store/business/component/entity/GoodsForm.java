package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/business/component/entity/GoodsForm;", "", "()V", "marketPrice", "", "getMarketPrice", "()Ljava/lang/String;", "setMarketPrice", "(Ljava/lang/String;)V", SensorsBean.PRICE, "getPrice", "setPrice", "priceSuffix", "getPriceSuffix", "setPriceSuffix", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class GoodsForm {

    @Nullable
    private String marketPrice = "";

    @Nullable
    private String price = "";

    @Nullable
    private String priceSuffix = "";

    @Nullable
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @Nullable
    public final String getPrice() {
        String str = this.price;
        return str == null ? "" : str;
    }

    @Nullable
    public final String getPriceSuffix() {
        String str = this.priceSuffix;
        return str == null ? "" : str;
    }

    public final void setMarketPrice(@Nullable String str) {
        this.marketPrice = str;
    }

    public final void setPrice(@Nullable String str) {
        this.price = str;
    }

    public final void setPriceSuffix(@Nullable String str) {
        this.priceSuffix = str;
    }
}
