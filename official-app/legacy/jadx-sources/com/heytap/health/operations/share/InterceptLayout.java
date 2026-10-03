package com.heytap.health.operations.share;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oplus.aiunit.vision.ejg;

/* JADX INFO: loaded from: classes17.dex */
public class InterceptLayout extends ConstraintLayout {
    public long i;

    public InterceptLayout(Context context) {
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

    public InterceptLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0L;
    }

    public InterceptLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0L;
        int iA = ejg.a(context, 16.0f);
        setPadding(iA, ejg.a(context, 12.0f), iA, ejg.a(context, 33.0f));
    }
}
