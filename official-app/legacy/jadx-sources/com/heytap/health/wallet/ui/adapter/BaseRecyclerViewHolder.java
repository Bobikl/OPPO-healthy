package com.heytap.health.wallet.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.qz0;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseRecyclerViewHolder<M> extends RecyclerView.ViewHolder {
    public static final String HOLDER_TAG_HEADER = "holder";

    public BaseRecyclerViewHolder(ViewGroup viewGroup, @LayoutRes int i) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        d();
    }

    public <T extends View> T a(@IdRes int i) {
        return (T) this.itemView.findViewById(i);
    }

    public String b(int i) {
        return qz0.mContext.getResources().getString(i);
    }

    public String c(int i, Object... objArr) {
        return qz0.mContext.getResources().getString(i, objArr);
    }

    public abstract void d();

    public abstract void setData(M m);
}
