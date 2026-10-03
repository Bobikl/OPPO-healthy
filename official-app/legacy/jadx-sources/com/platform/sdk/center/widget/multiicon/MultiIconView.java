package com.platform.sdk.center.widget.multiicon;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MultiIconView extends LinearLayout {
    public MultiIconView(Context context) {
        this(context, null);
    }

    public final void a(int i, List<ImageView> list) {
        removeAllViews();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ImageView imageView = list.get(i2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.setMarginEnd(i);
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            addView(imageView);
        }
        invalidate();
    }

    public MultiIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
