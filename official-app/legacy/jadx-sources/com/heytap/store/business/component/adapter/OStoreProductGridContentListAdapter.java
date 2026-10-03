package com.heytap.store.business.component.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.adapter.viewholder.BaseProductGridViewHolder;
import com.heytap.store.business.component.adapter.viewholder.ProductGridCarouselViewHolder;
import com.heytap.store.business.component.entity.ProductLatticeDetail;
import com.heytap.store.business.component.listener.IOStoreCompentBindListener;
import com.heytap.store.business.component.utils.ScreenParamUtilKt;
import com.heytap.store.business.component.utils.ViewKtKt;
import com.oplus.smartenginehelper.ParserTag;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u001dH\u0016J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u001dH\u0016J\u0010\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\fH\u0002J\u0010\u00105\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\fH\u0002J\u0018\u00106\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u001dH\u0016J\u0018\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001dH\u0016J-\u0010;\u001a\u00020\u001f2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010=2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010>\u001a\u00020\u0010¢\u0006\u0002\u0010?R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR4\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010'\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001a\u0010*\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001a¨\u0006A"}, d2 = {"Lcom/heytap/store/business/component/adapter/OStoreProductGridContentListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "bindListener", "Lcom/heytap/store/business/component/listener/IOStoreCompentBindListener;", "getBindListener", "()Lcom/heytap/store/business/component/listener/IOStoreCompentBindListener;", "setBindListener", "(Lcom/heytap/store/business/component/listener/IOStoreCompentBindListener;)V", "dataList", "", "Lcom/heytap/store/business/component/entity/ProductLatticeDetail;", "getDataList", "()Ljava/util/List;", "isFoldWindowPad", "", "isHaveGrid", "()Z", "setHaveGrid", "(Z)V", "itemSpace", "", "getItemSpace", "()F", "setItemSpace", "(F)V", "mClickAction", "Lkotlin/Function3;", "", "", "", "getMClickAction", "()Lkotlin/jvm/functions/Function3;", "setMClickAction", "(Lkotlin/jvm/functions/Function3;)V", "recyclerStartEndMargin", "getRecyclerStartEndMargin", "setRecyclerStartEndMargin", "recyclerStartLeftMargin", "getRecyclerStartLeftMargin", "setRecyclerStartLeftMargin", "topSpace", "getTopSpace", "setTopSpace", "configWidthBeforeBind", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "Lcom/heytap/store/business/component/adapter/viewholder/BaseProductGridViewHolder;", "getItemCount", "getItemViewType", "position", "getLargeCardType", "item", "getMiddleCardType", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", ParserTag.VIEW_TYPE, "setData", "data", "", "isFold", "(Ljava/util/List;Ljava/lang/Float;Z)V", "MultiCardGridViewHolder", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class OStoreProductGridContentListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Nullable
    private IOStoreCompentBindListener bindListener;
    private float itemSpace;

    @Nullable
    private Function3<? super Integer, ? super Long, ? super Integer, Unit> mClickAction;
    private float recyclerStartEndMargin;
    private float recyclerStartLeftMargin;
    private float topSpace;

    @NotNull
    private final List<ProductLatticeDetail> dataList = new ArrayList();
    private boolean isHaveGrid = true;
    private boolean isFoldWindowPad = true;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJN\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052 \u0010\u0017\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J*\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/business/component/adapter/OStoreProductGridContentListAdapter$MultiCardGridViewHolder;", "Lcom/heytap/store/business/component/adapter/viewholder/BaseProductGridViewHolder;", "rootView", "Landroid/widget/LinearLayout;", "type", "", "topSpace", "", "isHaveGrid", "", "(Lcom/heytap/store/business/component/adapter/OStoreProductGridContentListAdapter;Landroid/widget/LinearLayout;IFZ)V", "card1", "Landroid/view/View;", "card2", "card3", "getType", "()I", "bindData", "", "data", "Lcom/heytap/store/business/component/entity/ProductLatticeDetail;", "position", "innerPosition", "clickAction", "Lkotlin/Function3;", "", "bindListener", "Lcom/heytap/store/business/component/listener/IOStoreCompentBindListener;", "getMultiCardView", "gridType", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MultiCardGridViewHolder extends BaseProductGridViewHolder {

        @Nullable
        private View card1;

        @Nullable
        private View card2;

        @Nullable
        private View card3;
        final /* synthetic */ OStoreProductGridContentListAdapter this$0;
        private final int type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiCardGridViewHolder(@NotNull OStoreProductGridContentListAdapter this$0, LinearLayout rootView, int i, float f, boolean z) {
            super(rootView, z, false, 4, null);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            this.this$0 = this$0;
            this.type = i;
            getMultiCardView(rootView, i, f, z);
        }

        private final LinearLayout getMultiCardView(LinearLayout rootView, int gridType, float topSpace, boolean isHaveGrid) {
            int dimensionPixelOffset = (topSpace > 0.0f ? 1 : (topSpace == 0.0f ? 0 : -1)) == 0 ? rootView.getContext().getResources().getDimensionPixelOffset(R.dimen.pf_heytap_business_widget_product_grid_card_spacing) : (int) topSpace;
            if (!isHaveGrid) {
                dimensionPixelOffset = 0;
            }
            int i = R.layout.pf_heytap_business_widget_product_grid_list_item_small;
            rootView.setOrientation(1);
            View viewInflate = LayoutInflater.from(rootView.getContext()).inflate(i, (ViewGroup) rootView, false);
            this.card1 = viewInflate;
            rootView.addView(viewInflate);
            View viewInflate2 = LayoutInflater.from(rootView.getContext()).inflate(i, (ViewGroup) rootView, false);
            this.card2 = viewInflate2;
            ViewGroup.LayoutParams layoutParams = viewInflate2 == null ? null : viewInflate2.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin = dimensionPixelOffset;
                View view = this.card2;
                if (view != null) {
                    view.setLayoutParams(layoutParams2);
                }
            }
            rootView.addView(this.card2);
            if (gridType == 1) {
                View viewInflate3 = LayoutInflater.from(rootView.getContext()).inflate(i, (ViewGroup) rootView, false);
                this.card3 = viewInflate3;
                ViewGroup.LayoutParams layoutParams3 = viewInflate3 == null ? null : viewInflate3.getLayoutParams();
                LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams4 != null) {
                    layoutParams4.topMargin = dimensionPixelOffset;
                    View view2 = this.card3;
                    if (view2 != null) {
                        view2.setLayoutParams(layoutParams4);
                    }
                }
                rootView.addView(this.card3);
            }
            return rootView;
        }

        public static /* synthetic */ LinearLayout getMultiCardView$default(MultiCardGridViewHolder multiCardGridViewHolder, LinearLayout linearLayout, int i, float f, boolean z, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                z = true;
            }
            return multiCardGridViewHolder.getMultiCardView(linearLayout, i, f, z);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0015  */
        @Override // com.heytap.store.business.component.adapter.viewholder.BaseProductGridViewHolder
        public void bindData(@Nullable ProductLatticeDetail data, int position, int innerPosition, @Nullable Function3<? super Integer, ? super Long, ? super Integer, Unit> clickAction, @Nullable IOStoreCompentBindListener bindListener) {
            List<ProductLatticeDetail> list;
            if ((data == null ? null : data.getExtendObj()) != null) {
                List<ProductLatticeDetail> extendObj = data.getExtendObj();
                if (extendObj instanceof List) {
                    list = extendObj;
                } else {
                    list = null;
                }
            } else {
                list = null;
            }
            List<ProductLatticeDetail> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            View view = this.card1;
            if (view != null) {
                Object orNull = CollectionsKt___CollectionsKt.getOrNull(list, 0);
                if (orNull instanceof ProductLatticeDetail) {
                    bindData(view, (ProductLatticeDetail) orNull, position, 0, clickAction, bindListener);
                }
            }
            View view2 = this.card2;
            if (view2 != null) {
                Object orNull2 = CollectionsKt___CollectionsKt.getOrNull(list, 1);
                if (orNull2 instanceof ProductLatticeDetail) {
                    bindData(view2, (ProductLatticeDetail) orNull2, position, 1, clickAction, bindListener);
                }
            }
            View view3 = this.card3;
            if (view3 == null) {
                return;
            }
            Object orNull3 = CollectionsKt___CollectionsKt.getOrNull(list, 2);
            if (orNull3 instanceof ProductLatticeDetail) {
                bindData(view3, (ProductLatticeDetail) orNull3, position, 2, clickAction, bindListener);
            }
        }

        public final int getType() {
            return this.type;
        }
    }

    private final int getLargeCardType(ProductLatticeDetail item) {
        List<ProductLatticeDetail> childDetails = item.getChildDetails();
        return childDetails == null || childDetails.isEmpty() ? 3 : 6;
    }

    private final int getMiddleCardType(ProductLatticeDetail item) {
        List<ProductLatticeDetail> childDetails = item.getChildDetails();
        return childDetails == null || childDetails.isEmpty() ? 4 : 7;
    }

    public void configWidthBeforeBind(@NotNull BaseProductGridViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Nullable
    public final IOStoreCompentBindListener getBindListener() {
        return this.bindListener;
    }

    @NotNull
    public final List<ProductLatticeDetail> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    public final float getItemSpace() {
        return this.itemSpace;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        ProductLatticeDetail productLatticeDetail = (ProductLatticeDetail) CollectionsKt___CollectionsKt.getOrNull(this.dataList, position);
        if (productLatticeDetail == null) {
            return super.getItemViewType(position);
        }
        int gridType = productLatticeDetail.getGridType();
        if (gridType == 1) {
            if (productLatticeDetail.getCardType() == 1) {
                return 1;
            }
            return getLargeCardType(productLatticeDetail);
        }
        if (gridType == 2) {
            if (productLatticeDetail.getCardType() == 2) {
                return 2;
            }
            return getMiddleCardType(productLatticeDetail);
        }
        if (gridType == 3) {
            return getLargeCardType(productLatticeDetail);
        }
        if (gridType != 4) {
            return 5;
        }
        return getMiddleCardType(productLatticeDetail);
    }

    @Nullable
    public final Function3<Integer, Long, Integer, Unit> getMClickAction() {
        return this.mClickAction;
    }

    public final float getRecyclerStartEndMargin() {
        return this.recyclerStartEndMargin;
    }

    public final float getRecyclerStartLeftMargin() {
        return this.recyclerStartLeftMargin;
    }

    public final float getTopSpace() {
        return this.topSpace;
    }

    /* JADX INFO: renamed from: isHaveGrid, reason: from getter */
    public final boolean getIsHaveGrid() {
        return this.isHaveGrid;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof BaseProductGridViewHolder) {
            ((BaseProductGridViewHolder) holder).bindData((ProductLatticeDetail) CollectionsKt___CollectionsKt.getOrNull(this.dataList, position), position, -1, this.mClickAction, this.bindListener);
        } else if (holder instanceof ProductGridCarouselViewHolder) {
            ((ProductGridCarouselViewHolder) holder).bindingData((ProductLatticeDetail) CollectionsKt___CollectionsKt.getOrNull(this.dataList, position), this.isHaveGrid, this.mClickAction, this.bindListener);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        RecyclerView.LayoutParams layoutParams;
        RecyclerView.ViewHolder productGridCarouselViewHolder;
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (viewType) {
            case 1:
            case 2:
                return new MultiCardGridViewHolder(this, new LinearLayout(parent.getContext()), viewType, this.topSpace, this.isHaveGrid);
            case 3:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pf_heytap_business_widget_product_grid_list_item_large, parent, false);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams = layoutParams2 instanceof RecyclerView.LayoutParams ? (RecyclerView.LayoutParams) layoutParams2 : null;
                if (layoutParams != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = DisplayUtil.dip2px(270.0f);
                }
                Intrinsics.checkNotNullExpressionValue(view, "view");
                return new BaseProductGridViewHolder(view, this.isHaveGrid, false, 4, null);
            case 4:
                View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.pf_heytap_business_widget_product_grid_list_item_middle, parent, false);
                ViewGroup.LayoutParams layoutParams3 = itemView.getLayoutParams();
                layoutParams = layoutParams3 instanceof RecyclerView.LayoutParams ? (RecyclerView.LayoutParams) layoutParams3 : null;
                if (layoutParams != null) {
                    if (ScreenParamUtilKt.isPad(itemView.getContext())) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = DisplayUtil.dip2px(180.0f);
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = DisplayUtil.dip2px(200.0f);
                        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                        ViewKtKt.addOutlineProvider(itemView, itemView.getContext().getResources().getDimension(R.dimen.pf_heytap_business_widget_base_item_radius));
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = DisplayUtil.dip2px(180.0f);
                    }
                }
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                return new BaseProductGridViewHolder(itemView, this.isHaveGrid, false, 4, null);
            case 5:
                View smallView = LayoutInflater.from(parent.getContext()).inflate(R.layout.pf_heytap_business_widget_product_grid_list_item_small, parent, false);
                ViewGroup.LayoutParams layoutParams4 = smallView.getLayoutParams();
                layoutParams = layoutParams4 instanceof RecyclerView.LayoutParams ? (RecyclerView.LayoutParams) layoutParams4 : null;
                if (layoutParams != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = DisplayUtil.dip2px(90.0f);
                }
                Intrinsics.checkNotNullExpressionValue(smallView, "smallView");
                return new BaseProductGridViewHolder(smallView, this.isHaveGrid, false, 4, null);
            case 6:
            case 7:
                View itemView2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.pf_heytap_business_widget_product_grid_scroll_item_layout, parent, false);
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                productGridCarouselViewHolder = new ProductGridCarouselViewHolder(itemView2, viewType, this.isFoldWindowPad);
                break;
            case 8:
                View itemView3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.pf_heytap_business_widget_product_grid_list_item_middle, parent, false);
                float screenWidth = DisplayUtil.getScreenWidth(parent.getContext());
                float f = this.itemSpace * 2;
                float f2 = this.recyclerStartEndMargin;
                float f3 = (((screenWidth - ((f + f2) + f2)) / 3) * 50) / 45;
                ViewGroup.LayoutParams layoutParams5 = itemView3.getLayoutParams();
                layoutParams = layoutParams5 instanceof RecyclerView.LayoutParams ? (RecyclerView.LayoutParams) layoutParams5 : null;
                if (layoutParams != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) f3;
                }
                Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                return new BaseProductGridViewHolder(itemView3, this.isHaveGrid, false, 4, null);
            default:
                View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.pf_heytap_business_widget_product_grid_list_item_small, parent, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context).inf…lse\n                    )");
                productGridCarouselViewHolder = new BaseProductGridViewHolder(viewInflate, this.isHaveGrid, false, 4, null);
                break;
        }
        return productGridCarouselViewHolder;
    }

    public final void setBindListener(@Nullable IOStoreCompentBindListener iOStoreCompentBindListener) {
        this.bindListener = iOStoreCompentBindListener;
    }

    public final void setData(@Nullable List<ProductLatticeDetail> data, @Nullable Float itemSpace, boolean isFold) {
        if (itemSpace != null) {
            setTopSpace(itemSpace.floatValue());
        }
        this.isFoldWindowPad = isFold;
        this.dataList.clear();
        List<ProductLatticeDetail> list = data;
        if (!(list == null || list.isEmpty())) {
            this.dataList.addAll(list);
        }
        notifyDataSetChanged();
    }

    public final void setHaveGrid(boolean z) {
        this.isHaveGrid = z;
    }

    public final void setItemSpace(float f) {
        this.itemSpace = f;
    }

    public final void setMClickAction(@Nullable Function3<? super Integer, ? super Long, ? super Integer, Unit> function3) {
        this.mClickAction = function3;
    }

    public final void setRecyclerStartEndMargin(float f) {
        this.recyclerStartEndMargin = f;
    }

    public final void setRecyclerStartLeftMargin(float f) {
        this.recyclerStartLeftMargin = f;
    }

    public final void setTopSpace(float f) {
        this.topSpace = f;
    }
}
