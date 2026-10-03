package com.heytap.health.base.base;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes15.dex */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    public SparseArray<View> i;

    public BaseViewHolder(@NonNull View view) {
        super(view);
        this.i = new SparseArray<>();
    }

    public View a() {
        return this.itemView;
    }

    public BaseViewHolder b(@IdRes int i, @StringRes int i2) {
        ((TextView) getView(i)).setText(i2);
        return this;
    }

    public BaseViewHolder c(@IdRes int i, CharSequence charSequence) {
        ((TextView) getView(i)).setText(charSequence);
        return this;
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
