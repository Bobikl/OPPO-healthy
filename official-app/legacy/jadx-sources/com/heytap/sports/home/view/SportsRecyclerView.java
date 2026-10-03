package com.heytap.sports.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.COUIRecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class SportsRecyclerView extends COUIRecyclerView {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7885j;
    public int k;

    public SportsRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // androidx.recyclerview.widget.COUIRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7885j = (int) (motionEvent.getY() + 0.5f);
            this.k = motionEvent.getPointerId(0);
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (actionMasked == 2) {
            try {
                if (Math.abs(((int) (motionEvent.getY(motionEvent.findPointerIndex(this.k)) + 0.5f)) - this.f7885j) > this.i) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } catch (Exception unused) {
            }
        } else if (actionMasked == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    public SportsRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SportsRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
