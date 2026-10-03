package com.heytap.sports.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.COUIRecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class SportsHorizonRecyclerView extends COUIRecyclerView {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7884j;

    public SportsHorizonRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00a7  */
    @Override // androidx.recyclerview.widget.COUIRecyclerView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("onInterceptTouchEvent  action = ");
        sb.append(motionEvent.getAction());
        sb.append("; actionMasked = ");
        sb.append(motionEvent.getActionMasked());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.i = (int) (motionEvent.getX() + 0.5f);
            this.f7884j = (int) (motionEvent.getY() + 0.5f);
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (actionMasked == 2) {
            int x = (int) (motionEvent.getX() + 0.5f);
            int y = (int) (motionEvent.getY() + 0.5f);
            int iAbs = Math.abs(x - this.i);
            int iAbs2 = Math.abs(y - this.f7884j);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ACTION_MOVE  startX = ");
            sb2.append(this.i);
            sb2.append("; endX = ");
            sb2.append(x);
            sb2.append("; disX = ");
            sb2.append(iAbs);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ACTION_MOVE  startY = ");
            sb3.append(this.f7884j);
            sb3.append("; endY = ");
            sb3.append(y);
            sb3.append("; disY = ");
            sb3.append(iAbs2);
            if (iAbs > 0 && iAbs > iAbs2) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (iAbs2 > 0) {
                getParent().requestDisallowInterceptTouchEvent(canScrollVertically(this.f7884j - y));
            }
        } else if (actionMasked == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public SportsHorizonRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SportsHorizonRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
