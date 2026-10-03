package com.heytap.health.core.webservice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.coui.appcompat.toolbar.COUIToolbar;

/* JADX INFO: loaded from: classes16.dex */
public class TransparentToolbar extends COUIToolbar {
    public TransparentToolbar(Context context) {
        super(context);
    }

    @Override // com.coui.appcompat.toolbar.COUIToolbar, androidx.appcompat.widget.Toolbar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public TransparentToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TransparentToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
