package com.heytap.nearx.uikit.widget.floatingbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/heytap/nearx/uikit/widget/floatingbutton/NearFeedbackFloatingButton;", "Lcom/heytap/nearx/uikit/widget/floatingbutton/NearFloatingButton;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mOnInterceptTouchEventListener", "Lcom/heytap/nearx/uikit/widget/floatingbutton/NearFeedbackFloatingButton$OnInterceptTouchEventListener;", "getMOnInterceptTouchEventListener", "()Lcom/heytap/nearx/uikit/widget/floatingbutton/NearFeedbackFloatingButton$OnInterceptTouchEventListener;", "setMOnInterceptTouchEventListener", "(Lcom/heytap/nearx/uikit/widget/floatingbutton/NearFeedbackFloatingButton$OnInterceptTouchEventListener;)V", "isPointInMainButtonBounds", "", "x", "y", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "OnInterceptTouchEventListener", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NearFeedbackFloatingButton extends NearFloatingButton {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private OnInterceptTouchEventListener mOnInterceptTouchEventListener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/nearx/uikit/widget/floatingbutton/NearFeedbackFloatingButton$OnInterceptTouchEventListener;", "", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnInterceptTouchEventListener {
        boolean onInterceptTouchEvent(@NotNull MotionEvent ev);
    }

    public NearFeedbackFloatingButton(@Nullable Context context) {
        super(context);
        this._$_findViewCache = new LinkedHashMap();
    }

    private final boolean isPointInMainButtonBounds(int x, int y) {
        ShapeableImageView mainFloatingButton = getMainFloatingButton();
        return mainFloatingButton != null && mainFloatingButton.getLeft() < mainFloatingButton.getRight() && mainFloatingButton.getTop() < mainFloatingButton.getBottom() && x >= mainFloatingButton.getLeft() && x < mainFloatingButton.getRight() && y >= mainFloatingButton.getTop() && y < mainFloatingButton.getBottom();
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

    @Nullable
    public final OnInterceptTouchEventListener getMOnInterceptTouchEventListener() {
        return this.mOnInterceptTouchEventListener;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (isPointInMainButtonBounds((int) ev.getX(), (int) ev.getY())) {
            OnInterceptTouchEventListener onInterceptTouchEventListener = this.mOnInterceptTouchEventListener;
            boolean z = false;
            if (onInterceptTouchEventListener != null && onInterceptTouchEventListener.onInterceptTouchEvent(ev)) {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void setMOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.mOnInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public NearFeedbackFloatingButton(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this._$_findViewCache = new LinkedHashMap();
    }

    public NearFeedbackFloatingButton(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = new LinkedHashMap();
    }
}
