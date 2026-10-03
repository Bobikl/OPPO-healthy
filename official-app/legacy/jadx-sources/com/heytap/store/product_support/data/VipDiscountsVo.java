package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/heytap/store/product_support/data/VipDiscountsVo;", "", "()V", Feedback.WIDGET_LABEL, "", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", SensorsBean.PRICE, "getPrice", "setPrice", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VipDiscountsVo {

    @Nullable
    private String label;

    @Nullable
    private String price;

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }

    public final void setPrice(@Nullable String str) {
        this.price = str;
    }
}
