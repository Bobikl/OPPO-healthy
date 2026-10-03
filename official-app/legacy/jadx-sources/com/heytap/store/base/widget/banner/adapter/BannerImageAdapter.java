package com.heytap.store.base.widget.banner.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.heytap.store.base.widget.banner.holder.BannerImageHolder;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BannerImageAdapter<T> extends BannerAdapter<T, BannerImageHolder> {
    public BannerImageAdapter(List<T> list) {
        super(list);
    }

    @Override // com.heytap.store.base.widget.banner.holder.IViewHolder
    public BannerImageHolder onCreateHolder(ViewGroup viewGroup, int i) {
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new BannerImageHolder(imageView);
    }
}
