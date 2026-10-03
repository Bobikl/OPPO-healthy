package com.heytap.health.core.operation.render.recyclerview;

import android.util.SparseArray;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes16.dex */
public class SpaceViewHolder extends RecyclerView.ViewHolder {
    public SparseArray<View> i;

    public SpaceViewHolder(@NonNull View view) {
        super(view);
        this.i = new SparseArray<>();
    }

    public <T extends View> T getView(@IdRes int i) {
        T t = (T) this.i.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.i.put(i, t2);
        return t2;
    }
}
