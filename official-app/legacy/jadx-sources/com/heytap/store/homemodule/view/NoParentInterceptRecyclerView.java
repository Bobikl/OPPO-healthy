package com.heytap.store.homemodule.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class NoParentInterceptRecyclerView extends RecyclerView {
    private int mLastX;
    private int mLastY;

    public NoParentInterceptRecyclerView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            int i = x - this.mLastX;
            int i2 = y - this.mLastY;
            if (Math.abs(i) < Math.abs(i2) || Math.abs(i2) >= 10) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        this.mLastX = x;
        this.mLastY = y;
        return super.dispatchTouchEvent(motionEvent);
    }

    public NoParentInterceptRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoParentInterceptRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
