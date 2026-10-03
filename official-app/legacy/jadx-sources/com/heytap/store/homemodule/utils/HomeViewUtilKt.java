package com.heytap.store.homemodule.utils;

import com.heytap.store.base.widget.view.OStoreGoodsLabelView;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"setNoStockLabel", "", "type", "", "content", "", "oStoreGoodsLabelView", "Lcom/heytap/store/base/widget/view/OStoreGoodsLabelView;", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/heytap/store/base/widget/view/OStoreGoodsLabelView;)V", "com.heytap.store.business.home-impl"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class HomeViewUtilKt {
    public static final void setNoStockLabel(@Nullable Integer num, @Nullable String str, @Nullable OStoreGoodsLabelView oStoreGoodsLabelView) {
        if (num != null && num.intValue() == 20) {
            if (!(str == null || str.length() == 0)) {
                if (oStoreGoodsLabelView != null) {
                    oStoreGoodsLabelView.setVisibility(0);
                }
                if (oStoreGoodsLabelView == null) {
                    return;
                }
                oStoreGoodsLabelView.setText(str);
                return;
            }
        }
        if (oStoreGoodsLabelView == null) {
            return;
        }
        oStoreGoodsLabelView.setVisibility(8);
    }

    public static /* synthetic */ void setNoStockLabel$default(Integer num, String str, OStoreGoodsLabelView oStoreGoodsLabelView, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        setNoStockLabel(num, str, oStoreGoodsLabelView);
    }
}
