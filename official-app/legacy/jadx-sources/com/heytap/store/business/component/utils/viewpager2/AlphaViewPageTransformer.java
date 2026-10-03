package com.heytap.store.business.component.utils.viewpager2;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.heytap.store.apm.util.DataReportUtilKt;
import com.heytap.store.base.widget.view.OStoreGoodsLabelView;
import com.heytap.store.base.widget.view.PriceTextView;
import com.heytap.store.business.component.R;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/heytap/store/business/component/utils/viewpager2/AlphaViewPageTransformer;", "Landroidx/viewpager2/widget/ViewPager2$PageTransformer;", "()V", "startAlpha", "", "view", "Landroid/view/View;", "transformPage", "position", "", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AlphaViewPageTransformer implements ViewPager2.PageTransformer {
    public final void startAlpha(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@NotNull View view, float position) {
        float f;
        Intrinsics.checkNotNullParameter(view, "view");
        double d = position;
        if (0.0d <= d && d <= 1.0d) {
            f = 1.0f - position;
        } else if (position < -1.0f || position >= 0.0f) {
            f = 0.0f;
        } else {
            float f2 = 1 + position;
            if (f2 == 1.0f) {
                view.setVisibility(0);
            }
            f = f2;
        }
        try {
            TextView textView = (TextView) view.findViewById(R.id.product_grid_title);
            PriceTextView priceTextView = (PriceTextView) view.findViewById(R.id.product_grid_price);
            TextView textView2 = (TextView) view.findViewById(R.id.product_grid_subtitle);
            ImageView imageView = (ImageView) view.findViewById(R.id.product_grid_product_img);
            OStoreGoodsLabelView oStoreGoodsLabelView = (OStoreGoodsLabelView) view.findViewById(R.id.tv_goods_label);
            if (f < 0.5f) {
                f = 0.5f;
            }
            textView.setAlpha(f);
            priceTextView.setAlpha(f);
            textView2.setAlpha(f);
            imageView.setAlpha(f);
            oStoreGoodsLabelView.setAlpha(f);
        } catch (Exception e2) {
            DataReportUtilKt.reportExceptionEvent(e2);
        }
    }
}
