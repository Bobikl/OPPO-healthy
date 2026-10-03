package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.base.widget.view.OStoreGoodsLabelView;
import com.heytap.store.base.widget.view.PriceTextView;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.widget.ProductLatticeLoaddingView;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetProductGridListItemLargeBinding implements ViewBinding {

    @NonNull
    public final ProductLatticeLoaddingView productGridBgImg;

    @NonNull
    public final PriceTextView productGridPrice;

    @NonNull
    public final ImageView productGridProductImg;

    @NonNull
    public final TextView productGridSubtitle;

    @NonNull
    public final TextView productGridTitle;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final OStoreGoodsLabelView tvGoodsLabel;

    private PfHeytapBusinessWidgetProductGridListItemLargeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ProductLatticeLoaddingView productLatticeLoaddingView, @NonNull PriceTextView priceTextView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull OStoreGoodsLabelView oStoreGoodsLabelView) {
        this.rootView = constraintLayout;
        this.productGridBgImg = productLatticeLoaddingView;
        this.productGridPrice = priceTextView;
        this.productGridProductImg = imageView;
        this.productGridSubtitle = textView;
        this.productGridTitle = textView2;
        this.tvGoodsLabel = oStoreGoodsLabelView;
    }

    @NonNull
    public static PfHeytapBusinessWidgetProductGridListItemLargeBinding bind(@NonNull View view) {
        int i = R.id.product_grid_bg_img;
        ProductLatticeLoaddingView productLatticeLoaddingView = (ProductLatticeLoaddingView) view.findViewById(i);
        if (productLatticeLoaddingView != null) {
            i = R.id.product_grid_price;
            PriceTextView priceTextView = (PriceTextView) view.findViewById(i);
            if (priceTextView != null) {
                i = R.id.product_grid_product_img;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    i = R.id.product_grid_subtitle;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null) {
                        i = R.id.product_grid_title;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            i = R.id.tv_goods_label;
                            OStoreGoodsLabelView oStoreGoodsLabelView = (OStoreGoodsLabelView) view.findViewById(i);
                            if (oStoreGoodsLabelView != null) {
                                return new PfHeytapBusinessWidgetProductGridListItemLargeBinding((ConstraintLayout) view, productLatticeLoaddingView, priceTextView, imageView, textView, textView2, oStoreGoodsLabelView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetProductGridListItemLargeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PfHeytapBusinessWidgetProductGridListItemLargeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.pf_heytap_business_widget_product_grid_list_item_large, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
