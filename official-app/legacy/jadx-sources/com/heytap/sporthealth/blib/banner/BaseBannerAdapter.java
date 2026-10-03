package com.heytap.sporthealth.blib.banner;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.sporthealth.blib.banner.BaseBannerAdapter.ViewHolder;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseBannerAdapter<V extends ViewHolder, T> extends RecyclerView.Adapter<V> {
    public List<T> i;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View i;

        public ViewHolder(@NonNull View view) {
            super(view);
            this.i = view;
        }

        /* JADX WARN: Incorrect return type in method signature: <V:Landroid/view/View;>(I)TV; */
        public View findView(@IdRes int i) {
            return this.i.findViewById(i);
        }
    }

    public interface a {
    }

    public abstract V e(@NonNull ViewGroup viewGroup, int i);

    public void f(RecyclerView recyclerView) {
        recyclerView.setAdapter(this);
        m(recyclerView);
    }

    public abstract void g(V v, T t, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return i();
    }

    public int h(int i) {
        return i % this.i.size();
    }

    public final int i() {
        List<T> list = this.i;
        if (list == null || list.size() == 0) {
            return 0;
        }
        return this.i.size() == 1 ? 1 : Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull V v, int i) {
        if (this.i == null) {
            return;
        }
        int iH = h(i);
        g(v, this.i.get(iH), iH);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public V onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return (V) e(viewGroup, i);
    }

    public final void m(final RecyclerView recyclerView) {
        if (i() < 2) {
            return;
        }
        int size = this.i.size();
        final int size2 = LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
        if (LockFreeTaskQueueCore.MAX_CAPACITY_MASK % size > 0) {
            size2 = LockFreeTaskQueueCore.MAX_CAPACITY_MASK - (LockFreeTaskQueueCore.MAX_CAPACITY_MASK % this.i.size());
        }
        recyclerView.post(new Runnable() { // from class: com.oplus.aiunit.vision.a01
            @Override // java.lang.Runnable
            public final void run() {
                recyclerView.scrollToPosition(size2);
            }
        });
    }

    public void setData(List<T> list) {
        this.i = list;
        StringBuilder sb = new StringBuilder();
        sb.append("dataSize: ");
        sb.append(list.size());
    }

    public void setOnItemClickListener(a aVar) {
    }
}
