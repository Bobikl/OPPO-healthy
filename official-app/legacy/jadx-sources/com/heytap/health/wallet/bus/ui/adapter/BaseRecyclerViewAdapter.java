package com.heytap.health.wallet.bus.ui.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseRecyclerViewAdapter<T> extends RecyclerView.Adapter<BaseRecyclerViewHolder<T>> {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<T> f6182j;

    public interface a {
    }

    public BaseRecyclerViewAdapter(Context context, List<T> list) {
        this.i = context;
        this.f6182j = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull BaseRecyclerViewHolder<T> baseRecyclerViewHolder, int i) {
        List<T> list = this.f6182j;
        if (list == null || i >= list.size() || this.f6182j.get(i) == null) {
            return;
        }
        baseRecyclerViewHolder.itemView.setTag(BaseRecyclerViewHolder.HOLDER_TAG_HEADER.concat(String.valueOf(i)));
        baseRecyclerViewHolder.setData(this.f6182j.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract BaseRecyclerViewHolder<T> onCreateViewHolder(@NonNull ViewGroup viewGroup, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<T> list = this.f6182j;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void setOnItemClickListner(a aVar) {
    }
}
