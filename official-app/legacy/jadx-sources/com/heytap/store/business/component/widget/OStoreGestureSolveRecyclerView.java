package com.heytap.store.business.component.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/heytap/store/business/component/widget/OStoreGestureSolveRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "disallowParentInterceptDownEvent", "", "getDisallowParentInterceptDownEvent", "()Z", "setDisallowParentInterceptDownEvent", "(Z)V", "isNeedParentIntercept", "mStartX", "", "mStartY", "mTouchSlop", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreGestureSolveRecyclerView extends RecyclerView {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private boolean disallowParentInterceptDownEvent;
    private boolean isNeedParentIntercept;
    private float mStartX;
    private float mStartY;
    private int mTouchSlop;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreGestureSolveRecyclerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final boolean getDisallowParentInterceptDownEvent() {
        return this.disallowParentInterceptDownEvent;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            boolean z = true;
            if (linearLayoutManager.getChildCount() != 1 && !(linearLayoutManager instanceof GridLayoutManager)) {
                int action = event.getAction();
                if (action == 0) {
                    this.mStartX = event.getX();
                    this.mStartY = event.getY();
                    getParent().requestDisallowInterceptTouchEvent(!this.disallowParentInterceptDownEvent);
                } else if (action == 1) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else if (action == 2) {
                    float x = event.getX();
                    float y = event.getY();
                    float fAbs = Math.abs(x - this.mStartX);
                    float fAbs2 = Math.abs(y - this.mStartY);
                    if (linearLayoutManager.getOrientation() != 0 ? fAbs2 <= this.mTouchSlop || fAbs2 <= fAbs : fAbs <= this.mTouchSlop || fAbs <= fAbs2) {
                        z = false;
                    }
                    this.isNeedParentIntercept = z;
                    getParent().requestDisallowInterceptTouchEvent(this.isNeedParentIntercept);
                } else if (action == 3) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                return super.onInterceptTouchEvent(event);
            }
        }
        return super.onInterceptTouchEvent(event);
    }

    public final void setDisallowParentInterceptDownEvent(boolean z) {
        this.disallowParentInterceptDownEvent = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreGestureSolveRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OStoreGestureSolveRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreGestureSolveRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        this._$_findViewCache = new LinkedHashMap();
    }
}
