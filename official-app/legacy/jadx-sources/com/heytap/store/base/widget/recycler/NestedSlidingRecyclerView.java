package com.heytap.store.base.widget.recycler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/heytap/store/base/widget/recycler/NestedSlidingRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDownX", "mDownY", "slideOrientation", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NestedSlidingRecyclerView extends RecyclerView {
    private int mDownX;
    private int mDownY;
    private int slideOrientation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedSlidingRecyclerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            this.mDownX = (int) ev.getX();
            this.mDownY = (int) ev.getY();
        } else if (action == 2) {
            if (getLayoutManager() instanceof LinearLayoutManager) {
                RecyclerView.LayoutManager layoutManager = getLayoutManager();
                if (layoutManager == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
                this.slideOrientation = ((LinearLayoutManager) layoutManager).getOrientation();
            }
            int x = (int) ev.getX();
            int y = (int) ev.getY();
            if (this.slideOrientation == 0) {
                if (Math.abs(x - this.mDownX) > Math.abs(y - this.mDownY)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (Math.abs(x - this.mDownX) < Math.abs(y - this.mDownY)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.mDownX = x;
            this.mDownY = y;
        }
        return super.dispatchTouchEvent(ev);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedSlidingRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedSlidingRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
