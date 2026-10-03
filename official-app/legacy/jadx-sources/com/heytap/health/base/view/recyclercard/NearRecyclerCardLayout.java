package com.heytap.health.base.view.recyclercard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.COUIRecyclerView;

/* JADX INFO: loaded from: classes15.dex */
public class NearRecyclerCardLayout extends COUIRecyclerView {
    public MotionEvent i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f3331j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3332l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3333n;

    public NearRecyclerCardLayout(@NonNull Context context) {
        super(context);
        this.k = false;
        this.f3332l = 0;
        this.m = 0;
        this.f3333n = 0;
        this.f3333n = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f3332l = (int) motionEvent.getX();
            this.m = (int) motionEvent.getY();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (action != 1) {
            if (action == 2) {
                if (motionEvent.getPointerCount() > 1) {
                    return false;
                }
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int iAbs = Math.abs(x - this.f3332l);
                int iAbs2 = Math.abs(y - this.m);
                if (iAbs2 > this.f3333n && iAbs2 > iAbs && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            if (action != 3) {
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    @Override // androidx.recyclerview.widget.COUIRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f3331j = System.currentTimeMillis();
            this.i = MotionEvent.obtain(motionEvent);
            this.f3332l = (int) motionEvent.getX();
            this.m = (int) motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 1) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (this.k) {
                if (System.currentTimeMillis() - this.f3331j < ((long) ViewConfiguration.getLongPressTimeout()) && Math.max((int) Math.abs(motionEvent.getRawX() - this.i.getRawX()), (int) Math.abs(motionEvent.getRawY() - this.i.getRawY())) <= ViewConfiguration.getTouchSlop()) {
                    performLongClick();
                }
            }
        } else if (action == 2) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int iAbs = Math.abs(x - this.f3332l);
            int iAbs2 = Math.abs(y - this.m);
            int i = this.f3333n;
            if ((iAbs > i || iAbs2 > i) && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 3) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (this.k) {
                if (System.currentTimeMillis() - this.f3331j < ((long) ViewConfiguration.getLongPressTimeout()) && Math.max((int) Math.abs(motionEvent.getRawX() - this.i.getRawX()), (int) Math.abs(motionEvent.getRawY() - this.i.getRawY())) <= ViewConfiguration.getTouchSlop()) {
                    performLongClick();
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.k = onLongClickListener != null;
    }

    public NearRecyclerCardLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = false;
        this.f3332l = 0;
        this.m = 0;
        this.f3333n = 0;
        this.f3333n = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public NearRecyclerCardLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = false;
        this.f3332l = 0;
        this.m = 0;
        this.f3333n = 0;
        this.f3333n = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
