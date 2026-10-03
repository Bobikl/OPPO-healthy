package com.heytap.nearx.uikit.widget.banner.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.NearBaseAdapter;
import androidx.recyclerview.widget.NearBaseViewHolder;
import com.heytap.nearx.uikit.widget.banner.NearBannerUtil;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public abstract class NearBannerBaseAdapter<T, VH extends NearBaseViewHolder<T>> extends NearBaseAdapter<T, VH> {
    protected int type = 1;

    public NearBannerBaseAdapter() {
    }

    public abstract VH createVH(View view);

    public int getAdapterType() {
        return this.type;
    }

    @Override // androidx.recyclerview.widget.NearBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return isIncreased() ? getRealCount() + 2 : super.getItemCount();
    }

    public int getRealCount() {
        List<T> list = this.mList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getRealPosition(int i) {
        return NearBannerUtil.getRealPosition(isIncreased(), i, getRealCount());
    }

    public boolean isIncreased() {
        return getAdapterType() == 0;
    }

    public abstract View onCreateExpandView(ViewGroup viewGroup, int i);

    public abstract View onCreateNormalView(ViewGroup viewGroup, int i);

    public void setAdapterType(int i) {
        this.type = i;
    }

    @Override // androidx.recyclerview.widget.NearBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull VH vh, int i) {
        if (isIncreased()) {
            super.onBindViewHolder((NearBaseViewHolder) vh, getRealPosition(i));
        } else {
            super.onBindViewHolder((NearBaseViewHolder) vh, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewOnCreateExpandView;
        if (isIncreased()) {
            viewOnCreateExpandView = onCreateNormalView(viewGroup, i);
            if (viewOnCreateExpandView.getLayoutParams() == null || viewOnCreateExpandView.getLayoutParams().width != -1 || viewOnCreateExpandView.getLayoutParams().height != -1) {
                throw new IllegalArgumentException("The width and height of the view must be 'MATCH_PARENT' when onCreateNormalView(parent, viewType) ");
            }
        } else {
            viewOnCreateExpandView = onCreateExpandView(viewGroup, i);
        }
        return (VH) createVH(viewOnCreateExpandView);
    }

    public NearBannerBaseAdapter(List<T> list) {
        this.mList = list;
    }
}
