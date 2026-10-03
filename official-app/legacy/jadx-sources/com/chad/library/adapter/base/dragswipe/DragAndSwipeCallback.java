package com.chad.library.adapter.base.dragswipe;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.R$id;
import com.oplus.aiunit.vision.x11;

/* JADX INFO: loaded from: classes13.dex */
public class DragAndSwipeCallback extends ItemTouchHelper.Callback {
    public x11 a;
    public float b = 0.1f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1504c = 0.7f;
    public int d = 15;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1505e = 32;

    public DragAndSwipeCallback(x11 x11Var) {
        this.a = x11Var;
    }

    public final boolean a(@NonNull RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 268435729 || itemViewType == 268436002 || itemViewType == 268436275 || itemViewType == 268436821;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        if (a(viewHolder)) {
            return;
        }
        View view = viewHolder.itemView;
        int i = R$id.BaseQuickAdapter_dragging_support;
        if (view.getTag(i) != null && ((Boolean) viewHolder.itemView.getTag(i)).booleanValue()) {
            x11 x11Var = this.a;
            if (x11Var != null) {
                x11Var.l(viewHolder);
            }
            viewHolder.itemView.setTag(i, Boolean.FALSE);
        }
        View view2 = viewHolder.itemView;
        int i2 = R$id.BaseQuickAdapter_swiping_support;
        if (view2.getTag(i2) == null || !((Boolean) viewHolder.itemView.getTag(i2)).booleanValue()) {
            return;
        }
        x11 x11Var2 = this.a;
        if (x11Var2 != null) {
            x11Var2.o(viewHolder);
        }
        viewHolder.itemView.setTag(i2, Boolean.FALSE);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getMoveThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        return a(viewHolder) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(this.d, this.f1505e);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getSwipeThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
        return this.f1504c;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        x11 x11Var = this.a;
        if (x11Var != null) {
            return x11Var.getIsSwipeEnabled();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        x11 x11Var = this.a;
        return (x11Var == null || !x11Var.getIsDragEnabled() || this.a.e()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        super.onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, z);
        if (i != 1 || a(viewHolder)) {
            return;
        }
        View view = viewHolder.itemView;
        canvas.save();
        if (f > 0.0f) {
            canvas.clipRect(view.getLeft(), view.getTop(), view.getLeft() + f, view.getBottom());
            canvas.translate(view.getLeft(), view.getTop());
        } else {
            canvas.clipRect(view.getRight() + f, view.getTop(), view.getRight(), view.getBottom());
            canvas.translate(view.getRight() + f, view.getTop());
        }
        x11 x11Var = this.a;
        if (x11Var != null) {
            x11Var.r(canvas, viewHolder, f, f2, z);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
        return viewHolder.getItemViewType() == viewHolder2.getItemViewType();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onMoved(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, int i, @NonNull RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        super.onMoved(recyclerView, viewHolder, i, viewHolder2, i2, i3, i4);
        x11 x11Var = this.a;
        if (x11Var != null) {
            x11Var.m(viewHolder, viewHolder2);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        if (i == 2 && !a(viewHolder)) {
            x11 x11Var = this.a;
            if (x11Var != null) {
                x11Var.n(viewHolder);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_dragging_support, Boolean.TRUE);
        } else if (i == 1 && !a(viewHolder)) {
            x11 x11Var2 = this.a;
            if (x11Var2 != null) {
                x11Var2.p(viewHolder);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_swiping_support, Boolean.TRUE);
        }
        super.onSelectedChanged(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        x11 x11Var;
        if (a(viewHolder) || (x11Var = this.a) == null) {
            return;
        }
        x11Var.q(viewHolder);
    }
}
