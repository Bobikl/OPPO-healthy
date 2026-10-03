package com.heytap.health.watch.records.view;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    public final SparseArray<View> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f6634j;

    public BaseViewHolder(View view) {
        super(view);
        this.f6634j = view;
        this.i = new SparseArray<>();
    }

    public static BaseViewHolder a(View view) {
        return new BaseViewHolder(view);
    }
}
