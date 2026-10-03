package com.heytap.store.business.component.utils;

import android.text.TextUtils;
import com.heytap.store.business.component.entity.GoodsForm;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"getCurrencySymbol", "", "goodsForm", "Lcom/heytap/store/business/component/entity/GoodsForm;", "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class PriceUtilKt {
    @NotNull
    public static final String getCurrencySymbol(@Nullable GoodsForm goodsForm) {
        String marketPrice;
        if (TextUtils.isEmpty(goodsForm == null ? null : goodsForm.getMarketPrice())) {
            return "¥";
        }
        return (goodsForm == null || (marketPrice = goodsForm.getMarketPrice()) == null || (!StringsKt__StringsKt.contains$default((CharSequence) marketPrice, (CharSequence) "?", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) marketPrice, (CharSequence) "？", false, 2, (Object) null))) ? "" : "¥";
    }
}
