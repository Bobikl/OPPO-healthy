package com.heytap.store.product_support.viewmodel;

import com.heytap.store.product_support.R;
import com.heytap.store.product_support.data.ProductCardActivity;
import com.heytap.store.product_support.data.RecommendProductCardInfoBean;
import com.heytap.store.product_support.data.VipDiscountsVo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/heytap/store/product_support/viewmodel/RecommendCardViewModel;", "", "data", "Lcom/heytap/store/product_support/data/RecommendProductCardInfoBean;", "showNoInterested", "", "(Lcom/heytap/store/product_support/data/RecommendProductCardInfoBean;Z)V", "getData", "()Lcom/heytap/store/product_support/data/RecommendProductCardInfoBean;", "descTitleVis", "", "getDescTitleVis", "()I", "discountVis", "getDiscountVis", "moreBtnVis", "getMoreBtnVis", "placeHolderColor", "getPlaceHolderColor", "placeholderLabelVis", "getPlaceholderLabelVis", "vipDiscount", "Lcom/heytap/store/product_support/data/VipDiscountsVo;", "getVipDiscount", "()Lcom/heytap/store/product_support/data/VipDiscountsVo;", "vipDiscountVis", "getVipDiscountVis", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RecommendCardViewModel {

    @NotNull
    private final RecommendProductCardInfoBean data;
    private final int descTitleVis;
    private final int discountVis;
    private final int moreBtnVis;
    private final int placeHolderColor;
    private final int placeholderLabelVis;

    @Nullable
    private final VipDiscountsVo vipDiscount;
    private final int vipDiscountVis;

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    public RecommendCardViewModel(@NotNull RecommendProductCardInfoBean data, boolean z) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.placeHolderColor = R.color.pf_product_card_place_holder_color;
        List<ProductCardActivity> activityList = data.getActivityList();
        boolean z2 = true;
        if (activityList == null || activityList.isEmpty()) {
            if (data.getHeytapInfo().length() == 0) {
                i = 8;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        this.discountVis = i;
        this.descTitleVis = ((data.getSecondTitle().length() == 0) || !data.getIsShowSecondTitle()) ? 8 : 0;
        this.moreBtnVis = (z && data.getVipDiscounts() == null) ? 0 : 8;
        this.vipDiscountVis = data.getVipDiscounts() != null ? 0 : 8;
        this.vipDiscount = data.getVipDiscounts();
        ProductCardActivity placeholderLabel = data.getPlaceholderLabel();
        if (placeholderLabel != null && placeholderLabel.getType() == 20) {
            ProductCardActivity placeholderLabel2 = data.getPlaceholderLabel();
            String activityInfo = placeholderLabel2 == null ? null : placeholderLabel2.getActivityInfo();
            if (activityInfo != null && activityInfo.length() != 0) {
                z2 = false;
            }
            i2 = z2 ? 8 : 0;
        }
        this.placeholderLabelVis = i2;
    }

    @NotNull
    public final RecommendProductCardInfoBean getData() {
        return this.data;
    }

    public final int getDescTitleVis() {
        return this.descTitleVis;
    }

    public final int getDiscountVis() {
        return this.discountVis;
    }

    public final int getMoreBtnVis() {
        return this.moreBtnVis;
    }

    public final int getPlaceHolderColor() {
        return this.placeHolderColor;
    }

    public final int getPlaceholderLabelVis() {
        return this.placeholderLabelVis;
    }

    @Nullable
    public final VipDiscountsVo getVipDiscount() {
        return this.vipDiscount;
    }

    public final int getVipDiscountVis() {
        return this.vipDiscountVis;
    }
}
