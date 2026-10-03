package com.heytap.health.watchface.business.legacy.main.adapter;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    public final SparseArray<View> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f6934j;

    public BaseViewHolder(View view) {
        super(view);
        this.f6934j = view;
        this.i = new SparseArray<>();
    }

    public static BaseViewHolder a(View view) {
        return new BaseViewHolder(view);
    }
}
