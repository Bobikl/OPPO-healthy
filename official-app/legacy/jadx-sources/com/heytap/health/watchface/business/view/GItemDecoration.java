package com.heytap.health.watchface.business.view;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public class GItemDecoration extends RecyclerView.ItemDecoration {
    public int a = a(8.0f);
    public int b = a(14.0f);

    public static int a(float f) {
        return (int) TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int i = this.a;
        rect.left = i / 2;
        rect.right = i / 2;
        rect.bottom = this.b;
    }
}
