package com.heytap.health.operation.medal.runninghall;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.sporthealth.blib.weiget.jlayout.MultiStateLayout;

/* JADX INFO: loaded from: classes17.dex */
public class Middle10ItemDecoration extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) != recyclerView.getAdapter().getItemCount() - 1) {
            rect.right = MultiStateLayout.g(10.0f);
        }
    }
}
