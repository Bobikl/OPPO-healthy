package com.heytap.store.splash.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.store.entity.HomeConfigDetailBean;
import com.heytap.store.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class StoreHotWordAdapter extends RecyclerView.Adapter<a> {
    private List<HomeConfigDetailBean> mList;

    public static class a extends RecyclerView.ViewHolder {
        public TextView i;

        public a(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R.id.tv_message);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mList != null ? Integer.MAX_VALUE : 0;
    }

    public HomeConfigDetailBean getItemData(int i) {
        List<HomeConfigDetailBean> list = this.mList;
        if (list != null) {
            return list.get(i % list.size());
        }
        return null;
    }

    public void setList(List<HomeConfigDetailBean> list) {
        if (list == null) {
            return;
        }
        if (this.mList == null) {
            this.mList = new ArrayList();
        }
        this.mList.clear();
        this.mList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull a aVar, int i) {
        List<HomeConfigDetailBean> list = this.mList;
        if (list == null || list.size() <= 0) {
            return;
        }
        TextView textView = aVar.i;
        List<HomeConfigDetailBean> list2 = this.mList;
        textView.setText(list2.get(i % list2.size()).getTitle());
        View view = aVar.itemView;
        List<HomeConfigDetailBean> list3 = this.mList;
        view.setTag(list3.get(i % list3.size()).getLink());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a(View.inflate(viewGroup.getContext(), R.layout.home_hot_word_item, null));
    }
}
