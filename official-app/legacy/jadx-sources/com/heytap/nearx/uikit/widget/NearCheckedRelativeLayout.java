package com.heytap.nearx.uikit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.Checkable;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes18.dex */
class NearCheckedRelativeLayout extends RelativeLayout implements Checkable {
    private Checkable mCheckable;

    public NearCheckedRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        Checkable checkable = this.mCheckable;
        return checkable != null && checkable.isChecked();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                KeyEvent.Callback childAt = getChildAt(i);
                if (childAt instanceof Checkable) {
                    this.mCheckable = (Checkable) childAt;
                    return;
                }
            }
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        Checkable checkable = this.mCheckable;
        if (checkable != null) {
            checkable.setChecked(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        Checkable checkable = this.mCheckable;
        if (checkable != null) {
            checkable.toggle();
        }
    }

    public NearCheckedRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NearCheckedRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
