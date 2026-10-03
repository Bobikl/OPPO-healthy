package com.heytap.store.base.widget.banner.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.heytap.store.base.widget.banner.holder.IViewHolder;
import com.heytap.store.base.widget.banner.listener.OnBannerListener;
import com.heytap.store.base.widget.banner.util.BannerUtils;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BannerAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> implements IViewHolder<T, VH> {
    private OnBannerListener mOnBannerListener;
    private VH mViewHolder;
    protected List<T> mData = new ArrayList();
    private int increaseCount = 2;

    public BannerAdapter(List<T> list) {
        setDatas(list);
    }

    public T getData(int i) {
        return this.mData.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getRealCount() > 1 ? getRealCount() + this.increaseCount : getRealCount();
    }

    public int getRealCount() {
        List<T> list = this.mData;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getRealPosition(int i) {
        return BannerUtils.getRealPosition(this.increaseCount == 2, i, getRealCount());
    }

    public VH getViewHolder() {
        return this.mViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull VH vh, int i) {
        this.mViewHolder = vh;
        final int realPosition = getRealPosition(i);
        onBindView(vh, this.mData.get(realPosition), realPosition, getRealCount());
        if (this.mOnBannerListener != null) {
            vh.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.store.base.widget.banner.adapter.BannerAdapter.1
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    BannerAdapter.this.mOnBannerListener.OnBannerClick(BannerAdapter.this.mData.get(realPosition), realPosition);
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return onCreateHolder(viewGroup, i);
    }

    public void setDatas(List<T> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.mData = list;
    }

    public void setIncreaseCount(int i) {
        this.increaseCount = i;
    }

    public void setOnBannerListener(OnBannerListener onBannerListener) {
        this.mOnBannerListener = onBannerListener;
    }
}
