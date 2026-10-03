package com.heytap.store.homemodule.adapter.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.store.home.R;

/* JADX INFO: loaded from: classes5.dex */
public class HomeFragmentDecoration extends RecyclerView.ItemDecoration {
    private final int firstItemOffset;
    private boolean isBlackCardArea;

    public HomeFragmentDecoration(int i, boolean z) {
        this.firstItemOffset = i;
        this.isBlackCardArea = z;
    }

    private void checkCubeView(Rect rect, View view, RecyclerView recyclerView) {
        int childAdapterPosition;
        if (recyclerView == null || recyclerView.getAdapter() == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(view) + 1) >= recyclerView.getAdapter().getItemCount() || recyclerView.getAdapter().getItemViewType(childAdapterPosition) != 824) {
            return;
        }
        rect.bottom = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.top = -this.firstItemOffset;
        }
        if (childAdapterPosition == recyclerView.getAdapter().getItemCount() - 2) {
            int itemViewType = recyclerView.getAdapter().getItemViewType(childAdapterPosition + 1);
            if (itemViewType == 817 || itemViewType == 816 || !this.isBlackCardArea) {
                rect.bottom = view.getResources().getDimensionPixelOffset(R.dimen.pf_home_card_spacing);
            }
        } else if (childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1) {
            int itemViewType2 = recyclerView.getAdapter().getItemViewType(childAdapterPosition);
            if (itemViewType2 == 268436275) {
                rect.bottom = 0;
            } else if (itemViewType2 != 817 && itemViewType2 != 816 && !this.isBlackCardArea) {
                rect.bottom = view.getResources().getDimensionPixelOffset(R.dimen.pf_home_card_spacing);
            }
        }
        checkCubeView(rect, view, recyclerView);
    }
}
