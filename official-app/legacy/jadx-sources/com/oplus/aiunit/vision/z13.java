package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public interface z13 {
    Drawable getCardBackground();

    View getCardView();

    boolean getPreventCornerOverlap();

    boolean getUseCompatPadding();

    void setCardBackground(Drawable drawable);

    void setShadowPadding(int i, int i2, int i3, int i4);
}
