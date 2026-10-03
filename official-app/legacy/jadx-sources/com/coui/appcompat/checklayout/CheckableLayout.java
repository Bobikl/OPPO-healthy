package com.coui.appcompat.checklayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes13.dex */
public class CheckableLayout extends RelativeLayout implements Checkable {
    public Checkable i;

    public CheckableLayout(Context context) {
        super(context);
    }

    private void setCheckbleView(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                KeyEvent.Callback childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    setCheckbleView((ViewGroup) childAt);
                } else if (childAt instanceof Checkable) {
                    this.i = (Checkable) childAt;
                    return;
                }
            }
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        Checkable checkable = this.i;
        return checkable != null && checkable.isChecked();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setCheckbleView(this);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        Checkable checkable = this.i;
        if (checkable != null) {
            checkable.setChecked(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        Checkable checkable = this.i;
        if (checkable != null) {
            checkable.toggle();
        }
    }

    public CheckableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CheckableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
