package com.coui.appcompat.recyclerview;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public abstract class COUIBaseViewHolder<T> extends RecyclerView.ViewHolder {
    public COUIBaseViewHolder(@NonNull View view) {
        super(view);
    }

    public abstract void bind(T t, int i);
}
