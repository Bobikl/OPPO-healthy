package com.heytap.health.watchface.business.legacy.creation.outfits.view.mainshutterbutton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes19.dex */
@SuppressLint({"AppCompatCustomView"})
public class TwoStateImageView extends ImageView {
    public TwoStateImageView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.4f);
        }
    }

    public TwoStateImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TwoStateImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
