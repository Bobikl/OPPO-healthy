package com.heytap.nearx.uikit.widget.dialogview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.GravityCompat;

/* JADX INFO: loaded from: classes18.dex */
public class NearAlertDialogMessageView extends AppCompatTextView implements ViewTreeObserver.OnGlobalLayoutListener {
    public NearAlertDialogMessageView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        setGravity(getLineCount() > 1 ? GravityCompat.START : 17);
    }

    public NearAlertDialogMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NearAlertDialogMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
