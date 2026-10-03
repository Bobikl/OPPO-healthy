package com.heytap.store.base.widget.recyclerview;

import android.content.Context;
import android.view.View;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

/* JADX INFO: loaded from: classes3.dex */
public class BaseRViewHolder<K> extends BaseViewHolder {
    protected Context context;
    protected K data;

    public BaseRViewHolder(View view) {
        super(view);
        this.context = view.getContext();
    }

    public void bindData(K k) {
        this.data = k;
    }

    public K getData() {
        return this.data;
    }

    public void onViewRecycled() {
    }
}
