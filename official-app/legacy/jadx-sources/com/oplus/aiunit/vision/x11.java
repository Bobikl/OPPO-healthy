package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.R$id;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.dragswipe.DragAndSwipeCallback;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.Collections;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0016\u0018\u0000 h2\u00020\u0001:\u0001\u000eB\u0017\u0012\u000e\u0010*\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030(¢\u0006\u0004\bf\u0010gJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0004J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J4\u0010!\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0006H\u0016J\u0012\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%H\u0016R\u001c\u0010*\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\"\u00101\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\"\u0010;\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010A\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010=\u001a\u0004\b+\u0010>\"\u0004\b?\u0010@R\"\u0010G\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010C\u001a\u0004\b2\u0010D\"\u0004\bE\u0010FR$\u0010N\u001a\u0004\u0018\u00010H8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010U\u001a\u0004\u0018\u00010O8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR*\u0010Y\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00068\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010,\u001a\u0004\bW\u0010.\"\u0004\bX\u00100R$\u0010Z\u001a\u0004\u0018\u00010\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010`\u001a\u0004\u0018\u00010%8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e¨\u0006i"}, d2 = {"Lcom/oplus/aiunit/vision/x11;", "Lcom/oplus/aiunit/vision/m46;", "", b2n.f, "", "position", "", "f", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, b2n.g, "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "a", MapSchema.FIELD_NAME_ENTRY, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "d", "n", "source", "target", LogFieldKey.MESSAGE_KEY, LogFieldKey.LEVEL_KEY, LogFieldKey.PROCESS_NAME_KEY, "o", "q", "Landroid/graphics/Canvas;", "canvas", "", "dX", "dY", "isCurrentlyActive", "r", "Lcom/oplus/aiunit/vision/rhd;", "onItemDragListener", "setOnItemDragListener", "Lcom/oplus/aiunit/vision/thd;", "onItemSwipeListener", "setOnItemSwipeListener", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "b", "Z", "i", "()Z", "setDragEnabled", "(Z)V", "isDragEnabled", "c", MapSchema.FIELD_NAME_KEY, "setSwipeEnabled", "isSwipeEnabled", "I", "getToggleViewId", "()I", "setToggleViewId", "(I)V", "toggleViewId", "Landroidx/recyclerview/widget/ItemTouchHelper;", "Landroidx/recyclerview/widget/ItemTouchHelper;", "()Landroidx/recyclerview/widget/ItemTouchHelper;", "s", "(Landroidx/recyclerview/widget/ItemTouchHelper;)V", "itemTouchHelper", "Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;", "Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;", "()Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;", "t", "(Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;)V", "itemTouchHelperCallback", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnTouchListener;", "getMOnToggleViewTouchListener", "()Landroid/view/View$OnTouchListener;", "setMOnToggleViewTouchListener", "(Landroid/view/View$OnTouchListener;)V", "mOnToggleViewTouchListener", "Landroid/view/View$OnLongClickListener;", "Landroid/view/View$OnLongClickListener;", "getMOnToggleViewLongClickListener", "()Landroid/view/View$OnLongClickListener;", "setMOnToggleViewLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "mOnToggleViewLongClickListener", "value", "j", "setDragOnLongPressEnabled", "isDragOnLongPressEnabled", "mOnItemDragListener", "Lcom/oplus/aiunit/vision/rhd;", "getMOnItemDragListener", "()Lcom/oplus/aiunit/vision/rhd;", "setMOnItemDragListener", "(Lcom/oplus/aiunit/vision/rhd;)V", "mOnItemSwipeListener", "Lcom/oplus/aiunit/vision/thd;", "getMOnItemSwipeListener", "()Lcom/oplus/aiunit/vision/thd;", "setMOnItemSwipeListener", "(Lcom/oplus/aiunit/vision/thd;)V", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0})
public class x11 implements m46 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BaseQuickAdapter<?, ?> baseQuickAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isDragEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isSwipeEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int toggleViewId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ItemTouchHelper itemTouchHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public DragAndSwipeCallback itemTouchHelperCallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public View.OnTouchListener mOnToggleViewTouchListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public View.OnLongClickListener mOnToggleViewLongClickListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isDragOnLongPressEnabled;

    public x11(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "baseQuickAdapter");
        this.baseQuickAdapter = baseQuickAdapter;
        g();
        this.isDragOnLongPressEnabled = true;
    }

    public final void a(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        b().attachToRecyclerView(recyclerView);
    }

    @NotNull
    public final ItemTouchHelper b() {
        ItemTouchHelper itemTouchHelper = this.itemTouchHelper;
        if (itemTouchHelper != null) {
            return itemTouchHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemTouchHelper");
        return null;
    }

    @NotNull
    public final DragAndSwipeCallback c() {
        DragAndSwipeCallback dragAndSwipeCallback = this.itemTouchHelperCallback;
        if (dragAndSwipeCallback != null) {
            return dragAndSwipeCallback;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemTouchHelperCallback");
        return null;
    }

    public final int d(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        return viewHolder.getAdapterPosition() - this.baseQuickAdapter.getHeaderLayoutCount();
    }

    public boolean e() {
        return this.toggleViewId != 0;
    }

    public final boolean f(int position) {
        return position >= 0 && position < this.baseQuickAdapter.getData().size();
    }

    public final void g() {
        t(new DragAndSwipeCallback(this));
        s(new ItemTouchHelper(c()));
    }

    public final void h(@NotNull BaseViewHolder holder) {
        View viewFindViewById;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.isDragEnabled && e() && (viewFindViewById = holder.itemView.findViewById(this.toggleViewId)) != null) {
            viewFindViewById.setTag(R$id.BaseQuickAdapter_viewholder_support, holder);
            if (getIsDragOnLongPressEnabled()) {
                viewFindViewById.setOnLongClickListener(this.mOnToggleViewLongClickListener);
            } else {
                viewFindViewById.setOnTouchListener(this.mOnToggleViewTouchListener);
            }
        }
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsDragEnabled() {
        return this.isDragEnabled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public boolean getIsDragOnLongPressEnabled() {
        return this.isDragOnLongPressEnabled;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsSwipeEnabled() {
        return this.isSwipeEnabled;
    }

    public void l(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    public void m(@NotNull RecyclerView.ViewHolder source, @NotNull RecyclerView.ViewHolder target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        int iD = d(source);
        int iD2 = d(target);
        if (f(iD) && f(iD2)) {
            if (iD >= iD2) {
                int i = iD2 + 1;
                if (i <= iD) {
                    while (true) {
                        Collections.swap(this.baseQuickAdapter.getData(), iD, iD - 1);
                        if (iD == i) {
                            break;
                        } else {
                            iD--;
                        }
                    }
                }
            } else {
                while (iD < iD2) {
                    int i2 = iD + 1;
                    Collections.swap(this.baseQuickAdapter.getData(), iD, i2);
                    iD = i2;
                }
            }
            this.baseQuickAdapter.notifyItemMoved(source.getAdapterPosition(), target.getAdapterPosition());
        }
    }

    public void n(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    public void o(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    public void p(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    public void q(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int iD = d(viewHolder);
        if (f(iD)) {
            this.baseQuickAdapter.getData().remove(iD);
            this.baseQuickAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
        }
    }

    public void r(@Nullable Canvas canvas, @Nullable RecyclerView.ViewHolder viewHolder, float dX, float dY, boolean isCurrentlyActive) {
    }

    public final void s(@NotNull ItemTouchHelper itemTouchHelper) {
        Intrinsics.checkNotNullParameter(itemTouchHelper, "<set-?>");
        this.itemTouchHelper = itemTouchHelper;
    }

    public final void setMOnItemDragListener(@Nullable rhd rhdVar) {
    }

    public final void setMOnItemSwipeListener(@Nullable thd thdVar) {
    }

    public final void setMOnToggleViewLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.mOnToggleViewLongClickListener = onLongClickListener;
    }

    public final void setMOnToggleViewTouchListener(@Nullable View.OnTouchListener onTouchListener) {
        this.mOnToggleViewTouchListener = onTouchListener;
    }

    @Override // com.oplus.aiunit.vision.m46
    public void setOnItemDragListener(@Nullable rhd onItemDragListener) {
    }

    @Override // com.oplus.aiunit.vision.m46
    public void setOnItemSwipeListener(@Nullable thd onItemSwipeListener) {
    }

    public final void t(@NotNull DragAndSwipeCallback dragAndSwipeCallback) {
        Intrinsics.checkNotNullParameter(dragAndSwipeCallback, "<set-?>");
        this.itemTouchHelperCallback = dragAndSwipeCallback;
    }
}
