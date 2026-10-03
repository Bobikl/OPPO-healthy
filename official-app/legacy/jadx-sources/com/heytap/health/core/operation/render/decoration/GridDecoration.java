package com.heytap.health.core.operation.render.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ejg;

/* JADX INFO: loaded from: classes16.dex */
public class GridDecoration extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int iA = (childLayoutPosition == 0 || childLayoutPosition == 1) ? 0 : ejg.a(b78.a(), 16.0f);
        if (childLayoutPosition % 2 == 0) {
            rect.set(0, iA, ejg.a(b78.a(), 4.0f), 0);
        } else {
            rect.set(ejg.a(b78.a(), 4.0f), iA, 0, 0);
        }
    }
}
