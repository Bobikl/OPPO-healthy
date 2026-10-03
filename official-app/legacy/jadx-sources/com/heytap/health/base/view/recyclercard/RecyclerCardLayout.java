package com.heytap.health.base.view.recyclercard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes15.dex */
public class RecyclerCardLayout extends RecyclerView {
    public MotionEvent i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f3336j;
    public boolean k;

    public RecyclerCardLayout(@NonNull Context context) {
        super(context);
        this.k = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.k) {
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (action == 2 && motionEvent.getPointerCount() > 1) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.k) {
                if (System.currentTimeMillis() - this.f3336j >= ((long) ViewConfiguration.getLongPressTimeout()) && Math.max((int) Math.abs(motionEvent.getRawX() - this.i.getRawX()), (int) Math.abs(motionEvent.getRawY() - this.i.getRawY())) <= ViewConfiguration.getTouchSlop()) {
                    performLongClick();
                }
            }
        } else {
            this.f3336j = System.currentTimeMillis();
            this.i = MotionEvent.obtain(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.k = onLongClickListener != null;
    }

    public RecyclerCardLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = false;
    }

    public RecyclerCardLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = false;
    }
}
