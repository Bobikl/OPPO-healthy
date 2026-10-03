package com.heytap.store.splash.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public class ParentNoScrollRecyclerView extends RecyclerView {
    private int mLastX;
    private int mLastY;

    public ParentNoScrollRecyclerView(Context context) {
        super(context, null);
    }

    private boolean dispatchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            if (Math.abs(y - this.mLastY) > Math.abs(x - this.mLastX)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (!canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        this.mLastX = x;
        this.mLastY = y;
        return super.dispatchTouchEvent(motionEvent);
    }

    public ParentNoScrollRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ParentNoScrollRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
