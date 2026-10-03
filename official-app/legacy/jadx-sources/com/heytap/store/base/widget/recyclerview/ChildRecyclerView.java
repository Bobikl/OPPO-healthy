package com.heytap.store.base.widget.recyclerview;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010#\u001a\u00020\u001cH\u0002J\u0006\u0010$\u001a\u00020\fJ\b\u0010%\u001a\u00020\u001cH\u0014J\b\u0010&\u001a\u00020\u001cH\u0014J\u0006\u0010'\u001a\u00020\u001cR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/heytap/store/base/widget/recyclerview/ChildRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "flingHelper", "Lcom/heytap/store/base/widget/util/FlingHelper;", "isStartFling", "", "parentRecyclerView", "Lcom/heytap/store/base/widget/recyclerview/ParentRecyclerView;", "getParentRecyclerView", "()Lcom/heytap/store/base/widget/recyclerview/ParentRecyclerView;", "setParentRecyclerView", "(Lcom/heytap/store/base/widget/recyclerview/ParentRecyclerView;)V", "saveState", "Landroid/os/Parcelable;", "getSaveState", "()Landroid/os/Parcelable;", "setSaveState", "(Landroid/os/Parcelable;)V", "totalDy", "velocityY", "dispatchParentFling", "", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "findParentRecyclerView", "fling", "velocityX", "initScrollListener", "isScrollTop", "onAttachedToWindow", "onDetachedFromWindow", "restoreSaveState", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class ChildRecyclerView extends RecyclerView {

    @NotNull
    private final com.heytap.store.base.widget.util.FlingHelper flingHelper;
    private boolean isStartFling;

    @Nullable
    private ParentRecyclerView parentRecyclerView;

    @Nullable
    private Parcelable saveState;
    private int totalDy;
    private int velocityY;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChildRecyclerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchParentFling() {
        int i;
        ParentRecyclerView parentRecyclerViewFindParentRecyclerView = findParentRecyclerView();
        this.parentRecyclerView = parentRecyclerViewFindParentRecyclerView;
        if (parentRecyclerViewFindParentRecyclerView == null || !isScrollTop() || (i = this.velocityY) == 0) {
            return;
        }
        double splineFlingDistance = this.flingHelper.getSplineFlingDistance(i);
        if (splineFlingDistance > Math.abs(this.totalDy)) {
            parentRecyclerViewFindParentRecyclerView.fling(0, -this.flingHelper.getVelocityByDistance(splineFlingDistance + ((double) this.totalDy)));
        }
        this.totalDy = 0;
        this.velocityY = 0;
    }

    private final ParentRecyclerView findParentRecyclerView() {
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof ParentRecyclerView)) {
            parent = parent.getParent();
        }
        if (parent instanceof ParentRecyclerView) {
            return (ParentRecyclerView) parent;
        }
        return null;
    }

    private final void initScrollListener() {
        addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.heytap.store.base.widget.recyclerview.ChildRecyclerView.initScrollListener.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    ChildRecyclerView.this.dispatchParentFling();
                }
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                if (ChildRecyclerView.this.isStartFling) {
                    ChildRecyclerView.this.totalDy = 0;
                    ChildRecyclerView.this.isStartFling = false;
                }
                ChildRecyclerView.this.totalDy += dy;
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        if (ev != null && ev.getAction() == 0) {
            this.velocityY = 0;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int velocityX, int velocityY) {
        if (!isAttachedToWindow()) {
            return false;
        }
        boolean zFling = super.fling(velocityX, velocityY);
        if (!zFling || velocityY >= 0) {
            this.velocityY = 0;
        } else {
            this.isStartFling = true;
            this.velocityY = velocityY;
        }
        return zFling;
    }

    @Nullable
    public final ParentRecyclerView getParentRecyclerView() {
        return this.parentRecyclerView;
    }

    @Nullable
    public final Parcelable getSaveState() {
        return this.saveState;
    }

    public final boolean isScrollTop() {
        return !canScrollVertically(-1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        RecyclerView.LayoutManager layoutManager;
        super.onAttachedToWindow();
        if (this.saveState == null || !(getLayoutManager() instanceof StaggeredGridLayoutManager) || (layoutManager = getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(getSaveState());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (getLayoutManager() instanceof StaggeredGridLayoutManager) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            this.saveState = layoutManager == null ? null : layoutManager.onSaveInstanceState();
        }
        super.onDetachedFromWindow();
    }

    public final void restoreSaveState() {
        RecyclerView.LayoutManager layoutManager;
        if (this.saveState == null || !(getLayoutManager() instanceof StaggeredGridLayoutManager) || (layoutManager = getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(getSaveState());
    }

    public final void setParentRecyclerView(@Nullable ParentRecyclerView parentRecyclerView) {
        this.parentRecyclerView = parentRecyclerView;
    }

    public final void setSaveState(@Nullable Parcelable parcelable) {
        this.saveState = parcelable;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChildRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ChildRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChildRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.flingHelper = new com.heytap.store.base.widget.util.FlingHelper(context);
        setOverScrollMode(2);
        initScrollListener();
    }
}
