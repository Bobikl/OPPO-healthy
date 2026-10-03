package com.heytap.health.settings.watch.sporthealthsettings.activity.customize;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.settings.watch.sporthealthsettings.activity.customize.CustomizeDataItemTouchHelperCallBack;
import com.heytap.health.settings.watch.sporthealthsettings.activity.customize.adapter.CustomizeDataAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class CustomizeDataItemTouchHelperCallBack extends ItemTouchHelper.Callback {
    public CustomizeDataAdapter.CommonHolder a;
    public CustomizeDataAdapter b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnTouchListener f5486c;

    public CustomizeDataItemTouchHelperCallBack(CustomizeDataAdapter customizeDataAdapter) {
        this.b = customizeDataAdapter;
    }

    public static /* synthetic */ boolean b(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            view.setOnTouchListener(null);
        }
        return true;
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
        boolean zF = this.b.f(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition(), viewHolder);
        if (!zF) {
            recyclerView.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, 0.0f, 0.0f, 0));
            recyclerView.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            if (this.f5486c == null) {
                this.f5486c = new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.kh4
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return CustomizeDataItemTouchHelperCallBack.b(view, motionEvent);
                    }
                };
            }
            recyclerView.setOnTouchListener(this.f5486c);
        }
        return zF;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        CustomizeDataAdapter.CommonHolder commonHolder;
        if (i != 0 && (viewHolder instanceof CustomizeDataAdapter.CommonHolder)) {
            CustomizeDataAdapter.CommonHolder commonHolder2 = (CustomizeDataAdapter.CommonHolder) viewHolder;
            this.a = commonHolder2;
            commonHolder2.k();
        }
        if (i != 0 || (commonHolder = this.a) == null) {
            return;
        }
        commonHolder.j();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
    }
}
