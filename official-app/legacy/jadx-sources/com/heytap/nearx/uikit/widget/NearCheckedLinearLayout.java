package com.heytap.nearx.uikit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.Checkable;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes18.dex */
public class NearCheckedLinearLayout extends LinearLayout implements Checkable {
    public NearCheckedLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof Checkable) {
                return ((Checkable) childAt).isChecked();
            }
        }
        return false;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(z);
            }
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).toggle();
            }
        }
    }

    public NearCheckedLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearCheckedLinearLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearCheckedLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }
}
