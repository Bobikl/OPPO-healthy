package com.heytap.store.business.component.adapter.viewholder;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.store.base.widget.view.OStoreGoodsLabelView;
import com.heytap.store.base.widget.view.PriceTextView;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.adapter.viewholder.BaseProductGridViewHolder;
import com.heytap.store.business.component.entity.GoodsForm;
import com.heytap.store.business.component.entity.ProductLatticeDetail;
import com.heytap.store.business.component.listener.IOStoreCompentBindListener;
import com.heytap.store.business.component.utils.ColorParseUtilKt;
import com.heytap.store.business.component.utils.PriceUtilKt;
import com.heytap.store.business.component.widget.ProductLatticeLoaddingView;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.oplus.aiunit.vision.vhc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007JZ\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\"\b\u0002\u0010\u001c\u001a\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 JT\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\"\b\u0002\u0010\u001c\u001a\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lcom/heytap/store/business/component/adapter/viewholder/BaseProductGridViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "isHaveGrid", "", "isScrollBanner", "(Landroid/view/View;ZZ)V", "()Z", "outlineProvider", "Landroid/view/ViewOutlineProvider;", "getOutlineProvider", "()Landroid/view/ViewOutlineProvider;", "setOutlineProvider", "(Landroid/view/ViewOutlineProvider;)V", "radius", "", "getRadius", "()F", "radius$delegate", "Lkotlin/Lazy;", "bindData", "", "data", "Lcom/heytap/store/business/component/entity/ProductLatticeDetail;", "position", "", "innerPosition", "clickAction", "Lkotlin/Function3;", "", "bindListener", "Lcom/heytap/store/business/component/listener/IOStoreCompentBindListener;", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class BaseProductGridViewHolder extends RecyclerView.ViewHolder {
    private final boolean isHaveGrid;
    private final boolean isScrollBanner;

    @NotNull
    private ViewOutlineProvider outlineProvider;

    /* JADX INFO: renamed from: radius$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy radius;

    public /* synthetic */ BaseProductGridViewHolder(View view, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, z, (i & 4) != 0 ? false : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindData$default(BaseProductGridViewHolder baseProductGridViewHolder, ProductLatticeDetail productLatticeDetail, int i, int i2, Function3 function3, IOStoreCompentBindListener iOStoreCompentBindListener, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindData");
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        baseProductGridViewHolder.bindData(productLatticeDetail, i, i2, (i3 & 8) != 0 ? null : function3, (i3 & 16) != 0 ? null : iOStoreCompentBindListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: bindData$lambda-5$lambda-4, reason: not valid java name */
    public static final void m4833bindData$lambda5$lambda4(Function3 function3, ProductLatticeDetail productLatticeDetail, View view) {
        if (function3 != null) {
            function3.invoke(2, Long.valueOf(productLatticeDetail.getId()), -1);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public void bindData(@Nullable ProductLatticeDetail data, int position, int innerPosition, @Nullable Function3<? super Integer, ? super Long, ? super Integer, Unit> clickAction, @Nullable IOStoreCompentBindListener bindListener) {
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        bindData(itemView, data, position, innerPosition, clickAction, bindListener);
    }

    @NotNull
    public final ViewOutlineProvider getOutlineProvider() {
        return this.outlineProvider;
    }

    public final float getRadius() {
        return ((Number) this.radius.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: isHaveGrid, reason: from getter */
    public final boolean getIsHaveGrid() {
        return this.isHaveGrid;
    }

    /* JADX INFO: renamed from: isScrollBanner, reason: from getter */
    public final boolean getIsScrollBanner() {
        return this.isScrollBanner;
    }

    public final void setOutlineProvider(@NotNull ViewOutlineProvider viewOutlineProvider) {
        Intrinsics.checkNotNullParameter(viewOutlineProvider, "<set-?>");
        this.outlineProvider = viewOutlineProvider;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseProductGridViewHolder(@NotNull final View itemView, boolean z, boolean z2) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.isHaveGrid = z;
        this.isScrollBanner = z2;
        this.radius = LazyKt__LazyJVMKt.lazy(new Function0<Float>() { // from class: com.heytap.store.business.component.adapter.viewholder.BaseProductGridViewHolder$radius$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                return Float.valueOf(itemView.getContext().getResources().getDimensionPixelSize(R.dimen.pf_heytap_business_widget_base_item_radius));
            }
        });
        this.outlineProvider = new ViewOutlineProvider() { // from class: com.heytap.store.business.component.adapter.viewholder.BaseProductGridViewHolder$outlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@NotNull View view, @NotNull Outline outline) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.this$0.getRadius());
                view.setClipToOutline(true);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindData$default(BaseProductGridViewHolder baseProductGridViewHolder, View view, ProductLatticeDetail productLatticeDetail, int i, int i2, Function3 function3, IOStoreCompentBindListener iOStoreCompentBindListener, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindData");
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        baseProductGridViewHolder.bindData(view, productLatticeDetail, i, i2, (i3 & 16) != 0 ? null : function3, (i3 & 32) != 0 ? null : iOStoreCompentBindListener);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    public final void bindData(@NotNull View itemView, @Nullable final ProductLatticeDetail data, int position, int innerPosition, @Nullable final Function3<? super Integer, ? super Long, ? super Integer, Unit> clickAction, @Nullable IOStoreCompentBindListener bindListener) {
        String noStockStr;
        boolean z;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (this.isHaveGrid && !this.isScrollBanner) {
            itemView.setOutlineProvider(this.outlineProvider);
        }
        ProductLatticeLoaddingView productLatticeLoaddingView = (ProductLatticeLoaddingView) itemView.findViewById(R.id.product_grid_bg_img);
        ImageView productImg = (ImageView) itemView.findViewById(R.id.product_grid_product_img);
        TextView textView = (TextView) itemView.findViewById(R.id.product_grid_title);
        TextView textView2 = (TextView) itemView.findViewById(R.id.product_grid_subtitle);
        PriceTextView priceText = (PriceTextView) itemView.findViewById(R.id.product_grid_price);
        OStoreGoodsLabelView oStoreGoodsLabelView = (OStoreGoodsLabelView) itemView.findViewById(R.id.tv_goods_label);
        productLatticeLoaddingView.setImageResource("");
        productImg.setImageResource(0);
        priceText.setVisibility(8);
        if (data == null || (noStockStr = data.getNoStockStr()) == null) {
            noStockStr = "";
        }
        oStoreGoodsLabelView.setText(noStockStr);
        if (data == null) {
            return;
        }
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
        itemView.setBackgroundColor(ColorParseUtilKt.parseColorSafely(vhc.a(context) ? "" : data.getBackgroundColor(), ContextCompat.getColor(itemView.getContext(), R.color.pf_heytap_business_widget_base_background_color)));
        String backgroundPicJson = data.getBackgroundPicJson();
        if (backgroundPicJson == null || backgroundPicJson.length() == 0) {
            String backgroundPic = data.getBackgroundPic();
            if (backgroundPic != null) {
                productLatticeLoaddingView.setImageResource(backgroundPic);
            }
        } else {
            String backgroundPicJson2 = data.getBackgroundPicJson();
            if (backgroundPicJson2 != null) {
                productLatticeLoaddingView.setImageResource(backgroundPicJson2);
            }
        }
        String pic = data.getPic();
        if (pic != null) {
            Intrinsics.checkNotNullExpressionValue(productImg, "productImg");
            ImageLoader.load(pic, productImg);
        }
        textView.setText(data.getTitle());
        textView2.setText(data.getSecondTitle());
        GoodsForm goodsForm = data.getGoodsForm();
        if (goodsForm != null) {
            String marketPrice = goodsForm.getMarketPrice();
            if (marketPrice != null) {
                z = marketPrice.length() > 0;
            }
            String marketPrice2 = z ? goodsForm.getMarketPrice() : goodsForm.getPrice();
            String priceSuffix = goodsForm.getPriceSuffix();
            String currencySymbol = PriceUtilKt.getCurrencySymbol(data.getGoodsForm());
            Intrinsics.checkNotNullExpressionValue(priceText, "priceText");
            PriceTextView.update$default(priceText, marketPrice2, null, null, null, null, null, Boolean.TRUE, null, null, priceSuffix, null, null, null, null, currencySymbol, null, 48574, null);
            priceText.setVisibility(0);
        }
        if (bindListener != null) {
            IOStoreCompentBindListener.DefaultImpls.onBindView$default(bindListener, itemView, 2, Integer.valueOf(data.getPosition()).intValue(), Long.valueOf(data.getId()).longValue(), null, 16, null);
        }
        itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.n71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseProductGridViewHolder.m4833bindData$lambda5$lambda4(clickAction, data, view);
            }
        });
    }
}
