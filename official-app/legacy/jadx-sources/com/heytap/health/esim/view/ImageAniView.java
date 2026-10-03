package com.heytap.health.esim.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes16.dex */
public class ImageAniView extends AppCompatImageView {
    public ImageAniView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getDrawable() == null || !(getDrawable() instanceof Animatable)) {
            return;
        }
        ((Animatable) getDrawable()).start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getDrawable() == null || !(getDrawable() instanceof Animatable)) {
            return;
        }
        ((Animatable) getDrawable()).stop();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public ImageAniView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImageAniView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
