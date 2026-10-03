package com.heytap.health.base.base;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseRecyclerAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {
    public List<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3162j;
    public a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f3163l;

    public interface a {
        void onItemClick(int i);
    }

    public BaseRecyclerAdapter(List<T> list, @LayoutRes int i) {
        this.i = list;
        this.f3162j = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(BaseViewHolder baseViewHolder, View view) {
        if (h()) {
            this.k.onItemClick(baseViewHolder.getAdapterPosition());
        }
    }

    public abstract void e(BaseViewHolder baseViewHolder, int i);

    public void f(BaseViewHolder baseViewHolder, int i) {
    }

    public final boolean g() {
        return this.f3163l != null;
    }

    public List<T> getData() {
        return this.i;
    }

    public T getItem(int i) {
        if (g()) {
            if (i == 0) {
                return null;
            }
            i--;
        }
        if (i < 0 || i >= this.i.size()) {
            return null;
        }
        return this.i.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return g() ? this.i.size() + 1 : this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (g() && i == 0) {
            return 100;
        }
        return super.getItemViewType(i);
    }

    public final boolean h() {
        return this.k != null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull final BaseViewHolder baseViewHolder, int i) {
        if (getItemViewType(i) == 100) {
            f(baseViewHolder, i);
            return;
        }
        if (h()) {
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.q81
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.i(baseViewHolder, view);
                }
            });
        }
        e(baseViewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return (g() && i == 100) ? new BaseViewHolder(this.f3163l) : new BaseViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(this.f3162j, viewGroup, false));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setNewData(List<T> list) {
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(a aVar) {
        this.k = aVar;
    }

    public BaseRecyclerAdapter(List<T> list, @LayoutRes int i, View view) {
        this.i = list;
        this.f3162j = i;
        this.f3163l = view;
    }
}
