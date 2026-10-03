package com.heytap.health.watchface.business.legacy.main.callback;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.watchface.business.legacy.main.adapter.EditWatchFacesAdapter;
import com.oplus.aiunit.vision.ltl;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class SimpleItemTouchHelperCallBack extends ItemTouchHelper.Callback {
    public EditWatchFacesAdapter.EditViewHolder a;
    public final EditWatchFacesAdapter b;

    public SimpleItemTouchHelperCallBack(EditWatchFacesAdapter editWatchFacesAdapter) {
        this.b = editWatchFacesAdapter;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public RecyclerView.ViewHolder chooseDropTarget(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i, int i2) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int width = viewHolder.itemView.getWidth() + i;
        int height = viewHolder.itemView.getHeight() + i2;
        int left2 = i - viewHolder.itemView.getLeft();
        int top2 = i2 - viewHolder.itemView.getTop();
        int size = list.size();
        RecyclerView.ViewHolder viewHolder2 = null;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.ViewHolder viewHolder3 = list.get(i4);
            if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (iAbs4 = Math.abs(right)) > i3) {
                viewHolder2 = viewHolder3;
                i3 = iAbs4;
            }
            if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i3) {
                viewHolder2 = viewHolder3;
                i3 = iAbs3;
            }
            if (top2 < 0 && (top = (viewHolder3.itemView.getTop() + (viewHolder3.itemView.getHeight() / 2)) - i2) > 0 && viewHolder3.itemView.getTop() + (viewHolder3.itemView.getHeight() / 2) < viewHolder.itemView.getTop() && (iAbs2 = Math.abs(top)) > i3) {
                viewHolder2 = viewHolder3;
                i3 = iAbs2;
            }
            if (top2 > 0 && (bottom = (viewHolder3.itemView.getBottom() - (viewHolder3.itemView.getHeight() / 2)) - height) < 0 && viewHolder3.itemView.getBottom() - (viewHolder3.itemView.getHeight() / 2) > viewHolder.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i3) {
                viewHolder2 = viewHolder3;
                i3 = iAbs;
            }
        }
        return viewHolder2;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
        if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
            return false;
        }
        try {
            this.b.l(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            return true;
        } catch (Exception e2) {
            ltl.i("SimpleItemTouchHelperCallBack", "[onMove] move exception = " + e2.getMessage());
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        EditWatchFacesAdapter.EditViewHolder editViewHolder;
        if (i != 0 && (viewHolder instanceof EditWatchFacesAdapter.EditViewHolder)) {
            EditWatchFacesAdapter.EditViewHolder editViewHolder2 = (EditWatchFacesAdapter.EditViewHolder) viewHolder;
            this.a = editViewHolder2;
            editViewHolder2.e();
        }
        if (i != 0 || (editViewHolder = this.a) == null) {
            return;
        }
        editViewHolder.d();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
    }
}
