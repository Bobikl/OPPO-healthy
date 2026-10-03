package com.heytap.store.homemodule.adapter;

import android.view.View;
import android.widget.ImageView;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.base.widget.recyclerview.BaseRViewHolder;
import com.heytap.store.business.component.utils.ViewKtKt;
import com.heytap.store.home.R;
import com.heytap.store.homemodule.data.HomeItemDetail;
import com.heytap.store.platform.imageloader.ImageLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/heytap/store/homemodule/adapter/ImageViewHolder;", "Lcom/heytap/store/base/widget/recyclerview/BaseRViewHolder;", "Lcom/heytap/store/homemodule/data/HomeItemDetail;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "picView", "Landroid/widget/ImageView;", "bindData", "", "data", "setContent", "homeItemDetail", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ImageViewHolder extends BaseRViewHolder<HomeItemDetail> {

    @NotNull
    private final ImageView picView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R.id.sd_pic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.sd_pic)");
        this.picView = (ImageView) viewFindViewById;
        ViewKtKt.addOutlineProvider(itemView, DisplayUtil.dip2px(12.0f));
    }

    public final void setContent(@NotNull HomeItemDetail homeItemDetail) {
        Intrinsics.checkNotNullParameter(homeItemDetail, "homeItemDetail");
        if (homeItemDetail.getPic().length() > 0) {
            ImageLoader.load(homeItemDetail.getPic(), this.picView);
        }
    }

    @Override // com.heytap.store.base.widget.recyclerview.BaseRViewHolder
    public void bindData(@Nullable HomeItemDetail data) {
        super.bindData(data);
        if (data != null) {
            setContent(data);
        }
    }
}
