package com.heytap.nearx.uikit.widget.edittext;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes18.dex */
public class NearScrolledEditText extends NearEditText {
    private int mMaxHeight;

    public NearScrolledEditText(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            this.mMaxHeight = (getLineHeight() * getMaxLines()) + getPaddingTop() + getPaddingBottom();
            if (getHeight() >= this.mMaxHeight && getLineCount() > 1) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public NearScrolledEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NearScrolledEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
