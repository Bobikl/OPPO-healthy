package com.heytap.health.wallet.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes18.dex */
public class RecyclerViewSpacesItemDecoration extends RecyclerView.ItemDecoration {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6422c;
    public int d;

    public RecyclerViewSpacesItemDecoration() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        rect.left = this.a;
        rect.top = this.b;
        rect.right = this.f6422c;
        if (recyclerView.getChildAdapterPosition(view) == recyclerView.getAdapter().getItemCount() - 1 || view.getVisibility() == 8) {
            rect.bottom = 0;
        } else {
            rect.bottom = this.d;
        }
    }

    public RecyclerViewSpacesItemDecoration(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.f6422c = i3;
        this.d = i4;
    }
}
