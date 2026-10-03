package com.heytap.health.watch.contactsync.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.ejg;

/* JADX INFO: loaded from: classes19.dex */
public class ContactItemDecoration extends RecyclerView.ItemDecoration {
    public final int a;

    public ContactItemDecoration(Context context) {
        this.a = ejg.a(context, 90.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            if (recyclerView.getChildLayoutPosition(view) == adapter.getItemCount() - 1) {
                rect.bottom = this.a;
            } else {
                rect.bottom = 0;
            }
        }
    }
}
