package com.heytap.health.operations.share;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.heytap.health.base.view.ShadowLayout;

/* JADX INFO: loaded from: classes17.dex */
public class InterceptShadowLayout extends ShadowLayout {
    public long i;

    public InterceptShadowLayout(Context context) {
        super(context);
        this.i = 0L;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.i = System.currentTimeMillis();
            return false;
        }
        if (actionMasked != 2 || System.currentTimeMillis() - this.i <= 1000) {
            return false;
        }
        performLongClick();
        return true;
    }

    public InterceptShadowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0L;
    }

    public InterceptShadowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0L;
    }
}
