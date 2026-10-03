package com.heytap.health.watchface.business.store.base;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public class BaseRatioViewHolder extends RecyclerView.ViewHolder {
    public static float DEFAULT_RATIO = 0.85555553f;

    public BaseRatioViewHolder(@NonNull View view, int i, int i2, float f) {
        super(view);
        int i3 = i2 * 2;
        int i4 = (int) ((i - i3) / (f <= 0.0f ? DEFAULT_RATIO : f));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i4 + i3;
        }
    }
}
