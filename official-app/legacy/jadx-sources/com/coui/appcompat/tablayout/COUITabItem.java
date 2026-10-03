package com.coui.appcompat.tablayout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.support.tablayout.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public final class COUITabItem extends View {
    public final CharSequence i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable f2114j;
    public final int k;

    public COUITabItem(Context context) {
        this(context, null);
    }

    public COUITabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.COUITabItem);
        this.i = tintTypedArrayObtainStyledAttributes.getText(R$styleable.COUITabItem_android_text);
        this.f2114j = tintTypedArrayObtainStyledAttributes.getDrawable(R$styleable.COUITabItem_android_icon);
        this.k = tintTypedArrayObtainStyledAttributes.getResourceId(R$styleable.COUITabItem_android_layout, 0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }
}
