package com.heytap.sporthealth.blib.weiget;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.ifk;

/* JADX INFO: loaded from: classes2.dex */
public class HealthGridItemDecoration extends RecyclerView.ItemDecoration {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7746c;

    public HealthGridItemDecoration(Context context, int i, int i2, int i3) {
        this.a = ifk.d(context, i);
        this.b = ifk.d(context, i2);
        this.f7746c = ifk.d(context, i3);
    }

    public final boolean a(RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        recyclerView.getLayoutManager();
        return i == i3 - 1 && i > 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        if (gridLayoutManager != null) {
            boolean zA = a(recyclerView, recyclerView.getChildAdapterPosition(view), gridLayoutManager.getSpanCount(), recyclerView.getAdapter().getItemCount(), ((GridLayoutManager.LayoutParams) view.getLayoutParams()).getSpanSize());
            int i = this.a;
            rect.left = i;
            rect.right = i;
            rect.bottom = this.b;
            if (zA) {
                rect.bottom = this.f7746c;
            }
        }
    }
}
