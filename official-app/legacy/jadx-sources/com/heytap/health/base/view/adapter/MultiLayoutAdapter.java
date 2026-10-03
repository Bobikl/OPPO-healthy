package com.heytap.health.base.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.e7c;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class MultiLayoutAdapter extends RecyclerView.Adapter<GeneralViewHolder> {
    public List<? extends e7c> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f3308j;

    public static class GeneralViewHolder extends RecyclerView.ViewHolder {
        public GeneralViewHolder(@NonNull View view) {
            super(view);
        }
    }

    public MultiLayoutAdapter(Context context, List<? extends e7c> list) {
        this.f3308j = context;
        this.i = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull GeneralViewHolder generalViewHolder, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onBindViewHolder position is ");
        sb.append(i);
        this.i.get(i).b(generalViewHolder, i, this.f3308j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull GeneralViewHolder generalViewHolder, int i, @NonNull List<Object> list) {
        onBindViewHolder(generalViewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public GeneralViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new GeneralViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    public void g(List<? extends e7c> list) {
        this.i = list;
        notifyDataSetChanged();
    }

    public List<? extends e7c> getData() {
        return this.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.i == null) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getItemCount:");
        sb.append(this.i.size());
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.i.get(i).a();
    }
}
